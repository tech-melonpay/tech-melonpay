package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014p extends MultiAutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f23793d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C1002d f23794a;

    /* renamed from: b, reason: collision with root package name */
    public final C1022y f23795b;

    /* renamed from: c, reason: collision with root package name */
    public final C1010l f23796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1014p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
        W.a(context);
        U.a(this, getContext());
        Z f10 = Z.f(getContext(), attributeSet, f23793d, com.luminary.mobile.R.attr.autoCompleteTextViewStyle, 0);
        if (f10.f23728b.hasValue(0)) {
            setDropDownBackgroundDrawable(f10.b(0));
        }
        f10.g();
        C1002d c1002d = new C1002d(this);
        this.f23794a = c1002d;
        c1002d.d(attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
        C1022y c1022y = new C1022y(this);
        this.f23795b = c1022y;
        c1022y.f(attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
        c1022y.b();
        C1010l c1010l = new C1010l(this);
        this.f23796c = c1010l;
        c1010l.b(attributeSet, com.luminary.mobile.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = c1010l.a(keyListener);
            if (a10 == keyListener) {
                return;
            }
            super.setKeyListener(a10);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.f23795b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23795b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23795b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        j3.e.x(onCreateInputConnection, editorInfo, this);
        return this.f23796c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23795b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23795b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(U4.b.j(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f23796c.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f23796c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.f23794a;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1022y c1022y = this.f23795b;
        c1022y.k(colorStateList);
        c1022y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1022y c1022y = this.f23795b;
        c1022y.l(mode);
        c1022y.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1022y c1022y = this.f23795b;
        if (c1022y != null) {
            c1022y.g(context, i);
        }
    }
}
