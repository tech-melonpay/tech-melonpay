package H9;

import H9.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: SdkVersion.java */
/* loaded from: classes2.dex */
public final class e implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f1592a;

    /* renamed from: b, reason: collision with root package name */
    public String f1593b;

    /* renamed from: c, reason: collision with root package name */
    public List<h> f1594c;

    /* renamed from: d, reason: collision with root package name */
    public List<String> f1595d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f1596e;

    /* compiled from: SdkVersion.java */
    public static final class a implements A<e> {
        @Override // io.sentry.A
        public final e a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            d10.i();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "name":
                        str = d10.r0();
                        break;
                    case "version":
                        str2 = d10.r0();
                        break;
                    case "packages":
                        ArrayList W = d10.W(interfaceC0859q, new h.a());
                        if (W == null) {
                            break;
                        } else {
                            arrayList.addAll(W);
                            break;
                        }
                    case "integrations":
                        List list = (List) d10.o0();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        d10.t0(interfaceC0859q, hashMap, g02);
                        break;
                }
            }
            d10.A();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            e eVar = new e(str, str2);
            eVar.f1594c = arrayList;
            eVar.f1595d = arrayList2;
            eVar.f1596e = hashMap;
            return eVar;
        }
    }

    public e(String str, String str2) {
        this.f1592a = str;
        this.f1593b = str2;
    }

    public final void a(String str) {
        h hVar = new h(str, "6.8.0");
        if (this.f1594c == null) {
            this.f1594c = new ArrayList();
        }
        this.f1594c.add(hVar);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
        e10.H(this.f1592a);
        e10.P("version");
        e10.H(this.f1593b);
        List<h> list = this.f1594c;
        if (list != null && !list.isEmpty()) {
            e10.P("packages");
            e10.Q(interfaceC0859q, this.f1594c);
        }
        List<String> list2 = this.f1595d;
        if (list2 != null && !list2.isEmpty()) {
            e10.P("integrations");
            e10.Q(interfaceC0859q, this.f1595d);
        }
        Map<String, Object> map = this.f1596e;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1596e, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
