package I5;

/* compiled from: ProxyTokenDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1788c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f1789d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f1790e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f1791f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1792g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1793h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public String f1794j;

    public j(String str, String str2, String str3, Long l10, Long l11, Boolean bool, String str4, String str5, String str6) {
        this.f1786a = str;
        this.f1787b = str2;
        this.f1788c = str3;
        this.f1789d = l10;
        this.f1790e = l11;
        this.f1791f = bool;
        this.f1792g = str4;
        this.f1793h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f1786a, jVar.f1786a) && kotlin.jvm.internal.f.b(this.f1787b, jVar.f1787b) && kotlin.jvm.internal.f.b(this.f1788c, jVar.f1788c) && kotlin.jvm.internal.f.b(this.f1789d, jVar.f1789d) && kotlin.jvm.internal.f.b(this.f1790e, jVar.f1790e) && kotlin.jvm.internal.f.b(this.f1791f, jVar.f1791f) && kotlin.jvm.internal.f.b(this.f1792g, jVar.f1792g) && kotlin.jvm.internal.f.b(this.f1793h, jVar.f1793h) && kotlin.jvm.internal.f.b(this.i, jVar.i);
    }

    public final int hashCode() {
        String str = this.f1786a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1787b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1788c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f1789d;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f1790e;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f1791f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f1792g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1793h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProxyTokenDomain(accessToken=");
        sb2.append(this.f1786a);
        sb2.append(", refreshToken=");
        sb2.append(this.f1787b);
        sb2.append(", tokenType=");
        sb2.append(this.f1788c);
        sb2.append(", expiresIn=");
        sb2.append(this.f1789d);
        sb2.append(", clientId=");
        sb2.append(this.f1790e);
        sb2.append(", isSuperuser=");
        sb2.append(this.f1791f);
        sb2.append(", trustLevel=");
        sb2.append(this.f1792g);
        sb2.append(", kycState=");
        sb2.append(this.f1793h);
        sb2.append(", role=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.i, ")");
    }
}
