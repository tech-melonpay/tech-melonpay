package org.jmrtd.cert;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.data.Country;
import org.ejbca.cvc.AlgorithmUtil;
import org.ejbca.cvc.AuthorizationRoleEnum;
import org.ejbca.cvc.CAReferenceField;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.CVCertificateBody;
import org.ejbca.cvc.HolderReferenceField;
import org.ejbca.cvc.exception.ConstructionException;
import org.jmrtd.cert.CVCAuthorizationTemplate;

/* loaded from: classes3.dex */
public class CardVerifiableCertificate extends Certificate {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3585440601605666288L;
    private CVCertificate cvCertificate;
    private transient KeyFactory rsaKeyFactory;

    public CardVerifiableCertificate(CVCertificate cVCertificate) {
        super("CVC");
        try {
            this.rsaKeyFactory = KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e10) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
        }
        this.cvCertificate = cVCertificate;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj.getClass())) {
            return this.cvCertificate.equals(((CardVerifiableCertificate) obj).cvCertificate);
        }
        return false;
    }

    public CVCPrincipal getAuthorityReference() {
        try {
            CAReferenceField authorityReference = this.cvCertificate.getCertificateBody().getAuthorityReference();
            return new CVCPrincipal(Country.getInstance(authorityReference.getCountry().toUpperCase()), authorityReference.getMnemonic(), authorityReference.getSequence());
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    public CVCAuthorizationTemplate getAuthorizationTemplate() {
        try {
            return new CVCAuthorizationTemplate(this.cvCertificate.getCertificateBody().getAuthorizationTemplate());
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    public byte[] getCertBodyData() {
        try {
            return this.cvCertificate.getCertificateBody().getDEREncoded();
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        try {
            return this.cvCertificate.getDEREncoded();
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10);
        }
    }

    public CVCPrincipal getHolderReference() {
        try {
            HolderReferenceField holderReference = this.cvCertificate.getCertificateBody().getHolderReference();
            return new CVCPrincipal(Country.getInstance(holderReference.getCountry().toUpperCase()), holderReference.getMnemonic(), holderReference.getSequence());
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    public Date getNotAfter() {
        try {
            return this.cvCertificate.getCertificateBody().getValidTo();
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    public Date getNotBefore() {
        try {
            return this.cvCertificate.getCertificateBody().getValidFrom();
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            PublicKey publicKey = this.cvCertificate.getCertificateBody().getPublicKey();
            if ("RSA".equals(publicKey.getAlgorithm())) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                try {
                    return this.rsaKeyFactory.generatePublic(new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent()));
                } catch (GeneralSecurityException e10) {
                    LOGGER.log(Level.WARNING, "Exception", (Throwable) e10);
                }
            }
            return publicKey;
        } catch (NoSuchFieldException e11) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e11);
            return null;
        }
    }

    public String getSigAlgName() {
        try {
            return AlgorithmUtil.getAlgorithmName(this.cvCertificate.getCertificateBody().getPublicKey().getObjectIdentifier());
        } catch (NoSuchFieldException e10) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e10);
            return null;
        }
    }

    public String getSigAlgOID() {
        try {
            return this.cvCertificate.getCertificateBody().getPublicKey().getObjectIdentifier().getAsText();
        } catch (NoSuchFieldException e10) {
            LOGGER.log(Level.WARNING, "No such field", (Throwable) e10);
            return null;
        }
    }

    public byte[] getSignature() {
        try {
            return this.cvCertificate.getSignature();
        } catch (NoSuchFieldException e10) {
            throw new CertificateException("No such field", e10);
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        return (this.cvCertificate.hashCode() * 2) - 1030507011;
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.cvCertificate.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        for (Provider provider : Security.getProviders()) {
            try {
                this.cvCertificate.verify(publicKey, provider.getName());
                return;
            } catch (NoSuchAlgorithmException e10) {
                LOGGER.log(Level.FINE, "Trying next provider", (Throwable) e10);
            }
        }
        throw new NoSuchAlgorithmException("Tried all security providers: None was able to provide this signature algorithm.");
    }

    public CardVerifiableCertificate(CVCPrincipal cVCPrincipal, CVCPrincipal cVCPrincipal2, PublicKey publicKey, String str, Date date, Date date2, CVCAuthorizationTemplate.Role role, CVCAuthorizationTemplate.Permission permission, byte[] bArr) {
        this(null);
        try {
            CAReferenceField cAReferenceField = new CAReferenceField(cVCPrincipal.getCountry().toAlpha2Code(), cVCPrincipal.getMnemonic(), cVCPrincipal.getSeqNumber());
            HolderReferenceField holderReferenceField = new HolderReferenceField(cVCPrincipal2.getCountry().toAlpha2Code(), cVCPrincipal2.getMnemonic(), cVCPrincipal2.getSeqNumber());
            AuthorizationRoleEnum fromRole = CVCAuthorizationTemplate.fromRole(role);
            CVCertificate cVCertificate = new CVCertificate(new CVCertificateBody(cAReferenceField, org.ejbca.cvc.KeyFactory.createInstance(publicKey, str, fromRole), holderReferenceField, fromRole, CVCAuthorizationTemplate.fromPermission(permission), date, date2));
            this.cvCertificate = cVCertificate;
            cVCertificate.setSignature(bArr);
            this.cvCertificate.getTBS();
        } catch (ConstructionException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        this.cvCertificate.verify(publicKey, str);
    }
}
