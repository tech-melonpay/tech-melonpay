package org.bouncycastle.pkcs.jcajce;

import C.v;
import java.io.OutputStream;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.io.MacOutputStream;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder;
import org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider;

/* loaded from: classes3.dex */
public class JcePKCS12MacCalculatorBuilderProvider implements PKCS12MacCalculatorBuilderProvider {
    private JcaJceHelper helper = new DefaultJcaJceHelper();

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilderProvider
    public PKCS12MacCalculatorBuilder get(final AlgorithmIdentifier algorithmIdentifier) {
        return new PKCS12MacCalculatorBuilder() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider.1
            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public MacCalculator build(char[] cArr) {
                final PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                try {
                    final ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                    final Mac createMac = JcePKCS12MacCalculatorBuilderProvider.this.helper.createMac(algorithm.getId());
                    PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                    final PKCS12Key pKCS12Key = new PKCS12Key(cArr);
                    createMac.init(pKCS12Key, pBEParameterSpec);
                    return new MacCalculator() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilderProvider.1.1
                        @Override // org.bouncycastle.operator.MacCalculator
                        public AlgorithmIdentifier getAlgorithmIdentifier() {
                            return new AlgorithmIdentifier(algorithm, pKCS12PBEParams);
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public GenericKey getKey() {
                            return new GenericKey(getAlgorithmIdentifier(), pKCS12Key.getEncoded());
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public byte[] getMac() {
                            return createMac.doFinal();
                        }

                        @Override // org.bouncycastle.operator.MacCalculator
                        public OutputStream getOutputStream() {
                            return new MacOutputStream(createMac);
                        }
                    };
                } catch (Exception e10) {
                    throw new OperatorCreationException(v.l(e10, new StringBuilder("unable to create MAC calculator: ")), e10);
                }
            }

            @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
            public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
                return new AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), DERNull.INSTANCE);
            }
        };
    }

    public JcePKCS12MacCalculatorBuilderProvider setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePKCS12MacCalculatorBuilderProvider setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
