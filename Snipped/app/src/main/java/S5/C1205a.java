package s5;

import com.luminary.business.domain.entity.account.CardsDomain;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccountDomain.kt */
/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205a {

    /* renamed from: a, reason: collision with root package name */
    public final String f26590a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f26591b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26592c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26593d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26594e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f26595f;

    /* renamed from: g, reason: collision with root package name */
    public final j f26596g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26597h;
    public final Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final m f26598j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26599k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f26600l;

    /* renamed from: m, reason: collision with root package name */
    public final List<CardsDomain> f26601m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f26602n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f26603o;

    /* renamed from: p, reason: collision with root package name */
    public final String f26604p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f26605q;

    /* renamed from: r, reason: collision with root package name */
    public final k f26606r;

    /* renamed from: s, reason: collision with root package name */
    public final List<d> f26607s;

    public C1205a(String str, Integer num, String str2, String str3, String str4, Integer num2, j jVar, String str5, Boolean bool, m mVar, String str6, Integer num3, ArrayList arrayList, Integer num4, Boolean bool2, String str7, Boolean bool3, k kVar, ArrayList arrayList2) {
        this.f26590a = str;
        this.f26591b = num;
        this.f26592c = str2;
        this.f26593d = str3;
        this.f26594e = str4;
        this.f26595f = num2;
        this.f26596g = jVar;
        this.f26597h = str5;
        this.i = bool;
        this.f26598j = mVar;
        this.f26599k = str6;
        this.f26600l = num3;
        this.f26601m = arrayList;
        this.f26602n = num4;
        this.f26603o = bool2;
        this.f26604p = str7;
        this.f26605q = bool3;
        this.f26606r = kVar;
        this.f26607s = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1205a)) {
            return false;
        }
        C1205a c1205a = (C1205a) obj;
        return kotlin.jvm.internal.f.b(this.f26590a, c1205a.f26590a) && kotlin.jvm.internal.f.b(this.f26591b, c1205a.f26591b) && kotlin.jvm.internal.f.b(this.f26592c, c1205a.f26592c) && kotlin.jvm.internal.f.b(this.f26593d, c1205a.f26593d) && kotlin.jvm.internal.f.b(this.f26594e, c1205a.f26594e) && kotlin.jvm.internal.f.b(this.f26595f, c1205a.f26595f) && kotlin.jvm.internal.f.b(this.f26596g, c1205a.f26596g) && kotlin.jvm.internal.f.b(this.f26597h, c1205a.f26597h) && kotlin.jvm.internal.f.b(this.i, c1205a.i) && kotlin.jvm.internal.f.b(this.f26598j, c1205a.f26598j) && kotlin.jvm.internal.f.b(this.f26599k, c1205a.f26599k) && kotlin.jvm.internal.f.b(this.f26600l, c1205a.f26600l) && kotlin.jvm.internal.f.b(this.f26601m, c1205a.f26601m) && kotlin.jvm.internal.f.b(this.f26602n, c1205a.f26602n) && kotlin.jvm.internal.f.b(this.f26603o, c1205a.f26603o) && kotlin.jvm.internal.f.b(this.f26604p, c1205a.f26604p) && kotlin.jvm.internal.f.b(this.f26605q, c1205a.f26605q) && kotlin.jvm.internal.f.b(this.f26606r, c1205a.f26606r) && kotlin.jvm.internal.f.b(this.f26607s, c1205a.f26607s);
    }

    public final int hashCode() {
        String str = this.f26590a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f26591b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f26592c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26593d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26594e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f26595f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        j jVar = this.f26596g;
        int hashCode7 = (hashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str5 = this.f26597h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        m mVar = this.f26598j;
        int hashCode10 = (hashCode9 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str6 = this.f26599k;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f26600l;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<CardsDomain> list = this.f26601m;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.f26602n;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.f26603o;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f26604p;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.f26605q;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        k kVar = this.f26606r;
        int hashCode18 = (hashCode17 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<d> list2 = this.f26607s;
        return hashCode18 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "AccountDomain(name=" + this.f26590a + ", clientType=" + this.f26591b + ", clientName=" + this.f26592c + ", createdAt=" + this.f26593d + ", iban=" + this.f26594e + ", beneficiaryType=" + this.f26595f + ", metadata=" + this.f26596g + ", providerCurrency=" + this.f26597h + ", external=" + this.i + ", providerRequisites=" + this.f26598j + ", number=" + this.f26599k + ", type=" + this.f26600l + ", cards=" + this.f26601m + ", status=" + this.f26602n + ", primary=" + this.f26603o + ", providerNumber=" + this.f26604p + ", dormant=" + this.f26605q + ", prohibitedOperations=" + this.f26606r + ", balancesDomain=" + this.f26607s + ")";
    }
}
