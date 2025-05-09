package com.sumsub.sentry;

import ca.InterfaceC0635a;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final b f13692g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final long f13693h = TimeUnit.HOURS.toMillis(5);
    public static final long i = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: j, reason: collision with root package name */
    public static final O9.f<k> f13694j = kotlin.a.a(a.f13701a);

    /* renamed from: a, reason: collision with root package name */
    public final long f13695a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable<InetAddress> f13696b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f13697c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f13698d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13699e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f13700f;

    public static final class a extends Lambda implements InterfaceC0635a<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13701a = new a();

        public a() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return (k) k.f13694j.getValue();
        }

        public b() {
        }
    }

    public static final class c implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f13702a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryHostnameCache-");
            int i = this.f13702a;
            this.f13702a = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final InetAddress a() {
        return InetAddress.getLocalHost();
    }

    public final void c() {
        this.f13700f.shutdown();
    }

    public final String d() {
        if (this.f13698d < System.currentTimeMillis() && this.f13699e.compareAndSet(false, true)) {
            g();
        }
        return this.f13697c;
    }

    public final void e() {
        this.f13698d = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
    }

    public final void g() {
        try {
            this.f13700f.submit(new com.google.firebase.heartbeatinfo.a(this, 3)).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            e();
        } catch (RuntimeException unused2) {
            e();
        } catch (ExecutionException unused3) {
            e();
        } catch (TimeoutException unused4) {
            e();
        }
    }

    public k(long j10, Callable<InetAddress> callable) {
        this.f13695a = j10;
        this.f13696b = callable;
        this.f13699e = new AtomicBoolean(false);
        this.f13700f = Executors.newSingleThreadExecutor(new c());
        g();
    }

    public static final Void a(k kVar) {
        try {
            kVar.f13697c = kVar.f13696b.call().getCanonicalHostName();
            kVar.f13698d = System.currentTimeMillis() + kVar.f13695a;
            kVar.f13699e.set(false);
            return null;
        } catch (Throwable th) {
            kVar.f13699e.set(false);
            throw th;
        }
    }

    public /* synthetic */ k(long j10, Callable callable, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i9 & 2) != 0 ? new h(0) : callable);
    }

    public k() {
        this(f13693h, null, 2, null);
    }
}
