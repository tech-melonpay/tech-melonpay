package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public abstract class Nat256 {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25313M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = (iArr[i] & 4294967295L) + (iArr2[i9] & 4294967295L);
        iArr3[i10] = (int) j10;
        long j11 = (iArr[i + 1] & 4294967295L) + (iArr2[i9 + 1] & 4294967295L) + (j10 >>> 32);
        iArr3[i10 + 1] = (int) j11;
        long j12 = (iArr[i + 2] & 4294967295L) + (iArr2[i9 + 2] & 4294967295L) + (j11 >>> 32);
        iArr3[i10 + 2] = (int) j12;
        long j13 = (iArr[i + 3] & 4294967295L) + (iArr2[i9 + 3] & 4294967295L) + (j12 >>> 32);
        iArr3[i10 + 3] = (int) j13;
        long j14 = (iArr[i + 4] & 4294967295L) + (iArr2[i9 + 4] & 4294967295L) + (j13 >>> 32);
        iArr3[i10 + 4] = (int) j14;
        long j15 = (iArr[i + 5] & 4294967295L) + (iArr2[i9 + 5] & 4294967295L) + (j14 >>> 32);
        iArr3[i10 + 5] = (int) j15;
        long j16 = (iArr[i + 6] & 4294967295L) + (iArr2[i9 + 6] & 4294967295L) + (j15 >>> 32);
        iArr3[i10 + 6] = (int) j16;
        long j17 = (iArr[i + 7] & 4294967295L) + (iArr2[i9 + 7] & 4294967295L) + (j16 >>> 32);
        iArr3[i10 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = (iArr[i] & 4294967295L) + (iArr2[i9] & 4294967295L) + (iArr3[i10] & 4294967295L);
        iArr3[i10] = (int) j10;
        long j11 = (iArr[i + 1] & 4294967295L) + (iArr2[i9 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j10 >>> 32);
        iArr3[i10 + 1] = (int) j11;
        long j12 = (iArr[i + 2] & 4294967295L) + (iArr2[i9 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j11 >>> 32);
        iArr3[i10 + 2] = (int) j12;
        long j13 = (iArr[i + 3] & 4294967295L) + (iArr2[i9 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j12 >>> 32);
        iArr3[i10 + 3] = (int) j13;
        long j14 = (iArr[i + 4] & 4294967295L) + (iArr2[i9 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j13 >>> 32);
        iArr3[i10 + 4] = (int) j14;
        long j15 = (iArr[i + 5] & 4294967295L) + (iArr2[i9 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j14 >>> 32);
        iArr3[i10 + 5] = (int) j15;
        long j16 = (iArr[i + 6] & 4294967295L) + (iArr2[i9 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j15 >>> 32);
        iArr3[i10 + 6] = (int) j16;
        long j17 = (iArr[i + 7] & 4294967295L) + (iArr2[i9 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L) + (j16 >>> 32);
        iArr3[i10 + 7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j15 = (iArr[i + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j14 >>> 32);
        iArr2[i9 + 5] = (int) j15;
        long j16 = (iArr[i + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j15 >>> 32);
        iArr2[i9 + 6] = (int) j16;
        long j17 = (iArr[i + 7] & 4294967295L) + (4294967295L & iArr2[r12]) + (j16 >>> 32);
        iArr2[i9 + 7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j15 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j14 >>> 32);
        int i15 = (int) j15;
        iArr[i + 5] = i15;
        iArr2[i9 + 5] = i15;
        long j16 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j15 >>> 32);
        int i16 = (int) j16;
        iArr[i + 6] = i16;
        iArr2[i9 + 6] = i16;
        long j17 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j16 >>> 32);
        int i17 = (int) j17;
        iArr[i + 7] = i17;
        iArr2[i9 + 7] = i17;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i9) {
        iArr2[i9] = iArr[i];
        iArr2[i9 + 1] = iArr[i + 1];
        iArr2[i9 + 2] = iArr[i + 2];
        iArr2[i9 + 3] = iArr[i + 3];
        iArr2[i9 + 4] = iArr[i + 4];
        iArr2[i9 + 5] = iArr[i + 5];
        iArr2[i9 + 6] = iArr[i + 6];
        iArr2[i9 + 7] = iArr[i + 7];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i];
        jArr2[i9 + 1] = jArr[i + 1];
        jArr2[i9 + 2] = jArr[i + 2];
        jArr2[i9 + 3] = jArr[i + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 8; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i = 0; i < 4; i++) {
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
            if ((i & 255) != i) {
                return 0;
            }
            i9 = iArr[i >>> 5] >>> (i & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i9) {
        for (int i10 = 7; i10 >= 0; i10--) {
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
        for (int i = 1; i < 8; i++) {
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
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
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
        long j16 = iArr2[i9 + 6] & 4294967295L;
        long j17 = iArr[i] & 4294967295L;
        long j18 = j17 * j10;
        iArr3[i10] = (int) j18;
        long j19 = (j17 * j11) + (j18 >>> 32);
        iArr3[i10 + 1] = (int) j19;
        long j20 = (j17 * j12) + (j19 >>> 32);
        iArr3[i10 + 2] = (int) j20;
        long j21 = (j17 * j13) + (j20 >>> 32);
        iArr3[i10 + 3] = (int) j21;
        long j22 = (j17 * j14) + (j21 >>> 32);
        iArr3[i10 + 4] = (int) j22;
        long j23 = (j17 * j15) + (j22 >>> 32);
        iArr3[i10 + 5] = (int) j23;
        long j24 = (j17 * j16) + (j23 >>> 32);
        iArr3[i10 + 6] = (int) j24;
        long j25 = j24 >>> 32;
        long j26 = iArr2[i9 + 7] & 4294967295L;
        long j27 = (j17 * j26) + j25;
        iArr3[i10 + 7] = (int) j27;
        iArr3[i10 + 8] = (int) (j27 >>> 32);
        int i11 = 1;
        int i12 = i10;
        while (i11 < 8) {
            int i13 = i12 + 1;
            long j28 = iArr[i + i11] & 4294967295L;
            long j29 = j26;
            int i14 = i11;
            long j30 = (j28 * j10) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j30;
            long j31 = (j28 * j11) + (iArr3[r16] & 4294967295L) + (j30 >>> 32);
            iArr3[i12 + 2] = (int) j31;
            long j32 = j12;
            long j33 = (j28 * j12) + (iArr3[r16] & 4294967295L) + (j31 >>> 32);
            iArr3[i12 + 3] = (int) j33;
            int i15 = i12;
            long j34 = (j28 * j13) + (iArr3[r6] & 4294967295L) + (j33 >>> 32);
            iArr3[i12 + 4] = (int) j34;
            long j35 = (j28 * j14) + (iArr3[r5] & 4294967295L) + (j34 >>> 32);
            iArr3[i15 + 5] = (int) j35;
            long j36 = (j28 * j15) + (iArr3[r5] & 4294967295L) + (j35 >>> 32);
            iArr3[i15 + 6] = (int) j36;
            long j37 = (j28 * j16) + (iArr3[r5] & 4294967295L) + (j36 >>> 32);
            iArr3[i15 + 7] = (int) j37;
            long j38 = j37 >>> 32;
            long j39 = (j28 * j29) + (iArr3[r3] & 4294967295L) + j38;
            iArr3[i15 + 8] = (int) j39;
            iArr3[i15 + 9] = (int) (j39 >>> 32);
            i11 = i14 + 1;
            i12 = i13;
            j12 = j32;
            j26 = j29;
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
        long j22 = (j10 * j21) + j19 + (iArr2[i10 + 5] & 4294967295L) + (j20 >>> 32);
        iArr3[i11 + 5] = (int) j22;
        long j23 = iArr[i9 + 6] & 4294967295L;
        long j24 = (j10 * j23) + j21 + (iArr2[i10 + 6] & 4294967295L) + (j22 >>> 32);
        iArr3[i11 + 6] = (int) j24;
        long j25 = iArr[i9 + 7] & 4294967295L;
        long j26 = (j10 * j25) + j23 + (4294967295L & iArr2[i10 + 7]) + (j24 >>> 32);
        iArr3[i11 + 7] = (int) j26;
        return (j26 >>> 32) + j25;
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
        return Nat.incAt(8, iArr, i9, 4);
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
        return Nat.incAt(8, iArr, i10, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j10 = iArr2[i9] & 4294967295L;
        long j11 = iArr2[i9 + 1] & 4294967295L;
        long j12 = iArr2[i9 + 2] & 4294967295L;
        long j13 = iArr2[i9 + 3] & 4294967295L;
        long j14 = iArr2[i9 + 4] & 4294967295L;
        long j15 = iArr2[i9 + 5] & 4294967295L;
        long j16 = iArr2[i9 + 6] & 4294967295L;
        long j17 = iArr2[i9 + 7] & 4294967295L;
        int i11 = 0;
        long j18 = 0;
        int i12 = i10;
        while (i11 < 8) {
            int i13 = i11;
            long j19 = iArr[i + i11] & 4294967295L;
            long j20 = j10;
            long j21 = (j19 * j10) + (iArr3[i12] & 4294967295L);
            long j22 = j17;
            iArr3[i12] = (int) j21;
            int i14 = i12 + 1;
            long j23 = (j19 * j11) + (iArr3[i14] & 4294967295L) + (j21 >>> 32);
            iArr3[i14] = (int) j23;
            long j24 = (j19 * j12) + (iArr3[r5] & 4294967295L) + (j23 >>> 32);
            iArr3[i12 + 2] = (int) j24;
            long j25 = (j19 * j13) + (iArr3[r5] & 4294967295L) + (j24 >>> 32);
            iArr3[i12 + 3] = (int) j25;
            long j26 = (j19 * j14) + (iArr3[r5] & 4294967295L) + (j25 >>> 32);
            iArr3[i12 + 4] = (int) j26;
            long j27 = (j19 * j15) + (iArr3[r5] & 4294967295L) + (j26 >>> 32);
            iArr3[i12 + 5] = (int) j27;
            long j28 = (j19 * j16) + (iArr3[r5] & 4294967295L) + (j27 >>> 32);
            iArr3[i12 + 6] = (int) j28;
            long j29 = (j19 * j22) + (iArr3[r5] & 4294967295L) + (j28 >>> 32);
            iArr3[i12 + 7] = (int) j29;
            long j30 = (j29 >>> 32) + (iArr3[r16] & 4294967295L) + j18;
            iArr3[i12 + 8] = (int) j30;
            j18 = j30 >>> 32;
            i11 = i13 + 1;
            i12 = i14;
            j17 = j22;
            j10 = j20;
            j11 = j11;
        }
        return (int) j18;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j10 = i & 4294967295L;
        long j11 = (iArr[0] & 4294967295L) * j10;
        iArr[0] = (int) j11;
        long j12 = ((iArr[1] & 4294967295L) * j10) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = ((iArr[2] & 4294967295L) * j10) + (j12 >>> 32);
        iArr[2] = (int) j13;
        long j14 = ((iArr[3] & 4294967295L) * j10) + (j13 >>> 32);
        iArr[3] = (int) j14;
        long j15 = ((iArr[4] & 4294967295L) * j10) + (j14 >>> 32);
        iArr[4] = (int) j15;
        long j16 = ((iArr[5] & 4294967295L) * j10) + (j15 >>> 32);
        iArr[5] = (int) j16;
        long j17 = ((iArr[6] & 4294967295L) * j10) + (j16 >>> 32);
        iArr[6] = (int) j17;
        long j18 = (j10 * (4294967295L & iArr[7])) + (j17 >>> 32);
        iArr[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j10 = i & 4294967295L;
        long j11 = ((iArr2[0] & 4294967295L) * j10) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j11;
        long j12 = ((iArr2[1] & 4294967295L) * j10) + (iArr[1] & 4294967295L) + (j11 >>> 32);
        iArr2[1] = (int) j12;
        long j13 = ((iArr2[2] & 4294967295L) * j10) + (iArr[2] & 4294967295L) + (j12 >>> 32);
        iArr2[2] = (int) j13;
        long j14 = ((iArr2[3] & 4294967295L) * j10) + (iArr[3] & 4294967295L) + (j13 >>> 32);
        iArr2[3] = (int) j14;
        long j15 = ((iArr2[4] & 4294967295L) * j10) + (iArr[4] & 4294967295L) + (j14 >>> 32);
        iArr2[4] = (int) j15;
        long j16 = ((iArr2[5] & 4294967295L) * j10) + (iArr[5] & 4294967295L) + (j15 >>> 32);
        iArr2[5] = (int) j16;
        long j17 = ((iArr2[6] & 4294967295L) * j10) + (iArr[6] & 4294967295L) + (j16 >>> 32);
        iArr2[6] = (int) j17;
        long j18 = (j10 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j17 >>> 32);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        } while (i10 < 8);
        return (int) j11;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i9, int[] iArr2, int i10) {
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
        long j16 = ((iArr[i9 + 5] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j15 >>> 32);
        iArr2[i10 + 5] = (int) j16;
        long j17 = ((iArr[i9 + 6] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j16 >>> 32);
        iArr2[i10 + 6] = (int) j17;
        long j18 = (j10 * (iArr[i9 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j17 >>> 32);
        iArr2[i10 + 7] = (int) j18;
        return (int) (j18 >>> 32);
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
        return Nat.incAt(8, iArr, i9, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i9) {
        long j10 = iArr[i] & 4294967295L;
        int i10 = 0;
        int i11 = 16;
        int i12 = 7;
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
                long j30 = (iArr2[r39] & 4294967295L) + (j27 >>> 32);
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
                long j40 = (iArr2[r5] & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (j37 * j10) + (a13 & 4294967295L);
                int i21 = (int) j42;
                iArr2[i9 + 5] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long a16 = a.a(j37, j15, j42 >>> 32, j35);
                long a17 = a.a(j37, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j37, j21, a17 >>> 32, j39);
                long j43 = a17 & 4294967295L;
                long a19 = a.a(j37, j29, a18 >>> 32, j41);
                long j44 = j40 + (a19 >>> 32);
                long j45 = a19 & 4294967295L;
                long j46 = iArr[i + 6] & 4294967295L;
                long j47 = (iArr2[r35] & 4294967295L) + (j44 >>> 32);
                long j48 = (iArr2[r52] & 4294967295L) + (j47 >>> 32);
                long j49 = j47 & 4294967295L;
                long j50 = (j46 * j10) + (a16 & 4294967295L);
                int i23 = (int) j50;
                iArr2[i9 + 6] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                long a20 = a.a(j46, j15, j50 >>> 32, j43);
                long a21 = a.a(j46, j18, a20 >>> 32, a18 & 4294967295L);
                long a22 = a.a(j46, j21, a21 >>> 32, j45);
                long j51 = a21 & 4294967295L;
                long a23 = a.a(j46, j29, a22 >>> 32, j44 & 4294967295L);
                long j52 = a22 & 4294967295L;
                long a24 = a.a(j46, j37, a23 >>> 32, j49);
                long j53 = a23 & 4294967295L;
                long j54 = j48 + (a24 >>> 32);
                long j55 = iArr[i + 7] & 4294967295L;
                long j56 = (iArr2[r6] & 4294967295L) + (j54 >>> 32);
                long j57 = (iArr2[r36] & 4294967295L) + (j56 >>> 32);
                long j58 = j56 & 4294967295L;
                long j59 = (j10 * j55) + (a20 & 4294967295L);
                int i25 = (int) j59;
                iArr2[i9 + 7] = (i25 << 1) | i24;
                long a25 = a.a(j55, j15, j59 >>> 32, j51);
                long a26 = a.a(j55, j18, a25 >>> 32, j52);
                long a27 = a.a(j55, j21, a26 >>> 32, j53);
                long a28 = a.a(j55, j29, a27 >>> 32, a24 & 4294967295L);
                long a29 = a.a(j55, j37, a28 >>> 32, j54 & 4294967295L);
                long a30 = a.a(j55, j46, a29 >>> 32, j58);
                long j60 = j57 + (a30 >>> 32);
                int i26 = (int) a25;
                iArr2[i9 + 8] = (i26 << 1) | (i25 >>> 31);
                int i27 = (int) a26;
                iArr2[i9 + 9] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) a27;
                iArr2[i9 + 10] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) a28;
                iArr2[i9 + 11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) a29;
                iArr2[i9 + 12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) a30;
                iArr2[i9 + 13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j60;
                iArr2[i9 + 14] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = i9 + 15;
                iArr2[i39] = i38 | ((iArr2[i39] + ((int) (j60 >>> 32))) << 1);
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
        long j16 = ((iArr[i + 6] & 4294967295L) - (iArr2[i9 + 6] & 4294967295L)) + (j15 >> 32);
        iArr3[i10 + 6] = (int) j16;
        long j17 = ((iArr[i + 7] & 4294967295L) - (iArr2[i9 + 7] & 4294967295L)) + (j16 >> 32);
        iArr3[i10 + 7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j16 = (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j15 = ((iArr2[r5] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j14 >> 32);
        iArr2[i9 + 5] = (int) j15;
        long j16 = ((iArr2[r5] & 4294967295L) - (iArr[i + 6] & 4294967295L)) + (j15 >> 32);
        iArr2[i9 + 6] = (int) j16;
        long j17 = ((iArr2[r13] & 4294967295L) - (iArr[i + 7] & 4294967295L)) + (j16 >> 32);
        iArr2[i9 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i9 = iArr[i];
            if (i9 != 0) {
                Pack.intToBigEndian(i9, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (3 - i) << 3);
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
        iArr[6] = 0;
        iArr[7] = 0;
    }

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
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr2[7] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[0] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j20;
        long j21 = (j18 * j12) + (j20 >>> 32);
        iArr3[2] = (int) j21;
        long j22 = (j18 * j13) + (j21 >>> 32);
        iArr3[3] = (int) j22;
        long j23 = (j18 * j14) + (j22 >>> 32);
        iArr3[4] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[5] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[7] = (int) j26;
        iArr3[8] = (int) (j26 >>> 32);
        int i = 1;
        for (int i9 = 8; i < i9; i9 = 8) {
            long j27 = iArr[i] & 4294967295L;
            long j28 = j10;
            long j29 = (j27 * j10) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j29;
            int i10 = i + 1;
            long j30 = (j27 * j11) + (iArr3[i10] & 4294967295L) + (j29 >>> 32);
            iArr3[i10] = (int) j30;
            long j31 = j11;
            long j32 = (j27 * j12) + (iArr3[r18] & 4294967295L) + (j30 >>> 32);
            iArr3[i + 2] = (int) j32;
            long j33 = (j27 * j13) + (iArr3[r6] & 4294967295L) + (j32 >>> 32);
            iArr3[i + 3] = (int) j33;
            long j34 = (j27 * j14) + (iArr3[r6] & 4294967295L) + (j33 >>> 32);
            iArr3[i + 4] = (int) j34;
            long j35 = (j27 * j15) + (iArr3[r6] & 4294967295L) + (j34 >>> 32);
            iArr3[i + 5] = (int) j35;
            long j36 = (j27 * j16) + (iArr3[r6] & 4294967295L) + (j35 >>> 32);
            iArr3[i + 6] = (int) j36;
            long j37 = j36 >>> 32;
            long j38 = (j27 * j17) + (iArr3[r3] & 4294967295L) + j37;
            iArr3[i + 7] = (int) j38;
            iArr3[i + 8] = (int) (j38 >>> 32);
            j10 = j28;
            i = i10;
            j11 = j31;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr2[7] & 4294967295L;
        long j18 = 0;
        int i = 0;
        while (i < 8) {
            long j19 = j17;
            long j20 = iArr[i] & 4294967295L;
            long j21 = j15;
            long j22 = (iArr3[i] & 4294967295L) + (j20 * j10);
            iArr3[i] = (int) j22;
            int i9 = i + 1;
            long j23 = j11;
            long j24 = (j20 * j11) + (iArr3[i9] & 4294967295L) + (j22 >>> 32);
            iArr3[i9] = (int) j24;
            long j25 = (j20 * j12) + (iArr3[r27] & 4294967295L) + (j24 >>> 32);
            iArr3[i + 2] = (int) j25;
            long j26 = (j20 * j13) + (iArr3[r8] & 4294967295L) + (j25 >>> 32);
            iArr3[i + 3] = (int) j26;
            long j27 = (j20 * j14) + (iArr3[r8] & 4294967295L) + (j26 >>> 32);
            iArr3[i + 4] = (int) j27;
            long j28 = (j20 * j21) + (iArr3[r8] & 4294967295L) + (j27 >>> 32);
            iArr3[i + 5] = (int) j28;
            long j29 = (j20 * j16) + (iArr3[r8] & 4294967295L) + (j28 >>> 32);
            iArr3[i + 6] = (int) j29;
            long j30 = (j20 * j19) + (iArr3[r8] & 4294967295L) + (j29 >>> 32);
            iArr3[i + 7] = (int) j30;
            long j31 = (j30 >>> 32) + (iArr3[r2] & 4294967295L) + j18;
            iArr3[i + 8] = (int) j31;
            j18 = j31 >>> 32;
            i = i9;
            j17 = j19;
            j15 = j21;
            j11 = j23;
            j12 = j12;
        }
        return (int) j18;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i = 16;
        int i9 = 0;
        int i10 = 7;
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
                iArr2[4] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                long a13 = a.a(j28, j15, j33 >>> 32, j27);
                long a14 = a.a(j28, j18, a13 >>> 32, j30);
                long a15 = a.a(j28, j21, a14 >>> 32, j32);
                long j34 = j31 + (a15 >>> 32);
                long j35 = iArr[5] & 4294967295L;
                long j36 = (iArr2[9] & 4294967295L) + (j34 >>> 32);
                long j37 = j34 & 4294967295L;
                long j38 = (iArr2[10] & 4294967295L) + (j36 >>> 32);
                long j39 = j36 & 4294967295L;
                long j40 = (j35 * j10) + (a13 & 4294967295L);
                int i18 = (int) j40;
                iArr2[5] = (i18 << 1) | i17;
                long a16 = a.a(j35, j15, j40 >>> 32, a14 & 4294967295L);
                long a17 = a.a(j35, j18, a16 >>> 32, a15 & 4294967295L);
                long a18 = a.a(j35, j21, a17 >>> 32, j37);
                long j41 = a17 & 4294967295L;
                long a19 = a.a(j35, j28, a18 >>> 32, j39);
                long j42 = j38 + (a19 >>> 32);
                long j43 = a19 & 4294967295L;
                long j44 = iArr[6] & 4294967295L;
                long j45 = (iArr2[11] & 4294967295L) + (j42 >>> 32);
                long j46 = j42 & 4294967295L;
                long j47 = (iArr2[12] & 4294967295L) + (j45 >>> 32);
                long j48 = j45 & 4294967295L;
                long j49 = (j44 * j10) + (a16 & 4294967295L);
                int i19 = (int) j49;
                iArr2[6] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                long a20 = a.a(j44, j15, j49 >>> 32, j41);
                long a21 = a.a(j44, j18, a20 >>> 32, a18 & 4294967295L);
                long a22 = a.a(j44, j21, a21 >>> 32, j43);
                long j50 = a21 & 4294967295L;
                long a23 = a.a(j44, j28, a22 >>> 32, j46);
                long j51 = a22 & 4294967295L;
                long a24 = a.a(j44, j35, a23 >>> 32, j48);
                long j52 = a23 & 4294967295L;
                long j53 = j47 + (a24 >>> 32);
                long j54 = iArr[7] & 4294967295L;
                long j55 = (iArr2[13] & 4294967295L) + (j53 >>> 32);
                long j56 = j53 & 4294967295L;
                long j57 = (iArr2[14] & 4294967295L) + (j55 >>> 32);
                long j58 = 4294967295L & j55;
                long j59 = (j10 * j54) + (a20 & 4294967295L);
                int i21 = (int) j59;
                iArr2[7] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long a25 = a.a(j54, j15, j59 >>> 32, j50);
                long a26 = a.a(j54, j18, a25 >>> 32, j51);
                long a27 = a.a(j54, j21, a26 >>> 32, j52);
                long a28 = a.a(j54, j28, a27 >>> 32, a24 & 4294967295L);
                long a29 = a.a(j54, j35, a28 >>> 32, j56);
                long a30 = a.a(j54, j44, a29 >>> 32, j58);
                long j60 = j57 + (a30 >>> 32);
                int i23 = (int) a25;
                iArr2[8] = (i23 << 1) | i22;
                int i24 = (int) a26;
                iArr2[9] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) a27;
                iArr2[10] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) a28;
                iArr2[11] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) a29;
                iArr2[12] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) a30;
                iArr2[13] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j60;
                iArr2[14] = i33 | (i34 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j60 >>> 32))) << 1) | (i34 >>> 31);
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
        long j16 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j15 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }
}
