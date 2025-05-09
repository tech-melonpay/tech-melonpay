package H9;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackFrame.java */
/* loaded from: classes2.dex */
public final class j implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1619a;

    /* renamed from: b, reason: collision with root package name */
    public String f1620b;

    /* renamed from: c, reason: collision with root package name */
    public String f1621c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f1622d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f1623e;

    /* renamed from: f, reason: collision with root package name */
    public String f1624f;

    /* renamed from: g, reason: collision with root package name */
    public String f1625g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f1626h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1627j;

    /* renamed from: k, reason: collision with root package name */
    public String f1628k;

    /* renamed from: l, reason: collision with root package name */
    public String f1629l;

    /* renamed from: m, reason: collision with root package name */
    public String f1630m;

    /* renamed from: n, reason: collision with root package name */
    public String f1631n;

    /* renamed from: o, reason: collision with root package name */
    public Map<String, Object> f1632o;

    /* renamed from: p, reason: collision with root package name */
    public String f1633p;

    /* compiled from: SentryStackFrame.java */
    public static final class a implements A<j> {
        @Override // io.sentry.A
        public final j a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            j jVar = new j();
            d10.i();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "image_addr":
                        jVar.f1629l = d10.s0();
                        break;
                    case "in_app":
                        jVar.f1626h = d10.H();
                        break;
                    case "raw_function":
                        jVar.f1633p = d10.s0();
                        break;
                    case "lineno":
                        jVar.f1622d = d10.V();
                        break;
                    case "module":
                        jVar.f1621c = d10.s0();
                        break;
                    case "native":
                        jVar.f1627j = d10.H();
                        break;
                    case "package":
                        jVar.i = d10.s0();
                        break;
                    case "filename":
                        jVar.f1619a = d10.s0();
                        break;
                    case "symbol_addr":
                        jVar.f1630m = d10.s0();
                        break;
                    case "colno":
                        jVar.f1623e = d10.V();
                        break;
                    case "instruction_addr":
                        jVar.f1631n = d10.s0();
                        break;
                    case "context_line":
                        jVar.f1625g = d10.s0();
                        break;
                    case "function":
                        jVar.f1620b = d10.s0();
                        break;
                    case "abs_path":
                        jVar.f1624f = d10.s0();
                        break;
                    case "platform":
                        jVar.f1628k = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            jVar.f1632o = concurrentHashMap;
            d10.A();
            return jVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1619a != null) {
            e10.P("filename");
            e10.H(this.f1619a);
        }
        if (this.f1620b != null) {
            e10.P("function");
            e10.H(this.f1620b);
        }
        if (this.f1621c != null) {
            e10.P("module");
            e10.H(this.f1621c);
        }
        if (this.f1622d != null) {
            e10.P("lineno");
            e10.G(this.f1622d);
        }
        if (this.f1623e != null) {
            e10.P("colno");
            e10.G(this.f1623e);
        }
        if (this.f1624f != null) {
            e10.P("abs_path");
            e10.H(this.f1624f);
        }
        if (this.f1625g != null) {
            e10.P("context_line");
            e10.H(this.f1625g);
        }
        if (this.f1626h != null) {
            e10.P("in_app");
            e10.E(this.f1626h);
        }
        if (this.i != null) {
            e10.P("package");
            e10.H(this.i);
        }
        if (this.f1627j != null) {
            e10.P("native");
            e10.E(this.f1627j);
        }
        if (this.f1628k != null) {
            e10.P("platform");
            e10.H(this.f1628k);
        }
        if (this.f1629l != null) {
            e10.P("image_addr");
            e10.H(this.f1629l);
        }
        if (this.f1630m != null) {
            e10.P("symbol_addr");
            e10.H(this.f1630m);
        }
        if (this.f1631n != null) {
            e10.P("instruction_addr");
            e10.H(this.f1631n);
        }
        if (this.f1633p != null) {
            e10.P("raw_function");
            e10.H(this.f1633p);
        }
        Map<String, Object> map = this.f1632o;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1632o, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
