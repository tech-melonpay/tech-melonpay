package f4;

import e4.C0715a;

/* compiled from: KYCTokenRaw.kt */
/* loaded from: classes.dex */
public final class g extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("token")
    private final String f20683b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("applicant_id")
    private final String f20684c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("application_id")
    private final String f20685d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("referrer")
    private final String f20686e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("cross_device_url")
    private final String f20687f;

    public final String b() {
        return this.f20684c;
    }

    public final String c() {
        return this.f20685d;
    }

    public final String d() {
        return this.f20687f;
    }

    public final String e() {
        return this.f20686e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f20683b, gVar.f20683b) && kotlin.jvm.internal.f.b(this.f20684c, gVar.f20684c) && kotlin.jvm.internal.f.b(this.f20685d, gVar.f20685d) && kotlin.jvm.internal.f.b(this.f20686e, gVar.f20686e) && kotlin.jvm.internal.f.b(this.f20687f, gVar.f20687f);
    }

    public final String f() {
        return this.f20683b;
    }

    public final int hashCode() {
        String str = this.f20683b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20684c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20685d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20686e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20687f;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f20683b;
        String str2 = this.f20684c;
        String str3 = this.f20685d;
        String str4 = this.f20686e;
        String str5 = this.f20687f;
        StringBuilder p10 = s3.b.p("KYCTokenRaw(token=", str, ", applicantId=", str2, ", applicationId=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", referrer=", str4, ", crossDeviceUrl=");
        return androidx.camera.core.impl.utils.a.n(p10, str5, ")");
    }
}
