package io.sentry.protocol;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Response.java */
/* loaded from: classes2.dex */
public final class f implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22171a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f22172b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f22173c;

    /* renamed from: d, reason: collision with root package name */
    public Long f22174d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f22175e;

    /* compiled from: Response.java */
    public static final class a implements A<f> {
        public static f b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            f fVar = new f();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "status_code":
                        fVar.f22173c = d10.V();
                        break;
                    case "headers":
                        Map map = (Map) d10.o0();
                        if (map == null) {
                            break;
                        } else {
                            fVar.f22172b = J9.a.a(map);
                            break;
                        }
                    case "cookies":
                        fVar.f22171a = d10.s0();
                        break;
                    case "body_size":
                        fVar.f22174d = d10.a0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            fVar.f22175e = concurrentHashMap;
            d10.A();
            return fVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22171a != null) {
            e10.P("cookies");
            e10.H(this.f22171a);
        }
        if (this.f22172b != null) {
            e10.P("headers");
            e10.Q(interfaceC0859q, this.f22172b);
        }
        if (this.f22173c != null) {
            e10.P("status_code");
            e10.Q(interfaceC0859q, this.f22173c);
        }
        if (this.f22174d != null) {
            e10.P("body_size");
            e10.Q(interfaceC0859q, this.f22174d);
        }
        Map<String, Object> map = this.f22175e;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22175e, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
