package u5;

import C.v;

/* compiled from: UploadFileRequestDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f30319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30320b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30321c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30322d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30323e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f30324f;

    public j(String str, String str2, String str3, String str4, String str5, Long l10) {
        this.f30319a = str;
        this.f30320b = str2;
        this.f30321c = str3;
        this.f30322d = str4;
        this.f30323e = str5;
        this.f30324f = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f30319a, jVar.f30319a) && kotlin.jvm.internal.f.b(this.f30320b, jVar.f30320b) && kotlin.jvm.internal.f.b(this.f30321c, jVar.f30321c) && kotlin.jvm.internal.f.b(this.f30322d, jVar.f30322d) && kotlin.jvm.internal.f.b(this.f30323e, jVar.f30323e) && kotlin.jvm.internal.f.b(this.f30324f, jVar.f30324f);
    }

    public final int hashCode() {
        int c2 = v.c(this.f30319a.hashCode() * 31, 31, this.f30320b);
        String str = this.f30321c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30322d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30323e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f30324f;
        return hashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "UploadFileRequestDomain(body=" + this.f30319a + ", kind=" + this.f30320b + ", title=" + this.f30321c + ", customFilename=" + this.f30322d + ", comments=" + this.f30323e + ", expiryDate=" + this.f30324f + ")";
    }
}
