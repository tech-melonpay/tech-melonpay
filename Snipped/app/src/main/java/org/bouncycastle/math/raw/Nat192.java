package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public abstract class Nat192 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25311M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i9, int i10) {
        long j10 = (iArr[i] & 4294967295L) + (iArr2[i9] & 4294967295L) + (i10 & 4294967295L);
        iArr2[i9] = (int) j10;
        long j11 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j10 >>> 32);
        iArr2[i9 + 1] = (int) j11;
        long j12 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j11 >>> 32);
        iArr2[i9 + 2] = (int) j12;
        long j13 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j12 >>> 32);
        iArr2[i9 + 3] = (int) j13;
        long j14 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j13 >>> 32);
        iArr2[i9 + 4] = (int) j14;
        long j15 = (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[r12]) + (j14 >>> 32);
        iArr2[i9 + 5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = (iArr[i] & 4294967295L) + (iArr2[i9] & 4294967295L);
        int i10 = (int) j10;
        iArr[i] = i10;
        iArr2[i9] = i10;
        long j11 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j10 >>> 32);
        int i11 = (int) j11;
        iArr[i + 1] = i11;
        iArr2[i9 + 1] = i11;
        long j12 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        int i12 = (int) j12;
        iArr[i + 2] = i12;
        iArr2[i9 + 2] = i12;
        long j13 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        int i13 = (int) j13;
        iArr[i + 3] = i13;
        iArr2[i9 + 3] = i13;
        long j14 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        int i14 = (int) j14;
        iArr[i + 4] = i14;
        iArr2[i9 + 4] = i14;
        long j15 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j14 >>> 32);
        int i15 = (int) j15;
        iArr[i + 5] = i15;
        iArr2[i9 + 5] = i15;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i9) {
        iArr2[i9] = iArr[i];
        iArr2[i9 + 1] = iArr[i + 1];
        iArr2[i9 + 2] = iArr[i + 2];
        iArr2[i9 + 3] = iArr[i + 3];
        iArr2[i9 + 4] = iArr[i + 4];
        iArr2[i9 + 5] = iArr[i + 5];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i];
        jArr2[i9 + 1] = jArr[i + 1];
        jArr2[i9 + 2] = jArr[i + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        boolean gte = gte(iArr, i, iArr2, i9);
        if (gte) {
            sub(iArr, i, iArr2, i9, iArr3, i10);
        } else {
            sub(iArr2, i9, iArr, i, iArr3, i10);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 6; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i = 0; i < 3; i++) {
            create64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        int i9;
        if (i == 0) {
            i9 = iArr[0];
        } else {
            int i10 = i >> 5;
            if (i10 < 0 || i10 >= 6) {
                return 0;
            }
            i9 = iArr[i10] >>> (i & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i9) {
        for (int i10 = 5; i10 >= 0; i10--) {
            int i11 = iArr[i + i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i9 + i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = iArr2[i9] & 4294967295L;
        long j11 = iArr2[i9 + 1] & 4294967295L;
        long j12 = iArr2[i9 + 2] & 4294967295L;
        long j13 = iArr2[i9 + 3] & 4294967295L;
        long j14 = iArr2[i9 + 4] & 4294967295L;
        long j15 = iArr2[i9 + 5] & 4294967295L;
        long j16 = iArr[i] & 4294967295L;
        long j17 = j16 * j10;
        iArr3[i10] = (int) j17;
        long j18 = (j16 * j11) + (j17 >>> 32);
        iArr3[i10 + 1] = (int) j18;
        long j19 = (j16 * j12) + (j18 >>> 32);
        iArr3[i10 + 2] = (int) j19;
        long j20 = (j16 * j13) + (j19 >>> 32);
        iArr3[i10 + 3] = (int) j20;
        long j21 = (j16 * j14) + (j20 >>> 32);
        iArr3[i10 + 4] = (int) j21;
        long j22 = (j16 * j15) + (j21 >>> 32);
        iArr3[i10 + 5] = (int) j22;
        iArr3[i10 + 6] = (int) (j22 >>> 32);
        int i11 = 1;
        int i12 = i10;
        while (i11 < 6) {
            int i13 = i12 + 1;
            long j23 = iArr[i + i11] & 4294967295L;
            long j24 = j15;
            long j25 = (j23 * j10) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j25;
            int i14 = i11;
            long j26 = (j23 * j11) + (iArr3[r24] & 4294967295L) + (j25 >>> 32);
            iArr3[i12 + 2] = (int) j26;
            long j27 = j12;
            long j28 = (j23 * j12) + (iArr3[r16] & 4294967295L) + (j26 >>> 32);
            iArr3[i12 + 3] = (int) j28;
            long j29 = j28 >>> 32;
            int i15 = i12;
            long j30 = (j23 * j13) + (iArr3[r12] & 4294967295L) + j29;
            iArr3[i12 + 4] = (int) j30;
            long j31 = (j23 * j14) + (iArr3[r3] & 4294967295L) + (j30 >>> 32);
            iArr3[i15 + 5] = (int) j31;
            long j32 = (j23 * j24) + (iArr3[r3] & 4294967295L) + (j31 >>> 32);
            iArr3[i15 + 6] = (int) j32;
            iArr3[i15 + 7] = (int) (j32 >>> 32);
            i11 = i14 + 1;
            i12 = i13;
            j15 = j24;
            j12 = j27;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j10 = i & 4294967295L;
        long j11 = iArr[i9] & 4294967295L;
        long j12 = (j10 * j11) + (iArr2[i10] & 4294967295L);
        iArr3[i11] = (int) j12;
        long j13 = iArr[i9 + 1] & 4294967295L;
        long j14 = (j10 * j13) + j11 + (iArr2[i10 + 1] & 4294967295L) + (j12 >>> 32);
        iArr3[i11 + 1] = (int) j14;
        long j15 = iArr[i9 + 2] & 4294967295L;
        long j16 = (j10 * j15) + j13 + (iArr2[i10 + 2] & 4294967295L) + (j14 >>> 32);
        iArr3[i11 + 2] = (int) j16;
        long j17 = iArr[i9 + 3] & 4294967295L;
        long j18 = (j10 * j17) + j15 + (iArr2[i10 + 3] & 4294967295L) + (j16 >>> 32);
        iArr3[i11 + 3] = (int) j18;
        long j19 = iArr[i9 + 4] & 4294967295L;
        long j20 = (j10 * j19) + j17 + (iArr2[i10 + 4] & 4294967295L) + (j18 >>> 32);
        iArr3[i11 + 4] = (int) j20;
        long j21 = iArr[i9 + 5] & 4294967295L;
        long j22 = (j10 * j21) + j19 + (4294967295L & iArr2[i10 + 5]) + (j20 >>> 32);
        iArr3[i11 + 5] = (int) j22;
        return (j22 >>> 32) + j21;
    }

    public static int mul33DWordAdd(int i, long j10, int[] iArr, int i9) {
        long j11 = i & 4294967295L;
        long j12 = j10 & 4294967295L;
        long j13 = (j11 * j12) + (iArr[i9] & 4294967295L);
        iArr[i9] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        long j16 = j15 + (iArr[r4] & 4294967295L) + (j13 >>> 32);
        iArr[i9 + 1] = (int) j16;
        long j17 = j14 + (iArr[r4] & 4294967295L) + (j16 >>> 32);
        iArr[i9 + 2] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i9 + 3] = (int) j18;
        if ((j18 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i9, 4);
    }

    public static int mul33WordAdd(int i, int i9, int[] iArr, int i10) {
        long j10 = i & 4294967295L;
        long j11 = i9 & 4294967295L;
        long j12 = (j10 * j11) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j12;
        long j13 = j11 + (iArr[r5] & 4294967295L) + (j12 >>> 32);
        iArr[i10 + 1] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i10 + 2] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i10, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = iArr2[i9] & 4294967295L;
        long j11 = iArr2[i9 + 1] & 4294967295L;
        long j12 = iArr2[i9 + 2] & 4294967295L;
        long j13 = iArr2[i9 + 3] & 4294967295L;
        long j14 = iArr2[i9 + 4] & 4294967295L;
        long j15 = iArr2[i9 + 5] & 4294967295L;
        long j16 = 0;
        int i11 = 0;
        int i12 = i10;
        while (i11 < 6) {
            long j17 = iArr[i + i11] & 4294967295L;
            long j18 = j10;
            long j19 = (j17 * j10) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j19;
            int i13 = i12 + 1;
            long j20 = (j17 * j11) + (iArr3[i13] & 4294967295L) + (j19 >>> 32);
            iArr3[i13] = (int) j20;
            long j21 = (j17 * j12) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i12 + 2] = (int) j21;
            long j22 = (j17 * j13) + (iArr3[r5] & 4294967295L) + (j21 >>> 32);
            iArr3[i12 + 3] = (int) j22;
            long j23 = (j17 * j14) + (iArr3[r5] & 4294967295L) + (j22 >>> 32);
            iArr3[i12 + 4] = (int) j23;
            long j24 = (j17 * j15) + (iArr3[r5] & 4294967295L) + (j23 >>> 32);
            iArr3[i12 + 5] = (int) j24;
            long j25 = (j24 >>> 32) + (iArr3[r14] & 4294967295L) + j16;
            iArr3[i12 + 6] = (int) j25;
            j16 = j25 >>> 32;
            i11++;
            j10 = j18;
            i12 = i13;
            j11 = j11;
        }
        return (int) j16;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i9) {
        long j10 = i & 4294967295L;
        long j11 = 0;
        int i10 = 0;
        do {
            long j12 = ((iArr[i10] & 4294967295L) * j10) + j11;
            iArr2[i9 + i10] = (int) j12;
            j11 = j12 >>> 32;
            i10++;
        } while (i10 < 6);
        return (int) j11;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        long j10 = i & 4294967295L;
        long j11 = ((iArr[i9] & 4294967295L) * j10) + (iArr2[i10] & 4294967295L);
        iArr2[i10] = (int) j11;
        long j12 = ((iArr[i9 + 1] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        iArr2[i10 + 1] = (int) j12;
        long j13 = ((iArr[i9 + 2] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        iArr2[i10 + 2] = (int) j13;
        long j14 = ((iArr[i9 + 3] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        iArr2[i10 + 3] = (int) j14;
        long j15 = ((iArr[i9 + 4] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j14 >>> 32);
        iArr2[i10 + 4] = (int) j15;
        long j16 = (j10 * (iArr[i9 + 5] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j15 >>> 32);
        iArr2[i10 + 5] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j10, int[] iArr, int i9) {
        long j11 = i & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (iArr[i9] & 4294967295L);
        iArr[i9] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        long j14 = j13 + (iArr[r9] & 4294967295L) + (j12 >>> 32);
        iArr[i9 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = j15 + (iArr[r0] & 4294967295L);
        iArr[i9 + 2] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i9, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = iArr[i] & 4294967295L;
        int i10 = 0;
        int i11 = 12;
        int i12 = 5;
        while (true) {
            int i13 = i12 - 1;
            long j11 = iArr[i + i12] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[(i11 - 1) + i9] = (i10 << 31) | ((int) (j12 >>> 33));
            i11 -= 2;
            iArr2[i9 + i11] = (int) (j12 >>> 1);
            i10 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i10 << 31) & 4294967295L);
                iArr2[i9] = (int) j13;
                int i14 = ((int) (j13 >>> 32)) & 1;
                long j15 = iArr[i + 1] & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i15 = (int) j16;
                iArr2[i9 + 1] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long j17 = (iArr2[r12] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[i + 2] & 4294967295L;
                long j19 = j17 + (j18 * j10);
                int i17 = (int) j19;
                iArr2[i9 + 2] = (i17 << 1) | i16;
                long a10 = a.a(j18, j15, j19 >>> 32, iArr2[r20] & 4294967295L);
                long j20 = (iArr2[r7] & 4294967295L) + (a10 >>> 32);
                long j21 = iArr[i + 3] & 4294967295L;
                long j22 = (iArr2[r35] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[r8] & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j10) + (a10 & 4294967295L);
                int i18 = (int) j26;
                iArr2[i9 + 3] = (i18 << 1) | (i17 >>> 31);
                long a11 = a.a(j21, j15, j26 >>> 32, j23);
                long a12 = a.a(j21, j18, a11 >>> 32, j25);
                long j27 = j24 + (a12 >>> 32);
                long j28 = a12 & 4294967295L;
                long j29 = iArr[i + 4] & 4294967295L;
                long j30 = (iArr2[r38] & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (iArr2[r5] & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j29 * j10) + (a11 & 4294967295L);
                int i19 = (int) j34;
                iArr2[i9 + 4] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                long a13 = a.a(j29, j15, j34 >>> 32, j28);
                long a14 = a.a(j29, j18, a13 >>> 32, j31);
                long a15 = a.a(j29, j21, a14 >>> 32, j33);
                long j35 = a14 & 4294967295L;
                long j36 = j32 + (a15 >>> 32);
                long j37 = iArr[i + 5] & 4294967295L;
                long j38 = (iArr2[r9] & 4294967295L) + (j36 >>> 32);
                long j39 = j36 & 4294967295L;
                long j40 = (j10 * j37) + (a13 & 4294967295L);
                int i21 = (int) j40;
                iArr2[i9 + 5] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long a16 = a.a(j37, j15, j40 >>> 32, j35);
                long a17 = a.a(j37, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j37, j21, a17 >>> 32, j39);
                long a19 = a.a(j37, j29, a18 >>> 32, 4294967295L & j38);
                long j41 = (iArr2[r5] & 4294967295L) + (j38 >>> 32) + (a19 >>> 32);
                int i23 = (int) a16;
                iArr2[i9 + 6] = (i23 << 1) | i22;
                int i24 = (int) a17;
                iArr2[i9 + 7] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) a18;
                iArr2[i9 + 8] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) a19;
                iArr2[i9 + 9] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j41;
                iArr2[i9 + 10] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = i9 + 11;
                iArr2[i32] = i31 | ((iArr2[i32] + ((int) (j41 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = (iArr[i] & 4294967295L) - (iArr2[i9] & 4294967295L);
        iArr3[i10] = (int) j10;
        long j11 = ((iArr[i + 1] & 4294967295L) - (iArr2[i9 + 1] & 4294967295L)) + (j10 >> 32);
        iArr3[i10 + 1] = (int) j11;
        long j12 = ((iArr[i + 2] & 4294967295L) - (iArr2[i9 + 2] & 4294967295L)) + (j11 >> 32);
        iArr3[i10 + 2] = (int) j12;
        long j13 = ((iArr[i + 3] & 4294967295L) - (iArr2[i9 + 3] & 4294967295L)) + (j12 >> 32);
        iArr3[i10 + 3] = (int) j13;
        long j14 = ((iArr[i + 4] & 4294967295L) - (iArr2[i9 + 4] & 4294967295L)) + (j13 >> 32);
        iArr3[i10 + 4] = (int) j14;
        long j15 = ((iArr[i + 5] & 4294967295L) - (iArr2[i9 + 5] & 4294967295L)) + (j14 >> 32);
        iArr3[i10 + 5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = (iArr2[i9] & 4294967295L) - (iArr[i] & 4294967295L);
        iArr2[i9] = (int) j10;
        long j11 = ((iArr2[r5] & 4294967295L) - (iArr[i + 1] & 4294967295L)) + (j10 >> 32);
        iArr2[i9 + 1] = (int) j11;
        long j12 = ((iArr2[r5] & 4294967295L) - (iArr[i + 2] & 4294967295L)) + (j11 >> 32);
        iArr2[i9 + 2] = (int) j12;
        long j13 = ((iArr2[r5] & 4294967295L) - (iArr[i + 3] & 4294967295L)) + (j12 >> 32);
        iArr2[i9 + 3] = (int) j13;
        long j14 = ((iArr2[r5] & 4294967295L) - (iArr[i + 4] & 4294967295L)) + (j13 >> 32);
        iArr2[i9 + 4] = (int) j14;
        long j15 = ((iArr2[r13] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j14 >> 32);
        iArr2[i9 + 5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i9 = iArr[i];
            if (i9 != 0) {
                Pack.intToBigEndian(i9, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (4294967295L & iArr2[5]) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i9 = iArr[i] ^ Integer.MIN_VALUE;
            int i10 = Integer.MIN_VALUE ^ iArr2[i];
            if (i9 < i10) {
                return false;
            }
            if (i9 > i10) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr[0] & 4294967295L;
        long j17 = j16 * j10;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j11) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j12) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j20 = (j16 * j13) + (j19 >>> 32);
        iArr3[3] = (int) j20;
        long j21 = (j16 * j14) + (j20 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j16 * j15) + (j21 >>> 32);
        iArr3[5] = (int) j22;
        iArr3[6] = (int) (j22 >>> 32);
        int i = 1;
        for (int i9 = 6; i < i9; i9 = 6) {
            long j23 = iArr[i] & 4294967295L;
            long j24 = j10;
            long j25 = (j23 * j10) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j25;
            int i10 = i + 1;
            long j26 = (j23 * j11) + (iArr3[i10] & 4294967295L) + (j25 >>> 32);
            iArr3[i10] = (int) j26;
            long j27 = j11;
            long j28 = (j23 * j12) + (iArr3[r18] & 4294967295L) + (j26 >>> 32);
            iArr3[i + 2] = (int) j28;
            long j29 = (j23 * j13) + (iArr3[r6] & 4294967295L) + (j28 >>> 32);
            iArr3[i + 3] = (int) j29;
            long j30 = (j23 * j14) + (iArr3[r6] & 4294967295L) + (j29 >>> 32);
            iArr3[i + 4] = (int) j30;
            long j31 = j30 >>> 32;
            long j32 = (j23 * j15) + (iArr3[r3] & 4294967295L) + j31;
            iArr3[i + 5] = (int) j32;
            iArr3[i + 6] = (int) (j32 >>> 32);
            j10 = j24;
            i = i10;
            j11 = j27;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = 0;
        while (i < 6) {
            long j17 = j15;
            long j18 = iArr[i] & 4294967295L;
            long j19 = j10;
            long j20 = (iArr3[i] & 4294967295L) + (j18 * j10);
            iArr3[i] = (int) j20;
            int i9 = i + 1;
            long j21 = j11;
            long j22 = (j18 * j11) + (iArr3[i9] & 4294967295L) + (j20 >>> 32);
            iArr3[i9] = (int) j22;
            long j23 = (j18 * j12) + (iArr3[r6] & 4294967295L) + (j22 >>> 32);
            iArr3[i + 2] = (int) j23;
            long j24 = (j18 * j13) + (iArr3[r6] & 4294967295L) + (j23 >>> 32);
            iArr3[i + 3] = (int) j24;
            long j25 = (j18 * j14) + (iArr3[r6] & 4294967295L) + (j24 >>> 32);
            iArr3[i + 4] = (int) j25;
            long j26 = (j18 * j17) + (iArr3[r6] & 4294967295L) + (j25 >>> 32);
            iArr3[i + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (iArr3[r0] & 4294967295L) + j16;
            iArr3[i + 6] = (int) j27;
            j16 = j27 >>> 32;
            i = i9;
            j15 = j17;
            j10 = j19;
            j11 = j21;
        }
        return (int) j16;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i = 12;
        int i9 = 0;
        int i10 = 5;
        while (true) {
            int i11 = i10 - 1;
            long j11 = iArr[i10] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[i - 1] = (i9 << 31) | ((int) (j12 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j12 >>> 1);
            i9 = (int) j12;
            if (i11 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i9 << 31) & 4294967295L);
                iArr2[0] = (int) j13;
                long j15 = iArr[1] & 4294967295L;
                long j16 = j14 + (j15 * j10);
                int i12 = (int) j16;
                iArr2[1] = (i12 << 1) | (((int) (j13 >>> 32)) & 1);
                int i13 = i12 >>> 31;
                long j17 = (iArr2[2] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[2] & 4294967295L;
                long j19 = j17 + (j18 * j10);
                int i14 = (int) j19;
                iArr2[2] = (i14 << 1) | i13;
                long a10 = a.a(j18, j15, j19 >>> 32, iArr2[3] & 4294967295L);
                long j20 = (iArr2[4] & 4294967295L) + (a10 >>> 32);
                long j21 = iArr[3] & 4294967295L;
                long j22 = (iArr2[5] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[6] & 4294967295L) + (j22 >>> 32);
                long j25 = (j21 * j10) + (a10 & 4294967295L);
                int i15 = (int) j25;
                iArr2[3] = (i15 << 1) | (i14 >>> 31);
                long a11 = a.a(j21, j15, j25 >>> 32, j23);
                long a12 = a.a(j21, j18, a11 >>> 32, j22 & 4294967295L);
                long j26 = j24 + (a12 >>> 32);
                long j27 = a12 & 4294967295L;
                long j28 = iArr[4] & 4294967295L;
                long j29 = (iArr2[7] & 4294967295L) + (j26 >>> 32);
                long j30 = j26 & 4294967295L;
                long j31 = (iArr2[8] & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (j28 * j10) + (a11 & 4294967295L);
                int i16 = (int) j33;
                iArr2[4] = (i16 << 1) | (i15 >>> 31);
                int i17 = i16 >>> 31;
                long a13 = a.a(j28, j15, j33 >>> 32, j27);
                long a14 = a.a(j28, j18, a13 >>> 32, j30);
                long a15 = a.a(j28, j21, a14 >>> 32, j32);
                long j34 = a14 & 4294967295L;
                long j35 = j31 + (a15 >>> 32);
                long j36 = iArr[5] & 4294967295L;
                long j37 = (iArr2[9] & 4294967295L) + (j35 >>> 32);
                long j38 = j35 & 4294967295L;
                long j39 = (iArr2[10] & 4294967295L) + (j37 >>> 32);
                long j40 = 4294967295L & j37;
                long j41 = (j36 * j10) + (a13 & 4294967295L);
                int i18 = (int) j41;
                iArr2[5] = (i18 << 1) | i17;
                long a16 = a.a(j36, j15, j41 >>> 32, j34);
                long a17 = a.a(j36, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j36, j21, a17 >>> 32, j38);
                long a19 = a.a(j36, j28, a18 >>> 32, j40);
                long j42 = j39 + (a19 >>> 32);
                int i19 = (int) a16;
                iArr2[6] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) a17;
                iArr2[7] = (i19 >>> 31) | (i20 << 1);
                int i21 = (int) a18;
                iArr2[8] = (i21 << 1) | (i20 >>> 31);
                int i22 = (int) a19;
                iArr2[9] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j42;
                iArr2[10] = i23 | (i24 << 1);
                iArr2[11] = (i24 >>> 31) | ((iArr2[11] + ((int) (j42 >>> 32))) << 1);
                return;
            }
            i10 = i11;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j14 >> 32);
        iArr2[5] = (int) j15;
        return (int) (j15 >> 32);
    }
}
