package C5;

import kotlin.jvm.internal.f;

/* compiled from: PlanTextFormatDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f676d;

    /* renamed from: e, reason: collision with root package name */
    public final String f677e;

    /* renamed from: f, reason: collision with root package name */
    public final String f678f;

    /* renamed from: g, reason: collision with root package name */
    public final String f679g;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f673a = str;
        this.f674b = str2;
        this.f675c = str3;
        this.f676d = str4;
        this.f677e = str5;
        this.f678f = str6;
        this.f679g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f673a, bVar.f673a) && f.b(this.f674b, bVar.f674b) && f.b(this.f675c, bVar.f675c) && f.b(this.f676d, bVar.f676d) && f.b(this.f677e, bVar.f677e) && f.b(this.f678f, bVar.f678f) && f.b(this.f679g, bVar.f679g);
    }

    public final int hashCode() {
        String str = this.f673a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f674b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f675c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f676d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f677e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f678f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f679g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlanTextFormatDomain(title=");
        sb2.append(this.f673a);
        sb2.append(", description=");
        sb2.append(this.f674b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f675c);
        sb2.append(", titleColor=");
        sb2.append(this.f676d);
        sb2.append(", titleColorAlpha=");
        sb2.append(this.f677e);
        sb2.append(", descriptionColor=");
        sb2.append(this.f678f);
        sb2.append(", descriptionColorAlpha=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f679g, ")");
    }
}
