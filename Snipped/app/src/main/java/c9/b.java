package C9;

import C9.d;
import androidx.camera.core.n;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.I;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClientReport.java */
/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Date f689a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f690b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f691c;

    /* compiled from: ClientReport.java */
    public static final class a implements A<b> {
        public static IllegalStateException b(String str, InterfaceC0859q interfaceC0859q) {
            String a10 = n.a("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(a10);
            interfaceC0859q.f(SentryLevel.ERROR, a10, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.A
        public final b a(D d10, InterfaceC0859q interfaceC0859q) {
            ArrayList arrayList = new ArrayList();
            d10.i();
            Date date = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals("discarded_events")) {
                    arrayList.addAll(d10.W(interfaceC0859q, new d.a()));
                } else if (g02.equals("timestamp")) {
                    date = d10.M(interfaceC0859q);
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    d10.t0(interfaceC0859q, hashMap, g02);
                }
            }
            d10.A();
            if (date == null) {
                throw b("timestamp", interfaceC0859q);
            }
            if (arrayList.isEmpty()) {
                throw b("discarded_events", interfaceC0859q);
            }
            b bVar = new b(date, arrayList);
            bVar.f691c = hashMap;
            return bVar;
        }
    }

    public b(Date date, ArrayList arrayList) {
        this.f689a = date;
        this.f690b = arrayList;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("timestamp");
        e10.H(I.q(this.f689a));
        e10.P("discarded_events");
        e10.Q(interfaceC0859q, this.f690b);
        Map<String, Object> map = this.f691c;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f691c, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
