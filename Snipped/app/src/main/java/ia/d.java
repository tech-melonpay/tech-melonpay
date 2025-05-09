package Ia;

import C.v;
import Ia.i;
import Ka.f;
import O9.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import ka.C0956a;
import ka.C0967l;
import kotlinx.coroutines.test.TestBuildersKt;
import okhttp3.Protocol;
import okhttp3.k;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import va.l;
import va.m;
import ya.AbstractC1633a;

/* compiled from: RealWebSocket.kt */
/* loaded from: classes2.dex */
public final class d implements l, i.a {

    /* renamed from: w, reason: collision with root package name */
    public static final List<Protocol> f1954w = Collections.singletonList(Protocol.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    public final m f1955a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f1956b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1957c;

    /* renamed from: e, reason: collision with root package name */
    public final long f1959e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1960f;

    /* renamed from: g, reason: collision with root package name */
    public za.e f1961g;

    /* renamed from: h, reason: collision with root package name */
    public C0024d f1962h;
    public i i;

    /* renamed from: j, reason: collision with root package name */
    public j f1963j;

    /* renamed from: k, reason: collision with root package name */
    public final ya.c f1964k;

    /* renamed from: l, reason: collision with root package name */
    public String f1965l;

    /* renamed from: m, reason: collision with root package name */
    public c f1966m;

    /* renamed from: p, reason: collision with root package name */
    public long f1969p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1970q;

    /* renamed from: s, reason: collision with root package name */
    public String f1972s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1973t;

    /* renamed from: u, reason: collision with root package name */
    public int f1974u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1975v;

    /* renamed from: d, reason: collision with root package name */
    public g f1958d = null;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque<ByteString> f1967n = new ArrayDeque<>();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque<Object> f1968o = new ArrayDeque<>();

    /* renamed from: r, reason: collision with root package name */
    public int f1971r = -1;

    /* compiled from: RealWebSocket.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1976a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteString f1977b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1978c = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;

        public a(int i, ByteString byteString) {
            this.f1976a = i;
            this.f1977b = byteString;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1979a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final ByteString f1980b;

        public b(ByteString byteString) {
            this.f1980b = byteString;
        }
    }

    /* compiled from: RealWebSocket.kt */
    public static abstract class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1981a = true;

        /* renamed from: b, reason: collision with root package name */
        public final Ka.i f1982b;

        /* renamed from: c, reason: collision with root package name */
        public final Ka.h f1983c;

        public c(Ka.i iVar, Ka.h hVar) {
            this.f1982b = iVar;
            this.f1983c = hVar;
        }
    }

    /* compiled from: RealWebSocket.kt */
    /* renamed from: Ia.d$d, reason: collision with other inner class name */
    public final class C0024d extends AbstractC1633a {
        public C0024d() {
            super(androidx.camera.core.impl.utils.a.n(new StringBuilder(), d.this.f1965l, " writer"), true);
        }

        @Override // ya.AbstractC1633a
        public final long a() {
            d dVar = d.this;
            try {
                return dVar.m() ? 0L : -1L;
            } catch (IOException e10) {
                dVar.i(e10, null);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    public static final class e extends AbstractC1633a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f1985e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, d dVar) {
            super(str, true);
            this.f1985e = dVar;
        }

        @Override // ya.AbstractC1633a
        public final long a() {
            this.f1985e.f1961g.cancel();
            return -1L;
        }
    }

