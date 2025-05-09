package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SpanContext.java */
/* loaded from: classes2.dex */
public class p0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H9.g f22102a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f22103b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f22104c;

    /* renamed from: d, reason: collision with root package name */
    public transient Fa.h f22105d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22106e;

    /* renamed from: f, reason: collision with root package name */
    public String f22107f;

    /* renamed from: g, reason: collision with root package name */
    public SpanStatus f22108g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap f22109h;
    public Map<String, Object> i;

    /* compiled from: SpanContext.java */
    public static final class a implements A<p0> {
        public static p0 b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            H9.g gVar = null;
            q0 q0Var = null;
            String str = null;
            q0 q0Var2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            SpanStatus spanStatus = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "span_id":
                        q0Var = new q0(d10.r0());
                        break;
                    case "parent_span_id":
                        if (d10.v0() != JsonToken.NULL) {
                            q0Var2 = new q0(d10.r0());
                            break;
                        } else {
                            d10.n0();
                            q0Var2 = null;
                            break;
                        }
                    case "description":
                        str2 = d10.r0();
                        break;
                    case "status":
                        if (d10.v0() != JsonToken.NULL) {
                            spanStatus = SpanStatus.valueOf(d10.r0().toUpperCase(Locale.ROOT));
                            break;
                        } else {
                            d10.n0();
                            spanStatus = null;
                            break;
                        }
                    case "op":
                        str = d10.r0();
                        break;
                    case "tags":
                        concurrentHashMap2 = J9.a.a((Map) d10.o0());
                        break;
                    case "trace_id":
                        gVar = new H9.g(d10.r0());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            if (gVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (q0Var == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (str == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"op\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"op\"", illegalStateException3);
                throw illegalStateException3;
            }
            p0 p0Var = new p0(gVar, q0Var, str, q0Var2, null);
            p0Var.f22107f = str2;
            p0Var.f22108g = spanStatus;
            if (concurrentHashMap2 != null) {
                p0Var.f22109h = concurrentHashMap2;
            }
            p0Var.i = concurrentHashMap;
            d10.A();
            return p0Var;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ p0 a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    public p0(H9.g gVar, q0 q0Var, String str, q0 q0Var2, Fa.h hVar) {
        this(gVar, q0Var, q0Var2, str, null, hVar, null);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("trace_id");
        this.f22102a.serialize(e10, interfaceC0859q);
        e10.P("span_id");
        e10.H(this.f22103b.f22186a);
        q0 q0Var = this.f22104c;
        if (q0Var != null) {
            e10.P("parent_span_id");
            e10.H(q0Var.f22186a);
        }
        e10.P("op");
        e10.H(this.f22106e);
        if (this.f22107f != null) {
            e10.P("description");
            e10.H(this.f22107f);
        }
        if (this.f22108g != null) {
            e10.P("status");
            e10.Q(interfaceC0859q, this.f22108g);
        }
        if (!this.f22109h.isEmpty()) {
            e10.P("tags");
            e10.Q(interfaceC0859q, this.f22109h);
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.i, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public p0(H9.g gVar, q0 q0Var, q0 q0Var2, String str, String str2, Fa.h hVar, SpanStatus spanStatus) {
        this.f22109h = new ConcurrentHashMap();
        D9.b.t0(gVar, "traceId is required");
        this.f22102a = gVar;
        D9.b.t0(q0Var, "spanId is required");
        this.f22103b = q0Var;
        D9.b.t0(str, "operation is required");
        this.f22106e = str;
        this.f22104c = q0Var2;
        this.f22105d = hVar;
        this.f22107f = str2;
        this.f22108g = spanStatus;
    }

    public p0(p0 p0Var) {
        this.f22109h = new ConcurrentHashMap();
        this.f22102a = p0Var.f22102a;
        this.f22103b = p0Var.f22103b;
        this.f22104c = p0Var.f22104c;
        this.f22105d = p0Var.f22105d;
        this.f22106e = p0Var.f22106e;
        this.f22107f = p0Var.f22107f;
        this.f22108g = p0Var.f22108g;
        ConcurrentHashMap a10 = J9.a.a(p0Var.f22109h);
        if (a10 != null) {
            this.f22109h = a10;
        }
    }
}
