package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HMacSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.HashSP800DRBG;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class SP800SecureRandomBuilder {
    private int entropyBitsRequired;
    private final EntropySourceProvider entropySourceProvider;
    private byte[] personalizationString;
    private final SecureRandom random;
    private int securityStrength;

    public static class CTRDRBGProvider implements DRBGProvider {
        private final BlockCipher blockCipher;
        private final int keySizeInBits;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public CTRDRBGProvider(BlockCipher blockCipher, int i, byte[] bArr, byte[] bArr2, int i9) {
            this.blockCipher = blockCipher;
            this.keySizeInBits = i;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i9;
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new CTRSP800DRBG(this.blockCipher, this.keySizeInBits, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public String getAlgorithm() {
            if (this.blockCipher instanceof DESedeEngine) {
                return "CTR-DRBG-3KEY-TDES";
            }
            return "CTR-DRBG-" + this.blockCipher.getAlgorithmName() + this.keySizeInBits;
        }
    }

    public static class HMacDRBGProvider implements DRBGProvider {
        private final Mac hMac;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public HMacDRBGProvider(Mac mac, byte[] bArr, byte[] bArr2, int i) {
            this.hMac = mac;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i;
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new HMacSP800DRBG(this.hMac, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public String getAlgorithm() {
            StringBuilder sb2;
            String algorithmName;
            if (this.hMac instanceof HMac) {
                sb2 = new StringBuilder("HMAC-DRBG-");
                algorithmName = SP800SecureRandomBuilder.getSimplifiedName(((HMac) this.hMac).getUnderlyingDigest());
            } else {
                sb2 = new StringBuilder("HMAC-DRBG-");
                algorithmName = this.hMac.getAlgorithmName();
            }
            sb2.append(algorithmName);
            return sb2.toString();
        }
    }

    public static class HashDRBGProvider implements DRBGProvider {
        private final Digest digest;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public HashDRBGProvider(Digest digest, byte[] bArr, byte[] bArr2, int i) {
            this.digest = digest;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i;
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new HashSP800DRBG(this.digest, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }

        @Override // org.bouncycastle.crypto.prng.DRBGProvider
        public String getAlgorithm() {
            return "HASH-DRBG-" + SP800SecureRandomBuilder.getSimplifiedName(this.digest);
        }
    }

    public SP800SecureRandomBuilder() {
        this(CryptoServicesRegistrar.getSecureRandom(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getSimplifiedName(Digest digest) {
        String algorithmName = digest.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
    }

    public SP800SecureRandom buildCTR(BlockCipher blockCipher, int i, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new CTRDRBGProvider(blockCipher, i, bArr, this.personalizationString, this.securityStrength), z10);
    }

    public SP800SecureRandom buildHMAC(Mac mac, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HMacDRBGProvider(mac, bArr, this.personalizationString, this.securityStrength), z10);
    }

    public SP800SecureRandom buildHash(Digest digest, byte[] bArr, boolean z10) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HashDRBGProvider(digest, bArr, this.personalizationString, this.securityStrength), z10);
    }

    public SP800SecureRandomBuilder setEntropyBitsRequired(int i) {
        this.entropyBitsRequired = i;
        return this;
    }

    public SP800SecureRandomBuilder setPersonalizationString(byte[] bArr) {
        this.personalizationString = Arrays.clone(bArr);
        return this;
    }

    public SP800SecureRandomBuilder setSecurityStrength(int i) {
        this.securityStrength = i;
        return this;
    }

    public SP800SecureRandomBuilder(SecureRandom secureRandom, boolean z10) {
        this.securityStrength = 256;
        this.entropyBitsRequired = 256;
        this.random = secureRandom;
        this.entropySourceProvider = new BasicEntropySourceProvider(secureRandom, z10);
    }

    public SP800SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.securityStrength = 256;
        this.entropyBitsRequired = 256;
        this.random = null;
        this.entropySourceProvider = entropySourceProvider;
    }
}
