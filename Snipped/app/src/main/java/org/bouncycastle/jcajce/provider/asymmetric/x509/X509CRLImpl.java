package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
abstract class X509CRLImpl extends X509CRL {
    protected JcaJceHelper bcHelper;

    /* renamed from: c, reason: collision with root package name */
    protected CertificateList f25148c;
    protected boolean isIndirect;
    protected String sigAlgName;
    protected byte[] sigAlgParams;

    public X509CRLImpl(JcaJceHelper jcaJceHelper, CertificateList certificateList, String str, byte[] bArr, boolean z10) {
        this.bcHelper = jcaJceHelper;
        this.f25148c = certificateList;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
        this.isIndirect = z10;
    }

    private void checkSignature(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) {
        if (aSN1Encodable != null) {
            X509SignatureUtil.setSignatureParameters(signature, aSN1Encodable);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(OutputStreamFactory.createStream(signature), 512);
            this.f25148c.getTBSCertList().encodeTo(bufferedOutputStream, ASN1Encoding.DER);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    private void doVerify(PublicKey publicKey, SignatureCreator signatureCreator) {
        if (!this.f25148c.getSignatureAlgorithm().equals(this.f25148c.getTBSCertList().getSignature())) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        int i = 0;
        if ((publicKey instanceof CompositePublicKey) && X509SignatureUtil.isCompositeAlgorithm(this.f25148c.getSignatureAlgorithm())) {
            List<PublicKey> publicKeys = ((CompositePublicKey) publicKey).getPublicKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.f25148c.getSignatureAlgorithm().getParameters());
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(DERBitString.getInstance((Object) this.f25148c.getSignature()).getBytes());
            boolean z10 = false;
            while (i != publicKeys.size()) {
                if (publicKeys.get(i) != null) {
                    AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
                    try {
                        checkSignature(publicKeys.get(i), signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier)), algorithmIdentifier.getParameters(), DERBitString.getInstance((Object) aSN1Sequence2.getObjectAt(i)).getBytes());
                        e = null;
                        z10 = true;
                    } catch (SignatureException e10) {
                        e = e10;
                    }
                    if (e != null) {
                        throw e;
                    }
                }
                i++;
            }
            if (!z10) {
                throw new InvalidKeyException("no matching key found");
            }
            return;
        }
        if (!X509SignatureUtil.isCompositeAlgorithm(this.f25148c.getSignatureAlgorithm())) {
            Signature createSignature = signatureCreator.createSignature(getSigAlgName());
            byte[] bArr = this.sigAlgParams;
            if (bArr == null) {
                checkSignature(publicKey, createSignature, null, getSignature());
                return;
            }
            try {
                checkSignature(publicKey, createSignature, ASN1Primitive.fromByteArray(bArr), getSignature());
                return;
            } catch (IOException e11) {
                throw new SignatureException(a.b(e11, new StringBuilder("cannot decode signature parameters: ")));
            }
        }
        ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(this.f25148c.getSignatureAlgorithm().getParameters());
        ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(DERBitString.getInstance((Object) this.f25148c.getSignature()).getBytes());
        boolean z11 = false;
        while (i != aSN1Sequence4.size()) {
            AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(aSN1Sequence3.getObjectAt(i));
            try {
                checkSignature(publicKey, signatureCreator.createSignature(X509SignatureUtil.getSignatureName(algorithmIdentifier2)), algorithmIdentifier2.getParameters(), DERBitString.getInstance((Object) aSN1Sequence4.getObjectAt(i)).getBytes());
                e = null;
                z11 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                e = null;
            } catch (SignatureException e12) {
                e = e12;
            }
            if (e != null) {
                throw e;
            }
            i++;
        }
        if (!z11) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    private Set getExtensionOIDs(boolean z10) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.f25148c.getTBSCertList().getExtensions()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) oids.nextElement();
            if (z10 == extensions.getExtension(aSN1ObjectIdentifier).isCritical()) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    public static byte[] getExtensionOctets(CertificateList certificateList, String str) {
        ASN1OctetString extensionValue = getExtensionValue(certificateList, str);
        if (extensionValue != null) {
            return extensionValue.getOctets();
        }
        return null;
    }

    public static ASN1OctetString getExtensionValue(CertificateList certificateList, String str) {
        Extension extension;
        Extensions extensions = certificateList.getTBSCertList().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extension.getExtnValue();
    }

    private Set loadCRLEntries() {
        Extension extension;
        HashSet hashSet = new HashSet();
        Enumeration revokedCertificateEnumeration = this.f25148c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            hashSet.add(new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name));
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return new X509Principal(X500Name.getInstance(this.f25148c.getIssuer().toASN1Primitive()));
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f25148c.getIssuer().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        Time nextUpdate = this.f25148c.getNextUpdate();
        if (nextUpdate == null) {
            return null;
        }
        return nextUpdate.getDate();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        Enumeration revokedCertificateEnumeration = this.f25148c.getRevokedCertificateEnumeration();
        X500Name x500Name = null;
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new X509CRLEntryObject(cRLEntry, this.isIndirect, x500Name);
            }
            if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                x500Name = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set loadCRLEntries = loadCRLEntries();
        if (loadCRLEntries.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableSet(loadCRLEntries);
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        return this.sigAlgName;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return this.f25148c.getSignatureAlgorithm().getAlgorithm().getId();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return Arrays.clone(this.sigAlgParams);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return this.f25148c.getSignature().getOctets();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        try {
            return this.f25148c.getTBSCertList().getEncoded(ASN1Encoding.DER);
        } catch (IOException e10) {
            throw new CRLException(e10.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return this.f25148c.getThisUpdate().getDate();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.f25148c.getVersionNumber();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.issuingDistributionPoint.getId());
        criticalExtensionOIDs.remove(Extension.deltaCRLIndicator.getId());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        X500Name issuer;
        Extension extension;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        Enumeration revokedCertificateEnumeration = this.f25148c.getRevokedCertificateEnumeration();
        X500Name issuer2 = this.f25148c.getIssuer();
        if (revokedCertificateEnumeration.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntry = TBSCertList.CRLEntry.getInstance(revokedCertificateEnumeration.nextElement());
                if (this.isIndirect && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                    issuer2 = X500Name.getInstance(GeneralNames.getInstance(extension.getParsedValue()).getNames()[0].getName());
                }
                if (cRLEntry.getUserCertificate().hasValue(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        issuer = X500Name.getInstance(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            issuer = org.bouncycastle.asn1.x509.Certificate.getInstance(certificate.getEncoded()).getIssuer();
                        } catch (CertificateEncodingException e10) {
                            throw new IllegalArgumentException("Cannot process certificate: " + e10.getMessage());
                        }
                    }
                    return issuer2.equals(issuer);
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x0143
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // java.security.cert.CRL
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.toString():java.lang.String");
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.1
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str) {
                try {
                    return X509CRLImpl.this.bcHelper.createSignature(str);
                } catch (Exception unused) {
                    return Signature.getInstance(str);
                }
            }
        });
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        ASN1OctetString extensionValue = getExtensionValue(this.f25148c, str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return extensionValue.getEncoded();
        } catch (Exception e10) {
            throw new IllegalStateException(a.c(e10, new StringBuilder("error parsing ")));
        }
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final String str) {
        doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.2
            @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
            public Signature createSignature(String str2) {
                String str3 = str;
                return str3 != null ? Signature.getInstance(str2, str3) : Signature.getInstance(str2);
            }
        });
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, final Provider provider) {
        try {
            doVerify(publicKey, new SignatureCreator() { // from class: org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLImpl.3
                @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.SignatureCreator
                public Signature createSignature(String str) {
                    return provider != null ? Signature.getInstance(X509CRLImpl.this.getSigAlgName(), provider) : Signature.getInstance(X509CRLImpl.this.getSigAlgName());
                }
            });
        } catch (NoSuchProviderException e10) {
            throw new NoSuchAlgorithmException("provider issue: " + e10.getMessage());
        }
    }
}
