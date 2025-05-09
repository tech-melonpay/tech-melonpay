package org.bouncycastle.openssl;

/* loaded from: classes3.dex */
public interface PEMEncryptor {
    byte[] encrypt(byte[] bArr);

    String getAlgorithm();

    byte[] getIV();
}
