package Aa;

import java.util.List;
import okhttp3.k;
import okhttp3.p;
import va.g;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes2.dex */
public final class f implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final za.e f148a;

    /* renamed from: b, reason: collision with root package name */
    public final List<va.g> f149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150c;

    /* renamed from: d, reason: collision with root package name */
    public final za.c f151d;

    /* renamed from: e, reason: collision with root package name */
    public final k f152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f153f;

    /* renamed from: g, reason: collision with root package name */
    public final int f154g;

    /* renamed from: h, reason: collision with root package name */
    public final int f155h;
    public int i;

    /* JADX WARN: Multi-variable type inference failed */
    public f(za.e eVar, List<? extends va.g> list, int i, za.c cVar, k kVar, int i9, int i10, int i11) {
        this.f148a = eVar;
        this.f149b = list;
        this.f150c = i;
        this.f151d = cVar;
        this.f152e = kVar;
        this.f153f = i9;
        this.f154g = i10;
        this.f155h = i11;
    }

    public static f c(f fVar, int i, za.c cVar, k kVar, int i9) {
        if ((i9 & 1) != 0) {
            i = fVar.f150c;
        }
        int i10 = i;
        if ((i9 & 2) != 0) {
            cVar = fVar.f151d;
        }
        za.c cVar2 = cVar;
        if ((i9 & 4) != 0) {
            kVar = fVar.f152e;
        }
        int i11 = fVar.f153f;
        int i12 = fVar.f154g;
        int i13 = fVar.f155h;
        return new f(fVar.f148a, fVar.f149b, i10, cVar2, kVar, i11, i12, i13);
    }

    @Override // va.g.a
    public final p a(k kVar) {
        List<va.g> list = this.f149b;
        int size = list.size();
        int i = this.f150c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.i++;
        za.c cVar = this.f151d;
        if (cVar != null) {
            okhttp3.h hVar = kVar.f24644a;
            okhttp3.h hVar2 = cVar.f31356c.f31373b.i;
            if (hVar.f24529e != hVar2.f24529e || !kotlin.jvm.internal.f.b(hVar.f24528d, hVar2.f24528d)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i9 = i + 1;
        f c2 = c(this, i9, null, kVar, 58);
        va.g gVar = list.get(i);
        p intercept = gVar.intercept(c2);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + gVar + " returned null");
        }
        if (cVar != null && i9 < list.size() && c2.i != 1) {
            throw new IllegalStateException(("network interceptor " + gVar + " must call proceed() exactly once").toString());
        }
        if (intercept.f24677g != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + gVar + " returned a response with no body").toString());
    }

    @Override // va.g.a
    public final okhttp3.internal.connection.a b() {
        za.c cVar = this.f151d;
        if (cVar != null) {
            return cVar.f31360g;
        }
        return null;
    }

    @Override // va.g.a
    public final k request() {
        return this.f152e;
    }
}
