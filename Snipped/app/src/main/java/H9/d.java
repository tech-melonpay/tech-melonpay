package H9;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class d implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1582a;

    /* renamed from: b, reason: collision with root package name */
    public String f1583b;

    /* renamed from: c, reason: collision with root package name */
    public String f1584c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1585d;

    /* renamed from: e, reason: collision with root package name */
    public String f1586e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f1587f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, String> f1588g;

    /* renamed from: h, reason: collision with root package name */
    public Long f1589h;
    public Map<String, String> i;

    /* renamed from: j, reason: collision with root package name */
    public String f1590j;

    /* renamed from: k, reason: collision with root package name */
    public Map<String, Object> f1591k;

    /* compiled from: Request.java */
    public static final class a implements A<d> {
        @Override // io.sentry.A
        public final d a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            d dVar = new d();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "fragment":
                        dVar.f1590j = d10.s0();
                        break;
                    case "method":
                        dVar.f1583b = d10.s0();
                        break;
                    case "env":
                        Map map = (Map) d10.o0();
                        if (map == null) {
                            break;
                        } else {
                            dVar.f1588g = J9.a.a(map);
                            break;
                        }
                    case "url":
                        dVar.f1582a = d10.s0();
                        break;
                    case "data":
                        dVar.f1585d = d10.o0();
                        break;
                    case "other":
                        Map map2 = (Map) d10.o0();
                        if (map2 == null) {
                            break;
                        } else {
                            dVar.i = J9.a.a(map2);
                            break;
                        }
                    case "headers":
                        Map map3 = (Map) d10.o0();
                        if (map3 == null) {
                            break;
                        } else {
                            dVar.f1587f = J9.a.a(map3);
                            break;
                        }
                    case "cookies":
                        dVar.f1586e = d10.s0();
                        break;
                    case "body_size":
                        dVar.f1589h = d10.a0();
                        break;
                    case "query_string":
                        dVar.f1584c = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            dVar.f1591k = concurrentHashMap;
            d10.A();
            return dVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1582a != null) {
            e10.P(ImagesContract.URL);
            e10.H(this.f1582a);
        }
        if (this.f1583b != null) {
            e10.P(FirebaseAnalytics.Param.METHOD);
            e10.H(this.f1583b);
        }
        if (this.f1584c != null) {
            e10.P("query_string");
            e10.H(this.f1584c);
        }
        if (this.f1585d != null) {
            e10.P(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            e10.Q(interfaceC0859q, this.f1585d);
        }
        if (this.f1586e != null) {
            e10.P("cookies");
            e10.H(this.f1586e);
        }
        if (this.f1587f != null) {
            e10.P("headers");
            e10.Q(interfaceC0859q, this.f1587f);
        }
        if (this.f1588g != null) {
            e10.P("env");
            e10.Q(interfaceC0859q, this.f1588g);
        }
        if (this.i != null) {
            e10.P("other");
            e10.Q(interfaceC0859q, this.i);
        }
        if (this.f1590j != null) {
            e10.P("fragment");
            e10.Q(interfaceC0859q, this.f1590j);
        }
        if (this.f1589h != null) {
            e10.P("body_size");
            e10.Q(interfaceC0859q, this.f1589h);
        }
        Map<String, Object> map = this.f1591k;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1591k, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
