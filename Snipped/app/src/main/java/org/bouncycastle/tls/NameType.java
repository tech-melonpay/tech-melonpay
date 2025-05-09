package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class NameType {
    public static final short host_name = 0;

    public static String getName(short s10) {
        return s10 != 0 ? "UNKNOWN" : "host_name";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }

    public static boolean isRecognized(short s10) {
        return s10 == 0;
    }

    public static boolean isValid(short s10) {
        return TlsUtils.isValidUint8(s10);
    }
}
