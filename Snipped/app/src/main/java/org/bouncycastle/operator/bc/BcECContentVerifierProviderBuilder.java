package org.bouncycastle.operator.bc;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: classes3.dex */
public class BcECContentVerifierProviderBuilder extends BcContentVerifierProviderBuilder {
    private DigestAlgorithmIdentifierFinder digestAlgorithmFinder;

    public BcECContentVerifierProviderBuilder(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.digestAlgorithmFinder = digestAlgorithmIdentifierFinder;
    }

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    public Signer createSigner(AlgorithmIdentifier algorithmIdentifier) {
        return new DSADigestSigner(new ECDSASigner(), this.digestProvider.get(this.digestAlgorithmFinder.find(algorithmIdentifier)));
    }

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    public AsymmetricKeyParameter extractKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }
}
