package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.math.raw.Mod;
import org.jmrtd.PassportService;

/* loaded from: classes.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i9 = 0; i9 < 16; i9++) {
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
        int i18 = iArr[10];
        int i19 = iArr[11];
        int i20 = iArr[12];
        int i21 = iArr[13];
        int i22 = iArr[14];
        int i23 = iArr[15];
        int i24 = i9 + (i >>> 28);
        int i25 = i & M28;
        int i26 = i13 + (i12 >>> 28);
        int i27 = i12 & M28;
        int i28 = i17 + (i16 >>> 28);
        int i29 = i16 & M28;
        int i30 = i21 + (i20 >>> 28);
        int i31 = i20 & M28;
        int i32 = i10 + (i24 >>> 28);
        int i33 = i24 & M28;
        int i34 = i14 + (i26 >>> 28);
        int i35 = i26 & M28;
        int i36 = i18 + (i28 >>> 28);
        int i37 = i28 & M28;
        int i38 = i22 + (i30 >>> 28);
        int i39 = i30 & M28;
        int i40 = i11 + (i32 >>> 28);
        int i41 = i32 & M28;
        int i42 = i15 + (i34 >>> 28);
        int i43 = i34 & M28;
        int i44 = i19 + (i36 >>> 28);
        int i45 = i36 & M28;
        int i46 = i23 + (i38 >>> 28);
        int i47 = i38 & M28;
        int i48 = i46 >>> 28;
        int i49 = i46 & M28;
        int i50 = i25 + i48;
        int i51 = i27 + (i40 >>> 28);
        int i52 = i40 & M28;
        int i53 = i29 + i48 + (i42 >>> 28);
        int i54 = i42 & M28;
        int i55 = i31 + (i44 >>> 28);
        int i56 = i44 & M28;
        int i57 = i33 + (i50 >>> 28);
        int i58 = i50 & M28;
        int i59 = i35 + (i51 >>> 28);
        int i60 = i51 & M28;
        int i61 = i37 + (i53 >>> 28);
        int i62 = i53 & M28;
        int i63 = i39 + (i55 >>> 28);
        int i64 = i55 & M28;
        iArr[0] = i58;
        iArr[1] = i57;
        iArr[2] = i41;
        iArr[3] = i52;
        iArr[4] = i60;
        iArr[5] = i59;
        iArr[6] = i43;
        iArr[7] = i54;
        iArr[8] = i62;
        iArr[9] = i61;
        iArr[10] = i45;
        iArr[11] = i56;
        iArr[12] = i64;
        iArr[13] = i63;
        iArr[14] = i47;
        iArr[15] = i49;
    }

    public static void cmov(int i, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = i10 + i11;
            int i13 = iArr2[i12];
            iArr2[i12] = i13 ^ ((iArr[i9 + i11] ^ i13) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int[] create = create();
        sub(create, iArr, create);
        cmov(-i, create, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i9) {
        for (int i10 = 0; i10 < 16; i10++) {
            iArr2[i9 + i10] = iArr[i + i10];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i) {
        return new int[i * 16];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i9 = 0 - i;
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = iArr[i10];
            int i12 = iArr2[i10];
            int i13 = (i11 ^ i12) & i9;
            iArr[i10] = i11 ^ i13;
            iArr2[i10] = i12 ^ i13;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode56(bArr, i, iArr, 0);
        decode56(bArr, i + 7, iArr, 2);
        decode56(bArr, i + 14, iArr, 4);
        decode56(bArr, i + 21, iArr, 6);
        decode56(bArr, i + 28, iArr, 8);
        decode56(bArr, i + 35, iArr, 10);
        decode56(bArr, i + 42, iArr, 12);
        decode56(bArr, i + 49, iArr, 14);
    }

    private static void decode224(int[] iArr, int i, int[] iArr2, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        int i12 = iArr[i + 2];
        int i13 = iArr[i + 3];
        int i14 = iArr[i + 4];
        int i15 = iArr[i + 5];
        int i16 = iArr[i + 6];
        iArr2[i9] = i10 & M28;
        iArr2[i9 + 1] = ((i10 >>> 28) | (i11 << 4)) & M28;
        iArr2[i9 + 2] = ((i11 >>> 24) | (i12 << 8)) & M28;
        iArr2[i9 + 3] = ((i12 >>> 20) | (i13 << 12)) & M28;
        iArr2[i9 + 4] = ((i13 >>> 16) | (i14 << 16)) & M28;
        iArr2[i9 + 5] = ((i14 >>> 12) | (i15 << 20)) & M28;
        iArr2[i9 + 6] = M28 & ((i15 >>> 8) | (i16 << 24));
        iArr2[i9 + 7] = i16 >>> 4;
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void decode56(byte[] bArr, int i, int[] iArr, int i9) {
        int decode32 = decode32(bArr, i);
        int decode24 = decode24(bArr, i + 4);
        iArr[i9] = M28 & decode32;
        iArr[i9 + 1] = (decode24 << 4) | (decode32 >>> 28);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode56(iArr, 0, bArr, i);
        encode56(iArr, 2, bArr, i + 7);
        encode56(iArr, 4, bArr, i + 14);
        encode56(iArr, 6, bArr, i + 21);
        encode56(iArr, 8, bArr, i + 28);
        encode56(iArr, 10, bArr, i + 35);
        encode56(iArr, 12, bArr, i + 42);
        encode56(iArr, 14, bArr, i + 49);
    }

    private static void encode224(int[] iArr, int i, int[] iArr2, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        int i12 = iArr[i + 2];
        int i13 = iArr[i + 3];
        int i14 = iArr[i + 4];
        int i15 = iArr[i + 5];
        int i16 = iArr[i + 6];
        int i17 = iArr[i + 7];
        iArr2[i9] = (i11 << 28) | i10;
        iArr2[i9 + 1] = (i11 >>> 4) | (i12 << 24);
        iArr2[i9 + 2] = (i12 >>> 8) | (i13 << 20);
        iArr2[i9 + 3] = (i13 >>> 12) | (i14 << 16);
        iArr2[i9 + 4] = (i14 >>> 16) | (i15 << 12);
        iArr2[i9 + 5] = (i15 >>> 20) | (i16 << 8);
        iArr2[i9 + 6] = (i17 << 4) | (i16 >>> 24);
    }

    private static void encode24(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >>> 8);
        bArr[i9 + 2] = (byte) (i >>> 16);
        bArr[i9 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(int[] iArr, int i, byte[] bArr, int i9) {
        int i10 = iArr[i];
        int i11 = iArr[i + 1];
        encode32((i11 << 28) | i10, bArr, i9);
        encode24(i11 >>> 4, bArr, i9 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i9 = 1; i9 < 16; i9++) {
            i |= iArr[i9];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i9 = 0; i9 < 16; i9++) {
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
        int i19 = iArr[10];
        int i20 = iArr[11];
        int i21 = iArr[12];
        int i22 = iArr[13];
        int i23 = iArr[14];
        int i24 = iArr[15];
        long j10 = i10;
        long j11 = i;
        long j12 = j10 * j11;
        int i25 = ((int) j12) & M28;
        long j13 = i14 * j11;
        int i26 = ((int) j13) & M28;
        long j14 = i18 * j11;
        int i27 = ((int) j14) & M28;
        long j15 = i22 * j11;
        int i28 = ((int) j15) & M28;
        long j16 = (i11 * j11) + (j12 >>> 28);
        iArr2[2] = ((int) j16) & M28;
        long j17 = (i15 * j11) + (j13 >>> 28);
        iArr2[6] = ((int) j17) & M28;
        long j18 = (i19 * j11) + (j14 >>> 28);
        iArr2[10] = ((int) j18) & M28;
        long j19 = (i23 * j11) + (j15 >>> 28);
        iArr2[14] = ((int) j19) & M28;
        long j20 = (i12 * j11) + (j16 >>> 28);
        iArr2[3] = ((int) j20) & M28;
        long j21 = j20 >>> 28;
        long j22 = (i16 * j11) + (j17 >>> 28);
        iArr2[7] = ((int) j22) & M28;
        long j23 = (i20 * j11) + (j18 >>> 28);
        iArr2[11] = ((int) j23) & M28;
        long j24 = j23 >>> 28;
        long j25 = (i24 * j11) + (j19 >>> 28);
        iArr2[15] = ((int) j25) & M28;
        long j26 = j25 >>> 28;
        long j27 = (i13 * j11) + j21;
        iArr2[4] = ((int) j27) & M28;
        long j28 = j27 >>> 28;
        long j29 = (i17 * j11) + (j22 >>> 28) + j26;
        iArr2[8] = ((int) j29) & M28;
        long j30 = j29 >>> 28;
        long j31 = (i21 * j11) + j24;
        iArr2[12] = ((int) j31) & M28;
        long j32 = j31 >>> 28;
        long j33 = (i9 * j11) + j26;
        iArr2[0] = ((int) j33) & M28;
        iArr2[1] = i25 + ((int) (j33 >>> 28));
        iArr2[5] = i26 + ((int) j28);
        iArr2[9] = i27 + ((int) j30);
        iArr2[13] = i28 + ((int) j32);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] create = create();
        sqr(iArr, create);
        mul(iArr, create, create);
        int[] create2 = create();
        sqr(create, create2);
        mul(iArr, create2, create2);
        int[] create3 = create();
        sqr(create2, 3, create3);
        mul(create2, create3, create3);
        int[] create4 = create();
        sqr(create3, 3, create4);
        mul(create2, create4, create4);
        int[] create5 = create();
        sqr(create4, 9, create5);
        mul(create4, create5, create5);
        int[] create6 = create();
        sqr(create5, create6);
        mul(iArr, create6, create6);
        int[] create7 = create();
        sqr(create6, 18, create7);
        mul(create5, create7, create7);
        int[] create8 = create();
        sqr(create7, 37, create8);
        mul(create7, create8, create8);
        int[] create9 = create();
        sqr(create8, 37, create9);
        mul(create7, create9, create9);
        int[] create10 = create();
        sqr(create9, 111, create10);
        mul(create9, create10, create10);
        int[] create11 = create();
        sqr(create10, create11);
        mul(iArr, create11, create11);
        int[] create12 = create();
        sqr(create11, PassportService.DEFAULT_MAX_BLOCKSIZE, create12);
        mul(create12, create10, iArr2);
    }

    private static void reduce(int[] iArr, int i) {
        int i9;
        int i10 = iArr[15];
        int i11 = i10 & M28;
        long j10 = (i10 >>> 28) + i;
        int i12 = 0;
        long j11 = j10;
        while (true) {
            if (i12 >= 8) {
                break;
            }
            long j12 = j11 + (4294967295L & iArr[i12]);
            iArr[i12] = ((int) j12) & M28;
            j11 = j12 >> 28;
            i12++;
        }
        long j13 = j11 + j10;
        for (i9 = 8; i9 < 15; i9++) {
            long j14 = j13 + (iArr[i9] & 4294967295L);
            iArr[i9] = ((int) j14) & M28;
            j13 = j14 >> 28;
        }
        iArr[15] = i11 + ((int) j13);
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
        sqr(iArr, create);
        mul(create, iArr2, create);
        sqr(create, create2);
        mul(create, iArr, create);
        mul(create2, iArr, create2);
        mul(create2, iArr2, create2);
        int[] create3 = create();
        powPm3d4(create2, create3);
        mul(create3, create, create3);
        int[] create4 = create();
        sqr(create3, create4);
        mul(create4, iArr2, create4);
        sub(iArr, create4, create4);
        normalize(create4);
        if (!isZeroVar(create4)) {
            return false;
        }
        copy(create3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i18 = iArr[10];
        int i19 = iArr[11];
        int i20 = iArr[12];
        int i21 = iArr[13];
        int i22 = iArr[14];
        int i23 = iArr[15];
        int i24 = iArr2[0];
        int i25 = iArr2[1];
        int i26 = iArr2[2];
        int i27 = iArr2[3];
        int i28 = iArr2[4];
        int i29 = iArr2[5];
        int i30 = iArr2[6];
        int i31 = iArr2[7];
        int i32 = iArr2[8];
        int i33 = iArr2[9];
        int i34 = iArr2[10];
        int i35 = iArr2[11];
        int i36 = iArr2[12];
        int i37 = iArr2[13];
        int i38 = iArr2[14];
        int i39 = (i9 + 536870910) - i25;
        int i40 = (i13 + 536870910) - i29;
        int i41 = (i17 + 536870910) - i33;
        int i42 = (i21 + 536870910) - i37;
        int i43 = (i23 + 536870910) - iArr2[15];
        int i44 = ((i10 + 536870910) - i26) + (i39 >>> 28);
        int i45 = i39 & M28;
        int i46 = ((i14 + 536870910) - i30) + (i40 >>> 28);
        int i47 = i40 & M28;
        int i48 = ((i18 + 536870910) - i34) + (i41 >>> 28);
        int i49 = i41 & M28;
        int i50 = ((i22 + 536870910) - i38) + (i42 >>> 28);
        int i51 = i42 & M28;
        int i52 = ((i11 + 536870910) - i27) + (i44 >>> 28);
        int i53 = i44 & M28;
        int i54 = ((i15 + 536870910) - i31) + (i46 >>> 28);
        int i55 = i46 & M28;
        int i56 = ((i19 + 536870910) - i35) + (i48 >>> 28);
        int i57 = i48 & M28;
        int i58 = i43 + (i50 >>> 28);
        int i59 = i50 & M28;
        int i60 = i58 >>> 28;
        int i61 = i58 & M28;
        int i62 = ((i + 536870910) - i24) + i60;
        int i63 = ((i12 + 536870910) - i28) + (i52 >>> 28);
        int i64 = i52 & M28;
        int i65 = ((i16 + 536870908) - i32) + i60 + (i54 >>> 28);
        int i66 = i54 & M28;
        int i67 = ((i20 + 536870910) - i36) + (i56 >>> 28);
        int i68 = i56 & M28;
        int i69 = i45 + (i62 >>> 28);
        int i70 = i62 & M28;
        int i71 = i47 + (i63 >>> 28);
        int i72 = i63 & M28;
        int i73 = i49 + (i65 >>> 28);
        int i74 = i65 & M28;
        int i75 = i51 + (i67 >>> 28);
        int i76 = i67 & M28;
        iArr3[0] = i70;
        iArr3[1] = i69;
        iArr3[2] = i53;
        iArr3[3] = i64;
        iArr3[4] = i72;
        iArr3[5] = i71;
        iArr3[6] = i55;
        iArr3[7] = i66;
        iArr3[8] = i74;
        iArr3[9] = i73;
        iArr3[10] = i57;
        iArr3[11] = i68;
        iArr3[12] = i76;
        iArr3[13] = i75;
        iArr3[14] = i59;
        iArr3[15] = i61;
    }

    public static void subOne(int[] iArr) {
        int[] create = create();
        create[0] = 1;
        sub(iArr, create, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode224(iArr, i, iArr2, 0);
        decode224(iArr, i + 7, iArr2, 8);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode224(iArr, 0, iArr2, i);
        encode224(iArr, 8, iArr2, i + 7);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i18 = iArr[10];
        int i19 = iArr[11];
        int i20 = iArr[12];
        int i21 = iArr[13];
        int i22 = iArr[14];
        int i23 = iArr[15];
        int i24 = iArr2[0];
        int i25 = iArr2[1];
        int i26 = iArr2[2];
        int i27 = iArr2[3];
        int i28 = iArr2[4];
        int i29 = iArr2[5];
        int i30 = iArr2[6];
        int i31 = iArr2[7];
        int i32 = iArr2[8];
        int i33 = iArr2[9];
        int i34 = iArr2[10];
        int i35 = iArr2[11];
        int i36 = iArr2[12];
        int i37 = iArr2[13];
        int i38 = iArr2[14];
        int i39 = iArr2[15];
        int i40 = i + i16;
        int i41 = i10 + i18;
        int i42 = i11 + i19;
        int i43 = i12 + i20;
        int i44 = i13 + i21;
        int i45 = i14 + i22;
        int i46 = i24 + i32;
        int i47 = i25 + i33;
        int i48 = i26 + i34;
        int i49 = i27 + i35;
        int i50 = i28 + i36;
        int i51 = i29 + i37;
        int i52 = i30 + i38;
        int i53 = i31 + i39;
        long j10 = i;
        long j11 = i24;
        long j12 = j10 * j11;
        long j13 = i15;
        long j14 = i25;
        long j15 = j13 * j14;
        long j16 = i14;
        long j17 = i26;
        long j18 = (j16 * j17) + j15;
        long j19 = i13;
        long j20 = i27;
        long j21 = (j19 * j20) + j18;
        long j22 = i12;
        long j23 = i28;
        long j24 = (j22 * j23) + j21;
        long j25 = i11;
        long j26 = i29;
        long j27 = (j25 * j26) + j24;
        long j28 = i10;
        long j29 = i30;
        long j30 = (j28 * j29) + j27;
        long j31 = i9;
        long j32 = i31;
        long j33 = (j31 * j32) + j30;
        long j34 = i16;
        long j35 = i32;
        long j36 = j34 * j35;
        long j37 = i23;
        long j38 = i33;
        long j39 = j37 * j38;
        long j40 = i22;
        long j41 = i34;
        long j42 = (j40 * j41) + j39;
        long j43 = i21;
        long j44 = i35;
        long j45 = (j43 * j44) + j42;
        long j46 = i20;
        long j47 = i36;
        long j48 = (j46 * j47) + j45;
        long j49 = i19;
        long j50 = i37;
        long j51 = (j49 * j50) + j48;
        long j52 = i18;
        long j53 = i38;
        long j54 = (j52 * j53) + j51;
        long j55 = i17;
        long j56 = i39;
        long j57 = (j55 * j56) + j54;
        long j58 = i40;
        long j59 = i46;
        long j60 = j58 * j59;
        long j61 = i15 + i23;
        long j62 = i47;
        long j63 = j61 * j62;
        long j64 = i45;
        long j65 = i48;
        long j66 = (j64 * j65) + j63;
        long j67 = i44;
        long j68 = i49;
        long j69 = (j67 * j68) + j66;
        long j70 = i43;
        long j71 = i50;
        long j72 = (j70 * j71) + j69;
        long j73 = i42;
        long j74 = i51;
        long j75 = (j73 * j74) + j72;
        long j76 = i41;
        long j77 = i52;
        long j78 = (j76 * j77) + j75;
        long j79 = i9 + i17;
        long j80 = i53;
        long j81 = (j79 * j80) + j78;
        long j82 = ((j12 + j36) + j81) - j33;
        int i54 = ((int) j82) & M28;
        long j83 = j82 >>> 28;
        long j84 = ((j57 + j60) - j12) + j81;
        int i55 = ((int) j84) & M28;
        long j85 = (j10 * j14) + (j31 * j11);
        long j86 = (j52 * j56) + (j49 * j53) + (j46 * j50) + (j43 * j47) + (j40 * j44) + (j37 * j41);
        long j87 = (j58 * j62) + (j79 * j59);
        long j88 = (j76 * j80) + (j73 * j77) + (j70 * j74) + (j67 * j71) + (j64 * j68) + (j61 * j65);
        long j89 = (((j85 + ((j34 * j38) + (j55 * j35))) + j88) - ((j28 * j32) + ((j25 * j29) + ((j22 * j26) + ((j19 * j23) + ((j16 * j20) + (j13 * j17))))))) + j83;
        int i56 = ((int) j89) & M28;
        long j90 = ((j86 + j87) - j85) + j88 + (j84 >>> 28);
        int i57 = ((int) j90) & M28;
        long j91 = (j10 * j17) + (j31 * j14) + (j28 * j11);
        long j92 = (j49 * j56) + (j46 * j53) + (j43 * j50) + (j40 * j47) + (j37 * j44);
        long j93 = (j58 * j65) + (j79 * j62) + (j76 * j59);
        long j94 = (j73 * j80) + (j70 * j77) + (j67 * j74) + (j64 * j71) + (j61 * j68);
        long j95 = (((j91 + ((j34 * j41) + ((j55 * j38) + (j52 * j35)))) + j94) - ((j25 * j32) + ((j22 * j29) + ((j19 * j26) + ((j16 * j23) + (j13 * j20)))))) + (j89 >>> 28);
        int i58 = ((int) j95) & M28;
        long j96 = ((j92 + j93) - j91) + j94 + (j90 >>> 28);
        int i59 = ((int) j96) & M28;
        long j97 = (j10 * j20) + (j31 * j17) + (j28 * j14) + (j25 * j11);
        long j98 = (j46 * j56) + (j43 * j53) + (j40 * j50) + (j37 * j47);
        long j99 = (j58 * j68) + (j79 * j65) + (j76 * j62) + (j73 * j59);
        long j100 = (j70 * j80) + (j67 * j77) + (j64 * j74) + (j61 * j71);
        long j101 = (((j97 + ((j34 * j44) + ((j55 * j41) + ((j52 * j38) + (j49 * j35))))) + j100) - ((j22 * j32) + ((j19 * j29) + ((j16 * j26) + (j13 * j23))))) + (j95 >>> 28);
        int i60 = ((int) j101) & M28;
        long j102 = ((j98 + j99) - j97) + j100 + (j96 >>> 28);
        int i61 = ((int) j102) & M28;
        long j103 = (j10 * j23) + (j31 * j20) + (j28 * j17) + (j25 * j14) + (j22 * j11);
        long j104 = (j43 * j56) + (j40 * j53) + (j37 * j50);
        long j105 = (j58 * j71) + (j79 * j68) + (j76 * j65) + (j73 * j62) + (j70 * j59);
        long j106 = (j67 * j80) + (j64 * j77) + (j61 * j74);
        long j107 = (((j103 + ((j34 * j47) + ((j55 * j44) + ((j52 * j41) + ((j49 * j38) + (j46 * j35)))))) + j106) - ((j19 * j32) + ((j16 * j29) + (j13 * j26)))) + (j101 >>> 28);
        int i62 = ((int) j107) & M28;
        long j108 = ((j104 + j105) - j103) + j106 + (j102 >>> 28);
        int i63 = ((int) j108) & M28;
        long j109 = (j10 * j26) + (j31 * j23) + (j28 * j20) + (j25 * j17) + (j22 * j14) + (j19 * j11);
        long j110 = (j40 * j56) + (j37 * j53);
        long j111 = (j58 * j74) + (j79 * j71) + (j76 * j68) + (j73 * j65) + (j70 * j62) + (j67 * j59);
        long j112 = (j64 * j80) + (j61 * j77);
        long j113 = (((j109 + ((j34 * j50) + ((j55 * j47) + ((j52 * j44) + ((j49 * j41) + ((j46 * j38) + (j43 * j35))))))) + j112) - ((j16 * j32) + (j13 * j29))) + (j107 >>> 28);
        int i64 = ((int) j113) & M28;
        long j114 = ((j110 + j111) - j109) + j112 + (j108 >>> 28);
        int i65 = ((int) j114) & M28;
        long j115 = (j10 * j29) + (j31 * j26) + (j28 * j23) + (j25 * j20) + (j22 * j17) + (j19 * j14) + (j16 * j11);
        long j116 = j37 * j56;
        long j117 = (j58 * j77) + (j79 * j74) + (j76 * j71) + (j73 * j68) + (j70 * j65) + (j67 * j62) + (j64 * j59);
        long j118 = j61 * j80;
        long j119 = (((j115 + ((j34 * j53) + ((j55 * j50) + ((j52 * j47) + ((j49 * j44) + ((j46 * j41) + ((j43 * j38) + (j40 * j35)))))))) + j118) - (j13 * j32)) + (j113 >>> 28);
        int i66 = ((int) j119) & M28;
        long j120 = ((j116 + j117) - j115) + j118 + (j114 >>> 28);
        int i67 = ((int) j120) & M28;
        long j121 = (j10 * j32) + (j31 * j29) + (j28 * j26) + (j25 * j23) + (j22 * j20) + (j19 * j17) + (j14 * j16) + (j11 * j13);
        long j122 = (j34 * j56) + (j55 * j53) + (j52 * j50) + (j49 * j47) + (j46 * j44) + (j41 * j43) + (j38 * j40) + (j37 * j35);
        long j123 = j121 + j122 + (j119 >>> 28);
        int i68 = ((int) j123) & M28;
        long j124 = (((j58 * j80) + ((j79 * j77) + ((j76 * j74) + ((j73 * j71) + ((j70 * j68) + ((j67 * j65) + ((j64 * j62) + (j61 * j59)))))))) - j121) + (j120 >>> 28);
        int i69 = ((int) j124) & M28;
        long j125 = j124 >>> 28;
        long j126 = (j123 >>> 28) + j125 + i55;
        int i70 = ((int) j126) & M28;
        long j127 = j125 + i54;
        iArr3[0] = ((int) j127) & M28;
        iArr3[1] = i56 + ((int) (j127 >>> 28));
        iArr3[2] = i58;
        iArr3[3] = i60;
        iArr3[4] = i62;
        iArr3[5] = i64;
        iArr3[6] = i66;
        iArr3[7] = i68;
        iArr3[8] = i70;
        iArr3[9] = i57 + ((int) (j126 >>> 28));
        iArr3[10] = i59;
        iArr3[11] = i61;
        iArr3[12] = i63;
        iArr3[13] = i65;
        iArr3[14] = i67;
        iArr3[15] = i69;
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
        int i18 = iArr[10];
        int i19 = iArr[11];
        int i20 = iArr[12];
        int i21 = iArr[13];
        int i22 = iArr[14];
        int i23 = iArr[15];
        int i24 = i * 2;
        int i25 = i9 * 2;
        int i26 = i10 * 2;
        int i27 = i11 * 2;
        int i28 = i12 * 2;
        int i29 = i13 * 2;
        int i30 = i14 * 2;
        int i31 = i16 * 2;
        int i32 = i17 * 2;
        int i33 = i18 * 2;
        int i34 = i19 * 2;
        int i35 = i20 * 2;
        int i36 = i21 * 2;
        int i37 = i22 * 2;
        int i38 = i + i16;
        int i39 = i9 + i17;
        int i40 = i10 + i18;
        int i41 = i11 + i19;
        int i42 = i12 + i20;
        int i43 = i13 + i21;
        int i44 = i14 + i22;
        int i45 = i15 + i23;
        int i46 = i38 * 2;
        int i47 = i39 * 2;
        int i48 = i40 * 2;
        int i49 = i41 * 2;
        int i50 = i43 * 2;
        long j10 = i;
        long j11 = j10 * j10;
        long j12 = i15;
        long j13 = i25;
        long j14 = j12 * j13;
        long j15 = i14;
        long j16 = i26;
        long j17 = (j15 * j16) + j14;
        long j18 = i13;
        long j19 = i27;
        long j20 = i12;
        long j21 = (j20 * j20) + (j18 * j19) + j17;
        long j22 = i16;
        long j23 = i23;
        long j24 = i32;
        long j25 = j23 * j24;
        long j26 = i22;
        long j27 = i33;
        long j28 = (j26 * j27) + j25;
        long j29 = i21;
        long j30 = i34;
        long j31 = (j29 * j30) + j28;
        long j32 = i20;
        long j33 = i38;
        long j34 = i45;
        long j35 = i47 & 4294967295L;
        long j36 = j34 * j35;
        long j37 = i44;
        long j38 = i48 & 4294967295L;
        long j39 = (j37 * j38) + j36;
        long j40 = i43;
        long j41 = i49 & 4294967295L;
        long j42 = (j40 * j41) + j39;
        long j43 = i42;
        long j44 = (j43 * j43) + j42;
        long j45 = ((j11 + (j22 * j22)) + j44) - j21;
        int i51 = ((int) j45) & M28;
        long j46 = ((((j32 * j32) + j31) + (j33 * j33)) - j11) + j44;
        int i52 = ((int) j46) & M28;
        long j47 = j46 >>> 28;
        long j48 = i9;
        long j49 = i24;
        long j50 = j48 * j49;
        long j51 = j15 * j19;
        long j52 = i28;
        long j53 = j18 * j52;
        long j54 = i17;
        long j55 = i31;
        long j56 = j54 * j55;
        long j57 = (j26 * j30) + (j23 * j27);
        long j58 = i35;
        long j59 = (j29 * j58) + j57;
        long j60 = i39;
        long j61 = i46 & 4294967295L;
        long j62 = (j37 * j41) + (j34 * j38);
        long j63 = (i42 * 2) & 4294967295L;
        long j64 = (j40 * j63) + j62;
        long j65 = (((j50 + j56) + j64) - (j53 + (j51 + (j12 * j16)))) + (j45 >>> 28);
        int i53 = ((int) j65) & M28;
        long j66 = ((j59 + (j60 * j61)) - j50) + j64 + j47;
        int i54 = ((int) j66) & M28;
        long j67 = j66 >>> 28;
        long j68 = i10;
        long j69 = (j48 * j48) + (j68 * j49);
        long j70 = i18;
        long j71 = (j54 * j54) + (j70 * j55);
        long j72 = i40;
        long j73 = (j40 * j40) + (j37 * j63) + (j34 * j41);
        long j74 = (((j69 + j71) + j73) - ((j18 * j18) + ((j15 * j52) + (j12 * j19)))) + (j65 >>> 28);
        int i55 = ((int) j74) & M28;
        long j75 = ((((j29 * j29) + ((j26 * j58) + (j23 * j30))) + ((j60 * j60) + (j72 * j61))) - j69) + j73 + j67;
        int i56 = ((int) j75) & M28;
        long j76 = i11;
        long j77 = (j68 * j13) + (j76 * j49);
        long j78 = i29;
        long j79 = i19;
        long j80 = (j70 * j24) + (j79 * j55);
        long j81 = i36;
        long j82 = j26 * j81;
        long j83 = i41;
        long j84 = j72 * j35;
        long j85 = j63 * j34;
        long j86 = i50 & 4294967295L;
        long j87 = (j37 * j86) + j85;
        long j88 = (((j77 + j80) + j87) - ((j15 * j78) + (j12 * j52))) + (j74 >>> 28);
        int i57 = ((int) j88) & M28;
        long j89 = j88 >>> 28;
        long j90 = (((j82 + (j23 * j58)) + (j84 + (j83 * j61))) - j77) + j87 + (j75 >>> 28);
        int i58 = ((int) j90) & M28;
        long j91 = (j68 * j68) + (j76 * j13) + (j20 * j49);
        long j92 = (j15 * j15) + (j78 * j12);
        long j93 = (j70 * j70) + (j79 * j24) + (j32 * j55);
        long j94 = (j37 * j37) + (j86 * j34);
        long j95 = (((j91 + j93) + j94) - j92) + j89;
        int i59 = ((int) j95) & M28;
        long j96 = j95 >>> 28;
        long j97 = ((((j26 * j26) + (j23 * j81)) + ((j72 * j72) + ((j83 * j35) + (j43 * j61)))) - j91) + j94 + (j90 >>> 28);
        int i60 = ((int) j97) & M28;
        long j98 = (j76 * j16) + (j20 * j13) + (j18 * j49);
        long j99 = (j79 * j27) + (j32 * j24) + (j29 * j55);
        long j100 = (j83 * j38) + (j43 * j35) + (j40 * j61);
        long j101 = ((i44 * 2) & 4294967295L) * j34;
        long j102 = (((j98 + j99) + j101) - (i30 * j12)) + j96;
        int i61 = ((int) j102) & M28;
        long j103 = (((i37 * j23) + j100) - j98) + j101 + (j97 >>> 28);
        int i62 = ((int) j103) & M28;
        long j104 = (j76 * j76) + (j20 * j16) + (j18 * j13) + (j15 * j49);
        long j105 = j34 * j34;
        long j106 = (((j104 + ((j79 * j79) + ((j32 * j27) + ((j29 * j24) + (j26 * j55))))) + j105) - (j12 * j12)) + (j102 >>> 28);
        int i63 = ((int) j106) & M28;
        long j107 = (((j23 * j23) + ((j83 * j83) + ((j43 * j38) + ((j40 * j35) + (j37 * j61))))) - j104) + j105 + (j103 >>> 28);
        int i64 = ((int) j107) & M28;
        long j108 = (j20 * j19) + (j18 * j16) + (j15 * j13) + (j12 * j49);
        long j109 = (j32 * j30) + (j29 * j27) + (j26 * j24) + (j55 * j23) + j108 + (j106 >>> 28);
        int i65 = ((int) j109) & M28;
        long j110 = (((j43 * j41) + ((j40 * j38) + ((j37 * j35) + (j34 * j61)))) - j108) + (j107 >>> 28);
        int i66 = ((int) j110) & M28;
        long j111 = j110 >>> 28;
        long j112 = (j109 >>> 28) + j111 + i52;
        int i67 = ((int) j112) & M28;
        long j113 = j111 + i51;
        iArr2[0] = ((int) j113) & M28;
        iArr2[1] = i53 + ((int) (j113 >>> 28));
        iArr2[2] = i55;
        iArr2[3] = i57;
        iArr2[4] = i59;
        iArr2[5] = i61;
        iArr2[6] = i63;
        iArr2[7] = i65;
        iArr2[8] = i67;
        iArr2[9] = i54 + ((int) (j112 >>> 28));
        iArr2[10] = i56;
        iArr2[11] = i58;
        iArr2[12] = i60;
        iArr2[13] = i62;
        iArr2[14] = i64;
        iArr2[15] = i66;
    }
}
