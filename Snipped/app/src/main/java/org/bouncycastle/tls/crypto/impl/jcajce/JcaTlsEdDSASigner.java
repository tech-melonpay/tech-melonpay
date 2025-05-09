package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public abstract class JcaTlsEdDSASigner implements TlsSigner {
    protected final String algorithmName;
    protected final short algorithmType;
    protected final JcaTlsCrypto crypto;
    protected final PrivateKey privateKey;

    public JcaTlsEdDSASigner(JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey, short s10, String str) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (privateKey == null) {
            throw new NullPointerException("privateKey");
        }
        this.crypto = jcaTlsCrypto;
        this.privateKey = privateKey;
        this.algorithmType = s10;
        this.algorithmName = str;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != this.algorithmType || signatureAndHashAlgorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        try {
            final Signature createSignature = this.crypto.getHelper().createSignature(this.algorithmName);
            createSignature.initSign(this.privateKey);
            final OutputStream createStream = OutputStreamFactory.createStream(createSignature);
            return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsEdDSASigner.1
                @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
                public OutputStream getOutputStream() {
                    return createStream;
                }

                @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
                public byte[] getSignature() {
                    try {
                        return createSignature.sign();
                    } catch (SignatureException e10) {
                        throw new IOException(e10.getMessage());
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException(a.n(new StringBuilder(), this.algorithmName, " signature failed"), e10);
        }
    }
}
