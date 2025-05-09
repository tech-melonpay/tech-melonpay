package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface KeyEncapsulation {
    CipherParameters decrypt(byte[] bArr, int i, int i9, int i10);

    CipherParameters encrypt(byte[] bArr, int i, int i9);

    void init(CipherParameters cipherParameters);
}
