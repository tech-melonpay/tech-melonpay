package N1;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: PostData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"LN1/a;", "", "", "a", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "LO1/a;", "b", "LO1/a;", "getParams", "()LO1/a;", "params", "c", "getText", TextBundle.TEXT_ENTRY, "d", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("mimeType")
    private final String mimeType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("params")
    private final O1.a params;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b(TextBundle.TEXT_ENTRY)
    private final String text;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    public a(HttpTransaction httpTransaction) {
        String requestContentType = httpTransaction.getRequestContentType();
        requestContentType = requestContentType == null ? "application/octet-stream" : requestContentType;
        String requestBody = httpTransaction.getRequestBody();
        this.mimeType = requestContentType;
        this.params = null;
        this.text = requestBody;
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
        return f.b(this.mimeType, aVar.mimeType) && f.b(this.params, aVar.params) && f.b(this.text, aVar.text) && f.b(this.comment, aVar.comment);
    }

    public final int hashCode() {
        int hashCode = this.mimeType.hashCode() * 31;
        O1.a aVar = this.params;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.comment;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.mimeType;
        O1.a aVar = this.params;
        String str2 = this.text;
        String str3 = this.comment;
        StringBuilder sb2 = new StringBuilder("PostData(mimeType=");
        sb2.append(str);
        sb2.append(", params=");
        sb2.append(aVar);
        sb2.append(", text=");
        return s3.b.o(sb2, str2, ", comment=", str3, ")");
    }
}
