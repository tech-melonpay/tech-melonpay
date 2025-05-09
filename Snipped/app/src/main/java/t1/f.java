package t1;

import B1.p;
import B1.q;
import B1.r;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.AbstractC1197g;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f27423a = AbstractC1197g.e("Schedulers");

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q f10 = workDatabase.f();
        workDatabase.beginTransaction();
        try {
            r rVar = (r) f10;
            ArrayList c2 = rVar.c(aVar.f8125h);
            ArrayList b9 = rVar.b();
            if (c2.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    rVar.j(((p) it.next()).f243a, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (c2.size() > 0) {
                p[] pVarArr = (p[]) c2.toArray(new p[c2.size()]);
                for (e eVar : list) {
                    if (eVar.a()) {
                        eVar.f(pVarArr);
                    }
                }
            }
            if (b9.size() > 0) {
                p[] pVarArr2 = (p[]) b9.toArray(new p[b9.size()]);
                for (e eVar2 : list) {
                    if (!eVar2.a()) {
                        eVar2.f(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
