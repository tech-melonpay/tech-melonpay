package H9;

import H9.b;
import H9.k;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryException.java */
/* loaded from: classes2.dex */
public final class f implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1597a;

    /* renamed from: b, reason: collision with root package name */
    public String f1598b;

    /* renamed from: c, reason: collision with root package name */
    public String f1599c;

    /* renamed from: d, reason: collision with root package name */
    public Long f1600d;

    /* renamed from: e, reason: collision with root package name */
    public k f1601e;

    /* renamed from: f, reason: collision with root package name */
    public b f1602f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f1603g;

    /* compiled from: SentryException.java */
    public static final class a implements A<f> {
        @Override // io.sentry.A
        public final f a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            f fVar = new f();
            d10.i();
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "thread_id":
                        fVar.f1600d = d10.a0();
                        break;
                    case "module":
                        fVar.f1599c = d10.s0();
                        break;
                    case "type":
                        fVar.f1597a = d10.s0();
                        break;
                    case "value":
                        fVar.f1598b = d10.s0();
                        break;
                    case "mechanism":
                        fVar.f1602f = (b) d10.p0(interfaceC0859q, new b.a());
                        break;
                    case "stacktrace":
                        fVar.f1601e = (k) d10.p0(interfaceC0859q, new k.a());
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
            fVar.f1603g = hashMap;
            return fVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1597a != null) {
            e10.P("type");
            e10.H(this.f1597a);
        }
        if (this.f1598b != null) {
            e10.P("value");
            e10.H(this.f1598b);
        }
        if (this.f1599c != null) {
            e10.P("module");
            e10.H(this.f1599c);
        }
        if (this.f1600d != null) {
            e10.P("thread_id");
            e10.G(this.f1600d);
        }
        if (this.f1601e != null) {
            e10.P("stacktrace");
            e10.Q(interfaceC0859q, this.f1601e);
        }
        if (this.f1602f != null) {
            e10.P("mechanism");
            e10.Q(interfaceC0859q, this.f1602f);
        }
        Map<String, Object> map = this.f1603g;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1603g, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
