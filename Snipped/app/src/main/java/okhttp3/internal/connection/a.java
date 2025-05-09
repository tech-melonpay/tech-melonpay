package okhttp3.internal.connection;

import Ba.b;
import Ca.d;
import Ca.l;
import Ca.n;
import Ca.o;
import Ca.r;
import Ka.c;
import Ka.p;
import Ka.s;
import Ka.t;
import Ka.x;
import O9.m;
import ca.InterfaceC0635a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import ka.C0963h;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.k;
import okhttp3.p;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import va.f;
import va.h;
import va.k;
import x.i;
import za.b;
import za.e;

/* compiled from: RealConnection.kt */
/* loaded from: classes2.dex */
public final class a extends d.b {

    /* renamed from: b, reason: collision with root package name */
    public final k f24599b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f24600c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f24601d;

    /* renamed from: e, reason: collision with root package name */
    public Handshake f24602e;

    /* renamed from: f, reason: collision with root package name */
    public Protocol f24603f;

    /* renamed from: g, reason: collision with root package name */
    public d f24604g;

    /* renamed from: h, reason: collision with root package name */
    public t f24605h;
    public s i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24606j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24607k;

    /* renamed from: l, reason: collision with root package name */
    public int f24608l;

    /* renamed from: m, reason: collision with root package name */
    public int f24609m;

    /* renamed from: n, reason: collision with root package name */
    public int f24610n;

    /* renamed from: o, reason: collision with root package name */
    public int f24611o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f24612p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public long f24613q = Long.MAX_VALUE;

