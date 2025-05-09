package com.luminary.business.presentation.ui.views.customtextinput;

import F8.o;
import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import s6.a0;
import w8.InterfaceC1576a;

/* compiled from: CustomTextInputLayout.kt */
/* loaded from: classes2.dex */
public class CustomTextInputLayout extends TextInputLayout implements InterfaceC1576a {

    /* renamed from: a, reason: collision with root package name */
    public int f13191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13193c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13194d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0646l<? super Boolean, p> f13195e;

    public CustomTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f26779d);
        this.f13191a = obtainStyledAttributes.getResourceId(2, R.drawable.sl_text_input_bg);
        this.f13192b = obtainStyledAttributes.getResourceId(1, R.drawable.bg_text_input_error);
        this.f13193c = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.middle_gray));
        EditText editText = getEditText();
        if (editText != null) {
            editText.setBackgroundResource(this.f13191a);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // w8.InterfaceC1576a
    public final void a(int i) {
        this.f13194d = true;
        setErrorEnabled(true);
        setError(getContext().getString(R.string.maximum_symbols_allowed, String.valueOf(i)));
        InterfaceC0646l<? super Boolean, p> interfaceC0646l = this.f13195e;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Boolean.valueOf(isErrorEnabled()));
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        EditText editText = view instanceof EditText ? (EditText) view : null;
        if (editText != null) {
            editText.setBackgroundResource(this.f13191a);
            EditText editText2 = getEditText();
            if (editText2 != null) {
                editText2.setTextColor(this.f13193c);
            }
            editText.addTextChangedListener(new a());
        }
    }

    @Override // w8.InterfaceC1576a
    public final void b() {
        if (this.f13194d) {
            setError(null);
            setErrorEnabled(false);
            this.f13194d = false;
            InterfaceC0646l<? super Boolean, p> interfaceC0646l = this.f13195e;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Boolean.valueOf(isErrorEnabled()));
            }
        }
    }

    public final void e() {
        EditText editText = getEditText();
        if (editText != null) {
            EditText editText2 = getEditText();
            editText.setText("       " + ((Object) (editText2 != null ? editText2.getText() : null)));
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            EditText editText = getEditText();
            if (editText != null) {
                editText.setBackgroundResource(this.f13192b);
                return;
            }
            return;
        }
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setBackgroundResource(this.f13191a);
        }
    }

    public final InterfaceC0646l<Boolean, p> getOnErrorStageChange() {
        return this.f13195e;
    }

    public final void setBack(int i) {
        this.f13191a = i;
        EditText editText = getEditText();
        if (editText != null) {
            editText.setBackgroundResource(this.f13191a);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence charSequence) {
        int i;
        super.setError(charSequence);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setPadding(0, 0, 0, 0);
        }
        EditText editText = getEditText();
        if (editText != null) {
            if (charSequence == null || charSequence.length() == 0) {
                setErrorEnabled(false);
                i = this.f13191a;
            } else {
                requestFocus();
                o.e(this);
                setErrorEnabled(true);
                i = this.f13192b;
            }
            editText.setBackgroundResource(i);
        }
        InterfaceC0646l<? super Boolean, p> interfaceC0646l = this.f13195e;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Boolean.valueOf(isErrorEnabled()));
        }
    }

    public final void setErrorWithoutFocus(CharSequence charSequence) {
        int i;
        super.setError(charSequence);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setPadding(0, 0, 0, 0);
        }
        EditText editText = getEditText();
        if (editText != null) {
            if (charSequence.length() == 0) {
                setErrorEnabled(false);
                i = this.f13191a;
            } else {
                o.e(this);
                setErrorEnabled(true);
                i = this.f13192b;
            }
            editText.setBackgroundResource(i);
        }
        InterfaceC0646l<? super Boolean, p> interfaceC0646l = this.f13195e;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Boolean.valueOf(isErrorEnabled()));
        }
    }

    public final void setErrorWithoutFocusWithPaddings(CharSequence charSequence) {
        int i;
        super.setError(charSequence);
        EditText editText = getEditText();
        if (editText != null) {
            if (charSequence.length() == 0) {
                setErrorEnabled(false);
                i = this.f13191a;
            } else {
                setErrorEnabled(true);
                i = this.f13192b;
            }
            editText.setBackgroundResource(i);
        }
        InterfaceC0646l<? super Boolean, p> interfaceC0646l = this.f13195e;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Boolean.valueOf(isErrorEnabled()));
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setHelperText(CharSequence charSequence) {
        f(false);
        super.setHelperText(charSequence);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setPadding(0, 0, 0, 0);
        }
    }

    public final void setOnErrorStageChange(InterfaceC0646l<? super Boolean, p> interfaceC0646l) {
        this.f13195e = interfaceC0646l;
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            EditText editText;
            CustomTextInputLayout customTextInputLayout = CustomTextInputLayout.this;
            if (!customTextInputLayout.isCounterEnabled() || (editText = customTextInputLayout.getEditText()) == null) {
                return;
            }
            editText.setBackgroundResource((editable == null || editable.length() <= customTextInputLayout.getCounterMaxLength()) ? customTextInputLayout.f13191a : customTextInputLayout.f13192b);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
