package W8;

import U8.g;
import U8.r;
import U8.s;
import X8.c;
import X8.d;
import X8.e;
import X8.f;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.LinkSpan;

/* compiled from: BlockQuoteSpanFactory.java */
/* loaded from: classes2.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3879a;

    @Override // U8.s
    public final Object a(g gVar, r rVar) {
        switch (this.f3879a) {
            case 0:
                return new X8.a(gVar.f3678a, 0);
            case 1:
                return new c(gVar.f3678a);
            case 2:
                return new d(gVar.f3678a);
            case 3:
                return new e(0);
            case 4:
                return new f(gVar.f3678a, CoreProps.f21672d.a(rVar).intValue());
            case 5:
                return new LinkSpan(gVar.f3678a, CoreProps.f21673e.a(rVar), gVar.f3680c);
            case 6:
                return new e(1);
            default:
                return new X8.a(gVar.f3678a, 1);
        }
    }
}
