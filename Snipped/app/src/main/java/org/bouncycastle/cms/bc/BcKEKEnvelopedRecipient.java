package org.bouncycastle.cms.bc;

import java.io.InputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.RecipientOperator;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.io.CipherInputStream;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.bc.BcSymmetricKeyUnwrapper;

/* loaded from: classes2.dex */
public class BcKEKEnvelopedRecipient extends BcKEKRecipient {
    public BcKEKEnvelopedRecipient(BcSymmetricKeyUnwrapper bcSymmetricKeyUnwrapper) {
        super(bcSymmetricKeyUnwrapper);
    }

    @Override // org.bouncycastle.cms.KEKRecipient
    public RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, final AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        final Object createContentCipher = EnvelopedDataHelper.createContentCipher(false, (KeyParameter) extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new RecipientOperator(new InputDecryptor() { // from class: org.bouncycastle.cms.bc.BcKEKEnvelopedRecipient.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public InputStream getInputStream(InputStream inputStream) {
                return createContentCipher instanceof BufferedBlockCipher ? new CipherInputStream(inputStream, (BufferedBlockCipher) createContentCipher) : new CipherInputStream(inputStream, (StreamCipher) createContentCipher);
            }
        });
    }
}
