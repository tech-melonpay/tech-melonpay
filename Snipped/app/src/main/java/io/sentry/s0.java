package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TraceContext.java */
/* loaded from: classes2.dex */
public final class s0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H9.g f22192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22194c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22195d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22196e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22197f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22198g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22199h;
    public Map<String, Object> i;

    /* compiled from: TraceContext.java */
    public static final class a implements A<s0> {
        public static IllegalStateException b(String str, InterfaceC0859q interfaceC0859q) {
            String a10 = androidx.camera.core.n.a("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(a10);
            interfaceC0859q.f(SentryLevel.ERROR, a10, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.A
        public final s0 a(D d10, InterfaceC0859q interfaceC0859q) {
            String str;
            String str2;
            String g02;
            d10.i();
            b bVar = null;
            String str3 = null;
            H9.g gVar = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "user_segment":
                        str4 = d10.s0();
                        break;
                    case "user_id":
                        str3 = d10.s0();
                        break;
                    case "environment":
                        str7 = d10.s0();
                        break;
                    case "user":
                        bVar = (b) d10.p0(interfaceC0859q, new b.a());
                        break;
                    case "sample_rate":
                        str9 = d10.s0();
                        break;
                    case "release":
                        str6 = d10.s0();
                        break;
                    case "trace_id":
                        gVar = new H9.g(d10.r0());
                        break;
                    case "public_key":
                        str5 = d10.r0();
                        break;
                    case "transaction":
                        str8 = d10.s0();
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
                throw b("trace_id", interfaceC0859q);
            }
            if (str5 == null) {
                throw b("public_key", interfaceC0859q);
            }
            if (bVar != null) {
                if (str3 == null) {
                    str3 = bVar.f22200a;
                }
                if (str4 == null) {
                    str2 = bVar.f22201b;
                    str = str3;
                    s0 s0Var = new s0(gVar, str5, str6, str7, str, str2, str8, str9);
                    s0Var.i = concurrentHashMap;
                    d10.A();
                    return s0Var;
                }
            }
            str = str3;
            str2 = str4;
            s0 s0Var2 = new s0(gVar, str5, str6, str7, str, str2, str8, str9);
            s0Var2.i = concurrentHashMap;
            d10.A();
            return s0Var2;
        }
    }

    /* compiled from: TraceContext.java */
    @Deprecated
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f22200a;

        /* renamed from: b, reason: collision with root package name */
        public String f22201b;

        /* compiled from: TraceContext.java */
        public static final class a implements A<b> {
            @Override // io.sentry.A
            public final b a(D d10, InterfaceC0859q interfaceC0859q) {
                d10.i();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (d10.v0() == JsonToken.NAME) {
                    String g02 = d10.g0();
                    g02.getClass();
                    if (g02.equals("id")) {
                        str = d10.s0();
                    } else if (g02.equals("segment")) {
                        str2 = d10.s0();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                    }
                }
                b bVar = new b();
                bVar.f22200a = str;
                bVar.f22201b = str2;
                d10.A();
                return bVar;
            }
        }
    }

    public s0(H9.g gVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22192a = gVar;
        this.f22193b = str;
        this.f22194c = str2;
        this.f22195d = str3;
        this.f22196e = str4;
        this.f22197f = str5;
        this.f22198g = str6;
        this.f22199h = str7;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("trace_id");
        e10.Q(interfaceC0859q, this.f22192a);
        e10.P("public_key");
        e10.H(this.f22193b);
        String str = this.f22194c;
        if (str != null) {
            e10.P("release");
            e10.H(str);
        }
        String str2 = this.f22195d;
        if (str2 != null) {
            e10.P("environment");
            e10.H(str2);
        }
        String str3 = this.f22196e;
        if (str3 != null) {
            e10.P("user_id");
            e10.H(str3);
        }
        String str4 = this.f22197f;
        if (str4 != null) {
            e10.P("user_segment");
            e10.H(str4);
        }
        String str5 = this.f22198g;
        if (str5 != null) {
            e10.P("transaction");
            e10.H(str5);
        }
        String str6 = this.f22199h;
        if (str6 != null) {
            e10.P("sample_rate");
            e10.H(str6);
        }
        Map<String, Object> map = this.i;
        if (map != null) {
            for (String str7 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.i, str7, e10, str7, interfaceC0859q);
            }
        }
        e10.p();
    }
}
