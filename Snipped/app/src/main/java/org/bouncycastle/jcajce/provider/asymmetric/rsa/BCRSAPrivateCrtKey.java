package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {
    static final long serialVersionUID = 7834723820638524718L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    public BCRSAPrivateCrtKey(RSAPrivateCrtKey rSAPrivateCrtKey) {
        super(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKey.getModulus();
        this.publicExponent = rSAPrivateCrtKey.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        this.primeP = rSAPrivateCrtKey.getPrimeP();
        this.primeQ = rSAPrivateCrtKey.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKey.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKey.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKey.getCrtCoefficient();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new RSAPrivateCrtKeyParameters(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        return this.crtCoefficient;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(this.algorithmIdentifier, new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        return this.primeExponentP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        return this.primeExponentQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        return this.primeP;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        return this.primeQ;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Private CRT Key [");
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("],[");
        stringBuffer.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        stringBuffer.append("             modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(lineSeparator);
        stringBuffer.append("     public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient()));
        this.modulus = rSAPrivateCrtKeySpec.getModulus();
        this.publicExponent = rSAPrivateCrtKeySpec.getPublicExponent();
        this.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        this.primeP = rSAPrivateCrtKeySpec.getPrimeP();
        this.primeQ = rSAPrivateCrtKeySpec.getPrimeQ();
        this.primeExponentP = rSAPrivateCrtKeySpec.getPrimeExponentP();
        this.primeExponentQ = rSAPrivateCrtKeySpec.getPrimeExponentQ();
        this.crtCoefficient = rSAPrivateCrtKeySpec.getCrtCoefficient();
    }

    public BCRSAPrivateCrtKey(PrivateKeyInfo privateKeyInfo) {
        this(privateKeyInfo.getPrivateKeyAlgorithm(), RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()));
    }

    public BCRSAPrivateCrtKey(RSAPrivateKey rSAPrivateKey) {
        this(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER, rSAPrivateKey);
    }

    public BCRSAPrivateCrtKey(AlgorithmIdentifier algorithmIdentifier, RSAPrivateKey rSAPrivateKey) {
        super(algorithmIdentifier, new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient()));
        this.modulus = rSAPrivateKey.getModulus();
        this.publicExponent = rSAPrivateKey.getPublicExponent();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.primeP = rSAPrivateKey.getPrime1();
        this.primeQ = rSAPrivateKey.getPrime2();
        this.primeExponentP = rSAPrivateKey.getExponent1();
        this.primeExponentQ = rSAPrivateKey.getExponent2();
        this.crtCoefficient = rSAPrivateKey.getCoefficient();
    }

    public BCRSAPrivateCrtKey(AlgorithmIdentifier algorithmIdentifier, RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(algorithmIdentifier, rSAPrivateCrtKeyParameters);
        this.publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.primeP = rSAPrivateCrtKeyParameters.getP();
        this.primeQ = rSAPrivateCrtKeyParameters.getQ();
        this.primeExponentP = rSAPrivateCrtKeyParameters.getDP();
        this.primeExponentQ = rSAPrivateCrtKeyParameters.getDQ();
        this.crtCoefficient = rSAPrivateCrtKeyParameters.getQInv();
    }

    public BCRSAPrivateCrtKey(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        super(rSAPrivateCrtKeyParameters);
        this.publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        this.primeP = rSAPrivateCrtKeyParameters.getP();
        this.primeQ = rSAPrivateCrtKeyParameters.getQ();
        this.primeExponentP = rSAPrivateCrtKeyParameters.getDP();
        this.primeExponentQ = rSAPrivateCrtKeyParameters.getDQ();
        this.crtCoefficient = rSAPrivateCrtKeyParameters.getQInv();
    }
}
