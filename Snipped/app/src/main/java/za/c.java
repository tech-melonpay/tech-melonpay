package za;

import Ka.k;
import Ka.l;
import Ka.t;
import Ka.w;
import Ka.y;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.p;

/* compiled from: Exchange.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f31354a;

    /* renamed from: b, reason: collision with root package name */
    public final va.f f31355b;

    /* renamed from: c, reason: collision with root package name */
    public final d f31356c;

    /* renamed from: d, reason: collision with root package name */
    public final Aa.d f31357d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31358e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31359f;

    /* renamed from: g, reason: collision with root package name */
    public final okhttp3.internal.connection.a f31360g;

    /* compiled from: Exchange.kt */
    public final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public final long f31361b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31362c;

        /* renamed from: d, reason: collision with root package name */
        public long f31363d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31364e;

        public a(w wVar, long j10) {
            super(wVar);
            this.f31361b = j10;
        }

        @Override // Ka.k, Ka.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31364e) {
                return;
            }
            this.f31364e = true;
            long j10 = this.f31361b;
            if (j10 != -1 && this.f31363d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                d(null);
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        public final <E extends IOException> E d(E e10) {
            if (this.f31362c) {
                return e10;
            }
            this.f31362c = true;
            return (E) c.this.a(false, true, e10);
        }

        @Override // Ka.k, Ka.w, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        @Override // Ka.k, Ka.w
        public final void z(Ka.f fVar, long j10) {
            if (!(!this.f31364e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f31361b;
            if (j11 == -1 || this.f31363d + j10 <= j11) {
                try {
                    super.z(fVar, j10);
                    this.f31363d += j10;
                    return;
                } catch (IOException e10) {
                    throw d(e10);
                }
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f31363d + j10));
        }
    }

    /* compiled from: Exchange.kt */
    public final class b extends l {

        /* renamed from: b, reason: collision with root package name */
        public final long f31366b;

        /* renamed from: c, reason: collision with root package name */
        public long f31367c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f31368d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31369e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f31370f;

        public b(y yVar, long j10) {
            super(yVar);
            this.f31366b = j10;
            this.f31368d = true;
            if (j10 == 0) {
                d(null);
            }
        }

        @Override // Ka.l, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f31370f) {
                return;
            }
            this.f31370f = true;
            try {
                super.close();
                d(null);
            } catch (IOException e10) {
                throw d(e10);
            }
        }

        public final <E extends IOException> E d(E e10) {
            if (this.f31369e) {
                return e10;
            }
            this.f31369e = true;
            c cVar = c.this;
            if (e10 == null && this.f31368d) {
                this.f31368d = false;
                cVar.f31355b.getClass();
            }
            return (E) cVar.a(true, false, e10);
        }

        @Override // Ka.l, Ka.y
        public final long i0(Ka.f fVar, long j10) {
            if (!(!this.f31370f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long i02 = this.f2308a.i0(fVar, j10);
                if (this.f31368d) {
                    this.f31368d = false;
                    c cVar = c.this;
                    va.f fVar2 = cVar.f31355b;
                    e eVar = cVar.f31354a;
                    fVar2.getClass();
                }
                if (i02 == -1) {
                    d(null);
                    return -1L;
                }
                long j11 = this.f31367c + i02;
                long j12 = this.f31366b;
                if (j12 == -1 || j11 <= j12) {
                    this.f31367c = j11;
                    if (j11 == j12) {
                        d(null);
                    }
                    return i02;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e10) {
                throw d(e10);
            }
        }
    }

    public c(e eVar, va.f fVar, d dVar, Aa.d dVar2) {
        this.f31354a = eVar;
        this.f31355b = fVar;
        this.f31356c = dVar;
        this.f31357d = dVar2;
        this.f31360g = dVar2.getConnection();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        va.f fVar = this.f31355b;
        if (z11) {
            if (iOException != null) {
                fVar.getClass();
            } else {
                fVar.getClass();
            }
        }
        if (z10) {
            if (iOException != null) {
                fVar.getClass();
            } else {
                fVar.getClass();
            }
        }
        return this.f31354a.f(this, z11, z10, iOException);
    }

    public final Aa.g b(p pVar) {
        Aa.d dVar = this.f31357d;
        try {
            String a10 = pVar.f24676f.a("Content-Type");
            if (a10 == null) {
                a10 = null;
            }
            long f10 = dVar.f(pVar);
            return new Aa.g(a10, f10, new t(new b(dVar.c(pVar), f10)));
        } catch (IOException e10) {
            this.f31355b.getClass();
            d(e10);
            throw e10;
        }
    }

    public final p.a c(boolean z10) {
        try {
            p.a d10 = this.f31357d.d(z10);
            if (d10 != null) {
                d10.f24695m = this;
            }
            return d10;
        } catch (IOException e10) {
            this.f31355b.getClass();
            d(e10);
            throw e10;
        }
    }

    public final void d(IOException iOException) {
        this.f31359f = true;
        this.f31356c.b(iOException);
        okhttp3.internal.connection.a connection = this.f31357d.getConnection();
        e eVar = this.f31354a;
        synchronized (connection) {
            try {
                if (iOException instanceof StreamResetException) {
                    if (((StreamResetException) iOException).f24623a == ErrorCode.REFUSED_STREAM) {
                        int i = connection.f24610n + 1;
                        connection.f24610n = i;
                        if (i > 1) {
                            connection.f24606j = true;
                            connection.f24608l++;
                        }
                    } else if (((StreamResetException) iOException).f24623a != ErrorCode.CANCEL || !eVar.f31395p) {
                        connection.f24606j = true;
                        connection.f24608l++;
                    }
                } else if (connection.f24604g == null || (iOException instanceof ConnectionShutdownException)) {
                    connection.f24606j = true;
                    if (connection.f24609m == 0) {
                        okhttp3.internal.connection.a.d(eVar.f31381a, connection.f24599b, iOException);
                        connection.f24608l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
