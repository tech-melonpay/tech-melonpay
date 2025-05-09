package com.luminary.business.domain.entity.account;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f;

/* compiled from: BankAccountDomain.kt */
/* loaded from: classes.dex */
public final class BankAccountDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10694a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10696c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10697d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f10698e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, ProviderRequisiteDomain> f10699f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10700g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10701h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f10702j;

    /* renamed from: k, reason: collision with root package name */
    public final Date f10703k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f10704l;

    /* renamed from: m, reason: collision with root package name */
    public final String f10705m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10706n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10707o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10708p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f10709q;

    /* renamed from: r, reason: collision with root package name */
    public final String f10710r;

    /* renamed from: s, reason: collision with root package name */
    public String f10711s;

    /* compiled from: BankAccountDomain.kt */
    public static final class ProviderRequisiteDomain implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final String f10712a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10713b;

        /* renamed from: c, reason: collision with root package name */
        public final String f10714c;

        /* renamed from: d, reason: collision with root package name */
        public final String f10715d;

        /* renamed from: e, reason: collision with root package name */
        public final String f10716e;

        /* renamed from: f, reason: collision with root package name */
        public final String f10717f;

        /* renamed from: g, reason: collision with root package name */
        public final String f10718g;

        /* renamed from: h, reason: collision with root package name */
        public final String f10719h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final String f10720j;

        /* renamed from: k, reason: collision with root package name */
        public final String f10721k;

        /* renamed from: l, reason: collision with root package name */
        public final String f10722l;

        /* renamed from: m, reason: collision with root package name */
        public String f10723m;

        public ProviderRequisiteDomain(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f10712a = str;
            this.f10713b = str2;
            this.f10714c = str3;
            this.f10715d = str4;
            this.f10716e = str5;
            this.f10717f = str6;
            this.f10718g = str7;
            this.f10719h = str8;
            this.i = str9;
            this.f10720j = str10;
            this.f10721k = str11;
            this.f10722l = str12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderRequisiteDomain)) {
                return false;
            }
            ProviderRequisiteDomain providerRequisiteDomain = (ProviderRequisiteDomain) obj;
            return f.b(this.f10712a, providerRequisiteDomain.f10712a) && f.b(this.f10713b, providerRequisiteDomain.f10713b) && f.b(this.f10714c, providerRequisiteDomain.f10714c) && f.b(this.f10715d, providerRequisiteDomain.f10715d) && f.b(this.f10716e, providerRequisiteDomain.f10716e) && f.b(this.f10717f, providerRequisiteDomain.f10717f) && f.b(this.f10718g, providerRequisiteDomain.f10718g) && f.b(this.f10719h, providerRequisiteDomain.f10719h) && f.b(this.i, providerRequisiteDomain.i) && f.b(this.f10720j, providerRequisiteDomain.f10720j) && f.b(this.f10721k, providerRequisiteDomain.f10721k) && f.b(this.f10722l, providerRequisiteDomain.f10722l);
        }

        public final int hashCode() {
            String str = this.f10712a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f10713b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f10714c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f10715d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f10716e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f10717f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f10718g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f10719h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f10720j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f10721k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f10722l;
            return hashCode11 + (str12 != null ? str12.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProviderRequisiteDomain(fullName=");
            sb2.append(this.f10712a);
            sb2.append(", address=");
            sb2.append(this.f10713b);
            sb2.append(", sortCode=");
            sb2.append(this.f10714c);
            sb2.append(", number=");
            sb2.append(this.f10715d);
            sb2.append(", iban=");
            sb2.append(this.f10716e);
            sb2.append(", bicSwift=");
            sb2.append(this.f10717f);
            sb2.append(", bankName=");
            sb2.append(this.f10718g);
            sb2.append(", bankAddress=");
            sb2.append(this.f10719h);
            sb2.append(", bankCountry=");
            sb2.append(this.i);
            sb2.append(", reference=");
            sb2.append(this.f10720j);
            sb2.append(", intermediaryBankName=");
            sb2.append(this.f10721k);
            sb2.append(", intermediaryBankSwift=");
            return a.n(sb2, this.f10722l, ")");
        }
    }

    public BankAccountDomain(Integer num, Integer num2, String str, String str2, BigDecimal bigDecimal, HashMap hashMap, String str3, String str4, String str5, Integer num3, Date date, Boolean bool, String str6, String str7, String str8, String str9, Integer num4, String str10) {
        this.f10694a = num;
        this.f10695b = num2;
        this.f10696c = str;
        this.f10697d = str2;
        this.f10698e = bigDecimal;
        this.f10699f = hashMap;
        this.f10700g = str3;
        this.f10701h = str4;
        this.i = str5;
        this.f10702j = num3;
        this.f10703k = date;
        this.f10704l = bool;
        this.f10705m = str6;
        this.f10706n = str7;
        this.f10707o = str8;
        this.f10708p = str9;
        this.f10709q = num4;
        this.f10710r = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccountDomain)) {
            return false;
        }
        BankAccountDomain bankAccountDomain = (BankAccountDomain) obj;
        return f.b(this.f10694a, bankAccountDomain.f10694a) && f.b(this.f10695b, bankAccountDomain.f10695b) && f.b(this.f10696c, bankAccountDomain.f10696c) && f.b(this.f10697d, bankAccountDomain.f10697d) && f.b(this.f10698e, bankAccountDomain.f10698e) && f.b(this.f10699f, bankAccountDomain.f10699f) && f.b(this.f10700g, bankAccountDomain.f10700g) && f.b(this.f10701h, bankAccountDomain.f10701h) && f.b(this.i, bankAccountDomain.i) && f.b(this.f10702j, bankAccountDomain.f10702j) && f.b(this.f10703k, bankAccountDomain.f10703k) && f.b(this.f10704l, bankAccountDomain.f10704l) && f.b(this.f10705m, bankAccountDomain.f10705m) && f.b(this.f10706n, bankAccountDomain.f10706n) && f.b(this.f10707o, bankAccountDomain.f10707o) && f.b(this.f10708p, bankAccountDomain.f10708p) && f.b(this.f10709q, bankAccountDomain.f10709q) && f.b(this.f10710r, bankAccountDomain.f10710r);
    }

    public final int hashCode() {
        Integer num = this.f10694a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10695b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10696c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10697d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f10698e;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Map<String, ProviderRequisiteDomain> map = this.f10699f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.f10700g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10701h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f10702j;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Date date = this.f10703k;
        int hashCode11 = (hashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.f10704l;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f10705m;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10706n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10707o;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10708p;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num4 = this.f10709q;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str10 = this.f10710r;
        return hashCode17 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankAccountDomain(id=");
        sb2.append(this.f10694a);
        sb2.append(", clientId=");
        sb2.append(this.f10695b);
        sb2.append(", clientName=");
        sb2.append(this.f10696c);
        sb2.append(", assetType=");
        sb2.append(this.f10697d);
        sb2.append(", balance=");
        sb2.append(this.f10698e);
        sb2.append(", providerRequisites=");
        sb2.append(this.f10699f);
        sb2.append(", number=");
        sb2.append(this.f10700g);
        sb2.append(", currency=");
        sb2.append(this.f10701h);
        sb2.append(", prettyName=");
        sb2.append(this.i);
        sb2.append(", status=");
        sb2.append(this.f10702j);
        sb2.append(", createdAt=");
        sb2.append(this.f10703k);
        sb2.append(", welcomeMailSent=");
        sb2.append(this.f10704l);
        sb2.append(", textLine1=");
        sb2.append(this.f10705m);
        sb2.append(", textLine2=");
        sb2.append(this.f10706n);
        sb2.append(", cardsCount=");
        sb2.append(this.f10707o);
        sb2.append(", cardsProgramId=");
        sb2.append(this.f10708p);
        sb2.append(", topUpAccountId=");
        sb2.append(this.f10709q);
        sb2.append(", topUpAccountPname=");
        return a.n(sb2, this.f10710r, ")");
    }
}
