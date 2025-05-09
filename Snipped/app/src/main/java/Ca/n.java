package Ca;

import Ka.w;
import Ka.y;
import Ka.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: Http2Stream.kt */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f814a;

    /* renamed from: b, reason: collision with root package name */
    public final d f815b;

    /* renamed from: c, reason: collision with root package name */
    public long f816c;

    /* renamed from: d, reason: collision with root package name */
    public long f817d;

    /* renamed from: e, reason: collision with root package name */
    public long f818e;

    /* renamed from: f, reason: collision with root package name */
    public long f819f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<okhttp3.g> f820g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f821h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final a f822j;

    /* renamed from: k, reason: collision with root package name */
    public final c f823k;

    /* renamed from: l, reason: collision with root package name */
    public final c f824l;

    /* renamed from: m, reason: collision with root package name */
    public ErrorCode f825m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f826n;

    /* compiled from: Http2Stream.kt */
    public final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f827a;

        /* renamed from: b, reason: collision with root package name */
        public final Ka.f f828b = new Ka.f();

        /* renamed from: c, reason: collision with root package name */
        public boolean f829c;

        public a(boolean z10) {
            this.f827a = z10;
        }

        @Override // Ka.w
        public final z b() {
            return n.this.f824l;
        }

        @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean z10;
            n nVar = n.this;
            byte[] bArr = wa.b.f30872a;
            synchronized (nVar) {
                if (this.f829c) {
                    return;
                }
                synchronized (nVar) {
                    z10 = nVar.f825m == null;
                    O9.p pVar = O9.p.f3034a;
                }
                n nVar2 = n.this;
                if (!nVar2.f822j.f827a) {
                    if (this.f828b.f2294b > 0) {
                        while (this.f828b.f2294b > 0) {
                            d(true);
                        }
                    } else if (z10) {
                        nVar2.f815b.C(nVar2.f814a, true, null, 0L);
                    }
                }
                synchronized (n.this) {
                    this.f829c = true;
                    O9.p pVar2 = O9.p.f3034a;
                }
                n.this.f815b.flush();
                n.this.a();
            }
        }

        public final void d(boolean z10) {
            long min;
            boolean z11;
            n nVar = n.this;
            synchronized (nVar) {
                try {
                    nVar.f824l.i();
                    while (nVar.f818e >= nVar.f819f && !this.f827a && !this.f829c) {
                        try {
                            synchronized (nVar) {
                                ErrorCode errorCode = nVar.f825m;
                                if (errorCode != null) {
                                    break;
                                } else {
                                    nVar.j();
                                }
                            }
                        } catch (Throwable th) {
                            nVar.f824l.m();
                            throw th;
                        }
                    }
                    nVar.f824l.m();
                    nVar.b();
                    min = Math.min(nVar.f819f - nVar.f818e, this.f828b.f2294b);
                    nVar.f818e += min;
                    z11 = z10 && min == this.f828b.f2294b;
                    O9.p pVar = O9.p.f3034a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n.this.f824l.i();
            try {
                n nVar2 = n.this;
                nVar2.f815b.C(nVar2.f814a, z11, this.f828b, min);
            } finally {
                n.this.f824l.m();
            }
        }

        @Override // Ka.w, java.io.Flushable
        public final void flush() {
            n nVar = n.this;
            byte[] bArr = wa.b.f30872a;
            synchronized (nVar) {
                nVar.b();
                O9.p pVar = O9.p.f3034a;
            }
            while (this.f828b.f2294b > 0) {
                d(false);
                n.this.f815b.flush();
            }
        }

        @Override // Ka.w
        public final void z(Ka.f fVar, long j10) {
            byte[] bArr = wa.b.f30872a;
            Ka.f fVar2 = this.f828b;
            fVar2.z(fVar, j10);
            while (fVar2.f2294b >= 16384) {
                d(false);
            }
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        public final long f831a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f832b;

        /* renamed from: c, reason: collision with root package name */
        public final Ka.f f833c = new Ka.f();

        /* renamed from: d, reason: collision with root package name */
        public final Ka.f f834d = new Ka.f();

        /* renamed from: e, reason: collision with root package name */
        public boolean f835e;

        public b(long j10, boolean z10) {
            this.f831a = j10;
            this.f832b = z10;
        }

        @Override // Ka.y
        public final z b() {
            return n.this.f823k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10;
            n nVar = n.this;
            synchronized (nVar) {
                this.f835e = true;
                Ka.f fVar = this.f834d;
                j10 = fVar.f2294b;
                fVar.d();
                nVar.notifyAll();
                O9.p pVar = O9.p.f3034a;
            }
            if (j10 > 0) {
                byte[] bArr = wa.b.f30872a;
                n.this.f815b.A(j10);
            }
            n.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[LOOP:0: B:3:0x000a->B:41:0x0087, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC] */
        @Override // Ka.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long i0(Ka.f r17, long r18) {
            /*
                Method dump skipped, instructions count: 185
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ca.n.b.i0(Ka.f, long):long");
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class c extends Ka.b {
        public c() {
        }

        @Override // Ka.b
        public final IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // Ka.b
        public final void l() {
            n.this.e(ErrorCode.CANCEL);
            d dVar = n.this.f815b;
            synchronized (dVar) {
                long j10 = dVar.f744p;
                long j11 = dVar.f743o;
                if (j10 < j11) {
                    return;
                }
                dVar.f743o = j11 + 1;
                dVar.f745q = System.nanoTime() + 1000000000;
                O9.p pVar = O9.p.f3034a;
                dVar.i.c(new k(androidx.camera.core.impl.utils.a.n(new StringBuilder(), dVar.f733d, " ping"), dVar, 0), 0L);
            }
        }

        public final void m() {
            if (j()) {
                throw k(null);
            }
        }
    }

    public n(int i, d dVar, boolean z10, boolean z11, okhttp3.g gVar) {
        this.f814a = i;
        this.f815b = dVar;
        this.f819f = dVar.f747s.a();
        ArrayDeque<okhttp3.g> arrayDeque = new ArrayDeque<>();
        this.f820g = arrayDeque;
        this.i = new b(dVar.f746r.a(), z11);
        this.f822j = new a(z10);
        this.f823k = new c();
        this.f824l = new c();
        if (gVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(gVar);
        }
    }

    public final void a() {
        boolean z10;
        boolean h9;
        byte[] bArr = wa.b.f30872a;
        synchronized (this) {
            try {
                b bVar = this.i;
                if (!bVar.f832b && bVar.f835e) {
                    a aVar = this.f822j;
                    if (aVar.f827a || aVar.f829c) {
                        z10 = true;
                        h9 = h();
                        O9.p pVar = O9.p.f3034a;
                    }
                }
                z10 = false;
                h9 = h();
                O9.p pVar2 = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (h9) {
                return;
            }
            this.f815b.p(this.f814a);
        }
    }

    public final void b() {
        a aVar = this.f822j;
        if (aVar.f829c) {
            throw new IOException("stream closed");
        }
        if (aVar.f827a) {
            throw new IOException("stream finished");
        }
        if (this.f825m != null) {
            IOException iOException = this.f826n;
            if (iOException == null) {
                throw new StreamResetException(this.f825m);
            }
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            this.f815b.f753y.A(this.f814a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = wa.b.f30872a;
        synchronized (this) {
            if (this.f825m != null) {
                return false;
            }
            this.f825m = errorCode;
            this.f826n = iOException;
            notifyAll();
            if (this.i.f832b && this.f822j.f827a) {
                return false;
            }
            O9.p pVar = O9.p.f3034a;
            this.f815b.p(this.f814a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.f815b.D(this.f814a, errorCode);
        }
    }

    public final a f() {
        synchronized (this) {
            try {
                if (!this.f821h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f822j;
    }

    public final boolean g() {
        return this.f815b.f730a == ((this.f814a & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f825m != null) {
            return false;
        }
        b bVar = this.i;
        if (bVar.f832b || bVar.f835e) {
            a aVar = this.f822j;
            if (aVar.f827a || aVar.f829c) {
                if (this.f821h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x001c, B:11:0x0020, B:19:0x0013), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(okhttp3.g r3, boolean r4) {
        /*
            r2 = this;
            byte[] r0 = wa.b.f30872a
            monitor-enter(r2)
            boolean r0 = r2.f821h     // Catch: java.lang.Throwable -> L11
            r1 = 1
            if (r0 == 0) goto L13
            if (r4 != 0) goto Lb
            goto L13
        Lb:
            Ca.n$b r3 = r2.i     // Catch: java.lang.Throwable -> L11
            r3.getClass()     // Catch: java.lang.Throwable -> L11
            goto L1a
        L11:
            r3 = move-exception
            goto L34
        L13:
            r2.f821h = r1     // Catch: java.lang.Throwable -> L11
            java.util.ArrayDeque<okhttp3.g> r0 = r2.f820g     // Catch: java.lang.Throwable -> L11
            r0.add(r3)     // Catch: java.lang.Throwable -> L11
        L1a:
            if (r4 == 0) goto L20
            Ca.n$b r3 = r2.i     // Catch: java.lang.Throwable -> L11
            r3.f832b = r1     // Catch: java.lang.Throwable -> L11
        L20:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L11
            r2.notifyAll()     // Catch: java.lang.Throwable -> L11
            O9.p r4 = O9.p.f3034a     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            if (r3 != 0) goto L33
            Ca.d r3 = r2.f815b
            int r4 = r2.f814a
            r3.p(r4)
        L33:
            return
        L34:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.n.i(okhttp3.g, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
