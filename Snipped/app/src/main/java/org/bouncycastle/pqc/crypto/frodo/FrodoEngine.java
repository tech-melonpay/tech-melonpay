package org.bouncycastle.pqc.crypto.frodo;

import androidx.camera.core.impl.utils.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    private static final int nbar = 8;

    /* renamed from: B, reason: collision with root package name */
    private final int f25356B;

    /* renamed from: D, reason: collision with root package name */
    private final int f25357D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* renamed from: n, reason: collision with root package name */
    private final int f25358n;

    /* renamed from: q, reason: collision with root package name */
    private final int f25359q;

    public FrodoEngine(int i, int i9, int i10, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f25358n = i;
        this.f25357D = i9;
        this.f25359q = 1 << i9;
        this.f25356B = i10;
        int i11 = i10 * 64;
        this.len_mu = i11;
        this.len_seedSE = i11;
        this.len_s = i11;
        this.len_k = i11;
        this.len_pkh = i11;
        this.len_ss = i11;
        this.len_mu_bytes = i11 / 8;
        this.len_seedSE_bytes = i11 / 8;
        int i12 = i11 / 8;
        this.len_s_bytes = i12;
        this.len_k_bytes = i11 / 8;
        int i13 = i11 / 8;
        this.len_pkh_bytes = i13;
        this.len_ss_bytes = i11 / 8;
        int i14 = ((i9 * i) * 8) / 8;
        this.len_ct_bytes = a.b(i9, 64, 8, i14);
        int i15 = i14 + 16;
        this.len_pk_bytes = i15;
        this.len_sk_bytes = (i * 16) + i13 + i12 + i15;
        this.T_chi = sArr;
        this.digest = xof;
        this.gen = frodoMatrixGenerator;
    }

    private byte[] ctselect(byte[] bArr, byte[] bArr2, short s10) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (((~s10) & bArr[i] & 255) | (bArr2[i] & s10 & 255));
        }
        return bArr3;
    }

    private short ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short s10 = 0;
        for (short s11 = 0; s11 < sArr.length; s11 = (short) (s11 + 1)) {
            s10 = (short) (s10 | (sArr[s11] ^ sArr3[s11]));
        }
        for (short s12 = 0; s12 < sArr2.length; s12 = (short) (s12 + 1)) {
            s10 = (short) ((sArr2[s12] ^ sArr4[s12]) | s10);
        }
        return s10 == 0 ? (short) 0 : (short) -1;
    }

    private byte[] decode(short[] sArr) {
        int i = this.f25356B;
        short s10 = (short) ((1 << i) - 1);
        short s11 = (short) ((1 << this.f25357D) - 1);
        byte[] bArr = new byte[i * 8];
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = sArr[i9] & s11;
                int i13 = this.f25357D;
                j10 |= (((short) ((i12 + (1 << ((i13 - r14) - 1))) >> (i13 - r14))) & s10) << (this.f25356B * i11);
                i9++;
            }
            int i14 = 0;
            while (true) {
                int i15 = this.f25356B;
                if (i14 < i15) {
                    bArr[(i15 * i10) + i14] = (byte) ((j10 >> (i14 * 8)) & 255);
                    i14++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i;
        short[] sArr = new short[64];
        int i9 = 0;
        byte b9 = 1;
        for (int i10 = 0; i10 < 8; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    i = this.f25356B;
                    if (i12 < i) {
                        if ((bArr[i9] & b9) == b9) {
                            i13 += 1 << i12;
                        }
                        b9 = (byte) (b9 << 1);
                        if (b9 == 0) {
                            i9++;
                            b9 = 1;
                        }
                        i12++;
                    }
                }
                sArr[(i10 * 8) + i11] = (short) ((this.f25359q / (1 << i)) * i13);
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i, int i9) {
        short[] sArr3 = new short[i * i9];
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i10 * i9) + i11;
                sArr3[i12] = (short) (((sArr[i12] & 65535) + (65535 & sArr2[i12])) % this.f25359q);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i, int i9, short[] sArr2, int i10, int i11) {
        short[] sArr3 = new short[i * i11];
        for (int i12 = 0; i12 < i; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i9; i14++) {
                    int i15 = (i12 * i11) + i13;
                    sArr3[i15] = (short) (65535 & (((sArr[(i12 * i9) + i14] & 65535) * (sArr2[(i14 * i11) + i13] & 65535)) + (sArr3[i15] & 65535)));
                }
                int i16 = (i12 * i11) + i13;
                sArr3[i16] = (short) (65535 & ((sArr3[i16] & 65535) % this.f25359q));
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i, int i9) {
        short[] sArr3 = new short[i * i9];
        for (int i10 = 0; i10 < i; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = (i10 * i9) + i11;
                sArr3[i12] = (short) (((sArr[i12] - sArr2[i12]) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) % this.f25359q);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i, int i9) {
        short[] sArr2 = new short[i * i9];
        for (int i10 = 0; i10 < i9; i10++) {
            for (int i11 = 0; i11 < i; i11++) {
                sArr2[(i10 * i) + i11] = sArr[(i11 * i9) + i10];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i = (this.f25357D * length) / 8;
        byte[] bArr = new byte[i];
        short s10 = 0;
        short s11 = 0;
        byte b9 = 0;
        short s12 = 0;
        while (s10 < i && (s11 < length || (s11 == length && b9 > 0))) {
            byte b10 = 0;
            while (b10 < 8) {
                int i9 = 8 - b10;
                int min = Math.min(i9, (int) b9);
                int i10 = b9 - min;
                bArr[s10] = (byte) (bArr[s10] + (((byte) (((short) ((1 << min) - 1)) & (s12 >> i10))) << (i9 - min)));
                b10 = (byte) (b10 + min);
                b9 = (byte) i10;
                if (b9 == 0) {
                    if (s11 >= length) {
                        break;
                    }
                    short s13 = sArr[s11];
                    s11 = (short) (s11 + 1);
                    s12 = s13;
                    b9 = (byte) this.f25357D;
                }
            }
            if (b10 == 8) {
                s10 = (short) (s10 + 1);
            }
        }
        return bArr;
    }

    private short sample(short s10) {
        int i = s10 & 65535;
        short s11 = (short) (i >>> 1);
        int i9 = 0;
        short s12 = 0;
        while (true) {
            short[] sArr = this.T_chi;
            if (i9 >= sArr.length) {
                break;
            }
            if (s11 > sArr[i9]) {
                s12 = (short) (s12 + 1);
            }
            i9++;
        }
        return i % 2 == 1 ? (short) ((s12 * (-1)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) : s12;
    }

    private short[] sample_matrix(short[] sArr, int i, int i9, int i10) {
        short[] sArr2 = new short[i9 * i10];
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (i11 * i10) + i12;
                sArr2[i13] = sample(sArr[i13 + i]);
            }
        }
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i, int i9) {
        int i10 = i * i9;
        short[] sArr = new short[i10];
        short s10 = 0;
        short s11 = 0;
        byte b9 = 0;
        byte b10 = 0;
        while (s10 < i10 && (s11 < bArr.length || (s11 == bArr.length && b9 > 0))) {
            byte b11 = 0;
            while (true) {
                int i11 = this.f25357D;
                if (b11 >= i11) {
                    break;
                }
                int min = Math.min(i11 - b11, (int) b9);
                short s12 = (short) (((1 << min) - 1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                sArr[s10] = (short) (((sArr[s10] & 65535) + ((((byte) ((((b10 & 255) >>> ((b9 & 255) - min)) & (s12 & 65535)) & 255)) & 255) << ((this.f25357D - (b11 & 255)) - min))) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                b11 = (byte) (b11 + min);
                byte b12 = (byte) (b9 - min);
                byte b13 = (byte) ((~(s12 << b12)) & b10);
                if (b12 != 0) {
                    b10 = b13;
                    b9 = b12;
                } else {
                    if (s11 >= bArr.length) {
                        b10 = b13;
                        b9 = b12;
                        break;
                    }
                    byte b14 = bArr[s11];
                    s11 = (short) (s11 + 1);
                    b9 = 8;
                    b10 = b14;
                }
            }
            if (b11 == this.f25357D) {
                s10 = (short) (s10 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = ((this.f25358n * 8) * this.f25357D) / 8;
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, i, a.b(this.f25357D, 64, 8, i));
        int i9 = this.len_s_bytes;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr3, 0, i9);
        int i10 = i9 + 16;
        byte[] copyOfRange4 = Arrays.copyOfRange(bArr3, i9, i10);
        int i11 = (((this.f25357D * this.f25358n) * 8) / 8) + i10;
        byte[] copyOfRange5 = Arrays.copyOfRange(bArr3, i10, i11);
        int b9 = a.b(this.f25358n, 128, 8, i11);
        byte[] copyOfRange6 = Arrays.copyOfRange(bArr3, i11, b9);
        short[] sArr = new short[this.f25358n * 8];
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = 0;
            while (true) {
                int i14 = this.f25358n;
                if (i13 < i14) {
                    sArr[(i12 * i14) + i13] = Pack.littleEndianToShort(copyOfRange6, (i13 * 2) + (i14 * i12 * 2));
                    i13++;
                }
            }
        }
        short[] matrix_transpose = matrix_transpose(sArr, 8, this.f25358n);
        byte[] copyOfRange7 = Arrays.copyOfRange(bArr3, b9, this.len_pkh_bytes + b9);
        short[] unpack = unpack(copyOfRange, 8, this.f25358n);
        short[] unpack2 = unpack(copyOfRange2, 8, 8);
        int i15 = this.f25358n;
        byte[] decode = decode(matrix_sub(unpack2, matrix_mul(unpack, 8, i15, matrix_transpose, i15, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(copyOfRange7, 0, this.len_pkh_bytes);
        this.digest.update(decode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i16 = this.len_seedSE_bytes;
        byte[] copyOfRange8 = Arrays.copyOfRange(bArr4, i16, this.len_k_bytes + i16);
        int i17 = ((this.f25358n * 16) + 64) * 2;
        byte[] bArr5 = new byte[i17];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, i17);
        int i18 = (this.f25358n * 16) + 64;
        short[] sArr2 = new short[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            sArr2[i19] = Pack.littleEndianToShort(bArr5, i19 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr2, 0, 8, this.f25358n);
        int i20 = this.f25358n;
        short[] sample_matrix2 = sample_matrix(sArr2, i20 * 8, 8, i20);
        short[] genMatrix = this.gen.genMatrix(copyOfRange4);
        int i21 = this.f25358n;
        short[] matrix_add = matrix_add(matrix_mul(sample_matrix, 8, i21, genMatrix, i21, i21), sample_matrix2, 8, this.f25358n);
        short[] sample_matrix3 = sample_matrix(sArr2, this.f25358n * 16, 8, 8);
        short[] unpack3 = unpack(copyOfRange5, this.f25358n, 8);
        int i22 = this.f25358n;
        byte[] ctselect = ctselect(copyOfRange8, copyOfRange3, ctverify(unpack, unpack2, matrix_add, matrix_add(matrix_add(matrix_mul(sample_matrix, 8, i22, unpack3, i22, 8), sample_matrix3, 8, 8), encode(decode), 8, 8)));
        this.digest.update(copyOfRange, 0, copyOfRange.length);
        this.digest.update(copyOfRange2, 0, copyOfRange2.length);
        this.digest.update(ctselect, 0, ctselect.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i = this.len_seedSE_bytes;
        byte[] copyOfRange4 = Arrays.copyOfRange(bArr6, i, this.len_k_bytes + i);
        int i9 = ((this.f25358n * 16) + 64) * 2;
        byte[] bArr7 = new byte[i9];
        this.digest.update((byte) -106);
        this.digest.update(copyOfRange3, 0, copyOfRange3.length);
        this.digest.doFinal(bArr7, 0, i9);
        int i10 = i9 / 2;
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = Pack.littleEndianToShort(bArr7, i11 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr, 0, 8, this.f25358n);
        int i12 = this.f25358n;
        short[] sample_matrix2 = sample_matrix(sArr, i12 * 8, 8, i12);
        short[] genMatrix = this.gen.genMatrix(copyOfRange);
        int i13 = this.f25358n;
        byte[] pack = pack(matrix_add(matrix_mul(sample_matrix, 8, i13, genMatrix, i13, i13), sample_matrix2, 8, this.f25358n));
        short[] sample_matrix3 = sample_matrix(sArr, this.f25358n * 16, 8, 8);
        short[] unpack = unpack(copyOfRange2, this.f25358n, 8);
        int i14 = this.f25358n;
        byte[] pack2 = pack(matrix_add(matrix_add(matrix_mul(sample_matrix, 8, i14, unpack, i14, 8), sample_matrix3, 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(Arrays.concatenate(pack, pack2), 0, bArr, 0, this.len_ct_bytes);
        this.digest.update(pack, 0, pack.length);
        this.digest.update(pack2, 0, pack2.length);
        this.digest.update(copyOfRange4, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i = this.len_s_bytes;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, i, this.len_seedSE_bytes + i);
        int i9 = this.len_s_bytes;
        int i10 = this.len_seedSE_bytes;
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr3, i9 + i10, i9 + i10 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(copyOfRange3, 0, copyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] genMatrix = this.gen.genMatrix(bArr4);
        int i11 = this.f25358n * 32;
        byte[] bArr5 = new byte[i11];
        this.digest.update((byte) 95);
        this.digest.update(copyOfRange2, 0, copyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i11);
        int i12 = this.f25358n * 16;
        short[] sArr = new short[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            sArr[i13] = Pack.littleEndianToShort(bArr5, i13 * 2);
        }
        short[] sample_matrix = sample_matrix(sArr, 0, 8, this.f25358n);
        short[] matrix_transpose = matrix_transpose(sample_matrix, 8, this.f25358n);
        int i14 = this.f25358n;
        short[] sample_matrix2 = sample_matrix(sArr, i14 * 8, i14, 8);
        int i15 = this.f25358n;
        System.arraycopy(Arrays.concatenate(bArr4, pack(matrix_add(matrix_mul(genMatrix, i15, i15, matrix_transpose, i15, 8), sample_matrix2, this.f25358n, 8))), 0, bArr, 0, this.len_pk_bytes);
        int i16 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i16];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i16);
        System.arraycopy(Arrays.concatenate(copyOfRange, bArr), 0, bArr2, 0, this.len_s_bytes + this.len_pk_bytes);
        for (int i17 = 0; i17 < 8; i17++) {
            int i18 = 0;
            while (true) {
                int i19 = this.f25358n;
                if (i18 < i19) {
                    System.arraycopy(Pack.shortToLittleEndian(sample_matrix[(i19 * i17) + i18]), 0, bArr2, (i18 * 2) + (this.f25358n * i17 * 2) + this.len_s_bytes + this.len_pk_bytes, 2);
                    i18++;
                }
            }
        }
        int i20 = this.len_sk_bytes;
        int i21 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i20 - i21, i21);
    }
}
