package L1;

import C.v;
import P9.n;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;

/* compiled from: Response.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010)\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001a\u0010/\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b1\u0010\f¨\u00063"}, d2 = {"LL1/d;", "", "", "a", "I", "getStatus", "()I", "status", "", "b", "Ljava/lang/String;", "getStatusText", "()Ljava/lang/String;", "statusText", "c", "getHttpVersion", "httpVersion", "", "d", "Ljava/util/List;", "getCookies", "()Ljava/util/List;", "cookies", "LL1/b;", "e", "getHeaders", "headers", "LP1/a;", "f", "LP1/a;", "getContent", "()LP1/a;", FirebaseAnalytics.Param.CONTENT, "g", "getRedirectUrl", "redirectUrl", "", "h", "J", "getHeadersSize", "()J", "headersSize", "i", "getBodySize", "bodySize", "j", "getTotalSize", "totalSize", "k", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("status")
    private final int status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("statusText")
    private final String statusText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b("httpVersion")
    private final String httpVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l3.b("cookies")
    private final List<Object> cookies;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l3.b("headers")
    private final List<b> headers;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l3.b(FirebaseAnalytics.Param.CONTENT)
    private final P1.a content;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l3.b("redirectURL")
    private final String redirectUrl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l3.b("headersSize")
    private final long headersSize;

    /* renamed from: i, reason: from kotlin metadata */
    @l3.b("bodySize")
    private final long bodySize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l3.b("totalSize")
    private final long totalSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    public d() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<L1.b>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(HttpTransaction httpTransaction) {
        ?? r52;
        P1.a aVar;
        Integer responseCode = httpTransaction.getResponseCode();
        int intValue = responseCode != null ? responseCode.intValue() : 0;
        String responseMessage = httpTransaction.getResponseMessage();
        responseMessage = responseMessage == null ? "" : responseMessage;
        String protocol = httpTransaction.getProtocol();
        protocol = protocol == null ? "" : protocol;
        List<I1.a> parsedResponseHeaders = httpTransaction.getParsedResponseHeaders();
        if (parsedResponseHeaders != null) {
            List<I1.a> list = parsedResponseHeaders;
            r52 = new ArrayList(n.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r52.add(new b((I1.a) it.next()));
            }
        } else {
            r52 = EmptyList.f23104a;
        }
        if (httpTransaction.getResponsePayloadSize() != null) {
            Long responsePayloadSize = httpTransaction.getResponsePayloadSize();
            String responseContentType = httpTransaction.getResponseContentType();
            aVar = new P1.a(responsePayloadSize, null, responseContentType == null ? "application/octet-stream" : responseContentType, httpTransaction.getResponseBody(), 50);
        } else {
            aVar = P1.a.f3042g;
        }
        Long responseHeadersSize = httpTransaction.getResponseHeadersSize();
        long longValue = responseHeadersSize != null ? responseHeadersSize.longValue() : 0L;
        long harResponseBodySize = httpTransaction.getHarResponseBodySize();
        long responseTotalSize = httpTransaction.getResponseTotalSize();
        EmptyList emptyList = EmptyList.f23104a;
        this.status = intValue;
        this.statusText = responseMessage;
        this.httpVersion = protocol;
        this.cookies = emptyList;
        this.headers = r52;
        this.content = aVar;
        this.redirectUrl = "";
        this.headersSize = longValue;
        this.bodySize = harResponseBodySize;
        this.totalSize = responseTotalSize;
        this.comment = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.status == dVar.status && f.b(this.statusText, dVar.statusText) && f.b(this.httpVersion, dVar.httpVersion) && f.b(this.cookies, dVar.cookies) && f.b(this.headers, dVar.headers) && f.b(this.content, dVar.content) && f.b(this.redirectUrl, dVar.redirectUrl) && this.headersSize == dVar.headersSize && this.bodySize == dVar.bodySize && this.totalSize == dVar.totalSize && f.b(this.comment, dVar.comment);
    }

    public final int hashCode() {
        int f10 = v.f(this.headers, v.f(this.cookies, v.c(v.c(Integer.hashCode(this.status) * 31, 31, this.statusText), 31, this.httpVersion), 31), 31);
        P1.a aVar = this.content;
        int e10 = v.e(this.totalSize, v.e(this.bodySize, v.e(this.headersSize, v.c((f10 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.redirectUrl), 31), 31), 31);
        String str = this.comment;
        return e10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Response(status=" + this.status + ", statusText=" + this.statusText + ", httpVersion=" + this.httpVersion + ", cookies=" + this.cookies + ", headers=" + this.headers + ", content=" + this.content + ", redirectUrl=" + this.redirectUrl + ", headersSize=" + this.headersSize + ", bodySize=" + this.bodySize + ", totalSize=" + this.totalSize + ", comment=" + this.comment + ")";
    }
}
