package com.luminary.business.domain.entity.cards;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionDomain.kt */
/* loaded from: classes.dex */
public final class CardTransactionDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f10752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10753b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10756e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f10757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10758g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10759h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10760j;

    /* renamed from: k, reason: collision with root package name */
    public final BigDecimal f10761k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10762l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10763m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10764n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10765o;

    /* renamed from: p, reason: collision with root package name */
    public final Date f10766p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10767q;

    /* renamed from: r, reason: collision with root package name */
    public final String f10768r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10769s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10770t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10771u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10772v;

    /* renamed from: w, reason: collision with root package name */
    public final String f10773w;

    public CardTransactionDomain() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTransactionDomain)) {
            return false;
        }
        CardTransactionDomain cardTransactionDomain = (CardTransactionDomain) obj;
        return f.b(this.f10752a, cardTransactionDomain.f10752a) && f.b(this.f10753b, cardTransactionDomain.f10753b) && f.b(this.f10754c, cardTransactionDomain.f10754c) && f.b(this.f10755d, cardTransactionDomain.f10755d) && f.b(this.f10756e, cardTransactionDomain.f10756e) && f.b(this.f10757f, cardTransactionDomain.f10757f) && f.b(this.f10758g, cardTransactionDomain.f10758g) && f.b(this.f10759h, cardTransactionDomain.f10759h) && f.b(this.i, cardTransactionDomain.i) && f.b(this.f10760j, cardTransactionDomain.f10760j) && f.b(this.f10761k, cardTransactionDomain.f10761k) && f.b(this.f10762l, cardTransactionDomain.f10762l) && f.b(this.f10763m, cardTransactionDomain.f10763m) && f.b(this.f10764n, cardTransactionDomain.f10764n) && f.b(this.f10765o, cardTransactionDomain.f10765o) && f.b(this.f10766p, cardTransactionDomain.f10766p) && f.b(this.f10767q, cardTransactionDomain.f10767q) && f.b(this.f10768r, cardTransactionDomain.f10768r) && f.b(this.f10769s, cardTransactionDomain.f10769s) && f.b(this.f10770t, cardTransactionDomain.f10770t) && f.b(this.f10771u, cardTransactionDomain.f10771u) && f.b(this.f10772v, cardTransactionDomain.f10772v) && f.b(this.f10773w, cardTransactionDomain.f10773w);
    }

    public final int hashCode() {
        String str = this.f10752a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10753b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10754c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f10755d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10756e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.f10757f;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.f10758g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10759h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10760j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f10761k;
        int hashCode11 = (hashCode10 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str9 = this.f10762l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10763m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f10764n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f10765o;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Date date = this.f10766p;
        int hashCode16 = (hashCode15 + (date == null ? 0 : date.hashCode())) * 31;
        String str13 = this.f10767q;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f10768r;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f10769s;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f10770t;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f10771u;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f10772v;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f10773w;
        return hashCode22 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardTransactionDomain(id=");
        sb2.append(this.f10752a);
        sb2.append(", uuid=");
        sb2.append(this.f10753b);
        sb2.append(", clientId=");
        sb2.append(this.f10754c);
        sb2.append(", direction=");
        sb2.append(this.f10755d);
        sb2.append(", paymentMethod=");
        sb2.append(this.f10756e);
        sb2.append(", amount=");
        sb2.append(this.f10757f);
        sb2.append(", currency=");
        sb2.append(this.f10758g);
        sb2.append(", details=");
        sb2.append(this.f10759h);
        sb2.append(", fromName=");
        sb2.append(this.i);
        sb2.append(", fromAccountNickname=");
        sb2.append(this.f10760j);
        sb2.append(", fromAmount=");
        sb2.append(this.f10761k);
        sb2.append(", fromCurrency=");
        sb2.append(this.f10762l);
        sb2.append(", toName=");
        sb2.append(this.f10763m);
        sb2.append(", toAccountNickname=");
        sb2.append(this.f10764n);
        sb2.append(", status=");
        sb2.append(this.f10765o);
        sb2.append(", createdAt=");
        sb2.append(this.f10766p);
        sb2.append(", group=");
        sb2.append(this.f10767q);
        sb2.append(", merchantCategoryCode=");
        sb2.append(this.f10768r);
        sb2.append(", merchantName=");
        sb2.append(this.f10769s);
        sb2.append(", merchantUrl=");
        sb2.append(this.f10770t);
        sb2.append(", merchantCountryCode=");
        sb2.append(this.f10771u);
        sb2.append(", maskedCardNumber=");
        sb2.append(this.f10772v);
        sb2.append(", cardName=");
        return a.n(sb2, this.f10773w, ")");
    }

    public CardTransactionDomain(String str, String str2, Integer num, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, String str11, String str12, Date date, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.f10752a = str;
        this.f10753b = str2;
        this.f10754c = num;
        this.f10755d = str3;
        this.f10756e = str4;
        this.f10757f = bigDecimal;
        this.f10758g = str5;
        this.f10759h = str6;
        this.i = str7;
        this.f10760j = str8;
        this.f10761k = bigDecimal2;
        this.f10762l = str9;
        this.f10763m = str10;
        this.f10764n = str11;
        this.f10765o = str12;
        this.f10766p = date;
        this.f10767q = str13;
        this.f10768r = str14;
        this.f10769s = str15;
        this.f10770t = str16;
        this.f10771u = str17;
        this.f10772v = str18;
        this.f10773w = str19;
    }
}
