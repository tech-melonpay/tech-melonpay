package P0;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3040a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3041b;

    public b(float[] fArr) {
        this.f3040a = fArr;
        this.f3041b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3040a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f3041b;
        float f12 = (f10 - (min * f11)) / f11;
        float f13 = fArr[min];
        return com.google.android.gms.measurement.internal.a.d(fArr[min + 1], f13, f12, f13);
    }
}
