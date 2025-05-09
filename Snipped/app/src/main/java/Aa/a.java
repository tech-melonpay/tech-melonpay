package Aa;

import Ka.n;
import Ka.t;
import ka.C0967l;
import okhttp3.g;
import okhttp3.k;
import okhttp3.o;
import okhttp3.p;
import va.C1552a;
import va.g;

/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements va.g {

    /* renamed from: a, reason: collision with root package name */
    public final C1552a f143a;

    public a(C1552a c1552a) {
        this.f143a = c1552a;
    }

    @Override // va.g
    public final p intercept(g.a aVar) {
        va.i iVar;
        f fVar = (f) aVar;
        k kVar = fVar.f152e;
        k.a a10 = kVar.a();
        o oVar = kVar.f24647d;
        if (oVar != null) {
            okhttp3.i contentType = oVar.contentType();
            if (contentType != null) {
                a10.c("Content-Type", contentType.f24544a);
            }
            long contentLength = oVar.contentLength();
            if (contentLength != -1) {
                a10.c("Content-Length", String.valueOf(contentLength));
                a10.e("Transfer-Encoding");
            } else {
                a10.c("Transfer-Encoding", "chunked");
                a10.e("Content-Length");
            }
        }
        okhttp3.g gVar = kVar.f24646c;
        String a11 = gVar.a("Host");
        boolean z10 = false;
        okhttp3.h hVar = kVar.f24644a;
        if (a11 == null) {
            a10.c("Host", wa.b.v(hVar, false));
        }
        if (gVar.a("Connection") == null) {
            a10.c("Connection", "Keep-Alive");
        }
        if (gVar.a("Accept-Encoding") == null && gVar.a("Range") == null) {
            a10.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        C1552a c1552a = this.f143a;
        c1552a.b().isEmpty();
        if (gVar.a("User-Agent") == null) {
            a10.c("User-Agent", "okhttp/4.12.0");
        }
        p a12 = fVar.a(a10.b());
        okhttp3.g gVar2 = a12.f24676f;
        e.b(c1552a, hVar, gVar2);
        p.a p10 = a12.p();
        p10.f24684a = kVar;
        if (z10) {
            String a13 = gVar2.a("Content-Encoding");
            if (a13 == null) {
                a13 = null;
            }
            if (C0967l.U("gzip", a13, true) && e.a(a12) && (iVar = a12.f24677g) != null) {
                n nVar = new n(iVar.p());
                g.a e10 = gVar2.e();
                e10.f("Content-Encoding");
                e10.f("Content-Length");
                p10.f24689f = e10.d().e();
                String a14 = gVar2.a("Content-Type");
                p10.f24690g = new g(a14 != null ? a14 : null, -1L, new t(nVar));
            }
        }
        return p10.a();
    }
}
