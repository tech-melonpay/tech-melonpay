package org.bouncycastle.cms.bc;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KEKRecipient;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.SymmetricKeyUnwrapper;
import org.bouncycastle.operator.bc.BcSymmetricKeyUnwrapper;

/* loaded from: classes2.dex */
public abstract class BcKEKRecipient implements KEKRecipient {
    private SymmetricKeyUnwrapper unwrapper;

    public BcKEKRecipient(BcSymmetricKeyUnwrapper bcSymmetricKeyUnwrapper) {
        this.unwrapper = bcSymmetricKeyUnwrapper;
    }

    public CipherParameters extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        try {
            return CMSUtils.getBcKey(this.unwrapper.generateUnwrappedKey(algorithmIdentifier2, bArr));
        } catch (OperatorException e10) {
            throw new CMSException("exception unwrapping key: " + e10.getMessage(), e10);
        }
    }
}
