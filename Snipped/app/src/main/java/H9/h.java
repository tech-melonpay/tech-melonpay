package H9;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryPackage.java */
/* loaded from: classes2.dex */
public final class h implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f1606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1607b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f1608c;

    /* compiled from: SentryPackage.java */
    public static final class a implements A<h> {
        @Override // io.sentry.A
        public final h a(D d10, InterfaceC0859q interfaceC0859q) {
            d10.i();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    str = d10.r0();
                } else if (g02.equals("version")) {
                    str2 = d10.r0();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    d10.t0(interfaceC0859q, hashMap, g02);
                }
            }
            d10.A();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                h hVar = new h(str, str2);
                hVar.f1608c = hashMap;
                return hVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public h(String str, String str2) {
        this.f1606a = str;
        this.f1607b = str2;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
        e10.H(this.f1606a);
        e10.P("version");
        e10.H(this.f1607b);
        Map<String, Object> map = this.f1608c;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1608c, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
