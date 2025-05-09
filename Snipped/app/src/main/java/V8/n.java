package V8;

import Qa.r;
import U8.l;
import U8.s;
import U8.t;
import d9.AbstractC0698a;
import e9.AbstractC0727a;

/* compiled from: CorePlugin.java */
/* loaded from: classes2.dex */
public final class n implements l.c<Qa.l> {
    @Override // U8.l.c
    public final void a(r rVar, U8.l lVar) {
        Qa.l lVar2 = (Qa.l) rVar;
        U8.o oVar = (U8.o) lVar;
        s a10 = ((U8.k) oVar.f3698a.f3682e).a(Qa.l.class);
        if (a10 == null) {
            oVar.i(lVar2);
            return;
        }
        int e10 = oVar.e();
        oVar.i(lVar2);
        int e11 = oVar.e();
        t tVar = oVar.f3700c;
        if (e10 == e11) {
            tVar.a((char) 65532);
        }
        boolean z10 = lVar2.f3227a instanceof Qa.n;
        U8.g gVar = oVar.f3698a;
        ((AbstractC0727a.C0394a) gVar.f3681d).getClass();
        U8.p<String> pVar = AbstractC0698a.f20480a;
        String str = lVar2.f3218f;
        U8.r rVar2 = oVar.f3699b;
        pVar.b(rVar2, str);
        AbstractC0698a.f20481b.b(rVar2, Boolean.valueOf(z10));
        AbstractC0698a.f20482c.b(rVar2, null);
        t.d(tVar, a10.a(gVar, rVar2), e10, tVar.f3708a.length());
    }
}
