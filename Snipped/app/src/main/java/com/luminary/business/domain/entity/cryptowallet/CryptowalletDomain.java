package com.luminary.business.domain.entity.cryptowallet;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CryptowalletDomain.kt */
/* loaded from: classes.dex */
public final class CryptowalletDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Long f11072a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11073b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11074c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11075d;

    /* renamed from: e, reason: collision with root package name */
    public final WalletStatus f11076e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11077f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11078g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11079h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11080j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11081k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11082l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11083m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11084n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11085o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptowalletDomain.kt */
    public static final class WalletStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11086a;

        /* renamed from: b, reason: collision with root package name */
        public static final WalletStatus f11087b;

        /* renamed from: c, reason: collision with root package name */
        public static final WalletStatus f11088c;

        /* renamed from: d, reason: collision with root package name */
        public static final WalletStatus f11089d;

        /* renamed from: e, reason: collision with root package name */
        public static final WalletStatus f11090e;

        /* renamed from: f, reason: collision with root package name */
        public static final WalletStatus f11091f;

        /* renamed from: g, reason: collision with root package name */
        public static final WalletStatus f11092g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ WalletStatus[] f11093h;

        /* compiled from: CryptowalletDomain.kt */
        public static final class a {
        }

        static {
            WalletStatus walletStatus = new WalletStatus("UNDER_REVIEW", 0);
            f11087b = walletStatus;
            WalletStatus walletStatus2 = new WalletStatus("ACTION_REQUIRED", 1);
            f11088c = walletStatus2;
            WalletStatus walletStatus3 = new WalletStatus("ACCEPTED", 2);
            f11089d = walletStatus3;
            WalletStatus walletStatus4 = new WalletStatus("REJECTED", 3);
            f11090e = walletStatus4;
            WalletStatus walletStatus5 = new WalletStatus("DELETED", 4);
            f11091f = walletStatus5;
            WalletStatus walletStatus6 = new WalletStatus("BLOCKED", 5);
            f11092g = walletStatus6;
            f11093h = new WalletStatus[]{walletStatus, walletStatus2, walletStatus3, walletStatus4, walletStatus5, walletStatus6};
            f11086a = new a();
        }

        public WalletStatus() {
            throw null;
        }

        public static WalletStatus valueOf(String str) {
            return (WalletStatus) Enum.valueOf(WalletStatus.class, str);
        }

        public static WalletStatus[] values() {
            return (WalletStatus[]) f11093h.clone();
        }
    }

    public CryptowalletDomain(Long l10, Long l11, String str, String str2, WalletStatus walletStatus, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f11072a = l10;
        this.f11073b = l11;
        this.f11074c = str;
        this.f11075d = str2;
        this.f11076e = walletStatus;
        this.f11077f = str3;
        this.f11078g = str4;
        this.f11079h = str5;
        this.i = str6;
        this.f11080j = str7;
        this.f11081k = str8;
        this.f11082l = str9;
        this.f11083m = str10;
        this.f11084n = str11;
        this.f11085o = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptowalletDomain)) {
            return false;
        }
        CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) obj;
        return f.b(this.f11072a, cryptowalletDomain.f11072a) && f.b(this.f11073b, cryptowalletDomain.f11073b) && f.b(this.f11074c, cryptowalletDomain.f11074c) && f.b(this.f11075d, cryptowalletDomain.f11075d) && this.f11076e == cryptowalletDomain.f11076e && f.b(this.f11077f, cryptowalletDomain.f11077f) && f.b(this.f11078g, cryptowalletDomain.f11078g) && f.b(this.f11079h, cryptowalletDomain.f11079h) && f.b(this.i, cryptowalletDomain.i) && f.b(this.f11080j, cryptowalletDomain.f11080j) && f.b(this.f11081k, cryptowalletDomain.f11081k) && f.b(this.f11082l, cryptowalletDomain.f11082l) && f.b(this.f11083m, cryptowalletDomain.f11083m) && f.b(this.f11084n, cryptowalletDomain.f11084n) && f.b(this.f11085o, cryptowalletDomain.f11085o);
    }

    public final int hashCode() {
        Long l10 = this.f11072a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f11073b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f11074c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11075d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WalletStatus walletStatus = this.f11076e;
        int hashCode5 = (hashCode4 + (walletStatus == null ? 0 : walletStatus.hashCode())) * 31;
        String str3 = this.f11077f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11078g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11079h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11080j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11081k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f11082l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f11083m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11084n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11085o;
        return hashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CryptowalletDomain(id=");
        sb2.append(this.f11072a);
        sb2.append(", clientId=");
        sb2.append(this.f11073b);
        sb2.append(", address=");
        sb2.append(this.f11074c);
        sb2.append(", prettyName=");
        sb2.append(this.f11075d);
        sb2.append(", status=");
        sb2.append(this.f11076e);
        sb2.append(", network=");
        sb2.append(this.f11077f);
        sb2.append(", token=");
        sb2.append(this.f11078g);
        sb2.append(", comments=");
        sb2.append(this.f11079h);
        sb2.append(", verificationTxId=");
        sb2.append(this.i);
        sb2.append(", verificationTxAmount=");
        sb2.append(this.f11080j);
        sb2.append(", verificationTxAddress=");
        sb2.append(this.f11081k);
        sb2.append(", returnTxId=");
        sb2.append(this.f11082l);
        sb2.append(", reputationCheckResult=");
        sb2.append(this.f11083m);
        sb2.append(", createdAt=");
        sb2.append(this.f11084n);
        sb2.append(", updatedAt=");
        return a.n(sb2, this.f11085o, ")");
    }
}
