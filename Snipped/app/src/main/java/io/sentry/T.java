package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ProfilingTransactionData.java */
/* loaded from: classes2.dex */
public final class T implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f21887a;

    /* renamed from: b, reason: collision with root package name */
    public String f21888b;

    /* renamed from: c, reason: collision with root package name */
    public String f21889c;

    /* renamed from: d, reason: collision with root package name */
    public Long f21890d;

    /* renamed from: e, reason: collision with root package name */
    public Long f21891e;

    /* renamed from: f, reason: collision with root package name */
    public Long f21892f;

    /* renamed from: g, reason: collision with root package name */
    public Long f21893g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, Object> f21894h;

    /* compiled from: ProfilingTransactionData.java */
    public static final class a implements A<T> {
        @Override // io.sentry.A
        public final T a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            T t3 = new T();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "relative_start_ns":
                        Long a02 = d10.a0();
                        if (a02 == null) {
                            break;
                        } else {
                            t3.f21890d = a02;
                            break;
                        }
                    case "relative_end_ns":
                        Long a03 = d10.a0();
                        if (a03 == null) {
                            break;
                        } else {
                            t3.f21891e = a03;
                            break;
                        }
                    case "id":
                        String s0 = d10.s0();
                        if (s0 == null) {
                            break;
                        } else {
                            t3.f21887a = s0;
                            break;
                        }
                    case "name":
                        String s02 = d10.s0();
                        if (s02 == null) {
                            break;
                        } else {
                            t3.f21889c = s02;
                            break;
                        }
                    case "trace_id":
                        String s03 = d10.s0();
                        if (s03 == null) {
                            break;
                        } else {
                            t3.f21888b = s03;
                            break;
                        }
                    case "relative_cpu_end_ms":
                        Long a04 = d10.a0();
                        if (a04 == null) {
                            break;
                        } else {
                            t3.f21893g = a04;
                            break;
                        }
                    case "relative_cpu_start_ms":
                        Long a05 = d10.a0();
                        if (a05 == null) {
                            break;
                        } else {
                            t3.f21892f = a05;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            t3.f21894h = concurrentHashMap;
            d10.A();
            return t3;
        }
    }

    public T() {
        this(N.f21832a, 0L, 0L);
    }

    public final void a(Long l10, Long l11, Long l12, Long l13) {
        if (this.f21891e == null) {
            this.f21891e = Long.valueOf(l10.longValue() - l11.longValue());
            this.f21890d = Long.valueOf(this.f21890d.longValue() - l11.longValue());
            this.f21893g = Long.valueOf(l12.longValue() - l13.longValue());
            this.f21892f = Long.valueOf(this.f21892f.longValue() - l13.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t3 = (T) obj;
        return this.f21887a.equals(t3.f21887a) && this.f21888b.equals(t3.f21888b) && this.f21889c.equals(t3.f21889c) && this.f21890d.equals(t3.f21890d) && this.f21892f.equals(t3.f21892f) && Objects.equals(this.f21893g, t3.f21893g) && Objects.equals(this.f21891e, t3.f21891e) && Objects.equals(this.f21894h, t3.f21894h);
    }

    public final int hashCode() {
        return Objects.hash(this.f21887a, this.f21888b, this.f21889c, this.f21890d, this.f21891e, this.f21892f, this.f21893g, this.f21894h);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("id");
        e10.Q(interfaceC0859q, this.f21887a);
        e10.P("trace_id");
        e10.Q(interfaceC0859q, this.f21888b);
        e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
        e10.Q(interfaceC0859q, this.f21889c);
        e10.P("relative_start_ns");
        e10.Q(interfaceC0859q, this.f21890d);
        e10.P("relative_end_ns");
        e10.Q(interfaceC0859q, this.f21891e);
        e10.P("relative_cpu_start_ms");
        e10.Q(interfaceC0859q, this.f21892f);
        e10.P("relative_cpu_end_ms");
        e10.Q(interfaceC0859q, this.f21893g);
        Map<String, Object> map = this.f21894h;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f21894h, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public T(InterfaceC0864w interfaceC0864w, Long l10, Long l11) {
        this.f21887a = interfaceC0864w.g().toString();
        this.f21888b = interfaceC0864w.j().f22102a.toString();
        this.f21889c = interfaceC0864w.getName();
        this.f21890d = l10;
        this.f21892f = l11;
    }
}
