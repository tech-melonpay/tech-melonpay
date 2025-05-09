package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.luminary.mobile.R;

/* compiled from: AppCompatCheckBox.java */
/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1004f extends CheckBox implements B0.f {

    /* renamed from: a, reason: collision with root package name */
    public final C1007i f23756a;

    /* renamed from: b, reason: collision with root package name */
    public final C1002d f23757b;

    /* renamed from: c, reason: collision with root package name */
    public final C1022y f23758c;

    /* renamed from: d, reason: collision with root package name */
    public C1011m f23759d;

    public C1004f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private C1011m getEmojiTextViewHelper() {
        if (this.f23759d == null) {
            this.f23759d = new C1011m(this);
        }
        return this.f23759d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            c1002d.a();
        }
        C1022y c1022y = this.f23758c;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            return c1002d.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            return c1002d.c();
        }
        return null;
    }

    @Override // B0.f
    public ColorStateList getSupportButtonTintList() {
        C1007i c1007i = this.f23756a;
        if (c1007i != null) {
            return c1007i.f23771b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1007i c1007i = this.f23756a;
        if (c1007i != null) {
            return c1007i.f23772c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23758c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23758c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            c1002d.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            c1002d.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1007i c1007i = this.f23756a;
        if (c1007i != null) {
            if (c1007i.f23775f) {
                c1007i.f23775f = false;
            } else {
                c1007i.f23775f = true;
                c1007i.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23758c;
        if (c1022y != null) {
            c1022y.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1022y c1022y = this.f23758c;
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
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            c1002d.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1002d c1002d = this.f23757b;
        if (c1002d != null) {
            c1002d.i(mode);
        }
    }

    @Override // B0.f
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1007i c1007i = this.f23756a;
        if (c1007i != null) {
            c1007i.f23771b = colorStateList;
            c1007i.f23773d = true;
            c1007i.a();
        }
    }

    @Override // B0.f
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1007i c1007i = this.f23756a;
        if (c1007i != null) {
            c1007i.f23772c = mode;
            c1007i.f23774e = true;
            c1007i.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1022y c1022y = this.f23758c;
        c1022y.k(colorStateList);
        c1022y.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1022y c1022y = this.f23758c;
        c1022y.l(mode);
        c1022y.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        W.a(context);
        U.a(this, getContext());
        C1007i c1007i = new C1007i(this);
        this.f23756a = c1007i;
        c1007i.b(attributeSet, i);
        C1002d c1002d = new C1002d(this);
        this.f23757b = c1002d;
        c1002d.d(attributeSet, i);
        C1022y c1022y = new C1022y(this);
        this.f23758c = c1022y;
        c1022y.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(U4.b.j(getContext(), i));
    }
}
