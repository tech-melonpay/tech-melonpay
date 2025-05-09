package va;

import C.N;
import P9.q;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import okhttp3.k;
import va.b;
import va.f;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes2.dex */
public final class h implements Cloneable, b.a {

    /* renamed from: E, reason: collision with root package name */
    public static final List<Protocol> f30696E = wa.b.k(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: F, reason: collision with root package name */
    public static final List<okhttp3.e> f30697F = wa.b.k(okhttp3.e.f24506e, okhttp3.e.f24507f);

    /* renamed from: A, reason: collision with root package name */
    public final int f30698A;

    /* renamed from: B, reason: collision with root package name */
    public final int f30699B;

    /* renamed from: C, reason: collision with root package name */
    public final long f30700C;

    /* renamed from: D, reason: collision with root package name */
    public final x.i f30701D;

    /* renamed from: a, reason: collision with root package name */
    public final e f30702a;

    /* renamed from: b, reason: collision with root package name */
    public final N f30703b;

    /* renamed from: c, reason: collision with root package name */
    public final List<g> f30704c;

    /* renamed from: d, reason: collision with root package name */
    public final List<g> f30705d;

    /* renamed from: e, reason: collision with root package name */
    public final f.b f30706e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30707f;

    /* renamed from: g, reason: collision with root package name */
    public final C1552a f30708g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30709h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C1552a f30710j;

    /* renamed from: k, reason: collision with root package name */
    public final okhttp3.b f30711k;

    /* renamed from: l, reason: collision with root package name */
    public final C1552a f30712l;

    /* renamed from: m, reason: collision with root package name */
    public final Proxy f30713m;

    /* renamed from: n, reason: collision with root package name */
    public final ProxySelector f30714n;

    /* renamed from: o, reason: collision with root package name */
    public final C1552a f30715o;

    /* renamed from: p, reason: collision with root package name */
    public final SocketFactory f30716p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f30717q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f30718r;

    /* renamed from: s, reason: collision with root package name */
    public final List<okhttp3.e> f30719s;

    /* renamed from: t, reason: collision with root package name */
    public final List<Protocol> f30720t;

    /* renamed from: u, reason: collision with root package name */
    public final HostnameVerifier f30721u;

    /* renamed from: v, reason: collision with root package name */
    public final CertificatePinner f30722v;

    /* renamed from: w, reason: collision with root package name */
    public final Ha.c f30723w;

    /* renamed from: x, reason: collision with root package name */
    public final int f30724x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30725y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30726z;

    /* compiled from: OkHttpClient.kt */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        public int f30727A;

        /* renamed from: B, reason: collision with root package name */
        public int f30728B;

        /* renamed from: C, reason: collision with root package name */
        public long f30729C;

        /* renamed from: D, reason: collision with root package name */
        public x.i f30730D;

        /* renamed from: a, reason: collision with root package name */
        public e f30731a = new e();

        /* renamed from: b, reason: collision with root package name */
        public N f30732b = new N(27, (byte) 0);

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f30733c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f30734d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public f.b f30735e = new com.sumsub.sns.geo.presentation.d(f.f30695a, 28);

        /* renamed from: f, reason: collision with root package name */
        public boolean f30736f = true;

        /* renamed from: g, reason: collision with root package name */
        public C1552a f30737g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f30738h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public C1552a f30739j;

        /* renamed from: k, reason: collision with root package name */
        public okhttp3.b f30740k;

        /* renamed from: l, reason: collision with root package name */
        public C1552a f30741l;

        /* renamed from: m, reason: collision with root package name */
        public Proxy f30742m;

        /* renamed from: n, reason: collision with root package name */
        public ProxySelector f30743n;

        /* renamed from: o, reason: collision with root package name */
        public C1552a f30744o;

        /* renamed from: p, reason: collision with root package name */
        public SocketFactory f30745p;

        /* renamed from: q, reason: collision with root package name */
        public SSLSocketFactory f30746q;

        /* renamed from: r, reason: collision with root package name */
        public X509TrustManager f30747r;

        /* renamed from: s, reason: collision with root package name */
        public List<okhttp3.e> f30748s;

        /* renamed from: t, reason: collision with root package name */
        public List<? extends Protocol> f30749t;

        /* renamed from: u, reason: collision with root package name */
        public HostnameVerifier f30750u;

        /* renamed from: v, reason: collision with root package name */
        public CertificatePinner f30751v;

        /* renamed from: w, reason: collision with root package name */
        public Ha.c f30752w;

        /* renamed from: x, reason: collision with root package name */
        public int f30753x;

        /* renamed from: y, reason: collision with root package name */
        public int f30754y;

        /* renamed from: z, reason: collision with root package name */
        public int f30755z;

        public a() {
            C1552a c1552a = C1552a.f30674a;
            this.f30737g = c1552a;
            this.f30738h = true;
            this.i = true;
            this.f30739j = C1552a.f30675b;
            this.f30741l = C1552a.f30676c;
            this.f30744o = c1552a;
            this.f30745p = SocketFactory.getDefault();
            this.f30748s = h.f30697F;
            this.f30749t = h.f30696E;
            this.f30750u = Ha.d.f1664a;
            this.f30751v = CertificatePinner.f24405c;
            this.f30754y = ModuleDescriptor.MODULE_VERSION;
            this.f30755z = ModuleDescriptor.MODULE_VERSION;
            this.f30727A = ModuleDescriptor.MODULE_VERSION;
            this.f30729C = 1024L;
        }

        public final void a(long j10, TimeUnit timeUnit) {
            this.f30754y = wa.b.b("timeout", j10, timeUnit);
        }

        public final void b(long j10, TimeUnit timeUnit) {
            this.f30755z = wa.b.b("timeout", j10, timeUnit);
        }

        public final void c(long j10, TimeUnit timeUnit) {
            this.f30727A = wa.b.b("timeout", j10, timeUnit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(va.h.a r5) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.h.<init>(va.h$a):void");
    }

    @Override // va.b.a
    public final za.e a(okhttp3.k kVar) {
        return new za.e(this, kVar, false);
    }

    public final a b() {
        a aVar = new a();
        aVar.f30731a = this.f30702a;
        aVar.f30732b = this.f30703b;
        q.x(aVar.f30733c, this.f30704c);
        q.x(aVar.f30734d, this.f30705d);
        aVar.f30735e = this.f30706e;
        aVar.f30736f = this.f30707f;
        aVar.f30737g = this.f30708g;
        aVar.f30738h = this.f30709h;
        aVar.i = this.i;
        aVar.f30739j = this.f30710j;
        aVar.f30740k = this.f30711k;
        aVar.f30741l = this.f30712l;
        aVar.f30742m = this.f30713m;
        aVar.f30743n = this.f30714n;
        aVar.f30744o = this.f30715o;
        aVar.f30745p = this.f30716p;
        aVar.f30746q = this.f30717q;
        aVar.f30747r = this.f30718r;
        aVar.f30748s = this.f30719s;
        aVar.f30749t = this.f30720t;
        aVar.f30750u = this.f30721u;
        aVar.f30751v = this.f30722v;
        aVar.f30752w = this.f30723w;
        aVar.f30753x = this.f30724x;
        aVar.f30754y = this.f30725y;
        aVar.f30755z = this.f30726z;
        aVar.f30727A = this.f30698A;
        aVar.f30728B = this.f30699B;
        aVar.f30729C = this.f30700C;
        aVar.f30730D = this.f30701D;
        return aVar;
    }

    public final Ia.d c(okhttp3.k kVar, m mVar) {
        Ia.d dVar = new Ia.d(ya.d.f31189h, kVar, mVar, new Random(), this.f30699B, this.f30700C);
        if (kVar.f24646c.a("Sec-WebSocket-Extensions") != null) {
            dVar.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            a b9 = b();
            f.a aVar = f.f30695a;
            byte[] bArr = wa.b.f30872a;
            b9.f30735e = new com.sumsub.sns.geo.presentation.d(aVar, 28);
            ArrayList arrayList = new ArrayList(Ia.d.f1954w);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            }
            if (!(!arrayList.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            }
            if (!(!arrayList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!kotlin.jvm.internal.f.b(arrayList, b9.f30749t)) {
                b9.f30730D = null;
            }
            b9.f30749t = Collections.unmodifiableList(arrayList);
            h hVar = new h(b9);
            k.a a10 = kVar.a();
            a10.f24652c.g("Upgrade", "websocket");
            a10.f24652c.g("Connection", "Upgrade");
            a10.f24652c.g("Sec-WebSocket-Key", dVar.f1960f);
            a10.f24652c.g("Sec-WebSocket-Version", "13");
            a10.f24652c.g("Sec-WebSocket-Extensions", "permessage-deflate");
            okhttp3.k b10 = a10.b();
            za.e eVar = new za.e(hVar, b10, true);
            dVar.f1961g = eVar;
            eVar.y(new Ia.e(dVar, b10));
        }
        return dVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public h() {
        this(new a());
    }
}
