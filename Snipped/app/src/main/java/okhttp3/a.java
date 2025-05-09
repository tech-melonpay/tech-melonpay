package okhttp3;

import C.v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.h;
import va.C1552a;

/* compiled from: Address.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1552a f24433a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f24434b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f24435c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f24436d;

    /* renamed from: e, reason: collision with root package name */
    public final CertificatePinner f24437e;

    /* renamed from: f, reason: collision with root package name */
    public final C1552a f24438f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f24439g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f24440h;
    public final h i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Protocol> f24441j;

    /* renamed from: k, reason: collision with root package name */
    public final List<e> f24442k;

    public a(String str, int i, C1552a c1552a, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, C1552a c1552a2, Proxy proxy, List<? extends Protocol> list, List<e> list2, ProxySelector proxySelector) {
        this.f24433a = c1552a;
        this.f24434b = socketFactory;
        this.f24435c = sSLSocketFactory;
        this.f24436d = hostnameVerifier;
        this.f24437e = certificatePinner;
        this.f24438f = c1552a2;
        this.f24439g = proxy;
        this.f24440h = proxySelector;
        h.a aVar = new h.a();
        aVar.e(sSLSocketFactory != null ? "https" : "http");
        aVar.c(str);
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "unexpected port: ").toString());
        }
        aVar.f24538e = i;
        this.i = aVar.a();
        this.f24441j = wa.b.w(list);
        this.f24442k = wa.b.w(list2);
    }

    public final boolean a(a aVar) {
        return kotlin.jvm.internal.f.b(this.f24433a, aVar.f24433a) && kotlin.jvm.internal.f.b(this.f24438f, aVar.f24438f) && kotlin.jvm.internal.f.b(this.f24441j, aVar.f24441j) && kotlin.jvm.internal.f.b(this.f24442k, aVar.f24442k) && kotlin.jvm.internal.f.b(this.f24440h, aVar.f24440h) && kotlin.jvm.internal.f.b(this.f24439g, aVar.f24439g) && kotlin.jvm.internal.f.b(this.f24435c, aVar.f24435c) && kotlin.jvm.internal.f.b(this.f24436d, aVar.f24436d) && kotlin.jvm.internal.f.b(this.f24437e, aVar.f24437e) && this.i.f24529e == aVar.i.f24529e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.f.b(this.i, aVar.i) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f24437e) + ((Objects.hashCode(this.f24436d) + ((Objects.hashCode(this.f24435c) + ((Objects.hashCode(this.f24439g) + ((this.f24440h.hashCode() + v.f(this.f24442k, v.f(this.f24441j, (this.f24438f.hashCode() + ((this.f24433a.hashCode() + v.c(527, 31, this.i.i)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        h hVar = this.i;
        sb2.append(hVar.f24528d);
        sb2.append(':');
        sb2.append(hVar.f24529e);
        sb2.append(", ");
        Proxy proxy = this.f24439g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f24440h;
        }
        return v.q(sb2, str, '}');
    }
}
