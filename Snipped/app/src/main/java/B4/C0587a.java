package b4;

import C.v;

/* compiled from: BankTopUpRequestRaw.kt */
/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("from_bank_account_id")
    private final int f8315a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_card_account_id")
    private final int f8316b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("amount")
    private final double f8317c;

    public C0587a(int i, int i9, double d10) {
        this.f8315a = i;
        this.f8316b = i9;
        this.f8317c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0587a)) {
            return false;
        }
        C0587a c0587a = (C0587a) obj;
        return this.f8315a == c0587a.f8315a && this.f8316b == c0587a.f8316b && Double.compare(this.f8317c, c0587a.f8317c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8317c) + v.b(this.f8316b, Integer.hashCode(this.f8315a) * 31, 31);
    }

    public final String toString() {
        int i = this.f8315a;
        int i9 = this.f8316b;
        double d10 = this.f8317c;
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "BankTopUpRequestRaw(fromBankAccountId=", ", toCardAccountId=", ", amount=");
        q10.append(d10);
        q10.append(")");
        return q10.toString();
    }
}
