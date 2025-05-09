package org.ejbca.cvc;

import java.io.IOException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import org.ejbca.cvc.exception.ConstructionException;
import org.ejbca.cvc.util.BCECUtil;

/* loaded from: classes3.dex */
public class CVCertificate extends AbstractSequence implements Signable {
    private static CVCTagEnum[] allowedFields = {CVCTagEnum.CERTIFICATE_BODY, CVCTagEnum.SIGNATURE};
    private static final long serialVersionUID = 1;

    public CVCertificate() {
        super(CVCTagEnum.CV_CERTIFICATE);
    }

    @Override // org.ejbca.cvc.AbstractSequence
    public CVCTagEnum[] getAllowedFields() {
        return allowedFields;
    }

    public CVCertificateBody getCertificateBody() {
        return (CVCertificateBody) getSubfield(CVCTagEnum.CERTIFICATE_BODY);
    }

    public byte[] getSignature() {
        return ((ByteField) getSubfield(CVCTagEnum.SIGNATURE)).getData();
    }

    @Override // org.ejbca.cvc.Signable
    public byte[] getTBS() {
        try {
            return getCertificateBody().getDEREncoded();
        } catch (IOException e10) {
            throw new ConstructionException(e10);
        } catch (NoSuchFieldException e11) {
            throw new ConstructionException(e11);
        }
    }

    public void setSignature(byte[] bArr) {
        addSubfield(new ByteField(CVCTagEnum.SIGNATURE, bArr));
    }

    public String toString() {
        return getAsText("");
    }

    public void verify(PublicKey publicKey, String str) {
        try {
            String algorithmName = AlgorithmUtil.getAlgorithmName(publicKey instanceof CVCPublicKey ? ((CVCPublicKey) publicKey).getObjectIdentifier() : getCertificateBody().getPublicKey().getObjectIdentifier());
            Signature signature = Signature.getInstance(algorithmName, str);
            signature.initVerify(publicKey);
            signature.update(getTBS());
            if (signature.verify(BCECUtil.convertCVCSigToX962(algorithmName, getSignature()))) {
            } else {
                throw new SignatureException("Signature verification failed!");
            }
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("CV-Certificate is corrupt", e10);
        } catch (ConstructionException e11) {
            throw new CertificateException("CV-Certificate is corrupt", e11);
        }
    }

    public CVCertificate(CVCertificateBody cVCertificateBody) {
        this();
        if (cVCertificateBody == null) {
            throw new IllegalArgumentException("body is null");
        }
        addSubfield(cVCertificateBody);
    }
}
