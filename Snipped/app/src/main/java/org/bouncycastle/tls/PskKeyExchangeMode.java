package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class PskKeyExchangeMode {
    public static final short psk_dhe_ke = 1;
    public static final short psk_ke = 0;

    public static String getName(short s10) {
        return s10 != 0 ? s10 != 1 ? "UNKNOWN" : "psk_dhe_ke" : "psk_ke";
    }

    public static String getText(short s10) {
        return getName(s10) + "(" + ((int) s10) + ")";
    }
}
