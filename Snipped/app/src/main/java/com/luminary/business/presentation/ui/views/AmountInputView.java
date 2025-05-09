package com.luminary.business.presentation.ui.views;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;

/* compiled from: AmountInputView.kt */
/* loaded from: classes2.dex */
public final class AmountInputView extends CustomTextInputEditText {
    public AmountInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i9) {
        Editable text = getText();
        if (text == null || text.length() == 0 || text.length() <= 4) {
            super.onSelectionChanged(i, i9);
        } else {
            setSelection(text.length() - 4, text.length() - 4);
        }
    }
}
