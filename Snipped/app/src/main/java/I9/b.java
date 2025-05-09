package I9;

import I9.b;
import I9.l;
import io.sentry.C0852j;
import io.sentry.DataCategory;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.c0;
import io.sentry.clientreport.DiscardReason;
import io.sentry.g0;
import io.sentry.transport.ReusableCountLatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncHttpTransport.java */
/* loaded from: classes2.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.transport.a f1917a;

    /* renamed from: b, reason: collision with root package name */
    public final B9.e f1918b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryOptions f1919c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1920d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1921e;

    /* renamed from: f, reason: collision with root package name */
    public final d f1922f;

    /* compiled from: AsyncHttpTransport.java */
    public static final class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f1923a;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder("SentryAsyncConnection-");
            int i = this.f1923a;
            this.f1923a = i + 1;
            sb2.append(i);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: AsyncHttpTransport.java */
    /* renamed from: I9.b$b, reason: collision with other inner class name */
    public final class RunnableC0023b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final B1.f f1924a;

        /* renamed from: b, reason: collision with root package name */
        public final C0852j f1925b;

        /* renamed from: c, reason: collision with root package name */
        public final B9.e f1926c;

        /* renamed from: d, reason: collision with root package name */
        public final l.a f1927d = new l.a(-1);

        public RunnableC0023b(B1.f fVar, C0852j c0852j, B9.e eVar) {
            D9.b.t0(fVar, "Envelope is required.");
            this.f1924a = fVar;
            this.f1925b = c0852j;
            D9.b.t0(eVar, "EnvelopeCache is required.");
            this.f1926c = eVar;
        }

        public static /* synthetic */ void a(RunnableC0023b runnableC0023b, l lVar, E9.i iVar) {
            b.this.f1919c.getLogger().h(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(lVar.b()));
            iVar.b(lVar.b());
        }

        public final l b() {
            B9.e eVar = this.f1926c;
            B1.f fVar = this.f1924a;
            C0852j c0852j = this.f1925b;
            eVar.T(fVar, c0852j);
            Object b9 = J9.b.b(c0852j);
            HashMap hashMap = c0852j.f22047a;
            boolean isInstance = E9.c.class.isInstance(hashMap.get("sentry:typeCheckHint"));
            b bVar = b.this;
            if (isInstance && b9 != null) {
                ((E9.c) b9).a();
                bVar.f1919c.getLogger().h(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
            boolean isConnected = bVar.f1921e.isConnected();
            SentryOptions sentryOptions = bVar.f1919c;
            if (!isConnected) {
                Object obj = hashMap.get("sentry:typeCheckHint");
                if (!E9.f.class.isInstance(hashMap.get("sentry:typeCheckHint")) || obj == null) {
                    D9.b.o0(E9.f.class, obj, sentryOptions.getLogger());
                    sentryOptions.getClientReportRecorder().e(DiscardReason.NETWORK_ERROR, fVar);
                } else {
                    ((E9.f) obj).c(true);
                }
                return this.f1927d;
            }
            B1.f g10 = sentryOptions.getClientReportRecorder().g(fVar);
            try {
                l d10 = bVar.f1922f.d(g10);
                if (d10.b()) {
                    eVar.d(fVar);
                    return d10;
                }
                String str = "The transport failed to send the envelope with response code " + d10.a();
                sentryOptions.getLogger().h(SentryLevel.ERROR, str, new Object[0]);
                if (d10.a() >= 400 && d10.a() != 429) {
                    Object obj2 = hashMap.get("sentry:typeCheckHint");
                    if (!E9.f.class.isInstance(hashMap.get("sentry:typeCheckHint")) || obj2 == null) {
                        sentryOptions.getClientReportRecorder().e(DiscardReason.NETWORK_ERROR, g10);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                Object obj3 = hashMap.get("sentry:typeCheckHint");
                if (!E9.f.class.isInstance(hashMap.get("sentry:typeCheckHint")) || obj3 == null) {
                    D9.b.o0(E9.f.class, obj3, sentryOptions.getLogger());
                    sentryOptions.getClientReportRecorder().e(DiscardReason.NETWORK_ERROR, g10);
                } else {
                    ((E9.f) obj3).c(true);
                }
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar;
            C0852j c0852j = this.f1925b;
            b bVar = b.this;
            try {
                lVar = b();
            } catch (Throwable th) {
                th = th;
                lVar = this.f1927d;
            }
            try {
                bVar.f1919c.getLogger().h(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                try {
                    bVar.f1919c.getLogger().d(SentryLevel.ERROR, th, "Envelope submission failed", new Object[0]);
                    throw th;
                } finally {
                    Object b9 = J9.b.b(c0852j);
                    if (E9.i.class.isInstance(c0852j.f22047a.get("sentry:typeCheckHint")) && b9 != null) {
                        a(this, lVar, (E9.i) b9);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [I9.a] */
    public b(SentryOptions sentryOptions, k kVar, g gVar, B1.f fVar) {
        int maxQueueSize = sentryOptions.getMaxQueueSize();
        final B9.e envelopeDiskCache = sentryOptions.getEnvelopeDiskCache();
        final InterfaceC0859q logger = sentryOptions.getLogger();
        io.sentry.transport.a aVar = new io.sentry.transport.a(maxQueueSize, new a(), new RejectedExecutionHandler() { // from class: I9.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b.RunnableC0023b) {
                    b.RunnableC0023b runnableC0023b = (b.RunnableC0023b) runnable;
                    boolean c2 = J9.b.c(runnableC0023b.f1925b, E9.b.class);
                    C0852j c0852j = runnableC0023b.f1925b;
                    if (!c2) {
                        B9.e.this.T(runnableC0023b.f1924a, c0852j);
                    }
                    Object b9 = J9.b.b(c0852j);
                    HashMap hashMap = c0852j.f22047a;
                    if (E9.i.class.isInstance(hashMap.get("sentry:typeCheckHint")) && b9 != null) {
                        ((E9.i) b9).b(false);
                    }
                    Object obj = hashMap.get("sentry:typeCheckHint");
                    if (E9.f.class.isInstance(hashMap.get("sentry:typeCheckHint")) && obj != null) {
                        ((E9.f) obj).c(true);
                    }
                    logger.h(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger);
        d dVar = new d(sentryOptions, fVar, kVar);
        this.f1917a = aVar;
        B9.e envelopeDiskCache2 = sentryOptions.getEnvelopeDiskCache();
        D9.b.t0(envelopeDiskCache2, "envelopeCache is required");
        this.f1918b = envelopeDiskCache2;
        this.f1919c = sentryOptions;
        this.f1920d = kVar;
        D9.b.t0(gVar, "transportGate is required");
        this.f1921e = gVar;
        this.f1922f = dVar;
    }

    @Override // I9.f
    public final void a(long j10) {
        io.sentry.transport.a aVar = this.f1917a;
        aVar.getClass();
        try {
            ReusableCountLatch reusableCountLatch = aVar.f22208c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            reusableCountLatch.getClass();
            reusableCountLatch.f22204a.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
        } catch (InterruptedException e10) {
            aVar.f22207b.f(SentryLevel.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.transport.a aVar = this.f1917a;
        aVar.shutdown();
        SentryOptions sentryOptions = this.f1919c;
        sentryOptions.getLogger().h(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        try {
            if (aVar.awaitTermination(1L, TimeUnit.MINUTES)) {
                return;
            }
            sentryOptions.getLogger().h(SentryLevel.WARNING, "Failed to shutdown the async connection async sender within 1 minute. Trying to force it now.", new Object[0]);
            aVar.shutdownNow();
        } catch (InterruptedException unused) {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // I9.f
    public final void m(B1.f fVar, C0852j c0852j) {
        boolean z10;
        B9.e eVar;
        B1.f fVar2;
        DataCategory dataCategory;
        Date date;
        boolean isInstance = E9.b.class.isInstance(J9.b.b(c0852j));
        SentryOptions sentryOptions = this.f1919c;
        B9.e eVar2 = this.f1918b;
        if (isInstance) {
            eVar = h.f1936a;
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        } else {
            z10 = false;
            eVar = eVar2;
        }
        k kVar = this.f1920d;
        kVar.getClass();
        Iterable<g0> iterable = (Iterable) fVar.f230c;
        Iterator it = iterable.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean hasNext = it.hasNext();
            SentryOptions sentryOptions2 = kVar.f1941b;
            if (!hasNext) {
                SentryOptions sentryOptions3 = sentryOptions;
                HashMap hashMap = c0852j.f22047a;
                if (arrayList != null) {
                    sentryOptions2.getLogger().h(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (g0 g0Var : iterable) {
                        if (!arrayList.contains(g0Var)) {
                            arrayList2.add(g0Var);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        sentryOptions2.getLogger().h(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                        Object obj = hashMap.get("sentry:typeCheckHint");
                        if (E9.i.class.isInstance(hashMap.get("sentry:typeCheckHint")) && obj != null) {
                            ((E9.i) obj).b(false);
                        }
                        Object obj2 = hashMap.get("sentry:typeCheckHint");
                        if (E9.f.class.isInstance(hashMap.get("sentry:typeCheckHint")) && obj2 != null) {
                            ((E9.f) obj2).c(false);
                        }
                        fVar2 = null;
                    } else {
                        fVar2 = new B1.f((c0) fVar.f229b, arrayList2);
                    }
                } else {
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    if (z10) {
                        eVar2.d(fVar);
                        return;
                    }
                    return;
                }
                if (E9.c.class.isInstance(hashMap.get("sentry:typeCheckHint"))) {
                    fVar2 = sentryOptions3.getClientReportRecorder().g(fVar2);
                }
                Future<?> submit = this.f1917a.submit(new RunnableC0023b(fVar2, c0852j, eVar));
                if (submit == null || !submit.isCancelled()) {
                    return;
                }
                sentryOptions3.getClientReportRecorder().e(DiscardReason.QUEUE_OVERFLOW, fVar2);
                return;
            }
            g0 g0Var2 = (g0) it.next();
            String itemType = g0Var2.f22004a.f22011c.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    dataCategory = DataCategory.Attachment;
                    break;
                case "event":
                    dataCategory = DataCategory.Error;
                    break;
                case "session":
                    dataCategory = DataCategory.Session;
                    break;
                case "transaction":
                    dataCategory = DataCategory.Transaction;
                    break;
                default:
                    dataCategory = DataCategory.Unknown;
                    break;
            }
            SentryOptions sentryOptions4 = sentryOptions;
            Date date2 = new Date(kVar.f1940a.a());
            ConcurrentHashMap concurrentHashMap = kVar.f1942c;
            Date date3 = (Date) concurrentHashMap.get(DataCategory.All);
            if (date3 == null || date2.after(date3)) {
                if (!DataCategory.Unknown.equals(dataCategory) && (date = (Date) concurrentHashMap.get(dataCategory)) != null) {
                    if (!(!date2.after(date))) {
                    }
                }
                sentryOptions = sentryOptions4;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(g0Var2);
            sentryOptions2.getClientReportRecorder().i(DiscardReason.RATELIMIT_BACKOFF, g0Var2);
            sentryOptions = sentryOptions4;
        }
    }
}
