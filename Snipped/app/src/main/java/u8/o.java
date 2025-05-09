package U8;

import C.N;
import U8.l;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MarkwonVisitorImpl.java */
/* loaded from: classes2.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    public final g f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3699b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3700c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends Qa.r>, l.c<? extends Qa.r>> f3701d;

    /* renamed from: e, reason: collision with root package name */
    public final l.a f3702e;

    /* compiled from: MarkwonVisitorImpl.java */
    public static class a implements l.b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f3703a = new HashMap();

        public final a a(Class cls, l.c cVar) {
            this.f3703a.put(cls, cVar);
            return this;
        }
    }

    public o(g gVar, N n10, t tVar, Map map, b bVar) {
        this.f3698a = gVar;
        this.f3699b = n10;
        this.f3700c = tVar;
        this.f3701d = map;
        this.f3702e = bVar;
    }

    public final void a(Qa.r rVar) {
        ((b) this.f3702e).getClass();
        if (rVar.f3231e != null) {
            d();
            this.f3700c.a('\n');
        }
    }

    public final void b() {
        ((b) this.f3702e).getClass();
        d();
    }

    public final g c() {
        return this.f3698a;
    }

    public final void d() {
        t tVar = this.f3700c;
        if (tVar.f3708a.length() > 0) {
            if ('\n' != tVar.f3708a.charAt(r1.length() - 1)) {
                tVar.a('\n');
            }
        }
    }

    public final int e() {
        return this.f3700c.f3708a.length();
    }

    public final r f() {
        return this.f3699b;
    }

    public final <N extends Qa.r> void g(N n10, int i) {
        Class<?> cls = n10.getClass();
        g gVar = this.f3698a;
        s a10 = ((k) gVar.f3682e).a(cls);
        if (a10 != null) {
            Object a11 = a10.a(gVar, this.f3699b);
            t tVar = this.f3700c;
            t.d(tVar, a11, i, tVar.f3708a.length());
        }
    }

    public final void h(Qa.r rVar) {
        l.c<? extends Qa.r> cVar = this.f3701d.get(rVar.getClass());
        if (cVar != null) {
            cVar.a(rVar, this);
        } else {
            i(rVar);
        }
    }

    public final void i(Qa.r rVar) {
        Qa.r rVar2 = rVar.f3228b;
        while (rVar2 != null) {
            Qa.r rVar3 = rVar2.f3231e;
            rVar2.a(this);
            rVar2 = rVar3;
        }
    }
}
