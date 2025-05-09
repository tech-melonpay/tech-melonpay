package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

/* loaded from: classes3.dex */
class JcaUtils {
    public static String getJcaAlgorithmName(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        return (HashAlgorithm.getName(signatureAndHashAlgorithm.getHash()) + "WITH" + SignatureAlgorithm.getName(signatureAndHashAlgorithm.getSignature())).toUpperCase();
    }

    public static boolean isSunMSCAPIProvider(Provider provider) {
        return provider != null && isSunMSCAPIProviderName(provider.getName());
    }

    public static boolean isSunMSCAPIProviderActive() {
        return Security.getProvider("SunMSCAPI") != null;
    }

    public static boolean isSunMSCAPIProviderName(String str) {
        return "SunMSCAPI".equals(str);
    }
}
