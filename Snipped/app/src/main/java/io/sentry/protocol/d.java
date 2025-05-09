package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Gpu.java */
/* loaded from: classes2.dex */
public final class d implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22155a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f22156b;

    /* renamed from: c, reason: collision with root package name */
    public String f22157c;

    /* renamed from: d, reason: collision with root package name */
    public String f22158d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f22159e;

    /* renamed from: f, reason: collision with root package name */
    public String f22160f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f22161g;

    /* renamed from: h, reason: collision with root package name */
    public String f22162h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public Map<String, Object> f22163j;

    /* compiled from: Gpu.java */
    public static final class a implements A<d> {
        public static d b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            d dVar = new d();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "npot_support":
                        dVar.i = d10.s0();
                        break;
                    case "vendor_id":
                        dVar.f22157c = d10.s0();
                        break;
                    case "multi_threaded_rendering":
                        dVar.f22161g = d10.H();
                        break;
                    case "id":
                        dVar.f22156b = d10.V();
                        break;
                    case "name":
                        dVar.f22155a = d10.s0();
                        break;
                    case "vendor_name":
                        dVar.f22158d = d10.s0();
                        break;
                    case "version":
                        dVar.f22162h = d10.s0();
                        break;
                    case "api_type":
                        dVar.f22160f = d10.s0();
                        break;
                    case "memory_size":
                        dVar.f22159e = d10.V();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            dVar.f22163j = concurrentHashMap;
            d10.A();
            return dVar;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ d a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22155a != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f22155a);
        }
        if (this.f22156b != null) {
            e10.P("id");
            e10.G(this.f22156b);
        }
        if (this.f22157c != null) {
            e10.P("vendor_id");
            e10.H(this.f22157c);
        }
        if (this.f22158d != null) {
            e10.P("vendor_name");
            e10.H(this.f22158d);
        }
        if (this.f22159e != null) {
            e10.P("memory_size");
            e10.G(this.f22159e);
        }
        if (this.f22160f != null) {
            e10.P("api_type");
            e10.H(this.f22160f);
        }
        if (this.f22161g != null) {
            e10.P("multi_threaded_rendering");
            e10.E(this.f22161g);
        }
        if (this.f22162h != null) {
            e10.P("version");
            e10.H(this.f22162h);
        }
        if (this.i != null) {
            e10.P("npot_support");
            e10.H(this.i);
        }
        Map<String, Object> map = this.f22163j;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22163j, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
