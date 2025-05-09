package org.bouncycastle.tls.crypto.impl.jcajce;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

/* loaded from: classes3.dex */
public class JcaTlsRSAPSSVerifier implements TlsVerifier {
    private final JcaTlsCrypto crypto;
    private final PublicKey publicKey;
    private final short signatureAlgorithm;

    public JcaTlsRSAPSSVerifier(JcaTlsCrypto jcaTlsCrypto, PublicKey publicKey, short s10) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (publicKey == null) {
            throw new NullPointerException("publicKey");
        }
        if (!SignatureAlgorithm.isRSAPSS(s10)) {
            throw new IllegalArgumentException("signatureAlgorithm");
        }
        this.crypto = jcaTlsCrypto;
        this.publicKey = publicKey;
        this.signatureAlgorithm = s10;
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != this.signatureAlgorithm || algorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        final byte[] signature = digitallySigned.getSignature();
        short rSAPSSHashAlgorithm = SignatureAlgorithm.getRSAPSSHashAlgorithm(this.signatureAlgorithm);
        String digestName = this.crypto.getDigestName(rSAPSSHashAlgorithm);
        String n10 = a.n(new StringBuilder(), RSAUtil.getDigestSigAlgName(digestName), "WITHRSAANDMGF1");
        try {
            final Signature createSignature = this.crypto.getHelper().createSignature(n10);
            createSignature.setParameter(RSAUtil.getPSSParameterSpec(rSAPSSHashAlgorithm, digestName, this.crypto.getHelper()));
            createSignature.initVerify(this.publicKey);
            final OutputStream createStream = OutputStreamFactory.createStream(createSignature);
            return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsRSAPSSVerifier.1
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
            throw new TlsCryptoException(v.n(n10, " verification failed"), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
