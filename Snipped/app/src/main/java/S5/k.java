package s5;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f26642a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f26643b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f26644c;

    public k(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f26642a = bool;
        this.f26643b = bool2;
        this.f26644c = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f26642a, kVar.f26642a) && kotlin.jvm.internal.f.b(this.f26643b, kVar.f26643b) && kotlin.jvm.internal.f.b(this.f26644c, kVar.f26644c);
    }

    public final int hashCode() {
        Boolean bool = this.f26642a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f26643b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f26644c;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "ProhibitedOperationsDomain(additionalProp1=" + this.f26642a + ", additionalProp2=" + this.f26643b + ", additionalProp3=" + this.f26644c + ")";
    }
}
