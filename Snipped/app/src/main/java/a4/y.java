package a4;

import org.bouncycastle.i18n.MessageBundle;

/* compiled from: UploadFileRequestRaw.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("body")
    private final String f4439a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("kind")
    private final String f4440b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(MessageBundle.TITLE_ENTRY)
    private final String f4441c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("custom_filename")
    private final String f4442d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("comments")
    private final String f4443e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("expiry_date")
    private final Long f4444f;

    public y(String str, String str2, String str3, String str4, String str5, Long l10) {
        this.f4439a = str;
        this.f4440b = str2;
        this.f4441c = str3;
        this.f4442d = str4;
        this.f4443e = str5;
        this.f4444f = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.f.b(this.f4439a, yVar.f4439a) && kotlin.jvm.internal.f.b(this.f4440b, yVar.f4440b) && kotlin.jvm.internal.f.b(this.f4441c, yVar.f4441c) && kotlin.jvm.internal.f.b(this.f4442d, yVar.f4442d) && kotlin.jvm.internal.f.b(this.f4443e, yVar.f4443e) && kotlin.jvm.internal.f.b(this.f4444f, yVar.f4444f);
    }

    public final int hashCode() {
        int c2 = C.v.c(this.f4439a.hashCode() * 31, 31, this.f4440b);
        String str = this.f4441c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4442d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4443e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f4444f;
        return hashCode3 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4439a;
        String str2 = this.f4440b;
        String str3 = this.f4441c;
        String str4 = this.f4442d;
        String str5 = this.f4443e;
        Long l10 = this.f4444f;
        StringBuilder p10 = s3.b.p("UploadFileRequestRaw(body=", str, ", kind=", str2, ", title=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", customFilename=", str4, ", comments=");
        p10.append(str5);
        p10.append(", expiryDate=");
        p10.append(l10);
        p10.append(")");
        return p10.toString();
    }
}
