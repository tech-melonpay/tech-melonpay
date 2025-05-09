package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* loaded from: classes3.dex */
class ECUtil {
    public static boolean isCurveSupported(String str, JcaJceHelper jcaJceHelper) {
        try {
            AlgorithmParameters createAlgorithmParameters = jcaJceHelper.createAlgorithmParameters("EC");
            createAlgorithmParameters.init(new ECGenParameterSpec(str));
            return createAlgorithmParameters.getParameterSpec(ECParameterSpec.class) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isECPrivateKey(PrivateKey privateKey) {
        return (privateKey instanceof ECPrivateKey) || "EC".equals(privateKey.getAlgorithm());
    }
}
