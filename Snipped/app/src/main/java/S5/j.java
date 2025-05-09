package s5;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final c f26639a;

    /* renamed from: b, reason: collision with root package name */
    public final c f26640b;

    /* renamed from: c, reason: collision with root package name */
    public final c f26641c;

    public j(c cVar, c cVar2, c cVar3) {
        this.f26639a = cVar;
        this.f26640b = cVar2;
        this.f26641c = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f26639a, jVar.f26639a) && kotlin.jvm.internal.f.b(this.f26640b, jVar.f26640b) && kotlin.jvm.internal.f.b(this.f26641c, jVar.f26641c);
    }

    public final int hashCode() {
        c cVar = this.f26639a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f26640b;
        int hashCode2 = (hashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f26641c;
        return hashCode2 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    public final String toString() {
        return "MetadataDomain(additionalProp1=" + this.f26639a + ", additionalProp2=" + this.f26640b + ", additionalProp3=" + this.f26641c + ")";
    }
}
