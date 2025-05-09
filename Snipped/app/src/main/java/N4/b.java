package n4;

import kotlin.jvm.internal.f;

/* compiled from: LimitsResponseRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("currency_code")
    private final String f24220a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("daily_purchase")
    private final C1069a f24221b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("daily_withdrawal")
    private final C1069a f24222c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("daily_internet_purchase")
    private final C1069a f24223d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("daily_contactless_purchase")
    private final C1069a f24224e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("daily_overall_purchase")
    private final C1069a f24225f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("weekly_purchase")
    private final C1069a f24226g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("weekly_withdrawal")
    private final C1069a f24227h;

    @l3.b("weekly_internet_purchase")
    private final C1069a i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("weekly_contactless_purchase")
    private final C1069a f24228j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("weekly_overall_purchase")
    private final C1069a f24229k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("monthly_purchase")
    private final C1069a f24230l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("monthly_withdrawal")
    private final C1069a f24231m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("monthly_internet_purchase")
    private final C1069a f24232n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("monthly_contactless_purchase")
    private final C1069a f24233o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("monthly_overall_purchase")
    private final C1069a f24234p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("transaction_purchase")
    private final Integer f24235q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("transaction_withdrawal")
    private final Integer f24236r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("transaction_internet_purchase")
    private final Integer f24237s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("transaction_contactless_purchase")
    private final Integer f24238t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("all_time_purchase")
    private final String f24239u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("all_time_withdrawal")
    private final String f24240v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("all_time_internet_purchase")
    private final String f24241w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("all_time_contactless_purchase")
    private final String f24242x;

    public final String a() {
        return this.f24242x;
    }

    public final String b() {
        return this.f24241w;
    }

    public final String c() {
        return this.f24239u;
    }

    public final String d() {
        return this.f24240v;
    }

    public final String e() {
        return this.f24220a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f24220a, bVar.f24220a) && f.b(this.f24221b, bVar.f24221b) && f.b(this.f24222c, bVar.f24222c) && f.b(this.f24223d, bVar.f24223d) && f.b(this.f24224e, bVar.f24224e) && f.b(this.f24225f, bVar.f24225f) && f.b(this.f24226g, bVar.f24226g) && f.b(this.f24227h, bVar.f24227h) && f.b(this.i, bVar.i) && f.b(this.f24228j, bVar.f24228j) && f.b(this.f24229k, bVar.f24229k) && f.b(this.f24230l, bVar.f24230l) && f.b(this.f24231m, bVar.f24231m) && f.b(this.f24232n, bVar.f24232n) && f.b(this.f24233o, bVar.f24233o) && f.b(this.f24234p, bVar.f24234p) && f.b(this.f24235q, bVar.f24235q) && f.b(this.f24236r, bVar.f24236r) && f.b(this.f24237s, bVar.f24237s) && f.b(this.f24238t, bVar.f24238t) && f.b(this.f24239u, bVar.f24239u) && f.b(this.f24240v, bVar.f24240v) && f.b(this.f24241w, bVar.f24241w) && f.b(this.f24242x, bVar.f24242x);
    }

    public final C1069a f() {
        return this.f24224e;
    }

    public final C1069a g() {
        return this.f24223d;
    }

    public final C1069a h() {
        return this.f24225f;
    }

    public final int hashCode() {
        String str = this.f24220a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1069a c1069a = this.f24221b;
        int hashCode2 = (hashCode + (c1069a == null ? 0 : c1069a.hashCode())) * 31;
        C1069a c1069a2 = this.f24222c;
        int hashCode3 = (hashCode2 + (c1069a2 == null ? 0 : c1069a2.hashCode())) * 31;
        C1069a c1069a3 = this.f24223d;
        int hashCode4 = (hashCode3 + (c1069a3 == null ? 0 : c1069a3.hashCode())) * 31;
        C1069a c1069a4 = this.f24224e;
        int hashCode5 = (hashCode4 + (c1069a4 == null ? 0 : c1069a4.hashCode())) * 31;
        C1069a c1069a5 = this.f24225f;
        int hashCode6 = (hashCode5 + (c1069a5 == null ? 0 : c1069a5.hashCode())) * 31;
        C1069a c1069a6 = this.f24226g;
        int hashCode7 = (hashCode6 + (c1069a6 == null ? 0 : c1069a6.hashCode())) * 31;
        C1069a c1069a7 = this.f24227h;
        int hashCode8 = (hashCode7 + (c1069a7 == null ? 0 : c1069a7.hashCode())) * 31;
        C1069a c1069a8 = this.i;
        int hashCode9 = (hashCode8 + (c1069a8 == null ? 0 : c1069a8.hashCode())) * 31;
        C1069a c1069a9 = this.f24228j;
        int hashCode10 = (hashCode9 + (c1069a9 == null ? 0 : c1069a9.hashCode())) * 31;
        C1069a c1069a10 = this.f24229k;
        int hashCode11 = (hashCode10 + (c1069a10 == null ? 0 : c1069a10.hashCode())) * 31;
        C1069a c1069a11 = this.f24230l;
        int hashCode12 = (hashCode11 + (c1069a11 == null ? 0 : c1069a11.hashCode())) * 31;
        C1069a c1069a12 = this.f24231m;
        int hashCode13 = (hashCode12 + (c1069a12 == null ? 0 : c1069a12.hashCode())) * 31;
        C1069a c1069a13 = this.f24232n;
        int hashCode14 = (hashCode13 + (c1069a13 == null ? 0 : c1069a13.hashCode())) * 31;
        C1069a c1069a14 = this.f24233o;
        int hashCode15 = (hashCode14 + (c1069a14 == null ? 0 : c1069a14.hashCode())) * 31;
        C1069a c1069a15 = this.f24234p;
        int hashCode16 = (hashCode15 + (c1069a15 == null ? 0 : c1069a15.hashCode())) * 31;
        Integer num = this.f24235q;
        int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24236r;
        int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f24237s;
        int hashCode19 = (hashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f24238t;
        int hashCode20 = (hashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f24239u;
        int hashCode21 = (hashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24240v;
        int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24241w;
        int hashCode23 = (hashCode22 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24242x;
        return hashCode23 + (str5 != null ? str5.hashCode() : 0);
    }

    public final C1069a i() {
        return this.f24221b;
    }

    public final C1069a j() {
        return this.f24222c;
    }

    public final C1069a k() {
        return this.f24233o;
    }

    public final C1069a l() {
        return this.f24232n;
    }

    public final C1069a m() {
        return this.f24234p;
    }

    public final C1069a n() {
        return this.f24230l;
    }

    public final C1069a o() {
        return this.f24231m;
    }

    public final Integer p() {
        return this.f24238t;
    }

    public final Integer q() {
        return this.f24237s;
    }

    public final Integer r() {
        return this.f24235q;
    }

    public final Integer s() {
        return this.f24236r;
    }

    public final C1069a t() {
        return this.f24228j;
    }

    public final String toString() {
        String str = this.f24220a;
        C1069a c1069a = this.f24221b;
        C1069a c1069a2 = this.f24222c;
        C1069a c1069a3 = this.f24223d;
        C1069a c1069a4 = this.f24224e;
        C1069a c1069a5 = this.f24225f;
        C1069a c1069a6 = this.f24226g;
        C1069a c1069a7 = this.f24227h;
        C1069a c1069a8 = this.i;
        C1069a c1069a9 = this.f24228j;
        C1069a c1069a10 = this.f24229k;
        C1069a c1069a11 = this.f24230l;
        C1069a c1069a12 = this.f24231m;
        C1069a c1069a13 = this.f24232n;
        C1069a c1069a14 = this.f24233o;
        C1069a c1069a15 = this.f24234p;
        Integer num = this.f24235q;
        Integer num2 = this.f24236r;
        Integer num3 = this.f24237s;
        Integer num4 = this.f24238t;
        String str2 = this.f24239u;
        String str3 = this.f24240v;
        String str4 = this.f24241w;
        String str5 = this.f24242x;
        StringBuilder sb2 = new StringBuilder("LimitsResponseRaw(currencyCode=");
        sb2.append(str);
        sb2.append(", dailyPurchase=");
        sb2.append(c1069a);
        sb2.append(", dailyWithdrawal=");
        sb2.append(c1069a2);
        sb2.append(", dailyInternetPurchase=");
        sb2.append(c1069a3);
        sb2.append(", dailyContactlessPurchase=");
        sb2.append(c1069a4);
        sb2.append(", dailyOverallPurchase=");
        sb2.append(c1069a5);
        sb2.append(", weeklyPurchase=");
        sb2.append(c1069a6);
        sb2.append(", weeklyWithdrawal=");
        sb2.append(c1069a7);
        sb2.append(", weeklyInternetPurchase=");
        sb2.append(c1069a8);
        sb2.append(", weeklyContactlessPurchase=");
        sb2.append(c1069a9);
        sb2.append(", weeklyOverallPurchase=");
        sb2.append(c1069a10);
        sb2.append(", monthlyPurchase=");
        sb2.append(c1069a11);
        sb2.append(", monthlyWithdrawal=");
        sb2.append(c1069a12);
        sb2.append(", monthlyInternetPurchase=");
        sb2.append(c1069a13);
        sb2.append(", monthlyContactlessPurchase=");
        sb2.append(c1069a14);
        sb2.append(", monthlyOverallPurchase=");
        sb2.append(c1069a15);
        sb2.append(", transactionPurchase=");
        sb2.append(num);
        sb2.append(", transactionWithdrawal=");
        sb2.append(num2);
        sb2.append(", transactionInternetPurchase=");
        sb2.append(num3);
        sb2.append(", transactionContactlessPurchase=");
        sb2.append(num4);
        sb2.append(", allTimePurchase=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", allTimeWithdrawal=", str3, ", allTimeInternetPurchase=");
        return s3.b.o(sb2, str4, ", allTimeContactlessPurchase=", str5, ")");
    }

    public final C1069a u() {
        return this.i;
    }

    public final C1069a v() {
        return this.f24229k;
    }

    public final C1069a w() {
        return this.f24226g;
    }

    public final C1069a x() {
        return this.f24227h;
    }
}
