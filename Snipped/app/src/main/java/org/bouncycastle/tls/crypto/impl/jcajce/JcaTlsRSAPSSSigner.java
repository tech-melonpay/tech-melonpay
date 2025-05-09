package org.bouncycastle.tls.crypto.impl.jcajce;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public class JcaTlsRSAPSSSigner implements TlsSigner {
    private final JcaTlsCrypto crypto;
    private final PrivateKey privateKey;
    private final short signatureAlgorithm;

    public JcaTlsRSAPSSSigner(JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey, short s10) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (privateKey == null) {
            throw new NullPointerException("privateKey");
        }
        if (!SignatureAlgorithm.isRSAPSS(s10)) {
            throw new IllegalArgumentException("signatureAlgorithm");
        }
        this.crypto = jcaTlsCrypto;
        this.privateKey = privateKey;
        this.signatureAlgorithm = s10;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != this.signatureAlgorithm || signatureAndHashAlgorithm.getHash() != 8) {
            throw new IllegalStateException();
        }
        short rSAPSSHashAlgorithm = SignatureAlgorithm.getRSAPSSHashAlgorithm(this.signatureAlgorithm);
        String digestName = this.crypto.getDigestName(rSAPSSHashAlgorithm);
        String n10 = a.n(new StringBuilder(), RSAUtil.getDigestSigAlgName(digestName), "WITHRSAANDMGF1");
        try {
            AlgorithmParameterSpec pSSParameterSpec = RSAUtil.getPSSParameterSpec(rSAPSSHashAlgorithm, digestName, this.crypto.getHelper());
            final Signature createSignature = this.crypto.getHelper().createSignature(n10);
            createSignature.setParameter(pSSParameterSpec);
            createSignature.initSign(this.privateKey, this.crypto.getSecureRandom());
            final OutputStream createStream = OutputStreamFactory.createStream(createSignature);
            return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsRSAPSSSigner.1
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
            throw new TlsCryptoException(v.n(n10, " signature failed"), e10);
        }
    }
}
