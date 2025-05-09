package Y8;

import Y8.e;
import java.util.List;

/* compiled from: MarkwonHtmlRendererImpl.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U8.l f4150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f4151b;

    public i(j jVar, U8.l lVar) {
        this.f4151b = jVar;
        this.f4150a = lVar;
    }

    public final void a(List<e.a> list) {
        for (e.a aVar : list) {
            if (aVar.isClosed()) {
                String name = aVar.name();
                Ha.c cVar = this.f4151b;
                l L7 = cVar.L(name);
                if (L7 != null) {
                    L7.a(this.f4150a, cVar, aVar);
                } else {
                    a(aVar.e());
                }
            }
        }
    }
}
