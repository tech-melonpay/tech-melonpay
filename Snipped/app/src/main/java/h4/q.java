package h4;

import C.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import f4.C0744a;

/* compiled from: VaultRaw.kt */
/* loaded from: classes.dex */
public final class q extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final int f21168b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final int f21169c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("client_name")
    private final String f21170d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f21171e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f21172f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("asset_type")
    private final String f21173g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("balance")
    private final String f21174h;

    @l3.b("balance_available")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("balance_blocked")
    private final String f21175j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("number")
    private final String f21176k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("iban")
    private final String f21177l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("bic_swift")
    private final String f21178m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("provider_requisites")
    private final C0744a.C0398a f21179n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("text_line1")
    private final String f21180o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("text_line2")
    private final String f21181p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("cards_count")
    private final String f21182q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("card_program_id")
    private final Integer f21183r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("account_reference")
    private final String f21184s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("topup_account_id")
    private final String f21185t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("topup_account_pname")
    private final String f21186u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("status")
    private final String f21187v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("is_default")
    private final Boolean f21188w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("created_at")
    private final String f21189x;

    public final String b() {
        return this.f21184s;
    }

    public final String c() {
        return this.f21173g;
    }

    public final String d() {
        return this.f21174h;
    }

    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f21168b == qVar.f21168b && this.f21169c == qVar.f21169c && kotlin.jvm.internal.f.b(this.f21170d, qVar.f21170d) && kotlin.jvm.internal.f.b(this.f21171e, qVar.f21171e) && kotlin.jvm.internal.f.b(this.f21172f, qVar.f21172f) && kotlin.jvm.internal.f.b(this.f21173g, qVar.f21173g) && kotlin.jvm.internal.f.b(this.f21174h, qVar.f21174h) && kotlin.jvm.internal.f.b(this.i, qVar.i) && kotlin.jvm.internal.f.b(this.f21175j, qVar.f21175j) && kotlin.jvm.internal.f.b(this.f21176k, qVar.f21176k) && kotlin.jvm.internal.f.b(this.f21177l, qVar.f21177l) && kotlin.jvm.internal.f.b(this.f21178m, qVar.f21178m) && kotlin.jvm.internal.f.b(this.f21179n, qVar.f21179n) && kotlin.jvm.internal.f.b(this.f21180o, qVar.f21180o) && kotlin.jvm.internal.f.b(this.f21181p, qVar.f21181p) && kotlin.jvm.internal.f.b(this.f21182q, qVar.f21182q) && kotlin.jvm.internal.f.b(this.f21183r, qVar.f21183r) && kotlin.jvm.internal.f.b(this.f21184s, qVar.f21184s) && kotlin.jvm.internal.f.b(this.f21185t, qVar.f21185t) && kotlin.jvm.internal.f.b(this.f21186u, qVar.f21186u) && kotlin.jvm.internal.f.b(this.f21187v, qVar.f21187v) && kotlin.jvm.internal.f.b(this.f21188w, qVar.f21188w) && kotlin.jvm.internal.f.b(this.f21189x, qVar.f21189x);
    }

    public final String f() {
        return this.f21175j;
    }

    public final String g() {
        return this.f21178m;
    }

    public final Integer h() {
        return this.f21183r;
    }

    public final int hashCode() {
        int b9 = v.b(this.f21169c, Integer.hashCode(this.f21168b) * 31, 31);
        String str = this.f21170d;
        int hashCode = (b9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21171e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21172f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21173g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21174h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21175j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f21176k;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f21177l;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f21178m;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        C0744a.C0398a c0398a = this.f21179n;
        int hashCode11 = (hashCode10 + (c0398a == null ? 0 : c0398a.hashCode())) * 31;
        String str11 = this.f21180o;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f21181p;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f21182q;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.f21183r;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.f21184s;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f21185t;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f21186u;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f21187v;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool = this.f21188w;
        int hashCode20 = (hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str18 = this.f21189x;
        return hashCode20 + (str18 != null ? str18.hashCode() : 0);
    }

    public final String i() {
        return this.f21182q;
    }

    public final String j() {
        return this.f21170d;
    }

    public final int k() {
        return this.f21169c;
    }

    public final String l() {
        return this.f21189x;
    }

    public final String m() {
        return this.f21172f;
    }

    public final String n() {
        return this.f21177l;
    }

    public final int o() {
        return this.f21168b;
    }

    public final String p() {
        return this.f21176k;
    }

    public final String q() {
        return this.f21171e;
    }

    public final C0744a.C0398a r() {
        return this.f21179n;
    }

    public final String s() {
        return this.f21187v;
    }

    public final String t() {
        return this.f21180o;
    }

    public final String toString() {
        int i = this.f21168b;
        int i9 = this.f21169c;
        String str = this.f21170d;
        String str2 = this.f21171e;
        String str3 = this.f21172f;
        String str4 = this.f21173g;
        String str5 = this.f21174h;
        String str6 = this.i;
        String str7 = this.f21175j;
        String str8 = this.f21176k;
        String str9 = this.f21177l;
        String str10 = this.f21178m;
        C0744a.C0398a c0398a = this.f21179n;
        String str11 = this.f21180o;
        String str12 = this.f21181p;
        String str13 = this.f21182q;
        Integer num = this.f21183r;
        String str14 = this.f21184s;
        String str15 = this.f21185t;
        String str16 = this.f21186u;
        String str17 = this.f21187v;
        Boolean bool = this.f21188w;
        String str18 = this.f21189x;
        StringBuilder q10 = androidx.camera.core.impl.utils.a.q(i, i9, "VaultRaw(id=", ", clientid=", ", clientName=");
        androidx.camera.core.impl.utils.a.u(q10, str, ", prettyName=", str2, ", currency=");
        androidx.camera.core.impl.utils.a.u(q10, str3, ", assetType=", str4, ", balance=");
        androidx.camera.core.impl.utils.a.u(q10, str5, ", balanceAvailable=", str6, ", balanceBlocked=");
        androidx.camera.core.impl.utils.a.u(q10, str7, ", number=", str8, ", iban=");
        androidx.camera.core.impl.utils.a.u(q10, str9, ", bicSwift=", str10, ", providerRequisites=");
        q10.append(c0398a);
        q10.append(", textLine1=");
        q10.append(str11);
        q10.append(", textLine2=");
        androidx.camera.core.impl.utils.a.u(q10, str12, ", cardsCount=", str13, ", cardProgramId=");
        q10.append(num);
        q10.append(", accountReference=");
        q10.append(str14);
        q10.append(", topUpAccountId=");
        androidx.camera.core.impl.utils.a.u(q10, str15, ", topupAccountPname=", str16, ", status=");
        q10.append(str17);
        q10.append(", isDefault=");
        q10.append(bool);
        q10.append(", createdAt=");
        return androidx.camera.core.impl.utils.a.n(q10, str18, ")");
    }

    public final String u() {
        return this.f21181p;
    }

    public final String v() {
        return this.f21185t;
    }

    public final String w() {
        return this.f21186u;
    }

    public final Boolean x() {
        return this.f21188w;
    }
}
