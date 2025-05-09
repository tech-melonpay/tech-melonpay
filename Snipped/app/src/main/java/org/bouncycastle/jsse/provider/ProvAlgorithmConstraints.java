package org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;

/* loaded from: classes.dex */
class ProvAlgorithmConstraints extends AbstractAlgorithmConstraints {
    private final BCAlgorithmConstraints configAlgorithmConstraints;
    private final boolean enableX509Constraints;
    private final Set<String> supportedSignatureAlgorithms;
    private static final String PROPERTY_TLS_DISABLED_ALGORITHMS = "jdk.tls.disabledAlgorithms";
    private static final String DEFAULT_TLS_DISABLED_ALGORITHMS = "SSLv3, RC4, DES, MD5withRSA, DH keySize < 1024, EC keySize < 224, 3DES_EDE_CBC, anon, NULL";
    private static final DisabledAlgorithmConstraints provTlsDisabledAlgorithms = DisabledAlgorithmConstraints.create(ProvAlgorithmDecomposer.INSTANCE_TLS, PROPERTY_TLS_DISABLED_ALGORITHMS, DEFAULT_TLS_DISABLED_ALGORITHMS);
    private static final String PROPERTY_CERTPATH_DISABLED_ALGORITHMS = "jdk.certpath.disabledAlgorithms";
    private static final String DEFAULT_CERTPATH_DISABLED_ALGORITHMS = "MD2, MD5, SHA1 jdkCA & usage TLSServer, RSA keySize < 1024, DSA keySize < 1024, EC keySize < 224";
    private static final DisabledAlgorithmConstraints provX509DisabledAlgorithms = DisabledAlgorithmConstraints.create(ProvAlgorithmDecomposer.INSTANCE_X509, PROPERTY_CERTPATH_DISABLED_ALGORITHMS, DEFAULT_CERTPATH_DISABLED_ALGORITHMS);
    static final ProvAlgorithmConstraints DEFAULT = new ProvAlgorithmConstraints(null, true);
    static final ProvAlgorithmConstraints DEFAULT_TLS_ONLY = new ProvAlgorithmConstraints(null, false);

    public ProvAlgorithmConstraints(BCAlgorithmConstraints bCAlgorithmConstraints, boolean z10) {
        super(null);
        this.configAlgorithmConstraints = bCAlgorithmConstraints;
        this.supportedSignatureAlgorithms = null;
        this.enableX509Constraints = z10;
    }

    private boolean isSupportedSignatureAlgorithm(String str) {
        return !this.supportedSignatureAlgorithms.isEmpty() && containsIgnoreCase(this.supportedSignatureAlgorithms, removeAnyMGFSpecifier(str));
    }

    private static String removeAnyMGFSpecifier(String str) {
        int indexOf = str.indexOf("and");
        return indexOf < 1 ? str : str.substring(0, indexOf);
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public boolean permits(Set<BCCryptoPrimitive> set, String str, AlgorithmParameters algorithmParameters) {
        DisabledAlgorithmConstraints disabledAlgorithmConstraints;
        checkPrimitives(set);
        checkAlgorithmName(str);
        if (this.supportedSignatureAlgorithms != null && !isSupportedSignatureAlgorithm(str)) {
            return false;
        }
        BCAlgorithmConstraints bCAlgorithmConstraints = this.configAlgorithmConstraints;
        if (bCAlgorithmConstraints != null && !bCAlgorithmConstraints.permits(set, str, algorithmParameters)) {
            return false;
        }
        DisabledAlgorithmConstraints disabledAlgorithmConstraints2 = provTlsDisabledAlgorithms;
        if (disabledAlgorithmConstraints2 == null || disabledAlgorithmConstraints2.permits(set, str, algorithmParameters)) {
            return !this.enableX509Constraints || (disabledAlgorithmConstraints = provX509DisabledAlgorithms) == null || disabledAlgorithmConstraints.permits(set, str, algorithmParameters);
        }
        return false;
    }

    public ProvAlgorithmConstraints(BCAlgorithmConstraints bCAlgorithmConstraints, String[] strArr, boolean z10) {
        super(null);
        this.configAlgorithmConstraints = bCAlgorithmConstraints;
        this.supportedSignatureAlgorithms = AbstractAlgorithmConstraints.asUnmodifiableSet(strArr);
        this.enableX509Constraints = z10;
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public boolean permits(Set<BCCryptoPrimitive> set, String str, Key key, AlgorithmParameters algorithmParameters) {
        DisabledAlgorithmConstraints disabledAlgorithmConstraints;
        checkPrimitives(set);
        checkAlgorithmName(str);
        checkKey(key);
        if (this.supportedSignatureAlgorithms != null && !isSupportedSignatureAlgorithm(str)) {
            return false;
        }
        BCAlgorithmConstraints bCAlgorithmConstraints = this.configAlgorithmConstraints;
        if (bCAlgorithmConstraints != null && !bCAlgorithmConstraints.permits(set, str, key, algorithmParameters)) {
            return false;
        }
        DisabledAlgorithmConstraints disabledAlgorithmConstraints2 = provTlsDisabledAlgorithms;
        if (disabledAlgorithmConstraints2 == null || disabledAlgorithmConstraints2.permits(set, str, key, algorithmParameters)) {
            return !this.enableX509Constraints || (disabledAlgorithmConstraints = provX509DisabledAlgorithms) == null || disabledAlgorithmConstraints.permits(set, str, key, algorithmParameters);
        }
        return false;
    }

    @Override // org.bouncycastle.jsse.java.security.BCAlgorithmConstraints
    public boolean permits(Set<BCCryptoPrimitive> set, Key key) {
        DisabledAlgorithmConstraints disabledAlgorithmConstraints;
        checkPrimitives(set);
        checkKey(key);
        BCAlgorithmConstraints bCAlgorithmConstraints = this.configAlgorithmConstraints;
        if (bCAlgorithmConstraints != null && !bCAlgorithmConstraints.permits(set, key)) {
            return false;
        }
        DisabledAlgorithmConstraints disabledAlgorithmConstraints2 = provTlsDisabledAlgorithms;
        if (disabledAlgorithmConstraints2 == null || disabledAlgorithmConstraints2.permits(set, key)) {
            return !this.enableX509Constraints || (disabledAlgorithmConstraints = provX509DisabledAlgorithms) == null || disabledAlgorithmConstraints.permits(set, key);
        }
        return false;
    }
}
