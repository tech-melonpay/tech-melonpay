package org.bouncycastle.cms.jcajce;

import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.RecipientOperator;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.operator.InputDecryptor;

/* loaded from: classes2.dex */
public class JceKEKEnvelopedRecipient extends JceKEKRecipient {
    public JceKEKEnvelopedRecipient(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // org.bouncycastle.cms.KEKRecipient
    public RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, final AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        final Cipher createContentCipher = this.contentHelper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new RecipientOperator(new InputDecryptor() { // from class: org.bouncycastle.cms.jcajce.JceKEKEnvelopedRecipient.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public InputStream getInputStream(InputStream inputStream) {
                return new CipherInputStream(inputStream, createContentCipher);
            }
        });
    }
}
