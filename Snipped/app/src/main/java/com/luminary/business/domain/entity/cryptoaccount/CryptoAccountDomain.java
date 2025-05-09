package com.luminary.business.domain.entity.cryptoaccount;

import C.v;
import D9.b;
import P9.s;
import java.io.Serializable;
import java.math.BigDecimal;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.f;
import w5.C1572a;

/* compiled from: CryptoAccountDomain.kt */
/* loaded from: classes.dex */
public final class CryptoAccountDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Long f10963a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f10964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10965c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10966d;

    /* renamed from: e, reason: collision with root package name */
    public final WalletStatus f10967e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10968f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10969g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10970h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10971j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10972k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10973l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10974m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10975n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10976o;

    /* renamed from: p, reason: collision with root package name */
    public final Double f10977p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoAccountDomain.kt */
    public static final class WalletStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10978a;

        /* renamed from: b, reason: collision with root package name */
        public static final WalletStatus f10979b;

        /* renamed from: c, reason: collision with root package name */
        public static final WalletStatus f10980c;

        /* renamed from: d, reason: collision with root package name */
        public static final WalletStatus f10981d;

        /* renamed from: e, reason: collision with root package name */
        public static final WalletStatus f10982e;

        /* renamed from: f, reason: collision with root package name */
        public static final WalletStatus f10983f;

        /* renamed from: g, reason: collision with root package name */
        public static final WalletStatus f10984g;

        /* renamed from: h, reason: collision with root package name */
        public static final WalletStatus f10985h;
        public static final /* synthetic */ WalletStatus[] i;

        /* compiled from: CryptoAccountDomain.kt */
        public static final class a {
        }

        static {
            WalletStatus walletStatus = new WalletStatus("UNDER_REVIEW", 0);
            f10979b = walletStatus;
            WalletStatus walletStatus2 = new WalletStatus("ACTION_REQUIRED", 1);
            f10980c = walletStatus2;
            WalletStatus walletStatus3 = new WalletStatus("ACCEPTED", 2);
            f10981d = walletStatus3;
            WalletStatus walletStatus4 = new WalletStatus("REJECTED", 3);
            f10982e = walletStatus4;
            WalletStatus walletStatus5 = new WalletStatus("DELETED", 4);
            f10983f = walletStatus5;
            WalletStatus walletStatus6 = new WalletStatus("ACTIVE", 5);
            f10984g = walletStatus6;
            WalletStatus walletStatus7 = new WalletStatus("BLOCKED", 6);
            f10985h = walletStatus7;
            i = new WalletStatus[]{walletStatus, walletStatus2, walletStatus3, walletStatus4, walletStatus5, walletStatus6, walletStatus7};
            f10978a = new a();
        }

        public WalletStatus() {
            throw null;
        }

        public static WalletStatus valueOf(String str) {
            return (WalletStatus) Enum.valueOf(WalletStatus.class, str);
        }

        public static WalletStatus[] values() {
            return (WalletStatus[]) i.clone();
        }
    }

    public CryptoAccountDomain(Long l10, Long l11, String str, String str2, WalletStatus walletStatus, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Double d10) {
        this.f10963a = l10;
        this.f10964b = l11;
        this.f10965c = str;
        this.f10966d = str2;
        this.f10967e = walletStatus;
        this.f10968f = str3;
        this.f10969g = str4;
        this.f10970h = str5;
        this.i = str6;
        this.f10971j = str7;
        this.f10972k = str8;
        this.f10973l = str9;
        this.f10974m = str10;
        this.f10975n = str11;
        this.f10976o = str12;
        this.f10977p = d10;
    }

    public static String d(String str) {
        return C0969n.Y(str, "", false) ? C0967l.X(str, "", "", false) : " ".concat(str);
    }

    public final String a() {
        String plainString;
        Double d10 = this.f10977p;
        if (d10 == null || (plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) == null) {
            return "0";
        }
        String str = (String) s.L(C0969n.r0(plainString, new String[]{"."}));
        if (str == null) {
            str = "";
        }
        String p10 = b.p(str);
        return p10.length() == 0 ? "0" : p10;
    }

    public final String b(C1572a c1572a) {
        Integer num;
        String plainString;
        Integer num2;
        Integer num3;
        int i = 2;
        Double d10 = this.f10977p;
        if (d10 == null || (plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString()) == null) {
            if (c1572a != null && (num = c1572a.f30832g) != null) {
                i = num.intValue();
            }
            return s3.b.j(".", C0967l.W(i, "0"));
        }
        String str = (String) s.R(C0969n.r0(plainString, new String[]{"."}));
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            if (c1572a != null && (num3 = c1572a.f30832g) != null) {
                i = num3.intValue();
            }
            return s3.b.j(".", C0967l.W(i, "0"));
        }
        if (c1572a != null && (num2 = c1572a.f30832g) != null) {
            i = num2.intValue();
        }
        return s3.b.j(".", str.length() >= i ? str.substring(0, i) : v.n(str, C0967l.W(i - str.length(), "0")));
    }

    public final String c(C1572a c1572a) {
        return a() + b(c1572a) + " " + this.f10969g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoAccountDomain)) {
            return false;
        }
        CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) obj;
        return f.b(this.f10963a, cryptoAccountDomain.f10963a) && f.b(this.f10964b, cryptoAccountDomain.f10964b) && f.b(this.f10965c, cryptoAccountDomain.f10965c) && f.b(this.f10966d, cryptoAccountDomain.f10966d) && this.f10967e == cryptoAccountDomain.f10967e && f.b(this.f10968f, cryptoAccountDomain.f10968f) && f.b(this.f10969g, cryptoAccountDomain.f10969g) && f.b(this.f10970h, cryptoAccountDomain.f10970h) && f.b(this.i, cryptoAccountDomain.i) && f.b(this.f10971j, cryptoAccountDomain.f10971j) && f.b(this.f10972k, cryptoAccountDomain.f10972k) && f.b(this.f10973l, cryptoAccountDomain.f10973l) && f.b(this.f10974m, cryptoAccountDomain.f10974m) && f.b(this.f10975n, cryptoAccountDomain.f10975n) && f.b(this.f10976o, cryptoAccountDomain.f10976o) && f.b(this.f10977p, cryptoAccountDomain.f10977p);
    }

    public final int hashCode() {
        Long l10 = this.f10963a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f10964b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f10965c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10966d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WalletStatus walletStatus = this.f10967e;
        int hashCode5 = (hashCode4 + (walletStatus == null ? 0 : walletStatus.hashCode())) * 31;
        String str3 = this.f10968f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10969g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10970h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10971j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10972k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10973l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10974m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f10975n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f10976o;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Double d10 = this.f10977p;
        return hashCode15 + (d10 != null ? d10.hashCode() : 0);
    }

    public final String toString() {
        return "CryptoAccountDomain(id=" + this.f10963a + ", clientId=" + this.f10964b + ", address=" + this.f10965c + ", prettyName=" + this.f10966d + ", status=" + this.f10967e + ", network=" + this.f10968f + ", token=" + this.f10969g + ", comments=" + this.f10970h + ", verificationTxId=" + this.i + ", verificationTxAmount=" + this.f10971j + ", verificationTxAddress=" + this.f10972k + ", returnTxId=" + this.f10973l + ", reputationCheckResult=" + this.f10974m + ", createdAt=" + this.f10975n + ", updatedAt=" + this.f10976o + ", balance=" + this.f10977p + ")";
    }
}
