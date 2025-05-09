package r9;

import j9.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadWorker.java */
/* loaded from: classes2.dex */
public class e extends h.a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f26339a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f26340b;

    public e(ThreadFactory threadFactory) {
        boolean z10 = f.f26341a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f.f26341a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f.f26344d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f26339a = newScheduledThreadPool;
    }
}
