package O2;

import D9.b;
import J2.i;
import P2.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C1016s;
import t2.C1279a;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes.dex */
public final class a extends C1016s {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f2954g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2955e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2956f;

    public a(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, com.luminary.mobile.R.attr.radioButtonStyle, 2132083870), attributeSet);
        Context context2 = getContext();
        TypedArray d10 = i.d(context2, attributeSet, C1279a.f27467A, com.luminary.mobile.R.attr.radioButtonStyle, 2132083870, new int[0]);
        if (d10.hasValue(0)) {
            setButtonTintList(c.b(d10, context2, 0));
        }
        this.f2956f = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2955e == null) {
            int x9 = b.x(com.luminary.mobile.R.attr.colorControlActivated, this);
            int x10 = b.x(com.luminary.mobile.R.attr.colorOnSurface, this);
            int x11 = b.x(com.luminary.mobile.R.attr.colorSurface, this);
            this.f2955e = new ColorStateList(f2954g, new int[]{b.n0(x11, 1.0f, x9), b.n0(x11, 0.54f, x10), b.n0(x11, 0.38f, x10), b.n0(x11, 0.38f, x10)});
        }
        return this.f2955e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2956f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f2956f = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
