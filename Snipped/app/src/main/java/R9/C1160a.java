package r9;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler.java */
/* renamed from: r9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1160a extends j9.h {

    /* renamed from: b, reason: collision with root package name */
    public static final C0466a f26325b;

    /* renamed from: c, reason: collision with root package name */
    public static final RxThreadFactory f26326c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26327d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<C0466a> f26328a;

    /* compiled from: ComputationScheduler.java */
    /* renamed from: r9.a$a, reason: collision with other inner class name */
    public static final class C0466a {

        /* renamed from: a, reason: collision with root package name */
        public final b[] f26329a;

        public C0466a(ThreadFactory threadFactory, int i) {
            this.f26329a = new b[i];
            for (int i9 = 0; i9 < i; i9++) {
                this.f26329a[i9] = new b(threadFactory);
            }
        }
    }

    /* compiled from: ComputationScheduler.java */
    /* renamed from: r9.a$b */
    public static final class b extends e {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f26327d = availableProcessors;
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationShutdown");
        boolean z10 = f.f26341a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (f.f26341a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f.f26344d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        newScheduledThreadPool.shutdownNow();
        RxThreadFactory rxThreadFactory2 = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f26326c = rxThreadFactory2;
        C0466a c0466a = new C0466a(rxThreadFactory2, 0);
        f26325b = c0466a;
        for (b bVar : c0466a.f26329a) {
            if (!bVar.f26340b) {
                bVar.f26340b = true;
                bVar.f26339a.shutdownNow();
            }
        }
    }

    public C1160a() {
        AtomicReference<C0466a> atomicReference;
        RxThreadFactory rxThreadFactory = f26326c;
        C0466a c0466a = f26325b;
        this.f26328a = new AtomicReference<>(c0466a);
        C0466a c0466a2 = new C0466a(rxThreadFactory, f26327d);
        do {
            atomicReference = this.f26328a;
            if (atomicReference.compareAndSet(c0466a, c0466a2)) {
                return;
            }
        } while (atomicReference.get() == c0466a);
        for (b bVar : c0466a2.f26329a) {
            if (!bVar.f26340b) {
                bVar.f26340b = true;
                bVar.f26339a.shutdownNow();
            }
        }
    }
}
