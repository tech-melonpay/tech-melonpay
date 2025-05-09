package H9;

import com.google.firebase.messaging.Constants;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.o0;
import io.sentry.p0;
import io.sentry.q0;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentrySpan.java */
/* loaded from: classes2.dex */
public final class i implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Double f1609a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f1610b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1611c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f1612d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f1613e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1614f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1615g;

    /* renamed from: h, reason: collision with root package name */
    public final SpanStatus f1616h;
    public final Map<String, String> i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Object> f1617j;

    /* renamed from: k, reason: collision with root package name */
    public Map<String, Object> f1618k;

    /* compiled from: SentrySpan.java */
    public static final class a implements A<i> {
        public static IllegalStateException b(String str, InterfaceC0859q interfaceC0859q) {
            String a10 = androidx.camera.core.n.a("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(a10);
            interfaceC0859q.f(SentryLevel.ERROR, a10, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.A
        public final i a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            Map map = null;
            Double d11 = null;
            Double d12 = null;
            g gVar = null;
            q0 q0Var = null;
            q0 q0Var2 = null;
            String str = null;
            String str2 = null;
            SpanStatus spanStatus = null;
            Map map2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (true) {
                Map map3 = map2;
                SpanStatus spanStatus2 = spanStatus;
                if (d10.v0() != JsonToken.NAME) {
                    if (d11 == null) {
                        throw b("start_timestamp", interfaceC0859q);
                    }
                    if (gVar == null) {
                        throw b("trace_id", interfaceC0859q);
                    }
                    if (q0Var == null) {
                        throw b("span_id", interfaceC0859q);
                    }
                    if (str == null) {
                        throw b("op", interfaceC0859q);
                    }
                    i iVar = new i(d11, d12, gVar, q0Var, q0Var2, str, str2, spanStatus2, map == null ? new HashMap() : map, map3);
                    iVar.f1618k = concurrentHashMap;
                    d10.A();
                    return iVar;
                }
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "span_id":
                        q0Var = new q0(d10.r0());
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "parent_span_id":
                        if (d10.v0() == JsonToken.NULL) {
                            d10.n0();
                            q0Var2 = null;
                        } else {
                            q0Var2 = new q0(d10.r0());
                        }
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "description":
                        str2 = d10.s0();
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "start_timestamp":
                        try {
                            d11 = d10.P();
                        } catch (NumberFormatException unused) {
                            d11 = d10.M(interfaceC0859q) != null ? Double.valueOf(r3.getTime() / 1000.0d) : null;
                        }
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "status":
                        if (d10.v0() == JsonToken.NULL) {
                            d10.n0();
                            spanStatus = null;
                        } else {
                            spanStatus = SpanStatus.valueOf(d10.r0().toUpperCase(Locale.ROOT));
                        }
                        map2 = map3;
                        break;
                    case "op":
                        str = d10.s0();
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "data":
                        map2 = (Map) d10.o0();
                        spanStatus = spanStatus2;
                        break;
                    case "tags":
                        map = (Map) d10.o0();
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "timestamp":
                        try {
                            d12 = d10.P();
                        } catch (NumberFormatException unused2) {
                            d12 = d10.M(interfaceC0859q) != null ? Double.valueOf(r4.getTime() / 1000.0d) : null;
                        }
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    case "trace_id":
                        gVar = new g(d10.r0());
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        map2 = map3;
                        spanStatus = spanStatus2;
                        break;
                }
            }
        }
    }

    public i() {
        throw null;
    }

    public i(Double d10, Double d11, g gVar, q0 q0Var, q0 q0Var2, String str, String str2, SpanStatus spanStatus, Map<String, String> map, Map<String, Object> map2) {
        this.f1609a = d10;
        this.f1610b = d11;
        this.f1611c = gVar;
        this.f1612d = q0Var;
        this.f1613e = q0Var2;
        this.f1614f = str;
        this.f1615g = str2;
        this.f1616h = spanStatus;
        this.i = map;
        this.f1617j = map2;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f1609a.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        e10.Q(interfaceC0859q, valueOf.setScale(6, roundingMode));
        Double d10 = this.f1610b;
        if (d10 != null) {
            e10.P("timestamp");
            e10.Q(interfaceC0859q, BigDecimal.valueOf(d10.doubleValue()).setScale(6, roundingMode));
        }
        e10.P("trace_id");
        e10.Q(interfaceC0859q, this.f1611c);
        e10.P("span_id");
        e10.Q(interfaceC0859q, this.f1612d);
        Object obj = this.f1613e;
        if (obj != null) {
            e10.P("parent_span_id");
            e10.Q(interfaceC0859q, obj);
        }
        e10.P("op");
        e10.H(this.f1614f);
        String str = this.f1615g;
        if (str != null) {
            e10.P("description");
            e10.H(str);
        }
        Object obj2 = this.f1616h;
        if (obj2 != null) {
            e10.P("status");
            e10.Q(interfaceC0859q, obj2);
        }
        Map<String, String> map = this.i;
        if (!map.isEmpty()) {
            e10.P("tags");
            e10.Q(interfaceC0859q, map);
        }
        Object obj3 = this.f1617j;
        if (obj3 != null) {
            e10.P(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            e10.Q(interfaceC0859q, obj3);
        }
        Map<String, Object> map2 = this.f1618k;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1618k, str2, e10, str2, interfaceC0859q);
            }
        }
        e10.p();
    }

    public i(o0 o0Var) {
        ConcurrentHashMap concurrentHashMap = o0Var.f22101j;
        p0 p0Var = o0Var.f22097e;
        this.f1615g = p0Var.f22107f;
        this.f1614f = p0Var.f22106e;
        this.f1612d = p0Var.f22103b;
        this.f1613e = p0Var.f22104c;
        this.f1611c = p0Var.f22102a;
        this.f1616h = p0Var.f22108g;
        ConcurrentHashMap a10 = J9.a.a(p0Var.f22109h);
        this.i = a10 == null ? new ConcurrentHashMap() : a10;
        this.f1610b = o0Var.n(o0Var.f22095c);
        this.f1609a = Double.valueOf(o0Var.f22093a.getTime() / 1000.0d);
        this.f1617j = concurrentHashMap;
    }
}
