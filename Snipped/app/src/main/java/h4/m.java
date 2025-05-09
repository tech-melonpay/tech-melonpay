package h4;

/* compiled from: AccountRaw.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("fps")
    private final l f21135a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("")
    private final l f21136b;

    public final l a() {
        return this.f21135a;
    }

    public final l b() {
        return this.f21136b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.f.b(this.f21135a, mVar.f21135a) && kotlin.jvm.internal.f.b(this.f21136b, mVar.f21136b);
    }

    public final int hashCode() {
        l lVar = this.f21135a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f21136b;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ProviderRequisitesRaw(fps=" + this.f21135a + ", iban=" + this.f21136b + ")";
    }
}
