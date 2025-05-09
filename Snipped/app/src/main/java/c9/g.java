package c9;

import U8.k;
import U8.o;
import U8.s;
import U8.t;
import Y8.l;
import android.text.style.StrikethroughSpan;
import java.util.Arrays;
import java.util.Collection;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;

/* compiled from: StrikeHandler.java */
/* loaded from: classes2.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8602a;

    static {
        boolean z10;
        try {
            Class.forName("org.commonmark.ext.gfm.strikethrough.Strikethrough");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f8602a = z10;
    }

    public static Object d(U8.l lVar) {
        o oVar = (o) lVar;
        U8.g c2 = oVar.c();
        s a10 = ((k) c2.a()).a(Strikethrough.class);
        if (a10 == null) {
            return null;
        }
        return a10.a(c2, oVar.f());
    }

    @Override // Y8.l
    public final void a(U8.l lVar, Ha.c cVar, Y8.e eVar) {
        if (eVar.c()) {
            l.c(lVar, cVar, eVar.b());
        }
        t.d(((o) lVar).f3700c, f8602a ? d(lVar) : new StrikethroughSpan(), eVar.start(), eVar.f());
    }

    @Override // Y8.l
    public final Collection<String> b() {
        return Arrays.asList("s", "del");
    }
}
