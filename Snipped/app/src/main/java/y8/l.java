package Y8;

import Y8.e;
import java.util.Collection;

/* compiled from: TagHandler.java */
/* loaded from: classes2.dex */
public abstract class l {
    public static void c(U8.l lVar, Ha.c cVar, e.a aVar) {
        for (e.a aVar2 : aVar.e()) {
            if (aVar2.isClosed()) {
                l L7 = cVar.L(aVar2.name());
                if (L7 != null) {
                    L7.a(lVar, cVar, aVar2);
                } else {
                    c(lVar, cVar, aVar2);
                }
            }
        }
    }

    public abstract void a(U8.l lVar, Ha.c cVar, e eVar);

    public abstract Collection<String> b();
}
