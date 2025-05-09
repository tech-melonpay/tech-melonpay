package A1;

import B1.p;
import B1.r;
import a3.InterfaceFutureC0509a;
import androidx.work.impl.WorkDatabase;
import s1.AbstractC1197g;
import t1.m;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f18a = i;
        this.f21d = obj;
        this.f19b = obj2;
        this.f20c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18a) {
            case 0:
                p h9 = ((r) ((WorkDatabase) this.f19b).f()).h((String) this.f20c);
                if (h9 == null || !h9.b()) {
                    return;
                }
                synchronized (((androidx.work.impl.foreground.a) this.f21d).f8204c) {
                    ((androidx.work.impl.foreground.a) this.f21d).f8207f.put((String) this.f20c, h9);
                    ((androidx.work.impl.foreground.a) this.f21d).f8208g.add(h9);
                    androidx.work.impl.foreground.a aVar = (androidx.work.impl.foreground.a) this.f21d;
                    aVar.f8209h.b(aVar.f8208g);
                }
                return;
            default:
                androidx.work.impl.utils.futures.a aVar2 = (androidx.work.impl.utils.futures.a) this.f20c;
                m mVar = (m) this.f21d;
                try {
                    ((InterfaceFutureC0509a) this.f19b).get();
                    AbstractC1197g.c().a(m.f27449s, "Starting work for " + mVar.f27453d.f245c, new Throwable[0]);
                    androidx.work.impl.utils.futures.a f10 = mVar.f27454e.f();
                    mVar.f27465q = f10;
                    aVar2.k(f10);
                    return;
                } catch (Throwable th) {
                    aVar2.j(th);
                    return;
                }
        }
    }
}
