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

/* compiled from: Browser.java */
/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22149a;

    /* renamed from: b, reason: collision with root package name */
    public String f22150b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f22151c;

    /* compiled from: Browser.java */
    public static final class a implements A<b> {
        public static b b(D d10, InterfaceC0859q interfaceC0859q) {
            d10.i();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    bVar.f22149a = d10.s0();
                } else if (g02.equals("version")) {
                    bVar.f22150b = d10.s0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    d10.t0(interfaceC0859q, concurrentHashMap, g02);
                }
            }
            bVar.f22151c = concurrentHashMap;
            d10.A();
            return bVar;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ b a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22149a != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f22149a);
        }
        if (this.f22150b != null) {
            e10.P("version");
            e10.H(this.f22150b);
        }
        Map<String, Object> map = this.f22151c;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22151c, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
