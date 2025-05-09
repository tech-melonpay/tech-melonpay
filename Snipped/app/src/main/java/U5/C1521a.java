package u5;

import java.util.List;

/* compiled from: AddCryptoInfoRequestDomain.kt */
/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f30208a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f30209b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f30210c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f30211d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f30212e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f30213f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f30214g;

    /* renamed from: h, reason: collision with root package name */
    public final List<String> f30215h;

    public C1521a(Boolean bool, Float f10, Float f11, Float f12, Float f13, List<String> list, List<String> list2, List<String> list3) {
        this.f30208a = bool;
        this.f30209b = f10;
        this.f30210c = f11;
        this.f30211d = f12;
        this.f30212e = f13;
        this.f30213f = list;
        this.f30214g = list2;
        this.f30215h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1521a)) {
            return false;
        }
        C1521a c1521a = (C1521a) obj;
        return kotlin.jvm.internal.f.b(this.f30208a, c1521a.f30208a) && kotlin.jvm.internal.f.b(this.f30209b, c1521a.f30209b) && kotlin.jvm.internal.f.b(this.f30210c, c1521a.f30210c) && kotlin.jvm.internal.f.b(this.f30211d, c1521a.f30211d) && kotlin.jvm.internal.f.b(this.f30212e, c1521a.f30212e) && kotlin.jvm.internal.f.b(this.f30213f, c1521a.f30213f) && kotlin.jvm.internal.f.b(this.f30214g, c1521a.f30214g) && kotlin.jvm.internal.f.b(this.f30215h, c1521a.f30215h);
    }

    public final int hashCode() {
        Boolean bool = this.f30208a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f10 = this.f30209b;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f30210c;
        int hashCode3 = (hashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f30211d;
        int hashCode4 = (hashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f30212e;
        int hashCode5 = (hashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        List<String> list = this.f30213f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f30214g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f30215h;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "AddCryptoInfoRequestDomain(needsCryptoOperations=" + this.f30208a + ", cryptoTxSingleValue=" + this.f30209b + ", cryptoTurnoverMonthly=" + this.f30210c + ", cryptoTxsInMonthlyCount=" + this.f30211d + ", cryptoTxsOutMonthlyCount=" + this.f30212e + ", cryptoPaymentsInCountries=" + this.f30213f + ", cryptoPaymentsOutCountries=" + this.f30214g + ", cryptoUseOfCurrencies=" + this.f30215h + ")";
    }
}
