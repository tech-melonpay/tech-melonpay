package za;

import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import okhttp3.p;
import va.g;

/* compiled from: ConnectInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements va.g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31349a = new a();

    @Override // va.g
    public final p intercept(g.a aVar) {
        Aa.f fVar = (Aa.f) aVar;
        e eVar = fVar.f148a;
        synchronized (eVar) {
            if (!eVar.f31394o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!eVar.f31393n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!eVar.f31392m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            O9.p pVar = O9.p.f3034a;
        }
        d dVar = eVar.i;
        va.h hVar = eVar.f31381a;
        try {
            c cVar = new c(eVar, eVar.f31385e, dVar, dVar.a(fVar.f153f, fVar.f154g, fVar.f155h, hVar.f30699B, hVar.f30707f, !kotlin.jvm.internal.f.b(fVar.f152e.f24645b, "GET")).j(hVar, fVar));
            eVar.f31391l = cVar;
            eVar.f31396q = cVar;
            synchronized (eVar) {
                eVar.f31392m = true;
                eVar.f31393n = true;
            }
            if (eVar.f31395p) {
                throw new IOException("Canceled");
            }
            return Aa.f.c(fVar, 0, cVar, null, 61).a(fVar.f152e);
        } catch (IOException e10) {
            dVar.b(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            dVar.b(e11.f24598b);
            throw e11;
        }
    }
}
