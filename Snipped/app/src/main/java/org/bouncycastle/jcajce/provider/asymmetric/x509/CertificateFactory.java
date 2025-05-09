package org.bouncycastle.jcajce.provider.asymmetric.x509;

import C.v;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes2.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final JcaJceHelper bcHelper = new BCJcaJceHelper();
    private ASN1Set sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;
    private ASN1Set sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private InputStream currentCrlStream = null;

    public class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public ExCertificateException(Throwable th) {
            this.cause = th;
        }
    }

    private CRL doGenerateCRL(InputStream inputStream, boolean z10) {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            ASN1Set aSN1Set = this.sCrlData;
            if (aSN1Set != null) {
                if (this.sCrlDataObjectCount != aSN1Set.size()) {
                    return getCRL();
                }
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCRL(inputStream, z10) : readDERCRL(new ASN1InputStream(inputStream, true));
        } catch (CRLException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new CRLException(e11.toString());
        }
    }

    private Certificate doGenerateCertificate(InputStream inputStream, boolean z10) {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            ASN1Set aSN1Set = this.sData;
            if (aSN1Set != null) {
                if (this.sDataObjectCount != aSN1Set.size()) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? readPEMCertificate(inputStream, z10) : readDERCertificate(new ASN1InputStream(inputStream));
        } catch (Exception e10) {
            throw new ExCertificateException(v.l(e10, new StringBuilder("parsing issue: ")), e10);
        }
    }

    private CRL getCRL() {
        ASN1Set aSN1Set = this.sCrlData;
        if (aSN1Set == null || this.sCrlDataObjectCount >= aSN1Set.size()) {
            return null;
        }
        ASN1Set aSN1Set2 = this.sCrlData;
        int i = this.sCrlDataObjectCount;
        this.sCrlDataObjectCount = i + 1;
        return createCRL(CertificateList.getInstance(aSN1Set2.getObjectAt(i)));
    }

    private Certificate getCertificate() {
        if (this.sData == null) {
            return null;
        }
        while (this.sDataObjectCount < this.sData.size()) {
            ASN1Set aSN1Set = this.sData;
            int i = this.sDataObjectCount;
            this.sDataObjectCount = i + 1;
            ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
            if (objectAt instanceof ASN1Sequence) {
                return new X509CertificateObject(this.bcHelper, org.bouncycastle.asn1.x509.Certificate.getInstance(objectAt));
            }
        }
        return null;
    }

    private CRL readDERCRL(ASN1InputStream aSN1InputStream) {
        return getCRL(ASN1Sequence.getInstance(aSN1InputStream.readObject()));
    }

    private Certificate readDERCertificate(ASN1InputStream aSN1InputStream) {
        return getCertificate(ASN1Sequence.getInstance(aSN1InputStream.readObject()));
    }

    private CRL readPEMCRL(InputStream inputStream, boolean z10) {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream, z10));
    }

    private Certificate readPEMCertificate(InputStream inputStream, boolean z10) {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream, z10));
    }

    public CRL createCRL(CertificateList certificateList) {
        return new X509CRLObject(this.bcHelper, certificateList);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) {
        return doGenerateCRL(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL doGenerateCRL = doGenerateCRL(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(doGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) {
        return doGenerateCertificate(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate doGenerateCertificate = doGenerateCertificate(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(doGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }

    private CRL getCRL(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return createCRL(CertificateList.getInstance(aSN1Sequence));
        }
        this.sCrlData = SignedData.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCRLs();
        return getCRL();
    }

    private Certificate getCertificate(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData)) {
            return new X509CertificateObject(this.bcHelper, org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Sequence));
        }
        this.sData = SignedData.getInstance(ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
        return getCertificate();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }
}
