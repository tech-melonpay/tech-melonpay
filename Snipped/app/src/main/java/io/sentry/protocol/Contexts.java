package io.sentry.protocol;

import com.sumsub.sentry.f0;
import com.sumsub.sentry.j;
import com.sumsub.sentry.n0;
import com.sumsub.sentry.q;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.p0;
import io.sentry.protocol.Device;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.d;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.h;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Contexts extends ConcurrentHashMap<String, Object> implements F {
    private static final long serialVersionUID = 252445813254943011L;

    public static final class a implements A<Contexts> {
        public static Contexts b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            Contexts contexts = new Contexts();
            d10.i();
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "device":
                        contexts.put(com.sumsub.sentry.Device.f13499a, Device.a.b(d10, interfaceC0859q));
                        break;
                    case "response":
                        contexts.put("response", f.a.b(d10, interfaceC0859q));
                        break;
                    case "os":
                        contexts.put(q.f13755g, e.a.b(d10, interfaceC0859q));
                        break;
                    case "app":
                        contexts.put(com.sumsub.sentry.a.f13540h, a.C0412a.b(d10, interfaceC0859q));
                        break;
                    case "gpu":
                        contexts.put(j.f13677j, d.a.b(d10, interfaceC0859q));
                        break;
                    case "trace":
                        contexts.c(p0.a.b(d10, interfaceC0859q));
                        break;
                    case "browser":
                        contexts.put(com.sumsub.sentry.c.f13591c, b.a.b(d10, interfaceC0859q));
                        break;
                    case "runtime":
                        contexts.put(f0.f13630d, h.a.b(d10, interfaceC0859q));
                        break;
                    default:
                        Object o02 = d10.o0();
                        if (o02 == null) {
                            break;
                        } else {
                            contexts.put(g02, o02);
                            break;
                        }
                }
            }
            d10.A();
            return contexts;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ Contexts a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    public Contexts() {
    }

    public final p0 a() {
        return (p0) d(p0.class, n0.i);
    }

    public final void c(p0 p0Var) {
        D9.b.t0(p0Var, "traceContext is required");
        put(n0.i, p0Var);
    }

    public final Object d(Class cls, String str) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        ArrayList<String> list = Collections.list(keys());
        Collections.sort(list);
        for (String str : list) {
            Object obj = get(str);
            if (obj != null) {
                e10.P(str);
                e10.Q(interfaceC0859q, obj);
            }
        }
        e10.p();
    }

    public Contexts(Contexts contexts) {
        for (Map.Entry<String, Object> entry : contexts.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if (com.sumsub.sentry.a.f13540h.equals(entry.getKey()) && (value instanceof io.sentry.protocol.a)) {
                    io.sentry.protocol.a aVar = (io.sentry.protocol.a) value;
                    io.sentry.protocol.a aVar2 = new io.sentry.protocol.a();
                    aVar2.f22147g = aVar.f22147g;
                    aVar2.f22141a = aVar.f22141a;
                    aVar2.f22145e = aVar.f22145e;
                    aVar2.f22142b = aVar.f22142b;
                    aVar2.f22146f = aVar.f22146f;
                    aVar2.f22144d = aVar.f22144d;
                    aVar2.f22143c = aVar.f22143c;
                    aVar2.f22148h = J9.a.a(aVar.f22148h);
                    aVar2.i = J9.a.a(aVar.i);
                    put(com.sumsub.sentry.a.f13540h, aVar2);
                } else if (com.sumsub.sentry.c.f13591c.equals(entry.getKey()) && (value instanceof b)) {
                    b bVar = (b) value;
                    b bVar2 = new b();
                    bVar2.f22149a = bVar.f22149a;
                    bVar2.f22150b = bVar.f22150b;
                    bVar2.f22151c = J9.a.a(bVar.f22151c);
                    put(com.sumsub.sentry.c.f13591c, bVar2);
                } else if (com.sumsub.sentry.Device.f13499a.equals(entry.getKey()) && (value instanceof Device)) {
                    Device device = (Device) value;
                    Device device2 = new Device();
                    device2.f22116a = device.f22116a;
                    device2.f22117b = device.f22117b;
                    device2.f22118c = device.f22118c;
                    device2.f22119d = device.f22119d;
                    device2.f22120e = device.f22120e;
                    device2.f22121f = device.f22121f;
                    device2.i = device.i;
                    device2.f22124j = device.f22124j;
                    device2.f22125k = device.f22125k;
                    device2.f22126l = device.f22126l;
                    device2.f22127m = device.f22127m;
                    device2.f22128n = device.f22128n;
                    device2.f22129o = device.f22129o;
                    device2.f22130p = device.f22130p;
                    device2.f22131q = device.f22131q;
                    device2.f22132r = device.f22132r;
                    device2.f22133s = device.f22133s;
                    device2.f22134t = device.f22134t;
                    device2.f22135u = device.f22135u;
                    device2.f22136v = device.f22136v;
                    device2.f22137w = device.f22137w;
                    device2.f22138x = device.f22138x;
                    device2.f22139y = device.f22139y;
                    device2.f22110A = device.f22110A;
                    device2.f22111B = device.f22111B;
                    device2.f22113D = device.f22113D;
                    device2.f22114E = device.f22114E;
                    device2.f22123h = device.f22123h;
                    String[] strArr = device.f22122g;
                    device2.f22122g = strArr != null ? (String[]) strArr.clone() : null;
                    device2.f22112C = device.f22112C;
                    TimeZone timeZone = device.f22140z;
                    device2.f22140z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    device2.f22115F = J9.a.a(device.f22115F);
                    put(com.sumsub.sentry.Device.f13499a, device2);
                } else if (q.f13755g.equals(entry.getKey()) && (value instanceof e)) {
                    e eVar = (e) value;
                    e eVar2 = new e();
                    eVar2.f22164a = eVar.f22164a;
                    eVar2.f22165b = eVar.f22165b;
                    eVar2.f22166c = eVar.f22166c;
                    eVar2.f22167d = eVar.f22167d;
                    eVar2.f22168e = eVar.f22168e;
                    eVar2.f22169f = eVar.f22169f;
                    eVar2.f22170g = J9.a.a(eVar.f22170g);
                    put(q.f13755g, eVar2);
                } else if (f0.f13630d.equals(entry.getKey()) && (value instanceof h)) {
                    h hVar = (h) value;
                    h hVar2 = new h();
                    hVar2.f22181a = hVar.f22181a;
                    hVar2.f22182b = hVar.f22182b;
                    hVar2.f22183c = hVar.f22183c;
                    hVar2.f22184d = J9.a.a(hVar.f22184d);
                    put(f0.f13630d, hVar2);
                } else if (j.f13677j.equals(entry.getKey()) && (value instanceof d)) {
                    d dVar = (d) value;
                    d dVar2 = new d();
                    dVar2.f22155a = dVar.f22155a;
                    dVar2.f22156b = dVar.f22156b;
                    dVar2.f22157c = dVar.f22157c;
                    dVar2.f22158d = dVar.f22158d;
                    dVar2.f22159e = dVar.f22159e;
                    dVar2.f22160f = dVar.f22160f;
                    dVar2.f22161g = dVar.f22161g;
                    dVar2.f22162h = dVar.f22162h;
                    dVar2.i = dVar.i;
                    dVar2.f22163j = J9.a.a(dVar.f22163j);
                    put(j.f13677j, dVar2);
                } else if (n0.i.equals(entry.getKey()) && (value instanceof p0)) {
                    c(new p0((p0) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof f)) {
                    f fVar = (f) value;
                    f fVar2 = new f();
                    fVar2.f22171a = fVar.f22171a;
                    fVar2.f22172b = J9.a.a(fVar.f22172b);
                    fVar2.f22175e = J9.a.a(fVar.f22175e);
                    fVar2.f22173c = fVar.f22173c;
                    fVar2.f22174d = fVar.f22174d;
                    put("response", fVar2);
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
