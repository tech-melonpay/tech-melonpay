package org.bouncycastle.jcajce.provider.symmetric;

import C.v;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes2.dex */
public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            a.v(a.l(a.l(a.l(a.l(a.l(sb2, str, "$ECB", configurableProvider, "Cipher.Serpent"), str, "$KeyGen", configurableProvider, "KeyGenerator.Serpent"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.Serpent"), str, "$TECB", configurableProvider, "Cipher.Tnepres"), str, "$TKeyGen", configurableProvider, "KeyGenerator.Tnepres"), str, "$TAlgParams", configurableProvider, "AlgorithmParameters.Tnepres");
            a.z(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_128_ECB);
            a.z(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_192_ECB);
            a.z(configurableProvider, str, "$ECB", "Cipher", GNUObjectIdentifiers.Serpent_256_ECB);
            a.z(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_128_CBC);
            a.z(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_192_CBC);
            a.z(configurableProvider, str, "$CBC", "Cipher", GNUObjectIdentifiers.Serpent_256_CBC);
            a.z(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_128_CFB);
            a.z(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_192_CFB);
            a.z(configurableProvider, str, "$CFB", "Cipher", GNUObjectIdentifiers.Serpent_256_CFB);
            a.z(configurableProvider, str, "$OFB", "Cipher", GNUObjectIdentifiers.Serpent_128_OFB);
            a.z(configurableProvider, str, "$OFB", "Cipher", GNUObjectIdentifiers.Serpent_192_OFB);
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_OFB, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", androidx.camera.core.impl.utils.a.n(new StringBuilder(), str, "$SerpentGMAC"), v.n(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", v.n(str, "$TSerpentGMAC"), v.n(str, "$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", v.n(str, "$Poly1305"), v.n(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SerpentEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new SerpentEngine())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new TnepresEngine();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new TnepresEngine())));
        }
    }

    private Serpent() {
    }
}
