package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
class HashFunctions {
    private static final byte[] hashc = Strings.toByteArray("expand 32-byte to 64-byte state!");
    private final Digest dig256;
    private final Digest dig512;
    private final Permute perm;

    public HashFunctions(Digest digest) {
        this(digest, null);
    }

    public Digest getMessageHash() {
        return this.dig512;
    }

    public int hash_2n_n(byte[] bArr, int i, byte[] bArr2, int i9) {
        byte[] bArr3 = new byte[64];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr3[i10] = bArr2[i9 + i10];
            bArr3[i10 + 32] = hashc[i10];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i11 = 0; i11 < 32; i11++) {
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr2[(i9 + i11) + 32]);
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i + i12] = bArr3[i12];
        }
        return 0;
    }

    public int hash_2n_n_mask(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10) {
        byte[] bArr4 = new byte[64];
        for (int i11 = 0; i11 < 64; i11++) {
            bArr4[i11] = (byte) (bArr2[i9 + i11] ^ bArr3[i10 + i11]);
        }
        return hash_2n_n(bArr, i, bArr4, 0);
    }

    public int hash_n_n(byte[] bArr, int i, byte[] bArr2, int i9) {
        byte[] bArr3 = new byte[64];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr3[i10] = bArr2[i9 + i10];
            bArr3[i10 + 32] = hashc[i10];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i + i11] = bArr3[i11];
        }
        return 0;
    }

    public int hash_n_n_mask(byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10) {
        byte[] bArr4 = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr4[i11] = (byte) (bArr2[i9 + i11] ^ bArr3[i10 + i11]);
        }
        return hash_n_n(bArr, i, bArr4, 0);
    }

    public int varlen_hash(byte[] bArr, int i, byte[] bArr2, int i9) {
        this.dig256.update(bArr2, 0, i9);
        this.dig256.doFinal(bArr, i);
        return 0;
    }

    public HashFunctions(Digest digest, Digest digest2) {
        this.perm = new Permute();
        this.dig256 = digest;
        this.dig512 = digest2;
    }
}
