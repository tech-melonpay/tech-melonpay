package org.bouncycastle.jce;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.TBSCertificateStructure;
import org.bouncycastle.asn1.x509.X509Name;

/* loaded from: classes2.dex */
public class PrincipalUtil {
    public static X509Principal getIssuerX509Principal(X509CRL x509crl) {
        try {
            return new X509Principal(X509Name.getInstance(TBSCertList.getInstance(ASN1Primitive.fromByteArray(x509crl.getTBSCertList())).getIssuer()));
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    public static X509Principal getSubjectX509Principal(X509Certificate x509Certificate) {
        try {
            return new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray(x509Certificate.getTBSCertificate())).getSubject()));
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }

    public static X509Principal getIssuerX509Principal(X509Certificate x509Certificate) {
        try {
            return new X509Principal(X509Name.getInstance(TBSCertificateStructure.getInstance(ASN1Primitive.fromByteArray(x509Certificate.getTBSCertificate())).getIssuer()));
        } catch (IOException e10) {
            throw new CertificateEncodingException(e10.toString());
        }
    }
}
