package c9;

import U8.k;
import U8.o;
import U8.s;
import U8.t;
import Y8.l;
import java.util.Collection;
import java.util.Collections;

/* compiled from: BlockquoteHandler.java */
/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0630a extends l {
    @Override // Y8.l
    public final void a(U8.l lVar, Ha.c cVar, Y8.e eVar) {
        if (eVar.c()) {
            l.c(lVar, cVar, eVar.b());
        }
        o oVar = (o) lVar;
        U8.g gVar = oVar.f3698a;
        s a10 = ((k) gVar.f3682e).a(Qa.b.class);
        if (a10 != null) {
            t.d(oVar.f3700c, a10.a(gVar, oVar.f3699b), eVar.start(), eVar.f());
        }
    }

    @Override // Y8.l
    public final Collection<String> b() {
        return Collections.singleton("blockquote");
    }
}
