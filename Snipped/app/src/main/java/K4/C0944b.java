package k4;

import e4.C0715a;

/* compiled from: CryptowalletRaw.kt */
/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Long f22942b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Long f22943c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("address")
    private final String f22944d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f22945e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("status")
    private final String f22946f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("network")
    private final String f22947g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("token")
    private final String f22948h;

    @l3.b("comments")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("verification_tx_id")
    private final String f22949j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("verification_tx_amount")
    private final String f22950k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("verification_tx_address")
    private final String f22951l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("return_tx_id")
    private final String f22952m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("reputation_check_result")
    private final String f22953n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("created_at")
    private final String f22954o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("updated_at")
    private final String f22955p;

    public final String b() {
        return this.f22944d;
    }

    public final Long c() {
        return this.f22943c;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.f22954o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0944b)) {
            return false;
        }
        C0944b c0944b = (C0944b) obj;
        return kotlin.jvm.internal.f.b(this.f22942b, c0944b.f22942b) && kotlin.jvm.internal.f.b(this.f22943c, c0944b.f22943c) && kotlin.jvm.internal.f.b(this.f22944d, c0944b.f22944d) && kotlin.jvm.internal.f.b(this.f22945e, c0944b.f22945e) && kotlin.jvm.internal.f.b(this.f22946f, c0944b.f22946f) && kotlin.jvm.internal.f.b(this.f22947g, c0944b.f22947g) && kotlin.jvm.internal.f.b(this.f22948h, c0944b.f22948h) && kotlin.jvm.internal.f.b(this.i, c0944b.i) && kotlin.jvm.internal.f.b(this.f22949j, c0944b.f22949j) && kotlin.jvm.internal.f.b(this.f22950k, c0944b.f22950k) && kotlin.jvm.internal.f.b(this.f22951l, c0944b.f22951l) && kotlin.jvm.internal.f.b(this.f22952m, c0944b.f22952m) && kotlin.jvm.internal.f.b(this.f22953n, c0944b.f22953n) && kotlin.jvm.internal.f.b(this.f22954o, c0944b.f22954o) && kotlin.jvm.internal.f.b(this.f22955p, c0944b.f22955p);
    }

    public final Long f() {
        return this.f22942b;
    }

    public final String g() {
        return this.f22947g;
    }

    public final String h() {
        return this.f22945e;
    }

    public final int hashCode() {
        Long l10 = this.f22942b;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f22943c;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f22944d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22945e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22946f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22947g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22948h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f22949j;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f22950k;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f22951l;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f22952m;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f22953n;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f22954o;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f22955p;
        return hashCode14 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String i() {
        return this.f22953n;
    }

    public final String j() {
        return this.f22952m;
    }

    public final String k() {
        return this.f22946f;
    }

    public final String l() {
        return this.f22948h;
    }

    public final String m() {
        return this.f22955p;
    }

    public final String n() {
        return this.f22951l;
    }

    public final String o() {
        return this.f22950k;
    }

    public final String p() {
        return this.f22949j;
    }

    public final String toString() {
        Long l10 = this.f22942b;
        Long l11 = this.f22943c;
        String str = this.f22944d;
        String str2 = this.f22945e;
        String str3 = this.f22946f;
        String str4 = this.f22947g;
        String str5 = this.f22948h;
        String str6 = this.i;
        String str7 = this.f22949j;
        String str8 = this.f22950k;
        String str9 = this.f22951l;
        String str10 = this.f22952m;
        String str11 = this.f22953n;
        String str12 = this.f22954o;
        String str13 = this.f22955p;
        StringBuilder sb2 = new StringBuilder("CryptowalletRaw(id=");
        sb2.append(l10);
        sb2.append(", clientId=");
        sb2.append(l11);
        sb2.append(", address=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", prettyName=", str2, ", status=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", network=", str4, ", token=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", comments=", str6, ", verificationTxId=");
        androidx.camera.core.impl.utils.a.u(sb2, str7, ", verificationTxAmount=", str8, ", verificationTxAddress=");
        androidx.camera.core.impl.utils.a.u(sb2, str9, ", returnTxId=", str10, ", reputationCheckResult=");
        androidx.camera.core.impl.utils.a.u(sb2, str11, ", createdAt=", str12, ", updatedAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, str13, ")");
    }
}
