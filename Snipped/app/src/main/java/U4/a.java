package U4;

import I5.i;
import P9.n;
import h4.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ProfileRawMapper.kt */
/* loaded from: classes.dex */
public final class a {
    public static final i a(h hVar) {
        ArrayList arrayList;
        Integer num;
        String str;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Integer num2;
        String str2;
        ArrayList arrayList4;
        i.c.a aVar;
        String f10 = hVar.f();
        Integer m2 = hVar.m();
        String l10 = hVar.l();
        Integer o10 = hVar.o();
        String j10 = hVar.j();
        String d10 = hVar.d();
        String h9 = hVar.h();
        String g10 = hVar.g();
        Integer e10 = hVar.e();
        String b9 = hVar.b();
        Integer p10 = hVar.p();
        String n10 = hVar.n();
        h.a i = hVar.i();
        i.a aVar2 = i != null ? new i.a(i.d(), i.a(), i.b(), i.c(), i.e()) : null;
        List<h.b> c2 = hVar.c();
        if (c2 != null) {
            List<h.b> list = c2;
            ArrayList arrayList5 = new ArrayList(n.u(list, 10));
            for (h.b bVar : list) {
                arrayList5.add(new i.b(bVar.c(), bVar.d(), bVar.e(), bVar.a(), bVar.b()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<h.c> k3 = hVar.k();
        if (k3 != null) {
            List<h.c> list2 = k3;
            ArrayList arrayList6 = new ArrayList(n.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                h.c cVar = (h.c) it.next();
                Iterator it2 = it;
                String b10 = cVar.b();
                Boolean d11 = cVar.d();
                Integer e11 = cVar.e();
                String a10 = cVar.a();
                h.c.a c10 = cVar.c();
                if (c10 != null) {
                    arrayList4 = arrayList;
                    str2 = n10;
                    num2 = p10;
                    aVar = new i.c.a(c10.b(), c10.c(), c10.a());
                } else {
                    num2 = p10;
                    str2 = n10;
                    arrayList4 = arrayList;
                    aVar = null;
                }
                arrayList6.add(new i.c(b10, d11, e11, a10, aVar));
                it = it2;
                arrayList = arrayList4;
                n10 = str2;
                p10 = num2;
            }
            num = p10;
            str = n10;
            arrayList2 = arrayList;
            arrayList3 = arrayList6;
        } else {
            num = p10;
            str = n10;
            arrayList2 = arrayList;
            arrayList3 = null;
        }
        return new i(f10, m2, l10, o10, j10, d10, h9, g10, e10, b9, num, str, aVar2, arrayList2, arrayList3);
    }
}
