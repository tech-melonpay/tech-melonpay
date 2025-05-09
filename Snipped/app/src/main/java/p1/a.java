package P1;

import C.v;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import l3.b;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: Content.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"LP1/a;", "", "", "a", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "size", "", "b", "Ljava/lang/Integer;", "getCompression", "()Ljava/lang/Integer;", "compression", "", "c", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "d", "getText", TextBundle.TEXT_ENTRY, "e", "getEncoding", "encoding", "f", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3042g = new a(0L, 0, "text/plain", "", 48);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("size")
    private final Long size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("compression")
    private final Integer compression;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("mimeType")
    private final String mimeType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @b(TextBundle.TEXT_ENTRY)
    private final String text;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @b("encoding")
    private final String encoding;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @b("comment")
    private final String comment;

    public a(Long l10, Integer num, String str, String str2, int i) {
        num = (i & 2) != 0 ? null : num;
        this.size = l10;
        this.compression = num;
        this.mimeType = str;
        this.text = str2;
        this.encoding = null;
        this.comment = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.size, aVar.size) && f.b(this.compression, aVar.compression) && f.b(this.mimeType, aVar.mimeType) && f.b(this.text, aVar.text) && f.b(this.encoding, aVar.encoding) && f.b(this.comment, aVar.comment);
    }

    public final int hashCode() {
        Long l10 = this.size;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.compression;
        int c2 = v.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.mimeType);
        String str = this.text;
        int hashCode2 = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encoding;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Long l10 = this.size;
        Integer num = this.compression;
        String str = this.mimeType;
        String str2 = this.text;
        String str3 = this.encoding;
        String str4 = this.comment;
        StringBuilder sb2 = new StringBuilder("Content(size=");
        sb2.append(l10);
        sb2.append(", compression=");
        sb2.append(num);
        sb2.append(", mimeType=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", text=", str2, ", encoding=");
        return s3.b.o(sb2, str3, ", comment=", str4, ")");
    }
}
