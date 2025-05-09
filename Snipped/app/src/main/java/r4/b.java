package r4;

import e4.C0715a;

/* compiled from: ProxyTokenRaw.kt */
/* loaded from: classes.dex */
public final class b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("access_token")
    private final String f26177b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("token_type")
    private final String f26178c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("expires_in")
    private final Long f26179d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("client_id")
    private final Long f26180e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("is_superuser")
    private final Boolean f26181f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("trust_level")
    private final String f26182g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("kyc_state")
    private final String f26183h;

    @l3.b("role")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("refresh_token")
    private final String f26184j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("session_id")
    private final String f26185k;

    public final String b() {
        return this.f26177b;
    }

    public final Long c() {
        return this.f26180e;
    }

    public final Long d() {
        return this.f26179d;
    }

    public final String e() {
        return this.f26183h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f26177b, bVar.f26177b) && kotlin.jvm.internal.f.b(this.f26178c, bVar.f26178c) && kotlin.jvm.internal.f.b(this.f26179d, bVar.f26179d) && kotlin.jvm.internal.f.b(this.f26180e, bVar.f26180e) && kotlin.jvm.internal.f.b(this.f26181f, bVar.f26181f) && kotlin.jvm.internal.f.b(this.f26182g, bVar.f26182g) && kotlin.jvm.internal.f.b(this.f26183h, bVar.f26183h) && kotlin.jvm.internal.f.b(this.i, bVar.i) && kotlin.jvm.internal.f.b(this.f26184j, bVar.f26184j) && kotlin.jvm.internal.f.b(this.f26185k, bVar.f26185k);
    }

    public final String f() {
        return this.f26184j;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.f26178c;
    }

    public final int hashCode() {
        String str = this.f26177b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26178c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f26179d;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f26180e;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f26181f;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f26182g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26183h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26184j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f26185k;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String i() {
        return this.f26182g;
    }

    public final Boolean j() {
        return this.f26181f;
    }

    public final String toString() {
        String str = this.f26177b;
        String str2 = this.f26178c;
        Long l10 = this.f26179d;
        Long l11 = this.f26180e;
        Boolean bool = this.f26181f;
        String str3 = this.f26182g;
        String str4 = this.f26183h;
        String str5 = this.i;
        String str6 = this.f26184j;
        String str7 = this.f26185k;
        StringBuilder p10 = s3.b.p("ProxyTokenRaw(accessToken=", str, ", tokenType=", str2, ", expiresIn=");
        p10.append(l10);
        p10.append(", clientId=");
        p10.append(l11);
        p10.append(", isSuperuser=");
        p10.append(bool);
        p10.append(", trustLevel=");
        p10.append(str3);
        p10.append(", kycState=");
        androidx.camera.core.impl.utils.a.u(p10, str4, ", role=", str5, ", refreshToken=");
        return s3.b.o(p10, str6, ", sessionId=", str7, ")");
    }
}
