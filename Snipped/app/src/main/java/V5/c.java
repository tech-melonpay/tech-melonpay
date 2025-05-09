package v5;

/* compiled from: CreateWithdrawDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f30605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30606b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f30607c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30608d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f30609e;

    public c(int i, String str, Integer num, Integer num2, Float f10) {
        this.f30605a = i;
        this.f30606b = str;
        this.f30607c = num;
        this.f30608d = num2;
        this.f30609e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30605a == cVar.f30605a && kotlin.jvm.internal.f.b(this.f30606b, cVar.f30606b) && kotlin.jvm.internal.f.b(this.f30607c, cVar.f30607c) && kotlin.jvm.internal.f.b(this.f30608d, cVar.f30608d) && kotlin.jvm.internal.f.b(this.f30609e, cVar.f30609e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f30605a) * 31;
        String str = this.f30606b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f30607c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f30608d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.f30609e;
        return hashCode4 + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "CreateWithdrawDomain(clientId=" + this.f30605a + ", sourceCurrency=" + this.f30606b + ", accountId=" + this.f30607c + ", walletId=" + this.f30608d + ", amount=" + this.f30609e + ")";
    }
}
