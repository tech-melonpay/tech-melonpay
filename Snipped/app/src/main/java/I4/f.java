package i4;

import org.bouncycastle.i18n.MessageBundle;

/* compiled from: UploadFileRaw.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("id")
    private final Integer f21471a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f21472b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("kind")
    private final String f21473c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("media_uri")
    private final String f21474d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(MessageBundle.TITLE_ENTRY)
    private final String f21475e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("custom_filename")
    private final String f21476f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("comments")
    private final String f21477g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("expiry_date")
    private final String f21478h;

    @l3.b("mime_type")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("uploaded_at")
    private final Long f21479j;

    public final Integer a() {
        return this.f21472b;
    }

    public final String b() {
        return this.f21477g;
    }

    public final String c() {
        return this.f21476f;
    }

    public final String d() {
        return this.f21478h;
    }

    public final Integer e() {
        return this.f21471a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f21471a, fVar.f21471a) && kotlin.jvm.internal.f.b(this.f21472b, fVar.f21472b) && kotlin.jvm.internal.f.b(this.f21473c, fVar.f21473c) && kotlin.jvm.internal.f.b(this.f21474d, fVar.f21474d) && kotlin.jvm.internal.f.b(this.f21475e, fVar.f21475e) && kotlin.jvm.internal.f.b(this.f21476f, fVar.f21476f) && kotlin.jvm.internal.f.b(this.f21477g, fVar.f21477g) && kotlin.jvm.internal.f.b(this.f21478h, fVar.f21478h) && kotlin.jvm.internal.f.b(this.i, fVar.i) && kotlin.jvm.internal.f.b(this.f21479j, fVar.f21479j);
    }

    public final String f() {
        return this.f21473c;
    }

    public final String g() {
        return this.f21474d;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        Integer num = this.f21471a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21472b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f21473c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21474d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21475e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21476f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21477g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21478h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l10 = this.f21479j;
        return hashCode9 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String i() {
        return this.f21475e;
    }

    public final Long j() {
        return this.f21479j;
    }

    public final String toString() {
        Integer num = this.f21471a;
        Integer num2 = this.f21472b;
        String str = this.f21473c;
        String str2 = this.f21474d;
        String str3 = this.f21475e;
        String str4 = this.f21476f;
        String str5 = this.f21477g;
        String str6 = this.f21478h;
        String str7 = this.i;
        Long l10 = this.f21479j;
        StringBuilder sb2 = new StringBuilder("UploadFileRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", kind=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", mediaUri=", str2, ", title=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", customFilename=", str4, ", comments=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", expiryDate=", str6, ", mimeType=");
        sb2.append(str7);
        sb2.append(", uploadedAt=");
        sb2.append(l10);
        sb2.append(")");
        return sb2.toString();
    }
}
