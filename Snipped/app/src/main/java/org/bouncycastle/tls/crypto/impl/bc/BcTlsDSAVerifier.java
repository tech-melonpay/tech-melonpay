package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

/* loaded from: classes3.dex */
public class BcTlsDSAVerifier extends BcTlsDSSVerifier {
    public BcTlsDSAVerifier(BcTlsCrypto bcTlsCrypto, DSAPublicKeyParameters dSAPublicKeyParameters) {
        super(bcTlsCrypto, dSAPublicKeyParameters);
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsDSSVerifier
    public DSA createDSAImpl(short s10) {
        return new DSASigner(new HMacDSAKCalculator(this.crypto.createDigest(s10)));
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsDSSVerifier
    public short getSignatureAlgorithm() {
        return (short) 2;
    }
}
