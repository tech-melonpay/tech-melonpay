package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public class SignatureScheme {
    public static final int ecdsa_secp256r1_sha256 = 1027;
    public static final int ecdsa_secp384r1_sha384 = 1283;
    public static final int ecdsa_secp521r1_sha512 = 1539;
    public static final int ecdsa_sha1 = 515;
    public static final int ed25519 = 2055;
    public static final int ed448 = 2056;
    public static final int rsa_pkcs1_sha1 = 513;
    public static final int rsa_pkcs1_sha256 = 1025;
    public static final int rsa_pkcs1_sha384 = 1281;
    public static final int rsa_pkcs1_sha512 = 1537;
    public static final int rsa_pss_pss_sha256 = 2057;
    public static final int rsa_pss_pss_sha384 = 2058;
    public static final int rsa_pss_pss_sha512 = 2059;
    public static final int rsa_pss_rsae_sha256 = 2052;
    public static final int rsa_pss_rsae_sha384 = 2053;
    public static final int rsa_pss_rsae_sha512 = 2054;

    public static String getName(int i) {
        if (i == 513) {
            return "rsa_pkcs1_sha1";
        }
        if (i == 515) {
            return "ecdsa_sha1";
        }
        if (i == 1025) {
            return "rsa_pkcs1_sha256";
        }
        if (i == 1027) {
            return "ecdsa_secp256r1_sha256";
        }
        if (i == 1281) {
            return "rsa_pkcs1_sha384";
        }
        if (i == 1283) {
            return "ecdsa_secp384r1_sha384";
        }
        if (i == 1537) {
            return "rsa_pkcs1_sha512";
        }
        if (i == 1539) {
            return "ecdsa_secp521r1_sha512";
        }
        switch (i) {
            case rsa_pss_rsae_sha256 /* 2052 */:
                return "rsa_pss_rsae_sha256";
            case rsa_pss_rsae_sha384 /* 2053 */:
                return "rsa_pss_rsae_sha384";
            case rsa_pss_rsae_sha512 /* 2054 */:
                return "rsa_pss_rsae_sha512";
            case ed25519 /* 2055 */:
                return "ed25519";
            case ed448 /* 2056 */:
                return "ed448";
            case rsa_pss_pss_sha256 /* 2057 */:
                return "rsa_pss_pss_sha256";
            case rsa_pss_pss_sha384 /* 2058 */:
                return "rsa_pss_pss_sha384";
            case rsa_pss_pss_sha512 /* 2059 */:
                return "rsa_pss_pss_sha512";
            default:
                return "UNKNOWN";
        }
    }

    public static String getText(int i) {
        return getName(i) + "(" + i + ")";
    }

    public static boolean isPrivate(int i) {
        return (i >>> 9) == 254;
    }
}
