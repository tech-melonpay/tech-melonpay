package H9;

import H9.a;
import H9.i;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.Z;
import io.sentry.m0;
import io.sentry.o0;
import io.sentry.p0;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryTransaction.java */
/* loaded from: classes2.dex */
public final class m extends Z implements F {

    /* renamed from: o, reason: collision with root package name */
    public String f1646o;

    /* renamed from: p, reason: collision with root package name */
    public Double f1647p;

    /* renamed from: q, reason: collision with root package name */
    public Double f1648q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1649r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f1650s;

    /* renamed from: t, reason: collision with root package name */
    public n f1651t;

    /* renamed from: u, reason: collision with root package name */
    public Map<String, Object> f1652u;

    /* compiled from: SentryTransaction.java */
    public static final class a implements A<m> {
        @Override // io.sentry.A
        public final m a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            m mVar = new m(new ArrayList(), new HashMap(), new n(TransactionNameSource.CUSTOM.apiName()));
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "start_timestamp":
                        try {
                            Double P4 = d10.P();
                            if (P4 == null) {
                                break;
                            } else {
                                mVar.f1647p = P4;
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            if (d10.M(interfaceC0859q) == null) {
                                break;
                            } else {
                                mVar.f1647p = Double.valueOf(r3.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case "measurements":
                        HashMap d02 = d10.d0(interfaceC0859q, new a.C0021a());
                        if (d02 == null) {
                            break;
                        } else {
                            mVar.f1650s.putAll(d02);
                            break;
                        }
                    case "type":
                        d10.r0();
                        break;
                    case "timestamp":
                        try {
                            Double P10 = d10.P();
                            if (P10 == null) {
                                break;
                            } else {
                                mVar.f1648q = P10;
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            if (d10.M(interfaceC0859q) == null) {
                                break;
                            } else {
                                mVar.f1648q = Double.valueOf(r3.getTime() / 1000.0d);
                                break;
                            }
                        }
                    case "spans":
                        ArrayList W = d10.W(interfaceC0859q, new i.a());
                        if (W == null) {
                            break;
                        } else {
                            mVar.f1649r.addAll(W);
                            break;
                        }
                    case "transaction_info":
                        d10.i();
                        String str = null;
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (d10.v0() == JsonToken.NAME) {
                            String g03 = d10.g0();
                            g03.getClass();
                            if (g03.equals("source")) {
                                str = d10.s0();
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                d10.t0(interfaceC0859q, concurrentHashMap2, g03);
                            }
                        }
                        n nVar = new n(str);
                        nVar.f1654b = concurrentHashMap2;
                        d10.A();
                        mVar.f1651t = nVar;
                        break;
                    case "transaction":
                        mVar.f1646o = d10.s0();
                        break;
                    default:
                        if (!Z.a.a(mVar, g02, d10, interfaceC0859q)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            d10.t0(interfaceC0859q, concurrentHashMap, g02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            mVar.f1652u = concurrentHashMap;
            d10.A();
            return mVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList arrayList, HashMap hashMap, n nVar) {
        super(new g());
        Double valueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f1649r = arrayList2;
        HashMap hashMap2 = new HashMap();
        this.f1650s = hashMap2;
        this.f1646o = "";
        this.f1647p = valueOf;
        this.f1648q = null;
        arrayList2.addAll(arrayList);
        hashMap2.putAll(hashMap);
        this.f1651t = nVar;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f1646o != null) {
            e10.P("transaction");
            e10.H(this.f1646o);
        }
        e10.P("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f1647p.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        e10.Q(interfaceC0859q, valueOf.setScale(6, roundingMode));
        if (this.f1648q != null) {
            e10.P("timestamp");
            e10.Q(interfaceC0859q, BigDecimal.valueOf(this.f1648q.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.f1649r;
        if (!arrayList.isEmpty()) {
            e10.P("spans");
            e10.Q(interfaceC0859q, arrayList);
        }
        e10.P("type");
        e10.H("transaction");
        HashMap hashMap = this.f1650s;
        if (!hashMap.isEmpty()) {
            e10.P("measurements");
            e10.Q(interfaceC0859q, hashMap);
        }
        e10.P("transaction_info");
        e10.Q(interfaceC0859q, this.f1651t);
        Z.b.a(this, e10, interfaceC0859q);
        Map<String, Object> map = this.f1652u;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1652u, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public m(m0 m0Var) {
        super(m0Var.f22070a);
        this.f1649r = new ArrayList();
        this.f1650s = new HashMap();
        o0 o0Var = m0Var.f22071b;
        this.f1647p = Double.valueOf(o0Var.f22093a.getTime() / 1000.0d);
        this.f1648q = o0Var.n(o0Var.f22095c);
        this.f1646o = m0Var.f22074e;
        Iterator it = m0Var.f22072c.iterator();
        while (it.hasNext()) {
            o0 o0Var2 = (o0) it.next();
            Boolean bool = Boolean.TRUE;
            Fa.h hVar = o0Var2.f22097e.f22105d;
            if (bool.equals(hVar == null ? null : (Boolean) hVar.f1299b)) {
                this.f1649r.add(new i(o0Var2));
            }
        }
        Contexts contexts = this.f21918b;
        p0 p0Var = o0Var.f22097e;
        contexts.c(new p0(p0Var.f22102a, p0Var.f22103b, p0Var.f22104c, p0Var.f22106e, p0Var.f22107f, p0Var.f22105d, p0Var.f22108g));
        for (Map.Entry entry : p0Var.f22109h.entrySet()) {
            a((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = o0Var.f22101j;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (this.f21929n == null) {
                    this.f21929n = new HashMap();
                }
                this.f21929n.put(str, value);
            }
        }
        this.f1651t = new n(m0Var.f22085q.apiName());
    }
}
