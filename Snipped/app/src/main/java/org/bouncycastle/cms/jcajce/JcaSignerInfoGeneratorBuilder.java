package org.bouncycastle.cms.jcajce;

import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder;
import org.bouncycastle.cms.DefaultCMSSignatureEncryptionAlgorithmFinder;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.cms.SignerInfoGeneratorBuilder;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DigestCalculatorProvider;

/* loaded from: classes2.dex */
public class JcaSignerInfoGeneratorBuilder {
    private SignerInfoGeneratorBuilder builder;

    public JcaSignerInfoGeneratorBuilder(DigestCalculatorProvider digestCalculatorProvider) {
        this(digestCalculatorProvider, new DefaultCMSSignatureEncryptionAlgorithmFinder());
    }

    public SignerInfoGenerator build(ContentSigner contentSigner, X509Certificate x509Certificate) {
        return build(contentSigner, new JcaX509CertificateHolder(x509Certificate));
    }

    public JcaSignerInfoGeneratorBuilder setDirectSignature(boolean z10) {
        this.builder.setDirectSignature(z10);
        return this;
    }

    public JcaSignerInfoGeneratorBuilder setSignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.builder.setSignedAttributeGenerator(cMSAttributeTableGenerator);
        return this;
    }

    public JcaSignerInfoGeneratorBuilder setUnsignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.builder.setUnsignedAttributeGenerator(cMSAttributeTableGenerator);
        return this;
    }

    public JcaSignerInfoGeneratorBuilder(DigestCalculatorProvider digestCalculatorProvider, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.builder = new SignerInfoGeneratorBuilder(digestCalculatorProvider, cMSSignatureEncryptionAlgorithmFinder);
    }

    public SignerInfoGenerator build(ContentSigner contentSigner, X509CertificateHolder x509CertificateHolder) {
        return this.builder.build(contentSigner, x509CertificateHolder);
    }

    public SignerInfoGenerator build(ContentSigner contentSigner, byte[] bArr) {
        return this.builder.build(contentSigner, bArr);
    }
}
