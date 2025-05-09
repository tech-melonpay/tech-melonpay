package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;

/* loaded from: classes3.dex */
public abstract class AbstractTlsCrypto implements TlsCrypto {
    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSecret adoptSecret(TlsSecret tlsSecret) {
        if (tlsSecret instanceof AbstractTlsSecret) {
            return createSecret(((AbstractTlsSecret) tlsSecret).copyData());
        }
        throw new IllegalArgumentException("unrecognized TlsSecret - cannot copy data: ".concat(tlsSecret.getClass().getName()));
    }

    public abstract TlsCipher createCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9);

    public abstract TlsEncryptor createEncryptor(TlsCertificate tlsCertificate);
}
