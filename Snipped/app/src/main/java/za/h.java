package za;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import va.k;
import x.i;

/* compiled from: RouteSelector.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.a f31409a;

    /* renamed from: b, reason: collision with root package name */
    public final i f31410b;

    /* renamed from: c, reason: collision with root package name */
    public final va.f f31411c;

    /* renamed from: d, reason: collision with root package name */
    public final List<? extends Proxy> f31412d;

    /* renamed from: e, reason: collision with root package name */
    public int f31413e;

    /* renamed from: f, reason: collision with root package name */
    public List<? extends InetSocketAddress> f31414f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31415g;

    /* compiled from: RouteSelector.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<k> f31416a;

        /* renamed from: b, reason: collision with root package name */
        public int f31417b;

        public a(ArrayList arrayList) {
            this.f31416a = arrayList;
        }

        public final boolean a() {
            return this.f31417b < this.f31416a.size();
        }
    }

    public h(okhttp3.a aVar, i iVar, e eVar, va.f fVar) {
        List<? extends Proxy> k3;
        this.f31409a = aVar;
        this.f31410b = iVar;
        this.f31411c = fVar;
        EmptyList emptyList = EmptyList.f23104a;
        this.f31412d = emptyList;
        this.f31414f = emptyList;
        this.f31415g = new ArrayList();
        Proxy proxy = aVar.f24439g;
        if (proxy != null) {
            k3 = Collections.singletonList(proxy);
        } else {
            URI i = aVar.i.i();
            if (i.getHost() == null) {
                k3 = wa.b.k(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f24440h.select(i);
                List<Proxy> list = select;
                k3 = (list == null || list.isEmpty()) ? wa.b.k(Proxy.NO_PROXY) : wa.b.w(select);
            }
        }
        this.f31412d = k3;
        this.f31413e = 0;
    }

    public final boolean a() {
        return (this.f31413e < this.f31412d.size()) || (this.f31415g.isEmpty() ^ true);
    }
}
