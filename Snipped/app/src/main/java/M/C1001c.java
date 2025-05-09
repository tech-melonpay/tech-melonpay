package m;

import B0.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: AppCompatAutoCompleteTextView.java */
/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1001c extends AutoCompleteTextView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final C1010l mAppCompatEmojiEditTextHelper;
    private final C1002d mBackgroundTintHelper;
    private final C1022y mTextHelper;

    public C1001c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof d.c ? ((d.c) customSelectionActionModeCallback).f215a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public void initEmojiKeyListener(C1010l c1010l) {
        KeyListener keyListener = getKeyListener();
        c1010l.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = c1010l.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        j3.e.x(onCreateInputConnection, editorInfo, this);
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(B0.d.f(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(U4.b.j(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.mAppCompatEmojiEditTextHelper.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.mBackgroundTintHelper;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1022y c1022y = this.mTextHelper;
        if (c1022y != null) {
            c1022y.g(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        U.a(this, getContext());
        Z f10 = Z.f(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (f10.f23728b.hasValue(0)) {
            setDropDownBackgroundDrawable(f10.b(0));
        }
        f10.g();
        C1002d c1002d = new C1002d(this);
        this.mBackgroundTintHelper = c1002d;
        c1002d.d(attributeSet, i);
        C1022y c1022y = new C1022y(this);
        this.mTextHelper = c1022y;
        c1022y.f(attributeSet, i);
        c1022y.b();
        C1010l c1010l = new C1010l(this);
        this.mAppCompatEmojiEditTextHelper = c1010l;
        c1010l.b(attributeSet, i);
        initEmojiKeyListener(c1010l);
    }
}
