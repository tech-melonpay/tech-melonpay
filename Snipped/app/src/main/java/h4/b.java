package h4;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("additionalProp1")
    private final String f21061a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("additionalProp2")
    private final String f21062b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("additionalProp3")
    private final String f21063c;

    public final String a() {
        return this.f21061a;
    }

    public final String b() {
        return this.f21062b;
    }

    public final String c() {
        return this.f21063c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f21061a, bVar.f21061a) && kotlin.jvm.internal.f.b(this.f21062b, bVar.f21062b) && kotlin.jvm.internal.f.b(this.f21063c, bVar.f21063c);
    }

    public final int hashCode() {
        String str = this.f21061a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21062b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21063c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f21061a;
        String str2 = this.f21062b;
        return androidx.camera.core.impl.utils.a.n(s3.b.p("AdditionalPropRaw(additionalProp1=", str, ", additionalProp2=", str2, ", additionalProp3="), this.f21063c, ")");
    }
}
