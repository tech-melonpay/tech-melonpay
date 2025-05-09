package org.bouncycastle.jsse.provider;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.TlsUtils;

/* loaded from: classes.dex */
class CipherSuiteInfo {
    private final int cipherSuite;
    private final Set<String> decompositionTLS;
    private final Set<String> decompositionX509;
    private final String name;

    private CipherSuiteInfo(int i, String str, Set<String> set, Set<String> set2) {
        this.cipherSuite = i;
        this.name = str;
        this.decompositionTLS = set;
        this.decompositionX509 = set2;
    }

    private static void addAll(Set<String> set, String... strArr) {
        for (String str : strArr) {
            set.add(str);
        }
    }

    private static void decomposeEncryptionAlgorithm(Set<String> set, int i) {
        String str;
        set.addAll(JcaAlgorithmDecomposer.INSTANCE_JCA.decompose(getTransformation(i)));
        if (i == 0) {
            str = "C_NULL";
        } else if (i != 21) {
            switch (i) {
                case 7:
                    str = "3DES_EDE_CBC";
                    break;
                case 8:
                    str = "AES_128_CBC";
                    break;
                case 9:
                    str = "AES_256_CBC";
                    break;
                case 10:
                    str = "AES_128_GCM";
                    break;
                case 11:
                    str = "AES_256_GCM";
                    break;
                default:
                    switch (i) {
                        case 15:
                            str = "AES_128_CCM";
                            break;
                        case 16:
                            str = "AES_128_CCM_8";
                            break;
                        case 17:
                            str = "AES_256_CCM";
                            break;
                        case 18:
                            str = "AES_256_CCM_8";
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
        } else {
            return;
        }
        set.add(str);
    }

    private static void decomposeHashAlgorithm(Set<String> set, short s10) {
        if (s10 != 0) {
            if (s10 == 4) {
                addAll(set, "SHA256", "SHA-256", "HmacSHA256");
            } else {
                if (s10 != 5) {
                    throw new IllegalArgumentException();
                }
                addAll(set, "SHA384", McElieceCCA2KeyGenParameterSpec.SHA384, "HmacSHA384");
            }
        }
    }

    private static void decomposeKeyExchangeAlgorithm(Set<String> set, int i) {
        if (i == 1) {
            addAll(set, "RSA");
            return;
        }
        if (i == 3) {
            addAll(set, "DSA", "DSS", "DH", "DHE", "DiffieHellman", "DHE_DSS");
            return;
        }
        if (i == 5) {
            addAll(set, "RSA", "DH", "DHE", "DiffieHellman", "DHE_RSA");
        } else if (i == 17) {
            addAll(set, "ECDHE", "ECDSA", "ECDHE_ECDSA");
        } else {
            if (i != 19) {
                throw new IllegalArgumentException();
            }
            addAll(set, "ECDHE", "RSA", "ECDHE_RSA");
        }
    }

    private static void decomposeMACAlgorithm(Set<String> set, int i, int i9) {
        if (i9 == 0) {
            if (2 != i) {
                addAll(set, "M_NULL");
            }
        } else {
            if (i9 == 1) {
                addAll(set, "MD5", "HmacMD5");
                return;
            }
            if (i9 == 2) {
                addAll(set, "SHA1", McElieceCCA2KeyGenParameterSpec.SHA1, "HmacSHA1");
            } else if (i9 == 3) {
                addAll(set, "SHA256", "SHA-256", "HmacSHA256");
            } else {
                if (i9 != 4) {
                    throw new IllegalArgumentException();
                }
                addAll(set, "SHA384", McElieceCCA2KeyGenParameterSpec.SHA384, "HmacSHA384");
            }
        }
    }

    public static CipherSuiteInfo forCipherSuite(int i, String str) {
        if (!str.startsWith("TLS_")) {
            throw new IllegalArgumentException();
        }
        int encryptionAlgorithm = TlsUtils.getEncryptionAlgorithm(i);
        int encryptionAlgorithmType = TlsUtils.getEncryptionAlgorithmType(encryptionAlgorithm);
        short hashAlgorithm = getHashAlgorithm(i);
        int keyExchangeAlgorithm = TlsUtils.getKeyExchangeAlgorithm(i);
        int mACAlgorithm = TlsUtils.getMACAlgorithm(i);
        HashSet hashSet = new HashSet();
        decomposeKeyExchangeAlgorithm(hashSet, keyExchangeAlgorithm);
        HashSet hashSet2 = new HashSet(hashSet);
        decomposeEncryptionAlgorithm(hashSet2, encryptionAlgorithm);
        decomposeHashAlgorithm(hashSet2, hashAlgorithm);
        decomposeMACAlgorithm(hashSet2, encryptionAlgorithmType, mACAlgorithm);
        return new CipherSuiteInfo(i, str, Collections.unmodifiableSet(hashSet2), Collections.unmodifiableSet(hashSet));
    }

    private static short getHashAlgorithm(int i) {
        switch (i) {
            case 2:
            case 10:
            case 19:
            case 22:
            case 47:
            case 50:
            case 51:
            case 53:
            case 56:
            case 57:
            case 59:
            case 60:
            case 61:
            case 64:
            case 103:
            case 106:
            case 107:
            case 156:
            case 158:
            case 162:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
            case CipherSuite.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
                return (short) 4;
            case 157:
            case 159:
            case 163:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                return (short) 5;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static String getTransformation(int i) {
        if (i == 0) {
            return "NULL";
        }
        if (i == 21) {
            return "ChaCha20-Poly1305";
        }
        switch (i) {
            case 7:
                return "DESede/CBC/NoPadding";
            case 8:
            case 9:
                return "AES/CBC/NoPadding";
            case 10:
            case 11:
                return "AES/GCM/NoPadding";
            default:
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return "AES/CCM/NoPadding";
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public Set<String> getDecompositionTLS() {
        return this.decompositionTLS;
    }

    public Set<String> getDecompositionX509() {
        return this.decompositionX509;
    }

    public String getName() {
        return this.name;
    }
}
