package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: TimePickerTextInputKeyController.java */
/* loaded from: classes.dex */
public final class k implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f10027a;

    /* renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f10028b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeModel f10029c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10030d = false;

    public k(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f10027a = chipTextInputComboView;
        this.f10028b = chipTextInputComboView2;
        this.f10029c = timeModel;
    }

    public final void a(int i) {
        this.f10028b.setChecked(i == 12);
        this.f10027a.setChecked(i == 10);
        this.f10029c.f9971f = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z10 = i == 5;
        if (z10) {
            a(12);
        }
        return z10;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f10030d) {
            return false;
        }
        boolean z10 = true;
        this.f10030d = true;
        EditText editText = (EditText) view;
        if (this.f10029c.f9971f != 12) {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    a(12);
                } else if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
            }
            z10 = false;
        } else if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z10 = false;
        }
        this.f10030d = false;
        return z10;
    }
}
