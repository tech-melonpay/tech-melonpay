package b5;

import Aa.f;
import ka.C0969n;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* compiled from: TfaHeaderInterceptor.kt */
/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final K5.a f8341a;

    public C0590c(K5.a aVar) {
        this.f8341a = aVar;
    }

    @Override // va.g
    public final p intercept(g.a aVar) {
        K5.a aVar2 = this.f8341a;
        if (aVar2.F().length() > 0) {
            f fVar = (f) aVar;
            k kVar = fVar.f152e;
            if (C0969n.Y(kVar.f24644a.b(), aVar2.L(), false)) {
                k.a a10 = kVar.a();
                a10.f24652c.a("X-TFA-CODE", aVar2.F());
                k b9 = a10.b();
                aVar2.R("");
                aVar2.N("");
                return fVar.a(b9);
            }
        }
        f fVar2 = (f) aVar;
        return fVar2.a(fVar2.f152e);
    }
}
