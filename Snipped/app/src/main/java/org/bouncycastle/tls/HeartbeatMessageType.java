package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class HeartbeatMessageType {
    public static final short heartbeat_request = 1;
    public static final short heartbeat_response = 2;

    public static String getName(short s10) {
        return s10 != 1 ? s10 != 2 ? "UNKNOWN" : "heartbeat_response" : "heartbeat_request";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }

    public static boolean isValid(short s10) {
        return s10 >= 1 && s10 <= 2;
    }
}
