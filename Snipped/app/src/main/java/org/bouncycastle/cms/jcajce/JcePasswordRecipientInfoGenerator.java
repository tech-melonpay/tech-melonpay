package org.bouncycastle.cms.jcajce;

import androidx.camera.core.impl.utils.a;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.PasswordRecipientInfoGenerator;
import org.bouncycastle.operator.GenericKey;

/* loaded from: classes2.dex */
public class JcePasswordRecipientInfoGenerator extends PasswordRecipientInfoGenerator {
    private EnvelopedDataHelper helper;

    public JcePasswordRecipientInfoGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        super(aSN1ObjectIdentifier, cArr);
        this.helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] calculateDerivedKey(int i, AlgorithmIdentifier algorithmIdentifier, int i9) {
        return this.helper.calculateDerivedKey(i, this.password, algorithmIdentifier, i9);
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] generateEncryptedBytes(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, GenericKey genericKey) {
        Key jceKey = this.helper.getJceKey(genericKey);
        Cipher createRFC3211Wrapper = this.helper.createRFC3211Wrapper(algorithmIdentifier.getAlgorithm());
        try {
            createRFC3211Wrapper.init(3, new SecretKeySpec(bArr, createRFC3211Wrapper.getAlgorithm()), new IvParameterSpec(ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
            return createRFC3211Wrapper.wrap(jceKey);
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.p(e10, new StringBuilder("cannot process content encryption key: ")), e10);
        }
    }

    public JcePasswordRecipientInfoGenerator setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JcePasswordRecipientInfoGenerator setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }
}
