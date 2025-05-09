package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class HeartbeatMode {
    public static final short peer_allowed_to_send = 1;
    public static final short peer_not_allowed_to_send = 2;

    public static String getName(short s10) {
        return s10 != 1 ? s10 != 2 ? "UNKNOWN" : "peer_not_allowed_to_send" : "peer_allowed_to_send";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }

    public static boolean isValid(short s10) {
        return s10 >= 1 && s10 <= 2;
    }
}
