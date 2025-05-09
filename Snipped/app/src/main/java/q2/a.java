package Q2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: RippleUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3179a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3180b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3181c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3182d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3183e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f3184f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f3180b;
        return new ColorStateList(new int[][]{f3182d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f3181c), b(colorStateList, iArr), b(colorStateList, f3179a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return n0.a.h(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3183e, 0)) != 0) {
            Log.w(f3184f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z10 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
