package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;

/* loaded from: classes3.dex */
public abstract class BcTlsDSSSigner extends BcTlsSigner {
    public BcTlsDSSSigner(BcTlsCrypto bcTlsCrypto, AsymmetricKeyParameter asymmetricKeyParameter) {
        super(bcTlsCrypto, asymmetricKeyParameter);
    }

    public abstract DSA createDSAImpl(short s10);

    @Override // org.bouncycastle.tls.crypto.TlsSigner
    public byte[] generateRawSignature(SignatureAndHashAlgorithm signatureAndHashAlgorithm, byte[] bArr) {
        if (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() != getSignatureAlgorithm()) {
            throw new IllegalStateException();
        }
        DSADigestSigner dSADigestSigner = new DSADigestSigner(createDSAImpl(signatureAndHashAlgorithm == null ? (short) 2 : signatureAndHashAlgorithm.getHash()), this.crypto.createDigest((short) 0));
        dSADigestSigner.init(true, new ParametersWithRandom(this.privateKey, this.crypto.getSecureRandom()));
        if (signatureAndHashAlgorithm == null) {
            dSADigestSigner.update(bArr, 16, 20);
        } else {
            dSADigestSigner.update(bArr, 0, bArr.length);
        }
        try {
            return dSADigestSigner.generateSignature();
        } catch (CryptoException e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }

    public abstract short getSignatureAlgorithm();
}
