package H9;

import com.google.firebase.messaging.Constants;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Mechanism.java */
/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1570a;

    /* renamed from: b, reason: collision with root package name */
    public String f1571b;

    /* renamed from: c, reason: collision with root package name */
    public String f1572c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f1573d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f1574e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, Object> f1575f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f1576g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, Object> f1577h;

    /* compiled from: Mechanism.java */
    public static final class a implements A<b> {
        @Override // io.sentry.A
        public final b a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            b bVar = new b();
            d10.i();
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "description":
                        bVar.f1571b = d10.s0();
                        break;
                    case "data":
                        bVar.f1575f = J9.a.a((Map) d10.o0());
                        break;
                    case "meta":
                        bVar.f1574e = J9.a.a((Map) d10.o0());
                        break;
                    case "type":
                        bVar.f1570a = d10.s0();
                        break;
                    case "handled":
                        bVar.f1573d = d10.H();
                        break;
                    case "synthetic":
                        bVar.f1576g = d10.H();
                        break;
                    case "help_link":
                        bVar.f1572c = d10.s0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        d10.t0(interfaceC0859q, hashMap, g02);
                        break;
                }
            }
            d10.A();
            bVar.f1577h = hashMap;
            return bVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1570a != null) {
            e10.P("type");
            e10.H(this.f1570a);
        }
        if (this.f1571b != null) {
            e10.P("description");
            e10.H(this.f1571b);
        }
        if (this.f1572c != null) {
            e10.P("help_link");
            e10.H(this.f1572c);
        }
        if (this.f1573d != null) {
            e10.P("handled");
            e10.E(this.f1573d);
        }
        if (this.f1574e != null) {
            e10.P("meta");
            e10.Q(interfaceC0859q, this.f1574e);
        }
        if (this.f1575f != null) {
            e10.P(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            e10.Q(interfaceC0859q, this.f1575f);
        }
        if (this.f1576g != null) {
            e10.P("synthetic");
            e10.E(this.f1576g);
        }
        Map<String, Object> map = this.f1577h;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1577h, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
