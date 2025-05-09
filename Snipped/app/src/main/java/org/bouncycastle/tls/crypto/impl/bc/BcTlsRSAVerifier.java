package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsUtils;

/* loaded from: classes3.dex */
public class BcTlsRSAVerifier extends BcTlsVerifier {
    public BcTlsRSAVerifier(BcTlsCrypto bcTlsCrypto, RSAKeyParameters rSAKeyParameters) {
        super(bcTlsCrypto, rSAKeyParameters);
    }

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        Signer genericSigner;
        Digest createDigest = this.crypto.createDigest((short) 0);
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm == null) {
            genericSigner = new GenericSigner(new PKCS1Encoding(new RSABlindedEngine()), createDigest);
        } else {
            if (algorithm.getSignature() != 1) {
                throw new IllegalStateException();
            }
            genericSigner = new RSADigestSigner(createDigest, TlsUtils.getOIDForHashAlgorithm(algorithm.getHash()));
        }
        genericSigner.init(false, this.publicKey);
        genericSigner.update(bArr, 0, bArr.length);
        return genericSigner.verifySignature(digitallySigned.getSignature());
    }
}
