package a4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AddBusinessInfoRequestRaw.kt */
/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("tx_single_value")
    private final Long f4253a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("txs_in_monthly_count")
    private final Integer f4254b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("txs_out_monthly_count")
    private final Integer f4255c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("needs_license")
    private final Boolean f4256d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("business_description")
    private final String f4257e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("turnover")
    private final Long f4258f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("bank_accounts_outside")
    private final List<C0055a> f4259g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("payments_in_countries")
    private final List<String> f4260h;

    @l3.b("payments_out_countries")
    private final List<String> i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("use_of_currencies")
    private final List<String> f4261j;

    /* compiled from: AddBusinessInfoRequestRaw.kt */
    /* renamed from: a4.a$a, reason: collision with other inner class name */
    public static final class C0055a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String f4262a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("country")
        private final String f4263b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("company_type")
        private final String f4264c;

        public C0055a(String str, String str2, String str3) {
            this.f4262a = str;
            this.f4263b = str2;
            this.f4264c = str3;
        }
    }

    public C0510a(Boolean bool, Integer num, Integer num2, Long l10, Long l11, String str, ArrayList arrayList, List list, List list2, List list3) {
        this.f4253a = l10;
        this.f4254b = num;
        this.f4255c = num2;
        this.f4256d = bool;
        this.f4257e = str;
        this.f4258f = l11;
        this.f4259g = arrayList;
        this.f4260h = list;
        this.i = list2;
        this.f4261j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0510a)) {
            return false;
        }
        C0510a c0510a = (C0510a) obj;
        return kotlin.jvm.internal.f.b(this.f4253a, c0510a.f4253a) && kotlin.jvm.internal.f.b(this.f4254b, c0510a.f4254b) && kotlin.jvm.internal.f.b(this.f4255c, c0510a.f4255c) && kotlin.jvm.internal.f.b(this.f4256d, c0510a.f4256d) && kotlin.jvm.internal.f.b(this.f4257e, c0510a.f4257e) && kotlin.jvm.internal.f.b(this.f4258f, c0510a.f4258f) && kotlin.jvm.internal.f.b(this.f4259g, c0510a.f4259g) && kotlin.jvm.internal.f.b(this.f4260h, c0510a.f4260h) && kotlin.jvm.internal.f.b(this.i, c0510a.i) && kotlin.jvm.internal.f.b(this.f4261j, c0510a.f4261j);
    }

    public final int hashCode() {
        Long l10 = this.f4253a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.f4254b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f4255c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f4256d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f4257e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f4258f;
        int hashCode6 = (hashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        List<C0055a> list = this.f4259g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f4260h;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.i;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f4261j;
        return hashCode9 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "AddBusinessInfoRequestRaw(singlePayment=" + this.f4253a + ", incomingPayments=" + this.f4254b + ", outgoingPayments=" + this.f4255c + ", needLicense=" + this.f4256d + ", businessDescription=" + this.f4257e + ", turnover=" + this.f4258f + ", bankAccountsOutside=" + this.f4259g + ", paymentsInCountries=" + this.f4260h + ", paymentsOutCountries=" + this.i + ", useOfCurrencies=" + this.f4261j + ")";
    }
}
