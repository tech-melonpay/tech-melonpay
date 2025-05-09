package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class CertChainType {
    public static final short individual_certs = 0;
    public static final short pkipath = 1;

    public static String getName(short s10) {
        return s10 != 0 ? s10 != 1 ? "UNKNOWN" : "pkipath" : "individual_certs";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }

    public static boolean isValid(short s10) {
        return s10 >= 0 && s10 <= 1;
    }
}
