package t5;

/* compiled from: CardCreateCommissionRequestDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27526b;

    public b(int i, int i9) {
        this.f27525a = i;
        this.f27526b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27525a == bVar.f27525a && this.f27526b == bVar.f27526b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27526b) + (Integer.hashCode(this.f27525a) * 31);
    }

    public final String toString() {
        return "CardCreateCommissionRequestDomain(cardProgramId=" + this.f27525a + ", bankAccountId=" + this.f27526b + ")";
    }
}
