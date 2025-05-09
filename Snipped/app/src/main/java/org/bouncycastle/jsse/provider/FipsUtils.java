package org.bouncycastle.jsse.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.tls.NamedGroup;

/* loaded from: classes.dex */
abstract class FipsUtils {
    private static final boolean canSupportGCM = false;
    private static final boolean provAllowRSAKeyExchange = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.fips.allowRSAKeyExchange", true);
    private static final Set<String> FIPS_SUPPORTED_CIPHERSUITES = createFipsSupportedCipherSuites();
    private static final Set<String> FIPS_SUPPORTED_PROTOCOLS = createFipsSupportedProtocols();

    private static Set<String> createFipsSupportedCipherSuites() {
        HashSet hashSet = new HashSet();
        hashSet.add("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        hashSet.add("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        hashSet.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        hashSet.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        hashSet.add("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        hashSet.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        hashSet.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        hashSet.add("TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA");
        hashSet.add("TLS_DH_DSS_WITH_AES_128_CBC_SHA");
        hashSet.add("TLS_DH_DSS_WITH_AES_256_CBC_SHA");
        hashSet.add("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        hashSet.add("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        hashSet.add("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        hashSet.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        hashSet.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        hashSet.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        hashSet.add("TLS_DH_DSS_WITH_AES_128_CBC_SHA256");
        hashSet.add("TLS_DH_DSS_WITH_AES_256_CBC_SHA256");
        hashSet.add("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        hashSet.add("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        if (provAllowRSAKeyExchange) {
            hashSet.add("TLS_RSA_WITH_3DES_EDE_CBC_SHA");
            hashSet.add("TLS_RSA_WITH_AES_128_CBC_SHA");
            hashSet.add("TLS_RSA_WITH_AES_256_CBC_SHA");
            hashSet.add("TLS_RSA_WITH_AES_128_CBC_SHA256");
            hashSet.add("TLS_RSA_WITH_AES_256_CBC_SHA256");
            hashSet.add("TLS_RSA_WITH_AES_128_CCM");
            hashSet.add("TLS_RSA_WITH_AES_256_CCM");
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static Set<String> createFipsSupportedProtocols() {
        HashSet hashSet = new HashSet();
        hashSet.add("TLSv1");
        hashSet.add("TLSv1.1");
        hashSet.add("TLSv1.2");
        return Collections.unmodifiableSet(hashSet);
    }

    public static int getFipsDefaultDH(int i) {
        if (i <= 2048) {
            return 256;
        }
        if (i <= 3072) {
            return NamedGroup.ffdhe3072;
        }
        if (i <= 4096) {
            return NamedGroup.ffdhe4096;
        }
        if (i <= 6144) {
            return NamedGroup.ffdhe6144;
        }
        if (i <= 8192) {
            return NamedGroup.ffdhe8192;
        }
        return -1;
    }

    public static int getFipsDefaultECDH(int i) {
        if (i <= 256) {
            return 23;
        }
        return i <= 384 ? 24 : -1;
    }

    public static int getFipsMaximumCurveBits() {
        return 384;
    }

    public static int getFipsMaximumFiniteFieldBits() {
        return 8192;
    }

    public static boolean isFipsCipherSuite(String str) {
        return str != null && FIPS_SUPPORTED_CIPHERSUITES.contains(str);
    }

    public static boolean isFipsNamedGroup(int i) {
        if (i == 23 || i == 24) {
            return true;
        }
        switch (i) {
            case 256:
            case NamedGroup.ffdhe3072 /* 257 */:
            case NamedGroup.ffdhe4096 /* 258 */:
            case NamedGroup.ffdhe6144 /* 259 */:
            case NamedGroup.ffdhe8192 /* 260 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean isFipsProtocol(String str) {
        return str != null && FIPS_SUPPORTED_PROTOCOLS.contains(str);
    }

    public static void removeNonFipsCipherSuites(Collection<String> collection) {
        collection.retainAll(FIPS_SUPPORTED_CIPHERSUITES);
    }

    public static void removeNonFipsProtocols(Collection<String> collection) {
        collection.retainAll(FIPS_SUPPORTED_PROTOCOLS);
    }
}
