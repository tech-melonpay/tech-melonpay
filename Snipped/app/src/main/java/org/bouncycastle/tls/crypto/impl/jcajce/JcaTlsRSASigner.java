package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

/* loaded from: classes3.dex */
public class JcaTlsRSASigner implements TlsSigner {
    private final JcaTlsCrypto crypto;
    private final PrivateKey privateKey;
    private Signature rawSigner = null;

    public JcaTlsRSASigner(JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey) {
        if (jcaTlsCrypto == null) {
            throw new NullPointerException("crypto");
        }
        if (privateKey == null) {
            throw new NullPointerException("privateKey");
        }
        this.crypto = jcaTlsCrypto;
        this.privateKey = privateKey;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        try {
            Signature rawSigner = getRawSigner();
            if (signatureAndHashAlgorithm == null) {
                rawSigner.update(bArr, 0, bArr.length);
            } else {
                if (signatureAndHashAlgorithm.getSignature() != 1) {
                    throw new IllegalStateException();
                }
                byte[] encoded = new DigestInfo(new AlgorithmIdentifier(TlsUtils.getOIDForHashAlgorithm(signatureAndHashAlgorithm.getHash()), DERNull.INSTANCE), bArr).getEncoded();
                rawSigner.update(encoded, 0, encoded.length);
            }
            return rawSigner.sign();
        } catch (GeneralSecurityException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }

    public Signature getRawSigner() {
        if (this.rawSigner == null) {
            Signature createSignature = this.crypto.getHelper().createSignature("NoneWithRSA");
            this.rawSigner = createSignature;
            createSignature.initSign(this.privateKey, this.crypto.getSecureRandom());
        }
        return this.rawSigner;
    }

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null || signatureAndHashAlgorithm.getSignature() != 1 || !JcaUtils.isSunMSCAPIProviderActive()) {
            return null;
        }
        try {
            if (!JcaUtils.isSunMSCAPIProvider(getRawSigner().getProvider())) {
                return null;
            }
            final Signature createSignature = this.crypto.getHelper().createSignature(JcaUtils.getJcaAlgorithmName(signatureAndHashAlgorithm));
            createSignature.initSign(this.privateKey, this.crypto.getSecureRandom());
            return new TlsStreamSigner() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsRSASigner.1
                @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
                public OutputStream getOutputStream() {
                    return new SignatureOutputStream(createSignature);
                }

                @Override // org.bouncycastle.tls.crypto.TlsStreamSigner
                public byte[] getSignature() {
                    try {
                        return createSignature.sign();
                    } catch (SignatureException e10) {
                        throw new TlsFatalAlert((short) 80, e10);
                    }
                }
            };
        } catch (GeneralSecurityException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }
}
