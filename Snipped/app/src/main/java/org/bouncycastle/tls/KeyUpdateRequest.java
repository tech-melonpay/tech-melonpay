package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class KeyUpdateRequest {
    public static final short update_not_requested = 0;
    public static final short update_requested = 1;

    public static String getName(short s10) {
        return s10 != 0 ? s10 != 1 ? "UNKNOWN" : "update_requested" : "update_not_requested";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }

    public static boolean isValid(short s10) {
        return s10 >= 0 && s10 <= 1;
    }
}
