package org.bouncycastle.tls.crypto;

/* loaded from: classes3.dex */
public interface TlsSecret {
    TlsCipher createCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9);

    TlsSecret deriveUsingPRF(int i, String str, byte[] bArr, int i9);

    void destroy();

    byte[] encrypt(TlsCertificate tlsCertificate);

    byte[] extract();

    TlsSecret hkdfExpand(short s10, byte[] bArr, int i);

    TlsSecret hkdfExtract(short s10, byte[] bArr);
}
