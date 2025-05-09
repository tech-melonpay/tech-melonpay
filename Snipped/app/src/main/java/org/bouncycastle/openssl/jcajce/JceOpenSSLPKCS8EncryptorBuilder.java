package org.bouncycastle.openssl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.jcajce.JceGenericKey;

/* loaded from: classes3.dex */
public class JceOpenSSLPKCS8EncryptorBuilder {
    private ASN1ObjectIdentifier algOID;
    private Cipher cipher;
    private SecretKey key;
    private AlgorithmParameterGenerator paramGen;
    private AlgorithmParameters params;
    private char[] password;
    private SecureRandom random;
    byte[] salt;
    public static final String AES_128_CBC = NISTObjectIdentifiers.id_aes128_CBC.getId();
    public static final String AES_192_CBC = NISTObjectIdentifiers.id_aes192_CBC.getId();
    public static final String AES_256_CBC = NISTObjectIdentifiers.id_aes256_CBC.getId();
    public static final String DES3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC.getId();
    public static final String PBE_SHA1_RC4_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId();
    public static final String PBE_SHA1_RC4_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4.getId();
    public static final String PBE_SHA1_3DES = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_2DES = PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC.getId();
    public static final String PBE_SHA1_RC2_128 = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC.getId();
    public static final String PBE_SHA1_RC2_40 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC.getId();
    private JcaJceHelper helper = new DefaultJcaJceHelper();
    private AlgorithmIdentifier prf = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA1, DERNull.INSTANCE);
    int iterationCount = 2048;

    public JceOpenSSLPKCS8EncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algOID = aSN1ObjectIdentifier;
    }

    public OutputEncryptor build() {
        final AlgorithmIdentifier algorithmIdentifier;
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        try {
            this.cipher = this.helper.createCipher(this.algOID.getId());
            if (PEMUtilities.isPKCS5Scheme2(this.algOID)) {
                this.paramGen = this.helper.createAlgorithmParameterGenerator(this.algOID.getId());
            }
            if (PEMUtilities.isPKCS5Scheme2(this.algOID)) {
                byte[] bArr = new byte[PEMUtilities.getSaltSize(this.prf.getAlgorithm())];
                this.salt = bArr;
                this.random.nextBytes(bArr);
                AlgorithmParameters generateParameters = this.paramGen.generateParameters();
                this.params = generateParameters;
                try {
                    EncryptionScheme encryptionScheme = new EncryptionScheme(this.algOID, ASN1Primitive.fromByteArray(generateParameters.getEncoded()));
                    KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(this.salt, this.iterationCount, this.prf));
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    aSN1EncodableVector.add(keyDerivationFunc);
                    aSN1EncodableVector.add(encryptionScheme);
                    algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, PBES2Parameters.getInstance(new DERSequence(aSN1EncodableVector)));
                    try {
                        this.key = PEMUtilities.isHmacSHA1(this.prf) ? PEMUtilities.generateSecretKeyForPKCS5Scheme2(this.helper, this.algOID.getId(), this.password, this.salt, this.iterationCount) : PEMUtilities.generateSecretKeyForPKCS5Scheme2(this.helper, this.algOID.getId(), this.password, this.salt, this.iterationCount, this.prf);
                        this.cipher.init(1, this.key, this.params);
                    } catch (GeneralSecurityException e10) {
                        throw new OperatorCreationException(e10.getMessage(), e10);
                    }
                } catch (IOException e11) {
                    throw new OperatorCreationException(e11.getMessage(), e11);
                }
            } else {
                if (!PEMUtilities.isPKCS12(this.algOID)) {
                    throw new OperatorCreationException("unknown algorithm: " + this.algOID, null);
                }
                ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                byte[] bArr2 = new byte[20];
                this.salt = bArr2;
                this.random.nextBytes(bArr2);
                aSN1EncodableVector2.add(new DEROctetString(this.salt));
                aSN1EncodableVector2.add(new ASN1Integer(this.iterationCount));
                AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(this.algOID, PKCS12PBEParams.getInstance(new DERSequence(aSN1EncodableVector2)));
                try {
                    this.cipher.init(1, new PKCS12KeyWithParameters(this.password, this.salt, this.iterationCount));
                    algorithmIdentifier = algorithmIdentifier2;
                } catch (GeneralSecurityException e12) {
                    throw new OperatorCreationException(e12.getMessage(), e12);
                }
            }
            return new OutputEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.1
                @Override // org.bouncycastle.operator.OutputEncryptor
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return algorithmIdentifier;
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public GenericKey getKey() {
                    return new JceGenericKey(algorithmIdentifier, JceOpenSSLPKCS8EncryptorBuilder.this.key);
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public OutputStream getOutputStream(OutputStream outputStream) {
                    return new CipherOutputStream(outputStream, JceOpenSSLPKCS8EncryptorBuilder.this.cipher);
                }
            };
        } catch (GeneralSecurityException e13) {
            throw new OperatorCreationException(this.algOID + " not available: " + e13.getMessage(), e13);
        }
    }

    public JceOpenSSLPKCS8EncryptorBuilder setIterationCount(int i) {
        this.iterationCount = i;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setPRF(AlgorithmIdentifier algorithmIdentifier) {
        this.prf = algorithmIdentifier;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setPasssword(char[] cArr) {
        this.password = cArr;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceOpenSSLPKCS8EncryptorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
