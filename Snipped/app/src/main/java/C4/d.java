package c4;

import kotlin.jvm.internal.f;

/* compiled from: PreviewExchangeRequestRaw.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("source_currency")
    private String f8552a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("destination_currency")
    private String f8553b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("source_amount")
    private Double f8554c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("source_bankaccount_id")
    private Integer f8555d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("destination_bankaccount_id")
    private Integer f8556e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("crypto_account_wallet_id")
    private Long f8557f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("crypto_account_wallet_extra_id")
    private Long f8558g;

    public d(String str, String str2, Double d10, Integer num, Integer num2, Long l10, Long l11) {
        this.f8552a = str;
        this.f8553b = str2;
        this.f8554c = d10;
        this.f8555d = num;
        this.f8556e = num2;
        this.f8557f = l10;
        this.f8558g = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f8552a, dVar.f8552a) && f.b(this.f8553b, dVar.f8553b) && f.b(this.f8554c, dVar.f8554c) && f.b(this.f8555d, dVar.f8555d) && f.b(this.f8556e, dVar.f8556e) && f.b(this.f8557f, dVar.f8557f) && f.b(this.f8558g, dVar.f8558g);
    }

    public final int hashCode() {
        String str = this.f8552a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8553b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f8554c;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f8555d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8556e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f8557f;
        int hashCode6 = (hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f8558g;
        return hashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f8552a;
        String str2 = this.f8553b;
        Double d10 = this.f8554c;
        Integer num = this.f8555d;
        Integer num2 = this.f8556e;
        Long l10 = this.f8557f;
        Long l11 = this.f8558g;
        StringBuilder p10 = s3.b.p("PreviewExchangeRequestRaw(sourceCurrency=", str, ", destionationCurrency=", str2, ", sourceAmount=");
        p10.append(d10);
        p10.append(", sourceBankAccountId=");
        p10.append(num);
        p10.append(", destinationBankAccountId=");
        p10.append(num2);
        p10.append(", cryptoAccountWalletId=");
        p10.append(l10);
        p10.append(", cryptoAccountWalletExtraId=");
        p10.append(l11);
        p10.append(")");
        return p10.toString();
    }
}
