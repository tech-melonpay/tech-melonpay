package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

/* loaded from: classes3.dex */
public class BcTlsECDSAVerifier extends BcTlsDSSVerifier {
    public BcTlsECDSAVerifier(BcTlsCrypto bcTlsCrypto, ECPublicKeyParameters eCPublicKeyParameters) {
        super(bcTlsCrypto, eCPublicKeyParameters);
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsDSSVerifier
    public DSA createDSAImpl(short s10) {
        return new ECDSASigner(new HMacDSAKCalculator(this.crypto.createDigest(s10)));
    }

    @Override // org.bouncycastle.tls.crypto.impl.bc.BcTlsDSSVerifier
    public short getSignatureAlgorithm() {
        return (short) 3;
    }
}
