package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b9);

    void update(byte[] bArr, int i, int i9);
}
