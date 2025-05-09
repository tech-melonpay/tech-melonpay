package I5;

/* compiled from: RegisterRequestDomain.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1851b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1853d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1854e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1855f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f1856g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f1857h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1858j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1859k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1860l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1861m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1862n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1863o;

    public m(String str, String str2, String str3, String str4, String str5, String str6, Long l10, String str7, String str8, String str9, String str10, String str11, String str12) {
        Boolean bool = Boolean.TRUE;
        this.f1850a = str;
        this.f1851b = str2;
        this.f1852c = str3;
        this.f1853d = str4;
        this.f1854e = str5;
        this.f1855f = str6;
        this.f1856g = l10;
        this.f1857h = bool;
        this.i = str7;
        this.f1858j = str8;
        this.f1859k = str9;
        this.f1860l = str10;
        this.f1861m = null;
        this.f1862n = str11;
        this.f1863o = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.f.b(this.f1850a, mVar.f1850a) && kotlin.jvm.internal.f.b(this.f1851b, mVar.f1851b) && kotlin.jvm.internal.f.b(this.f1852c, mVar.f1852c) && kotlin.jvm.internal.f.b(this.f1853d, mVar.f1853d) && kotlin.jvm.internal.f.b(this.f1854e, mVar.f1854e) && kotlin.jvm.internal.f.b(this.f1855f, mVar.f1855f) && kotlin.jvm.internal.f.b(this.f1856g, mVar.f1856g) && kotlin.jvm.internal.f.b(this.f1857h, mVar.f1857h) && kotlin.jvm.internal.f.b(this.i, mVar.i) && kotlin.jvm.internal.f.b(this.f1858j, mVar.f1858j) && kotlin.jvm.internal.f.b(this.f1859k, mVar.f1859k) && kotlin.jvm.internal.f.b(this.f1860l, mVar.f1860l) && kotlin.jvm.internal.f.b(this.f1861m, mVar.f1861m) && kotlin.jvm.internal.f.b(this.f1862n, mVar.f1862n) && kotlin.jvm.internal.f.b(this.f1863o, mVar.f1863o);
    }

    public final int hashCode() {
        String str = this.f1850a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1851b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1852c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1853d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1854e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f1855f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l10 = this.f1856g;
        int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.f1857h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1858j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f1859k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f1860l;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f1861m;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f1862n;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f1863o;
        return hashCode14 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterRequestDomain(firstName=");
        sb2.append(this.f1850a);
        sb2.append(", lastName=");
        sb2.append(this.f1851b);
        sb2.append(", email=");
        sb2.append(this.f1852c);
        sb2.append(", phoneAreaCode=");
        sb2.append(this.f1853d);
        sb2.append(", phone=");
        sb2.append(this.f1854e);
        sb2.append(", password=");
        sb2.append(this.f1855f);
        sb2.append(", birthday=");
        sb2.append(this.f1856g);
        sb2.append(", tos=");
        sb2.append(this.f1857h);
        sb2.append(", country=");
        sb2.append(this.i);
        sb2.append(", city=");
        sb2.append(this.f1858j);
        sb2.append(", house=");
        sb2.append(this.f1859k);
        sb2.append(", postcode=");
        sb2.append(this.f1860l);
        sb2.append(", region=");
        sb2.append(this.f1861m);
        sb2.append(", street=");
        sb2.append(this.f1862n);
        sb2.append(", link=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1863o, ")");
    }
}
