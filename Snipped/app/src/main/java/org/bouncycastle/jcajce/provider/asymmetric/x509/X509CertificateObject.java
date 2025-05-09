package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.google.android.gms.measurement.internal.a;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
class X509CertificateObject extends X509CertificateImpl implements PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier;
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;

    public static class X509CertificateEncodingException extends CertificateEncodingException {
        private final Throwable cause;

        public X509CertificateEncodingException(Throwable th) {
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public X509CertificateObject(JcaJceHelper jcaJceHelper, Certificate certificate) {
        super(jcaJceHelper, certificate, createBasicConstraints(certificate), createKeyUsage(certificate), createSigAlgName(certificate), createSigAlgParams(certificate));
        this.cacheLock = new Object();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private static BasicConstraints createBasicConstraints(Certificate certificate) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(certificate, "2.5.29.19");
            if (extensionOctets == null) {
                return null;
            }
            return BasicConstraints.getInstance(ASN1Primitive.fromByteArray(extensionOctets));
        } catch (Exception e10) {
            throw new CertificateParsingException(a.i("cannot construct BasicConstraints: ", e10));
        }
    }

    private static boolean[] createKeyUsage(Certificate certificate) {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(certificate, "2.5.29.15");
            if (extensionOctets == null) {
                return null;
            }
            DERBitString dERBitString = DERBitString.getInstance((Object) ASN1Primitive.fromByteArray(extensionOctets));
            byte[] bytes = dERBitString.getBytes();
            int length = (bytes.length * 8) - dERBitString.getPadBits();
            int i = 9;
            if (length >= 9) {
                i = length;
            }
            boolean[] zArr = new boolean[i];
            for (int i9 = 0; i9 != length; i9++) {
                zArr[i9] = (bytes[i9 / 8] & (128 >>> (i9 % 8))) != 0;
            }
            return zArr;
        } catch (Exception e10) {
            throw new CertificateParsingException(a.i("cannot construct KeyUsage: ", e10));
        }
    }

    private static String createSigAlgName(Certificate certificate) {
        try {
            return X509SignatureUtil.getSignatureName(certificate.getSignatureAlgorithm());
        } catch (Exception e10) {
            throw new CertificateParsingException(a.i("cannot construct SigAlgName: ", e10));
        }
    }

    private static byte[] createSigAlgParams(Certificate certificate) {
        try {
            ASN1Encodable parameters = certificate.getSignatureAlgorithm().getParameters();
            if (parameters == null) {
                return null;
            }
            return parameters.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (Exception e10) {
            throw new CertificateParsingException(a.i("cannot construct SigAlgParams: ", e10));
        }
    }

    private X509CertificateInternal getInternalCertificate() {
        byte[] bArr;
        X509CertificateEncodingException x509CertificateEncodingException;
        X509CertificateInternal x509CertificateInternal;
        synchronized (this.cacheLock) {
            try {
                X509CertificateInternal x509CertificateInternal2 = this.internalCertificateValue;
                if (x509CertificateInternal2 != null) {
                    return x509CertificateInternal2;
                }
                try {
                    x509CertificateEncodingException = null;
                    bArr = this.f25149c.getEncoded(ASN1Encoding.DER);
                } catch (IOException e10) {
                    bArr = null;
                    x509CertificateEncodingException = new X509CertificateEncodingException(e10);
                }
                X509CertificateInternal x509CertificateInternal3 = new X509CertificateInternal(this.bcHelper, this.f25149c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, bArr, x509CertificateEncodingException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCertificateValue == null) {
                            this.internalCertificateValue = x509CertificateInternal3;
                        }
                        x509CertificateInternal = this.internalCertificateValue;
                    } finally {
                    }
                }
                return x509CertificateInternal;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        long time = date.getTime();
        long[] validityValues = getValidityValues();
        if (time > validityValues[1]) {
            throw new CertificateExpiredException("certificate expired on " + this.f25149c.getEndDate().getTime());
        }
        if (time >= validityValues[0]) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.f25149c.getStartDate().getTime());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        X509CertificateInternal internalCertificate;
        ASN1BitString signature;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
            if (this.hashValueSet && x509CertificateObject.hashValueSet) {
                if (this.hashValue != x509CertificateObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCertificateValue == null || x509CertificateObject.internalCertificateValue == null) && (signature = this.f25149c.getSignature()) != null && !signature.equals((ASN1Primitive) x509CertificateObject.f25149c.getSignature())) {
                return false;
            }
            internalCertificate = getInternalCertificate();
            obj = x509CertificateObject.getInternalCertificate();
        } else {
            internalCertificate = getInternalCertificate();
        }
        return internalCertificate.equals(obj);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return Arrays.clone(getInternalCertificate().getEncoded());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.issuerValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal issuerX500Principal = super.getIssuerX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.issuerValue == null) {
                            this.issuerValue = issuerX500Principal;
                        }
                        x500Principal = this.issuerValue;
                    } finally {
                    }
                }
                return x500Principal;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.cacheLock) {
            try {
                PublicKey publicKey2 = this.publicKeyValue;
                if (publicKey2 != null) {
                    return publicKey2;
                }
                PublicKey publicKey3 = super.getPublicKey();
                if (publicKey3 == null) {
                    return null;
                }
                synchronized (this.cacheLock) {
                    try {
                        if (this.publicKeyValue == null) {
                            this.publicKeyValue = publicKey3;
                        }
                        publicKey = this.publicKeyValue;
                    } finally {
                    }
                }
                return publicKey;
            } finally {
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.subjectValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal subjectX500Principal = super.getSubjectX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.subjectValue == null) {
                            this.subjectValue = subjectX500Principal;
                        }
                        x500Principal = this.subjectValue;
                    } finally {
                    }
                }
                return x500Principal;
            } finally {
            }
        }
    }

    public long[] getValidityValues() {
        long[] jArr;
        synchronized (this.cacheLock) {
            try {
                long[] jArr2 = this.validityValues;
                if (jArr2 != null) {
                    return jArr2;
                }
                long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.cacheLock) {
                    try {
                        if (this.validityValues == null) {
                            this.validityValues = jArr3;
                        }
                        jArr = this.validityValues;
                    } finally {
                    }
                }
                return jArr;
            } finally {
            }
        }
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getInternalCertificate().getEncoded();
            int i = 0;
            for (int i9 = 1; i9 < encoded.length; i9++) {
                i += encoded[i9] * i9;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }
}
