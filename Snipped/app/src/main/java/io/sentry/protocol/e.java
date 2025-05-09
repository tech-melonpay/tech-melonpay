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

/* compiled from: OperatingSystem.java */
/* loaded from: classes2.dex */
public final class e implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22164a;

    /* renamed from: b, reason: collision with root package name */
    public String f22165b;

    /* renamed from: c, reason: collision with root package name */
    public String f22166c;

    /* renamed from: d, reason: collision with root package name */
    public String f22167d;

    /* renamed from: e, reason: collision with root package name */
    public String f22168e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f22169f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f22170g;

    /* compiled from: OperatingSystem.java */
    public static final class a implements A<e> {
        public static e b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            e eVar = new e();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "rooted":
                        eVar.f22169f = d10.H();
                        break;
                    case "raw_description":
                        eVar.f22166c = d10.s0();
                        break;
                    case "name":
                        eVar.f22164a = d10.s0();
                        break;
                    case "build":
                        eVar.f22167d = d10.s0();
                        break;
                    case "version":
                        eVar.f22165b = d10.s0();
                        break;
                    case "kernel_version":
                        eVar.f22168e = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            eVar.f22170g = concurrentHashMap;
            d10.A();
            return eVar;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ e a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22164a != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f22164a);
        }
        if (this.f22165b != null) {
            e10.P("version");
            e10.H(this.f22165b);
        }
        if (this.f22166c != null) {
            e10.P("raw_description");
            e10.H(this.f22166c);
        }
        if (this.f22167d != null) {
            e10.P("build");
            e10.H(this.f22167d);
        }
        if (this.f22168e != null) {
            e10.P("kernel_version");
            e10.H(this.f22168e);
        }
        if (this.f22169f != null) {
            e10.P("rooted");
            e10.E(this.f22169f);
        }
        Map<String, Object> map = this.f22170g;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22170g, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
