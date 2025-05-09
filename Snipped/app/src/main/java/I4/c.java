package i4;

import e4.C0715a;

/* compiled from: CountryRaw.kt */
/* loaded from: classes.dex */
public final class c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("CountryName")
    private final String f21435b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("Name")
    private final String f21436c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("Country")
    private final String f21437d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("PrettyName")
    private final String f21438e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("LocalizedName")
    private final String f21439f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("CountryCode")
    private final String f21440g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("PhoneCode")
    private final String f21441h;

    @l3.b("alpha_3")
    private final String i;

    public final String b() {
        return this.i;
    }

    public final String c() {
        return this.f21437d;
    }

    public final String d() {
        return this.f21440g;
    }

    public final String e() {
        return this.f21435b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f21435b, cVar.f21435b) && kotlin.jvm.internal.f.b(this.f21436c, cVar.f21436c) && kotlin.jvm.internal.f.b(this.f21437d, cVar.f21437d) && kotlin.jvm.internal.f.b(this.f21438e, cVar.f21438e) && kotlin.jvm.internal.f.b(this.f21439f, cVar.f21439f) && kotlin.jvm.internal.f.b(this.f21440g, cVar.f21440g) && kotlin.jvm.internal.f.b(this.f21441h, cVar.f21441h) && kotlin.jvm.internal.f.b(this.i, cVar.i);
    }

    public final String f() {
        return this.f21439f;
    }

    public final String g() {
        return this.f21436c;
    }

    public final String h() {
        return this.f21441h;
    }

    public final int hashCode() {
        String str = this.f21435b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21436c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21437d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21438e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21439f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21440g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21441h;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String i() {
        return this.f21438e;
    }

    public final String toString() {
        String str = this.f21435b;
        String str2 = this.f21436c;
        String str3 = this.f21437d;
        String str4 = this.f21438e;
        String str5 = this.f21439f;
        String str6 = this.f21440g;
        String str7 = this.f21441h;
        String str8 = this.i;
        StringBuilder p10 = s3.b.p("CountryRaw(countryName=", str, ", name=", str2, ", country=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", prettyName=", str4, ", localizedName=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", countryCode=", str6, ", phoneCode=");
        return s3.b.o(p10, str7, ", alpha3=", str8, ")");
    }
}
