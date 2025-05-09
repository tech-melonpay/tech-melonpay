package androidx.work.impl.background.systemalarm;

import C1.n;
import C1.s;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import s1.AbstractC1197g;
import t1.InterfaceC1277b;
import t1.k;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class d implements InterfaceC1277b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f8177k = AbstractC1197g.e("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f8178a;

    /* renamed from: b, reason: collision with root package name */
    public final D1.a f8179b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8180c;

    /* renamed from: d, reason: collision with root package name */
    public final t1.d f8181d;

    /* renamed from: e, reason: collision with root package name */
    public final k f8182e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f8183f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f8184g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8185h;
    public Intent i;

    /* renamed from: j, reason: collision with root package name */
    public c f8186j;

    /* compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0088d runnableC0088d;
            synchronized (d.this.f8185h) {
                d dVar2 = d.this;
                dVar2.i = (Intent) dVar2.f8185h.get(0);
            }
            Intent intent = d.this.i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.i.getIntExtra("KEY_START_ID", 0);
                AbstractC1197g c2 = AbstractC1197g.c();
                String str = d.f8177k;
                c2.a(str, String.format("Processing command %s, %s", d.this.i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a10 = n.a(d.this.f8178a, action + " (" + intExtra + ")");
                try {
                    AbstractC1197g.c().a(str, "Acquiring operation wake lock (" + action + ") " + a10, new Throwable[0]);
                    a10.acquire();
                    d dVar3 = d.this;
                    dVar3.f8183f.d(intExtra, dVar3.i, dVar3);
                    AbstractC1197g.c().a(str, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    runnableC0088d = new RunnableC0088d(dVar);
                } catch (Throwable th) {
                    try {
                        AbstractC1197g c10 = AbstractC1197g.c();
                        String str2 = d.f8177k;
                        c10.b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC1197g.c().a(str2, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                        a10.release();
                        dVar = d.this;
                        runnableC0088d = new RunnableC0088d(dVar);
                    } catch (Throwable th2) {
                        AbstractC1197g.c().a(d.f8177k, "Releasing operation wake lock (" + action + ") " + a10, new Throwable[0]);
                        a10.release();
                        d dVar4 = d.this;
                        dVar4.e(new RunnableC0088d(dVar4));
                        throw th2;
                    }
                }
                dVar.e(runnableC0088d);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f8188a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f8189b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8190c;

        public b(int i, Intent intent, d dVar) {
            this.f8188a = dVar;
            this.f8189b = intent;
            this.f8190c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8188a.a(this.f8190c, this.f8189b);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0088d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f8191a;

        public RunnableC0088d(d dVar) {
            this.f8191a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            d dVar = this.f8191a;
            dVar.getClass();
            AbstractC1197g c2 = AbstractC1197g.c();
            String str = d.f8177k;
            c2.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.f8185h) {
                try {
                    if (dVar.i != null) {
                        AbstractC1197g.c().a(str, String.format("Removing command %s", dVar.i), new Throwable[0]);
                        if (!((Intent) dVar.f8185h.remove(0)).equals(dVar.i)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        dVar.i = null;
                    }
                    C1.k kVar = ((D1.b) dVar.f8179b).f858a;
                    androidx.work.impl.background.systemalarm.a aVar = dVar.f8183f;
                    synchronized (aVar.f8163c) {
                        z10 = !aVar.f8162b.isEmpty();
                    }
                    if (!z10 && dVar.f8185h.isEmpty()) {
                        synchronized (kVar.f619c) {
                            z11 = !kVar.f617a.isEmpty();
                        }
                        if (!z11) {
                            AbstractC1197g.c().a(str, "No more commands & intents.", new Throwable[0]);
                            c cVar = dVar.f8186j;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).a();
                            }
                        }
                    }
                    if (!dVar.f8185h.isEmpty()) {
                        dVar.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f8178a = applicationContext;
        this.f8183f = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f8180c = new s();
        k b9 = k.b(context);
        this.f8182e = b9;
        t1.d dVar = b9.f27443f;
        this.f8181d = dVar;
        this.f8179b = b9.f27441d;
        dVar.a(this);
        this.f8185h = new ArrayList();
        this.i = null;
        this.f8184g = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        AbstractC1197g c2 = AbstractC1197g.c();
        String str = f8177k;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC1197g.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f8185h) {
                try {
                    Iterator it = this.f8185h.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f8185h) {
            try {
                boolean z10 = !this.f8185h.isEmpty();
                this.f8185h.add(intent);
                if (!z10) {
                    f();
                }
            } finally {
            }
        }
    }

    @Override // t1.InterfaceC1277b
    public final void b(String str, boolean z10) {
        String str2 = androidx.work.impl.background.systemalarm.a.f8160d;
        Intent intent = new Intent(this.f8178a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b(0, intent, this));
    }

    public final void c() {
        if (this.f8184g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        AbstractC1197g.c().a(f8177k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f8181d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f8180c.f652a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f8186j = null;
    }

    public final void e(Runnable runnable) {
        this.f8184g.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a10 = n.a(this.f8178a, "ProcessCommand");
        try {
            a10.acquire();
            ((D1.b) this.f8182e.f27441d).a(new a());
        } finally {
            a10.release();
        }
    }
}
