package v5;

/* compiled from: CryptoPreviewDomain.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f30636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30637b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30638c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f30639d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f30640e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f30641f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30642g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30643h;
    public final Double i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f30644j;

    /* renamed from: k, reason: collision with root package name */
    public final Double f30645k;

    public h(String str, String str2, String str3, Double d10, Double d11, Double d12, String str4, String str5, Double d13, Double d14, Double d15) {
        this.f30636a = str;
        this.f30637b = str2;
        this.f30638c = str3;
        this.f30639d = d10;
        this.f30640e = d11;
        this.f30641f = d12;
        this.f30642g = str4;
        this.f30643h = str5;
        this.i = d13;
        this.f30644j = d14;
        this.f30645k = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f30636a, hVar.f30636a) && kotlin.jvm.internal.f.b(this.f30637b, hVar.f30637b) && kotlin.jvm.internal.f.b(this.f30638c, hVar.f30638c) && kotlin.jvm.internal.f.b(this.f30639d, hVar.f30639d) && kotlin.jvm.internal.f.b(this.f30640e, hVar.f30640e) && kotlin.jvm.internal.f.b(this.f30641f, hVar.f30641f) && kotlin.jvm.internal.f.b(this.f30642g, hVar.f30642g) && kotlin.jvm.internal.f.b(this.f30643h, hVar.f30643h) && kotlin.jvm.internal.f.b(this.i, hVar.i) && kotlin.jvm.internal.f.b(this.f30644j, hVar.f30644j) && kotlin.jvm.internal.f.b(this.f30645k, hVar.f30645k);
    }

    public final int hashCode() {
        String str = this.f30636a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30637b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30638c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f30639d;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f30640e;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f30641f;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str4 = this.f30642g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30643h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d13 = this.i;
        int hashCode9 = (hashCode8 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f30644j;
        int hashCode10 = (hashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f30645k;
        return hashCode10 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "CryptoPreviewDomain(sourceCurrency=" + this.f30636a + ", destinationCurrency=" + this.f30637b + ", direction=" + this.f30638c + ", sourceAmount=" + this.f30639d + ", destinationAmount=" + this.f30640e + ", comissionAmount=" + this.f30641f + ", comissionCurrency=" + this.f30642g + ", comissionType=" + this.f30643h + ", comissionDisplayAmount=" + this.i + ", rate=" + this.f30644j + ", minSourceAmount=" + this.f30645k + ")";
    }
}
