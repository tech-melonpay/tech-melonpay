package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public abstract class Nat128 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25309M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
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
        return (int) (j13 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i9, int i10) {
        long j10 = (iArr[i] & 4294967295L) + (iArr2[i9] & 4294967295L) + (i10 & 4294967295L);
        iArr2[i9] = (int) j10;
        long j11 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j10 >>> 32);
        iArr2[i9 + 1] = (int) j11;
        long j12 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j11 >>> 32);
        iArr2[i9 + 2] = (int) j12;
        long j13 = (iArr[i + 3] & 4294967295L) + (4294967295L & iArr2[r12]) + (j12 >>> 32);
        iArr2[i9 + 3] = (int) j13;
        return (int) (j13 >>> 32);
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
        long j13 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j12 >>> 32);
        int i13 = (int) j13;
        iArr[i + 3] = i13;
        iArr2[i9 + 3] = i13;
        return (int) (j13 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i9) {
        iArr2[i9] = iArr[i];
        iArr2[i9 + 1] = iArr[i + 1];
        iArr2[i9 + 2] = iArr[i + 2];
        iArr2[i9 + 3] = iArr[i + 3];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i];
        jArr2[i9 + 1] = jArr[i + 1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
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
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 4; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i = 0; i < 2; i++) {
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
            if (i10 < 0 || i10 >= 4) {
                return 0;
            }
            i9 = iArr[i10] >>> (i & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i9) {
        for (int i10 = 3; i10 >= 0; i10--) {
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
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 2; i++) {
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
        long j14 = iArr[i] & 4294967295L;
        long j15 = j14 * j10;
        iArr3[i10] = (int) j15;
        char c2 = ' ';
        long j16 = (j15 >>> 32) + (j14 * j11);
        iArr3[i10 + 1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[i10 + 2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[i10 + 3] = (int) j18;
        iArr3[i10 + 4] = (int) (j18 >>> 32);
        int i11 = 1;
        int i12 = i10;
        while (i11 < 4) {
            int i13 = i12 + 1;
            long j19 = iArr[i + i11] & 4294967295L;
            long j20 = j10;
            long j21 = (j19 * j10) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j21;
            long j22 = (j19 * j11) + (iArr3[r13] & 4294967295L) + (j21 >>> c2);
            iArr3[i12 + 2] = (int) j22;
            long j23 = (j19 * j12) + (iArr3[r5] & 4294967295L) + (j22 >>> 32);
            iArr3[i12 + 3] = (int) j23;
            long j24 = (j19 * j13) + (iArr3[r1] & 4294967295L) + (j23 >>> 32);
            iArr3[i12 + 4] = (int) j24;
            iArr3[i12 + 5] = (int) (j24 >>> 32);
            i11++;
            c2 = ' ';
            i12 = i13;
            j12 = j12;
            j10 = j20;
            j11 = j11;
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
        long j18 = (j10 * j17) + j15 + (4294967295L & iArr2[i10 + 3]) + (j16 >>> 32);
        iArr3[i11 + 3] = (int) j18;
        return (j18 >>> 32) + j17;
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
        long j18 = (j17 >>> 32) + (iArr[r14] & 4294967295L);
        iArr[i9 + 3] = (int) j18;
        return (int) (j18 >>> 32);
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
        return Nat.incAt(4, iArr, i10, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = 4294967295L;
        long j11 = iArr2[i9] & 4294967295L;
        long j12 = iArr2[i9 + 1] & 4294967295L;
        long j13 = iArr2[i9 + 2] & 4294967295L;
        long j14 = iArr2[i9 + 3] & 4294967295L;
        int i11 = 0;
        long j15 = 0;
        int i12 = i10;
        while (i11 < 4) {
            long j16 = iArr[i + i11] & j10;
            long j17 = j11;
            long j18 = (j16 * j11) + (iArr3[i12] & j10);
            iArr3[i12] = (int) j18;
            int i13 = i12 + 1;
            long j19 = j12;
            long j20 = (j16 * j12) + (iArr3[i13] & 4294967295L) + (j18 >>> 32);
            iArr3[i13] = (int) j20;
            long j21 = (j16 * j13) + (iArr3[r20] & 4294967295L) + (j20 >>> 32);
            iArr3[i12 + 2] = (int) j21;
            long j22 = (j16 * j14) + (iArr3[r3] & 4294967295L) + (j21 >>> 32);
            iArr3[i12 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (iArr3[r10] & 4294967295L) + j15;
            iArr3[i12 + 4] = (int) j23;
            j15 = j23 >>> 32;
            i11++;
            i12 = i13;
            j10 = 4294967295L;
            j11 = j17;
            j12 = j19;
        }
        return (int) j15;
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
        } while (i10 < 4);
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
        long j14 = (j10 * (iArr[i9 + 3] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j13 >>> 32);
        iArr2[i10 + 3] = (int) j14;
        return (int) (j14 >>> 32);
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
        return Nat.incAt(4, iArr, i9, 3);
    }

    public static int mulWordsAdd(int i, int i9, int[] iArr, int i10) {
        long j10 = ((i9 & 4294967295L) * (i & 4294967295L)) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = (j10 >>> 32) + (4294967295L & iArr[r1]);
        iArr[i10 + 1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i10, 2);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = iArr[i] & 4294967295L;
        int i10 = 0;
        int i11 = 8;
        int i12 = 3;
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
                long j22 = (iArr2[r5] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (j10 * j21) + (a10 & 4294967295L);
                int i18 = (int) j24;
                iArr2[i9 + 3] = (i17 >>> 31) | (i18 << 1);
                long a11 = a.a(j21, j15, j24 >>> 32, j23);
                long a12 = a.a(j21, j18, a11 >>> 32, 4294967295L & j22);
                long j25 = (iArr2[r8] & 4294967295L) + (j22 >>> 32) + (a12 >>> 32);
                int i19 = (int) a11;
                iArr2[i9 + 4] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) a12;
                iArr2[i9 + 5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j25;
                iArr2[i9 + 6] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = i9 + 7;
                iArr2[i24] = i23 | ((iArr2[i24] + ((int) (j25 >>> 32))) << 1);
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
        return (int) (j13 >> 32);
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
        return (int) (j13 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = (iArr2[i9] & 4294967295L) - (iArr[i] & 4294967295L);
        iArr2[i9] = (int) j10;
        long j11 = ((iArr2[r5] & 4294967295L) - (iArr[i + 1] & 4294967295L)) + (j10 >> 32);
        iArr2[i9 + 1] = (int) j11;
        long j12 = ((iArr2[r5] & 4294967295L) - (iArr[i + 2] & 4294967295L)) + (j11 >> 32);
        iArr2[i9 + 2] = (int) j12;
        long j13 = ((iArr2[r13] & 4294967295L) - (iArr[i + 3] & 4294967295L)) + (j12 >> 32);
        iArr2[i9 + 3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i9 = iArr[i];
            if (i9 != 0) {
                Pack.intToBigEndian(i9, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (4294967295L & iArr2[3]) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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
        int i = 1;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr[0] & 4294967295L;
        long j15 = j14 * j10;
        iArr3[0] = (int) j15;
        long j16 = (j14 * j11) + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        iArr3[4] = (int) (j18 >>> 32);
        for (int i9 = 4; i < i9; i9 = 4) {
            long j19 = iArr[i] & 4294967295L;
            long j20 = (j19 * j10) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j20;
            int i10 = i + 1;
            int i11 = i;
            long j21 = (j19 * j11) + (iArr3[i10] & 4294967295L) + (j20 >>> 32);
            iArr3[i10] = (int) j21;
            long j22 = (j19 * j12) + (iArr3[r8] & 4294967295L) + (j21 >>> 32);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j19 * j13) + (iArr3[r5] & 4294967295L) + (j22 >>> 32);
            iArr3[i11 + 3] = (int) j23;
            iArr3[i11 + 4] = (int) (j23 >>> 32);
            i = i10;
            j10 = j10;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = 0;
        while (i < 4) {
            long j15 = iArr[i] & 4294967295L;
            long j16 = j10;
            long j17 = (iArr3[i] & 4294967295L) + (j15 * j10);
            iArr3[i] = (int) j17;
            int i9 = i + 1;
            long j18 = j11;
            long j19 = (j15 * j11) + (iArr3[i9] & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j19;
            long j20 = (j15 * j12) + (iArr3[r6] & 4294967295L) + (j19 >>> 32);
            iArr3[i + 2] = (int) j20;
            long j21 = (j15 * j13) + (iArr3[r6] & 4294967295L) + (j20 >>> 32);
            iArr3[i + 3] = (int) j21;
            long j22 = (j21 >>> 32) + (iArr3[r0] & 4294967295L) + j14;
            iArr3[i + 4] = (int) j22;
            j14 = j22 >>> 32;
            i = i9;
            j10 = j16;
            j11 = j18;
        }
        return (int) j14;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i = 8;
        int i9 = 0;
        int i10 = 3;
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
                long j24 = (j10 * j21) + (a10 & 4294967295L);
                int i15 = (int) j24;
                iArr2[3] = (i15 << 1) | (i14 >>> 31);
                long a11 = a.a(j21, j15, j24 >>> 32, j23);
                long a12 = a.a(j21, j18, a11 >>> 32, j22 & 4294967295L);
                long j25 = (iArr2[6] & 4294967295L) + (j22 >>> 32) + (a12 >>> 32);
                int i16 = (int) a11;
                iArr2[4] = (i16 << 1) | (i15 >>> 31);
                int i17 = (int) (4294967295L & a12);
                iArr2[5] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j25;
                iArr2[6] = i18 | (i19 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j25 >>> 32))) << 1) | (i19 >>> 31);
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
        return (int) (j13 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3])) + (j12 >> 32);
        iArr2[3] = (int) j13;
        return (int) (j13 >> 32);
    }
}
