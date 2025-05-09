package n0;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f24064a = new ThreadLocal<>();

    public static void a(int i, int i9, int i10, float[] fArr) {
        float f10;
        float abs;
        float f11 = i / 255.0f;
        float f12 = i9 / 255.0f;
        float f13 = i10 / 255.0f;
        float max = Math.max(f11, Math.max(f12, f13));
        float min = Math.min(f11, Math.min(f12, f13));
        float f14 = max - min;
        float f15 = (max + min) / 2.0f;
        if (max == min) {
            f10 = 0.0f;
            abs = 0.0f;
        } else {
            f10 = max == f11 ? ((f12 - f13) / f14) % 6.0f : max == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            abs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = f16 < 0.0f ? 0.0f : Math.min(f16, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f15 >= 0.0f ? Math.min(f15, 1.0f) : 0.0f;
    }

    public static int b(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static double c(int i, int i9) {
        if (Color.alpha(i9) != 255) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.g(i9, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i) < 255) {
            i = f(i, i9);
        }
        double d10 = d(i) + 0.05d;
        double d11 = d(i9) + 0.05d;
        return Math.max(d10, d11) / Math.min(d10, d11);
    }

    public static double d(int i) {
        ThreadLocal<double[]> threadLocal = f24064a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = red / 255.0d;
        double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = green / 255.0d;
        double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = blue / 255.0d;
        double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d13 / 100.0d;
    }

    public static int e(int i, float f10, int i9) {
        int i10 = 255;
        if (Color.alpha(i9) != 255) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.g(i9, new StringBuilder("background can not be translucent: #")));
        }
        double d10 = f10;
        if (c(h(i, 255), i9) < d10) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 <= 10 && i10 - i11 > 1; i12++) {
            int i13 = (i11 + i10) / 2;
            if (c(h(i, i13), i9) < d10) {
                i11 = i13;
            } else {
                i10 = i13;
            }
        }
        return i10;
    }

    public static int f(int i, int i9) {
        int alpha = Color.alpha(i9);
        int alpha2 = Color.alpha(i);
        int i10 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i10, g(Color.red(i), alpha2, Color.red(i9), alpha, i10), g(Color.green(i), alpha2, Color.green(i9), alpha, i10), g(Color.blue(i), alpha2, Color.blue(i9), alpha, i10));
    }

    public static int g(int i, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((255 - i9) * (i10 * i11)) + ((i * 255) * i9)) / (i12 * 255);
    }

    public static int h(int i, int i9) {
        if (i9 < 0 || i9 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i9 << 24);
    }
}
