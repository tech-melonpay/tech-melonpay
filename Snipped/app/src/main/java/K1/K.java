package k1;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f22757a;

    /* compiled from: TransitionUtils.java */
    public static class a {
        public static Bitmap a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* compiled from: TransitionUtils.java */
    public static class b implements TypeEvaluator<Matrix> {

        /* renamed from: a, reason: collision with root package name */
        public final float[] f22758a = new float[9];

        /* renamed from: b, reason: collision with root package name */
        public final float[] f22759b = new float[9];

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f22760c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f22758a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f22759b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f11 = fArr2[i];
                float f12 = fArr[i];
                fArr2[i] = com.google.android.gms.measurement.internal.a.d(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.f22760c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        f22757a = Build.VERSION.SDK_INT >= 28;
    }
}
