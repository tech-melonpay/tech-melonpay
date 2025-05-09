package h4;

import C.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e4.C0715a;
import java.util.List;

/* compiled from: AccountRaw.kt */
/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0796a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f21043b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("clientType")
    private final Integer f21044c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("clientName")
    private final String f21045d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("createdAt")
    private final String f21046e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("iban")
    private final String f21047f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("beneficiaryType")
    private final Integer f21048g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("metadata")
    private final g f21049h;

    @l3.b("providerCurrency")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("external")
    private final Boolean f21050j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("providerRequisites")
    private final m f21051k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("number")
    private final String f21052l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("type")
    private final Integer f21053m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("cards")
    private final List<d> f21054n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("status")
    private final Integer f21055o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("primary")
    private final Boolean f21056p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("providerNumber")
    private final String f21057q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("dormant")
    private final Boolean f21058r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("balances")
    private final List<c> f21059s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("prohibitedOperations")
    private final k f21060t;

    public final List<c> b() {
        return this.f21059s;
    }

    public final Integer c() {
        return this.f21048g;
    }

    public final List<d> d() {
        return this.f21054n;
    }

    public final String e() {
        return this.f21045d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0796a)) {
            return false;
        }
        C0796a c0796a = (C0796a) obj;
        return kotlin.jvm.internal.f.b(this.f21043b, c0796a.f21043b) && kotlin.jvm.internal.f.b(this.f21044c, c0796a.f21044c) && kotlin.jvm.internal.f.b(this.f21045d, c0796a.f21045d) && kotlin.jvm.internal.f.b(this.f21046e, c0796a.f21046e) && kotlin.jvm.internal.f.b(this.f21047f, c0796a.f21047f) && kotlin.jvm.internal.f.b(this.f21048g, c0796a.f21048g) && kotlin.jvm.internal.f.b(this.f21049h, c0796a.f21049h) && kotlin.jvm.internal.f.b(this.i, c0796a.i) && kotlin.jvm.internal.f.b(this.f21050j, c0796a.f21050j) && kotlin.jvm.internal.f.b(this.f21051k, c0796a.f21051k) && kotlin.jvm.internal.f.b(this.f21052l, c0796a.f21052l) && kotlin.jvm.internal.f.b(this.f21053m, c0796a.f21053m) && kotlin.jvm.internal.f.b(this.f21054n, c0796a.f21054n) && kotlin.jvm.internal.f.b(this.f21055o, c0796a.f21055o) && kotlin.jvm.internal.f.b(this.f21056p, c0796a.f21056p) && kotlin.jvm.internal.f.b(this.f21057q, c0796a.f21057q) && kotlin.jvm.internal.f.b(this.f21058r, c0796a.f21058r) && kotlin.jvm.internal.f.b(this.f21059s, c0796a.f21059s) && kotlin.jvm.internal.f.b(this.f21060t, c0796a.f21060t);
    }

    public final Integer f() {
        return this.f21044c;
    }

    public final String g() {
        return this.f21046e;
    }

    public final Boolean h() {
        return this.f21058r;
    }

    public final int hashCode() {
        String str = this.f21043b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f21044c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f21045d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21046e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21047f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f21048g;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        g gVar = this.f21049h;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f21050j;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        m mVar = this.f21051k;
        int hashCode10 = (hashCode9 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str6 = this.f21052l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f21053m;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<d> list = this.f21054n;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num4 = this.f21055o;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.f21056p;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f21057q;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.f21058r;
        int f10 = v.f(this.f21059s, (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31);
        k kVar = this.f21060t;
        return f10 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f21050j;
    }

    public final String j() {
        return this.f21047f;
    }

    public final g k() {
        return this.f21049h;
    }

    public final String l() {
        return this.f21043b;
    }

    public final String m() {
        return this.f21052l;
    }

    public final Boolean n() {
        return this.f21056p;
    }

    public final k o() {
        return this.f21060t;
    }

    public final String p() {
        return this.i;
    }

    public final String q() {
        return this.f21057q;
    }

    public final m r() {
        return this.f21051k;
    }

    public final Integer s() {
        return this.f21055o;
    }

    public final Integer t() {
        return this.f21053m;
    }

    public final String toString() {
        String str = this.f21043b;
        Integer num = this.f21044c;
        String str2 = this.f21045d;
        String str3 = this.f21046e;
        String str4 = this.f21047f;
        Integer num2 = this.f21048g;
        g gVar = this.f21049h;
        String str5 = this.i;
        Boolean bool = this.f21050j;
        m mVar = this.f21051k;
        String str6 = this.f21052l;
        Integer num3 = this.f21053m;
        List<d> list = this.f21054n;
        Integer num4 = this.f21055o;
        Boolean bool2 = this.f21056p;
        String str7 = this.f21057q;
        Boolean bool3 = this.f21058r;
        List<c> list2 = this.f21059s;
        k kVar = this.f21060t;
        StringBuilder sb2 = new StringBuilder("AccountRaw(name=");
        sb2.append(str);
        sb2.append(", clientType=");
        sb2.append(num);
        sb2.append(", clientName=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", createdAt=", str3, ", iban=");
        sb2.append(str4);
        sb2.append(", beneficiaryType=");
        sb2.append(num2);
        sb2.append(", metadata=");
        sb2.append(gVar);
        sb2.append(", providerCurrency=");
        sb2.append(str5);
        sb2.append(", external=");
        sb2.append(bool);
        sb2.append(", providerRequisites=");
        sb2.append(mVar);
        sb2.append(", number=");
        sb2.append(str6);
        sb2.append(", type=");
        sb2.append(num3);
        sb2.append(", cards=");
        sb2.append(list);
        sb2.append(", status=");
        sb2.append(num4);
        sb2.append(", primary=");
        sb2.append(bool2);
        sb2.append(", providerNumber=");
        sb2.append(str7);
        sb2.append(", dormant=");
        sb2.append(bool3);
        sb2.append(", balances=");
        sb2.append(list2);
        sb2.append(", prohibitedOperations=");
        sb2.append(kVar);
        sb2.append(")");
        return sb2.toString();
    }
}
