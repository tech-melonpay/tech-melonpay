package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsVerifier;

/* loaded from: classes3.dex */
public class JcaTlsCertificate implements TlsCertificate {
    protected final X509Certificate certificate;
    protected final JcaTlsCrypto crypto;
    protected DHPublicKey pubKeyDH;
    protected ECPublicKey pubKeyEC;
    protected RSAPublicKey pubKeyRSA;

    public JcaTlsCertificate(JcaTlsCrypto jcaTlsCrypto, X509Certificate x509Certificate) {
        this.pubKeyDH = null;
        this.pubKeyEC = null;
        this.pubKeyRSA = null;
        this.crypto = jcaTlsCrypto;
        this.certificate = x509Certificate;
    }

    public static JcaTlsCertificate convert(JcaTlsCrypto jcaTlsCrypto, TlsCertificate tlsCertificate) {
        return tlsCertificate instanceof JcaTlsCertificate ? (JcaTlsCertificate) tlsCertificate : new JcaTlsCertificate(jcaTlsCrypto, tlsCertificate.getEncoded());
    }

    public static X509Certificate parseCertificate(JcaJceHelper jcaJceHelper, byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Certificate.getInstance(bArr).getEncoded(ASN1Encoding.DER));
            X509Certificate x509Certificate = (X509Certificate) jcaJceHelper.createCertificateFactory("X.509").generateCertificate(byteArrayInputStream);
            if (byteArrayInputStream.available() == 0) {
                return x509Certificate;
            }
            throw new IOException("Extra data detected in stream");
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException("unable to decode certificate", e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public TlsVerifier createVerifier(short s10) {
        validateKeyUsage(128);
        switch (s10) {
            case 1:
                validateRSA_PKCS1();
                return new JcaTlsRSAVerifier(this.crypto, getPubKeyRSA());
            case 2:
                return new JcaTlsDSAVerifier(this.crypto, getPubKeyDSS());
            case 3:
                return new JcaTlsECDSAVerifier(this.crypto, getPubKeyEC());
            case 4:
            case 5:
            case 6:
                validateRSA_PSS_RSAE();
                return new JcaTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), s10);
            case 7:
                return new JcaTlsEd25519Verifier(this.crypto, getPubKeyEd25519());
            case 8:
                return new JcaTlsEd448Verifier(this.crypto, getPubKeyEd448());
            case 9:
            case 10:
            case 11:
                validateRSA_PSS_PSS(s10);
                return new JcaTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), s10);
            default:
                throw new TlsFatalAlert((short) 46);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public byte[] getEncoded() {
        try {
            return this.certificate.getEncoded();
        } catch (CertificateEncodingException e10) {
            throw new TlsCryptoException("unable to encode certificate: " + e10.getMessage(), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public byte[] getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        byte[] extensionValue = this.certificate.getExtensionValue(aSN1ObjectIdentifier.getId());
        if (extensionValue == null) {
            return null;
        }
        return ((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets();
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public short getLegacySignatureAlgorithm() {
        PublicKey publicKey = getPublicKey();
        try {
            validateKeyUsage(128);
            if (publicKey instanceof RSAPublicKey) {
                return (short) 1;
            }
            if (publicKey instanceof DSAPublicKey) {
                return (short) 2;
            }
            if (publicKey instanceof ECPublicKey) {
                return (short) 3;
            }
            throw new TlsFatalAlert((short) 43);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 43, e11);
        }
    }

    public DHPublicKey getPubKeyDH() {
        try {
            return (DHPublicKey) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public DSAPublicKey getPubKeyDSS() {
        try {
            return (DSAPublicKey) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public ECPublicKey getPubKeyEC() {
        try {
            return (ECPublicKey) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public PublicKey getPubKeyEd25519() {
        PublicKey publicKey = getPublicKey();
        if (EdDSAParameterSpec.Ed25519.equals(publicKey.getAlgorithm())) {
            return publicKey;
        }
        throw new TlsFatalAlert((short) 46);
    }

    public PublicKey getPubKeyEd448() {
        PublicKey publicKey = getPublicKey();
        if (EdDSAParameterSpec.Ed448.equals(publicKey.getAlgorithm())) {
            return publicKey;
        }
        throw new TlsFatalAlert((short) 46);
    }

    public RSAPublicKey getPubKeyRSA() {
        try {
            return (RSAPublicKey) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public PublicKey getPublicKey() {
        try {
            return this.certificate.getPublicKey();
        } catch (RuntimeException e10) {
            throw new TlsFatalAlert((short) 43, e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public BigInteger getSerialNumber() {
        return this.certificate.getSerialNumber();
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public String getSigAlgOID() {
        return this.certificate.getSigAlgOID();
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return SubjectPublicKeyInfo.getInstance(getPublicKey().getEncoded());
    }

    public X509Certificate getX509Certificate() {
        return this.certificate;
    }

    public boolean supportsKeyUsage(int i) {
        KeyUsage fromExtensions;
        try {
            Extensions extensions = TBSCertificate.getInstance(this.certificate.getTBSCertificate()).getExtensions();
            return extensions == null || (fromExtensions = KeyUsage.fromExtensions(extensions)) == null || ((fromExtensions.getBytes()[0] & 255) & i) == i;
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    public boolean supportsRSA_PKCS1() {
        return org.bouncycastle.tls.crypto.impl.RSAUtil.supportsPKCS1(getSubjectPublicKeyInfo().getAlgorithm());
    }

    public boolean supportsRSA_PSS_PSS(short s10) {
        return org.bouncycastle.tls.crypto.impl.RSAUtil.supportsPSS_PSS(s10, getSubjectPublicKeyInfo().getAlgorithm());
    }

    public boolean supportsRSA_PSS_RSAE() {
        return org.bouncycastle.tls.crypto.impl.RSAUtil.supportsPSS_RSAE(getSubjectPublicKeyInfo().getAlgorithm());
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public boolean supportsSignatureAlgorithm(short s10) {
        String str;
        if (!supportsKeyUsage(128)) {
            return false;
        }
        PublicKey publicKey = getPublicKey();
        switch (s10) {
            case 1:
                return supportsRSA_PKCS1() && (publicKey instanceof RSAPublicKey);
            case 2:
                return publicKey instanceof DSAPublicKey;
            case 3:
                return publicKey instanceof ECPublicKey;
            case 4:
            case 5:
            case 6:
                return supportsRSA_PSS_RSAE() && (publicKey instanceof RSAPublicKey);
            case 7:
                str = EdDSAParameterSpec.Ed25519;
                break;
            case 8:
                str = EdDSAParameterSpec.Ed448;
                break;
            case 9:
            case 10:
            case 11:
                return supportsRSA_PSS_PSS(s10) && (publicKey instanceof RSAPublicKey);
            default:
                return false;
        }
        return str.equals(publicKey.getAlgorithm());
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public TlsCertificate useInRole(int i, int i9) {
        if (i9 == 7 || i9 == 9) {
            validateKeyUsage(8);
            this.pubKeyDH = getPubKeyDH();
            return this;
        }
        if (i9 == 16 || i9 == 18) {
            validateKeyUsage(8);
            this.pubKeyEC = getPubKeyEC();
            return this;
        }
        if (i != 0 || (i9 != 1 && i9 != 15)) {
            throw new TlsFatalAlert((short) 46);
        }
        validateKeyUsage(32);
        this.pubKeyRSA = getPubKeyRSA();
        return this;
    }

    public void validateKeyUsage(int i) {
        if (!supportsKeyUsage(i)) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    public void validateRSA_PKCS1() {
        if (!supportsRSA_PKCS1()) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    public void validateRSA_PSS_PSS(short s10) {
        if (!supportsRSA_PSS_PSS(s10)) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    public void validateRSA_PSS_RSAE() {
        if (!supportsRSA_PSS_RSAE()) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    public JcaTlsCertificate(JcaTlsCrypto jcaTlsCrypto, byte[] bArr) {
        this(jcaTlsCrypto, parseCertificate(jcaTlsCrypto.getHelper(), bArr));
    }
}
