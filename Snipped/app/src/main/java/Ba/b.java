package Ba;

import Aa.i;
import Ka.i;
import Ka.m;
import Ka.w;
import Ka.y;
import Ka.z;
import androidx.camera.core.impl.j;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import ka.C0967l;
import ka.C0969n;
import okhttp3.g;
import okhttp3.k;
import okhttp3.o;
import okhttp3.p;
import va.h;

/* compiled from: Http1ExchangeCodec.kt */
/* loaded from: classes2.dex */
public final class b implements Aa.d {

    /* renamed from: a, reason: collision with root package name */
    public final h f472a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.internal.connection.a f473b;

    /* renamed from: c, reason: collision with root package name */
    public final i f474c;

    /* renamed from: d, reason: collision with root package name */
    public final Ka.h f475d;

    /* renamed from: e, reason: collision with root package name */
    public int f476e;

    /* renamed from: f, reason: collision with root package name */
    public final Ba.a f477f;

    /* compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final m f478a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f479b;

        public a() {
            this.f478a = new m(b.this.f474c.b());
        }

        @Override // Ka.y
        public final z b() {
            return this.f478a;
        }

        public final void d() {
            b bVar = b.this;
            int i = bVar.f476e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + bVar.f476e);
            }
            m mVar = this.f478a;
            z zVar = mVar.f2309e;
            mVar.f2309e = z.f2346d;
            zVar.a();
            zVar.b();
            bVar.f476e = 6;
        }

        @Override // Ka.y
        public long i0(Ka.f fVar, long j10) {
            b bVar = b.this;
            try {
                return bVar.f474c.i0(fVar, j10);
            } catch (IOException e10) {
                bVar.f473b.k();
                d();
                throw e10;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: Ba.b$b, reason: collision with other inner class name */
    public final class C0003b implements w {

        /* renamed from: a, reason: collision with root package name */
        public final m f481a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f482b;

        public C0003b() {
            this.f481a = new m(b.this.f475d.b());
        }

        @Override // Ka.w
        public final z b() {
            return this.f481a;
        }

