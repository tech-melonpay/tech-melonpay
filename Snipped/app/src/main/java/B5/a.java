package B5;

/* compiled from: CommissionsDomain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f296c;

    /* renamed from: d, reason: collision with root package name */
    public final String f297d;

    /* renamed from: e, reason: collision with root package name */
    public final String f298e;

    public a(String str, String str2, String str3, String str4, String str5) {
        this.f294a = str;
        this.f295b = str2;
        this.f296c = str3;
        this.f297d = str4;
        this.f298e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.f.b(this.f294a, aVar.f294a) && kotlin.jvm.internal.f.b(this.f295b, aVar.f295b) && kotlin.jvm.internal.f.b(this.f296c, aVar.f296c) && kotlin.jvm.internal.f.b(this.f297d, aVar.f297d) && kotlin.jvm.internal.f.b(this.f298e, aVar.f298e);
    }

    public final int hashCode() {
        String str = this.f294a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f295b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f296c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f297d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f298e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionsDomain(owner=");
        sb2.append(this.f294a);
        sb2.append(", senderFee=");
        sb2.append(this.f295b);
        sb2.append(", senderClearingPolicy=");
        sb2.append(this.f296c);
        sb2.append(", receiverFee=");
        sb2.append(this.f297d);
        sb2.append(", receiverClearingPolicy=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f298e, ")");
    }
}
