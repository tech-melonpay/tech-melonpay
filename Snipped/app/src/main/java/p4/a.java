package p4;

import e4.C0715a;

/* compiled from: CommissionsRaw.kt */
/* loaded from: classes.dex */
public final class a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("owner")
    private final String f25617b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("sender_fee")
    private final String f25618c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("sender_clearing_policy")
    private final String f25619d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("receiver_fee")
    private final String f25620e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("receiver_clearing_policy")
    private final String f25621f;

    public final String b() {
        return this.f25617b;
    }

    public final String c() {
        return this.f25621f;
    }

    public final String d() {
        return this.f25620e;
    }

    public final String e() {
        return this.f25619d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.f.b(this.f25617b, aVar.f25617b) && kotlin.jvm.internal.f.b(this.f25618c, aVar.f25618c) && kotlin.jvm.internal.f.b(this.f25619d, aVar.f25619d) && kotlin.jvm.internal.f.b(this.f25620e, aVar.f25620e) && kotlin.jvm.internal.f.b(this.f25621f, aVar.f25621f);
    }

    public final String f() {
        return this.f25618c;
    }

    public final int hashCode() {
        String str = this.f25617b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25618c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25619d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25620e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25621f;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f25617b;
        String str2 = this.f25618c;
        String str3 = this.f25619d;
        String str4 = this.f25620e;
        String str5 = this.f25621f;
        StringBuilder p10 = s3.b.p("CommissionsRaw(owner=", str, ", senderFee=", str2, ", senderClearingPolicy=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", receiverFee=", str4, ", receiverClearingPolicy=");
        return androidx.camera.core.impl.utils.a.n(p10, str5, ")");
    }
}
