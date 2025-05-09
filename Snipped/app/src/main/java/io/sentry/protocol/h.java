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

/* compiled from: SentryRuntime.java */
/* loaded from: classes2.dex */
public final class h implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22181a;

    /* renamed from: b, reason: collision with root package name */
    public String f22182b;

    /* renamed from: c, reason: collision with root package name */
    public String f22183c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f22184d;

    /* compiled from: SentryRuntime.java */
    public static final class a implements A<h> {
        public static h b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            h hVar = new h();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "raw_description":
                        hVar.f22183c = d10.s0();
                        break;
                    case "name":
                        hVar.f22181a = d10.s0();
                        break;
                    case "version":
                        hVar.f22182b = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            hVar.f22184d = concurrentHashMap;
            d10.A();
            return hVar;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ h a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22181a != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f22181a);
        }
        if (this.f22182b != null) {
            e10.P("version");
            e10.H(this.f22182b);
        }
        if (this.f22183c != null) {
            e10.P("raw_description");
            e10.H(this.f22183c);
        }
        Map<String, Object> map = this.f22184d;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22184d, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
