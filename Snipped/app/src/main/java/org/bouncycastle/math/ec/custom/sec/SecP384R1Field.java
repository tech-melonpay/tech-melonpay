package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public class SecP384R1Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25263M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f25264P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, f25264P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f25264P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = ((iArr[1] & 4294967295L) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = (iArr[3] & 4294967295L) + 1 + j12;
        iArr[3] = (int) j14;
        long j15 = (4294967295L & iArr[4]) + 1 + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat.fromBigInteger(384, bigInteger);
        if (fromBigInteger[11] == -1) {
            int[] iArr = f25264P;
            if (Nat.gte(12, fromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, f25264P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f25264P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i9 = 0; i9 < 12; i9++) {
            i |= iArr[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat.create(24);
        Nat384.mul(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, f25264P, iArr, iArr2);
        } else {
            int[] iArr3 = f25264P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, f25264P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = iArr[16] & 4294967295L;
        long j11 = iArr[17] & 4294967295L;
        long j12 = iArr[18] & 4294967295L;
        long j13 = iArr[19] & 4294967295L;
        long j14 = iArr[20] & 4294967295L;
        long j15 = iArr[21] & 4294967295L;
        long j16 = iArr[22] & 4294967295L;
        long j17 = iArr[23] & 4294967295L;
        long j18 = ((iArr[12] & 4294967295L) + j14) - 1;
        long j19 = (iArr[13] & 4294967295L) + j16;
        long j20 = (iArr[14] & 4294967295L) + j16 + j17;
        long j21 = (iArr[15] & 4294967295L) + j17;
        long j22 = j11 + j15;
        long j23 = j15 - j17;
        long j24 = j16 - j17;
        long j25 = j18 + j23;
        long j26 = (iArr[0] & 4294967295L) + j25;
        iArr2[0] = (int) j26;
        long j27 = (((iArr[1] & 4294967295L) + j17) - j18) + j19 + (j26 >> 32);
        iArr2[1] = (int) j27;
        long j28 = (((iArr[2] & 4294967295L) - j15) - j19) + j20 + (j27 >> 32);
        iArr2[2] = (int) j28;
        long j29 = ((iArr[3] & 4294967295L) - j20) + j21 + j25 + (j28 >> 32);
        iArr2[3] = (int) j29;
        long j30 = (((((iArr[4] & 4294967295L) + j10) + j15) + j19) - j21) + j25 + (j29 >> 32);
        iArr2[4] = (int) j30;
        long j31 = ((iArr[5] & 4294967295L) - j10) + j19 + j20 + j22 + (j30 >> 32);
        iArr2[5] = (int) j31;
        long j32 = (((iArr[6] & 4294967295L) + j12) - j11) + j20 + j21 + (j31 >> 32);
        iArr2[6] = (int) j32;
        long j33 = ((((iArr[7] & 4294967295L) + j10) + j13) - j12) + j21 + (j32 >> 32);
        iArr2[7] = (int) j33;
        long j34 = (((((iArr[8] & 4294967295L) + j10) + j11) + j14) - j13) + (j33 >> 32);
        iArr2[8] = (int) j34;
        long j35 = (((iArr[9] & 4294967295L) + j12) - j14) + j22 + (j34 >> 32);
        iArr2[9] = (int) j35;
        long j36 = ((((iArr[10] & 4294967295L) + j12) + j13) - j23) + j24 + (j35 >> 32);
        iArr2[10] = (int) j36;
        long j37 = ((((iArr[11] & 4294967295L) + j13) + j14) - j24) + (j36 >> 32);
        iArr2[11] = (int) j37;
        reduce32((int) ((j37 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = i & 4294967295L;
            long j12 = (iArr[0] & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = ((iArr[1] & 4294967295L) - j11) + (j12 >> 32);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = (iArr[3] & 4294967295L) + j11 + j14;
            iArr[3] = (int) j16;
            long j17 = (4294967295L & iArr[4]) + j11 + (j16 >> 32);
            iArr[4] = (int) j17;
            j10 = j17 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, f25264P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat384.square(iArr2, create);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + 1 + (j10 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = ((iArr[3] & 4294967295L) - 1) + j12;
        iArr[3] = (int) j14;
        long j15 = ((4294967295L & iArr[4]) - 1) + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, f25264P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
