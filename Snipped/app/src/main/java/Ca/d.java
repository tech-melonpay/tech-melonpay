package Ca;

import C.v;
import Ca.m;
import Ca.n;
import ca.InterfaceC0635a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import ya.AbstractC1633a;

/* compiled from: Http2Connection.kt */
/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    public static final r f728B;

    /* renamed from: A, reason: collision with root package name */
    public final LinkedHashSet f729A;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f730a;

    /* renamed from: b, reason: collision with root package name */
    public final b f731b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f732c;

    /* renamed from: d, reason: collision with root package name */
    public final String f733d;

    /* renamed from: e, reason: collision with root package name */
    public int f734e;

    /* renamed from: f, reason: collision with root package name */
    public int f735f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f736g;

    /* renamed from: h, reason: collision with root package name */
    public final ya.d f737h;
    public final ya.c i;

    /* renamed from: j, reason: collision with root package name */
    public final ya.c f738j;

    /* renamed from: k, reason: collision with root package name */
    public final ya.c f739k;

    /* renamed from: l, reason: collision with root package name */
    public final q f740l;

    /* renamed from: m, reason: collision with root package name */
    public long f741m;

    /* renamed from: n, reason: collision with root package name */
    public long f742n;

    /* renamed from: o, reason: collision with root package name */
    public long f743o;

    /* renamed from: p, reason: collision with root package name */
    public long f744p;

    /* renamed from: q, reason: collision with root package name */
    public long f745q;

    /* renamed from: r, reason: collision with root package name */
    public final r f746r;

    /* renamed from: s, reason: collision with root package name */
    public r f747s;

    /* renamed from: t, reason: collision with root package name */
    public long f748t;

    /* renamed from: u, reason: collision with root package name */
    public long f749u;

    /* renamed from: v, reason: collision with root package name */
    public long f750v;

    /* renamed from: w, reason: collision with root package name */
    public long f751w;

    /* renamed from: x, reason: collision with root package name */
    public final Socket f752x;

    /* renamed from: y, reason: collision with root package name */
    public final o f753y;

    /* renamed from: z, reason: collision with root package name */
    public final c f754z;

    /* compiled from: Http2Connection.kt */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public final ya.d f756b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f757c;

        /* renamed from: d, reason: collision with root package name */
        public String f758d;

        /* renamed from: e, reason: collision with root package name */
        public Ka.i f759e;

        /* renamed from: f, reason: collision with root package name */
        public Ka.h f760f;
        public int i;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f755a = true;

        /* renamed from: g, reason: collision with root package name */
        public b f761g = b.f763a;

        /* renamed from: h, reason: collision with root package name */
        public final q f762h = q.f851a;

        public a(ya.d dVar) {
            this.f756b = dVar;
        }
    }

    /* compiled from: Http2Connection.kt */
    public final class c implements m.c, InterfaceC0635a<O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final m f764a;

        public c(m mVar) {
            this.f764a = mVar;
        }

        @Override // Ca.m.c
        public final void a(int i, List list) {
            d dVar = d.this;
            synchronized (dVar) {
                if (dVar.f729A.contains(Integer.valueOf(i))) {
                    dVar.D(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.f729A.add(Integer.valueOf(i));
                dVar.f738j.c(new i(dVar.f733d + '[' + i + "] onRequest", dVar, i, list), 0L);
            }
        }

        @Override // Ca.m.c
        public final void b(int i, ByteString byteString) {
            int i9;
            Object[] array;
            byteString.d();
            d dVar = d.this;
            synchronized (dVar) {
                array = dVar.f732c.values().toArray(new n[0]);
                dVar.f736g = true;
                O9.p pVar = O9.p.f3034a;
            }
            for (n nVar : (n[]) array) {
                if (nVar.f814a > i && nVar.g()) {
                    ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                    synchronized (nVar) {
                        if (nVar.f825m == null) {
                            nVar.f825m = errorCode;
                            nVar.notifyAll();
                        }
                    }
                    d.this.p(nVar.f814a);
                }
            }
        }

        @Override // Ca.m.c
        public final void c(int i, long j10) {
            if (i == 0) {
                d dVar = d.this;
                synchronized (dVar) {
                    dVar.f751w += j10;
                    dVar.notifyAll();
                    O9.p pVar = O9.p.f3034a;
                }
                return;
            }
            n j11 = d.this.j(i);
            if (j11 != null) {
                synchronized (j11) {
                    j11.f819f += j10;
                    if (j10 > 0) {
                        j11.notifyAll();
                    }
                    O9.p pVar2 = O9.p.f3034a;
                }
            }
        }

        @Override // Ca.m.c
        public final void d(int i, int i9, boolean z10) {
            if (!z10) {
                d.this.i.c(new Ca.f(androidx.camera.core.impl.utils.a.n(new StringBuilder(), d.this.f733d, " ping"), d.this, i, i9), 0L);
                return;
            }
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (i == 1) {
                        dVar.f742n++;
                    } else if (i != 2) {
                        if (i == 3) {
                            dVar.notifyAll();
                        }
                        O9.p pVar = O9.p.f3034a;
                    } else {
                        dVar.f744p++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Ca.m.c
        public final void e(r rVar) {
            d dVar = d.this;
            dVar.i.c(new g(androidx.camera.core.impl.utils.a.n(new StringBuilder(), dVar.f733d, " applyAndAckSettings"), this, rVar), 0L);
        }

        @Override // Ca.m.c
        public final void f(int i, ErrorCode errorCode) {
            d dVar = d.this;
            dVar.getClass();
            if (i == 0 || (i & 1) != 0) {
                n p10 = dVar.p(i);
                if (p10 != null) {
                    synchronized (p10) {
                        if (p10.f825m == null) {
                            p10.f825m = errorCode;
                            p10.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            dVar.f738j.c(new j(dVar.f733d + '[' + i + "] onReset", dVar, i, errorCode), 0L);
        }

        @Override // Ca.m.c
        public final void g(int i, List list, boolean z10) {
            int i9 = 1;
            d.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                d dVar = d.this;
                dVar.f738j.c(new i(dVar.f733d + '[' + i + "] onHeaders", dVar, i, list, z10), 0L);
                return;
            }
            d dVar2 = d.this;
            synchronized (dVar2) {
                n j10 = dVar2.j(i);
                if (j10 != null) {
                    O9.p pVar = O9.p.f3034a;
                    j10.i(wa.b.u(list), z10);
                    return;
                }
                if (dVar2.f736g) {
                    return;
                }
                if (i <= dVar2.f734e) {
                    return;
                }
                if (i % 2 == dVar2.f735f % 2) {
                    return;
                }
                n nVar = new n(i, dVar2, false, z10, wa.b.u(list));
                dVar2.f734e = i;
                dVar2.f732c.put(Integer.valueOf(i), nVar);
                dVar2.f737h.f().c(new Ca.e(dVar2.f733d + '[' + i + "] onStream", dVar2, nVar, i9), 0L);
            }
        }

        @Override // Ca.m.c
        public final void i(boolean z10, int i, Ka.i iVar, int i9) {
            boolean z11;
            boolean z12;
            d.this.getClass();
            if (i != 0 && (i & 1) == 0) {
                d dVar = d.this;
                dVar.getClass();
                Ka.f fVar = new Ka.f();
                long j10 = i9;
                iVar.h0(j10);
                iVar.i0(fVar, j10);
                dVar.f738j.c(new h(dVar.f733d + '[' + i + "] onData", dVar, i, fVar, i9, z10), 0L);
                return;
            }
            n j11 = d.this.j(i);
            if (j11 == null) {
                d.this.D(i, ErrorCode.PROTOCOL_ERROR);
                long j12 = i9;
                d.this.A(j12);
                iVar.skip(j12);
                return;
            }
            byte[] bArr = wa.b.f30872a;
            n.b bVar = j11.i;
            long j13 = i9;
            bVar.getClass();
            long j14 = j13;
            while (true) {
                if (j14 <= 0) {
                    byte[] bArr2 = wa.b.f30872a;
                    n.this.f815b.A(j13);
                    break;
                }
                synchronized (n.this) {
                    z11 = bVar.f832b;
                    z12 = bVar.f834d.f2294b + j14 > bVar.f831a;
                    O9.p pVar = O9.p.f3034a;
                }
                if (z12) {
                    iVar.skip(j14);
                    n.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z11) {
                    iVar.skip(j14);
                    break;
                }
                long i02 = iVar.i0(bVar.f833c, j14);
                if (i02 == -1) {
                    throw new EOFException();
                }
                j14 -= i02;
                n nVar = n.this;
                synchronized (nVar) {
                    try {
                        if (bVar.f835e) {
                            bVar.f833c.d();
                        } else {
                            Ka.f fVar2 = bVar.f834d;
                            boolean z13 = fVar2.f2294b == 0;
                            fVar2.c0(bVar.f833c);
                            if (z13) {
                                nVar.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                j11.i(wa.b.f30873b, true);
            }
        }

        @Override // ca.InterfaceC0635a
        public final O9.p invoke() {
            ErrorCode errorCode;
            d dVar = d.this;
            m mVar = this.f764a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    mVar.i(this);
                    while (mVar.d(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    dVar.d(errorCode, errorCode2, e10);
                    wa.b.c(mVar);
                    throw th;
                }
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    dVar.d(errorCode, errorCode2, null);
                } catch (IOException e12) {
                    e10 = e12;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    dVar.d(errorCode2, errorCode2, e10);
                    wa.b.c(mVar);
                    return O9.p.f3034a;
                }
                wa.b.c(mVar);
                return O9.p.f3034a;
            } catch (Throwable th2) {
                th = th2;
                dVar.d(errorCode, errorCode2, e10);
                wa.b.c(mVar);
                throw th;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    /* renamed from: Ca.d$d, reason: collision with other inner class name */
    public static final class C0009d extends AbstractC1633a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f766e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f767f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009d(String str, d dVar, long j10) {
            super(str, true);
            this.f766e = dVar;
            this.f767f = j10;
        }

        @Override // ya.AbstractC1633a
        public final long a() {
            d dVar;
            boolean z10;
            synchronized (this.f766e) {
                dVar = this.f766e;
                long j10 = dVar.f742n;
                long j11 = dVar.f741m;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    dVar.f741m = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                dVar.i(null);
                return -1L;
            }
            try {
                dVar.f753y.y(1, 0, false);
            } catch (IOException e10) {
                dVar.i(e10);
            }
            return this.f767f;
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class e extends AbstractC1633a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f768e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f769f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f770g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, d dVar, int i, ErrorCode errorCode) {
            super(str, true);
            this.f768e = dVar;
            this.f769f = i;
            this.f770g = errorCode;
        }

        @Override // ya.AbstractC1633a
        public final long a() {
            d dVar = this.f768e;
            try {
                dVar.f753y.A(this.f769f, this.f770g);
                return -1L;
            } catch (IOException e10) {
                dVar.i(e10);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class f extends AbstractC1633a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f771e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f772f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f773g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, d dVar, int i, long j10) {
            super(str, true);
            this.f771e = dVar;
            this.f772f = i;
            this.f773g = j10;
        }

        @Override // ya.AbstractC1633a
        public final long a() {
            d dVar = this.f771e;
            try {
                dVar.f753y.C(this.f772f, this.f773g);
                return -1L;
            } catch (IOException e10) {
                dVar.i(e10);
                return -1L;
            }
        }
    }

    static {
        r rVar = new r();
        rVar.b(7, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        rVar.b(5, 16384);
        f728B = rVar;
    }

    public d(a aVar) {
        boolean z10 = aVar.f755a;
        this.f730a = z10;
        this.f731b = aVar.f761g;
        this.f732c = new LinkedHashMap();
        String str = aVar.f758d;
        str = str == null ? null : str;
        this.f733d = str;
        this.f735f = z10 ? 3 : 2;
        ya.d dVar = aVar.f756b;
        this.f737h = dVar;
        ya.c f10 = dVar.f();
        this.i = f10;
        this.f738j = dVar.f();
        this.f739k = dVar.f();
        this.f740l = aVar.f762h;
        r rVar = new r();
        if (z10) {
            rVar.b(7, 16777216);
        }
        this.f746r = rVar;
        this.f747s = f728B;
        this.f751w = r3.a();
        Socket socket = aVar.f757c;
        this.f752x = socket == null ? null : socket;
        Ka.h hVar = aVar.f760f;
        this.f753y = new o(hVar == null ? null : hVar, z10);
        Ka.i iVar = aVar.f759e;
        this.f754z = new c(new m(iVar != null ? iVar : null, z10));
        this.f729A = new LinkedHashSet();
        int i = aVar.i;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            f10.c(new C0009d(v.n(str, " ping"), this, nanos), nanos);
        }
    }

    public final synchronized void A(long j10) {
        long j11 = this.f748t + j10;
        this.f748t = j11;
        long j12 = j11 - this.f749u;
        if (j12 >= this.f746r.a() / 2) {
            E(0, j12);
            this.f749u += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f753y.f842d);
        r6 = r2;
        r8.f750v += r6;
        r4 = O9.p.f3034a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(int r9, boolean r10, Ka.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            Ca.o r12 = r8.f753y
            r12.i(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.f750v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.f751w     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f732c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            Ca.o r4 = r8.f753y     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f842d     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f750v     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f750v = r4     // Catch: java.lang.Throwable -> L2a
            O9.p r4 = O9.p.f3034a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            Ca.o r4 = r8.f753y
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.i(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ca.d.C(int, boolean, Ka.f, long):void");
    }

    public final void D(int i, ErrorCode errorCode) {
        this.i.c(new e(this.f733d + '[' + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    public final void E(int i, long j10) {
        this.i.c(new f(this.f733d + '[' + i + "] windowUpdate", this, i, j10), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void d(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        byte[] bArr = wa.b.f30872a;
        try {
            y(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.f732c.isEmpty()) {
                    objArr = this.f732c.values().toArray(new n[0]);
                    this.f732c.clear();
                } else {
                    objArr = null;
                }
                O9.p pVar = O9.p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        n[] nVarArr = (n[]) objArr;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                try {
                    nVar.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f753y.close();
        } catch (IOException unused3) {
        }
        try {
            this.f752x.close();
        } catch (IOException unused4) {
        }
        this.i.f();
        this.f738j.f();
        this.f739k.f();
    }

    public final void flush() {
        this.f753y.flush();
    }

    public final void i(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        d(errorCode, errorCode, iOException);
    }

    public final synchronized n j(int i) {
        return (n) this.f732c.get(Integer.valueOf(i));
    }

    public final synchronized n p(int i) {
        n nVar;
        nVar = (n) this.f732c.remove(Integer.valueOf(i));
        notifyAll();
        return nVar;
    }

    public final void y(ErrorCode errorCode) {
        synchronized (this.f753y) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f736g) {
                    return;
                }
                this.f736g = true;
                int i = this.f734e;
                ref$IntRef.f23177a = i;
                O9.p pVar = O9.p.f3034a;
                this.f753y.p(i, errorCode, wa.b.f30872a);
            }
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f763a = new a();

        /* compiled from: Http2Connection.kt */
        public static final class a extends b {
            @Override // Ca.d.b
            public final void b(n nVar) {
                nVar.c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public abstract void b(n nVar);

        public void a(r rVar) {
        }
    }
}
