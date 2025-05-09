package io.sentry;

import H9.c;
import H9.f;
import H9.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.Z;
import io.sentry.protocol.c;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryEvent.java */
/* loaded from: classes2.dex */
public final class i0 extends Z implements F {

    /* renamed from: o, reason: collision with root package name */
    public Date f22036o;

    /* renamed from: p, reason: collision with root package name */
    public H9.c f22037p;

    /* renamed from: q, reason: collision with root package name */
    public String f22038q;

    /* renamed from: r, reason: collision with root package name */
    public C.N f22039r;

    /* renamed from: s, reason: collision with root package name */
    public C.N f22040s;

    /* renamed from: t, reason: collision with root package name */
    public SentryLevel f22041t;

    /* renamed from: u, reason: collision with root package name */
    public String f22042u;

    /* renamed from: v, reason: collision with root package name */
    public List<String> f22043v;

    /* renamed from: w, reason: collision with root package name */
    public Map<String, Object> f22044w;

    /* renamed from: x, reason: collision with root package name */
    public Map<String, String> f22045x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.protocol.c f22046y;

    /* compiled from: SentryEvent.java */
    public static final class a implements A<i0> {
        @Override // io.sentry.A
        public final i0 a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            SentryLevel valueOf;
            d10.i();
            i0 i0Var = new i0();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "debug_meta":
                        i0Var.f22046y = (io.sentry.protocol.c) d10.p0(interfaceC0859q, new c.a());
                        break;
                    case "fingerprint":
                        List<String> list = (List) d10.o0();
                        if (list == null) {
                            break;
                        } else {
                            i0Var.f22043v = list;
                            break;
                        }
                    case "threads":
                        d10.i();
                        d10.g0();
                        i0Var.f22039r = new C.N(d10.W(interfaceC0859q, new l.a()));
                        d10.A();
                        break;
                    case "logger":
                        i0Var.f22038q = d10.s0();
                        break;
                    case "timestamp":
                        Date M8 = d10.M(interfaceC0859q);
                        if (M8 == null) {
                            break;
                        } else {
                            i0Var.f22036o = M8;
                            break;
                        }
                    case "level":
                        if (d10.v0() == JsonToken.NULL) {
                            d10.n0();
                            valueOf = null;
                        } else {
                            valueOf = SentryLevel.valueOf(d10.r0().toUpperCase(Locale.ROOT));
                        }
                        i0Var.f22041t = valueOf;
                        break;
                    case "message":
                        i0Var.f22037p = (H9.c) d10.p0(interfaceC0859q, new c.a());
                        break;
                    case "modules":
                        i0Var.f22045x = J9.a.a((Map) d10.o0());
                        break;
                    case "exception":
                        d10.i();
                        d10.g0();
                        i0Var.f22040s = new C.N(d10.W(interfaceC0859q, new f.a()));
                        d10.A();
                        break;
                    case "transaction":
                        i0Var.f22042u = d10.s0();
                        break;
                    default:
                        if (!Z.a.a(i0Var, g02, d10, interfaceC0859q)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            d10.t0(interfaceC0859q, concurrentHashMap, g02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            i0Var.f22044w = concurrentHashMap;
            d10.A();
            return i0Var;
        }
    }

    public i0(Throwable th) {
        this();
        this.f21925j = th;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("timestamp");
        e10.Q(interfaceC0859q, this.f22036o);
        if (this.f22037p != null) {
            e10.P("message");
            e10.Q(interfaceC0859q, this.f22037p);
        }
        if (this.f22038q != null) {
            e10.P("logger");
            e10.H(this.f22038q);
        }
        C.N n10 = this.f22039r;
        if (n10 != null && !((ArrayList) n10.f535b).isEmpty()) {
            e10.P("threads");
            e10.i();
            e10.P("values");
            e10.Q(interfaceC0859q, (ArrayList) this.f22039r.f535b);
            e10.p();
        }
        C.N n11 = this.f22040s;
        if (n11 != null && !((ArrayList) n11.f535b).isEmpty()) {
            e10.P("exception");
            e10.i();
            e10.P("values");
            e10.Q(interfaceC0859q, (ArrayList) this.f22040s.f535b);
            e10.p();
        }
        if (this.f22041t != null) {
            e10.P(FirebaseAnalytics.Param.LEVEL);
            e10.Q(interfaceC0859q, this.f22041t);
        }
        if (this.f22042u != null) {
            e10.P("transaction");
            e10.H(this.f22042u);
        }
        if (this.f22043v != null) {
            e10.P("fingerprint");
            e10.Q(interfaceC0859q, this.f22043v);
        }
        if (this.f22045x != null) {
            e10.P("modules");
            e10.Q(interfaceC0859q, this.f22045x);
        }
        if (this.f22046y != null) {
            e10.P("debug_meta");
            e10.Q(interfaceC0859q, this.f22046y);
        }
        Z.b.a(this, e10, interfaceC0859q);
        Map<String, Object> map = this.f22044w;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22044w, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0() {
        /*
            r2 = this;
            H9.g r0 = new H9.g
            r0.<init>()
            java.util.Date r1 = io.sentry.I.n()
            r2.<init>(r0)
            r2.f22036o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.i0.<init>():void");
    }
}
