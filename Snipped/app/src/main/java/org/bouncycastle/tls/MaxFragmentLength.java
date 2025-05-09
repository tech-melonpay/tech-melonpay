package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class MaxFragmentLength {
    public static final short pow2_10 = 2;
    public static final short pow2_11 = 3;
    public static final short pow2_12 = 4;
    public static final short pow2_9 = 1;

    public static boolean isValid(short s10) {
        return s10 >= 1 && s10 <= 4;
    }
}
