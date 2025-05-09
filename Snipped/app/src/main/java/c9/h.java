package c9;

import U8.o;
import U8.t;
import Y8.l;
import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: UnderlineHandler.java */
/* loaded from: classes2.dex */
public final class h extends l {
    @Override // Y8.l
    public final void a(U8.l lVar, Ha.c cVar, Y8.e eVar) {
        if (eVar.c()) {
            l.c(lVar, cVar, eVar.b());
        }
        t.d(((o) lVar).f3700c, new UnderlineSpan(), eVar.start(), eVar.f());
    }

    @Override // Y8.l
    public final Collection<String> b() {
        return Arrays.asList("u", "ins");
    }
}
