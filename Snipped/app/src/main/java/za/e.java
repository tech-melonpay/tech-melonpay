package za;

import O9.m;
import O9.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.k;

/* compiled from: RealCall.kt */
/* loaded from: classes2.dex */
public final class e implements va.b {

    /* renamed from: a, reason: collision with root package name */
    public final va.h f31381a;

    /* renamed from: b, reason: collision with root package name */
    public final k f31382b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31383c;

    /* renamed from: d, reason: collision with root package name */
    public final g f31384d;

    /* renamed from: e, reason: collision with root package name */
    public final va.f f31385e;

    /* renamed from: f, reason: collision with root package name */
    public final c f31386f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f31387g;

    /* renamed from: h, reason: collision with root package name */
    public Object f31388h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public okhttp3.internal.connection.a f31389j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31390k;

    /* renamed from: l, reason: collision with root package name */
    public za.c f31391l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31392m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31393n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31394o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f31395p;

    /* renamed from: q, reason: collision with root package name */
    public volatile za.c f31396q;

    /* renamed from: r, reason: collision with root package name */
    public volatile okhttp3.internal.connection.a f31397r;

    /* compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final va.c f31398a;

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f31399b = new AtomicInteger(0);

        public a(va.c cVar) {
            this.f31398a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            va.e eVar;
            String str = "OkHttp " + e.this.f31382b.f24644a.h();
            e eVar2 = e.this;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                eVar2.f31386f.i();
                boolean z10 = false;
                try {
                    try {
                    } catch (IOException e10) {
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        this.f31398a.a(eVar2.e());
                        eVar = eVar2.f31381a.f30702a;
                    } catch (IOException e11) {
                        e = e11;
                        z10 = true;
                        if (z10) {
                            Ea.h hVar = Ea.h.f1121a;
                            Ea.h hVar2 = Ea.h.f1121a;
                            String str2 = "Callback failure for " + e.a(eVar2);
                            hVar2.getClass();
                            Ea.h.i(4, str2, e);
                        } else {
                            this.f31398a.b(e);
                        }
                        eVar = eVar2.f31381a.f30702a;
                        eVar.b(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        eVar2.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            m.a(iOException, th);
                            this.f31398a.b(iOException);
                        }
                        throw th;
                    }
                    eVar.b(this);
                } catch (Throwable th3) {
                    eVar2.f31381a.f30702a.b(this);
                    throw th3;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f31401a;

        public b(e eVar, Object obj) {
            super(eVar);
            this.f31401a = obj;
        }
    }

    /* compiled from: RealCall.kt */
    public static final class c extends Ka.b {
        public c() {
        }

        @Override // Ka.b
        public final void l() {
            e.this.cancel();
        }
    }

    public e(va.h hVar, k kVar, boolean z10) {
        this.f31381a = hVar;
        this.f31382b = kVar;
        this.f31383c = z10;
        this.f31384d = (g) hVar.f30703b.f535b;
        this.f31385e = (va.f) ((com.sumsub.sns.geo.presentation.d) hVar.f30706e).f14425b;
        c cVar = new c();
        cVar.g(hVar.f30724x, TimeUnit.MILLISECONDS);
        this.f31386f = cVar;
        this.f31387g = new AtomicBoolean();
        this.f31394o = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.f31395p ? "canceled " : "");
        sb2.append(eVar.f31383c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(eVar.f31382b.f24644a.h());
        return sb2.toString();
    }

