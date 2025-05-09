package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class SABERParameterSpec implements AlgorithmParameterSpec {
    private final String name;
    public static final SABERParameterSpec lightsaberkem128r3 = new SABERParameterSpec(SABERParameters.lightsaberkem128r3);
    public static final SABERParameterSpec saberkem128r3 = new SABERParameterSpec(SABERParameters.saberkem128r3);
    public static final SABERParameterSpec firesaberkem128r3 = new SABERParameterSpec(SABERParameters.firesaberkem128r3);
    public static final SABERParameterSpec lightsaberkem192r3 = new SABERParameterSpec(SABERParameters.lightsaberkem192r3);
    public static final SABERParameterSpec saberkem192r3 = new SABERParameterSpec(SABERParameters.saberkem192r3);
    public static final SABERParameterSpec firesaberkem192r3 = new SABERParameterSpec(SABERParameters.firesaberkem192r3);
    public static final SABERParameterSpec lightsaberkem256r3 = new SABERParameterSpec(SABERParameters.lightsaberkem256r3);
    public static final SABERParameterSpec saberkem256r3 = new SABERParameterSpec(SABERParameters.saberkem256r3);
    public static final SABERParameterSpec firesaberkem256r3 = new SABERParameterSpec(SABERParameters.firesaberkem256r3);
    private static Map parameters = new HashMap();

    private SABERParameterSpec(SABERParameters sABERParameters) {
        this.name = sABERParameters.getName();
    }

    public static SABERParameterSpec fromName(String str) {
        return (SABERParameterSpec) parameters.get(Strings.toLowerCase(str));
    }

    public String getName() {
        return this.name;
    }
}
