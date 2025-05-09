package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class CachedInformationType {
    public static final short cert = 1;
    public static final short cert_req = 2;

    public static String getName(short s10) {
        return s10 != 1 ? s10 != 2 ? "UNKNOWN" : "cert_req" : "cert";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }
}
