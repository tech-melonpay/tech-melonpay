package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class SABERParameters implements CipherParameters {
    private final int defaultKeySize;
    private final SABEREngine engine;

    /* renamed from: l, reason: collision with root package name */
    private final int f25454l;
    private final String name;
    public static final SABERParameters lightsaberkem128r3 = new SABERParameters("lightsaberkem128r3", 2, 128);
    public static final SABERParameters saberkem128r3 = new SABERParameters("saberkem128r3", 3, 128);
    public static final SABERParameters firesaberkem128r3 = new SABERParameters("firesaberkem128r3", 4, 128);
    public static final SABERParameters lightsaberkem192r3 = new SABERParameters("lightsaberkem192r3", 2, 192);
    public static final SABERParameters saberkem192r3 = new SABERParameters("saberkem192r3", 3, 192);
    public static final SABERParameters firesaberkem192r3 = new SABERParameters("firesaberkem192r3", 4, 192);
    public static final SABERParameters lightsaberkem256r3 = new SABERParameters("lightsaberkem256r3", 2, 256);
    public static final SABERParameters saberkem256r3 = new SABERParameters("saberkem256r3", 3, 256);
    public static final SABERParameters firesaberkem256r3 = new SABERParameters("firesaberkem256r3", 4, 256);

    public SABERParameters(String str, int i, int i9) {
        this.name = str;
        this.f25454l = i;
        this.defaultKeySize = i9;
        this.engine = new SABEREngine(i, i9);
    }

    public int getDefaultKeySize() {
        return this.defaultKeySize;
    }

    public SABEREngine getEngine() {
        return this.engine;
    }

    public int getL() {
        return this.f25454l;
    }

    public String getName() {
        return this.name;
    }
}
