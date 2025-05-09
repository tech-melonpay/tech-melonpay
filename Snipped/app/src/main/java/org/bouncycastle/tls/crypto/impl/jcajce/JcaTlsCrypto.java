package org.bouncycastle.tls.crypto.impl.jcajce;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.MACAlgorithm;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;
import org.bouncycastle.tls.crypto.TlsSRP6Client;
import org.bouncycastle.tls.crypto.TlsSRP6Server;
import org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipher;
import org.bouncycastle.tls.crypto.impl.TlsAEADCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipher;
import org.bouncycastle.tls.crypto.impl.TlsBlockCipherImpl;
import org.bouncycastle.tls.crypto.impl.TlsEncryptor;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;
import org.bouncycastle.tls.crypto.impl.TlsNullCipher;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6Client;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6Server;
import org.bouncycastle.tls.crypto.impl.jcajce.srp.SRP6VerifierGenerator;
import org.bouncycastle.util.Arrays;
import s3.b;

/* loaded from: classes3.dex */
public class JcaTlsCrypto extends AbstractTlsCrypto {
    private final SecureRandom entropySource;
    private final JcaJceHelper helper;
    private final SecureRandom nonceEntropySource;
    private final Hashtable supportedEncryptionAlgorithms = new Hashtable();
    private final Hashtable supportedNamedGroups = new Hashtable();
    private final Hashtable supportedOther = new Hashtable();

    public JcaTlsCrypto(JcaJceHelper jcaJceHelper, SecureRandom secureRandom, SecureRandom secureRandom2) {
        this.helper = jcaJceHelper;
        this.entropySource = secureRandom;
        this.nonceEntropySource = secureRandom2;
    }

