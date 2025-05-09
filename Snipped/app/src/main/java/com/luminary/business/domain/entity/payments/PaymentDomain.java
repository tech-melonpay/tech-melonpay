package com.luminary.business.domain.entity.payments;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.f;

/* compiled from: PaymentDomain.kt */
/* loaded from: classes.dex */
public final class PaymentDomain implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public final BigDecimal f11096A;

    /* renamed from: B, reason: collision with root package name */
    public final String f11097B;

    /* renamed from: C, reason: collision with root package name */
    public final String f11098C;

    /* renamed from: D, reason: collision with root package name */
    public final String f11099D;

    /* renamed from: E, reason: collision with root package name */
    public final String f11100E;

    /* renamed from: F, reason: collision with root package name */
    public final Long f11101F;

    /* renamed from: G, reason: collision with root package name */
    public final String f11102G;

    /* renamed from: H, reason: collision with root package name */
    public final Confirmation f11103H;

    /* renamed from: a, reason: collision with root package name */
    public final String f11104a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11105b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f11106c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f11107d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11108e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11109f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11110g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f11111h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11112j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11113k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11114l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11115m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11116n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11117o;

    /* renamed from: p, reason: collision with root package name */
    public final BigDecimal f11118p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11119q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11120r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11121s;

    /* renamed from: t, reason: collision with root package name */
    public final String f11122t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11123u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11124v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11125w;

    /* renamed from: x, reason: collision with root package name */
    public final String f11126x;

    /* renamed from: y, reason: collision with root package name */
    public final String f11127y;

    /* renamed from: z, reason: collision with root package name */
    public final String f11128z;

    public PaymentDomain(String str, String str2, Long l10, Long l11, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BigDecimal bigDecimal2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, BigDecimal bigDecimal3, String str23, String str24, String str25, String str26, Long l12, String str27, Confirmation confirmation) {
        this.f11104a = str;
        this.f11105b = str2;
        this.f11106c = l10;
        this.f11107d = l11;
        this.f11108e = str3;
        this.f11109f = str4;
        this.f11110g = str5;
        this.f11111h = bigDecimal;
        this.i = str6;
        this.f11112j = str7;
        this.f11113k = str8;
        this.f11114l = str9;
        this.f11115m = str10;
        this.f11116n = str11;
        this.f11117o = str12;
        this.f11118p = bigDecimal2;
        this.f11119q = str13;
        this.f11120r = str14;
        this.f11121s = str15;
        this.f11122t = str16;
        this.f11123u = str17;
        this.f11124v = str18;
        this.f11125w = str19;
        this.f11126x = str20;
        this.f11127y = str21;
        this.f11128z = str22;
        this.f11096A = bigDecimal3;
        this.f11097B = str23;
        this.f11098C = str24;
        this.f11099D = str25;
        this.f11100E = str26;
        this.f11101F = l12;
        this.f11102G = str27;
        this.f11103H = confirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDomain)) {
            return false;
        }
        PaymentDomain paymentDomain = (PaymentDomain) obj;
        return f.b(this.f11104a, paymentDomain.f11104a) && f.b(this.f11105b, paymentDomain.f11105b) && f.b(this.f11106c, paymentDomain.f11106c) && f.b(this.f11107d, paymentDomain.f11107d) && f.b(this.f11108e, paymentDomain.f11108e) && f.b(this.f11109f, paymentDomain.f11109f) && f.b(this.f11110g, paymentDomain.f11110g) && f.b(this.f11111h, paymentDomain.f11111h) && f.b(this.i, paymentDomain.i) && f.b(this.f11112j, paymentDomain.f11112j) && f.b(this.f11113k, paymentDomain.f11113k) && f.b(this.f11114l, paymentDomain.f11114l) && f.b(this.f11115m, paymentDomain.f11115m) && f.b(this.f11116n, paymentDomain.f11116n) && f.b(this.f11117o, paymentDomain.f11117o) && f.b(this.f11118p, paymentDomain.f11118p) && f.b(this.f11119q, paymentDomain.f11119q) && f.b(this.f11120r, paymentDomain.f11120r) && f.b(this.f11121s, paymentDomain.f11121s) && f.b(this.f11122t, paymentDomain.f11122t) && f.b(this.f11123u, paymentDomain.f11123u) && f.b(this.f11124v, paymentDomain.f11124v) && f.b(this.f11125w, paymentDomain.f11125w) && f.b(this.f11126x, paymentDomain.f11126x) && f.b(this.f11127y, paymentDomain.f11127y) && f.b(this.f11128z, paymentDomain.f11128z) && f.b(this.f11096A, paymentDomain.f11096A) && f.b(this.f11097B, paymentDomain.f11097B) && f.b(this.f11098C, paymentDomain.f11098C) && f.b(this.f11099D, paymentDomain.f11099D) && f.b(this.f11100E, paymentDomain.f11100E) && f.b(this.f11101F, paymentDomain.f11101F) && f.b(this.f11102G, paymentDomain.f11102G) && f.b(this.f11103H, paymentDomain.f11103H);
    }

    public final int hashCode() {
        String str = this.f11104a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11105b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f11106c;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f11107d;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.f11108e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11109f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11110g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.f11111h;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11112j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11113k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f11114l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f11115m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11116n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11117o;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f11118p;
        int hashCode16 = (hashCode15 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str13 = this.f11119q;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f11120r;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11121s;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f11122t;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f11123u;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f11124v;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f11125w;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f11126x;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f11127y;
        int hashCode25 = (hashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f11128z;
        int hashCode26 = (hashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f11096A;
        int hashCode27 = (hashCode26 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str23 = this.f11097B;
        int hashCode28 = (hashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f11098C;
        int hashCode29 = (hashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f11099D;
        int hashCode30 = (hashCode29 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f11100E;
        int hashCode31 = (hashCode30 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Long l12 = this.f11101F;
        int hashCode32 = (hashCode31 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str27 = this.f11102G;
        return this.f11103H.hashCode() + ((hashCode32 + (str27 != null ? str27.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PaymentDomain(id=" + this.f11104a + ", uuid=" + this.f11105b + ", clientId=" + this.f11106c + ", beneficiaryId=" + this.f11107d + ", beneficiaryType=" + this.f11108e + ", direction=" + this.f11109f + ", paymentMethod=" + this.f11110g + ", amount=" + this.f11111h + ", currency=" + this.i + ", details=" + this.f11112j + ", fromName=" + this.f11113k + ", fromAccount=" + this.f11114l + ", fromIban=" + this.f11115m + ", fromBicSwift=" + this.f11116n + ", fromGbSortCode=" + this.f11117o + ", fromAmount=" + this.f11118p + ", fromCurrency=" + this.f11119q + ", toName=" + this.f11120r + ", toAccount=" + this.f11121s + ", toIban=" + this.f11122t + ", toBicSwift=" + this.f11123u + ", toGbSortCode=" + this.f11124v + ", toBankName=" + this.f11125w + ", toBankCity=" + this.f11126x + ", toBankAddress=" + this.f11127y + ", toBankCountry=" + this.f11128z + ", toAmount=" + this.f11096A + ", toCurrency=" + this.f11097B + ", status=" + this.f11098C + ", createdAt=" + this.f11099D + ", updatedAt=" + this.f11100E + ", masterTxId=" + this.f11101F + ", providerTxSignerStatus=" + this.f11102G + ", confirmation=" + this.f11103H + ")";
    }
}
