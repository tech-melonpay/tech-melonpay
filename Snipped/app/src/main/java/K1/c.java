package K1;

import C.v;
import L1.d;
import L1.e;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f;

/* compiled from: Entry.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006¨\u00064"}, d2 = {"LK1/c;", "", "", "a", "Ljava/lang/String;", "getPageref", "()Ljava/lang/String;", "pageref", "b", "getStartedDateTime", "startedDateTime", "", "c", "J", "getTime", "()J", "setTime", "(J)V", "time", "LL1/c;", "d", "LL1/c;", "getRequest", "()LL1/c;", "request", "LL1/d;", "e", "LL1/d;", "getResponse", "()LL1/d;", "response", "LL1/a;", "f", "LL1/a;", "getCache", "()LL1/a;", "cache", "LL1/e;", "g", "LL1/e;", "getTimings", "()LL1/e;", "timings", "h", "getServerIPAddress", "serverIPAddress", "i", "getConnection", "connection", "j", "getComment", "comment", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l3.b("pageref")
    private final String pageref;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l3.b("startedDateTime")
    private final String startedDateTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l3.b("time")
    private long time;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l3.b("request")
    private final L1.c request;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l3.b("response")
    private final d response;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l3.b("cache")
    private final L1.a cache;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l3.b("timings")
    private final e timings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l3.b("serverIPAddress")
    private final String serverIPAddress;

    /* renamed from: i, reason: from kotlin metadata */
    @l3.b("connection")
    private final String connection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l3.b("comment")
    private final String comment;

    /* compiled from: Entry.kt */
    public static final class a extends ThreadLocal<SimpleDateFormat> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2254a = new a();

        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        }
    }

    public c(HttpTransaction httpTransaction) {
        Long requestDate = httpTransaction.getRequestDate();
        String format = requestDate != null ? a.f2254a.get().format(new Date(requestDate.longValue())) : null;
        format = format == null ? "" : format;
        long a10 = new e(httpTransaction).a();
        L1.c cVar = new L1.c(httpTransaction);
        d dVar = new d(httpTransaction);
        L1.a aVar = new L1.a(0);
        e eVar = new e(httpTransaction);
        this.pageref = null;
        this.startedDateTime = format;
        this.time = a10;
        this.request = cVar;
        this.response = dVar;
        this.cache = aVar;
        this.timings = eVar;
        this.serverIPAddress = null;
        this.connection = null;
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
        return f.b(this.pageref, cVar.pageref) && f.b(this.startedDateTime, cVar.startedDateTime) && this.time == cVar.time && f.b(this.request, cVar.request) && f.b(this.response, cVar.response) && f.b(this.cache, cVar.cache) && f.b(this.timings, cVar.timings) && f.b(this.serverIPAddress, cVar.serverIPAddress) && f.b(this.connection, cVar.connection) && f.b(this.comment, cVar.comment);
    }

    public final int hashCode() {
        String str = this.pageref;
        int hashCode = (this.timings.hashCode() + ((this.cache.hashCode() + ((this.response.hashCode() + ((this.request.hashCode() + v.e(this.time, v.c((str == null ? 0 : str.hashCode()) * 31, 31, this.startedDateTime), 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.serverIPAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.connection;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.comment;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.pageref;
        String str2 = this.startedDateTime;
        long j10 = this.time;
        L1.c cVar = this.request;
        d dVar = this.response;
        L1.a aVar = this.cache;
        e eVar = this.timings;
        String str3 = this.serverIPAddress;
        String str4 = this.connection;
        String str5 = this.comment;
        StringBuilder p10 = s3.b.p("Entry(pageref=", str, ", startedDateTime=", str2, ", time=");
        p10.append(j10);
        p10.append(", request=");
        p10.append(cVar);
        p10.append(", response=");
        p10.append(dVar);
        p10.append(", cache=");
        p10.append(aVar);
        p10.append(", timings=");
        p10.append(eVar);
        p10.append(", serverIPAddress=");
        p10.append(str3);
        androidx.camera.core.impl.utils.a.u(p10, ", connection=", str4, ", comment=", str5);
        p10.append(")");
        return p10.toString();
    }
}
