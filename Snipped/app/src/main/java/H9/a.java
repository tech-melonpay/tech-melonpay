package H9;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MeasurementValue.java */
/* loaded from: classes2.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Number f1567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1568b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f1569c;

    /* compiled from: MeasurementValue.java */
    /* renamed from: H9.a$a, reason: collision with other inner class name */
    public static final class C0021a implements A<a> {
        @Override // io.sentry.A
        public final a a(D d10, InterfaceC0859q interfaceC0859q) {
            d10.i();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals("unit")) {
                    str = d10.s0();
                } else if (g02.equals("value")) {
                    number = (Number) d10.o0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    d10.t0(interfaceC0859q, concurrentHashMap, g02);
                }
            }
            d10.A();
            if (number != null) {
                a aVar = new a(number, str);
                aVar.f1569c = concurrentHashMap;
                return aVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public a(Number number, String str) {
        this.f1567a = number;
        this.f1568b = str;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("value");
        e10.G(this.f1567a);
        String str = this.f1568b;
        if (str != null) {
            e10.P("unit");
            e10.H(str);
        }
        Map<String, Object> map = this.f1569c;
        if (map != null) {
            for (String str2 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1569c, str2, e10, str2, interfaceC0859q);
            }
        }
        e10.p();
    }
}
