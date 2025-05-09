package c9;

import U8.o;
import U8.r;
import U8.t;
import Y8.l;

/* compiled from: SimpleTagHandler.java */
/* loaded from: classes2.dex */
public abstract class f extends l {
    @Override // Y8.l
    public final void a(U8.l lVar, Ha.c cVar, Y8.e eVar) {
        if (eVar.c()) {
            l.c(lVar, cVar, eVar.b());
        }
        o oVar = (o) lVar;
        Object d10 = d(oVar.f3698a, oVar.f3699b, eVar);
        if (d10 != null) {
            t.d(oVar.f3700c, d10, eVar.start(), eVar.f());
        }
    }

    public abstract Object d(U8.g gVar, r rVar, Y8.e eVar);
}
