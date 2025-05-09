package B5;

import C.v;
import java.math.BigDecimal;

/* compiled from: SwiftRequestDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358b;

    /* renamed from: c, reason: collision with root package name */
    public final String f359c;

    /* renamed from: d, reason: collision with root package name */
    public final BigDecimal f360d;

    /* renamed from: e, reason: collision with root package name */
    public final String f361e;

    /* renamed from: f, reason: collision with root package name */
    public final String f362f = null;

    /* renamed from: g, reason: collision with root package name */
    public final String f363g = null;

    /* renamed from: h, reason: collision with root package name */
    public final String f364h = null;
    public final String i = null;

    /* renamed from: j, reason: collision with root package name */
    public final String f365j;

    /* renamed from: k, reason: collision with root package name */
    public final String f366k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f367l;

    /* renamed from: m, reason: collision with root package name */
    public final String f368m;

    /* renamed from: n, reason: collision with root package name */
    public final String f369n;

    /* renamed from: o, reason: collision with root package name */
    public final String f370o;

    /* renamed from: p, reason: collision with root package name */
    public final String f371p;

    /* renamed from: q, reason: collision with root package name */
    public final String f372q;

    /* renamed from: r, reason: collision with root package name */
    public final String f373r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f374s;

    /* renamed from: t, reason: collision with root package name */
    public final String f375t;

    /* renamed from: u, reason: collision with root package name */
    public final String f376u;

    public i(String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, boolean z10, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, String str13, String str14) {
        this.f357a = str;
        this.f358b = str2;
        this.f359c = str3;
        this.f360d = bigDecimal;
        this.f361e = str4;
        this.f365j = str5;
        this.f366k = str6;
        this.f367l = z10;
        this.f368m = str7;
        this.f369n = str8;
        this.f370o = str9;
        this.f371p = str10;
        this.f372q = str11;
        this.f373r = str12;
        this.f374s = bool;
        this.f375t = str13;
        this.f376u = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f357a, iVar.f357a) && kotlin.jvm.internal.f.b(this.f358b, iVar.f358b) && kotlin.jvm.internal.f.b(this.f359c, iVar.f359c) && kotlin.jvm.internal.f.b(this.f360d, iVar.f360d) && kotlin.jvm.internal.f.b(this.f361e, iVar.f361e) && kotlin.jvm.internal.f.b(this.f362f, iVar.f362f) && kotlin.jvm.internal.f.b(this.f363g, iVar.f363g) && kotlin.jvm.internal.f.b(this.f364h, iVar.f364h) && kotlin.jvm.internal.f.b(this.i, iVar.i) && kotlin.jvm.internal.f.b(this.f365j, iVar.f365j) && kotlin.jvm.internal.f.b(this.f366k, iVar.f366k) && this.f367l == iVar.f367l && kotlin.jvm.internal.f.b(this.f368m, iVar.f368m) && kotlin.jvm.internal.f.b(this.f369n, iVar.f369n) && kotlin.jvm.internal.f.b(this.f370o, iVar.f370o) && kotlin.jvm.internal.f.b(this.f371p, iVar.f371p) && kotlin.jvm.internal.f.b(this.f372q, iVar.f372q) && kotlin.jvm.internal.f.b(this.f373r, iVar.f373r) && kotlin.jvm.internal.f.b(this.f374s, iVar.f374s) && kotlin.jvm.internal.f.b(this.f375t, iVar.f375t) && kotlin.jvm.internal.f.b(this.f376u, iVar.f376u);
    }

    public final int hashCode() {
        int hashCode = (this.f360d.hashCode() + v.c(v.c(this.f357a.hashCode() * 31, 31, this.f358b), 31, this.f359c)) * 31;
        String str = this.f361e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f362f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f363g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f364h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int d10 = v.d(v.c(v.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f365j), 31, this.f366k), 31, this.f367l);
        String str6 = this.f368m;
        int hashCode6 = (d10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f369n;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f370o;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f371p;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f372q;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f373r;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.f374s;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.f375t;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f376u;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwiftRequestDomain(toAccount=");
        sb2.append(this.f357a);
        sb2.append(", toBicSwift=");
        sb2.append(this.f358b);
        sb2.append(", currency=");
        sb2.append(this.f359c);
        sb2.append(", amount=");
        sb2.append(this.f360d);
        sb2.append(", details=");
        sb2.append(this.f361e);
        sb2.append(", beneficiaryBankName=");
        sb2.append(this.f362f);
        sb2.append(", beneficiaryBankCity=");
        sb2.append(this.f363g);
        sb2.append(", beneficiaryBankAddress=");
        sb2.append(this.f364h);
        sb2.append(", beneficiaryBankCountry=");
        sb2.append(this.i);
        sb2.append(", beneficiaryName=");
        sb2.append(this.f365j);
        sb2.append(", beneficiaryType=");
        sb2.append(this.f366k);
        sb2.append(", saveAsTemplate=");
        sb2.append(this.f367l);
        sb2.append(", templateName=");
        sb2.append(this.f368m);
        sb2.append(", addressLine1=");
        sb2.append(this.f369n);
        sb2.append(", addressLine2=");
        sb2.append(this.f370o);
        sb2.append(", postalCode=");
        sb2.append(this.f371p);
        sb2.append(", city=");
        sb2.append(this.f372q);
        sb2.append(", country=");
        sb2.append(this.f373r);
        sb2.append(", beneficiaryIntermediaryBank=");
        sb2.append(this.f374s);
        sb2.append(", bankName=");
        sb2.append(this.f375t);
        sb2.append(", bankSwift=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f376u, ")");
    }
}
