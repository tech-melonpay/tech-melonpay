package G9;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ProfileMeasurementValue.java */
/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Object> f1361a;

    /* renamed from: b, reason: collision with root package name */
    public Long f1362b;

    /* renamed from: c, reason: collision with root package name */
    public String f1363c;

    /* compiled from: ProfileMeasurementValue.java */
    public static final class a implements A<b> {
        @Override // io.sentry.A
        public final b a(D d10, InterfaceC0859q interfaceC0859q) {
            d10.i();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals("elapsed_since_start_ns")) {
                    Long a02 = d10.a0();
                    if (a02 != null) {
                        bVar.f1362b = a02;
                    }
                } else if (g02.equals("value")) {
                    String s0 = d10.s0();
                    if (s0 != null) {
                        bVar.f1363c = s0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    d10.t0(interfaceC0859q, concurrentHashMap, g02);
                }
            }
            bVar.f1361a = concurrentHashMap;
            d10.A();
            return bVar;
        }
    }

    public b() {
        this(0L, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f1361a, bVar.f1361a) && this.f1362b.equals(bVar.f1362b) && this.f1363c.equals(bVar.f1363c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1361a, this.f1362b, this.f1363c);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("value");
        e10.Q(interfaceC0859q, this.f1363c);
        e10.P("elapsed_since_start_ns");
        e10.Q(interfaceC0859q, this.f1362b);
        Map<String, Object> map = this.f1361a;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1361a, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public b(Long l10, Number number) {
        this.f1362b = l10;
        this.f1363c = number.toString();
    }
}
