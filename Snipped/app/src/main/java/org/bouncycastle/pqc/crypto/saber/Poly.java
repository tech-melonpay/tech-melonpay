package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes3.dex */
class Poly {
    private static final int KARATSUBA_N = 64;
    private static int SCHB_N = 16;
    private final int N_RES;
    private final int N_SB;
    private final int N_SB_RES;
    private final int SABER_L;
    private final int SABER_N;
    private final SABEREngine engine;
    private final Utils utils;

    public Poly(SABEREngine sABEREngine) {
        this.engine = sABEREngine;
        this.SABER_L = sABEREngine.getSABER_L();
        int saber_n = sABEREngine.getSABER_N();
        this.SABER_N = saber_n;
        this.N_RES = saber_n << 1;
        this.N_SB = saber_n >> 2;
        this.N_SB_RES = (r0 * 2) - 1;
        this.utils = sABEREngine.getUtils();
    }

    private short OVERFLOWING_MUL(int i, int i9) {
        return (short) (i * i9);
    }

    private void cbd(short[] sArr, byte[] bArr, int i) {
        int[] iArr = new int[4];
        if (this.engine.getSABER_MU() == 6) {
            for (int i9 = 0; i9 < this.SABER_N / 4; i9++) {
                int load_littleendian = (int) load_littleendian(bArr, (i9 * 3) + i, 3);
                int i10 = 0;
                for (int i11 = 0; i11 < 3; i11++) {
                    i10 += (load_littleendian >> i11) & 2396745;
                }
                iArr[0] = i10 & 7;
                iArr[1] = (i10 >>> 6) & 7;
                iArr[2] = (i10 >>> 12) & 7;
                iArr[3] = (i10 >>> 18) & 7;
                int i12 = i9 * 4;
                sArr[i12] = (short) (iArr[0] - ((i10 >>> 3) & 7));
                sArr[i12 + 1] = (short) (iArr[1] - ((i10 >>> 9) & 7));
                sArr[i12 + 2] = (short) (iArr[2] - ((i10 >>> 15) & 7));
                sArr[i12 + 3] = (short) (iArr[3] - (i10 >>> 21));
            }
            return;
        }
        char c2 = 15;
        if (this.engine.getSABER_MU() == 8) {
            for (int i13 = 0; i13 < this.SABER_N / 4; i13++) {
                int i14 = i13 * 4;
                int load_littleendian2 = (int) load_littleendian(bArr, i + i14, 4);
                int i15 = 0;
                for (int i16 = 0; i16 < 4; i16++) {
                    i15 += (load_littleendian2 >>> i16) & 286331153;
                }
                iArr[0] = i15 & 15;
                iArr[1] = (i15 >>> 8) & 15;
                iArr[2] = (i15 >>> 16) & 15;
                iArr[3] = (i15 >>> 24) & 15;
                sArr[i14] = (short) (iArr[0] - ((i15 >>> 4) & 15));
                sArr[i14 + 1] = (short) (iArr[1] - ((i15 >>> 12) & 15));
                sArr[i14 + 2] = (short) (iArr[2] - ((i15 >>> 20) & 15));
                sArr[i14 + 3] = (short) (iArr[3] - (i15 >>> 28));
            }
            return;
        }
        if (this.engine.getSABER_MU() == 10) {
            int i17 = 0;
            while (i17 < this.SABER_N / 4) {
                long load_littleendian3 = load_littleendian(bArr, (i17 * 5) + i, 5);
                long j10 = 0;
                for (int i18 = 0; i18 < 5; i18++) {
                    j10 += (load_littleendian3 >>> i18) & 35468117025L;
                }
                iArr[0] = (int) (j10 & 31);
                iArr[1] = (int) ((j10 >>> 10) & 31);
                iArr[2] = (int) ((j10 >>> 20) & 31);
                iArr[3] = (int) ((j10 >>> 30) & 31);
                int i19 = i17 * 4;
                sArr[i19] = (short) (iArr[0] - ((int) ((j10 >>> 5) & 31)));
                sArr[i19 + 1] = (short) (iArr[1] - ((int) ((j10 >>> c2) & 31)));
                sArr[i19 + 2] = (short) (iArr[2] - ((int) ((j10 >>> 25) & 31)));
                sArr[i19 + 3] = (short) (iArr[3] - ((int) (j10 >>> 35)));
                i17++;
                c2 = 15;
            }
        }
    }

