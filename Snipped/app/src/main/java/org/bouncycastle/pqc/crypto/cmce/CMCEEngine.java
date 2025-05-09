package org.bouncycastle.pqc.crypto.cmce;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class CMCEEngine {
    private int COND_BYTES;
    private int GFBITS;
    private int GFMASK;
    private int IRR_BYTES;
    private int PK_NCOLS;
    private int PK_NROWS;
    private int PK_ROW_BYTES;
    private int SYND_BYTES;
    private int SYS_N;
    private int SYS_T;
    private BENES benes;
    private boolean countErrorIndices;
    private final int defaultKeySize;
    private GF gf;
    private int[] poly;
    private boolean usePadding;
    private boolean usePivots;

    public CMCEEngine(int i, int i9, int i10, int[] iArr, boolean z10, int i11) {
        BENES benes13;
        this.usePivots = z10;
        this.SYS_N = i9;
        this.SYS_T = i10;
        this.GFBITS = i;
        this.poly = iArr;
        this.defaultKeySize = i11;
        this.IRR_BYTES = i10 * 2;
        this.COND_BYTES = ((i * 2) - 1) * (1 << (i - 4));
        int i12 = i10 * i;
        this.PK_NROWS = i12;
        int i13 = i9 - i12;
        this.PK_NCOLS = i13;
        this.PK_ROW_BYTES = (i13 + 7) / 8;
        this.SYND_BYTES = (i12 + 7) / 8;
        this.GFMASK = (1 << i) - 1;
        if (i == 12) {
            this.gf = new GF12(i);
            benes13 = new BENES12(this.SYS_N, this.SYS_T, this.GFBITS);
        } else {
            this.gf = new GF13(i);
            benes13 = new BENES13(this.SYS_N, this.SYS_T, this.GFBITS);
        }
        this.benes = benes13;
        this.usePadding = this.SYS_T % 8 != 0;
        this.countErrorIndices = (1 << this.GFBITS) > this.SYS_N;
    }

    private void GF_mul(short[] sArr, short[] sArr2, short[] sArr3) {
        int i;
        int i9;
        short[] sArr4 = new short[(this.SYS_T * 2) - 1];
        for (int i10 = 0; i10 < (this.SYS_T * 2) - 1; i10++) {
            sArr4[i10] = 0;
        }
        int i11 = 0;
        while (true) {
            i = this.SYS_T;
            if (i11 >= i) {
                break;
            }
            for (int i12 = 0; i12 < this.SYS_T; i12++) {
                int i13 = i11 + i12;
                sArr4[i13] = (short) (this.gf.gf_mul(sArr2[i11], sArr3[i12]) ^ sArr4[i13]);
            }
            i11++;
        }
        int i14 = (i - 1) * 2;
        while (true) {
            i9 = this.SYS_T;
            if (i14 < i9) {
                break;
            }
            int i15 = 0;
            while (true) {
                int[] iArr = this.poly;
                if (i15 != iArr.length) {
                    int i16 = iArr[i15];
                    if (i16 == 0 && this.GFBITS == 12) {
                        int i17 = i14 - this.SYS_T;
                        sArr4[i17] = (short) (sArr4[i17] ^ this.gf.gf_mul(sArr4[i14], (short) 2));
                    } else {
                        int i18 = (i14 - this.SYS_T) + i16;
                        sArr4[i18] = (short) (sArr4[i18] ^ sArr4[i14]);
                    }
                    i15++;
                }
            }
            i14--;
        }
        System.arraycopy(sArr4, 0, sArr, 0, i9);
        for (int i19 = 0; i19 < this.SYS_T; i19++) {
            sArr[i19] = sArr4[i19];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void bm(short[] sArr, short[] sArr2) {
        int i;
        int i9 = this.SYS_T;
        short[] sArr3 = new short[i9 + 1];
        short[] sArr4 = new short[i9 + 1];
        short[] sArr5 = new short[i9 + 1];
        int i10 = 0;
        for (int i11 = 0; i11 < this.SYS_T + 1; i11++) {
            sArr5[i11] = 0;
            sArr4[i11] = 0;
        }
        sArr4[0] = 1;
        sArr5[1] = 1;
        short s10 = 1;
        short s11 = 0;
        short s12 = 0;
        while (s11 < this.SYS_T * 2) {
            short s13 = i10;
            short s14 = s13;
            for (int i12 = s13; i12 <= min(s11, this.SYS_T); i12++) {
                s14 = (short) (s14 ^ this.gf.gf_mul(sArr4[i12], sArr2[s11 - i12]));
            }
            short s15 = (short) (((short) (((short) (((short) (s14 - 1)) >> 15)) & 1)) - 1);
            short s16 = (short) (((short) (((short) (((short) (((short) (s11 - (s12 * 2))) >> 15)) & 1)) - 1)) & s15);
            for (int i13 = i10; i13 <= this.SYS_T; i13++) {
                sArr3[i13] = sArr4[i13];
            }
            short gf_frac = this.gf.gf_frac(s10, s14);
            for (int i14 = i10; i14 <= this.SYS_T; i14++) {
                sArr4[i14] = (short) ((this.gf.gf_mul(gf_frac, sArr5[i14]) & s15) ^ sArr4[i14]);
            }
            int i15 = ~s16;
            int i16 = s11 + 1;
            s12 = (short) (((i16 - s12) & s16) | (s12 & i15));
            int i17 = 0;
            while (true) {
                i = this.SYS_T;
                if (i17 > i) {
                    break;
                }
                sArr5[i17] = (short) ((sArr5[i17] & i15) | (sArr3[i17] & s16));
                i17++;
            }
            s10 = (short) ((i15 & s10) | (s14 & s16));
            while (i >= 1) {
                sArr5[i] = sArr5[i - 1];
                i--;
            }
            i10 = 0;
            sArr5[0] = 0;
            s11 = (short) i16;
        }
        while (true) {
            int i18 = this.SYS_T;
            if (i10 > i18) {
                return;
            }
            sArr[i10] = sArr4[i18 - i10];
            i10++;
        }
    }

    public static void cbrecursion(byte[] bArr, long j10, long j11, short[] sArr, int i, long j12, long j13, int[] iArr) {
        long j14;
        long j15 = j13;
        if (j12 == 1) {
            int i9 = (int) (j10 >> 3);
            bArr[i9] = (byte) ((get_q_short(iArr, i) << ((int) (j10 & 7))) ^ bArr[i9]);
            return;
        }
        if (sArr != null) {
            for (long j16 = 0; j16 < j15; j16++) {
                int i10 = (int) j16;
                iArr[i10] = sArr[(int) (j16 ^ 1)] | ((sArr[i10] ^ 1) << 16);
            }
        } else {
            for (long j17 = 0; j17 < j15; j17++) {
                long j18 = i;
                iArr[(int) j17] = ((get_q_short(iArr, (int) (j18 + j17)) ^ 1) << 16) | get_q_short(iArr, (int) (j18 + (j17 ^ 1)));
            }
        }
        int i11 = (int) j15;
        sort32(iArr, 0, i11);
        for (long j19 = 0; j19 < j15; j19++) {
            int i12 = (int) j19;
            int i13 = 65535 & iArr[i12];
            if (j19 >= i13) {
                i12 = i13;
            }
            iArr[(int) (j15 + j19)] = i12 | (i13 << 16);
        }
        for (long j20 = 0; j20 < j15; j20++) {
            iArr[(int) j20] = (int) ((iArr[r7] << 16) | j20);
        }
        sort32(iArr, 0, i11);
        for (long j21 = 0; j21 < j15; j21++) {
            int i14 = (int) j21;
            iArr[i14] = (iArr[i14] << 16) + (iArr[(int) (j15 + j21)] >> 16);
        }
        sort32(iArr, 0, i11);
        if (j12 <= 10) {
            for (long j22 = 0; j22 < j15; j22++) {
                int i15 = (int) (j15 + j22);
                iArr[i15] = ((iArr[(int) j22] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 10) | (iArr[i15] & 1023);
            }
            long j23 = 1;
            for (long j24 = 1; j23 < j12 - j24; j24 = 1) {
                long j25 = 0;
                while (j25 < j15) {
                    iArr[(int) j25] = (int) (((iArr[(int) (j15 + j25)] & (-1024)) << 6) | j25);
                    j25++;
                    j23 = j23;
                }
                long j26 = j23;
                sort32(iArr, 0, i11);
                for (long j27 = 0; j27 < j15; j27++) {
                    int i16 = (int) j27;
                    iArr[i16] = (iArr[i16] << 20) | iArr[(int) (j15 + j27)];
                }
                sort32(iArr, 0, i11);
                for (long j28 = 0; j28 < j15; j28++) {
                    int i17 = iArr[(int) j28];
                    int i18 = 1048575 & i17;
                    int i19 = (int) (j15 + j28);
                    int i20 = (i17 & 1047552) | (iArr[i19] & 1023);
                    if (i18 >= i20) {
                        i18 = i20;
                    }
                    iArr[i19] = i18;
                }
                j23 = j26 + 1;
            }
            for (long j29 = 0; j29 < j15; j29++) {
                int i21 = (int) (j15 + j29);
                iArr[i21] = iArr[i21] & 1023;
            }
        } else {
            for (long j30 = 0; j30 < j15; j30++) {
                int i22 = (int) (j15 + j30);
                iArr[i22] = (iArr[(int) j30] << 16) | (iArr[i22] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            long j31 = 1;
            for (long j32 = 1; j31 < j12 - j32; j32 = 1) {
                for (long j33 = 0; j33 < j15; j33++) {
                    iArr[(int) j33] = (int) ((iArr[(int) (j15 + j33)] & (-65536)) | j33);
                }
                sort32(iArr, 0, i11);
                for (long j34 = 0; j34 < j15; j34++) {
                    int i23 = (int) j34;
                    iArr[i23] = (iArr[i23] << 16) | (iArr[(int) (j15 + j34)] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
                if (j31 < j12 - 2) {
                    for (long j35 = 0; j35 < j15; j35++) {
                        int i24 = (int) (j15 + j35);
                        iArr[i24] = (iArr[(int) j35] & (-65536)) | (iArr[i24] >> 16);
                    }
                    sort32(iArr, i11, (int) (j15 * 2));
                    for (long j36 = 0; j36 < j15; j36++) {
                        int i25 = (int) (j15 + j36);
                        iArr[i25] = (iArr[i25] << 16) | (iArr[(int) j36] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    }
                }
                sort32(iArr, 0, i11);
                for (long j37 = 0; j37 < j15; j37++) {
                    int i26 = (int) (j15 + j37);
                    int i27 = iArr[i26];
                    int i28 = (i27 & (-65536)) | (iArr[(int) j37] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    if (i28 < i27) {
                        iArr[i26] = i28;
                    }
                }
                j31++;
            }
            for (long j38 = 0; j38 < j15; j38++) {
                int i29 = (int) (j15 + j38);
                iArr[i29] = iArr[i29] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            }
        }
        long j39 = 0;
        if (sArr != null) {
            while (j39 < j15) {
                iArr[(int) j39] = (int) ((sArr[r0] << 16) + j39);
                j39++;
            }
        } else {
            while (j39 < j15) {
                iArr[(int) j39] = (int) ((get_q_short(iArr, (int) (i + j39)) << 16) + j39);
                j39++;
            }
        }
        sort32(iArr, 0, i11);
        long j40 = j10;
        long j41 = 2;
        long j42 = 0;
        while (true) {
            j14 = j15 / j41;
            if (j42 >= j14) {
                break;
            }
            long j43 = j42 * j41;
            long j44 = j15 + j43;
            int i30 = (int) j44;
            int i31 = iArr[i30] & 1;
            int i32 = (int) (i31 + j43);
            int i33 = (int) (j40 >> 3);
            bArr[i33] = (byte) ((i31 << ((int) (j40 & 7))) ^ bArr[i33]);
            j40 += j11;
            iArr[i30] = (iArr[(int) j43] << 16) | i32;
            iArr[(int) (j44 + 1)] = (iArr[(int) (j43 + 1)] << 16) | (i32 ^ 1);
            j42++;
            j15 = j13;
            i11 = i11;
            j41 = 2;
        }
        long j45 = j41;
        long j46 = j13 * j45;
        sort32(iArr, i11, (int) j46);
        long j47 = j12 * j45;
        long j48 = ((j47 - 3) * j11 * j14) + j40;
        long j49 = 0;
        while (j49 < j14) {
            long j50 = j49 * j45;
            long j51 = j13 + j50;
            int i34 = iArr[(int) j51];
            int i35 = i34 & 1;
            long j52 = j48;
            int i36 = (int) (i35 + j50);
            long j53 = j46;
            int i37 = (int) (j52 >> 3);
            bArr[i37] = (byte) (bArr[i37] ^ (i35 << ((int) (j52 & 7))));
            iArr[(int) j50] = (i34 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) | (i36 << 16);
            iArr[(int) (j50 + 1)] = (iArr[(int) (j51 + 1)] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) | ((i36 ^ 1) << 16);
            j49++;
            j48 = j52 + j11;
            j46 = j53;
            j47 = j47;
            j45 = 2;
        }
        long j54 = j46;
        sort32(iArr, 0, i11);
        long j55 = 2;
        long j56 = j48 - (((j47 - 2) * j11) * j14);
        short[] sArr2 = new short[i11 * 4];
        long j57 = 0;
        while (j57 < j54) {
            long j58 = j57 * j55;
            int i38 = iArr[(int) j57];
            sArr2[(int) j58] = (short) i38;
            sArr2[(int) (j58 + 1)] = (short) ((i38 & (-65536)) >> 16);
            j57++;
            j55 = 2;
        }
        for (long j59 = 0; j59 < j14; j59++) {
            long j60 = j59 * 2;
            sArr2[(int) j59] = (short) ((iArr[(int) j60] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> 1);
            sArr2[(int) (j59 + j14)] = (short) ((iArr[(int) (j60 + 1)] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >>> 1);
        }
        for (long j61 = 0; j61 < j14; j61++) {
            long j62 = j61 * 2;
            iArr[(int) ((j13 / 4) + j13 + j61)] = (sArr2[(int) (j62 + 1)] << 16) | sArr2[(int) j62];
        }
        long j63 = j11 * 2;
        long j64 = (j13 / 4) + j13;
        long j65 = j12 - 1;
        cbrecursion(bArr, j56, j63, null, ((int) j64) * 2, j65, j14, iArr);
        cbrecursion(bArr, j56 + j11, j63, null, (int) ((j64 * 2) + j14), j65, j14, iArr);
    }

    private static void controlbitsfrompermutation(byte[] bArr, short[] sArr, long j10, long j11) {
        long j12 = 2;
        int[] iArr = new int[(int) (j11 * 2)];
        int i = (int) j11;
        short[] sArr2 = new short[i];
        while (true) {
            short s10 = 0;
            for (int i9 = 0; i9 < (((((j10 * j12) - 1) * j11) / j12) + 7) / 8; i9++) {
                bArr[i9] = 0;
            }
            int i10 = i;
            short[] sArr3 = sArr2;
            int[] iArr2 = iArr;
            cbrecursion(bArr, 0L, 1L, sArr, 0, j10, j11, iArr);
            for (int i11 = 0; i11 < j11; i11++) {
                sArr3[i11] = (short) i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < j10; i13++) {
                layer(sArr3, bArr, i12, i13, i10);
                i12 = (int) (i12 + (j11 >> 4));
            }
            for (int i14 = (int) (j10 - 2); i14 >= 0; i14--) {
                layer(sArr3, bArr, i12, i14, i10);
                i12 = (int) (i12 + (j11 >> 4));
            }
            int i15 = 0;
            while (i15 < j11) {
                short s11 = (short) (s10 | (sArr[i15] ^ sArr3[i15]));
                i15++;
                s10 = s11;
            }
            if (s10 == 0) {
                return;
            }
            sArr2 = sArr3;
            i = i10;
            iArr = iArr2;
            j12 = 2;
        }
    }

    private static int ctz(long j10) {
        int i = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < 64; i10++) {
            int i11 = (int) ((j10 >> i10) & 1);
            i9 |= i11;
            i += (i11 ^ 1) & (i9 ^ 1);
        }
        return i;
    }

    private int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i9;
        int i10 = this.SYS_T;
        short[] sArr = new short[i10 + 1];
        int i11 = this.SYS_N;
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i10 * 2];
        short[] sArr4 = new short[i10 * 2];
        short[] sArr5 = new short[i10 + 1];
        short[] sArr6 = new short[i11];
        byte[] bArr4 = new byte[i11 / 8];
        int i12 = 0;
        while (true) {
            i = this.SYND_BYTES;
            if (i12 >= i) {
                break;
            }
            bArr4[i12] = bArr3[i12];
            i12++;
        }
        while (i < this.SYS_N / 8) {
            bArr4[i] = 0;
            i++;
        }
        int i13 = 0;
        while (true) {
            i9 = this.SYS_T;
            if (i13 >= i9) {
                break;
            }
            sArr[i13] = Utils.load_gf(bArr2, (i13 * 2) + 40, this.GFMASK);
            i13++;
        }
        sArr[i9] = 1;
        this.benes.support_gen(sArr2, bArr2);
        synd(sArr3, sArr, sArr2, bArr4);
        bm(sArr5, sArr3);
        root(sArr6, sArr5, sArr2);
        for (int i14 = 0; i14 < this.SYS_N / 8; i14++) {
            bArr[i14] = 0;
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.SYS_N; i16++) {
            short gf_iszero = (short) (this.gf.gf_iszero(sArr6[i16]) & 1);
            int i17 = i16 / 8;
            bArr[i17] = (byte) (bArr[i17] | (gf_iszero << (i16 % 8)));
            i15 += gf_iszero;
        }
        synd(sArr4, sArr, sArr2, bArr);
        int i18 = this.SYS_T ^ i15;
        for (int i19 = 0; i19 < this.SYS_T * 2; i19++) {
            i18 |= sArr3[i19] ^ sArr4[i19];
        }
        return (((i18 - 1) >> 15) & 1) ^ 1;
    }

    private void encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        generate_error_vector(bArr3, secureRandom);
        syndrome(bArr, bArr2, bArr3);
    }

    private short eval(short[] sArr, short s10) {
        int i = this.SYS_T;
        short s11 = sArr[i];
        for (int i9 = i - 1; i9 >= 0; i9--) {
            s11 = this.gf.gf_add(this.gf.gf_mul(s11, s10), sArr[i9]);
        }
        return s11;
    }

    private void generate_error_vector(byte[] bArr, SecureRandom secureRandom) {
        int i;
        int i9 = this.SYS_T;
        short[] sArr = new short[i9 * 2];
        short[] sArr2 = new short[i9];
        byte[] bArr2 = new byte[i9];
        while (true) {
            if (this.countErrorIndices) {
                byte[] bArr3 = new byte[this.SYS_T * 4];
                secureRandom.nextBytes(bArr3);
                for (int i10 = 0; i10 < this.SYS_T * 2; i10++) {
                    sArr[i10] = Utils.load_gf(bArr3, i10 * 2, this.GFMASK);
                }
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i = this.SYS_T;
                    if (i11 >= i * 2 || i12 >= i) {
                        break;
                    }
                    short s10 = sArr[i11];
                    if (s10 < this.SYS_N) {
                        sArr2[i12] = s10;
                        i12++;
                    }
                    i11++;
                }
                if (i12 < i) {
                    continue;
                }
            } else {
                byte[] bArr4 = new byte[this.SYS_T * 2];
                secureRandom.nextBytes(bArr4);
                for (int i13 = 0; i13 < this.SYS_T; i13++) {
                    sArr2[i13] = Utils.load_gf(bArr4, i13 * 2, this.GFMASK);
                }
            }
            boolean z10 = false;
            for (int i14 = 1; i14 < this.SYS_T && !z10; i14++) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        break;
                    }
                    if (sArr2[i14] == sArr2[i15]) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (!z10) {
                break;
            }
        }
        for (int i16 = 0; i16 < this.SYS_T; i16++) {
            bArr2[i16] = (byte) (1 << (sArr2[i16] & 7));
        }
        for (short s11 = 0; s11 < this.SYS_N / 8; s11 = (short) (s11 + 1)) {
            bArr[s11] = 0;
            for (int i17 = 0; i17 < this.SYS_T; i17++) {
                bArr[s11] = (byte) ((((short) (same_mask32(s11, (short) (sArr2[i17] >> 3)) & 255)) & bArr2[i17]) | bArr[s11]);
            }
        }
    }

    private int generate_irr_poly(short[] sArr) {
        int i = this.SYS_T;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i + 1, i);
        sArr2[0][0] = 1;
        for (int i9 = 1; i9 < this.SYS_T; i9++) {
            sArr2[0][i9] = 0;
        }
        for (int i10 = 0; i10 < this.SYS_T; i10++) {
            sArr2[1][i10] = sArr[i10];
        }
        for (int i11 = 2; i11 <= this.SYS_T; i11++) {
            GF_mul(sArr2[i11], sArr2[i11 - 1], sArr);
        }
        int i12 = 0;
        while (i12 < this.SYS_T) {
            int i13 = i12 + 1;
            for (int i14 = i13; i14 < this.SYS_T; i14++) {
                short gf_iszero = this.gf.gf_iszero(sArr2[i12][i12]);
                for (int i15 = i12; i15 < this.SYS_T + 1; i15++) {
                    short[] sArr3 = sArr2[i15];
                    sArr3[i12] = (short) (sArr3[i12] ^ (sArr3[i14] & gf_iszero));
                }
            }
            short s10 = sArr2[i12][i12];
            if (s10 == 0) {
                return -1;
            }
            short gf_inv = this.gf.gf_inv(s10);
            for (int i16 = i12; i16 < this.SYS_T + 1; i16++) {
                short[] sArr4 = sArr2[i16];
                sArr4[i12] = this.gf.gf_mul(sArr4[i12], gf_inv);
            }
            for (int i17 = 0; i17 < this.SYS_T; i17++) {
                if (i17 != i12) {
                    short s11 = sArr2[i12][i17];
                    for (int i18 = i12; i18 < this.SYS_T + 1; i18++) {
                        short[] sArr5 = sArr2[i18];
                        sArr5[i17] = (short) (sArr5[i17] ^ this.gf.gf_mul(sArr5[i12], s11));
                    }
                }
            }
            i12 = i13;
        }
        int i19 = 0;
        while (true) {
            int i20 = this.SYS_T;
            if (i19 >= i20) {
                return 0;
            }
            sArr[i19] = sArr2[i20][i19];
            i19++;
        }
    }

    public static short get_q_short(int[] iArr, int i) {
        int i9 = i / 2;
        return (short) (i % 2 == 0 ? iArr[i9] : (iArr[i9] & (-65536)) >> 16);
    }

    private static void layer(short[] sArr, byte[] bArr, int i, int i9, int i10) {
        int i11 = 1 << i9;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13 += i11 * 2) {
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i13 + i14;
                short s10 = sArr[i15];
                int i16 = i15 + i11;
                int i17 = (sArr[i16] ^ s10) & (-((bArr[(i12 >> 3) + i] >> (i12 & 7)) & 1));
                sArr[i15] = (short) (s10 ^ i17);
                sArr[i16] = (short) (sArr[i16] ^ i17);
                i12++;
            }
        }
    }

    private static int min(short s10, int i) {
        return s10 < i ? s10 : i;
    }

    private int mov_columns(byte[][] bArr, short[] sArr, long[] jArr) {
        byte[] bArr2;
        long load8;
        long[] jArr2 = new long[64];
        int i = 32;
        long[] jArr3 = new long[32];
        byte[] bArr3 = new byte[9];
        int i9 = this.PK_NROWS - 32;
        int i10 = i9 / 8;
        int i11 = i9 % 8;
        char c2 = 0;
        if (this.usePadding) {
            for (int i12 = 0; i12 < 32; i12++) {
                for (int i13 = 0; i13 < 9; i13++) {
                    bArr3[i13] = bArr[i9 + i12][i10 + i13];
                }
                int i14 = 0;
                while (i14 < 8) {
                    int i15 = i14 + 1;
                    bArr3[i14] = (byte) (((bArr3[i14] & 255) >> i11) | (bArr3[i15] << (8 - i11)));
                    i14 = i15;
                }
                jArr2[i12] = Utils.load8(bArr3, 0);
            }
        } else {
            for (int i16 = 0; i16 < 32; i16++) {
                jArr2[i16] = Utils.load8(bArr[i9 + i16], i10);
            }
        }
        long j10 = 0;
        jArr[0] = 0;
        int i17 = 0;
        while (i17 < 32) {
            long j11 = jArr2[i17];
            int i18 = i17 + 1;
            for (int i19 = i18; i19 < 32; i19++) {
                j11 |= jArr2[i19];
            }
            if (j11 == j10) {
                return -1;
            }
            int ctz = ctz(j11);
            long j12 = ctz;
            jArr3[i17] = j12;
            jArr[c2] = jArr[c2] | (1 << ((int) j12));
            for (int i20 = i18; i20 < 32; i20++) {
                long j13 = jArr2[i17];
                jArr2[i17] = j13 ^ (jArr2[i20] & (((j13 >> ctz) & 1) - 1));
            }
            int i21 = i18;
            while (i21 < 32) {
                long j14 = jArr2[i21];
                jArr2[i21] = j14 ^ (jArr2[i17] & (-((j14 >> ctz) & 1)));
                i21++;
                ctz = ctz;
                c2 = 0;
            }
            i17 = i18;
            j10 = 0;
        }
        int i22 = 0;
        while (i22 < 32) {
            int i23 = i22 + 1;
            int i24 = i23;
            while (i24 < 64) {
                long same_mask64 = same_mask64((short) i24, (short) jArr3[i22]) & (sArr[r12] ^ sArr[r17]);
                sArr[i9 + i22] = (short) (sArr[r12] ^ same_mask64);
                sArr[i9 + i24] = (short) (same_mask64 ^ sArr[r17]);
                i24++;
                bArr3 = bArr3;
            }
            i22 = i23;
        }
        byte[] bArr4 = bArr3;
        int i25 = 0;
        while (i25 < this.PK_NROWS) {
            if (this.usePadding) {
                for (int i26 = 0; i26 < 9; i26++) {
                    bArr4[i26] = bArr[i25][i10 + i26];
                }
                int i27 = 0;
                while (i27 < 8) {
                    int i28 = i27 + 1;
                    bArr4[i27] = (byte) (((bArr4[i27] & 255) >> i11) | (bArr4[i28] << (8 - i11)));
                    i27 = i28;
                }
                bArr2 = bArr4;
                load8 = Utils.load8(bArr2, 0);
            } else {
                bArr2 = bArr4;
                load8 = Utils.load8(bArr[i25], i10);
            }
            int i29 = 0;
            while (i29 < i) {
                long j15 = jArr3[i29];
                long j16 = ((load8 >> i29) ^ (load8 >> ((int) j15))) & 1;
                load8 = (j16 << i29) ^ ((j16 << ((int) j15)) ^ load8);
                i29++;
                i = 32;
            }
            if (this.usePadding) {
                Utils.store8(bArr2, 0, load8);
                byte[] bArr5 = bArr[i25];
                int i30 = i10 + 8;
                int i31 = 8 - i11;
                bArr5[i30] = (byte) ((((bArr5[i30] & 255) >>> i11) << i11) | ((bArr2[7] & 255) >>> i31));
                bArr5[i10] = (byte) (((bArr2[0] & 255) << i11) | (((bArr5[i10] & 255) << i31) >>> i31));
                for (int i32 = 7; i32 >= 1; i32--) {
                    bArr[i25][i10 + i32] = (byte) (((bArr2[i32] & 255) << i11) | ((bArr2[i32 - 1] & 255) >>> i31));
                }
            } else {
                Utils.store8(bArr[i25], i10, load8);
            }
            i25++;
            bArr4 = bArr2;
            i = 32;
        }
        return 0;
    }

    private int pk_gen(byte[] bArr, byte[] bArr2, int[] iArr, short[] sArr, long[] jArr) {
        int i;
        int i9;
        int i10 = this.SYS_T;
        short[] sArr2 = new short[i10 + 1];
        sArr2[i10] = 1;
        for (int i11 = 0; i11 < this.SYS_T; i11++) {
            sArr2[i11] = Utils.load_gf(bArr2, (i11 * 2) + 40, this.GFMASK);
        }
        int i12 = 1 << this.GFBITS;
        long[] jArr2 = new long[i12];
        for (int i13 = 0; i13 < (1 << this.GFBITS); i13++) {
            long j10 = iArr[i13];
            jArr2[i13] = j10;
            long j11 = j10 << 31;
            jArr2[i13] = j11;
            long j12 = j11 | i13;
            jArr2[i13] = j12;
            jArr2[i13] = j12 & Long.MAX_VALUE;
        }
        sort64(jArr2, 0, i12);
        for (int i14 = 1; i14 < (1 << this.GFBITS); i14++) {
            if ((jArr2[i14 - 1] >> 31) == (jArr2[i14] >> 31)) {
                return -1;
            }
        }
        short[] sArr3 = new short[this.SYS_N];
        for (int i15 = 0; i15 < (1 << this.GFBITS); i15++) {
            sArr[i15] = (short) (jArr2[i15] & this.GFMASK);
        }
        int i16 = 0;
        while (true) {
            i = this.SYS_N;
            if (i16 >= i) {
                break;
            }
            sArr3[i16] = Utils.bitrev(sArr[i16], this.GFBITS);
            i16++;
        }
        short[] sArr4 = new short[i];
        root(sArr4, sArr2, sArr3);
        int i17 = 0;
        while (true) {
            i9 = this.SYS_N;
            if (i17 >= i9) {
                break;
            }
            sArr4[i17] = this.gf.gf_inv(sArr4[i17]);
            i17++;
        }
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.PK_NROWS, i9 / 8);
        for (int i18 = 0; i18 < this.PK_NROWS; i18++) {
            for (int i19 = 0; i19 < this.SYS_N / 8; i19++) {
                bArr3[i18][i19] = 0;
            }
        }
        for (int i20 = 0; i20 < this.SYS_T; i20++) {
            for (int i21 = 0; i21 < this.SYS_N; i21 += 8) {
                int i22 = 0;
                while (true) {
                    int i23 = this.GFBITS;
                    if (i22 < i23) {
                        bArr3[(i23 * i20) + i22][i21 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i21 + 7] >>> i22) & 1)) << 1)) | ((sArr4[i21 + 6] >>> i22) & 1))) << 1)) | ((sArr4[i21 + 5] >>> i22) & 1))) << 1)) | ((sArr4[i21 + 4] >>> i22) & 1))) << 1)) | ((sArr4[i21 + 3] >>> i22) & 1))) << 1)) | ((sArr4[i21 + 2] >>> i22) & 1))) << 1)) | ((sArr4[i21 + 1] >>> i22) & 1))) << 1)) | ((sArr4[i21] >>> i22) & 1));
                        i22++;
                    }
                }
            }
            for (int i24 = 0; i24 < this.SYS_N; i24++) {
                sArr4[i24] = this.gf.gf_mul(sArr4[i24], sArr3[i24]);
            }
        }
        int i25 = 0;
        while (true) {
            int i26 = this.PK_NROWS;
            if (i25 >= (i26 + 7) / 8) {
                if (bArr != null) {
                    if (this.usePadding) {
                        int i27 = i26 % 8;
                        int i28 = 0;
                        int i29 = 0;
                        while (true) {
                            int i30 = this.PK_NROWS;
                            if (i28 >= i30) {
                                break;
                            }
                            int i31 = (i30 - 1) / 8;
                            while (i31 < (this.SYS_N / 8) - 1) {
                                byte[] bArr4 = bArr3[i28];
                                int i32 = (bArr4[i31] & 255) >>> i27;
                                i31++;
                                bArr[i29] = (byte) ((bArr4[i31] << (8 - i27)) | i32);
                                i29++;
                            }
                            bArr[i29] = (byte) ((bArr3[i28][i31] & 255) >>> i27);
                            i28++;
                            i29++;
                        }
                    } else {
                        for (int i33 = 0; i33 < this.PK_NROWS; i33++) {
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                int i36 = this.SYS_N;
                                int i37 = this.PK_NROWS;
                                if (i34 < ((i36 - i37) + 7) / 8) {
                                    bArr[((((i36 - i37) + 7) / 8) * i33) + i35] = bArr3[i33][(i37 / 8) + i34];
                                    i35++;
                                    i34++;
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            for (int i38 = 0; i38 < 8; i38++) {
                int i39 = (i25 * 8) + i38;
                int i40 = this.PK_NROWS;
                if (i39 >= i40) {
                    break;
                }
                if (this.usePivots && i39 == i40 - 32) {
                    if (mov_columns(bArr3, sArr, jArr) != 0) {
                        return -1;
                    }
                }
                for (int i41 = i39 + 1; i41 < this.PK_NROWS; i41++) {
                    byte b9 = (byte) (-((byte) (((byte) (((byte) (bArr3[i39][i25] ^ bArr3[i41][i25])) >> i38)) & 1)));
                    for (int i42 = 0; i42 < this.SYS_N / 8; i42++) {
                        byte[] bArr5 = bArr3[i39];
                        bArr5[i42] = (byte) (bArr5[i42] ^ (bArr3[i41][i42] & b9));
                    }
                }
                if (((bArr3[i39][i25] >> i38) & 1) == 0) {
                    return -1;
                }
                for (int i43 = 0; i43 < this.PK_NROWS; i43++) {
                    if (i43 != i39) {
                        byte b10 = (byte) (-((byte) (((byte) (bArr3[i43][i25] >> i38)) & 1)));
                        for (int i44 = 0; i44 < this.SYS_N / 8; i44++) {
                            byte[] bArr6 = bArr3[i43];
                            bArr6[i44] = (byte) (bArr6[i44] ^ (bArr3[i39][i44] & b10));
                        }
                    }
                }
            }
            i25++;
        }
    }

    private void root(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SYS_N; i++) {
            sArr[i] = eval(sArr2, sArr3[i]);
        }
    }

    private static byte same_mask32(short s10, short s11) {
        return (byte) ((-(((s10 ^ s11) - 1) >>> 31)) & 255);
    }

    private static long same_mask64(short s10, short s11) {
        return -(((s10 ^ s11) - 1) >>> 63);
    }

    private static void sort32(int[] iArr, int i, int i9) {
        int i10 = i9 - i;
        if (i10 < 2) {
            return;
        }
        int i11 = 1;
        while (i11 < i10 - i11) {
            i11 += i11;
        }
        for (int i12 = i11; i12 > 0; i12 >>>= 1) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10 - i12; i14++) {
                if ((i14 & i12) == 0) {
                    int i15 = i + i14;
                    int i16 = i15 + i12;
                    int i17 = iArr[i16];
                    int i18 = iArr[i15];
                    int i19 = i17 ^ i18;
                    int i20 = i17 - i18;
                    int i21 = ((((i17 ^ i20) & i19) ^ i20) >> 31) & i19;
                    iArr[i15] = i18 ^ i21;
                    iArr[i16] = iArr[i16] ^ i21;
                }
            }
            for (int i22 = i11; i22 > i12; i22 >>>= 1) {
                while (i13 < i10 - i22) {
                    if ((i13 & i12) == 0) {
                        int i23 = i + i13;
                        int i24 = i23 + i12;
                        int i25 = iArr[i24];
                        for (int i26 = i22; i26 > i12; i26 >>>= 1) {
                            int i27 = i23 + i26;
                            int i28 = iArr[i27];
                            int i29 = i28 ^ i25;
                            int i30 = i28 - i25;
                            int i31 = i29 & ((i30 ^ ((i30 ^ i28) & i29)) >> 31);
                            i25 ^= i31;
                            iArr[i27] = i28 ^ i31;
                        }
                        iArr[i24] = i25;
                    }
                    i13++;
                }
            }
        }
    }

    private static void sort64(long[] jArr, int i, int i9) {
        int i10 = i9 - i;
        if (i10 < 2) {
            return;
        }
        int i11 = 1;
        while (i11 < i10 - i11) {
            i11 += i11;
        }
        for (int i12 = i11; i12 > 0; i12 >>>= 1) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10 - i12; i14++) {
                if ((i14 & i12) == 0) {
                    int i15 = i + i14;
                    int i16 = i15 + i12;
                    long j10 = jArr[i16];
                    long j11 = jArr[i15];
                    long j12 = (j10 ^ j11) & (-((j10 - j11) >>> 63));
                    jArr[i15] = j11 ^ j12;
                    jArr[i16] = jArr[i16] ^ j12;
                }
            }
            for (int i17 = i11; i17 > i12; i17 >>>= 1) {
                while (i13 < i10 - i17) {
                    if ((i13 & i12) == 0) {
                        int i18 = i + i13;
                        int i19 = i18 + i12;
                        long j13 = jArr[i19];
                        for (int i20 = i17; i20 > i12; i20 >>>= 1) {
                            int i21 = i18 + i20;
                            long j14 = jArr[i21];
                            long j15 = (-((j14 - j13) >>> 63)) & (j13 ^ j14);
                            j13 ^= j15;
                            jArr[i21] = j14 ^ j15;
                        }
                        jArr[i19] = j13;
                    }
                    i13++;
                }
            }
        }
    }

    private void synd(short[] sArr, short[] sArr2, short[] sArr3, byte[] bArr) {
        for (int i = 0; i < this.SYS_T * 2; i++) {
            sArr[i] = 0;
        }
        for (int i9 = 0; i9 < this.SYS_N; i9++) {
            short s10 = (short) ((bArr[i9 / 8] >> (i9 % 8)) & 1);
            short eval = eval(sArr2, sArr3[i9]);
            GF gf = this.gf;
            short gf_inv = gf.gf_inv(gf.gf_mul(eval, eval));
            for (int i10 = 0; i10 < this.SYS_T * 2; i10++) {
                GF gf2 = this.gf;
                sArr[i10] = gf2.gf_add(sArr[i10], gf2.gf_mul(gf_inv, s10));
                gf_inv = this.gf.gf_mul(gf_inv, sArr3[i9]);
            }
        }
    }

    private void syndrome(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        short[] sArr = new short[this.SYS_N / 8];
        int i = this.PK_NROWS % 8;
        for (int i9 = 0; i9 < this.SYND_BYTES; i9++) {
            bArr[i9] = 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.PK_NROWS; i11++) {
            for (int i12 = 0; i12 < this.SYS_N / 8; i12++) {
                sArr[i12] = 0;
            }
            int i13 = 0;
            while (true) {
                int i14 = this.PK_ROW_BYTES;
                if (i13 >= i14) {
                    break;
                }
                sArr[((this.SYS_N / 8) - i14) + i13] = bArr2[i10 + i13];
                i13++;
            }
            if (this.usePadding) {
                for (int i15 = (this.SYS_N / 8) - 1; i15 >= (this.SYS_N / 8) - this.PK_ROW_BYTES; i15--) {
                    sArr[i15] = (short) ((((sArr[i15] & 255) << i) | ((sArr[i15 - 1] & 255) >>> (8 - i))) & 255);
                }
            }
            int i16 = i11 / 8;
            int i17 = i11 % 8;
            sArr[i16] = (short) (sArr[i16] | (1 << i17));
            byte b9 = 0;
            for (int i18 = 0; i18 < this.SYS_N / 8; i18++) {
                b9 = (byte) (b9 ^ (sArr[i18] & bArr3[i18]));
            }
            byte b10 = (byte) ((b9 >>> 4) ^ b9);
            byte b11 = (byte) (b10 ^ (b10 >>> 2));
            bArr[i16] = (byte) ((((byte) (1 & ((byte) (b11 ^ (b11 >>> 1))))) << i17) | bArr[i16]);
            i10 += this.PK_ROW_BYTES;
        }
    }

    public int check_c_padding(byte[] bArr) {
        return ((byte) ((((byte) (((byte) ((bArr[this.SYND_BYTES - 1] & 255) >>> (this.PK_NROWS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public int check_pk_padding(byte[] bArr) {
        byte b9 = 0;
        for (int i = 0; i < this.PK_NROWS; i++) {
            int i9 = this.PK_ROW_BYTES;
            b9 = (byte) (b9 | bArr[((i * i9) + i9) - 1]);
        }
        return ((byte) ((((byte) (((byte) ((b9 & 255) >>> (this.PK_NCOLS % 8))) - 1)) & 255) >>> 7)) - 1;
    }

    public byte[] decompress_private_key(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[getPrivateKeySize()];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i9 = ((1 << this.GFBITS) * 4) + (this.SYS_N / 8) + this.IRR_BYTES;
        int i10 = i9 + 32;
        byte[] bArr3 = new byte[i10];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i10);
        if (bArr.length <= 40) {
            short[] sArr = new short[this.SYS_T];
            int i11 = this.IRR_BYTES;
            byte[] bArr4 = new byte[i11];
            int i12 = i9 - i11;
            for (int i13 = 0; i13 < this.SYS_T; i13++) {
                sArr[i13] = Utils.load_gf(bArr3, (i13 * 2) + i12, this.GFMASK);
            }
            generate_irr_poly(sArr);
            for (int i14 = 0; i14 < this.SYS_T; i14++) {
                Utils.store_gf(bArr4, i14 * 2, sArr[i14]);
            }
            System.arraycopy(bArr4, 0, bArr2, 40, this.IRR_BYTES);
        }
        int length = bArr.length;
        int i15 = this.IRR_BYTES;
        if (length <= i15 + 40) {
            int i16 = this.GFBITS;
            int[] iArr = new int[1 << i16];
            short[] sArr2 = new short[1 << i16];
            int i17 = (i9 - i15) - ((1 << i16) * 4);
            int i18 = 0;
            while (true) {
                i = this.GFBITS;
                if (i18 >= (1 << i)) {
                    break;
                }
                iArr[i18] = Utils.load4(bArr3, (i18 * 4) + i17);
                i18++;
            }
            if (this.usePivots) {
                pk_gen(null, bArr2, iArr, sArr2, new long[]{0});
            } else {
                int i19 = 1 << i;
                long[] jArr = new long[i19];
                for (int i20 = 0; i20 < (1 << this.GFBITS); i20++) {
                    long j10 = iArr[i20];
                    jArr[i20] = j10;
                    long j11 = j10 << 31;
                    jArr[i20] = j11;
                    long j12 = j11 | i20;
                    jArr[i20] = j12;
                    jArr[i20] = j12 & Long.MAX_VALUE;
                }
                sort64(jArr, 0, i19);
                for (int i21 = 0; i21 < (1 << this.GFBITS); i21++) {
                    sArr2[i21] = (short) (jArr[i21] & this.GFMASK);
                }
            }
            int i22 = this.COND_BYTES;
            byte[] bArr5 = new byte[i22];
            controlbitsfrompermutation(bArr5, sArr2, this.GFBITS, 1 << r2);
            System.arraycopy(bArr5, 0, bArr2, this.IRR_BYTES + 40, i22);
        }
        int privateKeySize = getPrivateKeySize();
        int i23 = this.SYS_N;
        System.arraycopy(bArr3, 0, bArr2, privateKeySize - (i23 / 8), i23 / 8);
        return bArr2;
    }

    public byte[] generate_public_key_from_private_key(byte[] bArr) {
        byte[] bArr2 = new byte[getPublicKeySize()];
        int i = this.GFBITS;
        short[] sArr = new short[1 << i];
        long[] jArr = {0};
        int[] iArr = new int[1 << i];
        int i9 = ((1 << i) * 4) + (this.SYS_N / 8);
        byte[] bArr3 = new byte[i9];
        int i10 = ((i9 - 32) - this.IRR_BYTES) - ((1 << i) * 4);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 64);
        sHAKEDigest.update(bArr, 0, 32);
        sHAKEDigest.doFinal(bArr3, 0, i9);
        for (int i11 = 0; i11 < (1 << this.GFBITS); i11++) {
            iArr[i11] = Utils.load4(bArr3, (i11 * 4) + i10);
        }
        pk_gen(bArr2, bArr, iArr, sArr, jArr);
        return bArr2;
    }

    public int getCipherTextSize() {
        return this.SYND_BYTES + 32;
    }

    public int getCondBytes() {
        return this.COND_BYTES;
    }

    public int getDefaultSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getIrrBytes() {
        return this.IRR_BYTES;
    }

    public int getPrivateKeySize() {
        return (this.SYS_N / 8) + this.COND_BYTES + this.IRR_BYTES + 40;
    }

    public int getPublicKeySize() {
        if (!this.usePadding) {
            return (this.PK_NROWS * this.PK_NCOLS) / 8;
        }
        int i = this.PK_NROWS;
        return ((this.SYS_N / 8) - ((i - 1) / 8)) * i;
    }

    public int kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[32];
        int i = this.SYS_N / 8;
        byte[] bArr5 = new byte[i];
        int check_c_padding = this.usePadding ? check_c_padding(bArr2) : 0;
        byte decrypt = (byte) decrypt(bArr5, bArr3, bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 2);
        sHAKEDigest.update(bArr5, 0, i);
        sHAKEDigest.doFinal(bArr4, 0, 32);
        byte b9 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            b9 = (byte) (b9 | (bArr4[i9] ^ bArr2[this.SYND_BYTES + i9]));
        }
        short s10 = (short) (((short) (((short) (((short) (decrypt | b9)) - 1)) >> 8)) & 255);
        int i10 = this.SYND_BYTES + 32 + (this.SYS_N / 8) + 1;
        byte[] bArr6 = new byte[i10];
        bArr6[0] = (byte) (s10 & 1);
        int i11 = 0;
        while (i11 < this.SYS_N / 8) {
            int i12 = i11 + 1;
            bArr6[i12] = (byte) ((bArr3[i11 + 40 + this.IRR_BYTES + this.COND_BYTES] & (~s10)) | (bArr5[i11] & s10));
            i11 = i12;
        }
        for (int i13 = 0; i13 < this.SYND_BYTES + 32; i13++) {
            bArr6[(this.SYS_N / 8) + 1 + i13] = bArr2[i13];
        }
        SHAKEDigest sHAKEDigest2 = new SHAKEDigest(256);
        sHAKEDigest2.update(bArr6, 0, i10);
        sHAKEDigest2.doFinal(bArr, 0, bArr.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b10 = (byte) check_c_padding;
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr[i14] = (byte) (bArr[i14] | b10);
        }
        return check_c_padding;
    }

    public int kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int i = this.SYS_N / 8;
        byte[] bArr4 = new byte[i];
        int check_pk_padding = this.usePadding ? check_pk_padding(bArr3) : 0;
        encrypt(bArr, bArr3, bArr4, secureRandom);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update((byte) 2);
        sHAKEDigest.update(bArr4, 0, i);
        sHAKEDigest.doFinal(bArr, this.SYND_BYTES, 32);
        sHAKEDigest.update((byte) 1);
        sHAKEDigest.update(bArr4, 0, i);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        if (!this.usePadding) {
            return 0;
        }
        byte b9 = (byte) (((byte) check_pk_padding) ^ 255);
        for (int i9 = 0; i9 < this.SYND_BYTES + 32; i9++) {
            bArr[i9] = (byte) (bArr[i9] & b9);
        }
        for (int i10 = 0; i10 < 32; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] & b9);
        }
        return check_pk_padding;
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i;
        int i9;
        short[] sArr;
        byte[] bArr3;
        SHAKEDigest sHAKEDigest;
        int i10;
        long j10;
        int i11 = 32;
        byte[] bArr4 = new byte[32];
        int i12 = 0;
        byte[] bArr5 = {64};
        secureRandom.nextBytes(bArr4);
        int i13 = (this.SYS_T * 2) + ((1 << this.GFBITS) * 4) + (this.SYS_N / 8);
        int i14 = i13 + 32;
        byte[] bArr6 = new byte[i14];
        long[] jArr = {0};
        SHAKEDigest sHAKEDigest2 = new SHAKEDigest(256);
        byte[] bArr7 = bArr4;
        while (true) {
            sHAKEDigest2.update(bArr5, i12, 1);
            sHAKEDigest2.update(bArr4, i12, bArr4.length);
            sHAKEDigest2.doFinal(bArr6, i12, i14);
            byte[] copyOfRange = Arrays.copyOfRange(bArr6, i13, i13 + 32);
            System.arraycopy(bArr7, i12, bArr2, i12, i11);
            byte[] copyOfRange2 = Arrays.copyOfRange(copyOfRange, i12, i11);
            int i15 = this.SYS_T;
            short[] sArr2 = new short[i15];
            int i16 = i13 - (i15 * 2);
            for (int i17 = i12; i17 < this.SYS_T; i17++) {
                sArr2[i17] = Utils.load_gf(bArr6, (i17 * 2) + i16, this.GFMASK);
            }
            if (generate_irr_poly(sArr2) != -1) {
                for (int i18 = i12; i18 < this.SYS_T; i18++) {
                    Utils.store_gf(bArr2, (i18 * 2) + 40, sArr2[i18]);
                }
                int i19 = this.GFBITS;
                int[] iArr = new int[1 << i19];
                i = i16 - ((1 << i19) * 4);
                int i20 = 0;
                while (true) {
                    i9 = this.GFBITS;
                    if (i20 >= (1 << i9)) {
                        break;
                    }
                    iArr[i20] = Utils.load4(bArr6, (i20 * 4) + i);
                    i20++;
                }
                sArr = new short[1 << i9];
                bArr3 = copyOfRange;
                sHAKEDigest = sHAKEDigest2;
                if (pk_gen(bArr, bArr2, iArr, sArr, jArr) != -1) {
                    break;
                }
            } else {
                bArr3 = copyOfRange;
                sHAKEDigest = sHAKEDigest2;
            }
            bArr7 = copyOfRange2;
            bArr4 = bArr3;
            sHAKEDigest2 = sHAKEDigest;
            i11 = 32;
            i12 = 0;
        }
        int i21 = this.COND_BYTES;
        byte[] bArr8 = new byte[i21];
        controlbitsfrompermutation(bArr8, sArr, this.GFBITS, 1 << r2);
        System.arraycopy(bArr8, 0, bArr2, this.IRR_BYTES + 40, i21);
        int i22 = this.SYS_N;
        System.arraycopy(bArr6, i - (i22 / 8), bArr2, bArr2.length - (i22 / 8), i22 / 8);
        if (this.usePivots) {
            i10 = 32;
            j10 = jArr[0];
        } else {
            j10 = BodyPartID.bodyIdMax;
            i10 = 32;
        }
        Utils.store8(bArr2, i10, j10);
    }
}
