package h4;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("bankCode")
    private final String f21133a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("bankAccountNumber")
    private final String f21134b;

    public final String a() {
        return this.f21134b;
    }

    public final String b() {
        return this.f21133a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.f.b(this.f21133a, lVar.f21133a) && kotlin.jvm.internal.f.b(this.f21134b, lVar.f21134b);
    }

    public final int hashCode() {
        String str = this.f21133a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21134b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s3.b.l("ProviderRequestRaw(bankCode=", this.f21133a, ", bankAccountNumber=", this.f21134b, ")");
    }
}
