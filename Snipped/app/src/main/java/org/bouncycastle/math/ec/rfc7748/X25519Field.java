package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.asn1.a;
import org.bouncycastle.math.raw.Mod;

/* loaded from: classes.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i9 = iArr[i];
            int i10 = iArr2[i];
            iArr3[i] = i9 + i10;
            iArr4[i] = i9 - i10;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i9 = 0; i9 < 10; i9++) {
            i |= iArr[i9] ^ iArr2[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[5];
        int i14 = iArr[6];
        int i15 = iArr[7];
        int i16 = iArr[8];
        int i17 = iArr[9];
        int i18 = i10 + (i9 >> 26);
        int i19 = i9 & M26;
        int i20 = i12 + (i11 >> 26);
        int i21 = i11 & M26;
        int i22 = i15 + (i14 >> 26);
        int i23 = i14 & M26;
        int i24 = i17 + (i16 >> 26);
        int i25 = i16 & M26;
        int i26 = i21 + (i18 >> 25);
        int i27 = i18 & M25;
        int i28 = i13 + (i20 >> 25);
        int i29 = i20 & M25;
        int i30 = i25 + (i22 >> 25);
        int i31 = i22 & M25;
        int i32 = ((i24 >> 25) * 38) + i;
        int i33 = i24 & M25;
        int i34 = i19 + (i32 >> 26);
        int i35 = i32 & M26;
        int i36 = i23 + (i28 >> 26);
        int i37 = i28 & M26;
        int i38 = i27 + (i34 >> 26);
        int i39 = i34 & M26;
        int i40 = i29 + (i26 >> 26);
        int i41 = i26 & M26;
        int i42 = i31 + (i36 >> 26);
        int i43 = i36 & M26;
        int i44 = i33 + (i30 >> 26);
        int i45 = i30 & M26;
        iArr[0] = i35;
        iArr[1] = i39;
        iArr[2] = i38;
        iArr[3] = i41;
        iArr[4] = i40;
        iArr[5] = i37;
        iArr[6] = i43;
        iArr[7] = i42;
        iArr[8] = i45;
        iArr[9] = i44;
    }

    public static void cmov(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = i10 + i11;
            int i13 = iArr2[i12];
            iArr2[i12] = i13 ^ ((iArr[i9 + i11] ^ i13) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int i9 = 0 - i;
        for (int i10 = 0; i10 < 10; i10++) {
            iArr[i10] = (iArr[i10] ^ i9) - i9;
        }
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i9) {
        for (int i10 = 0; i10 < 10; i10++) {
            iArr2[i9 + i10] = iArr[i + i10];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i) {
        return new int[i * 10];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i9 = 0 - i;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            int i12 = iArr2[i10];
            int i13 = (i11 ^ i12) & i9;
            iArr[i10] = i11 ^ i13;
            iArr2[i10] = i12 ^ i13;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode128(bArr, i, iArr, 0);
        decode128(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i, int[] iArr, int i9) {
        int decode32 = decode32(bArr, i);
        int decode322 = decode32(bArr, i + 4);
        int decode323 = decode32(bArr, i + 8);
        int decode324 = decode32(bArr, i + 12);
        iArr[i9] = decode32 & M26;
        iArr[i9 + 1] = ((decode32 >>> 26) | (decode322 << 6)) & M26;
        iArr[i9 + 2] = ((decode322 >>> 20) | (decode323 << 12)) & M25;
        iArr[i9 + 3] = M26 & ((decode324 << 19) | (decode323 >>> 13));
        iArr[i9 + 4] = decode324 >>> 7;
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode128(iArr, 0, bArr, i);
        encode128(iArr, 5, bArr, i + 16);
    }

    private static void encode128(int[] iArr, int i, byte[] bArr, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        int i12 = iArr[i + 2];
        int i13 = iArr[i + 3];
        int i14 = iArr[i + 4];
        encode32((i11 << 26) | i10, bArr, i9);
        encode32((i11 >>> 6) | (i12 << 20), bArr, i9 + 4);
        encode32((i12 >>> 12) | (i13 << 13), bArr, i9 + 8);
        encode32((i14 << 7) | (i13 >>> 19), bArr, i9 + 12);
    }

    private static void encode32(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 3] = (byte) (i >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i9 = 1; i9 < 10; i9++) {
            i |= iArr[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i9 = 0; i9 < 10; i9++) {
            i |= iArr[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i, int[] iArr2) {
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        long j10 = i;
        long j11 = i11 * j10;
        int i19 = ((int) j11) & M25;
        long j12 = i13 * j10;
        int i20 = ((int) j12) & M25;
        long j13 = i16 * j10;
        int i21 = ((int) j13) & M25;
        long j14 = j13 >> 25;
        long j15 = i18 * j10;
        int i22 = ((int) j15) & M25;
        long j16 = (i9 * j10) + ((j15 >> 25) * 38);
        iArr2[0] = ((int) j16) & M26;
        long j17 = (i14 * j10) + (j12 >> 25);
        iArr2[5] = ((int) j17) & M26;
        long j18 = j17 >> 26;
        long j19 = (i10 * j10) + (j16 >> 26);
        iArr2[1] = ((int) j19) & M26;
        long j20 = j19 >> 26;
        long j21 = (i12 * j10) + (j11 >> 25);
        iArr2[3] = ((int) j21) & M26;
        long j22 = j21 >> 26;
        long j23 = (i15 * j10) + j18;
        iArr2[6] = ((int) j23) & M26;
        long j24 = j23 >> 26;
        long j25 = (i17 * j10) + j14;
        iArr2[8] = M26 & ((int) j25);
        iArr2[2] = i19 + ((int) j20);
        iArr2[4] = i20 + ((int) j22);
        iArr2[7] = i21 + ((int) j24);
        iArr2[9] = i22 + ((int) (j25 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void normalize(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        reduce(iArr, i);
        reduce(iArr, -i);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] create = create();
        sqr(iArr2, create);
        mul(iArr, create, create);
        sqr(create, 2, create);
        mul(iArr2, create, create);
        int[] create2 = create();
        sqr(create, 5, create2);
        mul(create, create2, create2);
        int[] create3 = create();
        sqr(create2, 5, create3);
        mul(create, create3, create3);
        sqr(create3, 10, create);
        mul(create2, create, create);
        sqr(create, 25, create2);
        mul(create, create2, create2);
        sqr(create2, 25, create3);
        mul(create, create3, create3);
        sqr(create3, 50, create);
        mul(create2, create, create);
        sqr(create, 125, create2);
        mul(create, create2, create2);
        sqr(create2, 2, create);
        mul(create, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i) {
        int i9 = M24 & iArr[9];
        long j10 = (((r1 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j10) & M26;
        long j11 = (j10 >> 26) + iArr[1];
        iArr[1] = ((int) j11) & M26;
        long j12 = (j11 >> 26) + iArr[2];
        iArr[2] = ((int) j12) & M25;
        long j13 = (j12 >> 25) + iArr[3];
        iArr[3] = ((int) j13) & M26;
        long j14 = (j13 >> 26) + iArr[4];
        iArr[4] = ((int) j14) & M25;
        long j15 = (j14 >> 25) + iArr[5];
        iArr[5] = ((int) j15) & M26;
        long j16 = (j15 >> 26) + iArr[6];
        iArr[6] = ((int) j16) & M26;
        long j17 = (j16 >> 26) + iArr[7];
        iArr[7] = M25 & ((int) j17);
        long j18 = (j17 >> 25) + iArr[8];
        iArr[8] = M26 & ((int) j18);
        iArr[9] = i9 + ((int) (j18 >> 26));
    }

    public static void sqr(int[] iArr, int i, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = create();
        int[] create2 = create();
        mul(iArr, iArr2, create);
        sqr(iArr2, create2);
        mul(create, create2, create);
        sqr(create2, create2);
        mul(create2, create, create2);
        int[] create3 = create();
        int[] create4 = create();
        powPm5d8(create2, create3, create4);
        mul(create4, create, create4);
        int[] create5 = create();
        sqr(create4, create5);
        mul(create5, iArr2, create5);
        sub(create5, iArr, create3);
        normalize(create3);
        if (isZeroVar(create3)) {
            copy(create4, 0, iArr3, 0);
            return true;
        }
        add(create5, iArr, create3);
        normalize(create3);
        if (!isZeroVar(create3)) {
            return false;
        }
        mul(create4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode128(iArr, i, iArr2, 0);
        decode128(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    private static void decode128(int[] iArr, int i, int[] iArr2, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        int i12 = iArr[i + 2];
        int i13 = iArr[i + 3];
        iArr2[i9] = i10 & M26;
        iArr2[i9 + 1] = ((i10 >>> 26) | (i11 << 6)) & M26;
        iArr2[i9 + 2] = ((i11 >>> 20) | (i12 << 12)) & M25;
        iArr2[i9 + 3] = M26 & ((i13 << 19) | (i12 >>> 13));
        iArr2[i9 + 4] = i13 >>> 7;
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode128(iArr, 0, iArr2, i);
        encode128(iArr, 5, iArr2, i + 4);
    }

    private static void encode128(int[] iArr, int i, int[] iArr2, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        int i12 = iArr[i + 2];
        int i13 = iArr[i + 3];
        int i14 = iArr[i + 4];
        iArr2[i9] = (i11 << 26) | i10;
        iArr2[i9 + 1] = (i11 >>> 6) | (i12 << 20);
        iArr2[i9 + 2] = (i12 >>> 12) | (i13 << 13);
        iArr2[i9 + 3] = (i14 << 7) | (i13 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i9 = iArr2[0];
        int i10 = iArr[1];
        int i11 = iArr2[1];
        int i12 = iArr[2];
        int i13 = iArr2[2];
        int i14 = iArr[3];
        int i15 = iArr2[3];
        int i16 = iArr[4];
        int i17 = iArr2[4];
        int i18 = iArr[5];
        int i19 = iArr2[5];
        int i20 = iArr[6];
        int i21 = iArr2[6];
        int i22 = iArr[7];
        int i23 = iArr2[7];
        int i24 = iArr[8];
        int i25 = iArr2[8];
        int i26 = iArr[9];
        int i27 = iArr2[9];
        long j10 = i;
        long j11 = i9;
        long j12 = j10 * j11;
        long j13 = i11;
        long j14 = i10;
        long j15 = (j14 * j11) + (j10 * j13);
        long j16 = i13;
        long j17 = i12;
        long j18 = (j17 * j11) + (j14 * j13) + (j10 * j16);
        long j19 = j17 * j13;
        long j20 = i15;
        long j21 = j10 * j20;
        long j22 = i14;
        long a10 = a.a(j22, j11, j21, (j19 + (j14 * j16)) << 1);
        long j23 = (j17 * j16) << 1;
        long j24 = i17;
        long j25 = i16;
        long a11 = a.a(j25, j11, (j22 * j13) + (j14 * j20) + (j10 * j24), j23);
        long j26 = ((j25 * j13) + ((j22 * j16) + ((j17 * j20) + (j14 * j24)))) << 1;
        long j27 = (j22 * j20) + (((j25 * j16) + (j17 * j24)) << 1);
        long j28 = (j25 * j20) + (j22 * j24);
        long j29 = (j25 * j24) << 1;
        long j30 = i18;
        long j31 = i19;
        long j32 = j30 * j31;
        long j33 = i21;
        long j34 = i20;
        long j35 = (j34 * j31) + (j30 * j33);
        long j36 = i23;
        long j37 = i22;
        long j38 = (j37 * j31) + (j34 * j33) + (j30 * j36);
        long j39 = j37 * j33;
        long j40 = i25;
        long j41 = i24;
        long a12 = a.a(j41, j31, j30 * j40, (j39 + (j34 * j36)) << 1);
        long j42 = (j37 * j36) << 1;
        long j43 = i27;
        long j44 = i26;
        long a13 = a.a(j44, j31, (j41 * j33) + (j34 * j40) + (j30 * j43), j42);
        long j45 = (j44 * j33) + (j41 * j36) + (j37 * j40) + (j34 * j43);
        long j46 = j12 - (j45 * 76);
        long j47 = j15 - (((j41 * j40) + (((j44 * j36) + (j37 * j43)) << 1)) * 38);
        long j48 = j18 - (((j40 * j44) + (j41 * j43)) * 38);
        long j49 = a10 - ((j44 * j43) * 76);
        long j50 = j26 - j32;
        long j51 = j27 - j35;
        long j52 = j28 - j38;
        long j53 = j29 - a12;
        int i28 = i + i18;
        int i29 = i9 + i19;
        int i30 = i10 + i20;
        int i31 = i11 + i21;
        int i32 = i12 + i22;
        int i33 = i13 + i23;
        int i34 = i14 + i24;
        int i35 = i15 + i25;
        int i36 = i16 + i26;
        int i37 = i17 + i27;
        long j54 = i28;
        long j55 = i29;
        long j56 = j54 * j55;
        long j57 = i31;
        long j58 = i30;
        long j59 = (j58 * j55) + (j54 * j57);
        long j60 = i33;
        long j61 = i32;
        long j62 = (j61 * j55) + (j58 * j57) + (j54 * j60);
        long j63 = i35;
        long j64 = i34;
        long a14 = a.a(j64, j55, j54 * j63, ((j61 * j57) + (j58 * j60)) << 1);
        long j65 = (j61 * j60) << 1;
        long j66 = i37;
        long j67 = (j64 * j57) + (j58 * j63) + (j54 * j66);
        long j68 = i36;
        long a15 = a.a(j68, j55, j67, j65);
        long j69 = ((j57 * j68) + ((j64 * j60) + ((j61 * j63) + (j58 * j66)))) << 1;
        long j70 = (j64 * j63) + (((j68 * j60) + (j61 * j66)) << 1);
        long j71 = (j63 * j68) + (j64 * j66);
        long j72 = (j68 * j66) << 1;
        long j73 = (a14 - j49) + j53;
        int i38 = ((int) j73) & M26;
        long j74 = ((a15 - a11) - a13) + (j73 >> 26);
        int i39 = ((int) j74) & M25;
        long j75 = ((((j74 >> 25) + j69) - j50) * 38) + j46;
        iArr3[0] = ((int) j75) & M26;
        long j76 = ((j70 - j51) * 38) + j47 + (j75 >> 26);
        iArr3[1] = ((int) j76) & M26;
        long j77 = ((j71 - j52) * 38) + j48 + (j76 >> 26);
        iArr3[2] = ((int) j77) & M25;
        long j78 = ((j72 - j53) * 38) + j49 + (j77 >> 25);
        iArr3[3] = ((int) j78) & M26;
        long a16 = a.a(a13, 38L, a11, j78 >> 26);
        iArr3[4] = ((int) a16) & M25;
        long j79 = (j56 - j46) + j50 + (a16 >> 25);
        iArr3[5] = ((int) j79) & M26;
        long j80 = (j59 - j47) + j51 + (j79 >> 26);
        iArr3[6] = ((int) j80) & M26;
        long j81 = (j62 - j48) + j52 + (j80 >> 26);
        iArr3[7] = M25 & ((int) j81);
        long j82 = (j81 >> 25) + i38;
        iArr3[8] = ((int) j82) & M26;
        iArr3[9] = i39 + ((int) (j82 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[5];
        int i14 = iArr[6];
        int i15 = iArr[7];
        int i16 = iArr[8];
        int i17 = iArr[9];
        long j10 = i;
        long j11 = j10 * j10;
        long j12 = i9 * 2;
        long j13 = j10 * j12;
        long j14 = i10 * 2;
        long j15 = i9;
        long j16 = (j15 * j15) + (j10 * j14);
        long j17 = i11 * 2;
        long j18 = (j10 * j17) + (j12 * j14);
        long j19 = i12 * 2;
        long j20 = (j15 * j17) + (j10 * j19) + (i10 * j14);
        long j21 = (j17 * j14) + (j12 * j19);
        long j22 = i11;
        long j23 = (j22 * j22) + (j14 * j19);
        long j24 = j22 * j19;
        long j25 = i12 * j19;
        long j26 = i13;
        long j27 = j26 * j26;
        long j28 = i14 * 2;
        long j29 = j26 * j28;
        long j30 = i15 * 2;
        long j31 = i14;
        long j32 = (j31 * j31) + (j26 * j30);
        long j33 = i16 * 2;
        long j34 = (j26 * j33) + (j28 * j30);
        long j35 = i17 * 2;
        long j36 = (j31 * j33) + (j26 * j35) + (i15 * j30);
        long j37 = i16;
        long j38 = j11 - (((j33 * j30) + (j28 * j35)) * 38);
        long j39 = j13 - (((j37 * j37) + (j30 * j35)) * 38);
        long j40 = j16 - ((j37 * j35) * 38);
        long j41 = j18 - ((i17 * j35) * 38);
        long j42 = j21 - j27;
        long j43 = j23 - j29;
        long j44 = j24 - j32;
        long j45 = j25 - j34;
        int i18 = i9 + i14;
        int i19 = i10 + i15;
        int i20 = i11 + i16;
        int i21 = i12 + i17;
        long j46 = i + i13;
        long j47 = i18 * 2;
        long j48 = j46 * j47;
        long j49 = i19 * 2;
        long j50 = i18;
        long j51 = (j50 * j50) + (j46 * j49);
        long j52 = i20 * 2;
        long j53 = (j46 * j52) + (j47 * j49);
        long j54 = i21 * 2;
        long j55 = (j50 * j52) + (j46 * j54) + (i19 * j49);
        long j56 = (j52 * j49) + (j47 * j54);
        long j57 = i20;
        long j58 = (j57 * j57) + (j49 * j54);
        long j59 = j57 * j54;
        long j60 = i21 * j54;
        long j61 = (j53 - j41) + j45;
        int i22 = ((int) j61) & M26;
        long j62 = ((j55 - j20) - j36) + (j61 >> 26);
        int i23 = ((int) j62) & M25;
        long j63 = ((((j62 >> 25) + j56) - j42) * 38) + j38;
        iArr2[0] = ((int) j63) & M26;
        long j64 = ((j58 - j43) * 38) + j39 + (j63 >> 26);
        iArr2[1] = ((int) j64) & M26;
        long j65 = ((j59 - j44) * 38) + j40 + (j64 >> 26);
        iArr2[2] = ((int) j65) & M25;
        long j66 = ((j60 - j45) * 38) + j41 + (j65 >> 25);
        iArr2[3] = ((int) j66) & M26;
        long a10 = a.a(j36, 38L, j20, j66 >> 26);
        iArr2[4] = ((int) a10) & M25;
        long j67 = ((j46 * j46) - j38) + j42 + (a10 >> 25);
        iArr2[5] = ((int) j67) & M26;
        long j68 = (j48 - j39) + j43 + (j67 >> 26);
        iArr2[6] = ((int) j68) & M26;
        long j69 = (j51 - j40) + j44 + (j68 >> 26);
        iArr2[7] = M25 & ((int) j69);
        long j70 = (j69 >> 25) + i22;
        iArr2[8] = ((int) j70) & M26;
        iArr2[9] = i23 + ((int) (j70 >> 26));
    }
}
