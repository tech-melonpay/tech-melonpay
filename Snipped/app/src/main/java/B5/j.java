package B5;

import C.v;
import java.math.BigDecimal;

/* compiled from: ToBankAccountRequestDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f378b;

    /* renamed from: c, reason: collision with root package name */
    public final String f379c;

    /* renamed from: d, reason: collision with root package name */
    public final String f380d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f381e;

    /* renamed from: f, reason: collision with root package name */
    public final String f382f;

    /* renamed from: g, reason: collision with root package name */
    public final String f383g = null;

    /* renamed from: h, reason: collision with root package name */
    public final String f384h = null;
    public final String i = null;

    /* renamed from: j, reason: collision with root package name */
    public final String f385j = null;

    /* renamed from: k, reason: collision with root package name */
    public final String f386k;

    /* renamed from: l, reason: collision with root package name */
    public final String f387l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f388m;

    /* renamed from: n, reason: collision with root package name */
    public final String f389n;

    /* renamed from: o, reason: collision with root package name */
    public final String f390o;

    /* renamed from: p, reason: collision with root package name */
    public final String f391p;

    /* renamed from: q, reason: collision with root package name */
    public final String f392q;

    /* renamed from: r, reason: collision with root package name */
    public final String f393r;

    /* renamed from: s, reason: collision with root package name */
    public final String f394s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f395t;

    /* renamed from: u, reason: collision with root package name */
    public final String f396u;

    /* renamed from: v, reason: collision with root package name */
    public final String f397v;

    public j(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, String str7, boolean z10, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15) {
        this.f377a = str;
        this.f378b = str2;
        this.f379c = str3;
        this.f380d = str4;
        this.f381e = bigDecimal;
        this.f382f = str5;
        this.f386k = str6;
        this.f387l = str7;
        this.f388m = z10;
        this.f389n = str8;
        this.f390o = str9;
        this.f391p = str10;
        this.f392q = str11;
        this.f393r = str12;
        this.f394s = str13;
        this.f395t = bool;
        this.f396u = str14;
        this.f397v = str15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f377a, jVar.f377a) && kotlin.jvm.internal.f.b(this.f378b, jVar.f378b) && kotlin.jvm.internal.f.b(this.f379c, jVar.f379c) && kotlin.jvm.internal.f.b(this.f380d, jVar.f380d) && kotlin.jvm.internal.f.b(this.f381e, jVar.f381e) && kotlin.jvm.internal.f.b(this.f382f, jVar.f382f) && kotlin.jvm.internal.f.b(this.f383g, jVar.f383g) && kotlin.jvm.internal.f.b(this.f384h, jVar.f384h) && kotlin.jvm.internal.f.b(this.i, jVar.i) && kotlin.jvm.internal.f.b(this.f385j, jVar.f385j) && kotlin.jvm.internal.f.b(this.f386k, jVar.f386k) && kotlin.jvm.internal.f.b(this.f387l, jVar.f387l) && this.f388m == jVar.f388m && kotlin.jvm.internal.f.b(this.f389n, jVar.f389n) && kotlin.jvm.internal.f.b(this.f390o, jVar.f390o) && kotlin.jvm.internal.f.b(this.f391p, jVar.f391p) && kotlin.jvm.internal.f.b(this.f392q, jVar.f392q) && kotlin.jvm.internal.f.b(this.f393r, jVar.f393r) && kotlin.jvm.internal.f.b(this.f394s, jVar.f394s) && kotlin.jvm.internal.f.b(this.f395t, jVar.f395t) && kotlin.jvm.internal.f.b(this.f396u, jVar.f396u) && kotlin.jvm.internal.f.b(this.f397v, jVar.f397v);
    }

    public final int hashCode() {
        int hashCode = (this.f381e.hashCode() + v.c(v.c(v.c(this.f377a.hashCode() * 31, 31, this.f378b), 31, this.f379c), 31, this.f380d)) * 31;
        String str = this.f382f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f383g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f384h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f385j;
        int d10 = v.d(v.c(v.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f386k), 31, this.f387l), 31, this.f388m);
        String str6 = this.f389n;
        int hashCode6 = (d10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f390o;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f391p;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f392q;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f393r;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f394s;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.f395t;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.f396u;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f397v;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToBankAccountRequestDomain(bankAccountId=");
        sb2.append(this.f377a);
        sb2.append(", toAccount=");
        sb2.append(this.f378b);
        sb2.append(", toBicSwift=");
        sb2.append(this.f379c);
        sb2.append(", currency=");
        sb2.append(this.f380d);
        sb2.append(", amount=");
        sb2.append(this.f381e);
        sb2.append(", details=");
        sb2.append(this.f382f);
        sb2.append(", beneficiaryBankName=");
        sb2.append(this.f383g);
        sb2.append(", beneficiaryBankCity=");
        sb2.append(this.f384h);
        sb2.append(", beneficiaryBankAddress=");
        sb2.append(this.i);
        sb2.append(", beneficiaryBankCountry=");
        sb2.append(this.f385j);
        sb2.append(", beneficiaryName=");
        sb2.append(this.f386k);
        sb2.append(", beneficiaryType=");
        sb2.append(this.f387l);
        sb2.append(", saveAsTemplate=");
        sb2.append(this.f388m);
        sb2.append(", templateName=");
        sb2.append(this.f389n);
        sb2.append(", addressLine1=");
        sb2.append(this.f390o);
        sb2.append(", addressLine2=");
        sb2.append(this.f391p);
        sb2.append(", postalCode=");
        sb2.append(this.f392q);
        sb2.append(", city=");
        sb2.append(this.f393r);
        sb2.append(", country=");
        sb2.append(this.f394s);
        sb2.append(", beneficiaryIntermediaryBank=");
        sb2.append(this.f395t);
        sb2.append(", bankName=");
        sb2.append(this.f396u);
        sb2.append(", bankSwift=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f397v, ")");
    }
}
