package b5;

import Aa.f;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* compiled from: TokenAuthenticator.kt */
/* renamed from: b5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final K5.a f8342a;

    public C0591d(K5.a aVar) {
        this.f8342a = aVar;
    }

    @Override // va.g
    public final p intercept(g.a aVar) {
        f fVar = (f) aVar;
        k kVar = fVar.f152e;
        String a10 = kVar.f24646c.a("Authorization");
        if (a10 != null && a10.length() != 0) {
            return fVar.a(kVar);
        }
        K5.a aVar2 = this.f8342a;
        String K2 = aVar2.K();
        if (!kotlin.jvm.internal.f.b(K2, "default")) {
            k.a a11 = kVar.a();
            a11.c("Authorization", "Bearer ".concat(K2));
            return fVar.a(a11.b());
        }
        if (aVar2.n().length() <= 0) {
            return fVar.a(kVar);
        }
        k.a a12 = kVar.a();
        a12.c("Authorization", "Basic ".concat(aVar2.n()));
        return fVar.a(a12.b());
    }
}
