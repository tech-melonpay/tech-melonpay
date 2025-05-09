package Ca;

import Aa.i;
import Ka.w;
import Ka.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.g;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.p;

/* compiled from: Http2ExchangeCodec.kt */
/* loaded from: classes2.dex */
public final class l implements Aa.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f795g = wa.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List<String> f796h = wa.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.internal.connection.a f797a;

    /* renamed from: b, reason: collision with root package name */
    public final Aa.f f798b;

    /* renamed from: c, reason: collision with root package name */
    public final d f799c;

    /* renamed from: d, reason: collision with root package name */
    public volatile n f800d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f801e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f802f;

    public l(va.h hVar, okhttp3.internal.connection.a aVar, Aa.f fVar, d dVar) {
        this.f797a = aVar;
        this.f798b = fVar;
        this.f799c = dVar;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f801e = hVar.f30720t.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // Aa.d
    public final void a() {
        this.f800d.f().close();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00b5, B:35:0x00bc, B:36:0x00c5, B:38:0x00c9, B:40:0x00e0, B:42:0x00e8, B:46:0x00f4, B:48:0x00fa, B:49:0x0103, B:81:0x0185, B:82:0x018a), top: B:32:0x00b5, outer: #1 }] */
    @Override // Aa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(okhttp3.k r19) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.l.b(okhttp3.k):void");
    }

    @Override // Aa.d
    public final y c(okhttp3.p pVar) {
        return this.f800d.i;
    }

    @Override // Aa.d
    public final void cancel() {
        this.f802f = true;
        n nVar = this.f800d;
        if (nVar != null) {
            nVar.e(ErrorCode.CANCEL);
        }
    }

    @Override // Aa.d
    public final p.a d(boolean z10) {
        okhttp3.g removeFirst;
        n nVar = this.f800d;
        if (nVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (nVar) {
            nVar.f823k.i();
            while (nVar.f820g.isEmpty() && nVar.f825m == null) {
                try {
                    nVar.j();
                } catch (Throwable th) {
                    nVar.f823k.m();
                    throw th;
                }
            }
            nVar.f823k.m();
            if (!(!nVar.f820g.isEmpty())) {
                IOException iOException = nVar.f826n;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(nVar.f825m);
            }
            removeFirst = nVar.f820g.removeFirst();
        }
        Protocol protocol = this.f801e;
        g.a aVar = new g.a();
        int size = removeFirst.size();
        Aa.i iVar = null;
        for (int i = 0; i < size; i++) {
            String c2 = removeFirst.c(i);
            String f10 = removeFirst.f(i);
            if (kotlin.jvm.internal.f.b(c2, ":status")) {
                iVar = i.a.a("HTTP/1.1 " + f10);
            } else if (!f796h.contains(c2)) {
                aVar.c(c2, f10);
            }
        }
        if (iVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        p.a aVar2 = new p.a();
        aVar2.f24685b = protocol;
        aVar2.f24686c = iVar.f161b;
        aVar2.f24687d = iVar.f162c;
        aVar2.f24689f = aVar.d().e();
        if (z10 && aVar2.f24686c == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // Aa.d
    public final void e() {
        this.f799c.flush();
    }

    @Override // Aa.d
    public final long f(okhttp3.p pVar) {
        if (Aa.e.a(pVar)) {
            return wa.b.j(pVar);
        }
        return 0L;
    }

    @Override // Aa.d
    public final w g(okhttp3.k kVar, long j10) {
        return this.f800d.f();
    }

    @Override // Aa.d
    public final okhttp3.internal.connection.a getConnection() {
        return this.f797a;
    }
}
