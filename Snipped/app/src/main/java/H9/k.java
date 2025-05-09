package H9;

import H9.j;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackTrace.java */
/* loaded from: classes2.dex */
public final class k implements F {

    /* renamed from: a, reason: collision with root package name */
    public List<j> f1634a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f1635b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f1636c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f1637d;

    /* compiled from: SentryStackTrace.java */
    public static final class a implements A<k> {
        @Override // io.sentry.A
        public final k a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            k kVar = new k();
            d10.i();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "frames":
                        kVar.f1634a = d10.W(interfaceC0859q, new j.a());
                        break;
                    case "registers":
                        kVar.f1635b = J9.a.a((Map) d10.o0());
                        break;
                    case "snapshot":
                        kVar.f1636c = d10.H();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            kVar.f1637d = concurrentHashMap;
            d10.A();
            return kVar;
        }
    }

    public k() {
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1634a != null) {
            e10.P("frames");
            e10.Q(interfaceC0859q, this.f1634a);
        }
        if (this.f1635b != null) {
            e10.P("registers");
            e10.Q(interfaceC0859q, this.f1635b);
        }
        if (this.f1636c != null) {
            e10.P("snapshot");
            e10.E(this.f1636c);
        }
        Map<String, Object> map = this.f1637d;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1637d, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public k(ArrayList arrayList) {
        this.f1634a = arrayList;
    }
}
