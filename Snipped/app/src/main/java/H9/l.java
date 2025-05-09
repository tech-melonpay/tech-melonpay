package H9;

import H9.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryThread.java */
/* loaded from: classes2.dex */
public final class l implements F {

    /* renamed from: a, reason: collision with root package name */
    public Long f1638a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f1639b;

    /* renamed from: c, reason: collision with root package name */
    public String f1640c;

    /* renamed from: d, reason: collision with root package name */
    public String f1641d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f1642e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f1643f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f1644g;

    /* renamed from: h, reason: collision with root package name */
    public k f1645h;
    public Map<String, Object> i;

    /* compiled from: SentryThread.java */
    public static final class a implements A<l> {
        @Override // io.sentry.A
        public final l a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            l lVar = new l();
            d10.i();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "daemon":
                        lVar.f1644g = d10.H();
                        break;
                    case "priority":
                        lVar.f1639b = d10.V();
                        break;
                    case "id":
                        lVar.f1638a = d10.a0();
                        break;
                    case "name":
                        lVar.f1640c = d10.s0();
                        break;
                    case "state":
                        lVar.f1641d = d10.s0();
                        break;
                    case "crashed":
                        lVar.f1642e = d10.H();
                        break;
                    case "current":
                        lVar.f1643f = d10.H();
                        break;
                    case "stacktrace":
                        lVar.f1645h = (k) d10.p0(interfaceC0859q, new k.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            lVar.i = concurrentHashMap;
            d10.A();
            return lVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1638a != null) {
            e10.P("id");
            e10.G(this.f1638a);
        }
        if (this.f1639b != null) {
            e10.P("priority");
            e10.G(this.f1639b);
        }
        if (this.f1640c != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f1640c);
        }
        if (this.f1641d != null) {
            e10.P("state");
            e10.H(this.f1641d);
        }
        if (this.f1642e != null) {
            e10.P("crashed");
            e10.E(this.f1642e);
        }
        if (this.f1643f != null) {
            e10.P("current");
            e10.E(this.f1643f);
        }
        if (this.f1644g != null) {
            e10.P("daemon");
            e10.E(this.f1644g);
        }
        if (this.f1645h != null) {
            e10.P("stacktrace");
            e10.Q(interfaceC0859q, this.f1645h);
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.i, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
