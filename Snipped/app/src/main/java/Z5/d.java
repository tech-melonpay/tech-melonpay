package z5;

import kotlin.jvm.internal.f;

/* compiled from: UpdateLimitRequestDomain.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Double f31309a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f31310b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f31311c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f31312d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f31313e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f31314f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f31315g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f31316h;
    public final Double i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f31317j;

    /* renamed from: k, reason: collision with root package name */
    public final Double f31318k;

    /* renamed from: l, reason: collision with root package name */
    public final Double f31319l;

    /* renamed from: m, reason: collision with root package name */
    public final Double f31320m;

    /* renamed from: n, reason: collision with root package name */
    public final Double f31321n;

    /* renamed from: o, reason: collision with root package name */
    public final Double f31322o;

    /* renamed from: p, reason: collision with root package name */
    public final Double f31323p;

    /* renamed from: q, reason: collision with root package name */
    public final Double f31324q;

    /* renamed from: r, reason: collision with root package name */
    public final Double f31325r;

    public d() {
        this(null, null, null, null, 262143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f31309a, dVar.f31309a) && f.b(this.f31310b, dVar.f31310b) && f.b(this.f31311c, dVar.f31311c) && f.b(this.f31312d, dVar.f31312d) && f.b(this.f31313e, dVar.f31313e) && f.b(this.f31314f, dVar.f31314f) && f.b(this.f31315g, dVar.f31315g) && f.b(this.f31316h, dVar.f31316h) && f.b(this.i, dVar.i) && f.b(this.f31317j, dVar.f31317j) && f.b(this.f31318k, dVar.f31318k) && f.b(this.f31319l, dVar.f31319l) && f.b(this.f31320m, dVar.f31320m) && f.b(this.f31321n, dVar.f31321n) && f.b(this.f31322o, dVar.f31322o) && f.b(this.f31323p, dVar.f31323p) && f.b(this.f31324q, dVar.f31324q) && f.b(this.f31325r, dVar.f31325r);
    }

    public final int hashCode() {
        Double d10 = this.f31309a;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f31310b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f31311c;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f31312d;
        int hashCode4 = (hashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f31313e;
        int hashCode5 = (hashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f31314f;
        int hashCode6 = (hashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f31315g;
        int hashCode7 = (hashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f31316h;
        int hashCode8 = (hashCode7 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.i;
        int hashCode9 = (hashCode8 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f31317j;
        int hashCode10 = (hashCode9 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d20 = this.f31318k;
        int hashCode11 = (hashCode10 + (d20 == null ? 0 : d20.hashCode())) * 31;
        Double d21 = this.f31319l;
        int hashCode12 = (hashCode11 + (d21 == null ? 0 : d21.hashCode())) * 31;
        Double d22 = this.f31320m;
        int hashCode13 = (hashCode12 + (d22 == null ? 0 : d22.hashCode())) * 31;
        Double d23 = this.f31321n;
        int hashCode14 = (hashCode13 + (d23 == null ? 0 : d23.hashCode())) * 31;
        Double d24 = this.f31322o;
        int hashCode15 = (hashCode14 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f31323p;
        int hashCode16 = (hashCode15 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f31324q;
        int hashCode17 = (hashCode16 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f31325r;
        return hashCode17 + (d27 != null ? d27.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateLimitRequestDomain(dailyContactlessPurchase=" + this.f31309a + ", dailyInternetPurchase=" + this.f31310b + ", dailyOverallPurchase=" + this.f31311c + ", dailyPurchase=" + this.f31312d + ", dailyWithdrawal=" + this.f31313e + ", monthlyContactlessPurchase=" + this.f31314f + ", monthlyInternetPurchase=" + this.f31315g + ", monthlyOverallPurchase=" + this.f31316h + ", monthlyPurchase=" + this.i + ", monthlyWithdrawal=" + this.f31317j + ", transactionContactlessPurchase=" + this.f31318k + ", transactionInternetPurchase=" + this.f31319l + ", transactionPurchase=" + this.f31320m + ", transactionWithdrawal=" + this.f31321n + ", allTimeContactlessPurchase=" + this.f31322o + ", allTimeInternetPurchase=" + this.f31323p + ", allTimePurchase=" + this.f31324q + ", allTimeWithdrawal=" + this.f31325r + ")";
    }

    public d(Double d10, Double d11, Double d12, Double d13, int i) {
        d10 = (i & 1) != 0 ? null : d10;
        d11 = (i & 2) != 0 ? null : d11;
        d12 = (i & 32) != 0 ? null : d12;
        d13 = (i & 64) != 0 ? null : d13;
        this.f31309a = d10;
        this.f31310b = d11;
        this.f31311c = null;
        this.f31312d = null;
        this.f31313e = null;
        this.f31314f = d12;
        this.f31315g = d13;
        this.f31316h = null;
        this.i = null;
        this.f31317j = null;
        this.f31318k = null;
        this.f31319l = null;
        this.f31320m = null;
        this.f31321n = null;
        this.f31322o = null;
        this.f31323p = null;
        this.f31324q = null;
        this.f31325r = null;
    }
}
