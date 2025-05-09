package i2;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810b extends AbstractC0809a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f21284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21286c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21287d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21288e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21289f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21290g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21291h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21292j;

    /* renamed from: k, reason: collision with root package name */
    public final String f21293k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21294l;

    public C0810b(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f21284a = num;
        this.f21285b = str;
        this.f21286c = str2;
        this.f21287d = str3;
        this.f21288e = str4;
        this.f21289f = str5;
        this.f21290g = str6;
        this.f21291h = str7;
        this.i = str8;
        this.f21292j = str9;
        this.f21293k = str10;
        this.f21294l = str11;
    }

    @Override // i2.AbstractC0809a
    public final String a() {
        return this.f21294l;
    }

    @Override // i2.AbstractC0809a
    public final String b() {
        return this.f21292j;
    }

    @Override // i2.AbstractC0809a
    public final String c() {
        return this.f21287d;
    }

    @Override // i2.AbstractC0809a
    public final String d() {
        return this.f21291h;
    }

    @Override // i2.AbstractC0809a
    public final String e() {
        return this.f21286c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0809a)) {
            return false;
        }
        AbstractC0809a abstractC0809a = (AbstractC0809a) obj;
        Integer num = this.f21284a;
        if (num != null ? num.equals(abstractC0809a.l()) : abstractC0809a.l() == null) {
            String str = this.f21285b;
            if (str != null ? str.equals(abstractC0809a.i()) : abstractC0809a.i() == null) {
                String str2 = this.f21286c;
                if (str2 != null ? str2.equals(abstractC0809a.e()) : abstractC0809a.e() == null) {
                    String str3 = this.f21287d;
                    if (str3 != null ? str3.equals(abstractC0809a.c()) : abstractC0809a.c() == null) {
                        String str4 = this.f21288e;
                        if (str4 != null ? str4.equals(abstractC0809a.k()) : abstractC0809a.k() == null) {
                            String str5 = this.f21289f;
                            if (str5 != null ? str5.equals(abstractC0809a.j()) : abstractC0809a.j() == null) {
                                String str6 = this.f21290g;
                                if (str6 != null ? str6.equals(abstractC0809a.g()) : abstractC0809a.g() == null) {
                                    String str7 = this.f21291h;
                                    if (str7 != null ? str7.equals(abstractC0809a.d()) : abstractC0809a.d() == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(abstractC0809a.f()) : abstractC0809a.f() == null) {
                                            String str9 = this.f21292j;
                                            if (str9 != null ? str9.equals(abstractC0809a.b()) : abstractC0809a.b() == null) {
                                                String str10 = this.f21293k;
                                                if (str10 != null ? str10.equals(abstractC0809a.h()) : abstractC0809a.h() == null) {
                                                    String str11 = this.f21294l;
                                                    if (str11 == null) {
                                                        if (abstractC0809a.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(abstractC0809a.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // i2.AbstractC0809a
    public final String f() {
        return this.i;
    }

    @Override // i2.AbstractC0809a
    public final String g() {
        return this.f21290g;
    }

    @Override // i2.AbstractC0809a
    public final String h() {
        return this.f21293k;
    }

    public final int hashCode() {
        Integer num = this.f21284a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f21285b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f21286c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21287d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f21288e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f21289f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f21290g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f21291h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f21292j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f21293k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f21294l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    @Override // i2.AbstractC0809a
    public final String i() {
        return this.f21285b;
    }

    @Override // i2.AbstractC0809a
    public final String j() {
        return this.f21289f;
    }

    @Override // i2.AbstractC0809a
    public final String k() {
        return this.f21288e;
    }

    @Override // i2.AbstractC0809a
    public final Integer l() {
        return this.f21284a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f21284a);
        sb2.append(", model=");
        sb2.append(this.f21285b);
        sb2.append(", hardware=");
        sb2.append(this.f21286c);
        sb2.append(", device=");
        sb2.append(this.f21287d);
        sb2.append(", product=");
        sb2.append(this.f21288e);
        sb2.append(", osBuild=");
        sb2.append(this.f21289f);
        sb2.append(", manufacturer=");
        sb2.append(this.f21290g);
        sb2.append(", fingerprint=");
        sb2.append(this.f21291h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.f21292j);
        sb2.append(", mccMnc=");
        sb2.append(this.f21293k);
        sb2.append(", applicationBuild=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f21294l, "}");
    }
}
