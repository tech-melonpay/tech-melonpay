package io.sentry;

import H9.e;
import io.sentry.s0;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SentryEnvelopeHeader.java */
/* loaded from: classes2.dex */
public final class c0 implements F {

    /* renamed from: a, reason: collision with root package name */
    public final H9.g f21973a;

    /* renamed from: b, reason: collision with root package name */
    public final H9.e f21974b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f21975c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f21976d;

    /* compiled from: SentryEnvelopeHeader.java */
    public static final class a implements A<c0> {
        @Override // io.sentry.A
        public final c0 a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            H9.g gVar = null;
            H9.e eVar = null;
            s0 s0Var = null;
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "sdk":
                        eVar = (H9.e) d10.p0(interfaceC0859q, new e.a());
                        break;
                    case "trace":
                        s0Var = (s0) d10.p0(interfaceC0859q, new s0.a());
                        break;
                    case "event_id":
                        if (d10.v0() != JsonToken.NULL) {
                            gVar = new H9.g(d10.r0());
                            break;
                        } else {
                            d10.n0();
                            gVar = null;
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
            c0 c0Var = new c0(gVar, eVar, s0Var);
            c0Var.f21976d = hashMap;
            d10.A();
            return c0Var;
        }
    }

    public c0(H9.g gVar, H9.e eVar, s0 s0Var) {
        this.f21973a = gVar;
        this.f21974b = eVar;
        this.f21975c = s0Var;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        H9.g gVar = this.f21973a;
        if (gVar != null) {
            e10.P("event_id");
            e10.Q(interfaceC0859q, gVar);
        }
        H9.e eVar = this.f21974b;
        if (eVar != null) {
            e10.P("sdk");
            e10.Q(interfaceC0859q, eVar);
        }
        s0 s0Var = this.f21975c;
        if (s0Var != null) {
            e10.P(com.sumsub.sentry.n0.i);
            e10.Q(interfaceC0859q, s0Var);
        }
        Map<String, Object> map = this.f21976d;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f21976d, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public c0() {
        this(new H9.g(), null, null);
    }
}
