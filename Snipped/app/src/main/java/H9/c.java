package H9;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Message.java */
/* loaded from: classes2.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1578a;

    /* renamed from: b, reason: collision with root package name */
    public String f1579b;

    /* renamed from: c, reason: collision with root package name */
    public List<String> f1580c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f1581d;

    /* compiled from: Message.java */
    public static final class a implements A<c> {
        @Override // io.sentry.A
        public final c a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            c cVar = new c();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "params":
                        List<String> list = (List) d10.o0();
                        if (list == null) {
                            break;
                        } else {
                            cVar.f1580c = list;
                            break;
                        }
                    case "message":
                        cVar.f1579b = d10.s0();
                        break;
                    case "formatted":
                        cVar.f1578a = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            cVar.f1581d = concurrentHashMap;
            d10.A();
            return cVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1578a != null) {
            e10.P("formatted");
            e10.H(this.f1578a);
        }
        if (this.f1579b != null) {
            e10.P("message");
            e10.H(this.f1579b);
        }
        List<String> list = this.f1580c;
        if (list != null && !list.isEmpty()) {
            e10.P("params");
            e10.Q(interfaceC0859q, this.f1580c);
        }
        Map<String, Object> map = this.f1581d;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1581d, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