    public d(ya.d dVar, k kVar, m mVar, Random random, long j10, long j11) {
        this.f1955a = mVar;
        this.f1956b = random;
        this.f1957c = j10;
        this.f1959e = j11;
        this.f1964k = dVar.f();
        String str = kVar.f24645b;
        if (!kotlin.jvm.internal.f.b("GET", str)) {
            throw new IllegalArgumentException(s3.b.j("Request must be GET: ", str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        p pVar = p.f3034a;
        this.f1960f = ByteString.a.d(bArr).a();
    }

    @Override // va.l
    public final boolean a(String str) {
        ByteString byteString = new ByteString(str.getBytes(C0956a.f23054b));
        byteString.f24699c = str;
        synchronized (this) {
            if (!this.f1973t && !this.f1970q) {
                long j10 = this.f1969p;
                byte[] bArr = byteString.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String;
                if (bArr.length + j10 > 16777216) {
                    e(1001, null);
                    return false;
                }
                this.f1969p = j10 + bArr.length;
                this.f1968o.add(new b(byteString));
                l();
                return true;
            }
            return false;
        }
    }

    @Override // Ia.i.a
    public final void b(ByteString byteString) {
        this.f1955a.onMessage(this, byteString);
    }

    @Override // Ia.i.a
    public final void c(String str) {
        this.f1955a.onMessage(this, str);
    }

    @Override // Ia.i.a
    public final synchronized void d(ByteString byteString) {
        try {
            if (!this.f1973t && (!this.f1970q || !this.f1968o.isEmpty())) {
                this.f1967n.add(byteString);
                l();
            }
        } finally {
        }
    }

    @Override // va.l
    public final boolean e(int i, String str) {
        String str2;
        synchronized (this) {
            ByteString byteString = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    byteString = new ByteString(str.getBytes(C0956a.f23054b));
                    byteString.f24699c = str;
                    if (byteString.com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE java.lang.String.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f1973t && !this.f1970q) {
                    this.f1970q = true;
                    this.f1968o.add(new a(i, byteString));
                    l();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Ia.i.a
    public final synchronized void f() {
        this.f1975v = false;
    }

    @Override // Ia.i.a
    public final void g(int i, String str) {
        c cVar;
        i iVar;
        j jVar;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            try {
                if (this.f1971r != -1) {
                    throw new IllegalStateException("already closed".toString());
                }
                this.f1971r = i;
                this.f1972s = str;
                cVar = null;
                if (this.f1970q && this.f1968o.isEmpty()) {
                    c cVar2 = this.f1966m;
                    this.f1966m = null;
                    iVar = this.i;
                    this.i = null;
                    jVar = this.f1963j;
                    this.f1963j = null;
                    this.f1964k.f();
                    cVar = cVar2;
                } else {
                    iVar = null;
                    jVar = null;
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f1955a.onClosing(this, i, str);
            if (cVar != null) {
                this.f1955a.onClosed(this, i, str);
            }
        } finally {
            if (cVar != null) {
                wa.b.c(cVar);
            }
            if (iVar != null) {
                wa.b.c(iVar);
            }
            if (jVar != null) {
                wa.b.c(jVar);
            }
        }
    }

    public final void h(okhttp3.p pVar, za.c cVar) {
        int i = pVar.f24674d;
        if (i != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i);
            sb2.append(' ');
            throw new ProtocolException(v.q(sb2, pVar.f24673c, '\''));
        }
        okhttp3.g gVar = pVar.f24676f;
        String a10 = gVar.a("Connection");
        if (a10 == null) {
            a10 = null;
        }
        if (!C0967l.U("Upgrade", a10, true)) {
            throw new ProtocolException(v.o("Expected 'Connection' header value 'Upgrade' but was '", a10, '\''));
        }
        String a11 = gVar.a("Upgrade");
        if (a11 == null) {
            a11 = null;
        }
        if (!C0967l.U("websocket", a11, true)) {
            throw new ProtocolException(v.o("Expected 'Upgrade' header value 'websocket' but was '", a11, '\''));
        }
        String a12 = gVar.a("Sec-WebSocket-Accept");
        String str = a12 != null ? a12 : null;
        String n10 = androidx.camera.core.impl.utils.a.n(new StringBuilder(), this.f1960f, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        ByteString byteString = new ByteString(n10.getBytes(C0956a.f23054b));
        byteString.f24699c = n10;
        String a13 = byteString.c(McElieceCCA2KeyGenParameterSpec.SHA1).a();
        if (kotlin.jvm.internal.f.b(a13, str)) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a13 + "' but was '" + str + '\'');
    }

    public final void i(Exception exc, okhttp3.p pVar) {
        synchronized (this) {
            if (this.f1973t) {
                return;
            }
            this.f1973t = true;
            c cVar = this.f1966m;
            this.f1966m = null;
            i iVar = this.i;
            this.i = null;
            j jVar = this.f1963j;
            this.f1963j = null;
            this.f1964k.f();
            p pVar2 = p.f3034a;
            try {
                this.f1955a.onFailure(this, exc, pVar);
            } finally {
                if (cVar != null) {
                    wa.b.c(cVar);
                }
                if (iVar != null) {
                    wa.b.c(iVar);
                }
                if (jVar != null) {
                    wa.b.c(jVar);
                }
            }
        }
    }

    public final void j(String str, za.f fVar) {
        g gVar = this.f1958d;
        synchronized (this) {
            try {
                this.f1965l = str;
                this.f1966m = fVar;
                boolean z10 = fVar.f1981a;
                this.f1963j = new j(z10, fVar.f1983c, this.f1956b, gVar.f1990a, z10 ? gVar.f1992c : gVar.f1994e, this.f1959e);
                this.f1962h = new C0024d();
                long j10 = this.f1957c;
                if (j10 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                    this.f1964k.c(new f(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.f1968o.isEmpty()) {
                    l();
                }
                p pVar = p.f3034a;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z11 = fVar.f1981a;
        this.i = new i(z11, fVar.f1982b, this, gVar.f1990a, z11 ^ true ? gVar.f1992c : gVar.f1994e);
    }

    public final void k() {
        while (this.f1971r == -1) {
            i iVar = this.i;
            iVar.i();
            if (!iVar.f2004j) {
                int i = iVar.f2002g;
                if (i != 1 && i != 2) {
                    byte[] bArr = wa.b.f30872a;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (!iVar.f2001f) {
                    long j10 = iVar.f2003h;
                    Ka.f fVar = iVar.f2007m;
                    if (j10 > 0) {
                        iVar.f1997b.J(fVar, j10);
                        if (!iVar.f1996a) {
                            f.a aVar = iVar.f2010p;
                            fVar.D(aVar);
                            aVar.i(fVar.f2294b - iVar.f2003h);
                            h.a(aVar, iVar.f2009o);
                            aVar.close();
                        }
                    }
                    if (iVar.i) {
                        if (iVar.f2005k) {
                            Ia.c cVar = iVar.f2008n;
                            if (cVar == null) {
                                cVar = new Ia.c(iVar.f2000e);
                                iVar.f2008n = cVar;
                            }
                            Ka.f fVar2 = cVar.f1951b;
                            if (fVar2.f2294b != 0) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            Inflater inflater = cVar.f1952c;
                            if (cVar.f1950a) {
                                inflater.reset();
                            }
                            fVar2.c0(fVar);
                            fVar2.d0(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            long bytesRead = inflater.getBytesRead() + fVar2.f2294b;
                            do {
                                cVar.f1953d.d(fVar, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        i.a aVar2 = iVar.f1998c;
                        if (i == 1) {
                            aVar2.c(fVar.M());
                        } else {
                            aVar2.b(fVar.h(fVar.f2294b));
                        }
                    } else {
                        while (!iVar.f2001f) {
                            iVar.i();
                            if (!iVar.f2004j) {
                                break;
                            } else {
                                iVar.d();
                            }
                        }
                        if (iVar.f2002g != 0) {
                            int i9 = iVar.f2002g;
                            byte[] bArr2 = wa.b.f30872a;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i9)));
                        }
                    }
                }
                throw new IOException("closed");
            }
            iVar.d();
        }
    }

    public final void l() {
        byte[] bArr = wa.b.f30872a;
        C0024d c0024d = this.f1962h;
        if (c0024d != null) {
            this.f1964k.c(c0024d, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ce, code lost:
    
        if (r2 < 3000) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0078, B:29:0x0084, B:31:0x0088, B:32:0x0091, B:35:0x009e, B:39:0x00a2, B:40:0x00a3, B:41:0x00a4, B:43:0x00a8, B:49:0x011b, B:51:0x011f, B:54:0x0135, B:55:0x0137, B:67:0x00d0, B:70:0x00f5, B:71:0x00fe, B:76:0x00e4, B:77:0x00ff, B:79:0x0109, B:80:0x0110, B:81:0x0138, B:82:0x013d, B:34:0x0092, B:48:0x0118), top: B:19:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0078, B:29:0x0084, B:31:0x0088, B:32:0x0091, B:35:0x009e, B:39:0x00a2, B:40:0x00a3, B:41:0x00a4, B:43:0x00a8, B:49:0x011b, B:51:0x011f, B:54:0x0135, B:55:0x0137, B:67:0x00d0, B:70:0x00f5, B:71:0x00fe, B:76:0x00e4, B:77:0x00ff, B:79:0x0109, B:80:0x0110, B:81:0x0138, B:82:0x013d, B:34:0x0092, B:48:0x0118), top: B:19:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0078, B:29:0x0084, B:31:0x0088, B:32:0x0091, B:35:0x009e, B:39:0x00a2, B:40:0x00a3, B:41:0x00a4, B:43:0x00a8, B:49:0x011b, B:51:0x011f, B:54:0x0135, B:55:0x0137, B:67:0x00d0, B:70:0x00f5, B:71:0x00fe, B:76:0x00e4, B:77:0x00ff, B:79:0x0109, B:80:0x0110, B:81:0x0138, B:82:0x013d, B:34:0x0092, B:48:0x0118), top: B:19:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [Ia.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ia.d.m():boolean");
    }
}
