package L1;

import C.v;
import P9.n;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import okhttp3.h;

/* compiled from: Request.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010-\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006¨\u00061"}, d2 = {"LL1/c;", "", "", "a", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", FirebaseAnalytics.Param.METHOD, "b", "getUrl", ImagesContract.URL, "c", "getHttpVersion", "httpVersion", "", "d", "Ljava/util/List;", "getCookies", "()Ljava/util/List;", "cookies", "LL1/b;", "e", "getHeaders", "headers", "LN1/b;", "f", "getQueryString", "queryString", "LN1/a;", "g", "LN1/a;", "getPostData", "()LN1/a;", "postData", "", "h", "J", "getHeadersSize", "()J", "headersSize", "i", "getBodySize", "bodySize", "j", "getTotalSize", "totalSize", "k", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b(FirebaseAnalytics.Param.METHOD)
    private final String method;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b(ImagesContract.URL)
    private final String url;

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
    @l3.b("queryString")
    private final List<N1.b> queryString;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l3.b("postData")
    private final N1.a postData;

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

    public c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<L1.b>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List<N1.b>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    public c(HttpTransaction httpTransaction) {
        ?? r52;
        ?? r92;
        String method = httpTransaction.getMethod();
        method = method == null ? "" : method;
        String url = httpTransaction.getUrl();
        url = url == null ? "" : url;
        String protocol = httpTransaction.getProtocol();
        protocol = protocol == null ? "" : protocol;
        List<I1.a> parsedRequestHeaders = httpTransaction.getParsedRequestHeaders();
        if (parsedRequestHeaders != null) {
            List<I1.a> list = parsedRequestHeaders;
            r52 = new ArrayList(n.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r52.add(new b((I1.a) it.next()));
            }
        } else {
            r52 = EmptyList.f23104a;
        }
        String url2 = httpTransaction.getUrl();
        if (url2 != null) {
            h.a aVar = new h.a();
            aVar.d(null, url2);
            h a10 = aVar.a();
            List<String> list2 = a10.f24531g;
            int size = list2 != null ? list2.size() / 2 : 0;
            r92 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                if (list2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                int i9 = i * 2;
                String str = list2.get(i9);
                String str2 = list2.get(i9 + 1);
                if (str2 == null) {
                    str2 = "";
                }
                r92.add(new N1.b(str, str2));
            }
        } else {
            r92 = EmptyList.f23104a;
        }
        N1.a aVar2 = httpTransaction.getRequestPayloadSize() != null ? new N1.a(httpTransaction) : null;
        Long requestHeadersSize = httpTransaction.getRequestHeadersSize();
        long longValue = requestHeadersSize != null ? requestHeadersSize.longValue() : 0L;
        Long requestPayloadSize = httpTransaction.getRequestPayloadSize();
        long longValue2 = requestPayloadSize != null ? requestPayloadSize.longValue() : 0L;
        long requestTotalSize = httpTransaction.getRequestTotalSize();
        EmptyList emptyList = EmptyList.f23104a;
        this.method = method;
        this.url = url;
        this.httpVersion = protocol;
        this.cookies = emptyList;
        this.headers = r52;
        this.queryString = r92;
        this.postData = aVar2;
        this.headersSize = longValue;
        this.bodySize = longValue2;
        this.totalSize = requestTotalSize;
        this.comment = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.method, cVar.method) && f.b(this.url, cVar.url) && f.b(this.httpVersion, cVar.httpVersion) && f.b(this.cookies, cVar.cookies) && f.b(this.headers, cVar.headers) && f.b(this.queryString, cVar.queryString) && f.b(this.postData, cVar.postData) && this.headersSize == cVar.headersSize && this.bodySize == cVar.bodySize && this.totalSize == cVar.totalSize && f.b(this.comment, cVar.comment);
    }

    public final int hashCode() {
        int f10 = v.f(this.queryString, v.f(this.headers, v.f(this.cookies, v.c(v.c(this.method.hashCode() * 31, 31, this.url), 31, this.httpVersion), 31), 31), 31);
        N1.a aVar = this.postData;
        int e10 = v.e(this.totalSize, v.e(this.bodySize, v.e(this.headersSize, (f10 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31);
        String str = this.comment;
        return e10 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.method;
        String str2 = this.url;
        String str3 = this.httpVersion;
        List<Object> list = this.cookies;
        List<b> list2 = this.headers;
        List<N1.b> list3 = this.queryString;
        N1.a aVar = this.postData;
        long j10 = this.headersSize;
        long j11 = this.bodySize;
        long j12 = this.totalSize;
        String str4 = this.comment;
        StringBuilder p10 = s3.b.p("Request(method=", str, ", url=", str2, ", httpVersion=");
        p10.append(str3);
        p10.append(", cookies=");
        p10.append(list);
        p10.append(", headers=");
        p10.append(list2);
        p10.append(", queryString=");
        p10.append(list3);
        p10.append(", postData=");
        p10.append(aVar);
        p10.append(", headersSize=");
        p10.append(j10);
        p10.append(", bodySize=");
        p10.append(j11);
        p10.append(", totalSize=");
        p10.append(j12);
        p10.append(", comment=");
        p10.append(str4);
        p10.append(")");
        return p10.toString();
    }
}
