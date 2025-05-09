package org.bouncycastle.pqc.math.linearalgebra;

import java.io.PrintStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class PolynomialRingGF2 {
    private PolynomialRingGF2() {
    }

    public static int add(int i, int i9) {
        return i ^ i9;
    }

    public static int degree(int i) {
        int i9 = -1;
        while (i != 0) {
            i9++;
            i >>>= 1;
        }
        return i9;
    }

    public static int gcd(int i, int i9) {
        while (true) {
            int i10 = i9;
            int i11 = i;
            i = i10;
            if (i == 0) {
                return i11;
            }
            i9 = remainder(i11, i);
        }
    }

    public static int getIrreduciblePolynomial(int i) {
        PrintStream printStream;
        String str;
        if (i < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else {
            if (i <= 31) {
                if (i == 0) {
                    return 1;
                }
                int i9 = 1 << (i + 1);
                for (int i10 = (1 << i) + 1; i10 < i9; i10 += 2) {
                    if (isIrreducible(i10)) {
                        return i10;
                    }
                }
                return 0;
            }
            printStream = System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    public static boolean isIrreducible(int i) {
        if (i == 0) {
            return false;
        }
        int degree = degree(i) >>> 1;
        int i9 = 2;
        for (int i10 = 0; i10 < degree; i10++) {
            i9 = modMultiply(i9, i9, i);
            if (gcd(i9 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i, int i9, int i10) {
        int remainder = remainder(i, i10);
        int remainder2 = remainder(i9, i10);
        int i11 = 0;
        if (remainder2 != 0) {
            int degree = 1 << degree(i10);
            while (remainder != 0) {
                if (((byte) (remainder & 1)) == 1) {
                    i11 ^= remainder2;
                }
                remainder >>>= 1;
                remainder2 <<= 1;
                if (remainder2 >= degree) {
                    remainder2 ^= i10;
                }
            }
        }
        return i11;
    }

    public static long multiply(int i, int i9) {
        long j10 = 0;
        if (i9 != 0) {
            long j11 = i9 & BodyPartID.bodyIdMax;
            while (i != 0) {
                if (((byte) (i & 1)) == 1) {
                    j10 ^= j11;
                }
                i >>>= 1;
                j11 <<= 1;
            }
        }
        return j10;
    }

    public static int remainder(int i, int i9) {
        if (i9 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i) >= degree(i9)) {
            i ^= i9 << (degree(i) - degree(i9));
        }
        return i;
    }

    public static int rest(long j10, int i) {
        if (i == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j11 = i & BodyPartID.bodyIdMax;
        while ((j10 >>> 32) != 0) {
            j10 ^= j11 << (degree(j10) - degree(j11));
        }
        int i9 = (int) j10;
        while (degree(i9) >= degree(i)) {
            i9 ^= i << (degree(i9) - degree(i));
        }
        return i9;
    }

    public static int degree(long j10) {
        int i = 0;
        while (j10 != 0) {
            i++;
            j10 >>>= 1;
        }
        return i - 1;
    }
}
