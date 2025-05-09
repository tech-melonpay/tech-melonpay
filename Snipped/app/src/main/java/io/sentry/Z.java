package io.sentry;

import H9.d;
import H9.e;
import H9.o;
import io.sentry.C0844b;
import io.sentry.protocol.Contexts;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SentryBaseEvent.java */
/* loaded from: classes2.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public H9.g f21917a;

    /* renamed from: b, reason: collision with root package name */
    public final Contexts f21918b = new Contexts();

    /* renamed from: c, reason: collision with root package name */
    public H9.e f21919c;

    /* renamed from: d, reason: collision with root package name */
    public H9.d f21920d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f21921e;

    /* renamed from: f, reason: collision with root package name */
    public String f21922f;

    /* renamed from: g, reason: collision with root package name */
    public String f21923g;

    /* renamed from: h, reason: collision with root package name */
    public String f21924h;
    public H9.o i;

    /* renamed from: j, reason: collision with root package name */
    public transient Throwable f21925j;

    /* renamed from: k, reason: collision with root package name */
    public String f21926k;

    /* renamed from: l, reason: collision with root package name */
    public String f21927l;

    /* renamed from: m, reason: collision with root package name */
    public List<C0844b> f21928m;

    /* renamed from: n, reason: collision with root package name */
    public Map<String, Object> f21929n;

    /* compiled from: SentryBaseEvent.java */
    public static final class a {
        public static boolean a(Z z10, String str, D d10, InterfaceC0859q interfaceC0859q) {
            H9.g gVar;
            switch (str) {
                case "server_name":
                    z10.f21926k = d10.s0();
                    return true;
                case "contexts":
                    z10.f21918b.putAll(Contexts.a.b(d10, interfaceC0859q));
                    return true;
                case "environment":
                    z10.f21923g = d10.s0();
                    return true;
                case "breadcrumbs":
                    z10.f21928m = d10.W(interfaceC0859q, new C0844b.a());
                    return true;
                case "sdk":
                    z10.f21919c = (H9.e) d10.p0(interfaceC0859q, new e.a());
                    return true;
                case "dist":
                    z10.f21927l = d10.s0();
                    return true;
                case "tags":
                    z10.f21921e = J9.a.a((Map) d10.o0());
                    return true;
                case "user":
                    z10.i = (H9.o) d10.p0(interfaceC0859q, new o.a());
                    return true;
                case "extra":
                    z10.f21929n = J9.a.a((Map) d10.o0());
                    return true;
                case "event_id":
                    if (d10.v0() == JsonToken.NULL) {
                        d10.n0();
                        gVar = null;
                    } else {
                        gVar = new H9.g(d10.r0());
                    }
                    z10.f21917a = gVar;
                    return true;
                case "release":
                    z10.f21922f = d10.s0();
                    return true;
                case "request":
                    z10.f21920d = (H9.d) d10.p0(interfaceC0859q, new d.a());
                    return true;
                case "platform":
                    z10.f21924h = d10.s0();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* compiled from: SentryBaseEvent.java */
    public static final class b {
        public static void a(Z z10, E e10, InterfaceC0859q interfaceC0859q) {
            if (z10.f21917a != null) {
                e10.P("event_id");
                e10.Q(interfaceC0859q, z10.f21917a);
            }
            e10.P("contexts");
            e10.Q(interfaceC0859q, z10.f21918b);
            if (z10.f21919c != null) {
                e10.P("sdk");
                e10.Q(interfaceC0859q, z10.f21919c);
            }
            if (z10.f21920d != null) {
                e10.P("request");
                e10.Q(interfaceC0859q, z10.f21920d);
            }
            Map<String, String> map = z10.f21921e;
            if (map != null && !map.isEmpty()) {
                e10.P("tags");
                e10.Q(interfaceC0859q, z10.f21921e);
            }
            if (z10.f21922f != null) {
                e10.P("release");
                e10.H(z10.f21922f);
            }
            if (z10.f21923g != null) {
                e10.P("environment");
                e10.H(z10.f21923g);
            }
            if (z10.f21924h != null) {
                e10.P("platform");
                e10.H(z10.f21924h);
            }
            if (z10.i != null) {
                e10.P("user");
                e10.Q(interfaceC0859q, z10.i);
            }
            if (z10.f21926k != null) {
                e10.P("server_name");
                e10.H(z10.f21926k);
            }
            if (z10.f21927l != null) {
                e10.P("dist");
                e10.H(z10.f21927l);
            }
            List<C0844b> list = z10.f21928m;
            if (list != null && !list.isEmpty()) {
                e10.P("breadcrumbs");
                e10.Q(interfaceC0859q, z10.f21928m);
            }
            Map<String, Object> map2 = z10.f21929n;
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            e10.P("extra");
            e10.Q(interfaceC0859q, z10.f21929n);
        }
    }

    public Z(H9.g gVar) {
        this.f21917a = gVar;
    }

    public final void a(String str, String str2) {
        if (this.f21921e == null) {
            this.f21921e = new HashMap();
        }
        this.f21921e.put(str, str2);
    }
}