        @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f482b) {
                return;
            }
            this.f482b = true;
            b.this.f475d.F("0\r\n\r\n");
            b bVar = b.this;
            m mVar = this.f481a;
            bVar.getClass();
            z zVar = mVar.f2309e;
            mVar.f2309e = z.f2346d;
            zVar.a();
            zVar.b();
            b.this.f476e = 3;
        }

        @Override // Ka.w, java.io.Flushable
        public final synchronized void flush() {
            if (this.f482b) {
                return;
            }
            b.this.f475d.flush();
        }

        @Override // Ka.w
        public final void z(Ka.f fVar, long j10) {
            if (!(!this.f482b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            b bVar = b.this;
            bVar.f475d.L(j10);
            Ka.h hVar = bVar.f475d;
            hVar.F("\r\n");
            hVar.z(fVar, j10);
            hVar.F("\r\n");
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        public final okhttp3.h f484d;

        /* renamed from: e, reason: collision with root package name */
        public long f485e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f486f;

        public c(okhttp3.h hVar) {
            super();
            this.f484d = hVar;
            this.f485e = -1L;
            this.f486f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        
            if (wa.b.t(r2, 100, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L10;
         */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void close() {
            /*
                r2 = this;
                boolean r0 = r2.f479b
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r2.f486f
                if (r0 == 0) goto L1d
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1 = 100
                boolean r0 = wa.b.t(r2, r1, r0)     // Catch: java.io.IOException -> L13
                if (r0 != 0) goto L1d
            L13:
                Ba.b r0 = Ba.b.this
                okhttp3.internal.connection.a r0 = r0.f473b
                r0.k()
                r2.d()
            L1d:
                r0 = 1
                r2.f479b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ba.b.c.close():void");
        }

        @Override // Ba.b.a, Ka.y
        public final long i0(Ka.f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.a("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f479b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f486f) {
                return -1L;
            }
            long j11 = this.f485e;
            b bVar = b.this;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    bVar.f474c.R();
                }
                try {
                    this.f485e = bVar.f474c.l0();
                    String obj = C0969n.u0(bVar.f474c.R()).toString();
                    if (this.f485e < 0 || (obj.length() > 0 && !obj.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f485e + obj + '\"');
                    }
                    if (this.f485e == 0) {
                        this.f486f = false;
                        Ba.a aVar = bVar.f477f;
                        aVar.getClass();
                        g.a aVar2 = new g.a();
                        while (true) {
                            String x9 = aVar.f470a.x(aVar.f471b);
                            aVar.f471b -= x9.length();
                            if (x9.length() == 0) {
                                break;
                            }
                            aVar2.b(x9);
                        }
                        Aa.e.b(bVar.f472a.f30710j, this.f484d, aVar2.d());
                        d();
                    }
                    if (!this.f486f) {
                        return -1L;
                    }
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            }
            long i02 = super.i0(fVar, Math.min(j10, this.f485e));
            if (i02 != -1) {
                this.f485e -= i02;
                return i02;
            }
            bVar.f473b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            d();
            throw protocolException;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        public long f488d;

        public d(long j10) {
            super();
            this.f488d = j10;
            if (j10 == 0) {
                d();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (wa.b.t(r4, 100, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L10;
         */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void close() {
            /*
                r4 = this;
                boolean r0 = r4.f479b
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.f488d
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L21
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                r1 = 100
                boolean r0 = wa.b.t(r4, r1, r0)     // Catch: java.io.IOException -> L17
                if (r0 != 0) goto L21
            L17:
                Ba.b r0 = Ba.b.this
                okhttp3.internal.connection.a r0 = r0.f473b
                r0.k()
                r4.d()
            L21:
                r0 = 1
                r4.f479b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ba.b.d.close():void");
        }

        @Override // Ba.b.a, Ka.y
        public final long i0(Ka.f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.a("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f479b)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f488d;
            if (j11 == 0) {
                return -1L;
            }
            long i02 = super.i0(fVar, Math.min(j11, j10));
            if (i02 == -1) {
                b.this.f473b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
            long j12 = this.f488d - i02;
            this.f488d = j12;
            if (j12 == 0) {
                d();
            }
            return i02;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class e implements w {

        /* renamed from: a, reason: collision with root package name */
        public final m f490a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f491b;

        public e() {
            this.f490a = new m(b.this.f475d.b());
        }

        @Override // Ka.w
        public final z b() {
            return this.f490a;
        }

        @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f491b) {
                return;
            }
            this.f491b = true;
            b bVar = b.this;
            bVar.getClass();
            m mVar = this.f490a;
            z zVar = mVar.f2309e;
            mVar.f2309e = z.f2346d;
            zVar.a();
            zVar.b();
            bVar.f476e = 3;
        }

        @Override // Ka.w, java.io.Flushable
        public final void flush() {
            if (this.f491b) {
                return;
            }
            b.this.f475d.flush();
        }

        @Override // Ka.w
        public final void z(Ka.f fVar, long j10) {
            if (!(!this.f491b)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = fVar.f2294b;
            byte[] bArr = wa.b.f30872a;
            if (j10 < 0 || 0 > j11 || j11 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            b.this.f475d.z(fVar, j10);
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public final class f extends a {

        /* renamed from: d, reason: collision with root package name */
        public boolean f493d;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f479b) {
                return;
            }
            if (!this.f493d) {
                d();
            }
            this.f479b = true;
        }

        @Override // Ba.b.a, Ka.y
        public final long i0(Ka.f fVar, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(j.a("byteCount < 0: ", j10).toString());
            }
            if (!(!this.f479b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f493d) {
                return -1L;
            }
            long i02 = super.i0(fVar, j10);
            if (i02 != -1) {
                return i02;
            }
            this.f493d = true;
            d();
            return -1L;
        }
    }

    public b(h hVar, okhttp3.internal.connection.a aVar, i iVar, Ka.h hVar2) {
        this.f472a = hVar;
        this.f473b = aVar;
        this.f474c = iVar;
        this.f475d = hVar2;
        this.f477f = new Ba.a(iVar);
    }

    @Override // Aa.d
    public final void a() {
        this.f475d.flush();
    }

    @Override // Aa.d
    public final void b(k kVar) {
        Proxy.Type type = this.f473b.f24599b.f30765b.type();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.f24645b);
        sb2.append(' ');
        okhttp3.h hVar = kVar.f24644a;
        if (hVar.f24533j || type != Proxy.Type.HTTP) {
            String b9 = hVar.b();
            String d10 = hVar.d();
            if (d10 != null) {
                b9 = b9 + '?' + d10;
            }
            sb2.append(b9);
        } else {
            sb2.append(hVar);
        }
        sb2.append(" HTTP/1.1");
        i(kVar.f24646c, sb2.toString());
    }

    @Override // Aa.d
    public final y c(p pVar) {
        if (!Aa.e.a(pVar)) {
            return h(0L);
        }
        String a10 = pVar.f24676f.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if (C0967l.U("chunked", a10, true)) {
            okhttp3.h hVar = pVar.f24671a.f24644a;
            if (this.f476e == 4) {
                this.f476e = 5;
                return new c(hVar);
            }
            throw new IllegalStateException(("state: " + this.f476e).toString());
        }
        long j10 = wa.b.j(pVar);
        if (j10 != -1) {
            return h(j10);
        }
        if (this.f476e == 4) {
            this.f476e = 5;
            this.f473b.k();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f476e).toString());
    }

    @Override // Aa.d
    public final void cancel() {
        Socket socket = this.f473b.f24600c;
        if (socket != null) {
            wa.b.d(socket);
        }
    }

    @Override // Aa.d
    public final p.a d(boolean z10) {
        Ba.a aVar = this.f477f;
        int i = this.f476e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f476e).toString());
        }
        try {
            String x9 = aVar.f470a.x(aVar.f471b);
            aVar.f471b -= x9.length();
            Aa.i a10 = i.a.a(x9);
            int i9 = a10.f161b;
            p.a aVar2 = new p.a();
            aVar2.f24685b = a10.f160a;
            aVar2.f24686c = i9;
            aVar2.f24687d = a10.f162c;
            g.a aVar3 = new g.a();
            while (true) {
                String x10 = aVar.f470a.x(aVar.f471b);
                aVar.f471b -= x10.length();
                if (x10.length() == 0) {
                    break;
                }
                aVar3.b(x10);
            }
            aVar2.f24689f = aVar3.d().e();
            if (z10 && i9 == 100) {
                return null;
            }
            if (i9 == 100) {
                this.f476e = 3;
                return aVar2;
            }
            if (102 > i9 || i9 >= 200) {
                this.f476e = 4;
                return aVar2;
            }
            this.f476e = 3;
            return aVar2;
        } catch (EOFException e10) {
            throw new IOException(s3.b.j("unexpected end of stream on ", this.f473b.f24599b.f30764a.i.h()), e10);
        }
    }

    @Override // Aa.d
    public final void e() {
        this.f475d.flush();
    }

    @Override // Aa.d
    public final long f(p pVar) {
        if (!Aa.e.a(pVar)) {
            return 0L;
        }
        String a10 = pVar.f24676f.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if (C0967l.U("chunked", a10, true)) {
            return -1L;
        }
        return wa.b.j(pVar);
    }

    @Override // Aa.d
    public final w g(k kVar, long j10) {
        o oVar = kVar.f24647d;
        if (oVar != null && oVar.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (C0967l.U("chunked", kVar.f24646c.a("Transfer-Encoding"), true)) {
            if (this.f476e == 1) {
                this.f476e = 2;
                return new C0003b();
            }
            throw new IllegalStateException(("state: " + this.f476e).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f476e == 1) {
            this.f476e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.f476e).toString());
    }

    @Override // Aa.d
    public final okhttp3.internal.connection.a getConnection() {
        return this.f473b;
    }

    public final d h(long j10) {
        if (this.f476e == 4) {
            this.f476e = 5;
            return new d(j10);
        }
        throw new IllegalStateException(("state: " + this.f476e).toString());
    }

    public final void i(g gVar, String str) {
        if (this.f476e != 0) {
            throw new IllegalStateException(("state: " + this.f476e).toString());
        }
        Ka.h hVar = this.f475d;
        hVar.F(str).F("\r\n");
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            hVar.F(gVar.c(i)).F(": ").F(gVar.f(i)).F("\r\n");
        }
        hVar.F("\r\n");
        this.f476e = 1;
    }
}
