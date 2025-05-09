package io.sentry.protocol;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.g;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DebugMeta.java */
/* loaded from: classes2.dex */
public final class c implements F {

    /* renamed from: a, reason: collision with root package name */
    public g f22152a;

    /* renamed from: b, reason: collision with root package name */
    public List<DebugImage> f22153b;

    /* renamed from: c, reason: collision with root package name */
    public Map<String, Object> f22154c;

    /* compiled from: DebugMeta.java */
    public static final class a implements A<c> {
        @Override // io.sentry.A
        public final c a(D d10, InterfaceC0859q interfaceC0859q) {
            c cVar = new c();
            d10.i();
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                String g02 = d10.g0();
                g02.getClass();
                if (g02.equals("images")) {
                    cVar.f22153b = d10.W(interfaceC0859q, new DebugImage.a());
                } else if (g02.equals("sdk_info")) {
                    cVar.f22152a = (g) d10.p0(interfaceC0859q, new g.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    d10.t0(interfaceC0859q, hashMap, g02);
                }
            }
            d10.A();
            cVar.f22154c = hashMap;
            return cVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22152a != null) {
            e10.P("sdk_info");
            e10.Q(interfaceC0859q, this.f22152a);
        }
        if (this.f22153b != null) {
            e10.P("images");
            e10.Q(interfaceC0859q, this.f22153b);
        }
        Map<String, Object> map = this.f22154c;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22154c, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
