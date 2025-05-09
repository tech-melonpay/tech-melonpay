package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface StreamCipher {
    String getAlgorithmName();

    void init(boolean z10, CipherParameters cipherParameters);

    int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10);

    void reset();

    byte returnByte(byte b9);
}
