package org.bouncycastle.operator.bc;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.ECDSASigner;

/* loaded from: classes3.dex */
public class BcECContentSignerBuilder extends BcContentSignerBuilder {
    public BcECContentSignerBuilder(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        super(algorithmIdentifier, algorithmIdentifier2);
    }

    @Override // org.bouncycastle.operator.bc.BcContentSignerBuilder
    public Signer createSigner(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        return new DSADigestSigner(new ECDSASigner(), this.digestProvider.get(algorithmIdentifier2));
    }
}
