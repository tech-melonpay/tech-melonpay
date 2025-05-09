package org.bouncycastle.tls.crypto.impl.jcajce;

import androidx.camera.core.impl.utils.a;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoProvider;

/* loaded from: classes3.dex */
public class JcaTlsCryptoProvider implements TlsCryptoProvider {
    private JcaJceHelper helper = new DefaultJcaJceHelper();

    public static class NonceEntropySource extends SecureRandom {

        public static class NonceEntropySourceSpi extends SecureRandomSpi {
            private final MessageDigest digest;
            private final byte[] seed;
            private final SecureRandom source;
            private final byte[] state;

            public NonceEntropySourceSpi(SecureRandom secureRandom, MessageDigest messageDigest) {
                this.source = secureRandom;
                this.digest = messageDigest;
                byte[] generateSeed = secureRandom.generateSeed(messageDigest.getDigestLength());
                this.seed = generateSeed;
                this.state = new byte[generateSeed.length];
            }

            private void runDigest(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                this.digest.update(bArr);
                this.digest.update(bArr2);
                try {
                    this.digest.digest(bArr3, 0, bArr3.length);
                } catch (DigestException e10) {
                    throw Exceptions.illegalStateException("unable to generate nonce data: " + e10.getMessage(), e10);
                }
            }

            @Override // java.security.SecureRandomSpi
            public byte[] engineGenerateSeed(int i) {
                return this.source.generateSeed(i);
            }

            @Override // java.security.SecureRandomSpi
            public void engineNextBytes(byte[] bArr) {
                synchronized (this.digest) {
                    try {
                        int length = this.state.length;
                        int i = 0;
                        while (i != bArr.length) {
                            byte[] bArr2 = this.state;
                            if (length == bArr2.length) {
                                this.source.nextBytes(bArr2);
                                byte[] bArr3 = this.seed;
                                byte[] bArr4 = this.state;
                                runDigest(bArr3, bArr4, bArr4);
                                length = 0;
                            }
                            bArr[i] = this.state[length];
                            i++;
                            length++;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // java.security.SecureRandomSpi
            public void engineSetSeed(byte[] bArr) {
                synchronized (this.digest) {
                    byte[] bArr2 = this.seed;
                    runDigest(bArr2, bArr, bArr2);
                }
            }
        }

        public NonceEntropySource(JcaJceHelper jcaJceHelper, SecureRandom secureRandom) {
            super(new NonceEntropySourceSpi(secureRandom, jcaJceHelper.createDigest("SHA-512")), secureRandom.getProvider());
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCryptoProvider
    public TlsCrypto create(SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                JcaJceHelper jcaJceHelper = this.helper;
                secureRandom = jcaJceHelper instanceof DefaultJcaJceHelper ? SecureRandom.getInstance("DEFAULT") : SecureRandom.getInstance("DEFAULT", jcaJceHelper.createDigest("SHA-512").getProvider());
            } catch (GeneralSecurityException e10) {
                throw Exceptions.illegalStateException(a.p(e10, new StringBuilder("unable to create TlsCrypto: ")), e10);
            }
        }
        return create(secureRandom, new NonceEntropySource(this.helper, secureRandom));
    }

    public JcaJceHelper getHelper() {
        return this.helper;
    }

    public JcaTlsCryptoProvider setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcaTlsCryptoProvider setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCryptoProvider
    public TlsCrypto create(SecureRandom secureRandom, SecureRandom secureRandom2) {
        return new JcaTlsCrypto(this.helper, secureRandom, secureRandom2);
    }
}
