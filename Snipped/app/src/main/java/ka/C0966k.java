package ka;

import C.v;
import java.math.BigDecimal;

/* compiled from: StringNumberConversions.kt */
/* renamed from: ka.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0966k extends C0965j {
    public static final void P(String str) {
        throw new NumberFormatException(v.o("Invalid number format: '", str, '\''));
    }

    public static BigDecimal Q(String str) {
        try {
            if (C0962g.f23079a.b(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double R(String str) {
        try {
            if (C0962g.f23079a.b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer S(String str) {
        boolean z10;
        int i;
        int i9;
        j3.e.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        int i11 = -2147483647;
        if (kotlin.jvm.internal.f.c(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i11 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i = 0;
        }
        int i12 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i10 < i12 && (i12 != -59652323 || i10 < (i12 = i11 / 10))) || (i9 = i10 * 10) < i11 + digit) {
                return null;
            }
            i10 = i9 - digit;
            i++;
        }
        return z10 ? Integer.valueOf(i10) : Integer.valueOf(-i10);
    }

    public static Long T(String str) {
        boolean z10;
        j3.e.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (kotlin.jvm.internal.f.c(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 != j11) {
                    return null;
                }
                j13 = j10 / 10;
                if (j12 < j13) {
                    return null;
                }
            }
            long j14 = j12 * 10;
            long j15 = digit;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
