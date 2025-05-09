package t1;

import C.v;
import C1.n;
import a3.InterfaceFutureC0509a;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import k0.C0913a;
import s1.AbstractC1197g;
import s1.C1194d;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class d implements InterfaceC1277b, A1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f27409l = AbstractC1197g.e("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f27411b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.a f27412c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.a f27413d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f27414e;

    /* renamed from: h, reason: collision with root package name */
    public final List<e> f27417h;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f27416g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f27415f = new HashMap();
    public final HashSet i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27418j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f27410a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f27419k = new Object();

    /* compiled from: Processor.java */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC1277b f27420a;

        /* renamed from: b, reason: collision with root package name */
        public String f27421b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceFutureC0509a<Boolean> f27422c;

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.f27422c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f27420a.b(this.f27421b, z10);
        }
    }

    public d(Context context, androidx.work.a aVar, D1.b bVar, WorkDatabase workDatabase, List list) {
        this.f27411b = context;
        this.f27412c = aVar;
        this.f27413d = bVar;
        this.f27414e = workDatabase;
        this.f27417h = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z10;
        if (mVar == null) {
            AbstractC1197g.c().a(f27409l, s3.b.j("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f27466r = true;
        mVar.i();
        InterfaceFutureC0509a<ListenableWorker.a> interfaceFutureC0509a = mVar.f27465q;
        if (interfaceFutureC0509a != null) {
            z10 = interfaceFutureC0509a.isDone();
            mVar.f27465q.cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = mVar.f27454e;
        if (listenableWorker == null || z10) {
            AbstractC1197g.c().a(m.f27449s, "WorkSpec " + mVar.f27453d + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.g();
        }
        AbstractC1197g.c().a(f27409l, s3.b.j("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(InterfaceC1277b interfaceC1277b) {
        synchronized (this.f27419k) {
            this.f27418j.add(interfaceC1277b);
        }
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        synchronized (this.f27419k) {
            try {
                this.f27416g.remove(str);
                AbstractC1197g.c().a(f27409l, d.class.getSimpleName() + " " + str + " executed; reschedule = " + z10, new Throwable[0]);
                Iterator it = this.f27418j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1277b) it.next()).b(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z10;
        synchronized (this.f27419k) {
            try {
                z10 = this.f27416g.containsKey(str) || this.f27415f.containsKey(str);
            } finally {
            }
        }
        return z10;
    }

    public final void e(InterfaceC1277b interfaceC1277b) {
        synchronized (this.f27419k) {
            this.f27418j.remove(interfaceC1277b);
        }
    }

    public final void f(String str, C1194d c1194d) {
        synchronized (this.f27419k) {
            try {
                AbstractC1197g.c().d(f27409l, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f27416g.remove(str);
                if (mVar != null) {
                    if (this.f27410a == null) {
                        PowerManager.WakeLock a10 = n.a(this.f27411b, "ProcessorForegroundLck");
                        this.f27410a = a10;
                        a10.acquire();
                    }
                    this.f27415f.put(str, mVar);
                    C0913a.startForegroundService(this.f27411b, androidx.work.impl.foreground.a.c(this.f27411b, str, c1194d));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.f27419k) {
            try {
                if (d(str)) {
                    AbstractC1197g.c().a(f27409l, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f27411b;
                androidx.work.a aVar2 = this.f27412c;
                D1.a aVar3 = this.f27413d;
                WorkDatabase workDatabase = this.f27414e;
                Collections.emptyList();
                Collections.emptyList();
                Context applicationContext = context.getApplicationContext();
                List<e> list = this.f27417h;
                m mVar = new m();
                mVar.f27456g = new ListenableWorker.a.C0085a();
                mVar.f27464p = new androidx.work.impl.utils.futures.a<>();
                mVar.f27465q = null;
                mVar.f27450a = applicationContext;
                mVar.f27455f = aVar3;
                mVar.i = this;
                mVar.f27451b = str;
                mVar.f27452c = list;
                mVar.f27454e = null;
                mVar.f27457h = aVar2;
                mVar.f27458j = workDatabase;
                mVar.f27459k = workDatabase.f();
                mVar.f27460l = workDatabase.a();
                mVar.f27461m = workDatabase.g();
                androidx.work.impl.utils.futures.a<Boolean> aVar4 = mVar.f27464p;
                a aVar5 = new a();
                aVar5.f27420a = this;
                aVar5.f27421b = str;
                aVar5.f27422c = aVar4;
                aVar4.addListener(aVar5, ((D1.b) this.f27413d).f860c);
                this.f27416g.put(str, mVar);
                ((D1.b) this.f27413d).f858a.execute(mVar);
                AbstractC1197g.c().a(f27409l, v.p(d.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f27419k) {
            try {
                if (!(!this.f27415f.isEmpty())) {
                    Context context = this.f27411b;
                    String str = androidx.work.impl.foreground.a.f8201j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f27411b.startService(intent);
                    } catch (Throwable th) {
                        AbstractC1197g.c().b(f27409l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f27410a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f27410a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean c2;
        synchronized (this.f27419k) {
            AbstractC1197g.c().a(f27409l, "Processor stopping foreground work " + str, new Throwable[0]);
            c2 = c(str, (m) this.f27415f.remove(str));
        }
        return c2;
    }

    public final boolean j(String str) {
        boolean c2;
        synchronized (this.f27419k) {
            AbstractC1197g.c().a(f27409l, "Processor stopping background work " + str, new Throwable[0]);
            c2 = c(str, (m) this.f27416g.remove(str));
        }
        return c2;
    }
}
