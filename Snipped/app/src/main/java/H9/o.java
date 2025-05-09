package H9;

import com.google.firebase.messaging.Constants;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: User.java */
/* loaded from: classes2.dex */
public final class o implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1655a;

    /* renamed from: b, reason: collision with root package name */
    public String f1656b;

    /* renamed from: c, reason: collision with root package name */
    public String f1657c;

    /* renamed from: d, reason: collision with root package name */
    public String f1658d;

    /* renamed from: e, reason: collision with root package name */
    public String f1659e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f1660f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f1661g;

    /* compiled from: User.java */
    public static final class a implements A<o> {
        @Override // io.sentry.A
        public final o a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "username":
                        oVar.f1657c = d10.s0();
                        break;
                    case "id":
                        oVar.f1656b = d10.s0();
                        break;
                    case "data":
                        oVar.f1660f = J9.a.a((Map) d10.o0());
                        break;
                    case "email":
                        oVar.f1655a = d10.s0();
                        break;
                    case "other":
                        Map<String, String> map = oVar.f1660f;
                        if (map != null && !map.isEmpty()) {
                            break;
                        } else {
                            oVar.f1660f = J9.a.a((Map) d10.o0());
                            break;
                        }
                    case "ip_address":
                        oVar.f1659e = d10.s0();
                        break;
                    case "segment":
                        oVar.f1658d = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            oVar.f1661g = concurrentHashMap;
            d10.A();
            return oVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1655a != null) {
            e10.P("email");
            e10.H(this.f1655a);
        }
        if (this.f1656b != null) {
            e10.P("id");
            e10.H(this.f1656b);
        }
        if (this.f1657c != null) {
            e10.P("username");
            e10.H(this.f1657c);
        }
        if (this.f1658d != null) {
            e10.P("segment");
            e10.H(this.f1658d);
        }
        if (this.f1659e != null) {
            e10.P("ip_address");
            e10.H(this.f1659e);
        }
        if (this.f1660f != null) {
            e10.P(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            e10.Q(interfaceC0859q, this.f1660f);
        }
        Map<String, Object> map = this.f1661g;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1661g, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
