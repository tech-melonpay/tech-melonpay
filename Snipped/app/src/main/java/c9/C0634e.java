package c9;

import Qa.q;
import U8.k;
import U8.o;
import U8.p;
import U8.r;
import U8.s;
import U8.t;
import Y8.e;
import Y8.f;
import Y8.l;
import io.noties.markwon.core.CoreProps;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: ListHandler.java */
/* renamed from: c9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0634e extends l {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y8.l
    public final void a(U8.l lVar, Ha.c cVar, Y8.e eVar) {
        if (eVar.c()) {
            e.a b9 = eVar.b();
            boolean equals = "ol".equals(b9.name());
            boolean equals2 = "ul".equals(b9.name());
            if (equals || equals2) {
                o oVar = (o) lVar;
                U8.g gVar = oVar.f3698a;
                s a10 = ((k) gVar.f3682e).a(q.class);
                int i = 0;
                f.a aVar = b9;
                while (true) {
                    aVar = aVar.a();
                    if (aVar == 0) {
                        break;
                    }
                    String str = aVar.f4136a;
                    if ("ul".equals(str) || "ol".equals(str)) {
                        i++;
                    }
                }
                int i9 = 1;
                for (e.a aVar2 : b9.e()) {
                    l.c(lVar, cVar, aVar2);
                    if (a10 != null && "li".equals(aVar2.name())) {
                        p<CoreProps.ListItemType> pVar = CoreProps.f21669a;
                        r rVar = oVar.f3699b;
                        if (equals) {
                            pVar.b(rVar, CoreProps.ListItemType.f21677b);
                            CoreProps.f21671c.b(rVar, Integer.valueOf(i9));
                            i9++;
                        } else {
                            pVar.b(rVar, CoreProps.ListItemType.f21676a);
                            CoreProps.f21670b.b(rVar, Integer.valueOf(i));
                        }
                        t.d(oVar.f3700c, a10.a(gVar, rVar), aVar2.start(), aVar2.f());
                    }
                }
            }
        }
    }

    @Override // Y8.l
    public final Collection<String> b() {
        return Arrays.asList("ol", "ul");
    }
}
