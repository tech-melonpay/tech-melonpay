package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

/* loaded from: classes3.dex */
public class JcaTlsEdDSAVerifier implements TlsVerifier {
    protected final String algorithmName;
    protected final short algorithmType;
    protected final JcaTlsCrypto crypto;
    protected final PublicKey publicKey;

    public JcaTlsEdDSAVerifier(JcaTlsCrypto jcaTlsCrypto, PublicKey publicKey, short s10, String str) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (publicKey == null) {
            throw new NullPointerException("publicKey");
        }
        this.crypto = jcaTlsCrypto;
        this.publicKey = publicKey;
        this.algorithmType = s10;
        this.algorithmName = str;
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != this.algorithmType || algorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final byte[] signature = digitallySigned.getSignature();
        try {
            final Signature createSignature = this.crypto.getHelper().createSignature(this.algorithmName);
            createSignature.initVerify(this.publicKey);
            final OutputStream createStream = OutputStreamFactory.createStream(createSignature);
            return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsEdDSAVerifier.1
                @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
                public OutputStream getOutputStream() {
                    return createStream;
                }

                @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
                public boolean isVerified() {
                    try {
                        return createSignature.verify(signature);
                    } catch (SignatureException e10) {
                        throw new IOException(e10.getMessage());
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException(a.n(new StringBuilder(), this.algorithmName, " verification failed"), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