    public final void b(okhttp3.internal.connection.a aVar) {
        byte[] bArr = wa.b.f30872a;
        if (this.f31389j != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f31389j = aVar;
        aVar.f24612p.add(new b(this, this.f31388h));
    }

    public final <E extends IOException> E c(E e10) {
        E interruptedIOException;
        Socket h9;
        byte[] bArr = wa.b.f30872a;
        okhttp3.internal.connection.a aVar = this.f31389j;
        if (aVar != null) {
            synchronized (aVar) {
                h9 = h();
            }
            if (this.f31389j == null) {
                if (h9 != null) {
                    wa.b.d(h9);
                }
                this.f31385e.getClass();
            } else if (h9 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.f31390k && this.f31386f.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 != null) {
            this.f31385e.getClass();
        } else {
            this.f31385e.getClass();
        }
        return interruptedIOException;
    }

    @Override // va.b
    public final void cancel() {
        Socket socket;
        if (this.f31395p) {
            return;
        }
        this.f31395p = true;
        za.c cVar = this.f31396q;
        if (cVar != null) {
            cVar.f31357d.cancel();
        }
        okhttp3.internal.connection.a aVar = this.f31397r;
        if (aVar != null && (socket = aVar.f24600c) != null) {
            wa.b.d(socket);
        }
        this.f31385e.getClass();
    }

    public final Object clone() {
        return new e(this.f31381a, this.f31382b, this.f31383c);
    }

    public final void d(boolean z10) {
        za.c cVar;
        synchronized (this) {
            if (!this.f31394o) {
                throw new IllegalStateException("released".toString());
            }
            p pVar = p.f3034a;
        }
        if (z10 && (cVar = this.f31396q) != null) {
            cVar.f31357d.cancel();
            cVar.f31354a.f(cVar, true, true, null);
        }
        this.f31391l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.p e() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            va.h r0 = r12.f31381a
            java.util.List<va.g> r0 = r0.f30704c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            P9.q.x(r2, r0)
            Aa.h r0 = new Aa.h
            va.h r1 = r12.f31381a
            r0.<init>(r1)
            r2.add(r0)
            Aa.a r0 = new Aa.a
            va.h r1 = r12.f31381a
            va.a r1 = r1.f30710j
            r0.<init>(r1)
            r2.add(r0)
            xa.a r0 = new xa.a
            va.h r1 = r12.f31381a
            okhttp3.b r1 = r1.f30711k
            r0.<init>(r1)
            r2.add(r0)
            za.a r0 = za.a.f31349a
            r2.add(r0)
            boolean r0 = r12.f31383c
            if (r0 != 0) goto L42
            va.h r0 = r12.f31381a
            java.util.List<va.g> r0 = r0.f30705d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            P9.q.x(r2, r0)
        L42:
            Aa.b r0 = new Aa.b
            boolean r1 = r12.f31383c
            r0.<init>(r1)
            r2.add(r0)
            Aa.f r9 = new Aa.f
            okhttp3.k r10 = r12.f31382b
            va.h r0 = r12.f31381a
            int r6 = r0.f30725y
            int r7 = r0.f30726z
            int r8 = r0.f30698A
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.p r2 = r9.a(r10)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            boolean r3 = r12.f31395p     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            if (r3 != 0) goto L6e
            r12.g(r0)
            return r2
        L6e:
            wa.b.c(r2)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            throw r2     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
        L79:
            r2 = move-exception
            goto L86
        L7b:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r12.g(r1)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L86:
            if (r1 != 0) goto L8b
            r12.g(r0)
        L8b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: za.e.e():okhttp3.p");
    }

    @Override // va.b
    public final okhttp3.p execute() {
        if (!this.f31387g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f31386f.i();
        Ea.h hVar = Ea.h.f1121a;
        this.f31388h = Ea.h.f1121a.g();
        this.f31385e.getClass();
        try {
            va.e eVar = this.f31381a.f30702a;
            synchronized (eVar) {
                eVar.f30694f.add(this);
            }
            return e();
        } finally {
            va.e eVar2 = this.f31381a.f30702a;
            eVar2.a(eVar2.f30694f, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:50:0x000e, B:12:0x001d, B:14:0x0021, B:15:0x0023, B:17:0x0027, B:21:0x0030, B:23:0x0034, B:27:0x003d, B:9:0x0017), top: B:49:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:50:0x000e, B:12:0x001d, B:14:0x0021, B:15:0x0023, B:17:0x0027, B:21:0x0030, B:23:0x0034, B:27:0x003d, B:9:0x0017), top: B:49:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E f(za.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            za.c r0 = r2.f31396q
            boolean r3 = kotlin.jvm.internal.f.b(r3, r0)
            if (r3 != 0) goto L9
            return r6
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.f31392m     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1b
            goto L15
        L13:
            r3 = move-exception
            goto L5c
        L15:
            if (r5 == 0) goto L3c
            boolean r1 = r2.f31393n     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L3c
        L1b:
            if (r4 == 0) goto L1f
            r2.f31392m = r0     // Catch: java.lang.Throwable -> L13
        L1f:
            if (r5 == 0) goto L23
            r2.f31393n = r0     // Catch: java.lang.Throwable -> L13
        L23:
            boolean r4 = r2.f31392m     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2d
            boolean r5 = r2.f31393n     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2d
            r5 = r3
            goto L2e
        L2d:
            r5 = r0
        L2e:
            if (r4 != 0) goto L39
            boolean r4 = r2.f31393n     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L39
            boolean r4 = r2.f31394o     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L39
            r0 = r3
        L39:
            r4 = r0
            r0 = r5
            goto L3d
        L3c:
            r4 = r0
        L3d:
            O9.p r5 = O9.p.f3034a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            if (r0 == 0) goto L54
            r5 = 0
            r2.f31396q = r5
            okhttp3.internal.connection.a r5 = r2.f31389j
            if (r5 == 0) goto L54
            monitor-enter(r5)
            int r0 = r5.f24609m     // Catch: java.lang.Throwable -> L51
            int r0 = r0 + r3
            r5.f24609m = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r5)
            goto L54
        L51:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L54:
            if (r4 == 0) goto L5b
            java.io.IOException r3 = r2.c(r6)
            return r3
        L5b:
            return r6
        L5c:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: za.e.f(za.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException g(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f31394o) {
                    this.f31394o = false;
                    if (!this.f31392m && !this.f31393n) {
                        z10 = true;
                    }
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket h() {
        okhttp3.internal.connection.a aVar = this.f31389j;
        byte[] bArr = wa.b.f30872a;
        ArrayList arrayList = aVar.f24612p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.f.b(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.f31389j = null;
        if (arrayList.isEmpty()) {
            aVar.f24613q = System.nanoTime();
            g gVar = this.f31384d;
            gVar.getClass();
            byte[] bArr2 = wa.b.f30872a;
            boolean z10 = aVar.f24606j;
            ya.c cVar = gVar.f31406c;
            if (z10 || gVar.f31404a == 0) {
                aVar.f24606j = true;
                ConcurrentLinkedQueue<okhttp3.internal.connection.a> concurrentLinkedQueue = gVar.f31408e;
                concurrentLinkedQueue.remove(aVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                return aVar.f24601d;
            }
            cVar.c(gVar.f31407d, 0L);
        }
        return null;
    }

    @Override // va.b
    public final boolean isCanceled() {
        return this.f31395p;
    }

    @Override // va.b
    public final k request() {
        return this.f31382b;
    }

    @Override // va.b
    public final void y(va.c cVar) {
        a aVar;
        if (!this.f31387g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        Ea.h hVar = Ea.h.f1121a;
        this.f31388h = Ea.h.f1121a.g();
        this.f31385e.getClass();
        va.e eVar = this.f31381a.f30702a;
        a aVar2 = new a(cVar);
        synchronized (eVar) {
            eVar.f30692d.add(aVar2);
            if (!this.f31383c) {
                String str = this.f31382b.f24644a.f24528d;
                Iterator<a> it = eVar.f30693e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = eVar.f30692d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aVar = null;
                                break;
                            } else {
                                aVar = it2.next();
                                if (kotlin.jvm.internal.f.b(e.this.f31382b.f24644a.f24528d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        aVar = it.next();
                        if (kotlin.jvm.internal.f.b(e.this.f31382b.f24644a.f24528d, str)) {
                            break;
                        }
                    }
                }
                if (aVar != null) {
                    aVar2.f31399b = aVar.f31399b;
                }
            }
            p pVar = p.f3034a;
        }
        eVar.c();
    }
}
