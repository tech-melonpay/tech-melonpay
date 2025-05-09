package io.sentry.protocol;

import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SdkInfo.java */
/* loaded from: classes2.dex */
public final class g implements F {

    /* renamed from: a, reason: collision with root package name */
    public String f22176a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f22177b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f22178c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f22179d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Object> f22180e;

    /* compiled from: SdkInfo.java */
    public static final class a implements A<g> {
        @Override // io.sentry.A
        public final g a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            g gVar = new g();
            d10.i();
            HashMap hashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "sdk_name":
                        gVar.f22176a = d10.s0();
                        break;
                    case "version_patchlevel":
                        gVar.f22179d = d10.V();
                        break;
                    case "version_major":
                        gVar.f22177b = d10.V();
                        break;
                    case "version_minor":
                        gVar.f22178c = d10.V();
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
            gVar.f22180e = hashMap;
            return gVar;
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22176a != null) {
            e10.P("sdk_name");
            e10.H(this.f22176a);
        }
        if (this.f22177b != null) {
            e10.P("version_major");
            e10.G(this.f22177b);
        }
        if (this.f22178c != null) {
            e10.P("version_minor");
            e10.G(this.f22178c);
        }
        if (this.f22179d != null) {
            e10.P("version_patchlevel");
            e10.G(this.f22179d);
        }
        Map<String, Object> map = this.f22180e;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22180e, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
