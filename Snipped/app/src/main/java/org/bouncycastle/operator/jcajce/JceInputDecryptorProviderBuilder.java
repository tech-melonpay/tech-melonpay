package org.bouncycastle.operator.jcajce;

import C.v;
import java.io.InputStream;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class JceInputDecryptorProviderBuilder {
    private JcaJceHelper helper = new DefaultJcaJceHelper();

    public InputDecryptorProvider build(byte[] bArr) {
        final byte[] clone = Arrays.clone(bArr);
        return new InputDecryptorProvider() { // from class: org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.1
            private Cipher cipher;
            private AlgorithmIdentifier encryptionAlg;

            @Override // org.bouncycastle.operator.InputDecryptorProvider
            public InputDecryptor get(AlgorithmIdentifier algorithmIdentifier) {
                Cipher cipher;
                AlgorithmParameterSpec gOST28147ParameterSpec;
                this.encryptionAlg = algorithmIdentifier;
                ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                try {
                    this.cipher = JceInputDecryptorProviderBuilder.this.helper.createCipher(algorithm.getId());
                    SecretKeySpec secretKeySpec = new SecretKeySpec(clone, algorithm.getId());
                    ASN1Encodable parameters = algorithmIdentifier.getParameters();
                    if (parameters instanceof ASN1OctetString) {
                        cipher = this.cipher;
                        gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
                    } else {
                        GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
                        cipher = this.cipher;
                        gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
                    }
                    cipher.init(2, secretKeySpec, gOST28147ParameterSpec);
                    return new InputDecryptor() { // from class: org.bouncycastle.operator.jcajce.JceInputDecryptorProviderBuilder.1.1
                        @Override // org.bouncycastle.operator.InputDecryptor
                        public AlgorithmIdentifier getAlgorithmIdentifier() {
                            return AnonymousClass1.this.encryptionAlg;
                        }

                        @Override // org.bouncycastle.operator.InputDecryptor
                        public InputStream getInputStream(InputStream inputStream) {
                            return new CipherInputStream(inputStream, AnonymousClass1.this.cipher);
                        }
                    };
                } catch (Exception e10) {
                    throw new OperatorCreationException(v.l(e10, new StringBuilder("unable to create InputDecryptor: ")), e10);
                }
            }
        };
    }

    public JceInputDecryptorProviderBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JceInputDecryptorProviderBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
