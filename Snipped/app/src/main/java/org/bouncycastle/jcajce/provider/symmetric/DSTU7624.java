package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.engines.DSTU7624WrapEngine;
import org.bouncycastle.crypto.macs.KGMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes2.dex */
public class DSTU7624 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        private final int ivLength;

        public AlgParamGen(int i) {
            this.ivLength = i / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DSTU7624");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    public static class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new CBCBlockCipher(new DSTU7624Engine(128)), 128);
        }
    }

    public static class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new CBCBlockCipher(new DSTU7624Engine(256)), 256);
        }
    }

    public static class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new CBCBlockCipher(new DSTU7624Engine(512)), 512);
        }
    }

    public static class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new KCCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new KCCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new KCCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(128))), 128);
        }
    }

    public static class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(256))), 256);
        }
    }

    public static class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(512))), 512);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new DSTU7624Engine(128);
                }
            });
        }
    }

    public static class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new DSTU7624Engine(128));
        }
    }

    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new DSTU7624Engine(256));
        }
    }

    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new DSTU7624Engine(512));
        }
    }

    public static class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new KGCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    public static class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new KGCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    public static class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new KGCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(256)), 256));
        }
    }

    public static class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(512)), 512));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("DSTU7624", i, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.v(sb2, str, "$AlgParams", configurableProvider, "AlgorithmParameters.DSTU7624");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu7624cbc_128;
            a.z(configurableProvider, str, "$AlgParams", "AlgorithmParameters", aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu7624cbc_256;
            a.z(configurableProvider, str, "$AlgParams", "AlgorithmParameters", aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = UAObjectIdentifiers.dstu7624cbc_512;
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier3, str + "$AlgParams");
            a.w(a.m(a.m(a.m(a.q(configurableProvider, "AlgorithmParameterGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "AlgorithmParameterGenerator", androidx.camera.core.impl.utils.a.n(a.l(new StringBuilder(), str, "$AlgParamGen128", configurableProvider, "AlgorithmParameterGenerator.DSTU7624"), str, "$AlgParamGen128"), str, aSN1ObjectIdentifier), "$AlgParamGen256", configurableProvider, "AlgorithmParameterGenerator", aSN1ObjectIdentifier2), str, "$AlgParamGen512"), str, aSN1ObjectIdentifier3), "$ECB_128", configurableProvider, "Cipher.DSTU7624", str), "$ECB_128", configurableProvider, "Cipher.DSTU7624-128", str), "$ECB_256", configurableProvider, "Cipher.DSTU7624-256", str), "$ECB_512", configurableProvider, "Cipher.DSTU7624-512");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = UAObjectIdentifiers.dstu7624ecb_128;
            a.z(configurableProvider, str, "$ECB128", "Cipher", aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = UAObjectIdentifiers.dstu7624ecb_256;
            a.z(configurableProvider, str, "$ECB256", "Cipher", aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = UAObjectIdentifiers.dstu7624ecb_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str + "$ECB512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "Cipher", androidx.camera.core.impl.utils.a.n(new StringBuilder(), str, "$CBC128"), str, aSN1ObjectIdentifier), "$CBC256", configurableProvider, "Cipher", aSN1ObjectIdentifier2), str, "$CBC512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = UAObjectIdentifiers.dstu7624ofb_128;
            a.z(configurableProvider, str, "$OFB128", "Cipher", aSN1ObjectIdentifier7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = UAObjectIdentifiers.dstu7624ofb_256;
            a.z(configurableProvider, str, "$OFB256", "Cipher", aSN1ObjectIdentifier8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = UAObjectIdentifiers.dstu7624ofb_512;
            a.z(configurableProvider, str, "$OFB512", "Cipher", aSN1ObjectIdentifier9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = UAObjectIdentifiers.dstu7624cfb_128;
            a.z(configurableProvider, str, "$CFB128", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = UAObjectIdentifiers.dstu7624cfb_256;
            a.z(configurableProvider, str, "$CFB256", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = UAObjectIdentifiers.dstu7624cfb_512;
            a.z(configurableProvider, str, "$CFB512", "Cipher", aSN1ObjectIdentifier12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = UAObjectIdentifiers.dstu7624ctr_128;
            a.z(configurableProvider, str, "$CTR128", "Cipher", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = UAObjectIdentifiers.dstu7624ctr_256;
            a.z(configurableProvider, str, "$CTR256", "Cipher", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = UAObjectIdentifiers.dstu7624ctr_512;
            a.z(configurableProvider, str, "$CTR512", "Cipher", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = UAObjectIdentifiers.dstu7624ccm_128;
            a.z(configurableProvider, str, "$CCM128", "Cipher", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = UAObjectIdentifiers.dstu7624ccm_256;
            a.z(configurableProvider, str, "$CCM256", "Cipher", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = UAObjectIdentifiers.dstu7624ccm_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str + "$CCM512");
            a.v(new StringBuilder(), str, "$Wrap", configurableProvider, "Cipher.DSTU7624KW");
            StringBuilder p10 = a.p(configurableProvider, "Cipher.DSTU7624-128KW", a.k(configurableProvider, "Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW", str, "$Wrap128"), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = UAObjectIdentifiers.dstu7624kw_128;
            p10.append(aSN1ObjectIdentifier19.getId());
            configurableProvider.addAlgorithm(p10.toString(), "DSTU7624-128KW");
            StringBuilder p11 = a.p(configurableProvider, "Cipher.DSTU7624-256KW", a.k(configurableProvider, "Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW", str, "$Wrap256"), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = UAObjectIdentifiers.dstu7624kw_256;
            p11.append(aSN1ObjectIdentifier20.getId());
            configurableProvider.addAlgorithm(p11.toString(), "DSTU7624-256KW");
            StringBuilder p12 = a.p(configurableProvider, "Cipher.DSTU7624-512KW", a.k(configurableProvider, "Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW", str, "$Wrap512"), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = UAObjectIdentifiers.dstu7624kw_512;
            p12.append(aSN1ObjectIdentifier21.getId());
            configurableProvider.addAlgorithm(p12.toString(), "DSTU7624-512KW");
            StringBuilder p13 = a.p(configurableProvider, "Mac.DSTU7624-128GMAC", a.k(configurableProvider, "Mac.DSTU7624GMAC", a.k(configurableProvider, "Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW", str, "$GMAC"), str, "$GMAC128"), "Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = UAObjectIdentifiers.dstu7624gmac_128;
            p13.append(aSN1ObjectIdentifier22.getId());
            configurableProvider.addAlgorithm(p13.toString(), "DSTU7624-128GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", str + "$GMAC256");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = UAObjectIdentifiers.dstu7624gmac_256;
            sb3.append(aSN1ObjectIdentifier23.getId());
            configurableProvider.addAlgorithm(sb3.toString(), "DSTU7624-256GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", str + "$GMAC512");
            StringBuilder sb4 = new StringBuilder("Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = UAObjectIdentifiers.dstu7624gmac_512;
            sb4.append(aSN1ObjectIdentifier24.getId());
            configurableProvider.addAlgorithm(sb4.toString(), "DSTU7624-512GMAC");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.q(configurableProvider, "KeyGenerator", androidx.camera.core.impl.utils.a.n(a.n(a.m(sb5, "$KeyGen", configurableProvider, "KeyGenerator.DSTU7624", str), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier19), str, "$KeyGen256"), str, aSN1ObjectIdentifier20), "$KeyGen512", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier21), str, "$KeyGen128"), str, aSN1ObjectIdentifier4), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier5), str, "$KeyGen512"), str, aSN1ObjectIdentifier6), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier), str, "$KeyGen256"), str, aSN1ObjectIdentifier2), "$KeyGen512", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier3), str, "$KeyGen128"), str, aSN1ObjectIdentifier7), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier8), str, "$KeyGen512"), str, aSN1ObjectIdentifier9), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier10), str, "$KeyGen256"), str, aSN1ObjectIdentifier11), "$KeyGen512", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier12), str, "$KeyGen128"), str, aSN1ObjectIdentifier13), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier14), str, "$KeyGen512"), str, aSN1ObjectIdentifier15), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier16), str, "$KeyGen256"), str, aSN1ObjectIdentifier17), "$KeyGen512", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier18), str, "$KeyGen128"), str, aSN1ObjectIdentifier22), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier23), str, "$KeyGen512"));
        }
    }

    public static class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new DSTU7624WrapEngine(256));
        }
    }

    public static class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new DSTU7624WrapEngine(512));
        }
    }

    private DSTU7624() {
    }
}
