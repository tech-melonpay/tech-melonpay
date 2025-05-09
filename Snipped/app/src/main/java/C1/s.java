package C1;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import s1.AbstractC1197g;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f651e = AbstractC1197g.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f652a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f653b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f654c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f655d;

    /* compiled from: WorkTimer.java */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f656a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f656a);
            this.f656a = this.f656a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final s f657a;

        /* renamed from: b, reason: collision with root package name */
        public final String f658b;

        public c(s sVar, String str) {
            this.f657a = sVar;
            this.f658b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f657a.f655d) {
                try {
                    if (((c) this.f657a.f653b.remove(this.f658b)) != null) {
                        b bVar = (b) this.f657a.f654c.remove(this.f658b);
                        if (bVar != null) {
                            bVar.a(this.f658b);
                        }
                    } else {
                        AbstractC1197g.c().a("WrkTimerRunnable", "Timer with " + this.f658b + " is already marked as complete.", new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public s() {
        a aVar = new a();
        aVar.f656a = 0;
        this.f653b = new HashMap();
        this.f654c = new HashMap();
        this.f655d = new Object();
        this.f652a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.f655d) {
            AbstractC1197g.c().a(f651e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f653b.put(str, cVar);
            this.f654c.put(str, bVar);
            this.f652a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f655d) {
            try {
                if (((c) this.f653b.remove(str)) != null) {
                    AbstractC1197g.c().a(f651e, "Stopping timer for " + str, new Throwable[0]);
                    this.f654c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
