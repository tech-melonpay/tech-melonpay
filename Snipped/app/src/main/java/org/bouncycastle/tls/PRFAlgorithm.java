package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class PRFAlgorithm {
    public static final int tls_prf_legacy = 0;
    public static final int tls_prf_sha256 = 1;
    public static final int tls_prf_sha384 = 2;

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "tls_prf_sha384" : "tls_prf_sha256" : "tls_prf_legacy";
    }

    public static String getText(int i) {
        return getName(i) + "(" + i + ")";
    }
}
