package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Wrapper {
    String getAlgorithmName();

    void init(boolean z10, CipherParameters cipherParameters);

    byte[] unwrap(byte[] bArr, int i, int i9);

    byte[] wrap(byte[] bArr, int i, int i9);
}
