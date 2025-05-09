package u5;

/* compiled from: CountryDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f30274a;

    /* renamed from: b, reason: collision with root package name */
    public String f30275b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30276c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30277d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30278e;

    /* renamed from: f, reason: collision with root package name */
    public String f30279f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30280g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30281h;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f30274a = str;
        this.f30275b = str2;
        this.f30276c = str3;
        this.f30277d = str4;
        this.f30278e = str5;
        this.f30279f = str6;
        this.f30280g = str7;
        this.f30281h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f30274a, fVar.f30274a) && kotlin.jvm.internal.f.b(this.f30275b, fVar.f30275b) && kotlin.jvm.internal.f.b(this.f30276c, fVar.f30276c) && kotlin.jvm.internal.f.b(this.f30277d, fVar.f30277d) && kotlin.jvm.internal.f.b(this.f30278e, fVar.f30278e) && kotlin.jvm.internal.f.b(this.f30279f, fVar.f30279f) && kotlin.jvm.internal.f.b(this.f30280g, fVar.f30280g) && kotlin.jvm.internal.f.b(this.f30281h, fVar.f30281h);
    }

    public final int hashCode() {
        String str = this.f30274a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30275b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30276c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30277d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30278e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30279f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f30280g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30281h;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30275b;
        String str2 = this.f30279f;
        StringBuilder sb2 = new StringBuilder("CountryDomain(countryName=");
        androidx.camera.core.impl.utils.a.u(sb2, this.f30274a, ", name=", str, ", country=");
        sb2.append(this.f30276c);
        sb2.append(", prettyName=");
        sb2.append(this.f30277d);
        sb2.append(", localizedName=");
        androidx.camera.core.impl.utils.a.u(sb2, this.f30278e, ", countryCode=", str2, ", phoneCode=");
        sb2.append(this.f30280g);
        sb2.append(", alpha3=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30281h, ")");
    }
}