    /* compiled from: RealConnection.kt */
    /* renamed from: okhttp3.internal.connection.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0440a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24614a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24614a = iArr;
        }
    }

    public a(k kVar) {
        this.f24599b = kVar;
    }

    public static void d(h hVar, k kVar, IOException iOException) {
        if (kVar.f30765b.type() != Proxy.Type.DIRECT) {
            okhttp3.a aVar = kVar.f30764a;
            aVar.f24440h.connectFailed(aVar.i.i(), kVar.f30765b.address(), iOException);
        }
        i iVar = hVar.f30701D;
        synchronized (iVar) {
            ((LinkedHashSet) iVar.f30887a).add(kVar);
        }
    }

    @Override // Ca.d.b
    public final synchronized void a(r rVar) {
        this.f24611o = (rVar.f852a & 16) != 0 ? rVar.f853b[4] : Integer.MAX_VALUE;
    }

    @Override // Ca.d.b
    public final void b(n nVar) {
        nVar.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void c(int i, int i9, int i10, int i11, boolean z10, e eVar, f fVar) {
        k kVar;
        if (this.f24603f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        okhttp3.a aVar = this.f24599b.f30764a;
        List<okhttp3.e> list = aVar.f24442k;
        b bVar = new b(list);
        if (aVar.f24435c == null) {
            if (!list.contains(okhttp3.e.f24507f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f24599b.f30764a.i.f24528d;
            Ea.h hVar = Ea.h.f1121a;
            if (!Ea.h.f1121a.h(str)) {
                throw new RouteException(new UnknownServiceException(androidx.camera.core.n.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f24441j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                k kVar2 = this.f24599b;
                if (kVar2.f30764a.f24435c == null || kVar2.f30765b.type() != Proxy.Type.HTTP) {
                    e(i, i9, fVar);
                } else {
                    f(i, i9, i10, fVar);
                    if (this.f24600c == null) {
                        kVar = this.f24599b;
                        if (kVar.f30764a.f24435c == null && kVar.f30765b.type() == Proxy.Type.HTTP && this.f24600c == null) {
                            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f24613q = System.nanoTime();
                        return;
                    }
                }
                g(bVar, i11, fVar);
                InetSocketAddress inetSocketAddress = this.f24599b.f30766c;
                kVar = this.f24599b;
                if (kVar.f30764a.f24435c == null) {
                }
                this.f24613q = System.nanoTime();
                return;
            } catch (IOException e10) {
                Socket socket = this.f24601d;
                if (socket != null) {
                    wa.b.d(socket);
                }
                Socket socket2 = this.f24600c;
                if (socket2 != null) {
                    wa.b.d(socket2);
                }
                this.f24601d = null;
                this.f24600c = null;
                this.f24605h = null;
                this.i = null;
                this.f24602e = null;
                this.f24603f = null;
                this.f24604g = null;
                this.f24611o = 1;
                InetSocketAddress inetSocketAddress2 = this.f24599b.f30766c;
                if (routeException == null) {
                    routeException = new RouteException(e10);
                } else {
                    m.a(routeException.f24597a, e10);
                    routeException.f24598b = e10;
                }
                if (!z10) {
                    throw routeException;
                }
                bVar.f31353d = true;
                if (!bVar.f31352c) {
                    throw routeException;
                }
                if (e10 instanceof ProtocolException) {
                    throw routeException;
                }
                if (e10 instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e10 instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e10 instanceof SSLException);
        throw routeException;
    }

    public final void e(int i, int i9, f fVar) {
        int i10 = 0;
        int i11 = 1;
        k kVar = this.f24599b;
        Proxy proxy = kVar.f30765b;
        okhttp3.a aVar = kVar.f30764a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : C0440a.f24614a[type.ordinal()];
        Socket createSocket = (i12 == 1 || i12 == 2) ? aVar.f24434b.createSocket() : new Socket(proxy);
        this.f24600c = createSocket;
        InetSocketAddress inetSocketAddress = this.f24599b.f30766c;
        fVar.getClass();
        createSocket.setSoTimeout(i9);
        try {
            Ea.h hVar = Ea.h.f1121a;
            Ea.h.f1121a.e(createSocket, this.f24599b.f30766c, i);
            try {
                Logger logger = p.f2319a;
                x xVar = new x(createSocket);
                this.f24605h = new t(new Ka.d(i10, xVar, new Ka.d(i11, createSocket.getInputStream(), xVar)));
                x xVar2 = new x(createSocket);
                this.i = new s(new c(0, xVar2, new c(1, createSocket.getOutputStream(), xVar2)));
            } catch (NullPointerException e10) {
                if (kotlin.jvm.internal.f.b(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f24599b.f30766c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i, int i9, int i10, f fVar) {
        k.a aVar = new k.a();
        va.k kVar = this.f24599b;
        aVar.f24650a = kVar.f30764a.i;
        aVar.d("CONNECT", null);
        okhttp3.a aVar2 = kVar.f30764a;
        aVar.f24652c.g("Host", wa.b.v(aVar2.i, true));
        aVar.f24652c.g("Proxy-Connection", "Keep-Alive");
        aVar.f24652c.g("User-Agent", "okhttp/4.12.0");
        okhttp3.k b9 = aVar.b();
        p.a aVar3 = new p.a();
        aVar3.f24684a = b9;
        aVar3.f24685b = Protocol.HTTP_1_1;
        aVar3.f24686c = 407;
        aVar3.f24687d = "Preemptive Authenticate";
        aVar3.f24690g = wa.b.f30874c;
        aVar3.f24693k = -1L;
        aVar3.f24694l = -1L;
        aVar3.f24689f.g("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.f24438f.a(kVar, aVar3.a());
        e(i, i9, fVar);
        String str = "CONNECT " + wa.b.v(b9.f24644a, true) + " HTTP/1.1";
        t tVar = this.f24605h;
        s sVar = this.i;
        Ba.b bVar = new Ba.b(null, this, tVar, sVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.f2331a.b().g(i9, timeUnit);
        sVar.f2328a.b().g(i10, timeUnit);
        bVar.i(b9.f24646c, str);
        bVar.a();
        p.a d10 = bVar.d(false);
        d10.f24684a = b9;
        okhttp3.p a10 = d10.a();
        long j10 = wa.b.j(a10);
        if (j10 != -1) {
            b.d h9 = bVar.h(j10);
            wa.b.t(h9, Integer.MAX_VALUE, timeUnit);
            h9.close();
        }
        int i11 = a10.f24674d;
        if (i11 != 200) {
            if (i11 != 407) {
                throw new IOException(com.google.android.gms.measurement.internal.a.g(i11, "Unexpected response code for CONNECT: "));
            }
            aVar2.f24438f.a(kVar, a10);
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!tVar.f2332b.r() || !sVar.f2329b.r()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(za.b bVar, int i, f fVar) {
        int i9 = 0;
        int i10 = 1;
        okhttp3.a aVar = this.f24599b.f30764a;
        SSLSocketFactory sSLSocketFactory = aVar.f24435c;
        Protocol protocol = Protocol.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List<Protocol> list = aVar.f24441j;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol2)) {
                this.f24601d = this.f24600c;
                this.f24603f = protocol;
                return;
            } else {
                this.f24601d = this.f24600c;
                this.f24603f = protocol2;
                l(i);
                return;
            }
        }
        fVar.getClass();
        final okhttp3.a aVar2 = this.f24599b.f30764a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f24435c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Socket socket = this.f24600c;
            okhttp3.h hVar = aVar2.i;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory2.createSocket(socket, hVar.f24528d, hVar.f24529e, true);
            try {
                okhttp3.e a10 = bVar.a(sSLSocket2);
                if (a10.f24509b) {
                    Ea.h hVar2 = Ea.h.f1121a;
                    Ea.h.f1121a.d(sSLSocket2, aVar2.i.f24528d, aVar2.f24441j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                final Handshake a11 = Handshake.Companion.a(session);
                if (!aVar2.f24436d.verify(aVar2.i.f24528d, session)) {
                    List<Certificate> a12 = a11.a();
                    if (!(!a12.isEmpty())) {
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.i.f24528d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) a12.get(0);
                    StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                    sb2.append(aVar2.i.f24528d);
                    sb2.append(" not verified:\n              |    certificate: ");
                    CertificatePinner certificatePinner = CertificatePinner.f24405c;
                    sb2.append(CertificatePinner.a.a(x509Certificate));
                    sb2.append("\n              |    DN: ");
                    sb2.append(x509Certificate.getSubjectDN().getName());
                    sb2.append("\n              |    subjectAltNames: ");
                    sb2.append(P9.s.U(Ha.d.a(x509Certificate, 7), Ha.d.a(x509Certificate, 2)));
                    sb2.append("\n              ");
                    throw new SSLPeerUnverifiedException(C0963h.O(sb2.toString()));
                }
                final CertificatePinner certificatePinner2 = aVar2.f24437e;
                this.f24602e = new Handshake(a11.f24411a, a11.f24412b, a11.f24413c, new InterfaceC0635a<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final List<? extends Certificate> invoke() {
                        return CertificatePinner.this.f24407b.G(aVar2.i.f24528d, a11.a());
                    }
                });
                certificatePinner2.b(aVar2.i.f24528d, new InterfaceC0635a<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final List<? extends X509Certificate> invoke() {
                        List<Certificate> a13 = a.this.f24602e.a();
                        ArrayList arrayList = new ArrayList(P9.n.u(a13, 10));
                        Iterator<T> it = a13.iterator();
                        while (it.hasNext()) {
                            arrayList.add((X509Certificate) ((Certificate) it.next()));
                        }
                        return arrayList;
                    }
                });
                if (a10.f24509b) {
                    Ea.h hVar3 = Ea.h.f1121a;
                    str = Ea.h.f1121a.f(sSLSocket2);
                }
                this.f24601d = sSLSocket2;
                Logger logger = Ka.p.f2319a;
                x xVar = new x(sSLSocket2);
                this.f24605h = new t(new Ka.d(i9, xVar, new Ka.d(i10, sSLSocket2.getInputStream(), xVar)));
                x xVar2 = new x(sSLSocket2);
                this.i = new s(new c(0, xVar2, new c(1, sSLSocket2.getOutputStream(), xVar2)));
                if (str != null) {
                    protocol = Protocol.a.a(str);
                }
                this.f24603f = protocol;
                Ea.h hVar4 = Ea.h.f1121a;
                Ea.h.f1121a.a(sSLSocket2);
                if (this.f24603f == Protocol.HTTP_2) {
                    l(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Ea.h hVar5 = Ea.h.f1121a;
                    Ea.h.f1121a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    wa.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (Ha.d.c(r0, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(okhttp3.a r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            byte[] r0 = wa.b.f30872a
            java.util.ArrayList r0 = r8.f24612p
            int r0 = r0.size()
            int r1 = r8.f24611o
            r2 = 0
            if (r0 >= r1) goto Lb6
            boolean r0 = r8.f24606j
            if (r0 == 0) goto L13
            goto Lb6
        L13:
            va.k r0 = r8.f24599b
            okhttp3.a r1 = r0.f30764a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            okhttp3.h r1 = r9.i
            java.lang.String r3 = r1.f24528d
            okhttp3.a r4 = r0.f30764a
            okhttp3.h r5 = r4.i
            java.lang.String r5 = r5.f24528d
            boolean r3 = kotlin.jvm.internal.f.b(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            Ca.d r3 = r8.f24604g
            if (r3 != 0) goto L35
            return r2
        L35:
            if (r10 == 0) goto Lb6
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L3f
            goto Lb6
        L3f:
            java.util.Iterator r10 = r10.iterator()
        L43:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r10.next()
            va.k r3 = (va.k) r3
            java.net.Proxy r6 = r3.f30765b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L43
            java.net.Proxy r6 = r0.f30765b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L43
            java.net.InetSocketAddress r3 = r3.f30766c
            java.net.InetSocketAddress r6 = r0.f30766c
            boolean r3 = kotlin.jvm.internal.f.b(r6, r3)
            if (r3 == 0) goto L43
            Ha.d r10 = Ha.d.f1664a
            javax.net.ssl.HostnameVerifier r0 = r9.f24436d
            if (r0 == r10) goto L72
            return r2
        L72:
            byte[] r10 = wa.b.f30872a
            okhttp3.h r10 = r4.i
            int r0 = r10.f24529e
            int r3 = r1.f24529e
            if (r3 == r0) goto L7d
            goto Lb6
        L7d:
            java.lang.String r10 = r10.f24528d
            java.lang.String r0 = r1.f24528d
            boolean r10 = kotlin.jvm.internal.f.b(r0, r10)
            if (r10 == 0) goto L88
            goto Laa
        L88:
            boolean r10 = r8.f24607k
            if (r10 != 0) goto Lb6
            okhttp3.Handshake r10 = r8.f24602e
            if (r10 == 0) goto Lb6
            java.util.List r10 = r10.a()
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto Lb6
            java.lang.Object r10 = r10.get(r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = Ha.d.c(r0, r10)
            if (r10 == 0) goto Lb6
        Laa:
            okhttp3.CertificatePinner r9 = r9.f24437e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            okhttp3.Handshake r10 = r8.f24602e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            r9.a(r0, r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb6
            return r5
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.a.h(okhttp3.a, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z10) {
        long j10;
        byte[] bArr = wa.b.f30872a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f24600c;
        Socket socket2 = this.f24601d;
        t tVar = this.f24605h;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        d dVar = this.f24604g;
        if (dVar != null) {
            synchronized (dVar) {
                if (dVar.f736g) {
                    return false;
                }
                if (dVar.f744p < dVar.f743o) {
                    if (nanoTime >= dVar.f745q) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j10 = nanoTime - this.f24613q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z11 = !tVar.r();
                socket2.setSoTimeout(soTimeout);
                return z11;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final Aa.d j(h hVar, Aa.f fVar) {
        Socket socket = this.f24601d;
        t tVar = this.f24605h;
        s sVar = this.i;
        d dVar = this.f24604g;
        if (dVar != null) {
            return new l(hVar, this, fVar, dVar);
        }
        int i = fVar.f154g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVar.f2331a.b().g(i, timeUnit);
        sVar.f2328a.b().g(fVar.f155h, timeUnit);
        return new Ba.b(hVar, this, tVar, sVar);
    }

    public final synchronized void k() {
        this.f24606j = true;
    }

    public final void l(int i) {
        Socket socket = this.f24601d;
        t tVar = this.f24605h;
        s sVar = this.i;
        socket.setSoTimeout(0);
        ya.d dVar = ya.d.f31189h;
        d.a aVar = new d.a(dVar);
        String str = this.f24599b.f30764a.i.f24528d;
        aVar.f757c = socket;
        aVar.f758d = wa.b.f30878g + ' ' + str;
        aVar.f759e = tVar;
        aVar.f760f = sVar;
        aVar.f761g = this;
        aVar.i = i;
        d dVar2 = new d(aVar);
        this.f24604g = dVar2;
        r rVar = d.f728B;
        this.f24611o = (rVar.f852a & 16) != 0 ? rVar.f853b[4] : Integer.MAX_VALUE;
        o oVar = dVar2.f753y;
        synchronized (oVar) {
            try {
                if (oVar.f843e) {
                    throw new IOException("closed");
                }
                if (oVar.f840b) {
                    Logger logger = o.f838g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(wa.b.h(">> CONNECTION " + Ca.c.f724b.e(), new Object[0]));
                    }
                    oVar.f839a.Z(Ca.c.f724b);
                    oVar.f839a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o oVar2 = dVar2.f753y;
        r rVar2 = dVar2.f746r;
        synchronized (oVar2) {
            try {
                if (oVar2.f843e) {
                    throw new IOException("closed");
                }
                oVar2.j(0, Integer.bitCount(rVar2.f852a) * 6, 4, 0);
                int i9 = 0;
                while (i9 < 10) {
                    if (((1 << i9) & rVar2.f852a) != 0) {
                        oVar2.f839a.l(i9 != 4 ? i9 != 7 ? i9 : 4 : 3);
                        oVar2.f839a.o(rVar2.f853b[i9]);
                    }
                    i9++;
                }
                oVar2.f839a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar2.f746r.a() != 65535) {
            dVar2.f753y.C(0, r0 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        }
        dVar.f().c(new Ca.k(dVar2.f733d, dVar2.f754z, 2), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        va.k kVar = this.f24599b;
        sb2.append(kVar.f30764a.i.f24528d);
        sb2.append(':');
        sb2.append(kVar.f30764a.i.f24529e);
        sb2.append(", proxy=");
        sb2.append(kVar.f30765b);
        sb2.append(" hostAddress=");
        sb2.append(kVar.f30766c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f24602e;
        if (handshake == null || (obj = handshake.f24412b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f24603f);
        sb2.append('}');
        return sb2.toString();
    }
}