    private TlsBlockCipher createAESCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsBlockCipher(this, tlsCryptoParameters, createCBCBlockOperator(tlsCryptoParameters, "AES", true, i), createCBCBlockOperator(tlsCryptoParameters, "AES", false, i), createMAC(i9), createMAC(i9), i);
    }

    private TlsBlockCipher createARIACipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsBlockCipher(this, tlsCryptoParameters, createCBCBlockOperator(tlsCryptoParameters, "ARIA", true, i), createCBCBlockOperator(tlsCryptoParameters, "ARIA", false, i), createMAC(i9), createMAC(i9), i);
    }

    private TlsBlockCipherImpl createCBCBlockOperator(TlsCryptoParameters tlsCryptoParameters, String str, boolean z10, int i) {
        String n10 = v.n(str, "/CBC/NoPadding");
        return TlsImplUtils.isTLSv11(tlsCryptoParameters) ? createBlockCipher(n10, str, i, z10) : createBlockCipherWithCBCImplicitIV(n10, str, i, z10);
    }

    private TlsBlockCipher createCamelliaCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsBlockCipher(this, tlsCryptoParameters, createCBCBlockOperator(tlsCryptoParameters, "Camellia", true, i), createCBCBlockOperator(tlsCryptoParameters, "Camellia", false, i), createMAC(i9), createMAC(i9), i);
    }

    private TlsCipher createChaCha20Poly1305(TlsCryptoParameters tlsCryptoParameters) {
        return new TlsAEADCipher(tlsCryptoParameters, new JceChaCha20Poly1305(this.helper, true), new JceChaCha20Poly1305(this.helper, false), 32, 16, 2);
    }

    private TlsAEADCipher createCipher_AES_CCM(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsAEADCipher(tlsCryptoParameters, createAEADCipher("AES/CCM/NoPadding", "AES", i, true), createAEADCipher("AES/CCM/NoPadding", "AES", i, false), i, i9);
    }

    private TlsAEADCipher createCipher_AES_GCM(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsAEADCipher(tlsCryptoParameters, createAEADCipher("AES/GCM/NoPadding", "AES", i, true), createAEADCipher("AES/GCM/NoPadding", "AES", i, false), i, i9);
    }

    private TlsAEADCipher createCipher_AES_OCB(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsAEADCipher(tlsCryptoParameters, createAEADCipher("AES/OCB/NoPadding", "AES", i, true), createAEADCipher("AES/OCB/NoPadding", "AES", i, false), i, i9, 2);
    }

    private TlsAEADCipher createCipher_ARIA_GCM(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsAEADCipher(tlsCryptoParameters, createAEADCipher("ARIA/GCM/NoPadding", "ARIA", i, true), createAEADCipher("ARIA/GCM/NoPadding", "ARIA", i, false), i, i9);
    }

    private TlsAEADCipher createCipher_Camellia_GCM(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        return new TlsAEADCipher(tlsCryptoParameters, createAEADCipher("Camellia/GCM/NoPadding", "Camellia", i, true), createAEADCipher("Camellia/GCM/NoPadding", "Camellia", i, false), i, i9);
    }

    private TlsBlockCipher createDESedeCipher(TlsCryptoParameters tlsCryptoParameters, int i) {
        return new TlsBlockCipher(this, tlsCryptoParameters, createCBCBlockOperator(tlsCryptoParameters, "DESede", true, 24), createCBCBlockOperator(tlsCryptoParameters, "DESede", false, 24), createMAC(i), createMAC(i), 24);
    }

    private TlsHMAC createMAC(int i) {
        return createHMAC(i);
    }

    private TlsBlockCipher createSEEDCipher(TlsCryptoParameters tlsCryptoParameters, int i) {
        return new TlsBlockCipher(this, tlsCryptoParameters, createCBCBlockOperator(tlsCryptoParameters, "SEED", true, 16), createCBCBlockOperator(tlsCryptoParameters, "SEED", false, 16), createMAC(i), createMAC(i), 16);
    }

    public JceTlsSecret adoptLocalSecret(byte[] bArr) {
        return new JceTlsSecret(this, bArr);
    }

    public byte[] calculateKeyAgreement(String str, PrivateKey privateKey, PublicKey publicKey, String str2) {
        KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(str);
        createKeyAgreement.init(privateKey);
        createKeyAgreement.doPhase(publicKey, true);
        try {
            return createKeyAgreement.generateSecret(str2).getEncoded();
        } catch (NoSuchAlgorithmException e10) {
            if (XDHParameterSpec.X25519.equals(str) || XDHParameterSpec.X448.equals(str)) {
                return createKeyAgreement.generateSecret();
            }
            throw e10;
        }
    }

    public TlsAEADCipherImpl createAEADCipher(String str, String str2, int i, boolean z10) {
        return new JceAEADCipherImpl(this.helper, str, str2, i, z10);
    }

    public TlsBlockCipherImpl createBlockCipher(String str, String str2, int i, boolean z10) {
        return new JceBlockCipherImpl(this.helper.createCipher(str), str2, i, z10);
    }

    public TlsBlockCipherImpl createBlockCipherWithCBCImplicitIV(String str, String str2, int i, boolean z10) {
        return new JceBlockCipherWithCBCImplicitIVImpl(this.helper.createCipher(str), str2, z10);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsCertificate createCertificate(byte[] bArr) {
        return new JcaTlsCertificate(this, bArr);
    }

    @Override // org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto
    public TlsCipher createCipher(TlsCryptoParameters tlsCryptoParameters, int i, int i9) {
        try {
            if (i == 0) {
                return createNullCipher(tlsCryptoParameters, i9);
            }
            if (i == 103) {
                return createCipher_AES_OCB(tlsCryptoParameters, 16, 12);
            }
            if (i == 104) {
                return createCipher_AES_OCB(tlsCryptoParameters, 32, 12);
            }
            switch (i) {
                case 7:
                    return createDESedeCipher(tlsCryptoParameters, i9);
                case 8:
                    return createAESCipher(tlsCryptoParameters, 16, i9);
                case 9:
                    return createAESCipher(tlsCryptoParameters, 32, i9);
                case 10:
                    return createCipher_AES_GCM(tlsCryptoParameters, 16, 16);
                case 11:
                    return createCipher_AES_GCM(tlsCryptoParameters, 32, 16);
                case 12:
                    return createCamelliaCipher(tlsCryptoParameters, 16, i9);
                case 13:
                    return createCamelliaCipher(tlsCryptoParameters, 32, i9);
                case 14:
                    return createSEEDCipher(tlsCryptoParameters, i9);
                case 15:
                    return createCipher_AES_CCM(tlsCryptoParameters, 16, 16);
                case 16:
                    return createCipher_AES_CCM(tlsCryptoParameters, 16, 8);
                case 17:
                    return createCipher_AES_CCM(tlsCryptoParameters, 32, 16);
                case 18:
                    return createCipher_AES_CCM(tlsCryptoParameters, 32, 8);
                case 19:
                    return createCipher_Camellia_GCM(tlsCryptoParameters, 16, 16);
                case 20:
                    return createCipher_Camellia_GCM(tlsCryptoParameters, 32, 16);
                case 21:
                    return createChaCha20Poly1305(tlsCryptoParameters);
                case 22:
                    return createARIACipher(tlsCryptoParameters, 16, i9);
                case 23:
                    return createARIACipher(tlsCryptoParameters, 32, i9);
                case 24:
                    return createCipher_ARIA_GCM(tlsCryptoParameters, 16, 16);
                case 25:
                    return createCipher_ARIA_GCM(tlsCryptoParameters, 32, 16);
                default:
                    throw new TlsFatalAlert((short) 80);
            }
        } catch (GeneralSecurityException e10) {
            throw new TlsCryptoException(a.p(e10, new StringBuilder("cannot create cipher: ")), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsDHDomain createDHDomain(TlsDHConfig tlsDHConfig) {
        return new JceTlsDHDomain(this, tlsDHConfig);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsECDomain createECDomain(TlsECConfig tlsECConfig) {
        int namedGroup = tlsECConfig.getNamedGroup();
        return namedGroup != 29 ? namedGroup != 30 ? new JceTlsECDomain(this, tlsECConfig) : new JceX448Domain(this) : new JceX25519Domain(this);
    }

    @Override // org.bouncycastle.tls.crypto.impl.AbstractTlsCrypto
    public TlsEncryptor createEncryptor(TlsCertificate tlsCertificate) {
        JcaTlsCertificate convert = JcaTlsCertificate.convert(this, tlsCertificate);
        convert.validateKeyUsage(32);
        final RSAPublicKey pubKeyRSA = convert.getPubKeyRSA();
        return new TlsEncryptor() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.4
            @Override // org.bouncycastle.tls.crypto.impl.TlsEncryptor
            public byte[] encrypt(byte[] bArr, int i, int i9) {
                try {
                    Cipher createRSAEncryptionCipher = JcaTlsCrypto.this.createRSAEncryptionCipher();
                    try {
                        createRSAEncryptionCipher.init(3, pubKeyRSA, JcaTlsCrypto.this.getSecureRandom());
                        return createRSAEncryptionCipher.wrap(new SecretKeySpec(bArr, i, i9, "TLS"));
                    } catch (Exception e10) {
                        try {
                            createRSAEncryptionCipher.init(1, pubKeyRSA, JcaTlsCrypto.this.getSecureRandom());
                            return createRSAEncryptionCipher.doFinal(bArr, i, i9);
                        } catch (Exception unused) {
                            throw new TlsFatalAlert((short) 80, e10);
                        }
                    }
                } catch (GeneralSecurityException e11) {
                    throw new TlsFatalAlert((short) 80, e11);
                }
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsHMAC createHMAC(int i) {
        String str;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            str = "HmacMD5";
        } else if (i == 2) {
            str = "HmacSHA1";
        } else if (i == 3) {
            str = "HmacSHA256";
        } else if (i == 4) {
            str = "HmacSHA384";
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("unknown MACAlgorithm: " + MACAlgorithm.getText(i));
            }
            str = "HmacSHA512";
        }
        return createHMAC(str);
    }

    public TlsHash createHash(String str) {
        return new JcaTlsHash(this.helper.createDigest(str));
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsNonceGenerator createNonceGenerator(byte[] bArr) {
        return new JcaNonceGenerator(this.nonceEntropySource, bArr);
    }

    public TlsNullCipher createNullCipher(TlsCryptoParameters tlsCryptoParameters, int i) {
        return new TlsNullCipher(tlsCryptoParameters, createMAC(i), createMAC(i));
    }

    public Cipher createRSAEncryptionCipher() {
        try {
            return getHelper().createCipher("RSA/NONE/PKCS1Padding");
        } catch (GeneralSecurityException unused) {
            return getHelper().createCipher("RSA/ECB/PKCS1Padding");
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSRP6Client createSRP6Client(TlsSRPConfig tlsSRPConfig) {
        final SRP6Client sRP6Client = new SRP6Client();
        BigInteger[] explicitNG = tlsSRPConfig.getExplicitNG();
        sRP6Client.init(new SRP6Group(explicitNG[0], explicitNG[1]), createHash((short) 2), getSecureRandom());
        return new TlsSRP6Client() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.1
            @Override // org.bouncycastle.tls.crypto.TlsSRP6Client
            public BigInteger calculateSecret(BigInteger bigInteger) {
                try {
                    return sRP6Client.calculateSecret(bigInteger);
                } catch (IllegalArgumentException e10) {
                    throw new TlsFatalAlert((short) 47, e10);
                }
            }

            @Override // org.bouncycastle.tls.crypto.TlsSRP6Client
            public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                return sRP6Client.generateClientCredentials(bArr, bArr2, bArr3);
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSRP6Server createSRP6Server(TlsSRPConfig tlsSRPConfig, BigInteger bigInteger) {
        final SRP6Server sRP6Server = new SRP6Server();
        BigInteger[] explicitNG = tlsSRPConfig.getExplicitNG();
        sRP6Server.init(new SRP6Group(explicitNG[0], explicitNG[1]), bigInteger, createHash((short) 2), getSecureRandom());
        return new TlsSRP6Server() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.2
            @Override // org.bouncycastle.tls.crypto.TlsSRP6Server
            public BigInteger calculateSecret(BigInteger bigInteger2) {
                try {
                    return sRP6Server.calculateSecret(bigInteger2);
                } catch (IllegalArgumentException e10) {
                    throw new TlsFatalAlert((short) 47, e10);
                }
            }

            @Override // org.bouncycastle.tls.crypto.TlsSRP6Server
            public BigInteger generateServerCredentials() {
                return sRP6Server.generateServerCredentials();
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSRP6VerifierGenerator createSRP6VerifierGenerator(TlsSRPConfig tlsSRPConfig) {
        BigInteger[] explicitNG = tlsSRPConfig.getExplicitNG();
        final SRP6VerifierGenerator sRP6VerifierGenerator = new SRP6VerifierGenerator();
        sRP6VerifierGenerator.init(explicitNG[0], explicitNG[1], createHash((short) 2));
        return new TlsSRP6VerifierGenerator() { // from class: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.3
            @Override // org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator
            public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
                return sRP6VerifierGenerator.generateVerifier(bArr, bArr2, bArr3);
            }
        };
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSecret createSecret(byte[] bArr) {
        return adoptLocalSecret(Arrays.clone(bArr));
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSecret generateRSAPreMasterSecret(ProtocolVersion protocolVersion) {
        byte[] bArr = new byte[48];
        getSecureRandom().nextBytes(bArr);
        TlsUtils.writeVersion(protocolVersion, bArr, 0);
        return adoptLocalSecret(bArr);
    }

    public String getDigestName(short s10) {
        switch (s10) {
            case 1:
                return "MD5";
            case 2:
                return McElieceCCA2KeyGenParameterSpec.SHA1;
            case 3:
                return McElieceCCA2KeyGenParameterSpec.SHA224;
            case 4:
                return "SHA-256";
            case 5:
                return McElieceCCA2KeyGenParameterSpec.SHA384;
            case 6:
                return "SHA-512";
            default:
                throw new IllegalArgumentException("invalid HashAlgorithm: " + HashAlgorithm.getText(s10));
        }
    }

    public JcaJceHelper getHelper() {
        return this.helper;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public SecureRandom getSecureRandom() {
        return this.entropySource;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasAllRawSignatureAlgorithms() {
        return (JcaUtils.isSunMSCAPIProviderActive() || hasSignatureAlgorithm((short) 7) || hasSignatureAlgorithm((short) 8)) ? false : true;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasDHAgreement() {
        return true;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasECDHAgreement() {
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasEncryptionAlgorithm(int r5) {
        /*
            r4 = this;
            java.lang.Integer r0 = org.bouncycastle.util.Integers.valueOf(r5)
            java.util.Hashtable r1 = r4.supportedEncryptionAlgorithms
            monitor-enter(r1)
            java.util.Hashtable r2 = r4.supportedEncryptionAlgorithms     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L1a
            boolean r5 = r2.booleanValue()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r5
        L17:
            r5 = move-exception
            goto L80
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L6e
            r1 = 103(0x67, float:1.44E-43)
            r2 = 0
            if (r5 == r1) goto L69
            r1 = 104(0x68, float:1.46E-43)
            if (r5 == r1) goto L69
            switch(r5) {
                case 7: goto L64;
                case 8: goto L5f;
                case 9: goto L5f;
                case 10: goto L5a;
                case 11: goto L5a;
                case 12: goto L55;
                case 13: goto L55;
                case 14: goto L50;
                case 15: goto L4b;
                case 16: goto L4b;
                case 17: goto L4b;
                case 18: goto L4b;
                case 19: goto L46;
                case 20: goto L46;
                case 21: goto L37;
                case 22: goto L32;
                case 23: goto L32;
                case 24: goto L2a;
                case 25: goto L2a;
                default: goto L29;
            }
        L29:
            goto L6f
        L2a:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "ARIA/GCM/NoPadding"
        L2e:
            r5.createCipher(r1)     // Catch: java.security.GeneralSecurityException -> L6f
            goto L6e
        L32:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "ARIA/CBC/NoPadding"
            goto L2e
        L37:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "ChaCha7539"
            r5.createCipher(r1)     // Catch: java.security.GeneralSecurityException -> L6f
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "Poly1305"
            r5.createMac(r1)     // Catch: java.security.GeneralSecurityException -> L6f
            goto L6e
        L46:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "Camellia/GCM/NoPadding"
            goto L2e
        L4b:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "AES/CCM/NoPadding"
            goto L2e
        L50:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "SEED/CBC/NoPadding"
            goto L2e
        L55:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "Camellia/CBC/NoPadding"
            goto L2e
        L5a:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "AES/GCM/NoPadding"
            goto L2e
        L5f:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "AES/CBC/NoPadding"
            goto L2e
        L64:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "DESede/CBC/NoPadding"
            goto L2e
        L69:
            org.bouncycastle.jcajce.util.JcaJceHelper r5 = r4.helper     // Catch: java.security.GeneralSecurityException -> L6f
            java.lang.String r1 = "AES/OCB/NoPadding"
            goto L2e
        L6e:
            r2 = 1
        L6f:
            java.util.Hashtable r5 = r4.supportedEncryptionAlgorithms
            monitor-enter(r5)
            java.util.Hashtable r1 = r4.supportedEncryptionAlgorithms     // Catch: java.lang.Throwable -> L7d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L7d
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            return r2
        L7d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.hasEncryptionAlgorithm(int):boolean");
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasHashAlgorithm(short s10) {
        return true;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasMacAlgorithm(int i) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasNamedGroup(int r7) {
        /*
            r6 = this;
            boolean r0 = org.bouncycastle.tls.NamedGroup.refersToASpecificFiniteField(r7)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = org.bouncycastle.tls.NamedGroup.refersToASpecificCurve(r7)
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            java.lang.String r0 = org.bouncycastle.tls.NamedGroup.getName(r7)
            if (r0 != 0) goto L17
            return r2
        L17:
            java.lang.Integer r3 = org.bouncycastle.util.Integers.valueOf(r7)
            java.util.Hashtable r4 = r6.supportedNamedGroups
            monitor-enter(r4)
            java.util.Hashtable r5 = r6.supportedNamedGroups     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L30
            boolean r7 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            return r7
        L2e:
            r7 = move-exception
            goto L7a
        L30:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            r4 = 29
            if (r7 == r4) goto L55
            r4 = 30
            if (r7 == r4) goto L3f
            boolean r7 = r6.isCurveSupported(r0)     // Catch: java.security.GeneralSecurityException -> L69
            r1 = r1 & r7
            goto L68
        L3f:
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X448"
            r7.createKeyAgreement(r0)     // Catch: java.security.GeneralSecurityException -> L69
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X448"
            r7.createKeyFactory(r0)     // Catch: java.security.GeneralSecurityException -> L69
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X448"
        L51:
            r7.createKeyPairGenerator(r0)     // Catch: java.security.GeneralSecurityException -> L69
            goto L68
        L55:
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X25519"
            r7.createKeyAgreement(r0)     // Catch: java.security.GeneralSecurityException -> L69
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X25519"
            r7.createKeyFactory(r0)     // Catch: java.security.GeneralSecurityException -> L69
            org.bouncycastle.jcajce.util.JcaJceHelper r7 = r6.helper     // Catch: java.security.GeneralSecurityException -> L69
            java.lang.String r0 = "X25519"
            goto L51
        L68:
            r2 = r1
        L69:
            java.util.Hashtable r7 = r6.supportedNamedGroups
            monitor-enter(r7)
            java.util.Hashtable r0 = r6.supportedNamedGroups     // Catch: java.lang.Throwable -> L77
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L77
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            return r2
        L77:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L77
            throw r0
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto.hasNamedGroup(int):boolean");
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasRSAEncryption() {
        boolean z10;
        synchronized (this.supportedOther) {
            try {
                Boolean bool = (Boolean) this.supportedOther.get("KE_RSA");
                if (bool != null) {
                    return bool.booleanValue();
                }
                try {
                    createRSAEncryptionCipher();
                    z10 = true;
                } catch (GeneralSecurityException unused) {
                    z10 = false;
                }
                synchronized (this.supportedOther) {
                    this.supportedOther.put("KE_RSA", Boolean.valueOf(z10));
                }
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasSRPAuthentication() {
        return true;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasSignatureAlgorithm(short s10) {
        switch (s10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public boolean hasSignatureAndHashAlgorithm(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm.getHash() == 3 && JcaUtils.isSunMSCAPIProviderActive()) {
            return false;
        }
        return hasSignatureAlgorithm(signatureAndHashAlgorithm.getSignature());
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsSecret hkdfInit(short s10) {
        return adoptLocalSecret(new byte[HashAlgorithm.getOutputSize(s10)]);
    }

    public boolean isCurveSupported(String str) {
        return ECUtil.isCurveSupported(str, getHelper());
    }

    public TlsHMAC createHMAC(String str) {
        try {
            return new JceTlsHMAC(this.helper.createMac(str), str);
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(b.j("cannot create HMAC: ", str), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsHash createHash(short s10) {
        try {
            return createHash(getDigestName(s10));
        } catch (GeneralSecurityException e10) {
            throw Exceptions.illegalArgumentException(a.p(e10, new StringBuilder("unable to create message digest:")), e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCrypto
    public TlsHMAC createHMAC(short s10) {
        return createHMAC("Hmac" + getDigestName(s10).replaceAll("-", ""));
    }
}
