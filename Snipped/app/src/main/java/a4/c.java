package a4;

import java.util.List;

/* compiled from: AddCryptoInfoRequestRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("needs_crypto_operations")
    private final Boolean f4271a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("crypto_tx_single_value")
    private final Float f4272b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("crypto_turnover_monthly")
    private final Float f4273c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("crypto_txs_in_monthly_count")
    private final Float f4274d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("crypto_txs_out_monthly_count")
    private final Float f4275e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("crypto_payments_in_countries")
    private final List<String> f4276f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("crypto_payments_out_countries")
    private final List<String> f4277g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("crypto_use_of_currencies")
    private final List<String> f4278h;

    public c(Boolean bool, Float f10, Float f11, Float f12, Float f13, List<String> list, List<String> list2, List<String> list3) {
        this.f4271a = bool;
        this.f4272b = f10;
        this.f4273c = f11;
        this.f4274d = f12;
        this.f4275e = f13;
        this.f4276f = list;
        this.f4277g = list2;
        this.f4278h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f4271a, cVar.f4271a) && kotlin.jvm.internal.f.b(this.f4272b, cVar.f4272b) && kotlin.jvm.internal.f.b(this.f4273c, cVar.f4273c) && kotlin.jvm.internal.f.b(this.f4274d, cVar.f4274d) && kotlin.jvm.internal.f.b(this.f4275e, cVar.f4275e) && kotlin.jvm.internal.f.b(this.f4276f, cVar.f4276f) && kotlin.jvm.internal.f.b(this.f4277g, cVar.f4277g) && kotlin.jvm.internal.f.b(this.f4278h, cVar.f4278h);
    }

    public final int hashCode() {
        Boolean bool = this.f4271a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f10 = this.f4272b;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f4273c;
        int hashCode3 = (hashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f4274d;
        int hashCode4 = (hashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f4275e;
        int hashCode5 = (hashCode4 + (f13 == null ? 0 : f13.hashCode())) * 31;
        List<String> list = this.f4276f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f4277g;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f4278h;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "AddCryptoInfoRequestRaw(needsCryptoOperations=" + this.f4271a + ", cryptoTxSingleValue=" + this.f4272b + ", cryptoTurnoverMonthly=" + this.f4273c + ", cryptoTxsInMonthlyCount=" + this.f4274d + ", cryptoTxsOutMonthlyCount=" + this.f4275e + ", cryptoPaymentsInCountries=" + this.f4276f + ", cryptoPaymentsOutCountries=" + this.f4277g + ", cryptoUseOfCurrencies=" + this.f4278h + ")";
    }
}
