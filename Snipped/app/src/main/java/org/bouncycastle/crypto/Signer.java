package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Signer {
    byte[] generateSignature();

    void init(boolean z10, CipherParameters cipherParameters);

    void reset();

    void update(byte b9);

    void update(byte[] bArr, int i, int i9);

    boolean verifySignature(byte[] bArr);
}
