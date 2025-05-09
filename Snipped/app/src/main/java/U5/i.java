package u5;

/* compiled from: UploadFileDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f30310a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f30311b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30312c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30313d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30314e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30315f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30316g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30317h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f30318j;

    public i(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l10) {
        this.f30310a = num;
        this.f30311b = num2;
        this.f30312c = str;
        this.f30313d = str2;
        this.f30314e = str3;
        this.f30315f = str4;
        this.f30316g = str5;
        this.f30317h = str6;
        this.i = str7;
        this.f30318j = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f30310a, iVar.f30310a) && kotlin.jvm.internal.f.b(this.f30311b, iVar.f30311b) && kotlin.jvm.internal.f.b(this.f30312c, iVar.f30312c) && kotlin.jvm.internal.f.b(this.f30313d, iVar.f30313d) && kotlin.jvm.internal.f.b(this.f30314e, iVar.f30314e) && kotlin.jvm.internal.f.b(this.f30315f, iVar.f30315f) && kotlin.jvm.internal.f.b(this.f30316g, iVar.f30316g) && kotlin.jvm.internal.f.b(this.f30317h, iVar.f30317h) && kotlin.jvm.internal.f.b(this.i, iVar.i) && kotlin.jvm.internal.f.b(this.f30318j, iVar.f30318j);
    }

    public final int hashCode() {
        Integer num = this.f30310a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f30311b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f30312c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30313d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30314e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30315f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30316g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30317h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l10 = this.f30318j;
        return hashCode9 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "UploadFileDomain(id=" + this.f30310a + ", clientId=" + this.f30311b + ", kind=" + this.f30312c + ", mediaUri=" + this.f30313d + ", title=" + this.f30314e + ", customFilename=" + this.f30315f + ", comments=" + this.f30316g + ", expiryDate=" + this.f30317h + ", mimeType=" + this.i + ", uploadedAt=" + this.f30318j + ")";
    }
}
