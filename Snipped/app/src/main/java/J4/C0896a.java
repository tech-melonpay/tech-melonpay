package j4;

import e4.C0715a;
import kotlin.jvm.internal.f;
import l3.b;

/* compiled from: CryptoAccountRaw.kt */
/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @b("id")
    private final Long f22506b;

    /* renamed from: c, reason: collision with root package name */
    @b("client_id")
    private final Long f22507c;

    /* renamed from: d, reason: collision with root package name */
    @b("address")
    private final String f22508d;

    /* renamed from: e, reason: collision with root package name */
    @b("pretty_name")
    private final String f22509e;

    /* renamed from: f, reason: collision with root package name */
    @b("status")
    private final String f22510f;

    /* renamed from: g, reason: collision with root package name */
    @b("network")
    private final String f22511g;

    /* renamed from: h, reason: collision with root package name */
    @b("token")
    private final String f22512h;

    @b("comments")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @b("verification_tx_id")
    private final String f22513j;

    /* renamed from: k, reason: collision with root package name */
    @b("verification_tx_amount")
    private final String f22514k;

    /* renamed from: l, reason: collision with root package name */
    @b("verification_tx_address")
    private final String f22515l;

    /* renamed from: m, reason: collision with root package name */
    @b("return_tx_id")
    private final String f22516m;

    /* renamed from: n, reason: collision with root package name */
    @b("reputation_check_result")
    private final String f22517n;

    /* renamed from: o, reason: collision with root package name */
    @b("created_at")
    private final String f22518o;

    /* renamed from: p, reason: collision with root package name */
    @b("updated_at")
    private final String f22519p;

    /* renamed from: q, reason: collision with root package name */
    @b("balance")
    private final Double f22520q;

    public final String b() {
        return this.f22508d;
    }

    public final Double c() {
        return this.f22520q;
    }

    public final Long d() {
        return this.f22507c;
    }

    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0896a)) {
            return false;
        }
        C0896a c0896a = (C0896a) obj;
        return f.b(this.f22506b, c0896a.f22506b) && f.b(this.f22507c, c0896a.f22507c) && f.b(this.f22508d, c0896a.f22508d) && f.b(this.f22509e, c0896a.f22509e) && f.b(this.f22510f, c0896a.f22510f) && f.b(this.f22511g, c0896a.f22511g) && f.b(this.f22512h, c0896a.f22512h) && f.b(this.i, c0896a.i) && f.b(this.f22513j, c0896a.f22513j) && f.b(this.f22514k, c0896a.f22514k) && f.b(this.f22515l, c0896a.f22515l) && f.b(this.f22516m, c0896a.f22516m) && f.b(this.f22517n, c0896a.f22517n) && f.b(this.f22518o, c0896a.f22518o) && f.b(this.f22519p, c0896a.f22519p) && f.b(this.f22520q, c0896a.f22520q);
    }

    public final String f() {
        return this.f22518o;
    }

    public final Long g() {
        return this.f22506b;
    }

    public final String h() {
        return this.f22511g;
    }

    public final int hashCode() {
        Long l10 = this.f22506b;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f22507c;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f22508d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22509e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22510f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22511g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22512h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f22513j;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f22514k;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f22515l;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f22516m;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f22517n;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f22518o;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f22519p;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Double d10 = this.f22520q;
        return hashCode15 + (d10 != null ? d10.hashCode() : 0);
    }

    public final String i() {
        return this.f22509e;
    }

    public final String j() {
        return this.f22517n;
    }

    public final String k() {
        return this.f22516m;
    }

    public final String l() {
        return this.f22510f;
    }

    public final String m() {
        return this.f22512h;
    }

    public final String n() {
        return this.f22519p;
    }

    public final String o() {
        return this.f22515l;
    }

    public final String p() {
        return this.f22514k;
    }

    public final String q() {
        return this.f22513j;
    }

    public final String toString() {
        Long l10 = this.f22506b;
        Long l11 = this.f22507c;
        String str = this.f22508d;
        String str2 = this.f22509e;
        String str3 = this.f22510f;
        String str4 = this.f22511g;
        String str5 = this.f22512h;
        String str6 = this.i;
        String str7 = this.f22513j;
        String str8 = this.f22514k;
        String str9 = this.f22515l;
        String str10 = this.f22516m;
        String str11 = this.f22517n;
        String str12 = this.f22518o;
        String str13 = this.f22519p;
        Double d10 = this.f22520q;
        StringBuilder sb2 = new StringBuilder("CryptoAccountRaw(id=");
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
        sb2.append(str13);
        sb2.append(", balance=");
        sb2.append(d10);
        sb2.append(")");
        return sb2.toString();
    }
}
