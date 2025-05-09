package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Mac {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getMacSize();

    void init(CipherParameters cipherParameters);

    void reset();

    void update(byte b9);

    void update(byte[] bArr, int i, int i9);
}
