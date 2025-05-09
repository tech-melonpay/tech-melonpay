package u2;

import android.animation.TypeEvaluator;

/* compiled from: ArgbEvaluatorCompat.java */
/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514c implements TypeEvaluator<Integer> {
    public static Integer a(float f10, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f12 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float d10 = com.google.android.gms.measurement.internal.a.d(f12, f11, f10, f11);
        float d11 = com.google.android.gms.measurement.internal.a.d(pow4, pow, f10, pow);
        float d12 = com.google.android.gms.measurement.internal.a.d(pow5, pow2, f10, pow2);
        float d13 = com.google.android.gms.measurement.internal.a.d(pow6, pow3, f10, pow3);
        float pow7 = ((float) Math.pow(d11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(d12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(d13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(d10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f10, Integer num, Integer num2) {
        return a(f10, num, num2);
    }
}
