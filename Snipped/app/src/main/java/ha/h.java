package ha;

/* compiled from: _Ranges.kt */
/* loaded from: classes2.dex */
public class h extends U4.b {
    public static float O(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static long P(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static float Q(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static float R(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int S(int i, int i9, int i10) {
        if (i9 <= i10) {
            return i < i9 ? i9 : i > i10 ? i10 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + '.');
    }

    public static long T(long j10) {
        if (j10 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j10 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j10;
    }

    public static C0804c U(C0806e c0806e, int i) {
        boolean z10 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z10) {
            if (c0806e.f21228c <= 0) {
                i = -i;
            }
            return new C0804c(c0806e.f21226a, c0806e.f21227b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static C0806e V(int i, int i9) {
        if (i9 > Integer.MIN_VALUE) {
            return new C0806e(i, i9 - 1, 1);
        }
        C0806e c0806e = C0806e.f21233d;
        return C0806e.f21233d;
    }
}
