package Aa;

import O9.m;
import P9.s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import okhttp3.CertificatePinner;
import okhttp3.h;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.k;
import okhttp3.o;
import okhttp3.p;
import va.g;
import za.h;

/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes2.dex */
public final class h implements va.g {

    /* renamed from: a, reason: collision with root package name */
    public final va.h f159a;

    public h(va.h hVar) {
        this.f159a = hVar;
    }

    public static int c(p pVar, int i) {
        String i9 = p.i("Retry-After", pVar);
        if (i9 == null) {
            return i;
        }
        if (s3.b.w("\\d+", i9)) {
            return Integer.valueOf(i9).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final k a(p pVar, za.c cVar) {
        okhttp3.internal.connection.a aVar;
        va.k kVar = (cVar == null || (aVar = cVar.f31360g) == null) ? null : aVar.f24599b;
        int i = pVar.f24674d;
        k kVar2 = pVar.f24671a;
        String str = kVar2.f24645b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                this.f159a.f30708g.a(kVar, pVar);
                return null;
            }
            if (i == 421) {
                o oVar = kVar2.f24647d;
                if ((oVar != null && oVar.isOneShot()) || cVar == null || !(!kotlin.jvm.internal.f.b(cVar.f31356c.f31373b.i.f24528d, cVar.f31360g.f24599b.f30764a.i.f24528d))) {
                    return null;
                }
                okhttp3.internal.connection.a aVar2 = cVar.f31360g;
                synchronized (aVar2) {
                    aVar2.f24607k = true;
                }
                return pVar.f24671a;
            }
            if (i == 503) {
                p pVar2 = pVar.f24679j;
                if ((pVar2 == null || pVar2.f24674d != 503) && c(pVar, Integer.MAX_VALUE) == 0) {
                    return pVar.f24671a;
                }
                return null;
            }
            if (i == 407) {
                if (kVar.f30765b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                this.f159a.f30715o.a(kVar, pVar);
                return null;
            }
            if (i == 408) {
                if (!this.f159a.f30707f) {
                    return null;
                }
                o oVar2 = kVar2.f24647d;
                if (oVar2 != null && oVar2.isOneShot()) {
                    return null;
                }
                p pVar3 = pVar.f24679j;
                if ((pVar3 == null || pVar3.f24674d != 408) && c(pVar, 0) <= 0) {
                    return pVar.f24671a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        va.h hVar = this.f159a;
        if (!hVar.f30709h) {
            return null;
        }
        String a10 = pVar.f24676f.a("Location");
        if (a10 == null) {
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        k kVar3 = pVar.f24671a;
        h.a g10 = kVar3.f24644a.g(a10);
        okhttp3.h a11 = g10 != null ? g10.a() : null;
        if (a11 == null) {
            return null;
        }
        if (!kotlin.jvm.internal.f.b(a11.f24525a, kVar3.f24644a.f24525a) && !hVar.i) {
            return null;
        }
        k.a a12 = kVar3.a();
        if (D9.b.p0(str)) {
            boolean b9 = kotlin.jvm.internal.f.b(str, "PROPFIND");
            int i9 = pVar.f24674d;
            boolean z10 = b9 || i9 == 308 || i9 == 307;
            if (!(!kotlin.jvm.internal.f.b(str, "PROPFIND")) || i9 == 308 || i9 == 307) {
                a12.d(str, z10 ? kVar3.f24647d : null);
            } else {
                a12.d("GET", null);
            }
            if (!z10) {
                a12.e("Transfer-Encoding");
                a12.e("Content-Length");
                a12.e("Content-Type");
            }
        }
        if (!wa.b.a(kVar3.f24644a, a11)) {
            a12.e("Authorization");
        }
        a12.f24650a = a11;
        return a12.b();
    }

    public final boolean b(IOException iOException, za.e eVar, k kVar, boolean z10) {
        za.h hVar;
        okhttp3.internal.connection.a aVar;
        o oVar;
        if (!this.f159a.f30707f) {
            return false;
        }
        if ((z10 && (((oVar = kVar.f24647d) != null && oVar.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z10)) {
            return false;
        }
        za.d dVar = eVar.i;
        int i = dVar.f31378g;
        if (i != 0 || dVar.f31379h != 0 || dVar.i != 0) {
            if (dVar.f31380j == null) {
                va.k kVar2 = null;
                if (i <= 1 && dVar.f31379h <= 1 && dVar.i <= 0 && (aVar = dVar.f31374c.f31389j) != null) {
                    synchronized (aVar) {
                        if (aVar.f24608l == 0) {
                            if (wa.b.a(aVar.f24599b.f30764a.i, dVar.f31373b.i)) {
                                kVar2 = aVar.f24599b;
                            }
                        }
                    }
                }
                if (kVar2 != null) {
                    dVar.f31380j = kVar2;
                } else {
                    h.a aVar2 = dVar.f31376e;
                    if ((aVar2 == null || !aVar2.a()) && (hVar = dVar.f31377f) != null && !hVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // va.g
    public final p intercept(g.a aVar) {
        List list;
        int i;
        za.c cVar;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        boolean z10 = true;
        f fVar = (f) aVar;
        k kVar = fVar.f152e;
        za.e eVar = fVar.f148a;
        List list2 = EmptyList.f23104a;
        p pVar = null;
        int i9 = 0;
        k kVar2 = kVar;
        boolean z11 = true;
        while (eVar.f31391l == null) {
            synchronized (eVar) {
                if (!(eVar.f31393n ^ z10)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(eVar.f31392m ^ z10)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                O9.p pVar2 = O9.p.f3034a;
            }
            if (z11) {
                za.g gVar = eVar.f31384d;
                okhttp3.h hVar = kVar2.f24644a;
                boolean z12 = hVar.f24533j;
                va.h hVar2 = eVar.f31381a;
                if (z12) {
                    SSLSocketFactory sSLSocketFactory2 = hVar2.f30717q;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = hVar2.f30721u;
                    certificatePinner = hVar2.f30722v;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    certificatePinner = null;
                }
                list = list2;
                i = i9;
                eVar.i = new za.d(gVar, new okhttp3.a(hVar.f24528d, hVar.f24529e, hVar2.f30712l, hVar2.f30716p, sSLSocketFactory, hostnameVerifier, certificatePinner, hVar2.f30715o, hVar2.f30713m, hVar2.f30720t, hVar2.f30719s, hVar2.f30714n), eVar, eVar.f31385e);
            } else {
                list = list2;
                i = i9;
            }
            try {
                if (eVar.f31395p) {
                    throw new IOException("Canceled");
                }
                try {
                    p a10 = fVar.a(kVar2);
                    if (pVar != null) {
                        p.a p10 = a10.p();
                        p.a p11 = pVar.p();
                        p11.f24690g = null;
                        p a11 = p11.a();
                        if (a11.f24677g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        p10.f24692j = a11;
                        a10 = p10.a();
                    }
                    pVar = a10;
                    cVar = eVar.f31391l;
                    kVar2 = a(pVar, cVar);
                } catch (IOException e10) {
                    if (!b(e10, eVar, kVar2, !(e10 instanceof ConnectionShutdownException))) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            m.a(e10, (Exception) it.next());
                        }
                        throw e10;
                    }
                    list2 = s.T(e10, list);
                    eVar.d(true);
                    z10 = true;
                    i9 = i;
                    z11 = false;
                } catch (RouteException e11) {
                    if (!b(e11.f24598b, eVar, kVar2, false)) {
                        IOException iOException = e11.f24597a;
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            m.a(iOException, (Exception) it2.next());
                        }
                        throw iOException;
                    }
                    list2 = s.T(e11.f24597a, list);
                    z10 = true;
                    eVar.d(true);
                    z11 = false;
                    i9 = i;
                }
                if (kVar2 == null) {
                    if (cVar != null && cVar.f31358e) {
                        if (!(!eVar.f31390k)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        eVar.f31390k = true;
                        eVar.f31386f.j();
                    }
                    eVar.d(false);
                    return pVar;
                }
                o oVar = kVar2.f24647d;
                if (oVar != null && oVar.isOneShot()) {
                    eVar.d(false);
                    return pVar;
                }
                va.i iVar = pVar.f24677g;
                if (iVar != null) {
                    wa.b.c(iVar);
                }
                i9 = i + 1;
                if (i9 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i9);
                }
                eVar.d(true);
                list2 = list;
                z11 = true;
                z10 = true;
            } catch (Throwable th) {
                eVar.d(true);
                throw th;
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
