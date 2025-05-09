package j2;

import C.v;
import com.google.android.datatransport.Priority;
import j2.C0882a;
import j2.C0884c;
import java.util.HashMap;

/* compiled from: TransportImpl.java */
/* renamed from: j2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894m<T> implements g2.e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0892k f22446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22447b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.b f22448c;

    /* renamed from: d, reason: collision with root package name */
    public final g2.d<T, byte[]> f22449d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0895n f22450e;

    public C0894m(AbstractC0892k abstractC0892k, String str, g2.b bVar, g2.d<T, byte[]> dVar, InterfaceC0895n interfaceC0895n) {
        this.f22446a = abstractC0892k;
        this.f22447b = str;
        this.f22448c = bVar;
        this.f22449d = dVar;
        this.f22450e = interfaceC0895n;
    }

    @Override // g2.e
    public final void a(g2.c<T> cVar) {
        v vVar = new v();
        AbstractC0892k abstractC0892k = this.f22446a;
        if (abstractC0892k == null) {
            throw new NullPointerException("Null transportContext");
        }
        if (cVar == null) {
            throw new NullPointerException("Null event");
        }
        String str = this.f22447b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        g2.d<T, byte[]> dVar = this.f22449d;
        if (dVar == null) {
            throw new NullPointerException("Null transformer");
        }
        g2.b bVar = this.f22448c;
        if (bVar == null) {
            throw new NullPointerException("Null encoding");
        }
        C0883b c0883b = new C0883b(abstractC0892k, str, cVar, dVar, bVar);
        o oVar = (o) this.f22450e;
        oVar.getClass();
        g2.c<?> cVar2 = c0883b.f22423c;
        Priority c2 = cVar2.c();
        AbstractC0892k abstractC0892k2 = c0883b.f22421a;
        abstractC0892k2.getClass();
        C0884c.a a10 = AbstractC0892k.a();
        a10.b(abstractC0892k2.b());
        a10.c(c2);
        a10.f22430b = abstractC0892k2.c();
        C0884c a11 = a10.a();
        C0882a.C0415a c0415a = new C0882a.C0415a();
        c0415a.f22420f = new HashMap();
        c0415a.f22418d = Long.valueOf(oVar.f22452a.a());
        c0415a.f22419e = Long.valueOf(oVar.f22453b.a());
        String str2 = c0883b.f22422b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        c0415a.f22415a = str2;
        c0415a.f22417c = new C0887f(c0883b.f22425e, c0883b.f22424d.apply(cVar2.b()));
        c0415a.f22416b = cVar2.a();
        oVar.f22454c.a(a11, c0415a.b(), vVar);
    }
}
