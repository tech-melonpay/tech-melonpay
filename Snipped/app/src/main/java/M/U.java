package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.C0756a;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f23715a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f23716b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f23717c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f23718d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f23719e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f23720f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f23721g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0756a.f20737j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d10 = d(context, i);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f23716b, d10.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f23715a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return n0.a.h(c(context, i), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i) {
        int[] iArr = f23721g;
        iArr[0] = i;
        Z e10 = Z.e(context, null, iArr);
        try {
            return e10.f23728b.getColor(0, 0);
        } finally {
            e10.g();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = f23721g;
        iArr[0] = i;
        Z e10 = Z.e(context, null, iArr);
        try {
            return e10.a(0);
        } finally {
            e10.g();
        }
    }
}
