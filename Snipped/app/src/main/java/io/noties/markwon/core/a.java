package io.noties.markwon.core;

import Qa.q;
import Qa.r;
import Qa.s;
import U8.l;
import U8.o;
import U8.p;
import io.noties.markwon.core.CoreProps;

/* compiled from: CorePlugin.java */
/* loaded from: classes2.dex */
public final class a implements l.c<q> {
    @Override // U8.l.c
    public final void a(r rVar, l lVar) {
        q qVar = (q) rVar;
        o oVar = (o) lVar;
        int e10 = oVar.e();
        oVar.i(qVar);
        Qa.a aVar = (Qa.a) qVar.f3227a;
        boolean z10 = aVar instanceof s;
        p<CoreProps.ListItemType> pVar = CoreProps.f21669a;
        U8.r rVar2 = oVar.f3699b;
        if (z10) {
            s sVar = (s) aVar;
            int i = sVar.f3232g;
            pVar.b(rVar2, CoreProps.ListItemType.f21677b);
            CoreProps.f21671c.b(rVar2, Integer.valueOf(i));
            sVar.f3232g++;
        } else {
            pVar.b(rVar2, CoreProps.ListItemType.f21676a);
            p<Integer> pVar2 = CoreProps.f21670b;
            int i9 = 0;
            for (r c2 = qVar.c(); c2 != null; c2 = c2.c()) {
                if (c2 instanceof q) {
                    i9++;
                }
            }
            pVar2.b(rVar2, Integer.valueOf(i9));
        }
        oVar.g(qVar, e10);
        if (qVar.f3231e != null) {
            oVar.d();
        }
    }
}
