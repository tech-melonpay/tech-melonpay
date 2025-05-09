package v5;

/* compiled from: CryptoExchangePreviewDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f30621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30622b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f30623c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30624d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f30625e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f30626f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f30627g;

    public f(String str, String str2, Double d10, Integer num, Integer num2, Long l10, Long l11) {
        this.f30621a = str;
        this.f30622b = str2;
        this.f30623c = d10;
        this.f30624d = num;
        this.f30625e = num2;
        this.f30626f = l10;
        this.f30627g = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f30621a, fVar.f30621a) && kotlin.jvm.internal.f.b(this.f30622b, fVar.f30622b) && kotlin.jvm.internal.f.b(this.f30623c, fVar.f30623c) && kotlin.jvm.internal.f.b(this.f30624d, fVar.f30624d) && kotlin.jvm.internal.f.b(this.f30625e, fVar.f30625e) && kotlin.jvm.internal.f.b(this.f30626f, fVar.f30626f) && kotlin.jvm.internal.f.b(this.f30627g, fVar.f30627g);
    }

    public final int hashCode() {
        String str = this.f30621a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30622b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f30623c;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f30624d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f30625e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f30626f;
        int hashCode6 = (hashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f30627g;
        return hashCode6 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "CryptoExchangePreviewDomain(sourceCurrency=" + this.f30621a + ", destinationCurrency=" + this.f30622b + ", sourceAmount=" + this.f30623c + ", sourceBankAccountId=" + this.f30624d + ", destinationBankAccountId=" + this.f30625e + ", cryptoAccountWalletId=" + this.f30626f + ", cryptoAccountWalletExtraId=" + this.f30627g + ")";
    }
}
