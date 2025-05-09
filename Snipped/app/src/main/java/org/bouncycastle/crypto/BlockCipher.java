package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z10, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i, byte[] bArr2, int i9);

    void reset();
}
