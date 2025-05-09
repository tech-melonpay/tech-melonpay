package h4;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("additionalProp1")
    private final Boolean f21130a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("additionalProp2")
    private final Boolean f21131b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("additionalProp3")
    private final Boolean f21132c;

    public final Boolean a() {
        return this.f21130a;
    }

    public final Boolean b() {
        return this.f21131b;
    }

    public final Boolean c() {
        return this.f21132c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f21130a, kVar.f21130a) && kotlin.jvm.internal.f.b(this.f21131b, kVar.f21131b) && kotlin.jvm.internal.f.b(this.f21132c, kVar.f21132c);
    }

    public final int hashCode() {
        Boolean bool = this.f21130a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f21131b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f21132c;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "ProhibitedOperationsRaw(additionalProp1=" + this.f21130a + ", additionalProp2=" + this.f21131b + ", additionalProp3=" + this.f21132c + ")";
    }
}
