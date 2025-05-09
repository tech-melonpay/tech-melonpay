package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public abstract class Nat {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25308M = 4294967295L;

    public static int add(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = (iArr[i9] & 4294967295L) + (4294967295L & iArr2[i9]) + j10;
            iArr3[i9] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int add33At(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) + (i9 & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = (4294967295L & iArr[r4]) + 1 + (j10 >>> 32);
        iArr[i10 + 1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10 + 2);
    }

    public static int add33To(int i, int i9, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + (i9 & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = (4294967295L & iArr[1]) + 1 + (j10 >>> 32);
        iArr[1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 2);
    }

    public static int addBothTo(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            long j11 = (iArr[i9 + i12] & 4294967295L) + (iArr2[i10 + i12] & 4294967295L) + (4294967295L & iArr3[r8]) + j10;
            iArr3[i11 + i12] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addDWordAt(int i, long j10, int[] iArr, int i9) {
        long j11 = (iArr[i9] & 4294967295L) + (j10 & 4294967295L);
        iArr[i9] = (int) j11;
        long j12 = (4294967295L & iArr[r5]) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i9 + 1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i9 + 2);
    }

    public static int addDWordTo(int i, long j10, int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) + (j10 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = (4294967295L & iArr[1]) + (j10 >>> 32) + (j11 >>> 32);
        iArr[1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 2);
    }

    public static int addTo(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            long j11 = (iArr[i9 + i11] & 4294967295L) + (4294967295L & iArr2[r7]) + j10;
            iArr2[i10 + i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addToEachOther(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            long j11 = (iArr[r3] & 4294967295L) + (4294967295L & iArr2[r8]) + j10;
            int i12 = (int) j11;
            iArr[i9 + i11] = i12;
            iArr2[i10 + i11] = i12;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addWordAt(int i, int i9, int[] iArr, int i10) {
        long j10 = (i9 & 4294967295L) + (4294967295L & iArr[i10]);
        iArr[i10] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10 + 1);
    }

    public static int addWordTo(int i, int i9, int[] iArr) {
        long j10 = (i9 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 1);
    }

    public static int cadd(int i, int i9, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (-(i9 & 1)) & 4294967295L;
        long j11 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j12 = (iArr[i10] & 4294967295L) + (iArr2[i10] & j10) + j11;
            iArr3[i10] = (int) j12;
            j11 = j12 >>> 32;
        }
        return (int) j11;
    }

    public static void cmov(int i, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = -(i9 & 1);
        for (int i13 = 0; i13 < i; i13++) {
            int i14 = i11 + i13;
            int i15 = iArr2[i14];
            iArr2[i14] = i15 ^ ((iArr[i10 + i13] ^ i15) & i12);
        }
    }

    public static int compare(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = i - 1; i11 >= 0; i11--) {
            int i12 = iArr[i9 + i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i10 + i11];
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        System.arraycopy(iArr, i9, iArr2, i10, i);
    }

    public static void copy64(int i, long[] jArr, int i9, long[] jArr2, int i10) {
        System.arraycopy(jArr, i9, jArr2, i10, i);
    }

    public static int[] create(int i) {
        return new int[i];
    }

    public static long[] create64(int i) {
        return new long[i];
    }

    public static int csub(int i, int i9, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (-(i9 & 1)) & 4294967295L;
        long j11 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            long j12 = ((iArr[i10 + i13] & 4294967295L) - (iArr2[i11 + i13] & j10)) + j11;
            iArr3[i12 + i13] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int dec(int i, int[] iArr) {
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = iArr[i9] - 1;
            iArr[i9] = i10;
            if (i10 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i, int[] iArr, int i9) {
        while (i9 < i) {
            int i10 = iArr[i9] - 1;
            iArr[i9] = i10;
            if (i10 != -1) {
                return 0;
            }
            i9++;
        }
        return -1;
    }

    public static boolean diff(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        boolean gte = gte(i, iArr, i9, iArr2, i10);
        if (gte) {
            sub(i, iArr, i9, iArr2, i10, iArr3, i11);
        } else {
            sub(i, iArr2, i10, iArr, i9, iArr3, i11);
        }
        return gte;
    }

    public static boolean eq(int i, int[] iArr, int[] iArr2) {
        for (int i9 = i - 1; i9 >= 0; i9--) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    public static int equalTo(int i, int[] iArr, int i9) {
        int i10 = i9 ^ iArr[0];
        for (int i11 = 1; i11 < i; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i, int[] iArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 |= iArr[i10];
        }
        return (((i9 >>> 1) | (i9 & 1)) - 1) >> 31;
    }

    public static int[] fromBigInteger(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i9 = (i + 31) >> 5;
        int[] create = create(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            create[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i9 = (i + 63) >> 6;
        long[] create64 = create64(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            create64[i10] = bigInteger.longValue();
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
            if (i10 < 0 || i10 >= iArr.length) {
                return 0;
            }
            i9 = iArr[i10] >>> (i & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = i - 1; i11 >= 0; i11--) {
            int i12 = iArr[i9 + i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i10 + i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i, int[] iArr) {
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = iArr[i9] + 1;
            iArr[i9] = i10;
            if (i10 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i9) {
        while (i9 < i) {
            int i10 = iArr[i9] + 1;
            iArr[i9] = i10;
            if (i10 != 0) {
                return 0;
            }
            i9++;
        }
        return 1;
    }

    public static boolean isOne(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i9 = 1; i9 < i; i9++) {
            if (iArr[i9] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i, int[] iArr) {
        for (int i9 = 0; i9 < i; i9++) {
            if (iArr[i9] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            j10 = (((iArr[i9 + i11] & 4294967295L) - (4294967295L & iArr2[i10 + i11])) + j10) >> 32;
        }
        return (int) j10;
    }

    public static void mul(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        iArr3[i11 + i] = mulWord(i, iArr[i9], iArr2, i10, iArr3, i11);
        for (int i12 = 1; i12 < i; i12++) {
            int i13 = i11 + i12;
            iArr3[i13 + i] = mulWordAddTo(i, iArr[i9 + i12], iArr2, i10, iArr3, i13);
        }
    }

    public static int mul31BothAdd(int i, int i9, int[] iArr, int i10, int[] iArr2, int[] iArr3, int i11) {
        long j10 = i9 & 4294967295L;
        long j11 = i10 & 4294967295L;
        long j12 = 0;
        int i12 = 0;
        do {
            long j13 = ((iArr2[i12] & 4294967295L) * j11) + ((iArr[i12] & 4294967295L) * j10) + (iArr3[r9] & 4294967295L) + j12;
            iArr3[i11 + i12] = (int) j13;
            j12 = j13 >>> 32;
            i12++;
        } while (i12 < i);
        return (int) j12;
    }

    public static int mulAddTo(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            long mulWordAddTo = j10 + (mulWordAddTo(i, iArr[i9 + i12], iArr2, i10, iArr3, i11) & 4294967295L) + (iArr3[r3] & 4294967295L);
            iArr3[i11 + i] = (int) mulWordAddTo;
            j10 = mulWordAddTo >>> 32;
            i11++;
        }
        return (int) j10;
    }

    public static int mulWord(int i, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = i9 & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = ((iArr[i10 + i12] & 4294967295L) * j10) + j11;
            iArr2[i11 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < i);
        return (int) j11;
    }

    public static int mulWordAddTo(int i, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = i9 & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = ((iArr[i10 + i12] & 4294967295L) * j10) + (iArr2[r9] & 4294967295L) + j11;
            iArr2[i11 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < i);
        return (int) j11;
    }

    public static int mulWordDwordAddAt(int i, int i9, long j10, int[] iArr, int i10) {
        long j11 = i9 & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        long j14 = j13 + (iArr[r10] & 4294967295L) + (j12 >>> 32);
        iArr[i10 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = j15 + (iArr[r0] & 4294967295L);
        iArr[i10 + 2] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10 + 3);
    }

    public static int shiftDownBit(int i, int[] iArr, int i9) {
        while (true) {
            i--;
            if (i < 0) {
                return i9 << 31;
            }
            int i10 = iArr[i];
            iArr[i] = (i9 << 31) | (i10 >>> 1);
            i9 = i10;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i9, int i10) {
        while (true) {
            i--;
            if (i < 0) {
                return i10 << (-i9);
            }
            int i11 = iArr[i];
            iArr[i] = (i10 << (-i9)) | (i11 >>> i9);
            i10 = i11;
        }
    }

    public static int shiftDownWord(int i, int[] iArr, int i9) {
        while (true) {
            i--;
            if (i < 0) {
                return i9;
            }
            int i10 = iArr[i];
            iArr[i] = i9;
            i9 = i10;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i9) {
        int i10 = 0;
        while (i10 < i) {
            int i11 = iArr[i10];
            iArr[i10] = (i9 >>> 31) | (i11 << 1);
            i10++;
            i9 = i11;
        }
        return i9 >>> 31;
    }

    public static long shiftUpBit64(int i, long[] jArr, int i9, long j10, long[] jArr2, int i10) {
        int i11 = 0;
        while (i11 < i) {
            long j11 = jArr[i9 + i11];
            jArr2[i10 + i11] = (j10 >>> 63) | (j11 << 1);
            i11++;
            j10 = j11;
        }
        return j10 >>> 63;
    }

    public static int shiftUpBits(int i, int[] iArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i) {
            int i12 = iArr[i11];
            iArr[i11] = (i10 >>> (-i9)) | (i12 << i9);
            i11++;
            i10 = i12;
        }
        return i10 >>> (-i9);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i9, int i10, long j10) {
        int i11 = 0;
        while (i11 < i) {
            int i12 = i9 + i11;
            long j11 = jArr[i12];
            jArr[i12] = (j10 >>> (-i10)) | (j11 << i10);
            i11++;
            j10 = j11;
        }
        return j10 >>> (-i10);
    }

    public static void square(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11;
        int i12 = i << 1;
        int i13 = 0;
        int i14 = i;
        int i15 = i12;
        do {
            i14--;
            long j10 = iArr[i9 + i14] & 4294967295L;
            long j11 = j10 * j10;
            iArr2[(i15 - 1) + i10] = (i13 << 31) | ((int) (j11 >>> 33));
            i15 -= 2;
            iArr2[i10 + i15] = (int) (j11 >>> 1);
            i13 = (int) j11;
        } while (i14 > 0);
        int i16 = i10 + 2;
        long j12 = 0;
        for (i11 = 1; i11 < i; i11++) {
            long squareWordAddTo = j12 + (squareWordAddTo(iArr, i9, i11, iArr2, i10) & 4294967295L) + (iArr2[i16] & 4294967295L);
            int i17 = i16 + 1;
            iArr2[i16] = (int) squareWordAddTo;
            long j13 = (squareWordAddTo >>> 32) + (iArr2[i17] & 4294967295L);
            i16 += 2;
            iArr2[i17] = (int) j13;
            j12 = j13 >>> 32;
        }
        shiftUpBit(i12, iArr2, i10, iArr[i9] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i, int i9, int[] iArr2, int i10) {
        long j10 = iArr[i + i9] & 4294967295L;
        int i11 = 0;
        long j11 = 0;
        int i12 = i10;
        do {
            long j12 = ((iArr[i + i11] & 4294967295L) * j10) + (iArr2[r11] & 4294967295L) + j11;
            iArr2[i9 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
            i11++;
        } while (i11 < i9);
        return (int) j11;
    }

    public static int sub(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            long j11 = ((iArr[i9 + i12] & 4294967295L) - (4294967295L & iArr2[i10 + i12])) + j10;
            iArr3[i11 + i12] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int sub33At(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) - (i9 & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = ((4294967295L & iArr[r4]) - 1) + (j10 >> 32);
        iArr[i10 + 1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10 + 2);
    }

    public static int sub33From(int i, int i9, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - (i9 & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = ((4294967295L & iArr[1]) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 2);
    }

    public static int subBothFrom(int i, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            long j11 = (((iArr3[r4] & 4294967295L) - (iArr[i9 + i12] & 4294967295L)) - (4294967295L & iArr2[i10 + i12])) + j10;
            iArr3[i11 + i12] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subDWordAt(int i, long j10, int[] iArr, int i9) {
        long j11 = (iArr[i9] & 4294967295L) - (j10 & 4294967295L);
        iArr[i9] = (int) j11;
        long j12 = ((4294967295L & iArr[r5]) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i9 + 1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i9 + 2);
    }

    public static int subDWordFrom(int i, long j10, int[] iArr) {
        long j11 = (iArr[0] & 4294967295L) - (j10 & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = ((4294967295L & iArr[1]) - (j10 >>> 32)) + (j11 >> 32);
        iArr[1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 2);
    }

    public static int subFrom(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        long j10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            long j11 = ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i9 + i11])) + j10;
            iArr2[i10 + i11] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subWordAt(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) - (4294967295L & i9);
        iArr[i10] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10 + 1);
    }

    public static int subWordFrom(int i, int i9, int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - (4294967295L & i9);
        iArr[0] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 1);
    }

    public static BigInteger toBigInteger(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = iArr[i9];
            if (i10 != 0) {
                Pack.intToBigEndian(i10, bArr, ((i - 1) - i9) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i, int[] iArr) {
        for (int i9 = 0; i9 < i; i9++) {
            iArr[i9] = 0;
        }
    }

    public static void zero64(int i, long[] jArr) {
        for (int i9 = 0; i9 < i; i9++) {
            jArr[i9] = 0;
        }
    }

    public static int add33At(int i, int i9, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j10 = (iArr[i12] & 4294967295L) + (i9 & 4294967295L);
        iArr[i12] = (int) j10;
        long j11 = (4294967295L & iArr[r0]) + 1 + (j10 >>> 32);
        iArr[i12 + 1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10, i11 + 2);
    }

    public static int add33To(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) + (i9 & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = (4294967295L & iArr[r4]) + 1 + (j10 >>> 32);
        iArr[i10 + 1] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10, 2);
    }

    public static int addBothTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = (iArr[i9] & 4294967295L) + (iArr2[i9] & 4294967295L) + (4294967295L & iArr3[i9]) + j10;
            iArr3[i9] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addDWordAt(int i, long j10, int[] iArr, int i9, int i10) {
        int i11 = i9 + i10;
        long j11 = (iArr[i11] & 4294967295L) + (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        long j12 = (4294967295L & iArr[r0]) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i11 + 1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i9, i10 + 2);
    }

    public static int addDWordTo(int i, long j10, int[] iArr, int i9) {
        long j11 = (iArr[i9] & 4294967295L) + (j10 & 4294967295L);
        iArr[i9] = (int) j11;
        long j12 = (4294967295L & iArr[r5]) + (j10 >>> 32) + (j11 >>> 32);
        iArr[i9 + 1] = (int) j12;
        if ((j12 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i9, 2);
    }

    public static int addTo(int i, int[] iArr, int i9, int[] iArr2, int i10, int i11) {
        long j10 = i11 & 4294967295L;
        for (int i12 = 0; i12 < i; i12++) {
            long j11 = (iArr[i9 + i12] & 4294967295L) + (iArr2[r6] & 4294967295L) + j10;
            iArr2[i10 + i12] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int addWordAt(int i, int i9, int[] iArr, int i10, int i11) {
        long j10 = i9 & 4294967295L;
        long j11 = j10 + (4294967295L & iArr[r7]);
        iArr[i10 + i11] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10, i11 + 1);
    }

    public static int addWordTo(int i, int i9, int[] iArr, int i10) {
        long j10 = (i9 & 4294967295L) + (4294967295L & iArr[i10]);
        iArr[i10] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i10, 1);
    }

    public static int compare(int i, int[] iArr, int[] iArr2) {
        for (int i9 = i - 1; i9 >= 0; i9--) {
            int i10 = iArr[i9] ^ Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE ^ iArr2[i9];
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i);
    }

    public static void copy64(int i, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static int csub(int i, int i9, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (-(i9 & 1)) & 4294967295L;
        long j11 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            long j12 = ((iArr[i10] & 4294967295L) - (iArr2[i10] & j10)) + j11;
            iArr3[i10] = (int) j12;
            j11 = j12 >> 32;
        }
        return (int) j11;
    }

    public static int dec(int i, int[] iArr, int[] iArr2) {
        int i9 = 0;
        while (i9 < i) {
            int i10 = iArr[i9] - 1;
            iArr2[i9] = i10;
            i9++;
            if (i10 != -1) {
                while (i9 < i) {
                    iArr2[i9] = iArr[i9];
                    i9++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i, int[] iArr, int i9, int i10) {
        while (i10 < i) {
            int i11 = i9 + i10;
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
            i10++;
        }
        return -1;
    }

    public static int equalTo(int i, int[] iArr, int i9, int i10) {
        int i11 = i10 ^ iArr[i9];
        for (int i12 = 1; i12 < i; i12++) {
            i11 |= iArr[i9 + i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i, int[] iArr, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 |= iArr[i9 + i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static boolean gte(int i, int[] iArr, int[] iArr2) {
        for (int i9 = i - 1; i9 >= 0; i9--) {
            int i10 = iArr[i9] ^ Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE ^ iArr2[i9];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i, int[] iArr, int[] iArr2) {
        int i9 = 0;
        while (i9 < i) {
            int i10 = iArr[i9] + 1;
            iArr2[i9] = i10;
            i9++;
            if (i10 != 0) {
                while (i9 < i) {
                    iArr2[i9] = iArr[i9];
                    i9++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i9, int i10) {
        while (i10 < i) {
            int i11 = i9 + i10;
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
            i10++;
        }
        return 1;
    }

    public static int lessThan(int i, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            j10 = (((iArr[i9] & 4294967295L) - (4294967295L & iArr2[i9])) + j10) >> 32;
        }
        return (int) j10;
    }

    public static void mul(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i] = mulWord(i, iArr[0], iArr2, iArr3);
        for (int i9 = 1; i9 < i; i9++) {
            iArr3[i9 + i] = mulWordAddTo(i, iArr[i9], iArr2, 0, iArr3, i9);
        }
    }

    public static int mulAddTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long mulWordAddTo = j10 + (mulWordAddTo(i, iArr[i9], iArr2, 0, iArr3, i9) & 4294967295L) + (iArr3[r2] & 4294967295L);
            iArr3[i9 + i] = (int) mulWordAddTo;
            j10 = mulWordAddTo >>> 32;
        }
        return (int) j10;
    }

    public static int mulWord(int i, int i9, int[] iArr, int[] iArr2) {
        long j10 = i9 & 4294967295L;
        long j11 = 0;
        int i10 = 0;
        do {
            long j12 = ((iArr[i10] & 4294967295L) * j10) + j11;
            iArr2[i10] = (int) j12;
            j11 = j12 >>> 32;
            i10++;
        } while (i10 < i);
        return (int) j11;
    }

    public static int shiftDownBit(int i, int[] iArr, int i9, int i10) {
        while (true) {
            i--;
            if (i < 0) {
                return i10 << 31;
            }
            int i11 = i9 + i;
            int i12 = iArr[i11];
            iArr[i11] = (i10 << 31) | (i12 >>> 1);
            i10 = i12;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i9, int i10, int i11) {
        while (true) {
            i--;
            if (i < 0) {
                return i11 << (-i10);
            }
            int i12 = i9 + i;
            int i13 = iArr[i12];
            iArr[i12] = (i11 << (-i10)) | (i13 >>> i10);
            i11 = i13;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i) {
            int i12 = i9 + i11;
            int i13 = iArr[i12];
            iArr[i12] = (i10 >>> 31) | (i13 << 1);
            i11++;
            i10 = i13;
        }
        return i10 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i9, int i10, int i11) {
        int i12 = 0;
        while (i12 < i) {
            int i13 = i9 + i12;
            int i14 = iArr[i13];
            iArr[i13] = (i11 >>> (-i10)) | (i14 << i10);
            i12++;
            i11 = i14;
        }
        return i11 >>> (-i10);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i9, int i10, long j10, long[] jArr2, int i11) {
        int i12 = 0;
        while (i12 < i) {
            long j11 = jArr[i9 + i12];
            jArr2[i11 + i12] = (j10 >>> (-i10)) | (j11 << i10);
            i12++;
            j10 = j11;
        }
        return j10 >>> (-i10);
    }

    public static void square(int i, int[] iArr, int[] iArr2) {
        int i9;
        int i10 = i << 1;
        int i11 = i;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            i11--;
            long j10 = iArr[i11] & 4294967295L;
            long j11 = j10 * j10;
            iArr2[i12 - 1] = (i13 << 31) | ((int) (j11 >>> 33));
            i12 -= 2;
            iArr2[i12] = (int) (j11 >>> 1);
            int i14 = (int) j11;
            if (i11 <= 0) {
                break;
            } else {
                i13 = i14;
            }
        }
        long j12 = 0;
        int i15 = 2;
        for (i9 = 1; i9 < i; i9++) {
            long squareWordAddTo = j12 + (squareWordAddTo(iArr, i9, iArr2) & 4294967295L) + (iArr2[i15] & 4294967295L);
            int i16 = i15 + 1;
            iArr2[i15] = (int) squareWordAddTo;
            long j13 = (squareWordAddTo >>> 32) + (iArr2[i16] & 4294967295L);
            i15 += 2;
            iArr2[i16] = (int) j13;
            j12 = j13 >>> 32;
        }
        shiftUpBit(i10, iArr2, iArr[0] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i, int[] iArr2) {
        long j10 = iArr[i] & 4294967295L;
        long j11 = 0;
        int i9 = 0;
        do {
            long j12 = ((iArr[i9] & 4294967295L) * j10) + (iArr2[r9] & 4294967295L) + j11;
            iArr2[i + i9] = (int) j12;
            j11 = j12 >>> 32;
            i9++;
        } while (i9 < i);
        return (int) j11;
    }

    public static int sub(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = ((iArr[i9] & 4294967295L) - (4294967295L & iArr2[i9])) + j10;
            iArr3[i9] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int sub33At(int i, int i9, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j10 = (iArr[i12] & 4294967295L) - (i9 & 4294967295L);
        iArr[i12] = (int) j10;
        long j11 = ((4294967295L & iArr[r0]) - 1) + (j10 >> 32);
        iArr[i12 + 1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10, i11 + 2);
    }

    public static int sub33From(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) - (i9 & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = ((4294967295L & iArr[r4]) - 1) + (j10 >> 32);
        iArr[i10 + 1] = (int) j11;
        if ((j11 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10, 2);
    }

    public static int subBothFrom(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = (((iArr3[i9] & 4294967295L) - (iArr[i9] & 4294967295L)) - (4294967295L & iArr2[i9])) + j10;
            iArr3[i9] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subDWordAt(int i, long j10, int[] iArr, int i9, int i10) {
        int i11 = i9 + i10;
        long j11 = (iArr[i11] & 4294967295L) - (j10 & 4294967295L);
        iArr[i11] = (int) j11;
        long j12 = ((4294967295L & iArr[r0]) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i11 + 1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i9, i10 + 2);
    }

    public static int subDWordFrom(int i, long j10, int[] iArr, int i9) {
        long j11 = (iArr[i9] & 4294967295L) - (j10 & 4294967295L);
        iArr[i9] = (int) j11;
        long j12 = ((4294967295L & iArr[r5]) - (j10 >>> 32)) + (j11 >> 32);
        iArr[i9 + 1] = (int) j12;
        if ((j12 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i9, 2);
    }

    public static int subFrom(int i, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = ((iArr2[i9] & 4294967295L) - (4294967295L & iArr[i9])) + j10;
            iArr2[i9] = (int) j11;
            j10 = j11 >> 32;
        }
        return (int) j10;
    }

    public static int subWordAt(int i, int i9, int[] iArr, int i10, int i11) {
        long j10 = (iArr[r0] & 4294967295L) - (4294967295L & i9);
        iArr[i10 + i11] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10, i11 + 1);
    }

    public static int subWordFrom(int i, int i9, int[] iArr, int i10) {
        long j10 = (iArr[i10] & 4294967295L) - (4294967295L & i9);
        iArr[i10] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i10, 1);
    }

    public static void zero(int i, int[] iArr, int i9) {
        for (int i10 = 0; i10 < i; i10++) {
            iArr[i9 + i10] = 0;
        }
    }

    public static int addTo(int i, int[] iArr, int[] iArr2) {
        long j10 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            long j11 = (iArr[i9] & 4294967295L) + (4294967295L & iArr2[i9]) + j10;
            iArr2[i9] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    public static int[] copy(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static long[] copy64(int i, long[] jArr) {
        long[] jArr2 = new long[i];
        System.arraycopy(jArr, 0, jArr2, 0, i);
        return jArr2;
    }

    public static int equalTo(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            i11 |= iArr[i9 + i12] ^ iArr2[i10 + i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void mul(int[] iArr, int i, int i9, int[] iArr2, int i10, int i11, int[] iArr3, int i12) {
        iArr3[i12 + i11] = mulWord(i11, iArr[i], iArr2, i10, iArr3, i12);
        for (int i13 = 1; i13 < i9; i13++) {
            int i14 = i12 + i13;
            iArr3[i14 + i11] = mulWordAddTo(i11, iArr[i + i13], iArr2, i10, iArr3, i14);
        }
    }

    public static int shiftDownBit(int i, int[] iArr, int i9, int i10, int[] iArr2, int i11) {
        while (true) {
            i--;
            if (i < 0) {
                return i10 << 31;
            }
            int i12 = iArr[i9 + i];
            iArr2[i11 + i] = (i10 << 31) | (i12 >>> 1);
            i10 = i12;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i9, int i10, int i11, int[] iArr2, int i12) {
        while (true) {
            i--;
            if (i < 0) {
                return i11 << (-i10);
            }
            int i13 = iArr[i9 + i];
            iArr2[i12 + i] = (i11 << (-i10)) | (i13 >>> i10);
            i11 = i13;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i9, int i10, int[] iArr2, int i11) {
        int i12 = 0;
        while (i12 < i) {
            int i13 = iArr[i9 + i12];
            iArr2[i11 + i12] = (i10 >>> 31) | (i13 << 1);
            i12++;
            i10 = i13;
        }
        return i10 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i9, int i10, int i11, int[] iArr2, int i12) {
        int i13 = 0;
        while (i13 < i) {
            int i14 = iArr[i9 + i13];
            iArr2[i12 + i13] = (i11 >>> (-i10)) | (i14 << i10);
            i13++;
            i11 = i14;
        }
        return i11 >>> (-i10);
    }

    public static int equalTo(int i, int[] iArr, int[] iArr2) {
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i9 |= iArr[i10] ^ iArr2[i10];
        }
        return (((i9 >>> 1) | (i9 & 1)) - 1) >> 31;
    }

    public static int shiftDownBit(int i, int[] iArr, int i9, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i9 << 31;
            }
            int i10 = iArr[i];
            iArr2[i] = (i9 << 31) | (i10 >>> 1);
            i9 = i10;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i9, int i10, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i10 << (-i9);
            }
            int i11 = iArr[i];
            iArr2[i] = (i10 << (-i9)) | (i11 >>> i9);
            i10 = i11;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i9, int[] iArr2) {
        int i10 = 0;
        while (i10 < i) {
            int i11 = iArr[i10];
            iArr2[i10] = (i9 >>> 31) | (i11 << 1);
            i10++;
            i9 = i11;
        }
        return i9 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i9, int i10, int[] iArr2) {
        int i11 = 0;
        while (i11 < i) {
            int i12 = iArr[i11];
            iArr2[i11] = (i10 >>> (-i9)) | (i12 << i9);
            i11++;
            i10 = i12;
        }
        return i10 >>> (-i9);
    }
}
