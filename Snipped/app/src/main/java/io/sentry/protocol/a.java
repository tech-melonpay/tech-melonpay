package io.sentry.protocol;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: App.java */
/* loaded from: classes2.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22141a;

    /* renamed from: b, reason: collision with root package name */
    public Date f22142b;

    /* renamed from: c, reason: collision with root package name */
    public String f22143c;

    /* renamed from: d, reason: collision with root package name */
    public String f22144d;

    /* renamed from: e, reason: collision with root package name */
    public String f22145e;

    /* renamed from: f, reason: collision with root package name */
    public String f22146f;

    /* renamed from: g, reason: collision with root package name */
    public String f22147g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, String> f22148h;
    public Map<String, Object> i;

    /* compiled from: App.java */
    /* renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    public static final class C0412a implements A<a> {
        public static a b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "device_app_hash":
                        aVar.f22143c = d10.s0();
                        break;
                    case "app_version":
                        aVar.f22146f = d10.s0();
                        break;
                    case "build_type":
                        aVar.f22144d = d10.s0();
                        break;
                    case "app_identifier":
                        aVar.f22141a = d10.s0();
                        break;
                    case "app_start_time":
                        aVar.f22142b = d10.M(interfaceC0859q);
                        break;
                    case "permissions":
                        aVar.f22148h = J9.a.a((Map) d10.o0());
                        break;
                    case "app_name":
                        aVar.f22145e = d10.s0();
                        break;
                    case "app_build":
                        aVar.f22147g = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            aVar.i = concurrentHashMap;
            d10.A();
            return aVar;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ a a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22141a != null) {
            e10.P("app_identifier");
            e10.H(this.f22141a);
        }
        if (this.f22142b != null) {
            e10.P("app_start_time");
            e10.Q(interfaceC0859q, this.f22142b);
        }
        if (this.f22143c != null) {
            e10.P("device_app_hash");
            e10.H(this.f22143c);
        }
        if (this.f22144d != null) {
            e10.P("build_type");
            e10.H(this.f22144d);
        }
        if (this.f22145e != null) {
            e10.P("app_name");
            e10.H(this.f22145e);
        }
        if (this.f22146f != null) {
            e10.P("app_version");
            e10.H(this.f22146f);
        }
        if (this.f22147g != null) {
            e10.P("app_build");
            e10.H(this.f22147g);
        }
        Map<String, String> map = this.f22148h;
        if (map != null && !map.isEmpty()) {
            e10.P("permissions");
            e10.Q(interfaceC0859q, this.f22148h);
        }
        Map<String, Object> map2 = this.i;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.i, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
