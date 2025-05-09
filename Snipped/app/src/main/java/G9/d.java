package g9;

import Qa.r;
import Ra.c;
import U8.l;
import U8.o;
import U8.t;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SimpleExtPlugin.java */
/* loaded from: classes2.dex */
public final class d extends U8.a {

    /* renamed from: a, reason: collision with root package name */
    public final C0771a f20844a = new C0771a();

    /* compiled from: SimpleExtPlugin.java */
    public class a implements l.c<c> {
        @Override // U8.l.c
        public final void a(r rVar, l lVar) {
            c cVar = (c) rVar;
            o oVar = (o) lVar;
            int e10 = oVar.e();
            oVar.i(cVar);
            t.d(oVar.f3700c, cVar.f20843f.a(oVar.f3698a, oVar.f3699b), e10, oVar.e());
        }
    }

    @Override // U8.a, U8.i
    public final void configureParser(c.a aVar) {
        C0771a c0771a = this.f20844a;
        if (c0771a.f20837a) {
            throw new IllegalStateException("SimpleExtBuilder is already built, do not mutate SimpleExtPlugin after configuration is finished");
        }
        c0771a.f20837a = true;
        Iterator it = ((ArrayList) c0771a.f20838b).iterator();
        while (it.hasNext()) {
            Ta.a aVar2 = (Ta.a) it.next();
            if (aVar2 == null) {
                aVar.getClass();
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            aVar.f3325b.add(aVar2);
        }
    }

    @Override // U8.a, U8.i
    public final void configureVisitor(l.b bVar) {
        ((o.a) bVar).a(c.class, new a());
    }
}
