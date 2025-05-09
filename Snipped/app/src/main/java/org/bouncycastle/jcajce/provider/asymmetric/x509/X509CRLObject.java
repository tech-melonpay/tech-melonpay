package org.bouncycastle.jcajce.provider.asymmetric.x509;

import C.v;
import com.google.android.gms.measurement.internal.a;
import java.io.IOException;
import java.security.cert.CRLException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    public static class X509CRLException extends CRLException {
        private final Throwable cause;

        public X509CRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public X509CRLException(Throwable th) {
            this.cause = th;
        }
    }

    public X509CRLObject(JcaJceHelper jcaJceHelper, CertificateList certificateList) {
        super(jcaJceHelper, certificateList, createSigAlgName(certificateList), createSigAlgParams(certificateList), isIndirectCRL(certificateList));
        this.cacheLock = new Object();
    }

    private static String createSigAlgName(CertificateList certificateList) {
        try {
            return X509SignatureUtil.getSignatureName(certificateList.getSignatureAlgorithm());
        } catch (Exception e10) {
            throw new X509CRLException(v.l(e10, new StringBuilder("CRL contents invalid: ")), e10);
        }
    }

    private static byte[] createSigAlgParams(CertificateList certificateList) {
        try {
            ASN1Encodable parameters = certificateList.getSignatureAlgorithm().getParameters();
            if (parameters == null) {
                return null;
            }
            return parameters.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (Exception e10) {
            throw new CRLException(a.i("CRL contents invalid: ", e10));
        }
    }

    private X509CRLInternal getInternalCRL() {
        byte[] bArr;
        X509CRLException x509CRLException;
        X509CRLInternal x509CRLInternal;
        synchronized (this.cacheLock) {
            try {
                X509CRLInternal x509CRLInternal2 = this.internalCRLValue;
                if (x509CRLInternal2 != null) {
                    return x509CRLInternal2;
                }
                try {
                    x509CRLException = null;
                    bArr = this.f25148c.getEncoded(ASN1Encoding.DER);
                } catch (IOException e10) {
                    bArr = null;
                    x509CRLException = new X509CRLException(e10);
                }
                X509CRLInternal x509CRLInternal3 = new X509CRLInternal(this.bcHelper, this.f25148c, this.sigAlgName, this.sigAlgParams, this.isIndirect, bArr, x509CRLException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCRLValue == null) {
                            this.internalCRLValue = x509CRLInternal3;
                        }
                        x509CRLInternal = this.internalCRLValue;
                    } finally {
                    }
                }
                return x509CRLInternal;
            } finally {
            }
        }
    }

    private static boolean isIndirectCRL(CertificateList certificateList) {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(certificateList, Extension.issuingDistributionPoint.getId());
            if (extensionOctets == null) {
                return false;
            }
            return IssuingDistributionPoint.getInstance(extensionOctets).isIndirectCRL();
        } catch (Exception e10) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e10);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        X509CRLInternal internalCRL;
        ASN1BitString signature;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (this.hashValueSet && x509CRLObject.hashValueSet) {
                if (this.hashValue != x509CRLObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (signature = this.f25148c.getSignature()) != null && !signature.equals((ASN1Primitive) x509CRLObject.f25148c.getSignature())) {
                return false;
            }
            internalCRL = getInternalCRL();
            obj = x509CRLObject.getInternalCRL();
        } else {
            internalCRL = getInternalCRL();
        }
        return internalCRL.equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        return Arrays.clone(getInternalCRL().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }
}
