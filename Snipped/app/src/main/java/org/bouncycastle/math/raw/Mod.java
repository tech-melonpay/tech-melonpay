package org.bouncycastle.math.raw;

import java.util.Random;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Integers;

/* loaded from: classes.dex */
public abstract class Mod {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    private static int add30(int i, int[] iArr, int[] iArr2) {
        int i9 = i - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = iArr[i11] + iArr2[i11] + i10;
            iArr[i11] = 1073741823 & i12;
            i10 = i12 >> 30;
        }
        int i13 = iArr[i9] + iArr2[i9] + i10;
        iArr[i9] = i13;
        return i13 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i, int i9, int[] iArr) {
        int i10 = i - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = ((iArr[i12] ^ i9) - i9) + i11;
            iArr[i12] = 1073741823 & i13;
            i11 = i13 >> 30;
        }
        iArr[i10] = ((iArr[i10] ^ i9) - i9) + i11;
    }

    private static void cnormalize30(int i, int i9, int[] iArr, int[] iArr2) {
        int i10 = i - 1;
        int i11 = iArr[i10] >> 31;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = (((iArr[i13] + (iArr2[i13] & i11)) ^ i9) - i9) + i12;
            iArr[i13] = i14 & 1073741823;
            i12 = i14 >> 30;
        }
        int i15 = (((iArr[i10] + (i11 & iArr2[i10])) ^ i9) - i9) + i12;
        iArr[i10] = i15;
        int i16 = i15 >> 31;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            int i19 = iArr[i18] + (iArr2[i18] & i16) + i17;
            iArr[i18] = i19 & 1073741823;
            i17 = i19 >> 30;
        }
        iArr[i10] = iArr[i10] + (i16 & iArr2[i10]) + i17;
    }

    private static void decode30(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        long j10 = 0;
        while (i > 0) {
            while (i11 < Math.min(32, i)) {
                j10 |= iArr[i9] << i11;
                i11 += 30;
                i9++;
            }
            iArr2[i10] = (int) j10;
            j10 >>>= 32;
            i11 -= 32;
            i -= 32;
            i10++;
        }
    }

    private static int divsteps30(int i, int i9, int i10, int[] iArr) {
        int i11 = 1073741824;
        int i12 = 1073741824;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < 30; i15++) {
            int i16 = i >> 31;
            int i17 = -(i10 & 1);
            int i18 = i10 - ((i9 ^ i16) & i17);
            int i19 = i14 - ((i11 ^ i16) & i17);
            int i20 = i12 - ((i13 ^ i16) & i17);
            int i21 = (~i16) & i17;
            i = (i ^ i21) - (i21 - 1);
            i9 += i18 & i21;
            i11 += i19 & i21;
            i13 += i21 & i20;
            i10 = i18 >> 1;
            i14 = i19 >> 1;
            i12 = i20 >> 1;
        }
        iArr[0] = i11;
        iArr[1] = i13;
        iArr[2] = i14;
        iArr[3] = i12;
        return i;
    }

    private static int divsteps30Var(int i, int i9, int i10, int[] iArr) {
        int i11;
        int i12 = i9;
        int i13 = i10;
        int i14 = 1;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 30;
        int i19 = i;
        while (true) {
            int numberOfTrailingZeros = Integers.numberOfTrailingZeros(((-1) << i18) | i13);
            int i20 = i13 >> numberOfTrailingZeros;
            i14 <<= numberOfTrailingZeros;
            i16 <<= numberOfTrailingZeros;
            i19 -= numberOfTrailingZeros;
            i18 -= numberOfTrailingZeros;
            if (i18 <= 0) {
                iArr[0] = i14;
                iArr[1] = i16;
                iArr[2] = i17;
                iArr[3] = i15;
                return i19;
            }
            if (i19 < 0) {
                i19 = -i19;
                int i21 = -i12;
                int i22 = -i14;
                int i23 = -i16;
                int i24 = i19 + 1;
                if (i24 > i18) {
                    i24 = i18;
                }
                i11 = ((-1) >>> (32 - i24)) & 63 & (((i20 * i20) - 2) * i20 * i21);
                i20 = i21;
                i12 = i20;
                int i25 = i17;
                i17 = i22;
                i14 = i25;
                int i26 = i15;
                i15 = i23;
                i16 = i26;
            } else {
                int i27 = i19 + 1;
                if (i27 > i18) {
                    i27 = i18;
                }
                i11 = ((-1) >>> (32 - i27)) & 15 & ((-((((i12 + 1) & 4) << 1) + i12)) * i20);
            }
            i13 = i20 + (i12 * i11);
            i17 += i14 * i11;
            i15 += i11 * i16;
        }
    }

    private static void encode30(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        long j10 = 0;
        while (i > 0) {
            if (i11 < Math.min(30, i)) {
                j10 |= (iArr[i9] & 4294967295L) << i11;
                i11 += 32;
                i9++;
            }
            iArr2[i10] = ((int) j10) & 1073741823;
            j10 >>>= 30;
            i11 -= 30;
            i -= 30;
            i10++;
        }
    }

    private static int getMaximumDivsteps(int i) {
        return ((i * 49) + (i < 46 ? 80 : 47)) / 17;
    }

    public static int inverse32(int i) {
        int i9 = (2 - (i * i)) * i;
        int i10 = (2 - (i * i9)) * i9;
        int i11 = (2 - (i * i10)) * i10;
        return (2 - (i * i11)) * i11;
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int i9 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int inverse32 = inverse32(iArr9[0]);
        int i10 = 0;
        int i11 = 0;
        for (int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros); i11 < maximumDivsteps; maximumDivsteps = maximumDivsteps) {
            int divsteps30 = divsteps30(i10, iArr7[i9], iArr8[i9], iArr4);
            updateDE30(i, iArr5, iArr6, iArr4, inverse32, iArr9);
            updateFG30(i, iArr7, iArr8, iArr4);
            i11 += 30;
            i9 = i9;
            i10 = divsteps30;
        }
        int i12 = i9;
        int i13 = iArr7[i - 1] >> 31;
        cnegate30(i, i13, iArr7);
        cnormalize30(i, i13, iArr5, iArr9);
        decode30(numberOfLeadingZeros, iArr5, i12, iArr3, i12);
        return Nat.equalTo(i, iArr7, 1) & Nat.equalToZero(i, iArr8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        ?? r92 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i);
        int i9 = i - 1;
        int numberOfLeadingZeros2 = (-1) - (Integers.numberOfLeadingZeros(iArr8[i9] | 1) - (((i * 30) + 2) - numberOfLeadingZeros));
        int inverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros);
        int i10 = i;
        int i11 = 0;
        while (!Nat.isZero(i10, iArr8)) {
            if (i11 >= maximumDivsteps) {
                return r92;
            }
            int i12 = i11 + 30;
            int divsteps30Var = divsteps30Var(numberOfLeadingZeros2, iArr7[r92], iArr8[r92], iArr4);
            int[] iArr10 = iArr6;
            int i13 = i10;
            int i14 = maximumDivsteps;
            int[] iArr11 = iArr6;
            ?? r12 = r92;
            updateDE30(i, iArr5, iArr10, iArr4, inverse32, iArr9);
            updateFG30(i13, iArr7, iArr8, iArr4);
            int i15 = i13 - 1;
            int i16 = iArr7[i15];
            int i17 = iArr8[i15];
            int i18 = i13 - 2;
            if (((i18 >> 31) | ((i16 >> 31) ^ i16) | ((i17 >> 31) ^ i17)) == 0) {
                iArr7[i18] = (i16 << 30) | iArr7[i18];
                iArr8[i18] = iArr8[i18] | (i17 << 30);
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            r92 = r12;
            i11 = i12;
            numberOfLeadingZeros2 = divsteps30Var;
            maximumDivsteps = i14;
            iArr6 = iArr11;
        }
        int i19 = i10;
        boolean z10 = r92;
        int i20 = iArr7[i19 - 1] >> 31;
        int i21 = iArr5[i9] >> 31;
        if (i21 < 0) {
            i21 = add30(i, iArr5, iArr9);
        }
        if (i20 < 0) {
            i21 = negate30(i, iArr5);
            negate30(i19, iArr7);
        }
        if (!Nat.isOne(i19, iArr7)) {
            return z10;
        }
        if (i21 < 0) {
            add30(i, iArr5, iArr9);
        }
        decode30(numberOfLeadingZeros, iArr5, z10 ? 1 : 0, iArr3, z10 ? 1 : 0);
        return true;
    }

    private static int negate30(int i, int[] iArr) {
        int i9 = i - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i10 - iArr[i11];
            iArr[i11] = 1073741823 & i12;
            i10 = i12 >> 30;
        }
        int i13 = i10 - iArr[i9];
        iArr[i9] = i13;
        return i13 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] create = Nat.create(length);
        int i = length - 1;
        int i9 = iArr[i];
        int i10 = i9 | (i9 >>> 1);
        int i11 = i10 | (i10 >>> 2);
        int i12 = i11 | (i11 >>> 4);
        int i13 = i12 | (i12 >>> 8);
        int i14 = i13 | (i13 >>> 16);
        do {
            for (int i15 = 0; i15 != length; i15++) {
                create[i15] = random.nextInt();
            }
            create[i] = create[i] & i14;
        } while (Nat.gte(length, create, iArr));
        return create;
    }

    private static void updateDE30(int i, int[] iArr, int[] iArr2, int[] iArr3, int i9, int[] iArr4) {
        int i10 = i;
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = i10 - 1;
        int i16 = iArr[i15] >> 31;
        int i17 = iArr2[i15] >> 31;
        int i18 = (i11 & i16) + (i12 & i17);
        int i19 = (i16 & i13) + (i17 & i14);
        int i20 = iArr4[0];
        long j10 = i11;
        long j11 = iArr[0];
        long j12 = i12;
        long j13 = iArr2[0];
        long j14 = (j12 * j13) + (j10 * j11);
        long j15 = i13;
        long j16 = i14;
        long j17 = (j13 * j16) + (j11 * j15);
        long j18 = i20;
        long j19 = i18 - (((((int) j14) * i9) + i18) & 1073741823);
        long j20 = (j18 * j19) + j14;
        long j21 = i19 - (((((int) j17) * i9) + i19) & 1073741823);
        long j22 = ((j18 * j21) + j17) >> 30;
        long j23 = j20 >> 30;
        int i21 = 1;
        while (i21 < i10) {
            int i22 = iArr4[i21];
            int i23 = iArr[i21];
            int i24 = iArr2[i21];
            long j24 = j21;
            int i25 = i21;
            long j25 = i23;
            long j26 = i24;
            int i26 = i15;
            long j27 = i22;
            long a10 = a.a(j27, j19, (j12 * j26) + (j10 * j25), j23);
            long a11 = a.a(j27, j24, (j26 * j16) + (j25 * j15), j22);
            int i27 = i25 - 1;
            iArr[i27] = ((int) a10) & 1073741823;
            j23 = a10 >> 30;
            iArr2[i27] = ((int) a11) & 1073741823;
            i21 = i25 + 1;
            j22 = a11 >> 30;
            i15 = i26;
            j21 = j24;
            i10 = i;
        }
        int i28 = i15;
        iArr[i28] = (int) j23;
        iArr2[i28] = (int) j22;
    }

    private static void updateFG30(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i9 = i;
        int i10 = iArr3[0];
        boolean z10 = true;
        int i11 = iArr3[1];
        int i12 = iArr3[2];
        int i13 = iArr3[3];
        long j10 = i10;
        long j11 = iArr[0];
        long j12 = i11;
        long j13 = iArr2[0];
        long j14 = i12;
        long j15 = i13;
        long j16 = ((j12 * j13) + (j10 * j11)) >> 30;
        long j17 = ((j13 * j15) + (j11 * j14)) >> 30;
        int i14 = 1;
        while (i14 < i9) {
            long j18 = iArr[i14];
            long j19 = iArr2[i14];
            long a10 = a.a(j12, j19, j10 * j18, j16);
            long a11 = a.a(j15, j19, j14 * j18, j17);
            int i15 = i14 - 1;
            iArr[i15] = ((int) a10) & 1073741823;
            iArr2[i15] = 1073741823 & ((int) a11);
            j17 = a11 >> 30;
            i14++;
            i9 = i;
            j16 = a10 >> 30;
            j12 = j12;
            z10 = true;
        }
        int i16 = i - 1;
        iArr[i16] = (int) j16;
        iArr2[i16] = (int) j17;
    }
}
