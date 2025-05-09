package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SPHINCS256Signer implements MessageSigner {
    private final HashFunctions hashFunctions;
    private byte[] keyData;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
        }
        if (digest2.getDigestSize() != 64) {
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        this.hashFunctions = new HashFunctions(digest, digest2);
    }

    public static void compute_authpath_wots(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, Tree.leafaddr leafaddrVar, byte[] bArr3, byte[] bArr4, int i9) {
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr(leafaddrVar);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j10 = leafaddrVar2.subleaf;
            if (j10 >= 32) {
                break;
            }
            Seed.get_seed(hashFunctions, bArr6, (int) (j10 * 32), bArr3, leafaddrVar2);
            leafaddrVar2.subleaf++;
        }
        Wots wots = new Wots();
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j11 = leafaddrVar2.subleaf;
            if (j11 >= 32) {
                break;
            }
            wots.wots_pkgen(hashFunctions, bArr7, (int) (j11 * 2144), bArr6, (int) (j11 * 32), bArr4, 0);
            leafaddrVar2.subleaf++;
        }
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j12 = leafaddrVar2.subleaf;
            if (j12 >= 32) {
                break;
            }
            Tree.l_tree(hashFunctions, bArr5, (int) ((j12 * 32) + 1024), bArr7, (int) (j12 * 2144), bArr4, 0);
            leafaddrVar2.subleaf++;
        }
        int i10 = 0;
        for (int i11 = 32; i11 > 0; i11 >>>= 1) {
            for (int i12 = 0; i12 < i11; i12 += 2) {
                hashFunctions.hash_2n_n_mask(bArr5, ((i12 >>> 1) * 32) + ((i11 >>> 1) * 32), bArr5, (i12 * 32) + (i11 * 32), bArr4, (i10 + 7) * 64);
            }
            i10++;
        }
        int i13 = (int) leafaddrVar.subleaf;
        for (int i14 = 0; i14 < i9; i14++) {
            System.arraycopy(bArr5, (((i13 >>> i14) ^ 1) * 32) + ((32 >>> i14) * 32), bArr2, (i14 * 32) + i, 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    public static void validate_authpath(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i9, byte[] bArr4, int i10) {
        byte[] bArr5 = new byte[64];
        if ((i & 1) != 0) {
            for (int i11 = 0; i11 < 32; i11++) {
                bArr5[i11 + 32] = bArr2[i11];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                bArr5[i12] = bArr3[i9 + i12];
            }
        } else {
            for (int i13 = 0; i13 < 32; i13++) {
                bArr5[i13] = bArr2[i13];
            }
            for (int i14 = 0; i14 < 32; i14++) {
                bArr5[i14 + 32] = bArr3[i9 + i14];
            }
        }
        int i15 = i9 + 32;
        int i16 = 0;
        int i17 = i;
        while (i16 < i10 - 1) {
            int i18 = i17 >>> 1;
            if ((i18 & 1) != 0) {
                hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr4, (i16 + 7) * 64);
                for (int i19 = 0; i19 < 32; i19++) {
                    bArr5[i19] = bArr3[i15 + i19];
                }
            } else {
                hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr4, (i16 + 7) * 64);
                for (int i20 = 0; i20 < 32; i20++) {
                    bArr5[i20 + 32] = bArr3[i15 + i20];
                }
            }
            i15 += 32;
            i16++;
            i17 = i18;
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr4, (i10 + 6) * 64);
    }

    private void zerobytes(byte[] bArr, int i, int i9) {
        for (int i10 = 0; i10 != i9; i10++) {
            bArr[i + i10] = 0;
        }
    }

    public byte[] crypto_sign(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i = 0; i < 1088; i++) {
            bArr9[i] = bArr2[i];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        Digest messageHash = hashFunctions.getMessageHash();
        byte[] bArr10 = new byte[messageHash.getDigestSize()];
        messageHash.update(bArr3, 40968, 32);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr10, 0);
        zerobytes(bArr3, 40968, 32);
        for (int i9 = 0; i9 != 8; i9++) {
            jArr[i9] = Pack.littleEndianToLong(bArr10, i9 * 8);
        }
        long j10 = jArr[0] & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        leafaddrVar.level = 11;
        leafaddrVar.subtree = 0L;
        leafaddrVar.subleaf = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        Tree.treehash(hashFunctions, bArr3, 40968, 5, bArr9, leafaddrVar, bArr3, 39944);
        Digest messageHash2 = hashFunctions.getMessageHash();
        messageHash2.update(bArr3, 39912, 1088);
        messageHash2.update(bArr, 0, bArr.length);
        messageHash2.doFinal(bArr5, 0);
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr();
        leafaddrVar2.level = 12;
        leafaddrVar2.subleaf = (int) (r19 & 31);
        leafaddrVar2.subtree = j10 >>> 5;
        for (int i10 = 0; i10 < 32; i10++) {
            bArr3[i10] = bArr4[i10];
        }
        byte[] bArr11 = bArr8;
        System.arraycopy(bArr9, 32, bArr11, 0, 1024);
        for (int i11 = 0; i11 < 8; i11++) {
            bArr3[32 + i11] = (byte) ((j10 >>> (i11 * 8)) & 255);
        }
        Seed.get_seed(hashFunctions, bArr7, 0, bArr9, leafaddrVar2);
        new Horst();
        int horst_sign = 40 + Horst.horst_sign(hashFunctions, bArr3, 40, bArr6, bArr7, bArr11, bArr5);
        Wots wots = new Wots();
        int i12 = horst_sign;
        int i13 = 0;
        for (int i14 = 12; i13 < i14; i14 = 12) {
            leafaddrVar2.level = i13;
            Seed.get_seed(hashFunctions, bArr7, 0, bArr9, leafaddrVar2);
            int i15 = i12;
            int i16 = i13;
            byte[] bArr12 = bArr11;
            wots.wots_sign(hashFunctions, bArr3, i12, bArr6, bArr7, bArr12);
            compute_authpath_wots(hashFunctions, bArr6, bArr3, i15 + 2144, leafaddrVar2, bArr9, bArr12, 5);
            i12 = i15 + 2304;
            long j11 = leafaddrVar2.subtree;
            leafaddrVar2.subleaf = (int) (j11 & 31);
            leafaddrVar2.subtree = j11 >>> 5;
            i13 = i16 + 1;
            bArr11 = bArr11;
        }
        zerobytes(bArr9, 0, 1088);
        return bArr3;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return crypto_sign(this.hashFunctions, bArr, this.keyData);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!z10) {
            this.keyData = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof ParametersWithRandom) {
            this.keyData = ((SPHINCSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.keyData = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    public boolean verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new IllegalArgumentException("signature wrong size");
        }
        byte[] bArr9 = new byte[64];
        for (int i = 0; i < 1056; i++) {
            bArr8[i] = bArr3[i];
        }
        byte[] bArr10 = new byte[32];
        for (int i9 = 0; i9 < 32; i9++) {
            bArr10[i9] = bArr2[i9];
        }
        System.arraycopy(bArr2, 0, bArr7, 0, 41000);
        Digest messageHash = hashFunctions.getMessageHash();
        messageHash.update(bArr10, 0, 32);
        messageHash.update(bArr8, 0, 1056);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr9, 0);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 ^= (bArr7[32 + i10] & 255) << (i10 * 8);
        }
        new Horst();
        Horst.horst_verify(hashFunctions, bArr6, bArr7, 40, bArr8, bArr9);
        Wots wots = new Wots();
        int i11 = 0;
        int i12 = 13352;
        while (i11 < 12) {
            int i13 = i12;
            wots.wots_verify(hashFunctions, bArr4, bArr7, i12, bArr6, bArr8);
            Tree.l_tree(hashFunctions, bArr5, 0, bArr4, 0, bArr8, 0);
            byte[] bArr11 = bArr8;
            byte[] bArr12 = bArr7;
            byte[] bArr13 = bArr6;
            validate_authpath(hashFunctions, bArr6, bArr5, (int) (31 & j10), bArr12, i13 + 2144, bArr11, 5);
            j10 >>= 5;
            i12 = i13 + 2304;
            i11++;
            bArr8 = bArr11;
            bArr7 = bArr12;
            bArr6 = bArr13;
            bArr5 = bArr5;
        }
        byte[] bArr14 = bArr8;
        byte[] bArr15 = bArr6;
        boolean z10 = true;
        for (int i14 = 0; i14 < 32; i14++) {
            if (bArr15[i14] != bArr14[i14 + 1024]) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return verify(this.hashFunctions, bArr, bArr2, this.keyData);
    }
}
