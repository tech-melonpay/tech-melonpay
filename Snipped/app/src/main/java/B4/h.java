package b4;

import C.v;

/* compiled from: VaultTopUpRequestRaw.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("from_card_account_id")
    private final int f8336a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_card_account_id")
    private final int f8337b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("amount")
    private final double f8338c;

    public h(int i, int i9, double d10) {
        this.f8336a = i;
        this.f8337b = i9;
        this.f8338c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8336a == hVar.f8336a && this.f8337b == hVar.f8337b && Double.compare(this.f8338c, hVar.f8338c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8338c) + v.b(this.f8337b, Integer.hashCode(this.f8336a) * 31, 31);
    }

    public final String toString() {
        int i = this.f8336a;
        int i9 = this.f8337b;
        double d10 = this.f8338c;
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "VaultTopUpRequestRaw(fromCardAccountId=", ", toCardAccountId=", ", amount=");
        q10.append(d10);
        q10.append(")");
        return q10.toString();
    }
}
