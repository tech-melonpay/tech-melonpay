package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993C extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C1002d f23606a;

    /* renamed from: b, reason: collision with root package name */
    public final C1022y f23607b;

    /* renamed from: c, reason: collision with root package name */
    public C1011m f23608c;

    public C0993C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        U.a(this, getContext());
        C1002d c1002d = new C1002d(this);
        this.f23606a = c1002d;
        c1002d.d(attributeSet, R.attr.buttonStyleToggle);
        C1022y c1022y = new C1022y(this);
        this.f23607b = c1022y;
        c1022y.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1011m getEmojiTextViewHelper() {
        if (this.f23608c == null) {
            this.f23608c = new C1011m(this);
        }
        return this.f23608c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.f23607b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23607b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23607b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23607b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23607b;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f23789b.f2228a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.f23606a;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1022y c1022y = this.f23607b;
        c1022y.k(colorStateList);
        c1022y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1022y c1022y = this.f23607b;
        c1022y.l(mode);
        c1022y.b();
    }
}
