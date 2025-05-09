package org.bouncycastle.pqc.crypto.qtesla;

import org.bouncycastle.crypto.digests.CSHAKEDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes3.dex */
class HashUtils {
    static final int SECURE_HASH_ALGORITHM_KECCAK_128_RATE = 168;
    static final int SECURE_HASH_ALGORITHM_KECCAK_256_RATE = 136;

    public static void customizableSecureHashAlgorithmKECCAK128Simple(byte[] bArr, int i, int i9, short s10, byte[] bArr2, int i10, int i11) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(128, null, new byte[]{(byte) s10, (byte) (s10 >> 8)});
        cSHAKEDigest.update(bArr2, i10, i11);
        cSHAKEDigest.doFinal(bArr, i, i9);
    }

    public static void customizableSecureHashAlgorithmKECCAK256Simple(byte[] bArr, int i, int i9, short s10, byte[] bArr2, int i10, int i11) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(256, null, new byte[]{(byte) s10, (byte) (s10 >> 8)});
        cSHAKEDigest.update(bArr2, i10, i11);
        cSHAKEDigest.doFinal(bArr, i, i9);
    }

    public static void secureHashAlgorithmKECCAK128(byte[] bArr, int i, int i9, byte[] bArr2, int i10, int i11) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr2, i10, i11);
        sHAKEDigest.doFinal(bArr, i, i9);
    }

    public static void secureHashAlgorithmKECCAK256(byte[] bArr, int i, int i9, byte[] bArr2, int i10, int i11) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, i10, i11);
        sHAKEDigest.doFinal(bArr, i, i9);
    }
}
