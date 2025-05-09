package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class IdentifierType {
    public static final short cert_sha1_hash = 3;
    public static final short key_sha1_hash = 1;
    public static final short pre_agreed = 0;
    public static final short x509_name = 2;

    public static String getName(short s10) {
        return s10 != 0 ? s10 != 1 ? s10 != 2 ? s10 != 3 ? "UNKNOWN" : "cert_sha1_hash" : "x509_name" : "key_sha1_hash" : "pre_agreed";
    }
}
