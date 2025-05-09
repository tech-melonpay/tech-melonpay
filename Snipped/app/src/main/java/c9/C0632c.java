package c9;

import Qa.l;
import U8.k;
import U8.r;
import U8.s;
import Y8.b;
import Y8.b.a.C0051a.C0052a;
import android.text.TextUtils;
import d9.AbstractC0698a;
import d9.C0699b;
import e9.AbstractC0727a;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: ImageHandler.java */
/* renamed from: c9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0632c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final a f8600a;

    /* compiled from: ImageHandler.java */
    /* renamed from: c9.c$a */
    public interface a {
    }

    public C0632c(C0633d c0633d) {
        this.f8600a = c0633d;
    }

    @Override // Y8.l
    public final Collection<String> b() {
        return Collections.singleton("img");
    }

    @Override // c9.f
    public final Object d(U8.g gVar, r rVar, Y8.e eVar) {
        s a10;
        C0699b.a aVar;
        C0699b.a aVar2;
        String str = eVar.d().get("src");
        C0699b c0699b = null;
        if (TextUtils.isEmpty(str) || (a10 = ((k) gVar.f3682e).a(l.class)) == null) {
            return null;
        }
        ((AbstractC0727a.C0394a) gVar.f3681d).getClass();
        Map<String, String> d10 = eVar.d();
        C0633d c0633d = (C0633d) this.f8600a;
        c0633d.getClass();
        String str2 = d10.get("style");
        if (!TextUtils.isEmpty(str2)) {
            ((b.a) c0633d.f8601a).getClass();
            b.a.C0051a.C0052a c0052a = new b.a.C0051a(str2).new C0052a();
            aVar = null;
            aVar2 = null;
            while (c0052a.hasNext()) {
                Y8.c cVar = (Y8.c) c0052a.next();
                String str3 = cVar.f4128a;
                if ("width".equals(str3)) {
                    aVar = C0633d.a(cVar.f4129b);
                } else if ("height".equals(str3)) {
                    aVar2 = C0633d.a(cVar.f4129b);
                }
                if (aVar != null && aVar2 != null) {
                    break;
                }
            }
        } else {
            aVar = null;
            aVar2 = null;
        }
        if (aVar == null || aVar2 == null) {
            if (aVar == null) {
                aVar = C0633d.a(d10.get("width"));
            }
            if (aVar2 == null) {
                aVar2 = C0633d.a(d10.get("height"));
            }
            if (aVar != null || aVar2 != null) {
                c0699b = new C0699b(aVar, aVar2);
            }
        } else {
            c0699b = new C0699b(aVar, aVar2);
        }
        AbstractC0698a.f20480a.b(rVar, str);
        AbstractC0698a.f20482c.b(rVar, c0699b);
        AbstractC0698a.f20481b.b(rVar, Boolean.FALSE);
        return a10.a(gVar, rVar);
    }
}
