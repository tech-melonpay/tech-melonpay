package a4;

/* compiled from: CryptoCreateRequestRaw.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f4318a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("token")
    private final String f4319b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("address")
    private final String f4320c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("network")
    private final String f4321d;

    public k(String str, String str2, String str3, String str4) {
        this.f4318a = str;
        this.f4319b = str2;
        this.f4320c = str3;
        this.f4321d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f4318a, kVar.f4318a) && kotlin.jvm.internal.f.b(this.f4319b, kVar.f4319b) && kotlin.jvm.internal.f.b(this.f4320c, kVar.f4320c) && kotlin.jvm.internal.f.b(this.f4321d, kVar.f4321d);
    }

    public final int hashCode() {
        int hashCode = this.f4318a.hashCode() * 31;
        String str = this.f4319b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4320c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4321d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4318a;
        String str2 = this.f4319b;
        return s3.b.o(s3.b.p("CryptoCreateRequestRaw(prettyName=", str, ", token=", str2, ", address="), this.f4320c, ", network=", this.f4321d, ")");
    }
}
