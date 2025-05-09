package r4;

/* compiled from: RegisterRequestRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("first_name")
    private final String f26244a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("last_name")
    private final String f26245b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("email")
    private final String f26246c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("phone_area_code")
    private final String f26247d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("phone")
    private final String f26248e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("password")
    private final String f26249f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("birthday")
    private final Long f26250g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("terms_conditions_agreed")
    private final Boolean f26251h;

    @l3.b("country")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("city")
    private final String f26252j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("house")
    private final String f26253k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("postcode")
    private final String f26254l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("region")
    private final String f26255m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("street")
    private final String f26256n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("link_to_cv_linkedin")
    private final String f26257o;

    public e(String str, String str2, String str3, String str4, String str5, String str6, Long l10, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f26244a = str;
        this.f26245b = str2;
        this.f26246c = str3;
        this.f26247d = str4;
        this.f26248e = str5;
        this.f26249f = str6;
        this.f26250g = l10;
        this.f26251h = bool;
        this.i = str7;
        this.f26252j = str8;
        this.f26253k = str9;
        this.f26254l = str10;
        this.f26255m = str11;
        this.f26256n = str12;
        this.f26257o = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f26244a, eVar.f26244a) && kotlin.jvm.internal.f.b(this.f26245b, eVar.f26245b) && kotlin.jvm.internal.f.b(this.f26246c, eVar.f26246c) && kotlin.jvm.internal.f.b(this.f26247d, eVar.f26247d) && kotlin.jvm.internal.f.b(this.f26248e, eVar.f26248e) && kotlin.jvm.internal.f.b(this.f26249f, eVar.f26249f) && kotlin.jvm.internal.f.b(this.f26250g, eVar.f26250g) && kotlin.jvm.internal.f.b(this.f26251h, eVar.f26251h) && kotlin.jvm.internal.f.b(this.i, eVar.i) && kotlin.jvm.internal.f.b(this.f26252j, eVar.f26252j) && kotlin.jvm.internal.f.b(this.f26253k, eVar.f26253k) && kotlin.jvm.internal.f.b(this.f26254l, eVar.f26254l) && kotlin.jvm.internal.f.b(this.f26255m, eVar.f26255m) && kotlin.jvm.internal.f.b(this.f26256n, eVar.f26256n) && kotlin.jvm.internal.f.b(this.f26257o, eVar.f26257o);
    }

    public final int hashCode() {
        String str = this.f26244a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26245b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26246c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26247d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26248e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26249f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l10 = this.f26250g;
        int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.f26251h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f26252j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f26253k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f26254l;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f26255m;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f26256n;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f26257o;
        return hashCode14 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f26244a;
        String str2 = this.f26245b;
        String str3 = this.f26246c;
        String str4 = this.f26247d;
        String str5 = this.f26248e;
        String str6 = this.f26249f;
        Long l10 = this.f26250g;
        Boolean bool = this.f26251h;
        String str7 = this.i;
        String str8 = this.f26252j;
        String str9 = this.f26253k;
        String str10 = this.f26254l;
        String str11 = this.f26255m;
        String str12 = this.f26256n;
        String str13 = this.f26257o;
        StringBuilder p10 = s3.b.p("RegisterRequestRaw(firstName=", str, ", lastName=", str2, ", email=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", phoneAreaCode=", str4, ", phone=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", password=", str6, ", birthday=");
        p10.append(l10);
        p10.append(", tos=");
        p10.append(bool);
        p10.append(", country=");
        androidx.camera.core.impl.utils.a.u(p10, str7, ", city=", str8, ", house=");
        androidx.camera.core.impl.utils.a.u(p10, str9, ", postcode=", str10, ", region=");
        androidx.camera.core.impl.utils.a.u(p10, str11, ", street=", str12, ", linkToCvLinkedIn=");
        return androidx.camera.core.impl.utils.a.n(p10, str13, ")");
    }
}
