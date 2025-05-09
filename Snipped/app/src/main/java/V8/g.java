package V8;

import Qa.r;
import Qa.w;
import U8.l;
import V8.o;
import java.util.Iterator;

/* compiled from: CorePlugin.java */
/* loaded from: classes2.dex */
public final class g implements l.c<w> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3751a;

    public g(o oVar) {
        this.f3751a = oVar;
    }

    @Override // U8.l.c
    public final void a(r rVar, U8.l lVar) {
        String str = ((w) rVar).f3234f;
        U8.o oVar = (U8.o) lVar;
        oVar.f3700c.f3708a.append(str);
        o oVar2 = this.f3751a;
        if (oVar2.f3752a.isEmpty()) {
            return;
        }
        int e10 = oVar.e() - str.length();
        Iterator it = oVar2.f3752a.iterator();
        while (it.hasNext()) {
            ((o.a) it.next()).a(lVar, str, e10);
        }
    }
}
