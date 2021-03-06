// _DBRelationshipAdvancedPane_EOArchive_English.java
// Generated by EnterpriseObjects palette at Thursday, September 30, 2004 10:36:17 AM US/Central

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _DBRelationshipAdvancedPane_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    com.webobjects.eointerface.swing.EOMatrix _nsMatrix0, _nsMatrix1, _nsMatrix2;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1;
    com.webobjects.eointerface.swing.EOView _nsBox0, _nsBox1, _nsBox2, _nsBox3, _nsBox4, _nsBox5, _nsBox6, _nsBox7, _nsCustomView0;
    com.webobjects.foundation.NSNumberFormatter _nsNumberFormatter0;
    javax.swing.JCheckBox _jCheckBox0, _jCheckBox1;
    javax.swing.JRadioButton _jRadioButton0, _jRadioButton1, _jRadioButton2, _jRadioButton3, _jRadioButton4, _jRadioButton5;

    public _DBRelationshipAdvancedPane_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsNumberFormatter0 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "");
        _nsBox7 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox6 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox3");
        _nsBox5 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox4 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox2");
        _nsBox3 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox2 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "propagatesPKCheck")) != null)) {
            _jCheckBox1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_jCheckBox1");
        } else {
            _jCheckBox1 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Propagate Primary Key"), "NSButtonCell1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "ownsDestinationCheck")) != null)) {
            _jCheckBox0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JCheckBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_jCheckBox0");
        } else {
            _jCheckBox0 = (javax.swing.JCheckBox)_registered(new javax.swing.JCheckBox("Owns Destination"), "NSButtonCell");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "batchSizeField.nextFocusableComponent.nextFocusableComponent.nextFocusableComponent")) != null)) {
            _nsMatrix2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOMatrix)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsMatrix2");
        } else {
            _nsMatrix2 = (com.webobjects.eointerface.swing.EOMatrix)_registered(new com.webobjects.eointerface.swing.EOMatrix(2, 1, 4, 3), "NSMatrix1");
        }

        _jRadioButton5 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("No Action"), "");
        _jRadioButton4 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("Deny"), "");
        _jRadioButton3 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("Cascade"), "");
        _jRadioButton2 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("Nullify"), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "batchSizeField.nextFocusableComponent.nextFocusableComponent")) != null)) {
            _nsMatrix1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOMatrix)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsMatrix1");
        } else {
            _nsMatrix1 = (com.webobjects.eointerface.swing.EOMatrix)_registered(new com.webobjects.eointerface.swing.EOMatrix(4, 1, 4, 2), "NSMatrix1");
        }

        _jRadioButton1 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("Mandatory"), "NSButtonCell1");
        _jRadioButton0 = (javax.swing.JRadioButton)_registered(new javax.swing.JRadioButton("Optional"), "NSButtonCell");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "batchSizeField.nextFocusableComponent")) != null)) {
            _nsMatrix0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOMatrix)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsMatrix0");
        } else {
            _nsMatrix0 = (com.webobjects.eointerface.swing.EOMatrix)_registered(new com.webobjects.eointerface.swing.EOMatrix(2, 1, 4, 2), "NSMatrix1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "view.nextFocusableComponent")) != null)) {
            _nsTextField1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextField)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextField1");
        } else {
            _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        }

        _nsBox1 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSView");
        _nsBox0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "NSBox1");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "view")) != null)) {
            _nsCustomView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOView)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsCustomView0");
        } else {
            _nsCustomView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "View");
        }

        _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField1");
    }

    protected void _awaken() {
        super._awaken();
        _jRadioButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectDeleteRule", _jRadioButton2), ""));
        _jRadioButton3.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectDeleteRule", _jRadioButton3), ""));
        _jRadioButton4.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectDeleteRule", _jRadioButton4), ""));
        _jRadioButton5.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectDeleteRule", _jRadioButton5), ""));
        _jRadioButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectOptionality", _jRadioButton0), ""));
        _jRadioButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "selectOptionality", _jRadioButton1), ""));
        _nsTextField1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "setBatchSize", _nsTextField1), ""));
        _jCheckBox1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "togglePropagatesPK", _jCheckBox1), ""));

        if (_replacedObjects.objectForKey("_jCheckBox1") == null) {
            _connect(_owner(), _jCheckBox1, "propagatesPKCheck");
        }

        if (_replacedObjects.objectForKey("_jCheckBox0") == null) {
            _connect(_owner(), _jCheckBox0, "ownsDestinationCheck");
        }

        if (_replacedObjects.objectForKey("_nsMatrix1") == null) {
            _connect(_owner(), _nsMatrix1, "deleteRuleMatrix");
        }

        if (_replacedObjects.objectForKey("_nsMatrix0") == null) {
            _connect(_owner(), _nsMatrix0, "optionalityMatrix");
        }

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _connect(_owner(), _nsTextField1, "batchSizeField");
        }

        if (_replacedObjects.objectForKey("_nsCustomView0") == null) {
            _connect(_owner(), _nsCustomView0, "view");
        }

        _jCheckBox0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "toggleOwnsDestination", _jCheckBox0), ""));
    }

    protected void _init() {
        super._init();
        _nsNumberFormatter0.setMinimum(new java.math.BigDecimal("0"));
        if (!(_nsBox7.getLayout() instanceof EOViewLayout)) { _nsBox7.setLayout(new EOViewLayout()); }
        _nsMatrix2.setSize(143, 34);
        _nsMatrix2.setLocation(55, 8);
        ((EOViewLayout)_nsBox7.getLayout()).setAutosizingMask(_nsMatrix2, EOViewLayout.MinYMargin);
        _nsBox7.add(_nsMatrix2);
        if (!(_nsBox6.getLayout() instanceof EOViewLayout)) { _nsBox6.setLayout(new EOViewLayout()); }
        _nsBox7.setSize(262, 52);
        _nsBox7.setLocation(2, 15);
        ((EOViewLayout)_nsBox6.getLayout()).setAutosizingMask(_nsBox7, EOViewLayout.MinYMargin);
        _nsBox6.add(_nsBox7);
        _nsBox6.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Options", true, "Lucida Grande", 11, Font.PLAIN));
        if (!(_nsBox5.getLayout() instanceof EOViewLayout)) { _nsBox5.setLayout(new EOViewLayout()); }
        _nsMatrix1.setSize(80, 66);
        _nsMatrix1.setLocation(55, 9);
        ((EOViewLayout)_nsBox5.getLayout()).setAutosizingMask(_nsMatrix1, EOViewLayout.MinYMargin);
        _nsBox5.add(_nsMatrix1);
        if (!(_nsBox4.getLayout() instanceof EOViewLayout)) { _nsBox4.setLayout(new EOViewLayout()); }
        _nsBox5.setSize(262, 86);
        _nsBox5.setLocation(2, 15);
        ((EOViewLayout)_nsBox4.getLayout()).setAutosizingMask(_nsBox5, EOViewLayout.MinYMargin);
        _nsBox4.add(_nsBox5);
        _nsBox4.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Delete Rule", true, "Lucida Grande", 11, Font.PLAIN));
        if (!(_nsBox3.getLayout() instanceof EOViewLayout)) { _nsBox3.setLayout(new EOViewLayout()); }
        _nsMatrix0.setSize(80, 32);
        _nsMatrix0.setLocation(55, 9);
        ((EOViewLayout)_nsBox3.getLayout()).setAutosizingMask(_nsMatrix0, EOViewLayout.MinYMargin);
        _nsBox3.add(_nsMatrix0);
        if (!(_nsBox2.getLayout() instanceof EOViewLayout)) { _nsBox2.setLayout(new EOViewLayout()); }
        _nsBox3.setSize(262, 52);
        _nsBox3.setLocation(2, 15);
        ((EOViewLayout)_nsBox2.getLayout()).setAutosizingMask(_nsBox3, EOViewLayout.MinYMargin);
        _nsBox2.add(_nsBox3);
        _nsBox2.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Optionality", true, "Lucida Grande", 11, Font.PLAIN));

        if (_replacedObjects.objectForKey("_nsCustomView0") == null) {
            _connect(_nsCustomView0, _nsTextField1, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsMatrix2") == null) {
            _connect(_nsMatrix2, _nsCustomView0, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_jCheckBox1") == null) {
            _setFontForComponent(_jCheckBox1, "Lucida Grande", 11, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_jCheckBox0") == null) {
            _setFontForComponent(_jCheckBox0, "Lucida Grande", 11, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsMatrix2") == null) {
            _jCheckBox0.setSize(142, 15);
            _jCheckBox0.setLocation(0, 0);
            _nsMatrix2.add(_jCheckBox0);
            _jCheckBox1.setSize(142, 15);
            _jCheckBox1.setLocation(0, 18);
            _nsMatrix2.add(_jCheckBox1);
            _setFontForComponent(_nsMatrix2, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsMatrix1") == null) {
            _connect(_nsMatrix1, _nsMatrix2, "nextFocusableComponent");
        }

        _setFontForComponent(_jRadioButton5, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_jRadioButton4, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_jRadioButton3, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_jRadioButton2, "Lucida Grande", 11, Font.PLAIN);

        if (_replacedObjects.objectForKey("_nsMatrix1") == null) {
            _jRadioButton2.setSize(79, 14);
            _jRadioButton2.setLocation(0, 0);
            _nsMatrix1.add(_jRadioButton2);
            _jRadioButton3.setSize(79, 14);
            _jRadioButton3.setLocation(0, 17);
            _nsMatrix1.add(_jRadioButton3);
            _jRadioButton4.setSize(79, 15);
            _jRadioButton4.setLocation(0, 34);
            _nsMatrix1.add(_jRadioButton4);
            _jRadioButton5.setSize(79, 15);
            _jRadioButton5.setLocation(0, 51);
            _nsMatrix1.add(_jRadioButton5);
            _setFontForComponent(_nsMatrix1, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsMatrix0") == null) {
            _connect(_nsMatrix0, _nsMatrix1, "nextFocusableComponent");
        }

        _setFontForComponent(_jRadioButton1, "Lucida Grande", 11, Font.PLAIN);
        _setFontForComponent(_jRadioButton0, "Lucida Grande", 11, Font.PLAIN);

        if (_replacedObjects.objectForKey("_nsMatrix0") == null) {
            _jRadioButton0.setSize(79, 14);
            _jRadioButton0.setLocation(0, 0);
            _nsMatrix0.add(_jRadioButton0);
            _jRadioButton1.setSize(79, 14);
            _jRadioButton1.setLocation(0, 17);
            _nsMatrix0.add(_jRadioButton1);
            _setFontForComponent(_nsMatrix0, "Lucida Grande", 13, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _connect(_nsTextField1, _nsMatrix0, "nextFocusableComponent");
        }

        if (_replacedObjects.objectForKey("_nsTextField1") == null) {
            _setFontForComponent(_nsTextField1, "Lucida Grande", 11, Font.PLAIN);
            _nsTextField1.setEditable(true);
            _nsTextField1.setOpaque(true);
            _nsTextField1.setText("");
            _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            _nsTextField1.setSelectable(true);
            _nsTextField1.setEnabled(true);
        }

        if (!(_nsBox1.getLayout() instanceof EOViewLayout)) { _nsBox1.setLayout(new EOViewLayout()); }
        _nsTextField0.setSize(64, 14);
        _nsTextField0.setLocation(8, 13);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField0);
        _nsTextField1.setSize(176, 19);
        _nsTextField1.setLocation(77, 10);
        ((EOViewLayout)_nsBox1.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsBox1.add(_nsTextField1);
        if (!(_nsBox0.getLayout() instanceof EOViewLayout)) { _nsBox0.setLayout(new EOViewLayout()); }
        _nsBox1.setSize(262, 41);
        _nsBox1.setLocation(2, 15);
        ((EOViewLayout)_nsBox0.getLayout()).setAutosizingMask(_nsBox1, EOViewLayout.MinYMargin);
        _nsBox0.add(_nsBox1);
        _nsBox0.setBorder(new com.webobjects.eointerface.swing._EODefaultBorder("Batch Faulting", true, "Lucida Grande", 11, Font.PLAIN));

        if (_replacedObjects.objectForKey("_nsCustomView0") == null) {
            if (!(_nsCustomView0.getLayout() instanceof EOViewLayout)) { _nsCustomView0.setLayout(new EOViewLayout()); }
            _nsBox0.setSize(266, 58);
            _nsBox0.setLocation(7, 6);
            ((EOViewLayout)_nsCustomView0.getLayout()).setAutosizingMask(_nsBox0, EOViewLayout.MinYMargin);
            _nsCustomView0.add(_nsBox0);
            _nsBox2.setSize(266, 69);
            _nsBox2.setLocation(7, 68);
            ((EOViewLayout)_nsCustomView0.getLayout()).setAutosizingMask(_nsBox2, EOViewLayout.MinYMargin);
            _nsCustomView0.add(_nsBox2);
            _nsBox4.setSize(266, 103);
            _nsBox4.setLocation(7, 141);
            ((EOViewLayout)_nsCustomView0.getLayout()).setAutosizingMask(_nsBox4, EOViewLayout.MinYMargin);
            _nsCustomView0.add(_nsBox4);
            _nsBox6.setSize(266, 69);
            _nsBox6.setLocation(7, 248);
            ((EOViewLayout)_nsCustomView0.getLayout()).setAutosizingMask(_nsBox6, EOViewLayout.MinYMargin);
            _nsCustomView0.add(_nsBox6);
        }

        _setFontForComponent(_nsTextField0, "Lucida Grande", 11, Font.PLAIN);
        _nsTextField0.setEditable(false);
        _nsTextField0.setOpaque(false);
        _nsTextField0.setText("Batch Size:");
        _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField0.setSelectable(false);
        _nsTextField0.setEnabled(true);
        _nsTextField0.setBorder(null);
    }
}