    private void karatsuba_simple(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 31;
        int[] iArr4 = new int[31];
        int[] iArr5 = new int[31];
        int[] iArr6 = new int[31];
        int[] iArr7 = new int[63];
        int i9 = 0;
        while (true) {
            if (i9 >= 16) {
                break;
            }
            int i10 = iArr[i9];
            int i11 = iArr[i9 + 16];
            int i12 = iArr[i9 + 32];
            int i13 = iArr[i9 + 48];
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = iArr2[i14];
                int i17 = iArr2[i14 + 16];
                int i18 = i9 + i14;
                iArr3[i18] = iArr3[i18] + OVERFLOWING_MUL(i10, i16);
                int i19 = i18 + 32;
                iArr3[i19] = iArr3[i19] + OVERFLOWING_MUL(i11, i17);
                int i20 = i10;
                int[] iArr8 = iArr7;
                iArr4[i18] = (int) (((i16 + i17) * (i10 + i11)) + iArr4[i18]);
                int i21 = iArr2[i14 + 32];
                int i22 = iArr2[i14 + 48];
                int i23 = i18 + 64;
                iArr3[i23] = iArr3[i23] + OVERFLOWING_MUL(i21, i12);
                int i24 = i18 + 96;
                iArr3[i24] = iArr3[i24] + OVERFLOWING_MUL(i22, i13);
                iArr6[i18] = iArr6[i18] + OVERFLOWING_MUL(i12 + i13, i21 + i22);
                int i25 = i16 + i21;
                int i26 = i20 + i12;
                iArr8[i18] = iArr8[i18] + OVERFLOWING_MUL(i25, i26);
                int i27 = i17 + i22;
                int i28 = i11 + i13;
                iArr8[i19] = iArr8[i19] + OVERFLOWING_MUL(i27, i28);
                iArr5[i18] = iArr5[i18] + OVERFLOWING_MUL(i25 + i27, i26 + i28);
                i14++;
                i10 = i20;
                i9 = i9;
                iArr7 = iArr8;
            }
            i9++;
            i = 31;
        }
        int[] iArr9 = iArr7;
        int i29 = 0;
        while (i29 < i) {
            int i30 = i29 + 32;
            iArr5[i29] = (iArr5[i29] - iArr9[i29]) - iArr9[i30];
            iArr4[i29] = (iArr4[i29] - iArr3[i29]) - iArr3[i30];
            iArr6[i29] = (iArr6[i29] - iArr3[i29 + 64]) - iArr3[i29 + 96];
            i29++;
            i = 31;
        }
        for (int i31 = 0; i31 < i; i31++) {
            int i32 = i31 + 16;
            iArr9[i32] = iArr9[i32] + iArr5[i31];
            iArr3[i32] = iArr3[i32] + iArr4[i31];
            int i33 = i31 + 80;
            iArr3[i33] = iArr3[i33] + iArr6[i31];
        }
        int i34 = 63;
        int i35 = 0;
        while (i35 < i34) {
            iArr9[i35] = (iArr9[i35] - iArr3[i35]) - iArr3[i35 + 64];
            i35++;
            i34 = 63;
        }
        for (int i36 = 0; i36 < i34; i36++) {
            int i37 = i36 + 32;
            iArr3[i37] = iArr3[i37] + iArr9[i36];
        }
    }

    private long load_littleendian(byte[] bArr, int i, int i9) {
        long j10 = bArr[i] & 255;
        for (int i10 = 1; i10 < i9; i10++) {
            j10 |= (bArr[i + i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    private void poly_mul_acc(short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[this.SABER_N * 2];
        toom_cook_4way(sArr, sArr2, sArr4);
        int i = this.SABER_N;
        while (true) {
            int i9 = this.SABER_N;
            if (i >= i9 * 2) {
                return;
            }
            int i10 = i - i9;
            sArr3[i10] = (short) ((sArr4[i - i9] - sArr4[i]) + sArr3[i10]);
            i++;
        }
    }

    private void toom_cook_4way(short[] sArr, short[] sArr2, short[] sArr3) {
        int i = this.N_SB;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int[] iArr10 = new int[i];
        int[] iArr11 = new int[i];
        int[] iArr12 = new int[i];
        int[] iArr13 = new int[i];
        int[] iArr14 = new int[i];
        int i9 = this.N_SB_RES;
        int[] iArr15 = new int[i9];
        int[] iArr16 = new int[i9];
        int[] iArr17 = new int[i9];
        int[] iArr18 = new int[i9];
        int[] iArr19 = new int[i9];
        int[] iArr20 = new int[i9];
        int[] iArr21 = new int[i9];
        int i10 = 0;
        while (true) {
            int i11 = this.N_SB;
            if (i10 >= i11) {
                break;
            }
            short s10 = sArr[i10];
            short s11 = sArr[i10 + i11];
            short s12 = sArr[(i11 * 2) + i10];
            short s13 = sArr[(i11 * 3) + i10];
            int[] iArr22 = iArr14;
            short s14 = (short) (s10 + s12);
            int[] iArr23 = iArr9;
            short s15 = (short) (s11 + s13);
            iArr3[i10] = (short) (s14 + s15);
            iArr4[i10] = (short) (s14 - s15);
            short s16 = (short) (((s10 << 2) + s12) << 1);
            short s17 = (short) ((s11 << 2) + s13);
            iArr5[i10] = (short) (s16 + s17);
            iArr6[i10] = (short) (s16 - s17);
            iArr2[i10] = (short) ((s13 << 3) + (s12 << 2) + (s11 << 1) + s10);
            iArr7[i10] = s10;
            iArr[i10] = s13;
            i10++;
            iArr14 = iArr22;
            iArr9 = iArr23;
            iArr13 = iArr13;
        }
        int[] iArr24 = iArr14;
        int[] iArr25 = iArr9;
        int[] iArr26 = iArr13;
        int i12 = 0;
        while (true) {
            int i13 = this.N_SB;
            if (i12 >= i13) {
                break;
            }
            short s18 = sArr2[i12];
            short s19 = sArr2[i12 + i13];
            short s20 = sArr2[(i13 * 2) + i12];
            short s21 = sArr2[(i13 * 3) + i12];
            int i14 = s18 + s20;
            int i15 = s19 + s21;
            iArr10[i12] = i14 + i15;
            iArr11[i12] = i14 - i15;
            int i16 = ((s18 << 2) + s20) << 1;
            int i17 = (s19 << 2) + s21;
            iArr12[i12] = i16 + i17;
            iArr26[i12] = i16 - i17;
            iArr25[i12] = (s21 << 3) + (s20 << 2) + (s19 << 1) + s18;
            iArr24[i12] = s18;
            iArr8[i12] = s21;
            i12++;
        }
        karatsuba_simple(iArr, iArr8, iArr15);
        karatsuba_simple(iArr2, iArr25, iArr16);
        karatsuba_simple(iArr3, iArr10, iArr17);
        karatsuba_simple(iArr4, iArr11, iArr18);
        karatsuba_simple(iArr5, iArr12, iArr19);
        karatsuba_simple(iArr6, iArr26, iArr20);
        karatsuba_simple(iArr7, iArr24, iArr21);
        for (int i18 = 0; i18 < this.N_SB_RES; i18++) {
            int i19 = iArr15[i18];
            int i20 = iArr16[i18];
            int i21 = iArr17[i18];
            int i22 = iArr18[i18];
            int i23 = iArr19[i18];
            int i24 = iArr20[i18];
            int i25 = iArr21[i18];
            int i26 = i24 - i23;
            int i27 = ((i22 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i21 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) >>> 1;
            int i28 = i21 + i27;
            int i29 = ((i20 + i23) - (i28 << 6)) - i28;
            int i30 = (i28 - i25) - i19;
            int i31 = (i30 * 45) + i29;
            int i32 = (((((((i23 - i19) - (i25 << 6)) << 1) + i26) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i30 << 3)) * 43691) >> 3;
            int i33 = (((i31 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + ((i27 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 4)) * 36409) >> 1;
            int i34 = -(i27 + i33);
            int i35 = ((((i33 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) * 30) - ((i26 + i31) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) * 61167) >> 2;
            int i36 = i30 - i32;
            int i37 = i33 - i35;
            sArr3[i18] = (short) (sArr3[i18] + (i25 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i38 = i18 + 64;
            sArr3[i38] = (short) (sArr3[i38] + (i35 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i39 = i18 + 128;
            sArr3[i39] = (short) (sArr3[i39] + (i32 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i40 = i18 + 192;
            sArr3[i40] = (short) (sArr3[i40] + (i34 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i41 = i18 + 256;
            sArr3[i41] = (short) (sArr3[i41] + (i36 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i42 = i18 + 320;
            sArr3[i42] = (short) (sArr3[i42] + (i37 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i43 = i18 + 384;
            sArr3[i43] = (short) (sArr3[i43] + (i19 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        }
    }

    public void GenMatrix(short[][][] sArr, byte[] bArr) {
        int saber_polyvecbytes = this.SABER_L * this.engine.getSABER_POLYVECBYTES();
        byte[] bArr2 = new byte[saber_polyvecbytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, this.engine.getSABER_SEEDBYTES());
        sHAKEDigest.doFinal(bArr2, 0, saber_polyvecbytes);
        for (int i = 0; i < this.SABER_L; i++) {
            this.utils.BS2POLVECq(bArr2, this.engine.getSABER_POLYVECBYTES() * i, sArr[i]);
        }
    }

    public void GenSecret(short[][] sArr, byte[] bArr) {
        int saber_polycoinbytes = this.SABER_L * this.engine.getSABER_POLYCOINBYTES();
        byte[] bArr2 = new byte[saber_polycoinbytes];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, this.engine.getSABER_NOISE_SEEDBYTES());
        sHAKEDigest.doFinal(bArr2, 0, saber_polycoinbytes);
        for (int i = 0; i < this.SABER_L; i++) {
            cbd(sArr[i], bArr2, this.engine.getSABER_POLYCOINBYTES() * i);
        }
    }

    public void InnerProd(short[][] sArr, short[][] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SABER_L; i++) {
            poly_mul_acc(sArr[i], sArr2[i], sArr3);
        }
    }

    public void MatrixVectorMul(short[][][] sArr, short[][] sArr2, short[][] sArr3, int i) {
        for (int i9 = 0; i9 < this.SABER_L; i9++) {
            for (int i10 = 0; i10 < this.SABER_L; i10++) {
                if (i == 1) {
                    poly_mul_acc(sArr[i10][i9], sArr2[i10], sArr3[i9]);
                } else {
                    poly_mul_acc(sArr[i9][i10], sArr2[i10], sArr3[i9]);
                }
            }
        }
    }
}
