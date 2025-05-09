package ya;

import O9.p;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import wa.ThreadFactoryC1578a;

/* compiled from: TaskRunner.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f31189h = new d(new b(new ThreadFactoryC1578a(androidx.camera.core.impl.utils.a.n(new StringBuilder(), wa.b.f30878g, " TaskRunner"), true)));
    public static final Logger i = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final a f31190a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31192c;

    /* renamed from: d, reason: collision with root package name */
    public long f31193d;

    /* renamed from: b, reason: collision with root package name */
    public int f31191b = ModuleDescriptor.MODULE_VERSION;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31194e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f31195f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final e f31196g = new e(this);

    /* compiled from: TaskRunner.kt */
    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f31197a;

        public b(ThreadFactoryC1578a threadFactoryC1578a) {
            this.f31197a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC1578a);
        }

        @Override // ya.d.a
        public final void a(d dVar, long j10) {
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                dVar.wait(j11, (int) j12);
            }
        }

        @Override // ya.d.a
        public final void b(d dVar) {
            dVar.notify();
        }

        @Override // ya.d.a
        public final void execute(Runnable runnable) {
            this.f31197a.execute(runnable);
        }

        @Override // ya.d.a
        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    public d(b bVar) {
        this.f31190a = bVar;
    }

    public static final void a(d dVar, AbstractC1633a abstractC1633a) {
        dVar.getClass();
        byte[] bArr = wa.b.f30872a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC1633a.f31179a);
        try {
            long a10 = abstractC1633a.a();
            synchronized (dVar) {
                dVar.b(abstractC1633a, a10);
                p pVar = p.f3034a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(abstractC1633a, -1L);
                p pVar2 = p.f3034a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(AbstractC1633a abstractC1633a, long j10) {
        byte[] bArr = wa.b.f30872a;
        c cVar = abstractC1633a.f31181c;
        if (cVar.f31186d != abstractC1633a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z10 = cVar.f31188f;
        cVar.f31188f = false;
        cVar.f31186d = null;
        this.f31194e.remove(cVar);
        if (j10 != -1 && !z10 && !cVar.f31185c) {
            cVar.e(abstractC1633a, j10, true);
        }
        if (!cVar.f31187e.isEmpty()) {
            this.f31195f.add(cVar);
        }
    }

    public final AbstractC1633a c() {
        long j10;
        boolean z10;
        byte[] bArr = wa.b.f30872a;
        while (true) {
            ArrayList arrayList = this.f31195f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.f31190a;
            long nanoTime = aVar.nanoTime();
            Iterator it = arrayList.iterator();
            long j11 = Long.MAX_VALUE;
            AbstractC1633a abstractC1633a = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = nanoTime;
                    z10 = false;
                    break;
                }
                AbstractC1633a abstractC1633a2 = (AbstractC1633a) ((c) it.next()).f31187e.get(0);
                j10 = nanoTime;
                long max = Math.max(0L, abstractC1633a2.f31182d - nanoTime);
                if (max > 0) {
                    j11 = Math.min(max, j11);
                } else {
                    if (abstractC1633a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC1633a = abstractC1633a2;
                }
                nanoTime = j10;
            }
            if (abstractC1633a != null) {
                byte[] bArr2 = wa.b.f30872a;
                abstractC1633a.f31182d = -1L;
                c cVar = abstractC1633a.f31181c;
                cVar.f31187e.remove(abstractC1633a);
                arrayList.remove(cVar);
                cVar.f31186d = abstractC1633a;
                this.f31194e.add(cVar);
                if (z10 || (!this.f31192c && (!arrayList.isEmpty()))) {
                    aVar.execute(this.f31196g);
                }
                return abstractC1633a;
            }
            if (this.f31192c) {
                if (j11 >= this.f31193d - j10) {
                    return null;
                }
                aVar.b(this);
                return null;
            }
            this.f31192c = true;
            this.f31193d = j10 + j11;
            try {
                try {
                    aVar.a(this, j11);
                } catch (InterruptedException unused) {
                    d();
                }
            } finally {
                this.f31192c = false;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f31194e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((c) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f31195f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f31187e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        byte[] bArr = wa.b.f30872a;
        if (cVar.f31186d == null) {
            boolean z10 = !cVar.f31187e.isEmpty();
            ArrayList arrayList = this.f31195f;
            if (!z10) {
                arrayList.remove(cVar);
            } else if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        boolean z11 = this.f31192c;
        a aVar = this.f31190a;
        if (z11) {
            aVar.b(this);
        } else {
            aVar.execute(this.f31196g);
        }
    }

    public final c f() {
        int i9;
        synchronized (this) {
            i9 = this.f31191b;
            this.f31191b = i9 + 1;
        }
        return new c(this, com.google.android.gms.measurement.internal.a.g(i9, "Q"));
    }
}
