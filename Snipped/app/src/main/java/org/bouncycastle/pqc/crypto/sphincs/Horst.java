package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes3.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    public static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    public static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i9 = 0; i9 < 65536; i9++) {
            hashFunctions.hash_n_n(bArr7, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH + i9) * 32, bArr6, i9 * 32);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            long j10 = (1 << (16 - i10)) - 1;
            int i11 = 1 << (15 - i10);
            long j11 = i11 - 1;
            int i12 = 0;
            while (i12 < i11) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((i12 + j11) * 32), bArr7, (int) (((i12 * 2) + j10) * 32), bArr4, i10 * 64);
                i12++;
                i11 = i11;
                j11 = j11;
            }
        }
        int i13 = 2016;
        int i14 = i;
        while (i13 < 4064) {
            bArr[i14] = bArr7[i13];
            i13++;
            i14++;
        }
        for (int i15 = 0; i15 < 32; i15++) {
            int i16 = i15 * 2;
            int i17 = (bArr5[i16] & 255) + ((bArr5[i16 + 1] & 255) << 8);
            int i18 = 0;
            while (i18 < 32) {
                bArr[i14] = bArr6[(i17 * 32) + i18];
                i18++;
                i14++;
            }
            int i19 = i17 + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            for (int i20 = 0; i20 < 10; i20++) {
                int i21 = (i19 & 1) != 0 ? i19 + 1 : i19 - 1;
                int i22 = 0;
                while (i22 < 32) {
                    bArr[i14] = bArr7[(i21 * 32) + i22];
                    i22++;
                    i14++;
                }
                i19 = (i21 - 1) / 2;
            }
        }
        for (int i23 = 0; i23 < 32; i23++) {
            bArr2[i23] = bArr7[i23];
        }
        return HORST_SIGBYTES;
    }

    public static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[1024];
        int i9 = i + 2048;
        int i10 = 0;
        while (i10 < 32) {
            int i11 = i10 * 2;
            int i12 = (bArr4[i11] & 255) + ((bArr4[i11 + 1] & 255) << 8);
            if ((i12 & 1) == 0) {
                hashFunctions.hash_n_n(bArr5, 0, bArr2, i9);
                for (int i13 = 0; i13 < 32; i13++) {
                    bArr5[i13 + 32] = bArr2[i9 + 32 + i13];
                }
            } else {
                hashFunctions.hash_n_n(bArr5, 32, bArr2, i9);
                for (int i14 = 0; i14 < 32; i14++) {
                    bArr5[i14] = bArr2[i9 + 32 + i14];
                }
            }
            int i15 = i9 + 64;
            int i16 = 1;
            while (i16 < 10) {
                int i17 = i12 >>> 1;
                if ((i17 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr3, (i16 - 1) * 64);
                    for (int i18 = 0; i18 < 32; i18++) {
                        bArr5[i18 + 32] = bArr2[i15 + i18];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr3, (i16 - 1) * 64);
                    for (int i19 = 0; i19 < 32; i19++) {
                        bArr5[i19] = bArr2[i15 + i19];
                    }
                }
                i15 += 32;
                i16++;
                i12 = i17;
            }
            int i20 = i12 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr3, 576);
            for (int i21 = 0; i21 < 32; i21++) {
                if (bArr2[(i20 * 32) + i + i21] != bArr5[i21]) {
                    for (int i22 = 0; i22 < 32; i22++) {
                        bArr[i22] = 0;
                    }
                    return -1;
                }
            }
            i10++;
            i9 = i15;
        }
        for (int i23 = 0; i23 < 32; i23++) {
            hashFunctions.hash_2n_n_mask(bArr5, i23 * 32, bArr2, (i23 * 64) + i, bArr3, 640);
        }
        for (int i24 = 0; i24 < 16; i24++) {
            hashFunctions.hash_2n_n_mask(bArr5, i24 * 32, bArr5, i24 * 64, bArr3, 704);
        }
        for (int i25 = 0; i25 < 8; i25++) {
            hashFunctions.hash_2n_n_mask(bArr5, i25 * 32, bArr5, i25 * 64, bArr3, 768);
        }
        for (int i26 = 0; i26 < 4; i26++) {
            hashFunctions.hash_2n_n_mask(bArr5, i26 * 32, bArr5, i26 * 64, bArr3, 832);
        }
        for (int i27 = 0; i27 < 2; i27++) {
            hashFunctions.hash_2n_n_mask(bArr5, i27 * 32, bArr5, i27 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr3, 960);
        return 0;
    }
}
