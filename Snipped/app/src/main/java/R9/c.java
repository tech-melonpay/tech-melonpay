package r9;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import k9.C0955a;

/* compiled from: IoScheduler.java */
/* loaded from: classes2.dex */
public final class c extends j9.h {

    /* renamed from: b, reason: collision with root package name */
    public static final RxThreadFactory f26330b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f26333e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f26334a;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeUnit f26332d = TimeUnit.SECONDS;

    /* renamed from: c, reason: collision with root package name */
    public static final long f26331c = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue<b> f26335a;

        /* renamed from: b, reason: collision with root package name */
        public final C0955a f26336b;

        /* renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f26337c;

        /* renamed from: d, reason: collision with root package name */
        public final ScheduledFuture f26338d;

        public a(long j10, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f26335a = new ConcurrentLinkedQueue<>();
            this.f26336b = new C0955a();
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, c.f26330b);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f26337c = scheduledExecutorService;
            this.f26338d = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f26335a.isEmpty()) {
                return;
            }
            long nanoTime = System.nanoTime();
            Iterator<b> it = this.f26335a.iterator();
            while (it.hasNext()) {
                b next = it.next();
                next.getClass();
                if (0 > nanoTime) {
                    return;
                }
                if (this.f26335a.remove(next)) {
                    C0955a c0955a = this.f26336b;
                    c0955a.getClass();
                    if (c0955a.f23052a) {
                        continue;
                    } else {
                        synchronized (c0955a) {
                            try {
                                if (c0955a.f23052a) {
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: IoScheduler.java */
    public static final class b extends e {
    }

    static {
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadSchedulerShutdown");
        boolean z10 = f.f26341a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (f.f26341a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f.f26344d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        newScheduledThreadPool.shutdownNow();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        new RxThreadFactory("RxCachedThreadScheduler", max, false);
        f26330b = new RxThreadFactory("RxCachedWorkerPoolEvictor", max, false);
        a aVar = new a(0L, null);
        f26333e = aVar;
        C0955a c0955a = aVar.f26336b;
        if (!c0955a.f23052a) {
            synchronized (c0955a) {
                try {
                    if (!c0955a.f23052a) {
                        c0955a.f23052a = true;
                    }
                } finally {
                }
            }
        }
        ScheduledFuture scheduledFuture = aVar.f26338d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f26337c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public c() {
        AtomicReference<a> atomicReference;
        a aVar = f26333e;
        this.f26334a = new AtomicReference<>(aVar);
        a aVar2 = new a(f26331c, f26332d);
        do {
            atomicReference = this.f26334a;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        C0955a c0955a = aVar2.f26336b;
        if (!c0955a.f23052a) {
            synchronized (c0955a) {
                try {
                    if (!c0955a.f23052a) {
                        c0955a.f23052a = true;
                    }
                } finally {
                }
            }
        }
        ScheduledFuture scheduledFuture = aVar2.f26338d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.f26337c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }
}
