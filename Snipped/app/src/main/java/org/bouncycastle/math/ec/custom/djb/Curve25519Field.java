package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public class Curve25519Field {

    /* renamed from: M, reason: collision with root package name */
    private static final long f25204M = 4294967295L;

    /* renamed from: P7, reason: collision with root package name */
    private static final int f25206P7 = Integer.MAX_VALUE;
    private static final int PInv = 19;

    /* renamed from: P, reason: collision with root package name */
    static final int[] f25205P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.add(iArr, iArr2, iArr3);
        if (Nat256.gte(iArr3, f25205P)) {
            subPFrom(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat.add(16, iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        Nat.inc(8, iArr, iArr2);
        if (Nat256.gte(iArr2, f25205P)) {
            subPFrom(iArr2);
        }
    }

    private static int addPExtTo(int[] iArr) {
        int[] iArr2 = PExt;
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = Nat.incAt(8, iArr, 1);
        }
        long j12 = ((iArr[8] & 4294967295L) - 19) + j11;
        iArr[8] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            j13 = Nat.decAt(15, iArr, 9);
        }
        long j14 = (iArr[15] & 4294967295L) + (4294967295L & (iArr2[15] + 1)) + j13;
        iArr[15] = (int) j14;
        return (int) (j14 >> 32);
    }

    private static int addPTo(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = Nat.decAt(7, iArr, 1);
        }
        long j12 = (4294967295L & iArr[7]) + 2147483648L + j11;
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = f25205P;
            if (!Nat256.gte(fromBigInteger, iArr)) {
                return fromBigInteger;
            }
            Nat256.subFrom(iArr, fromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat256.add(iArr, f25205P, iArr2);
            Nat.shiftDownBit(8, iArr2, 0);
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(f25205P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            i |= iArr[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(f25205P, iArr, iArr2);
        } else {
            int[] iArr3 = f25205P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (Nat.lessThan(8, iArr, f25205P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        Nat.shiftUpBit(8, iArr, 8, i, iArr2, 0);
        int mulByWordAddTo = Nat256.mulByWordAddTo(19, iArr, iArr2) << 1;
        int i9 = iArr2[7];
        iArr2[7] = Nat.addWordTo(7, (((i9 >>> 31) - (i >>> 31)) + mulByWordAddTo) * 19, iArr2) + (Integer.MAX_VALUE & i9);
        if (Nat256.gte(iArr2, f25205P)) {
            subPFrom(iArr2);
        }
    }

    public static void reduce27(int i, int[] iArr) {
        int i9 = iArr[7];
        iArr[7] = Nat.addWordTo(7, ((i << 1) | (i9 >>> 31)) * 19, iArr) + (i9 & Integer.MAX_VALUE);
        if (Nat256.gte(iArr, f25205P)) {
            subPFrom(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] createExt = Nat256.createExt();
        Nat256.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat256.square(iArr2, createExt);
            }
        }
    }

    private static int subPExtFrom(int[] iArr) {
        int[] iArr2 = PExt;
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = Nat.decAt(8, iArr, 1);
        }
        long j12 = (iArr[8] & 4294967295L) + 19 + j11;
        iArr[8] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            j13 = Nat.incAt(15, iArr, 9);
        }
        long j14 = ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1))) + j13;
        iArr[15] = (int) j14;
        return (int) (j14 >> 32);
    }

    private static int subPFrom(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = Nat.incAt(7, iArr, 1);
        }
        long j12 = ((4294967295L & iArr[7]) - 2147483648L) + j11;
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            addPTo(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            addPExtTo(iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (Nat256.gte(iArr2, f25205P)) {
            subPFrom(iArr2);
        }
    }
}
