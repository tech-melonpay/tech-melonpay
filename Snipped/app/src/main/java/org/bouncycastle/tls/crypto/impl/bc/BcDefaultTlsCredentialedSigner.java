package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DefaultTlsCredentialedSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSigner;

/* loaded from: classes3.dex */
public class BcDefaultTlsCredentialedSigner extends DefaultTlsCredentialedSigner {
    public BcDefaultTlsCredentialedSigner(TlsCryptoParameters tlsCryptoParameters, BcTlsCrypto bcTlsCrypto, AsymmetricKeyParameter asymmetricKeyParameter, Certificate certificate, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        super(tlsCryptoParameters, makeSigner(bcTlsCrypto, asymmetricKeyParameter, certificate, signatureAndHashAlgorithm), certificate, signatureAndHashAlgorithm);
    }

    private static TlsSigner makeSigner(BcTlsCrypto bcTlsCrypto, AsymmetricKeyParameter asymmetricKeyParameter, Certificate certificate, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        TlsSigner bcTlsEd25519Signer;
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (signatureAndHashAlgorithm != null) {
                short signature = signatureAndHashAlgorithm.getSignature();
                switch (signature) {
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        return new BcTlsRSAPSSSigner(bcTlsCrypto, (RSAKeyParameters) asymmetricKeyParameter, signature);
                }
            }
            return new BcTlsRSASigner(bcTlsCrypto, (RSAKeyParameters) asymmetricKeyParameter);
        }
        if (asymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
            return new BcTlsDSASigner(bcTlsCrypto, (DSAPrivateKeyParameters) asymmetricKeyParameter);
        }
        if (asymmetricKeyParameter instanceof ECPrivateKeyParameters) {
            return new BcTlsECDSASigner(bcTlsCrypto, (ECPrivateKeyParameters) asymmetricKeyParameter);
        }
        if (asymmetricKeyParameter instanceof Ed25519PrivateKeyParameters) {
            try {
                bcTlsEd25519Signer = new BcTlsEd25519Signer(bcTlsCrypto, (Ed25519PrivateKeyParameters) asymmetricKeyParameter, BcTlsCertificate.convert(bcTlsCrypto, certificate.getCertificateAt(0)).getPubKeyEd25519());
            } catch (IOException e10) {
                throw Exceptions.illegalArgumentException("exception converting certificate", e10);
            }
        } else {
            if (!(asymmetricKeyParameter instanceof Ed448PrivateKeyParameters)) {
                throw new IllegalArgumentException("'privateKey' type not supported: ".concat(asymmetricKeyParameter.getClass().getName()));
            }
            try {
                bcTlsEd25519Signer = new BcTlsEd448Signer(bcTlsCrypto, (Ed448PrivateKeyParameters) asymmetricKeyParameter, BcTlsCertificate.convert(bcTlsCrypto, certificate.getCertificateAt(0)).getPubKeyEd448());
            } catch (IOException e11) {
                throw Exceptions.illegalArgumentException("exception converting certificate", e11);
            }
        }
        return bcTlsEd25519Signer;
    }
}
