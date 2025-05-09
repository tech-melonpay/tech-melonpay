package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.A;
import io.sentry.D;
import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class Device implements F {

    /* renamed from: A, reason: collision with root package name */
    public String f22110A;

    /* renamed from: B, reason: collision with root package name */
    @Deprecated
    public String f22111B;

    /* renamed from: C, reason: collision with root package name */
    public String f22112C;

    /* renamed from: D, reason: collision with root package name */
    public String f22113D;

    /* renamed from: E, reason: collision with root package name */
    public Float f22114E;

    /* renamed from: F, reason: collision with root package name */
    public Map<String, Object> f22115F;

    /* renamed from: a, reason: collision with root package name */
    public String f22116a;

    /* renamed from: b, reason: collision with root package name */
    public String f22117b;

    /* renamed from: c, reason: collision with root package name */
    public String f22118c;

    /* renamed from: d, reason: collision with root package name */
    public String f22119d;

    /* renamed from: e, reason: collision with root package name */
    public String f22120e;

    /* renamed from: f, reason: collision with root package name */
    public String f22121f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f22122g;

    /* renamed from: h, reason: collision with root package name */
    public Float f22123h;
    public Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f22124j;

    /* renamed from: k, reason: collision with root package name */
    public DeviceOrientation f22125k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f22126l;

    /* renamed from: m, reason: collision with root package name */
    public Long f22127m;

    /* renamed from: n, reason: collision with root package name */
    public Long f22128n;

    /* renamed from: o, reason: collision with root package name */
    public Long f22129o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f22130p;

    /* renamed from: q, reason: collision with root package name */
    public Long f22131q;

    /* renamed from: r, reason: collision with root package name */
    public Long f22132r;

    /* renamed from: s, reason: collision with root package name */
    public Long f22133s;

    /* renamed from: t, reason: collision with root package name */
    public Long f22134t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f22135u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f22136v;

    /* renamed from: w, reason: collision with root package name */
    public Float f22137w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f22138x;

    /* renamed from: y, reason: collision with root package name */
    public Date f22139y;

    /* renamed from: z, reason: collision with root package name */
    public TimeZone f22140z;

    public enum DeviceOrientation implements F {
        PORTRAIT,
        LANDSCAPE;

        public static final class a implements A<DeviceOrientation> {
            @Override // io.sentry.A
            public final DeviceOrientation a(D d10, InterfaceC0859q interfaceC0859q) {
                return DeviceOrientation.valueOf(d10.r0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.F
        public void serialize(E e10, InterfaceC0859q interfaceC0859q) {
            e10.H(toString().toLowerCase(Locale.ROOT));
        }
    }

    public static final class a implements A<Device> {
        public static Device b(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            TimeZone timeZone;
            DeviceOrientation valueOf;
            d10.i();
            Device device = new Device();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "timezone":
                        if (d10.v0() != JsonToken.NULL) {
                            try {
                                timeZone = TimeZone.getTimeZone(d10.r0());
                            } catch (Exception e10) {
                                interfaceC0859q.f(SentryLevel.ERROR, "Error when deserializing TimeZone", e10);
                            }
                            device.f22140z = timeZone;
                            break;
                        } else {
                            d10.n0();
                        }
                        timeZone = null;
                        device.f22140z = timeZone;
                    case "boot_time":
                        if (d10.v0() != JsonToken.STRING) {
                            break;
                        } else {
                            device.f22139y = d10.M(interfaceC0859q);
                            break;
                        }
                    case "simulator":
                        device.f22126l = d10.H();
                        break;
                    case "manufacturer":
                        device.f22117b = d10.s0();
                        break;
                    case "language":
                        device.f22111B = d10.s0();
                        break;
                    case "orientation":
                        if (d10.v0() == JsonToken.NULL) {
                            d10.n0();
                            valueOf = null;
                        } else {
                            valueOf = DeviceOrientation.valueOf(d10.r0().toUpperCase(Locale.ROOT));
                        }
                        device.f22125k = valueOf;
                        break;
                    case "battery_temperature":
                        device.f22114E = d10.Q();
                        break;
                    case "family":
                        device.f22119d = d10.s0();
                        break;
                    case "locale":
                        device.f22112C = d10.s0();
                        break;
                    case "online":
                        device.f22124j = d10.H();
                        break;
                    case "battery_level":
                        device.f22123h = d10.Q();
                        break;
                    case "model_id":
                        device.f22121f = d10.s0();
                        break;
                    case "screen_density":
                        device.f22137w = d10.Q();
                        break;
                    case "screen_dpi":
                        device.f22138x = d10.V();
                        break;
                    case "free_memory":
                        device.f22128n = d10.a0();
                        break;
                    case "id":
                        device.f22110A = d10.s0();
                        break;
                    case "name":
                        device.f22116a = d10.s0();
                        break;
                    case "low_memory":
                        device.f22130p = d10.H();
                        break;
                    case "archs":
                        List list = (List) d10.o0();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            device.f22122g = strArr;
                            break;
                        }
                    case "brand":
                        device.f22118c = d10.s0();
                        break;
                    case "model":
                        device.f22120e = d10.s0();
                        break;
                    case "connection_type":
                        device.f22113D = d10.s0();
                        break;
                    case "screen_width_pixels":
                        device.f22135u = d10.V();
                        break;
                    case "external_storage_size":
                        device.f22133s = d10.a0();
                        break;
                    case "storage_size":
                        device.f22131q = d10.a0();
                        break;
                    case "usable_memory":
                        device.f22129o = d10.a0();
                        break;
                    case "memory_size":
                        device.f22127m = d10.a0();
                        break;
                    case "charging":
                        device.i = d10.H();
                        break;
                    case "external_free_storage":
                        device.f22134t = d10.a0();
                        break;
                    case "free_storage":
                        device.f22132r = d10.a0();
                        break;
                    case "screen_height_pixels":
                        device.f22136v = d10.V();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            device.f22115F = concurrentHashMap;
            d10.A();
            return device;
        }

        @Override // io.sentry.A
        public final /* bridge */ /* synthetic */ Device a(D d10, InterfaceC0859q interfaceC0859q) {
            return b(d10, interfaceC0859q);
        }
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        if (this.f22116a != null) {
            e10.P(AppMeasurementSdk.ConditionalUserProperty.NAME);
            e10.H(this.f22116a);
        }
        if (this.f22117b != null) {
            e10.P("manufacturer");
            e10.H(this.f22117b);
        }
        if (this.f22118c != null) {
            e10.P("brand");
            e10.H(this.f22118c);
        }
        if (this.f22119d != null) {
            e10.P("family");
            e10.H(this.f22119d);
        }
        if (this.f22120e != null) {
            e10.P("model");
            e10.H(this.f22120e);
        }
        if (this.f22121f != null) {
            e10.P("model_id");
            e10.H(this.f22121f);
        }
        if (this.f22122g != null) {
            e10.P("archs");
            e10.Q(interfaceC0859q, this.f22122g);
        }
        if (this.f22123h != null) {
            e10.P("battery_level");
            e10.G(this.f22123h);
        }
        if (this.i != null) {
            e10.P("charging");
            e10.E(this.i);
        }
        if (this.f22124j != null) {
            e10.P("online");
            e10.E(this.f22124j);
        }
        if (this.f22125k != null) {
            e10.P("orientation");
            e10.Q(interfaceC0859q, this.f22125k);
        }
        if (this.f22126l != null) {
            e10.P("simulator");
            e10.E(this.f22126l);
        }
        if (this.f22127m != null) {
            e10.P("memory_size");
            e10.G(this.f22127m);
        }
        if (this.f22128n != null) {
            e10.P("free_memory");
            e10.G(this.f22128n);
        }
        if (this.f22129o != null) {
            e10.P("usable_memory");
            e10.G(this.f22129o);
        }
        if (this.f22130p != null) {
            e10.P("low_memory");
            e10.E(this.f22130p);
        }
        if (this.f22131q != null) {
            e10.P("storage_size");
            e10.G(this.f22131q);
        }
        if (this.f22132r != null) {
            e10.P("free_storage");
            e10.G(this.f22132r);
        }
        if (this.f22133s != null) {
            e10.P("external_storage_size");
            e10.G(this.f22133s);
        }
        if (this.f22134t != null) {
            e10.P("external_free_storage");
            e10.G(this.f22134t);
        }
        if (this.f22135u != null) {
            e10.P("screen_width_pixels");
            e10.G(this.f22135u);
        }
        if (this.f22136v != null) {
            e10.P("screen_height_pixels");
            e10.G(this.f22136v);
        }
        if (this.f22137w != null) {
            e10.P("screen_density");
            e10.G(this.f22137w);
        }
        if (this.f22138x != null) {
            e10.P("screen_dpi");
            e10.G(this.f22138x);
        }
        if (this.f22139y != null) {
            e10.P("boot_time");
            e10.Q(interfaceC0859q, this.f22139y);
        }
        if (this.f22140z != null) {
            e10.P("timezone");
            e10.Q(interfaceC0859q, this.f22140z);
        }
        if (this.f22110A != null) {
            e10.P("id");
            e10.H(this.f22110A);
        }
        if (this.f22111B != null) {
            e10.P("language");
            e10.H(this.f22111B);
        }
        if (this.f22113D != null) {
            e10.P("connection_type");
            e10.H(this.f22113D);
        }
        if (this.f22114E != null) {
            e10.P("battery_temperature");
            e10.G(this.f22114E);
        }
        if (this.f22112C != null) {
            e10.P("locale");
            e10.H(this.f22112C);
        }
        Map<String, Object> map = this.f22115F;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f22115F, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }
}
