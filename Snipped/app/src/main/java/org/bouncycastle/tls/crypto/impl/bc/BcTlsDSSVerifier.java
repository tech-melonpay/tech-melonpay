package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

/* loaded from: classes3.dex */
public abstract class BcTlsDSSVerifier extends BcTlsVerifier {
    public BcTlsDSSVerifier(BcTlsCrypto bcTlsCrypto, AsymmetricKeyParameter asymmetricKeyParameter) {
        super(bcTlsCrypto, asymmetricKeyParameter);
    }

    public abstract DSA createDSAImpl(short s10);

    public abstract short getSignatureAlgorithm();

    @Override // org.bouncycastle.tls.crypto.TlsVerifier
    public boolean verifyRawSignature(DigitallySigned digitallySigned, byte[] bArr) {
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm != null && algorithm.getSignature() != getSignatureAlgorithm()) {
            throw new IllegalStateException();
        }
        DSADigestSigner dSADigestSigner = new DSADigestSigner(createDSAImpl(algorithm == null ? (short) 2 : algorithm.getHash()), this.crypto.createDigest((short) 0));
        dSADigestSigner.init(false, this.publicKey);
        if (algorithm == null) {
            dSADigestSigner.update(bArr, 16, 20);
        } else {
            dSADigestSigner.update(bArr, 0, bArr.length);
        }
        return dSADigestSigner.verifySignature(digitallySigned.getSignature());
    }
}
