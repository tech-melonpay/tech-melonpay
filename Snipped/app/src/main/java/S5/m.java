package s5;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l f26647a;

    /* renamed from: b, reason: collision with root package name */
    public final l f26648b;

    public m(l lVar, l lVar2) {
        this.f26647a = lVar;
        this.f26648b = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.f.b(this.f26647a, mVar.f26647a) && kotlin.jvm.internal.f.b(this.f26648b, mVar.f26648b);
    }

    public final int hashCode() {
        l lVar = this.f26647a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f26648b;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ProviderRequisitesDomain(fps=" + this.f26647a + ", iban=" + this.f26648b + ")";
    }
}
