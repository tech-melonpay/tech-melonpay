package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.RSAPrivateKey;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DefaultTlsCredentialedSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSigner;

/* loaded from: classes3.dex */
public class JcaDefaultTlsCredentialedSigner extends DefaultTlsCredentialedSigner {
    public JcaDefaultTlsCredentialedSigner(TlsCryptoParameters tlsCryptoParameters, JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey, Certificate certificate, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        super(tlsCryptoParameters, makeSigner(jcaTlsCrypto, privateKey, signatureAndHashAlgorithm), certificate, signatureAndHashAlgorithm);
    }

    private static TlsSigner makeSigner(JcaTlsCrypto jcaTlsCrypto, PrivateKey privateKey, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        String algorithm = privateKey.getAlgorithm();
        if ((privateKey instanceof RSAPrivateKey) || "RSA".equals(algorithm)) {
            if (signatureAndHashAlgorithm != null) {
                short signature = signatureAndHashAlgorithm.getSignature();
                switch (signature) {
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        return new JcaTlsRSAPSSSigner(jcaTlsCrypto, privateKey, signature);
                }
            }
            return new JcaTlsRSASigner(jcaTlsCrypto, privateKey);
        }
        if ((privateKey instanceof DSAPrivateKey) || "DSA".equals(algorithm)) {
            return new JcaTlsDSASigner(jcaTlsCrypto, privateKey);
        }
        if (ECUtil.isECPrivateKey(privateKey)) {
            return new JcaTlsECDSASigner(jcaTlsCrypto, privateKey);
        }
        if (EdDSAParameterSpec.Ed25519.equals(algorithm)) {
            return new JcaTlsEd25519Signer(jcaTlsCrypto, privateKey);
        }
        if (EdDSAParameterSpec.Ed448.equals(algorithm)) {
            return new JcaTlsEd448Signer(jcaTlsCrypto, privateKey);
        }
        throw new IllegalArgumentException("'privateKey' type not supported: ".concat(privateKey.getClass().getName()));
    }
}
