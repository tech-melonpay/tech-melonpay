package u2;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils.java */
/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f30141a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final P0.a f30142b = new P0.a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final P0.a f30143c = new P0.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final P0.a f30144d = new P0.a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f30145e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return com.google.android.gms.measurement.internal.a.d(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i, float f10, int i9) {
        return Math.round(f10 * (i9 - i)) + i;
    }
}
