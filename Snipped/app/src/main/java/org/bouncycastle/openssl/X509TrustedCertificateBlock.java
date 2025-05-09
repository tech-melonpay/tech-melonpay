package org.bouncycastle.openssl;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class X509TrustedCertificateBlock {
    private final X509CertificateHolder certificateHolder;
    private final CertificateTrustBlock trustBlock;

    public X509TrustedCertificateBlock(X509CertificateHolder x509CertificateHolder, CertificateTrustBlock certificateTrustBlock) {
        this.certificateHolder = x509CertificateHolder;
        this.trustBlock = certificateTrustBlock;
    }

    public X509CertificateHolder getCertificateHolder() {
        return this.certificateHolder;
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.certificateHolder.getEncoded(), this.trustBlock.toASN1Sequence().getEncoded());
    }

    public CertificateTrustBlock getTrustBlock() {
        return this.trustBlock;
    }

    public X509TrustedCertificateBlock(byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        this.certificateHolder = new X509CertificateHolder(aSN1InputStream.readObject().getEncoded());
        ASN1Primitive readObject = aSN1InputStream.readObject();
        if (readObject != null) {
            this.trustBlock = new CertificateTrustBlock(readObject.getEncoded());
        } else {
            this.trustBlock = null;
        }
    }
}
