package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class AlertLevel {
    public static final short fatal = 2;
    public static final short warning = 1;

    public static String getName(short s10) {
        return s10 != 1 ? s10 != 2 ? "UNKNOWN" : "fatal" : "warning";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }
}
