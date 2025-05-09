package org.bouncycastle.x509;

import C.v;
import androidx.camera.core.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.extension.X509ExtensionUtil;
import s3.b;

/* loaded from: classes3.dex */
public class X509V3CertificateGenerator {
    private AlgorithmIdentifier sigAlgId;
    private ASN1ObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private final JcaJceHelper bcHelper = new BCJcaJceHelper();
    private final CertificateFactory certificateFactory = new CertificateFactory();
    private V3TBSCertificateGenerator tbsGen = new V3TBSCertificateGenerator();
    private X509ExtensionsGenerator extGenerator = new X509ExtensionsGenerator();

    private DERBitString booleanToBitString(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i = 0; i != zArr.length; i++) {
            int i9 = i / 8;
            bArr[i9] = (byte) (bArr[i9] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new DERBitString(bArr) : new DERBitString(bArr, 8 - length);
    }

    private X509Certificate generateJcaObject(TBSCertificate tBSCertificate, byte[] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.sigAlgId);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return (X509Certificate) this.certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER)));
    }

    private TBSCertificate generateTbsCert() {
        if (!this.extGenerator.isEmpty()) {
            this.tbsGen.setExtensions(this.extGenerator.generate());
        }
        return this.tbsGen.generateTBSCertificate();
    }

    public void addExtension(String str, boolean z10, ASN1Encodable aSN1Encodable) {
        addExtension(new ASN1ObjectIdentifier(str), z10, aSN1Encodable);
    }

    public void copyAndAddExtension(String str, boolean z10, X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(str);
        if (extensionValue == null) {
            throw new CertificateParsingException(n.a("extension ", str, " not present"));
        }
        try {
            addExtension(str, z10, X509ExtensionUtil.fromExtensionValue(extensionValue));
        } catch (IOException e10) {
            throw new CertificateParsingException(e10.toString());
        }
    }

    public X509Certificate generate(PrivateKey privateKey) {
        return generate(privateKey, (SecureRandom) null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey) {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public Iterator getSignatureAlgNames() {
        return X509Util.getAlgNames();
    }

    public void reset() {
        this.tbsGen = new V3TBSCertificateGenerator();
        this.extGenerator.reset();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e10) {
            throw new IllegalArgumentException(v.m("can't process principal: ", e10));
        }
    }

    public void setIssuerUniqueID(boolean[] zArr) {
        this.tbsGen.setIssuerUniqueID(booleanToBitString(zArr));
    }

    public void setNotAfter(Date date) {
        this.tbsGen.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date) {
        this.tbsGen.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publicKey) {
        try {
            this.tbsGen.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()));
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.c(e10, new StringBuilder("unable to process key - ")));
        }
    }

    public void setSerialNumber(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        this.tbsGen.setSerialNumber(new ASN1Integer(bigInteger));
    }

    public void setSignatureAlgorithm(String str) {
        this.signatureAlgorithm = str;
        try {
            ASN1ObjectIdentifier algorithmOID = X509Util.getAlgorithmOID(str);
            this.sigOID = algorithmOID;
            AlgorithmIdentifier sigAlgID = X509Util.getSigAlgID(algorithmOID, str);
            this.sigAlgId = sigAlgID;
            this.tbsGen.setSignature(sigAlgID);
        } catch (Exception unused) {
            throw new IllegalArgumentException(b.j("Unknown signature type requested: ", str));
        }
    }

    public void setSubjectDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setSubject(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e10) {
            throw new IllegalArgumentException(v.m("can't process principal: ", e10));
        }
    }

    public void setSubjectUniqueID(boolean[] zArr) {
        this.tbsGen.setSubjectUniqueID(booleanToBitString(zArr));
    }

    public void addExtension(String str, boolean z10, byte[] bArr) {
        addExtension(new ASN1ObjectIdentifier(str), z10, bArr);
    }

    public X509Certificate generate(PrivateKey privateKey, String str) {
        return generate(privateKey, str, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) {
        return generateX509Certificate(privateKey, str, null);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, aSN1Encodable);
    }

    public X509Certificate generate(PrivateKey privateKey, String str, SecureRandom secureRandom) {
        TBSCertificate generateTbsCert = generateTbsCert();
        try {
            try {
                return generateJcaObject(generateTbsCert, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, str, privateKey, secureRandom, generateTbsCert));
            } catch (Exception e10) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e10);
            }
        } catch (IOException e11) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e11);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str, SecureRandom secureRandom) {
        try {
            return generate(privateKey, str, secureRandom);
        } catch (InvalidKeyException e10) {
            throw e10;
        } catch (NoSuchProviderException e11) {
            throw e11;
        } catch (SignatureException e12) {
            throw e12;
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("exception: " + e13);
        }
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        this.extGenerator.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, bArr);
    }

    public X509Certificate generate(PrivateKey privateKey, SecureRandom secureRandom) {
        TBSCertificate generateTbsCert = generateTbsCert();
        try {
            try {
                return generateJcaObject(generateTbsCert, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, privateKey, secureRandom, generateTbsCert));
            } catch (Exception e10) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e10);
            }
        } catch (IOException e11) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e11);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.tbsGen.setIssuer(x509Name);
    }

    public void setSubjectDN(X509Name x509Name) {
        this.tbsGen.setSubject(x509Name);
    }

    public void copyAndAddExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, X509Certificate x509Certificate) {
        copyAndAddExtension(aSN1ObjectIdentifier.getId(), z10, x509Certificate);
    }
}
