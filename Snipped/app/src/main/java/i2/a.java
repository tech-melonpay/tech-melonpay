package I2;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class a implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1726a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1727b;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f1726a) {
            case 0:
                float floatValue = ((FloatEvaluator) this.f1727b).evaluate(f10, (Number) obj, (Number) obj2).floatValue();
                if (floatValue < 0.1f) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            case 1:
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                float[] fArr3 = (float[]) this.f1727b;
                if (fArr3 == null) {
                    fArr3 = new float[fArr.length];
                }
                for (int i = 0; i < fArr3.length; i++) {
                    float f11 = fArr[i];
                    fArr3[i] = com.google.android.gms.measurement.internal.a.d(fArr2[i], f11, f10, f11);
                }
                return fArr3;
            default:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i9 = rect.left + ((int) ((rect2.left - r0) * f10));
                int i10 = rect.top + ((int) ((rect2.top - r1) * f10));
                int i11 = rect.right + ((int) ((rect2.right - r2) * f10));
                int i12 = rect.bottom + ((int) ((rect2.bottom - r6) * f10));
                Rect rect3 = (Rect) this.f1727b;
                if (rect3 == null) {
                    return new Rect(i9, i10, i11, i12);
                }
                rect3.set(i9, i10, i11, i12);
                return rect3;
        }
    }
}
