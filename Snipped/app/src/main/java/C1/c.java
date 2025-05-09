package C1;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import s1.AbstractC1197g;
import s1.InterfaceC1199i;
import t1.C1278c;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1278c f609a = new C1278c();

    public static void a(t1.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f27440c;
        B1.q f10 = workDatabase.f();
        B1.b a10 = workDatabase.a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            B1.r rVar = (B1.r) f10;
            WorkInfo$State f11 = rVar.f(str2);
            if (f11 != WorkInfo$State.f8104c && f11 != WorkInfo$State.f8105d) {
                rVar.m(WorkInfo$State.f8107f, str2);
            }
            linkedList.addAll(((B1.c) a10).a(str2));
        }
        t1.d dVar = kVar.f27443f;
        synchronized (dVar.f27419k) {
            try {
                AbstractC1197g.c().a(t1.d.f27409l, "Processor cancelling " + str, new Throwable[0]);
                dVar.i.add(str);
                t1.m mVar = (t1.m) dVar.f27415f.remove(str);
                boolean z10 = mVar != null;
                if (mVar == null) {
                    mVar = (t1.m) dVar.f27416g.remove(str);
                }
                t1.d.c(str, mVar);
                if (z10) {
                    dVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<t1.e> it = kVar.f27442e.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        C1278c c1278c = this.f609a;
        try {
            b();
            c1278c.a(InterfaceC1199i.f26514a);
        } catch (Throwable th) {
            c1278c.a(new InterfaceC1199i.a.C0470a(th));
        }
    }
}
