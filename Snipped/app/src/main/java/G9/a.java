package G9;

import G9.b;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ProfileMeasurement.java */
/* loaded from: classes2.dex */
public final class a implements F {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, Object> f1358a;

    /* renamed from: b, reason: collision with root package name */
    public String f1359b;

    /* renamed from: c, reason: collision with root package name */
    public Collection<b> f1360c;

    /* compiled from: ProfileMeasurement.java */
    /* renamed from: G9.a$a, reason: collision with other inner class name */
    public static final class C0017a implements A<a> {
        @Override // io.sentry.A
        public final a a(D d10, InterfaceC0859q interfaceC0859q) {
            d10.i();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals("values")) {
                    ArrayList W = d10.W(interfaceC0859q, new b.a());
                    if (W != null) {
                        aVar.f1360c = W;
                    }
                } else if (g02.equals("unit")) {
                    String s0 = d10.s0();
                    if (s0 != null) {
                        aVar.f1359b = s0;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    d10.t0(interfaceC0859q, concurrentHashMap, g02);
                }
            }
            aVar.f1358a = concurrentHashMap;
            d10.A();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f1358a, aVar.f1358a) && this.f1359b.equals(aVar.f1359b) && new ArrayList(this.f1360c).equals(new ArrayList(aVar.f1360c));
    }

    public final int hashCode() {
        return Objects.hash(this.f1358a, this.f1359b, this.f1360c);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("unit");
        e10.Q(interfaceC0859q, this.f1359b);
        e10.P("values");
        e10.Q(interfaceC0859q, this.f1360c);
        Map<String, Object> map = this.f1358a;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1358a, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public a(String str, AbstractCollection abstractCollection) {
        this.f1359b = str;
        this.f1360c = abstractCollection;
    }
}
