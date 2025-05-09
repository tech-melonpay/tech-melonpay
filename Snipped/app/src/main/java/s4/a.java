package s4;

import kotlin.jvm.internal.f;

/* compiled from: SecurityInfoResponseRaw.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("type")
    private String f26524a = null;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("language_code")
    private String f26525b = null;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("password")
    private String f26526c = null;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("email")
    private String f26527d = null;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("out_of_band_enabled")
    private Boolean f26528e = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f26524a, aVar.f26524a) && f.b(this.f26525b, aVar.f26525b) && f.b(this.f26526c, aVar.f26526c) && f.b(this.f26527d, aVar.f26527d) && f.b(this.f26528e, aVar.f26528e);
    }

    public final int hashCode() {
        String str = this.f26524a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26525b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26526c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26527d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f26528e;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f26524a;
        String str2 = this.f26525b;
        String str3 = this.f26526c;
        String str4 = this.f26527d;
        Boolean bool = this.f26528e;
        StringBuilder p10 = s3.b.p("SecureSettings(type=", str, ", languageCode=", str2, ", password=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", email=", str4, ", outOfBandEnabled=");
        p10.append(bool);
        p10.append(")");
        return p10.toString();
    }
}
