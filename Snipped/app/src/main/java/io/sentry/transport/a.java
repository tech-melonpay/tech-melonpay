package io.sentry.transport;

import I9.b;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.transport.ReusableCountLatch;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: QueuedThreadPoolExecutor.java */
/* loaded from: classes2.dex */
public final class a extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final int f22206a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0859q f22207b;

    /* renamed from: c, reason: collision with root package name */
    public final ReusableCountLatch f22208c;

    /* compiled from: QueuedThreadPoolExecutor.java */
    /* renamed from: io.sentry.transport.a$a, reason: collision with other inner class name */
    public static final class FutureC0413a<T> implements Future<T> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public a(int i, b.a aVar, I9.a aVar2, InterfaceC0859q interfaceC0859q) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), aVar, aVar2);
        this.f22208c = new ReusableCountLatch();
        this.f22206a = i;
        this.f22207b = interfaceC0859q;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        ReusableCountLatch reusableCountLatch = this.f22208c;
        try {
            super.afterExecute(runnable, th);
        } finally {
            reusableCountLatch.getClass();
            int i = ReusableCountLatch.Sync.f22205a;
            reusableCountLatch.f22204a.releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        ReusableCountLatch reusableCountLatch = this.f22208c;
        if (ReusableCountLatch.Sync.a(reusableCountLatch.f22204a) < this.f22206a) {
            ReusableCountLatch.Sync.b(reusableCountLatch.f22204a);
            return super.submit(runnable);
        }
        this.f22207b.h(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
        return new FutureC0413a();
    }
}
