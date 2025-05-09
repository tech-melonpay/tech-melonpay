package b4;

/* compiled from: CardCreateCommissionRequestRow.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("card_program_id")
    private final int f8325a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("bank_account_id")
    private final int f8326b;

    public c(int i, int i9) {
        this.f8325a = i;
        this.f8326b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8325a == cVar.f8325a && this.f8326b == cVar.f8326b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8326b) + (Integer.hashCode(this.f8325a) * 31);
    }

    public final String toString() {
        return "CardCreateCommissionRequestRow(cardProgramId=" + this.f8325a + ", bankAccountId=" + this.f8326b + ")";
    }
}
