package V8;

import Qa.r;
import Qa.s;
import Qa.u;
import Qa.v;
import Qa.w;
import Qa.x;
import U8.j;
import U8.k;
import U8.l;
import U8.o;
import U8.t;
import io.noties.markwon.core.CoreProps;
import java.util.ArrayList;

/* compiled from: CorePlugin.java */
/* loaded from: classes2.dex */
public final class o extends U8.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3752a = new ArrayList(0);

    /* compiled from: CorePlugin.java */
    public interface a {
        void a(U8.l lVar, String str, int i);
    }

    public static void a(U8.l lVar, String str, String str2, r rVar) {
        U8.o oVar = (U8.o) lVar;
        oVar.b();
        int e10 = oVar.e();
        t tVar = oVar.f3700c;
        tVar.f3708a.append((char) 160);
        StringBuilder sb2 = tVar.f3708a;
        sb2.append('\n');
        oVar.f3698a.f3679b.getClass();
        tVar.c(sb2.length(), str2);
        sb2.append((CharSequence) str2);
        oVar.d();
        tVar.a((char) 160);
        CoreProps.f21675g.b(oVar.f3699b, str);
        oVar.g(rVar, e10);
        oVar.a(rVar);
    }

    @Override // U8.a, U8.i
    public final void configureSpansFactory(j.a aVar) {
        W8.a aVar2 = new W8.a(1);
        k.a aVar3 = (k.a) aVar;
        aVar3.a(v.class, new W8.a(6));
        aVar3.a(Qa.f.class, new W8.a(3));
        aVar3.a(Qa.b.class, new W8.a(0));
        aVar3.a(Qa.d.class, new W8.a(2));
        aVar3.a(Qa.g.class, aVar2);
        aVar3.a(Qa.m.class, aVar2);
        aVar3.a(Qa.q.class, new W8.b());
        aVar3.a(Qa.i.class, new W8.a(4));
        aVar3.a(Qa.n.class, new W8.a(5));
        aVar3.a(x.class, new W8.a(7));
    }

    @Override // U8.a, U8.i
    public final void configureVisitor(l.b bVar) {
        o.a aVar = (o.a) bVar;
        aVar.a(w.class, new g(this));
        aVar.a(v.class, new h());
        aVar.a(Qa.f.class, new i());
        aVar.a(Qa.b.class, new j());
        aVar.a(Qa.d.class, new k());
        aVar.a(Qa.g.class, new l());
        aVar.a(Qa.m.class, new m());
        aVar.a(Qa.l.class, new n());
        aVar.a(Qa.c.class, new q());
        aVar.a(s.class, new q());
        aVar.a(Qa.q.class, new io.noties.markwon.core.a());
        aVar.a(x.class, new V8.a());
        aVar.a(Qa.i.class, new b());
        aVar.a(u.class, new c());
        aVar.a(Qa.h.class, new d());
        aVar.a(Qa.t.class, new e());
        aVar.a(Qa.n.class, new f());
    }
}
