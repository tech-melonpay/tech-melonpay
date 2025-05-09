package okhttp3;

import Ka.t;
import java.io.Closeable;
import java.io.EOFException;
import okhttp3.c;
import okhttp3.g;

/* compiled from: Response.kt */
/* loaded from: classes2.dex */
public final class p implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final k f24671a;

    /* renamed from: b, reason: collision with root package name */
    public final Protocol f24672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24673c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24674d;

    /* renamed from: e, reason: collision with root package name */
    public final Handshake f24675e;

    /* renamed from: f, reason: collision with root package name */
    public final g f24676f;

    /* renamed from: g, reason: collision with root package name */
    public final va.i f24677g;

    /* renamed from: h, reason: collision with root package name */
    public final p f24678h;
    public final p i;

    /* renamed from: j, reason: collision with root package name */
    public final p f24679j;

    /* renamed from: k, reason: collision with root package name */
    public final long f24680k;

    /* renamed from: l, reason: collision with root package name */
    public final long f24681l;

    /* renamed from: m, reason: collision with root package name */
    public final za.c f24682m;

    /* renamed from: n, reason: collision with root package name */
    public c f24683n;

    /* compiled from: Response.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public k f24684a;

        /* renamed from: b, reason: collision with root package name */
        public Protocol f24685b;

        /* renamed from: d, reason: collision with root package name */
        public String f24687d;

        /* renamed from: e, reason: collision with root package name */
        public Handshake f24688e;

        /* renamed from: g, reason: collision with root package name */
        public va.i f24690g;

        /* renamed from: h, reason: collision with root package name */
        public p f24691h;
        public p i;

        /* renamed from: j, reason: collision with root package name */
        public p f24692j;

        /* renamed from: k, reason: collision with root package name */
        public long f24693k;

        /* renamed from: l, reason: collision with root package name */
        public long f24694l;

        /* renamed from: m, reason: collision with root package name */
        public za.c f24695m;

        /* renamed from: c, reason: collision with root package name */
        public int f24686c = -1;

        /* renamed from: f, reason: collision with root package name */
        public g.a f24689f = new g.a();

        public static void b(String str, p pVar) {
            if (pVar != null) {
                if (pVar.f24677g != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (pVar.f24678h != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (pVar.i != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (pVar.f24679j != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final p a() {
            int i = this.f24686c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.f24686c).toString());
            }
            k kVar = this.f24684a;
            if (kVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f24685b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f24687d;
            if (str != null) {
                return new p(kVar, protocol, str, i, this.f24688e, this.f24689f.d(), this.f24690g, this.f24691h, this.i, this.f24692j, this.f24693k, this.f24694l, this.f24695m);
            }
            throw new IllegalStateException("message == null".toString());
        }
    }

    public p(k kVar, Protocol protocol, String str, int i, Handshake handshake, g gVar, va.i iVar, p pVar, p pVar2, p pVar3, long j10, long j11, za.c cVar) {
        this.f24671a = kVar;
        this.f24672b = protocol;
        this.f24673c = str;
        this.f24674d = i;
        this.f24675e = handshake;
        this.f24676f = gVar;
        this.f24677g = iVar;
        this.f24678h = pVar;
        this.i = pVar2;
        this.f24679j = pVar3;
        this.f24680k = j10;
        this.f24681l = j11;
        this.f24682m = cVar;
    }

    public static String i(String str, p pVar) {
        String a10 = pVar.f24676f.a(str);
        if (a10 == null) {
            return null;
        }
        return a10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        va.i iVar = this.f24677g;
        if (iVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        iVar.close();
    }

    public final c d() {
        c cVar = this.f24683n;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f24467n;
        c a10 = c.b.a(this.f24676f);
        this.f24683n = a10;
        return a10;
    }

    public final boolean j() {
        int i = this.f24674d;
        return 200 <= i && i < 300;
    }

    public final a p() {
        a aVar = new a();
        aVar.f24684a = this.f24671a;
        aVar.f24685b = this.f24672b;
        aVar.f24686c = this.f24674d;
        aVar.f24687d = this.f24673c;
        aVar.f24688e = this.f24675e;
        aVar.f24689f = this.f24676f.e();
        aVar.f24690g = this.f24677g;
        aVar.f24691h = this.f24678h;
        aVar.i = this.i;
        aVar.f24692j = this.f24679j;
        aVar.f24693k = this.f24680k;
        aVar.f24694l = this.f24681l;
        aVar.f24695m = this.f24682m;
        return aVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f24672b + ", code=" + this.f24674d + ", message=" + this.f24673c + ", url=" + this.f24671a.f24644a + '}';
    }

    public final va.j y() {
        va.i iVar = this.f24677g;
        t peek = iVar.p().peek();
        Ka.f fVar = new Ka.f();
        peek.O(Long.MAX_VALUE);
        long min = Math.min(Long.MAX_VALUE, peek.f2332b.f2294b);
        while (min > 0) {
            long i02 = peek.i0(fVar, min);
            if (i02 == -1) {
                throw new EOFException();
            }
            min -= i02;
        }
        return new va.j(iVar.j(), fVar.f2294b, fVar);
    }
}
