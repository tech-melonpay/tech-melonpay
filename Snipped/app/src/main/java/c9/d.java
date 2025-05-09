package C9;

import androidx.camera.core.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DiscardedEvent.java */
/* loaded from: classes2.dex */
public final class d implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f694a;

    /* renamed from: b, reason: collision with root package name */
    public final String f695b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f696c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f697d;

    /* compiled from: DiscardedEvent.java */
    public static final class a implements A<d> {
        public static IllegalStateException b(String str, InterfaceC0859q interfaceC0859q) {
            String a10 = n.a("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(a10);
            interfaceC0859q.f(SentryLevel.ERROR, a10, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.A
        public final d a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            String str = null;
            String str2 = null;
            Long l10 = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "quantity":
                        l10 = d10.a0();
                        break;
                    case "reason":
                        str = d10.s0();
                        break;
                    case "category":
                        str2 = d10.s0();
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
            if (str == null) {
                throw b("reason", interfaceC0859q);
            }
            if (str2 == null) {
                throw b("category", interfaceC0859q);
            }
            if (l10 == null) {
                throw b(FirebaseAnalytics.Param.QUANTITY, interfaceC0859q);
            }
            d dVar = new d(str, str2, l10);
            dVar.f697d = hashMap;
            return dVar;
        }
    }

    public d(String str, String str2, Long l10) {
        this.f694a = str;
        this.f695b = str2;
        this.f696c = l10;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("reason");
        e10.H(this.f694a);
        e10.P("category");
        e10.H(this.f695b);
        e10.P(FirebaseAnalytics.Param.QUANTITY);
        e10.G(this.f696c);
        Map<String, Object> map = this.f697d;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f697d, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f694a + "', category='" + this.f695b + "', quantity=" + this.f696c + '}';
    }
}
