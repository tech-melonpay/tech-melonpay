package com.luminary.business.domain.entity.company;

import C.v;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: BusinessActivityRequestDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Long f10954a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f10955b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10956c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10957d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10958e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f10959f;

    /* renamed from: g, reason: collision with root package name */
    public final List<CorporateDetailsDomain.a.C0113a> f10960g;

    /* renamed from: h, reason: collision with root package name */
    public final List<String> f10961h;
    public final List<String> i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f10962j;

    public b(Boolean bool, Integer num, Integer num2, Long l10, Long l11, String str, ArrayList arrayList, List list, List list2, List list3) {
        this.f10954a = l10;
        this.f10955b = bool;
        this.f10956c = num;
        this.f10957d = num2;
        this.f10958e = str;
        this.f10959f = l11;
        this.f10960g = arrayList;
        this.f10961h = list;
        this.i = list2;
        this.f10962j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f10954a, bVar.f10954a) && f.b(this.f10955b, bVar.f10955b) && f.b(this.f10956c, bVar.f10956c) && f.b(this.f10957d, bVar.f10957d) && f.b(this.f10958e, bVar.f10958e) && f.b(this.f10959f, bVar.f10959f) && f.b(this.f10960g, bVar.f10960g) && f.b(this.f10961h, bVar.f10961h) && f.b(this.i, bVar.i) && f.b(this.f10962j, bVar.f10962j);
    }

    public final int hashCode() {
        Long l10 = this.f10954a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Boolean bool = this.f10955b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f10956c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10957d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10958e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f10959f;
        int f10 = v.f(this.f10960g, (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
        List<String> list = this.f10961h;
        int hashCode6 = (f10 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.i;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f10962j;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "BusinessActivityRequestDomain(singleValue=" + this.f10954a + ", needLicense=" + this.f10955b + ", monthIncoming=" + this.f10956c + ", monthOutgoing=" + this.f10957d + ", description=" + this.f10958e + ", turnover=" + this.f10959f + ", bankAccountsOutside=" + this.f10960g + ", paymentsInCountries=" + this.f10961h + ", paymentsOutCountries=" + this.i + ", useOfCurrencies=" + this.f10962j + ")";
    }
}
