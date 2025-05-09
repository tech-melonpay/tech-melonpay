package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

/* loaded from: classes3.dex */
public class JcaTlsRSAVerifier implements TlsVerifier {
    private final JcaTlsCrypto crypto;
    private final PublicKey publicKey;
    private Signature rawVerifier = null;

    public JcaTlsRSAVerifier(JcaTlsCrypto jcaTlsCrypto, PublicKey publicKey) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (publicKey == null) {
            throw new NullPointerException("publicKey");
        }
        this.crypto = jcaTlsCrypto;
        this.publicKey = publicKey;
    }

    public Signature getRawVerifier() {
        if (this.rawVerifier == null) {
            Signature createSignature = this.crypto.getHelper().createSignature("NoneWithRSA");
            this.rawVerifier = createSignature;
            createSignature.initVerify(this.publicKey);
        }
        return this.rawVerifier;
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public TlsStreamVerifier getStreamVerifier(final DigitallySigned digitallySigned) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null || algorithm.getSignature() != 1 || !JcaUtils.isSunMSCAPIProviderActive()) {
            return null;
        }
        try {
            if (!JcaUtils.isSunMSCAPIProvider(getRawVerifier().getProvider())) {
                return null;
            }
            final Signature createSignature = this.crypto.getHelper().createSignature(JcaUtils.getJcaAlgorithmName(algorithm));
            createSignature.initVerify(this.publicKey);
            return new TlsStreamVerifier() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsRSAVerifier.1
                @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
                public OutputStream getOutputStream() {
                    return new SignatureOutputStream(createSignature);
                }

                @Override // org.bouncycastle.tls.crypto.TlsStreamVerifier
                public boolean isVerified() {
                    try {
                        return createSignature.verify(digitallySigned.getSignature());
                    } catch (SignatureException e10) {
                        throw new TlsFatalAlert((short) 80, e10);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        try {
            Signature rawVerifier = getRawVerifier();
            if (algorithm == null) {
                rawVerifier.update(bArr, 0, bArr.length);
            } else {
                if (algorithm.getSignature() != 1) {
                    throw new IllegalStateException();
                }
                byte[] encoded = new DigestInfo(new AlgorithmIdentifier(TlsUtils.getOIDForHashAlgorithm(algorithm.getHash()), DERNull.INSTANCE), bArr).getEncoded();
                rawVerifier.update(encoded, 0, encoded.length);
            }
            return rawVerifier.verify(digitallySigned.getSignature());
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to process signature: ")), e10);
        }
    }
}
