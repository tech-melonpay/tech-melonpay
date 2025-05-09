package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsVerifier;
import org.bouncycastle.tls.crypto.impl.RSAUtil;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BcTlsCertificate implements TlsCertificate {
    protected final Certificate certificate;
    protected final BcTlsCrypto crypto;
    protected DHPublicKeyParameters pubKeyDH;
    protected ECPublicKeyParameters pubKeyEC;
    protected Ed25519PublicKeyParameters pubKeyEd25519;
    protected Ed448PublicKeyParameters pubKeyEd448;
    protected RSAKeyParameters pubKeyRSA;

    public BcTlsCertificate(BcTlsCrypto bcTlsCrypto, Certificate certificate) {
        this.pubKeyDH = null;
        this.pubKeyEC = null;
        this.pubKeyEd25519 = null;
        this.pubKeyEd448 = null;
        this.pubKeyRSA = null;
        this.crypto = bcTlsCrypto;
        this.certificate = certificate;
    }

    public static BcTlsCertificate convert(BcTlsCrypto bcTlsCrypto, TlsCertificate tlsCertificate) {
        return tlsCertificate instanceof BcTlsCertificate ? (BcTlsCertificate) tlsCertificate : new BcTlsCertificate(bcTlsCrypto, tlsCertificate.getEncoded());
    }

    public static Certificate parseCertificate(byte[] bArr) {
        try {
            return Certificate.getInstance(bArr);
        } catch (IllegalArgumentException e10) {
            throw new TlsFatalAlert((short) 42, e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public TlsVerifier createVerifier(short s10) {
        validateKeyUsage(128);
        switch (s10) {
            case 1:
                validateRSA_PKCS1();
                return new BcTlsRSAVerifier(this.crypto, getPubKeyRSA());
            case 2:
                return new BcTlsDSAVerifier(this.crypto, getPubKeyDSS());
            case 3:
                return new BcTlsECDSAVerifier(this.crypto, getPubKeyEC());
            case 4:
            case 5:
            case 6:
                validateRSA_PSS_RSAE();
                return new BcTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), s10);
            case 7:
                return new BcTlsEd25519Verifier(this.crypto, getPubKeyEd25519());
            case 8:
                return new BcTlsEd448Verifier(this.crypto, getPubKeyEd448());
            case 9:
            case 10:
            case 11:
                validateRSA_PSS_PSS(s10);
                return new BcTlsRSAPSSVerifier(this.crypto, getPubKeyRSA(), s10);
            default:
                throw new TlsFatalAlert((short) 46);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public byte[] getEncoded() {
        return this.certificate.getEncoded(ASN1Encoding.DER);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public byte[] getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extension extension;
        Extensions extensions = this.certificate.getTBSCertificate().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(aSN1ObjectIdentifier)) == null) {
            return null;
        }
        return Arrays.clone(extension.getExtnValue().getOctets());
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public short getLegacySignatureAlgorithm() {
        AsymmetricKeyParameter publicKey = getPublicKey();
        if (publicKey.isPrivate()) {
            throw new TlsFatalAlert((short) 80);
        }
        try {
            validateKeyUsage(128);
            if (publicKey instanceof RSAKeyParameters) {
                return (short) 1;
            }
            if (publicKey instanceof DSAPublicKeyParameters) {
                return (short) 2;
            }
            if (publicKey instanceof ECPublicKeyParameters) {
                return (short) 3;
            }
            throw new TlsFatalAlert((short) 43);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 43, e11);
        }
    }

    public DHPublicKeyParameters getPubKeyDH() {
        try {
            return (DHPublicKeyParameters) getPublicKey();
        } catch (RuntimeException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public DSAPublicKeyParameters getPubKeyDSS() {
        try {
            return (DSAPublicKeyParameters) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public ECPublicKeyParameters getPubKeyEC() {
        try {
            return (ECPublicKeyParameters) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public Ed25519PublicKeyParameters getPubKeyEd25519() {
        try {
            return (Ed25519PublicKeyParameters) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public Ed448PublicKeyParameters getPubKeyEd448() {
        try {
            return (Ed448PublicKeyParameters) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public RSAKeyParameters getPubKeyRSA() {
        try {
            return (RSAKeyParameters) getPublicKey();
        } catch (ClassCastException e10) {
            throw new TlsFatalAlert((short) 46, e10);
        }
    }

    public AsymmetricKeyParameter getPublicKey() {
        try {
            return PublicKeyFactory.createKey(this.certificate.getSubjectPublicKeyInfo());
        } catch (RuntimeException e10) {
            throw new TlsFatalAlert((short) 43, e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public BigInteger getSerialNumber() {
        return this.certificate.getSerialNumber().getValue();
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public String getSigAlgOID() {
        return this.certificate.getSignatureAlgorithm().getAlgorithm().getId();
    }

    public boolean supportsKeyUsage(int i) {
        KeyUsage fromExtensions;
        Extensions extensions = this.certificate.getTBSCertificate().getExtensions();
        return extensions == null || (fromExtensions = KeyUsage.fromExtensions(extensions)) == null || ((fromExtensions.getBytes()[0] & 255) & i) == i;
    }

    public boolean supportsRSA_PKCS1() {
        return RSAUtil.supportsPKCS1(this.certificate.getSubjectPublicKeyInfo().getAlgorithm());
    }

    public boolean supportsRSA_PSS_PSS(short s10) {
        return RSAUtil.supportsPSS_PSS(s10, this.certificate.getSubjectPublicKeyInfo().getAlgorithm());
    }

    public boolean supportsRSA_PSS_RSAE() {
        return RSAUtil.supportsPSS_RSAE(this.certificate.getSubjectPublicKeyInfo().getAlgorithm());
    }

    @Override // org.bouncycastle.tls.crypto.TlsCertificate
    public boolean supportsSignatureAlgorithm(short s10) {
        if (!supportsKeyUsage(128)) {
            return false;
        }
        AsymmetricKeyParameter publicKey = getPublicKey();
        switch (s10) {
            case 1:
                if (supportsRSA_PKCS1() && (publicKey instanceof RSAKeyParameters)) {
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (supportsRSA_PSS_RSAE() && (publicKey instanceof RSAKeyParameters)) {
                    break;
                }
                break;
            case 9:
            case 10:
            case 11:
                if (supportsRSA_PSS_PSS(s10) && (publicKey instanceof RSAKeyParameters)) {
                    break;
                }
                break;
        }
        return false;
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

    public BcTlsCertificate(BcTlsCrypto bcTlsCrypto, byte[] bArr) {
        this(bcTlsCrypto, parseCertificate(bArr));
    }
}
