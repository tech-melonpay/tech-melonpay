package org.bouncycastle.cert.path;

import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: classes2.dex */
public class CertPath {
    private final X509CertificateHolder[] certificates;

    public CertPath(X509CertificateHolder[] x509CertificateHolderArr) {
        this.certificates = copyArray(x509CertificateHolderArr);
    }

    private X509CertificateHolder[] copyArray(X509CertificateHolder[] x509CertificateHolderArr) {
        int length = x509CertificateHolderArr.length;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[length];
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public CertPathValidationResult evaluate(CertPathValidation[] certPathValidationArr) {
        CertPathValidationContext certPathValidationContext = new CertPathValidationContext(CertPathUtils.getCriticalExtensionsOIDs(this.certificates));
        CertPathValidationResultBuilder certPathValidationResultBuilder = new CertPathValidationResultBuilder(certPathValidationContext);
        for (int i = 0; i != certPathValidationArr.length; i++) {
            int length = this.certificates.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i].validate(certPathValidationContext, this.certificates[length]);
                } catch (CertPathValidationException e10) {
                    certPathValidationResultBuilder.addException(length, i, e10);
                }
                length--;
            }
        }
        return certPathValidationResultBuilder.build();
    }

    public X509CertificateHolder[] getCertificates() {
        return copyArray(this.certificates);
    }

    public int length() {
        return this.certificates.length;
    }

    public CertPathValidationResult validate(CertPathValidation[] certPathValidationArr) {
        CertPathValidationContext certPathValidationContext = new CertPathValidationContext(CertPathUtils.getCriticalExtensionsOIDs(this.certificates));
        for (int i = 0; i != certPathValidationArr.length; i++) {
            int length = this.certificates.length - 1;
            while (length >= 0) {
                try {
                    certPathValidationContext.setIsEndEntity(length == 0);
                    certPathValidationArr[i].validate(certPathValidationContext, this.certificates[length]);
                    length--;
                } catch (CertPathValidationException e10) {
                    return new CertPathValidationResult(certPathValidationContext, length, i, e10);
                }
            }
        }
        return new CertPathValidationResult(certPathValidationContext);
    }
}
