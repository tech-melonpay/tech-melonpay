package org.ejbca.cvc;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes3.dex */
public class CardVerifiableCertificate extends Certificate {
    private CVCertificate cvc;

    public CardVerifiableCertificate(CVCertificate cVCertificate) {
        super("CVC");
        this.cvc = cVCertificate;
    }

    public CVCertificate getCVCertificate() {
        return this.cvc;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        try {
            return this.cvc.getDEREncoded();
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10);
        }
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return this.cvc.getCertificateBody().getPublicKey();
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.cvc.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        this.cvc.verify(publicKey, str);
    }
}
