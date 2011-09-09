/*%*%*%*%*
Copyright (C) 1995-2004 Alex J. Raftis

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

Or, contact the author,

Alex J. Raftis
709 Bay Area Blvd.
League City, TX 77573
mailto:alex@raftis.net
http://www.raftis.net/~alex/
 *%*%*%*%*/

#import "SQLiteContext.h"

#import "SQLiteChannel.h"

@implementation SQLiteContext

- (void)dealloc
{
	if ([adaptorChannels count]) {
		// Release the first channel. See createAdaptorChannel for reasons.
		[[adaptorChannels objectAtIndex:0] release];
	}
	
	[super dealloc];
}

- (EOAdaptorChannel *)createAdaptorChannel
{
   SQLiteChannel			*channel;
	
	if ([adaptorChannels count]) {
		int			x;
		int numAdaptorChannels;

		numAdaptorChannels = [adaptorChannels count];
		for (x = 0; x < numAdaptorChannels; x++) {
			channel = [adaptorChannels objectAtIndex:x];
			if (![channel isFetchInProgress]) return channel;
		}
		
		[NSException raise:EODatabaseException format:@"SQLite only supports one connection per context to the database."];
	}
	
	channel = [[SQLiteChannel allocWithZone:[self zone]] initWithAdaptorContext:self];
	[adaptorChannels addObject:channel];
	if ([adaptorChannels count] == 1) {
		// Put an extra retain on the very first channel created. This will keep it around for as long as we're around. All others will not be retained by the above array and subsequently will be released if they're no longer in use.
		[channel retain];
	}
	
	return [channel autorelease];
}

- (BOOL)canNextTransactions
{
   return NO;
}

- (void)beginTransaction
{
	if ([delegate respondsToSelector:@selector(adaptorContextShouldBegin:)]) {
		if (![delegate adaptorContextShouldBegin:self]) return;
	}
	
   [super beginTransaction];
	
	[(SQLiteChannel *)[self transactionChannel] executeSQL:@"BEGIN TRANSACTION"];
	[self transactionDidBegin];
}

- (void)commitTransaction
{
	if ([delegate respondsToSelector:@selector(adaptorContextShouldCommit:)]) {
		if (![delegate adaptorContextShouldCommit:self]) return;
	}
	
   [super commitTransaction];
   
   if ([self hasOpenTransaction]) {
      [(SQLiteChannel *)[self transactionChannel] executeSQL:@"COMMIT TRANSACTION"];
		[self transactionDidCommit];
   }
}

- (void)rollbackTransaction
{
	if ([delegate respondsToSelector:@selector(adaptorContextShouldRollback:)]) {
		if (![delegate adaptorContextShouldRollback:self]) return;
	}
	
   [super rollbackTransaction];
   
   if ([self hasOpenTransaction]) {
		[(SQLiteChannel *)[self transactionChannel] executeSQL:@"ROLLBACK TRANSACTION"];
		[self transactionDidRollback];
   }
}

@end
