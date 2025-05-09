package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.HashAlgorithm;

/* loaded from: classes3.dex */
class RSAUtil {
    public static String getDigestSigAlgName(String str) {
        int indexOf = str.indexOf(45);
        if (indexOf <= 0 || str.startsWith("SHA3")) {
            return str;
        }
        return str.substring(0, indexOf) + str.substring(indexOf + 1);
    }

    private static AlgorithmIdentifier getHashAlgorithmID(short s10) {
        if (s10 == 4) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, DERNull.INSTANCE);
        }
        if (s10 == 5) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, DERNull.INSTANCE);
        }
        if (s10 != 6) {
            return null;
        }
        return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, DERNull.INSTANCE);
    }

    public static AlgorithmParameterSpec getPSSParameterSpec(short s10, String str, JcaJceHelper jcaJceHelper) {
        return new PSSParameterSpec(str, "MGF1", new MGF1ParameterSpec(str), HashAlgorithm.getOutputSize(s10), 1);
    }
}
