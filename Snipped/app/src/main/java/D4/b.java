package d4;

import kotlin.jvm.internal.f;

/* compiled from: UpdateLimitRequestRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("daily_contactless_purchase")
    private final Double f20421a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("daily_internet_purchase")
    private final Double f20422b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("daily_overall_purchase")
    private final Double f20423c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("daily_purchase")
    private final Double f20424d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("daily_withdrawal")
    private final Double f20425e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("monthly_contactless_purchase")
    private final Double f20426f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("monthly_internet_purchase")
    private final Double f20427g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("monthly_overall_purchase")
    private final Double f20428h;

    @l3.b("monthly_purchase")
    private final Double i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("monthly_withdrawal")
    private final Double f20429j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("transaction_contactless_purchase")
    private final Double f20430k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("transaction_internet_purchase")
    private final Double f20431l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("transaction_purchase")
    private final Double f20432m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("transaction_withdrawal")
    private final Double f20433n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("all_time_contactless_purchase")
    private final Double f20434o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("all_time_internet_purchase")
    private final Double f20435p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("all_time_purchase")
    private final Double f20436q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("all_time_withdrawal")
    private final Double f20437r;

    public b(Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d20, Double d21, Double d22, Double d23, Double d24, Double d25, Double d26, Double d27) {
        this.f20421a = d10;
        this.f20422b = d11;
        this.f20423c = d12;
        this.f20424d = d13;
        this.f20425e = d14;
        this.f20426f = d15;
        this.f20427g = d16;
        this.f20428h = d17;
        this.i = d18;
        this.f20429j = d19;
        this.f20430k = d20;
        this.f20431l = d21;
        this.f20432m = d22;
        this.f20433n = d23;
        this.f20434o = d24;
        this.f20435p = d25;
        this.f20436q = d26;
        this.f20437r = d27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f20421a, bVar.f20421a) && f.b(this.f20422b, bVar.f20422b) && f.b(this.f20423c, bVar.f20423c) && f.b(this.f20424d, bVar.f20424d) && f.b(this.f20425e, bVar.f20425e) && f.b(this.f20426f, bVar.f20426f) && f.b(this.f20427g, bVar.f20427g) && f.b(this.f20428h, bVar.f20428h) && f.b(this.i, bVar.i) && f.b(this.f20429j, bVar.f20429j) && f.b(this.f20430k, bVar.f20430k) && f.b(this.f20431l, bVar.f20431l) && f.b(this.f20432m, bVar.f20432m) && f.b(this.f20433n, bVar.f20433n) && f.b(this.f20434o, bVar.f20434o) && f.b(this.f20435p, bVar.f20435p) && f.b(this.f20436q, bVar.f20436q) && f.b(this.f20437r, bVar.f20437r);
    }

    public final int hashCode() {
        Double d10 = this.f20421a;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f20422b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f20423c;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f20424d;
        int hashCode4 = (hashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f20425e;
        int hashCode5 = (hashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f20426f;
        int hashCode6 = (hashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f20427g;
        int hashCode7 = (hashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f20428h;
        int hashCode8 = (hashCode7 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.i;
        int hashCode9 = (hashCode8 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f20429j;
        int hashCode10 = (hashCode9 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d20 = this.f20430k;
        int hashCode11 = (hashCode10 + (d20 == null ? 0 : d20.hashCode())) * 31;
        Double d21 = this.f20431l;
        int hashCode12 = (hashCode11 + (d21 == null ? 0 : d21.hashCode())) * 31;
        Double d22 = this.f20432m;
        int hashCode13 = (hashCode12 + (d22 == null ? 0 : d22.hashCode())) * 31;
        Double d23 = this.f20433n;
        int hashCode14 = (hashCode13 + (d23 == null ? 0 : d23.hashCode())) * 31;
        Double d24 = this.f20434o;
        int hashCode15 = (hashCode14 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f20435p;
        int hashCode16 = (hashCode15 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f20436q;
        int hashCode17 = (hashCode16 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f20437r;
        return hashCode17 + (d27 != null ? d27.hashCode() : 0);
    }

    public final String toString() {
        Double d10 = this.f20421a;
        Double d11 = this.f20422b;
        Double d12 = this.f20423c;
        Double d13 = this.f20424d;
        Double d14 = this.f20425e;
        Double d15 = this.f20426f;
        Double d16 = this.f20427g;
        Double d17 = this.f20428h;
        Double d18 = this.i;
        Double d19 = this.f20429j;
        Double d20 = this.f20430k;
        Double d21 = this.f20431l;
        Double d22 = this.f20432m;
        Double d23 = this.f20433n;
        Double d24 = this.f20434o;
        Double d25 = this.f20435p;
        Double d26 = this.f20436q;
        Double d27 = this.f20437r;
        StringBuilder sb2 = new StringBuilder("UpdateLimitRequestRaw(dailyContactlessPurchase=");
        sb2.append(d10);
        sb2.append(", dailyInternetPurchase=");
        sb2.append(d11);
        sb2.append(", dailyOverallPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d12, ", dailyPurchase=", d13, ", dailyWithdrawal=");
        com.google.android.gms.measurement.internal.a.r(sb2, d14, ", monthlyContactlessPurchase=", d15, ", monthlyInternetPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d16, ", monthlyOverallPurchase=", d17, ", monthlyPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d18, ", monthlyWithdrawal=", d19, ", transactionContactlessPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d20, ", transactionInternetPurchase=", d21, ", transactionPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d22, ", transactionWithdrawal=", d23, ", allTimeContactlessPurchase=");
        com.google.android.gms.measurement.internal.a.r(sb2, d24, ", allTimeInternetPurchase=", d25, ", allTimePurchase=");
        sb2.append(d26);
        sb2.append(", allTimeWithdrawal=");
        sb2.append(d27);
        sb2.append(")");
        return sb2.toString();
    }
}
