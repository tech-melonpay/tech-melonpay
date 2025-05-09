package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HostnameCache.java */
/* renamed from: io.sentry.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0853k {

    /* renamed from: g, reason: collision with root package name */
    public static final long f22052g = TimeUnit.HOURS.toMillis(5);

    /* renamed from: h, reason: collision with root package name */
    public static final long f22053h = TimeUnit.SECONDS.toMillis(1);
    public static C0853k i;

    /* renamed from: a, reason: collision with root package name */
    public final long f22054a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f22055b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f22056c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f22057d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable<InetAddress> f22058e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f22059f;

    /* compiled from: HostnameCache.java */
    /* renamed from: io.sentry.k$a */
    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f22060a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
            int i = this.f22060a;
            this.f22060a = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public C0853k() {
        com.sumsub.sentry.h hVar = new com.sumsub.sentry.h(1);
        this.f22057d = new AtomicBoolean(false);
        this.f22059f = Executors.newSingleThreadExecutor(new a());
        this.f22054a = f22052g;
        this.f22058e = hVar;
        a();
    }

    public final void a() {
        try {
            this.f22059f.submit(new com.google.firebase.heartbeatinfo.a(this, 5)).get(f22053h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f22056c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f22056c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
