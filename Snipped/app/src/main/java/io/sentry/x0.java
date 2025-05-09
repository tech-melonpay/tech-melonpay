package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UserFeedback.java */
/* loaded from: classes2.dex */
public final class x0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H9.g f22223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22224b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22225c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22226d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f22227e;

    /* compiled from: UserFeedback.java */
    public static final class a implements A<x0> {
        @Override // io.sentry.A
        public final x0 a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            H9.g gVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "comments":
                        str3 = d10.s0();
                        break;
                    case "name":
                        str = d10.s0();
                        break;
                    case "email":
                        str2 = d10.s0();
                        break;
                    case "event_id":
                        gVar = new H9.g(d10.r0());
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
            if (gVar != null) {
                x0 x0Var = new x0(gVar, str, str2, str3);
                x0Var.f22227e = hashMap;
                return x0Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            interfaceC0859q.f(SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public x0(H9.g gVar, String str, String str2, String str3) {
        this.f22223a = gVar;
        this.f22224b = str;
        this.f22225c = str2;
        this.f22226d = str3;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("event_id");
        this.f22223a.serialize(e10, interfaceC0859q);
        String str = this.f22224b;
        if (str != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(str);
        }
        String str2 = this.f22225c;
        if (str2 != null) {
            e10.P("email");
            e10.H(str2);
        }
        String str3 = this.f22226d;
        if (str3 != null) {
            e10.P("comments");
            e10.H(str3);
        }
        Map<String, Object> map = this.f22227e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22227e, str4, e10, str4, interfaceC0859q);
            }
        }
        e10.p();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f22223a);
        sb2.append(", name='");
        sb2.append(this.f22224b);
        sb2.append("', email='");
        sb2.append(this.f22225c);
        sb2.append("', comments='");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f22226d, "'}");
    }
}
