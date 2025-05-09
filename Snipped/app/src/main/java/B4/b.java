package b4;

import C.v;

/* compiled from: CardAndVaultRequest.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("card_program_id")
    private final int f8318a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("bank_account_id")
    private final int f8319b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("phone")
    private final String f8320c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("email")
    private final String f8321d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("password")
    private final String f8322e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("vault_pretty_name")
    private final String f8323f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("card_pretty_name")
    private final String f8324g;

    public b(int i, int i9, String str, String str2, String str3, String str4, String str5) {
        this.f8318a = i;
        this.f8319b = i9;
        this.f8320c = str;
        this.f8321d = str2;
        this.f8322e = str3;
        this.f8323f = str4;
        this.f8324g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8318a == bVar.f8318a && this.f8319b == bVar.f8319b && kotlin.jvm.internal.f.b(this.f8320c, bVar.f8320c) && kotlin.jvm.internal.f.b(this.f8321d, bVar.f8321d) && kotlin.jvm.internal.f.b(this.f8322e, bVar.f8322e) && kotlin.jvm.internal.f.b(this.f8323f, bVar.f8323f) && kotlin.jvm.internal.f.b(this.f8324g, bVar.f8324g);
    }

    public final int hashCode() {
        return this.f8324g.hashCode() + v.c(v.c(v.c(v.c(v.b(this.f8319b, Integer.hashCode(this.f8318a) * 31, 31), 31, this.f8320c), 31, this.f8321d), 31, this.f8322e), 31, this.f8323f);
    }

    public final String toString() {
        int i = this.f8318a;
        int i9 = this.f8319b;
        String str = this.f8320c;
        String str2 = this.f8321d;
        String str3 = this.f8322e;
        String str4 = this.f8323f;
        String str5 = this.f8324g;
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "CardAndVaultRequest(cardProgramId=", ", bankAccountId=", ", phone=");
        androidx.camera.core.impl.utils.a.u(q10, str, ", email=", str2, ", password=");
        androidx.camera.core.impl.utils.a.u(q10, str3, ", vaultPrettyName=", str4, ", cardPrettyName=");
        return androidx.camera.core.impl.utils.a.n(q10, str5, ")");
    }
}
