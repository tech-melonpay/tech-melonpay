package I5;

import java.util.List;

/* compiled from: IndividualsQuestioanaireRequestDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1736a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1737b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1738c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1739d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f1740e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1741f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f1742g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f1743h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Float f1744j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1745k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1746l;

    /* renamed from: m, reason: collision with root package name */
    public final List<String> f1747m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1748n;

    public d(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, Float f10, String str7, String str8, List<String> list, String str9) {
        this.f1736a = str;
        this.f1737b = str2;
        this.f1738c = str3;
        this.f1739d = str4;
        this.f1740e = bool;
        this.f1741f = str5;
        this.f1742g = bool2;
        this.f1743h = bool3;
        this.i = str6;
        this.f1744j = f10;
        this.f1745k = str7;
        this.f1746l = str8;
        this.f1747m = list;
        this.f1748n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f1736a, dVar.f1736a) && kotlin.jvm.internal.f.b(this.f1737b, dVar.f1737b) && kotlin.jvm.internal.f.b(this.f1738c, dVar.f1738c) && kotlin.jvm.internal.f.b(this.f1739d, dVar.f1739d) && kotlin.jvm.internal.f.b(this.f1740e, dVar.f1740e) && kotlin.jvm.internal.f.b(this.f1741f, dVar.f1741f) && kotlin.jvm.internal.f.b(this.f1742g, dVar.f1742g) && kotlin.jvm.internal.f.b(this.f1743h, dVar.f1743h) && kotlin.jvm.internal.f.b(this.i, dVar.i) && kotlin.jvm.internal.f.b(this.f1744j, dVar.f1744j) && kotlin.jvm.internal.f.b(this.f1745k, dVar.f1745k) && kotlin.jvm.internal.f.b(this.f1746l, dVar.f1746l) && kotlin.jvm.internal.f.b(this.f1747m, dVar.f1747m) && kotlin.jvm.internal.f.b(this.f1748n, dVar.f1748n);
    }

    public final int hashCode() {
        String str = this.f1736a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1737b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1738c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1739d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f1740e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f1741f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f1742g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f1743h;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f10 = this.f1744j;
        int hashCode10 = (hashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str7 = this.f1745k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1746l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.f1747m;
        return this.f1748n.hashCode() + ((hashCode12 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndividualsQuestioanaireRequestDomain(countryTaxResidence=");
        sb2.append(this.f1736a);
        sb2.append(", turnover=");
        sb2.append(this.f1737b);
        sb2.append(", countryBirth=");
        sb2.append(this.f1738c);
        sb2.append(", countryCitizenship=");
        sb2.append(this.f1739d);
        sb2.append(", accCanBusiness=");
        sb2.append(this.f1740e);
        sb2.append(", incomeSource=");
        sb2.append(this.f1741f);
        sb2.append(", isPep=");
        sb2.append(this.f1742g);
        sb2.append(", isUs=");
        sb2.append(this.f1743h);
        sb2.append(", occupdation=");
        sb2.append(this.i);
        sb2.append(", accBalanceAverage=");
        sb2.append(this.f1744j);
        sb2.append(", taxCode=");
        sb2.append(this.f1745k);
        sb2.append(", additionalIncomeSources=");
        sb2.append(this.f1746l);
        sb2.append(", additionalCitizenships=");
        sb2.append(this.f1747m);
        sb2.append(", sourceOfWealth=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1748n, ")");
    }
}
