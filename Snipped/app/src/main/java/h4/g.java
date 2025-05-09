package h4;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("additionalProp1")
    private final b f21083a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("additionalProp2")
    private final b f21084b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("additionalProp3")
    private final b f21085c;

    public final b a() {
        return this.f21083a;
    }

    public final b b() {
        return this.f21084b;
    }

    public final b c() {
        return this.f21085c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f21083a, gVar.f21083a) && kotlin.jvm.internal.f.b(this.f21084b, gVar.f21084b) && kotlin.jvm.internal.f.b(this.f21085c, gVar.f21085c);
    }

    public final int hashCode() {
        b bVar = this.f21083a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.f21084b;
        int hashCode2 = (hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f21085c;
        return hashCode2 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final String toString() {
        return "MetadataRaw(additionalProp1=" + this.f21083a + ", additionalProp2=" + this.f21084b + ", additionalProp3=" + this.f21085c + ")";
    }
}
