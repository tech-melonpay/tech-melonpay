package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.cms.SignerId;

/* loaded from: classes2.dex */
public class JcaSelectorConverter {
    public KeyTransRecipientId getKeyTransRecipientId(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new KeyTransRecipientId(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), ASN1OctetString.getInstance(x509CertSelector.getSubjectKeyIdentifier()).getOctets()) : new KeyTransRecipientId(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder("unable to convert issuer: ")));
        }
    }

    public SignerId getSignerId(X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new SignerId(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), ASN1OctetString.getInstance(x509CertSelector.getSubjectKeyIdentifier()).getOctets()) : new SignerId(X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (IOException e10) {
            throw new IllegalArgumentException(a.b(e10, new StringBuilder("unable to convert issuer: ")));
        }
    }
}
