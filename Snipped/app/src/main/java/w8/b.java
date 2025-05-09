package W8;

import U8.g;
import U8.r;
import U8.s;
import X8.h;
import io.noties.markwon.core.CoreProps;

/* compiled from: ListItemSpanFactory.java */
/* loaded from: classes2.dex */
public final class b implements s {
    @Override // U8.s
    public final Object a(g gVar, r rVar) {
        if (CoreProps.ListItemType.f21676a == CoreProps.f21669a.a(rVar)) {
            return new X8.b(gVar.f3678a, CoreProps.f21670b.a(rVar).intValue());
        }
        return new h(gVar.f3678a, String.valueOf(CoreProps.f21671c.a(rVar)).concat(". "));
    }
}
