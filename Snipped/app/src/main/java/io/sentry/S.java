package io.sentry;

import G9.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.T;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ProfilingTraceData.java */
/* loaded from: classes2.dex */
public final class S implements F {

    /* renamed from: A, reason: collision with root package name */
    public String f21840A;

    /* renamed from: B, reason: collision with root package name */
    public Map<String, Object> f21841B;

    /* renamed from: a, reason: collision with root package name */
    public final File f21842a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable<List<Integer>> f21843b;

    /* renamed from: c, reason: collision with root package name */
    public int f21844c;

    /* renamed from: d, reason: collision with root package name */
    public String f21845d;

    /* renamed from: e, reason: collision with root package name */
    public String f21846e;

    /* renamed from: f, reason: collision with root package name */
    public String f21847f;

    /* renamed from: g, reason: collision with root package name */
    public String f21848g;

    /* renamed from: h, reason: collision with root package name */
    public String f21849h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21850j;

    /* renamed from: k, reason: collision with root package name */
    public String f21851k;

    /* renamed from: l, reason: collision with root package name */
    public List<Integer> f21852l;

    /* renamed from: m, reason: collision with root package name */
    public String f21853m;

    /* renamed from: n, reason: collision with root package name */
    public String f21854n;

    /* renamed from: o, reason: collision with root package name */
    public String f21855o;

    /* renamed from: p, reason: collision with root package name */
    public final List<T> f21856p;

    /* renamed from: q, reason: collision with root package name */
    public String f21857q;

    /* renamed from: r, reason: collision with root package name */
    public String f21858r;

    /* renamed from: s, reason: collision with root package name */
    public String f21859s;

    /* renamed from: t, reason: collision with root package name */
    public String f21860t;

    /* renamed from: u, reason: collision with root package name */
    public String f21861u;

    /* renamed from: v, reason: collision with root package name */
    public String f21862v;

    /* renamed from: w, reason: collision with root package name */
    public String f21863w;

    /* renamed from: x, reason: collision with root package name */
    public String f21864x;

    /* renamed from: y, reason: collision with root package name */
    public String f21865y;

    /* renamed from: z, reason: collision with root package name */
    public final Map<String, G9.a> f21866z;

    /* compiled from: ProfilingTraceData.java */
    public static final class a implements A<S> {
        @Override // io.sentry.A
        public final S a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            S s10 = new S();
            ConcurrentHashMap concurrentHashMap = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "device_manufacturer":
                        String s0 = d10.s0();
                        if (s0 == null) {
                            break;
                        } else {
                            s10.f21846e = s0;
                            break;
                        }
                    case "android_api_level":
                        Integer V = d10.V();
                        if (V == null) {
                            break;
                        } else {
                            s10.f21844c = V.intValue();
                            break;
                        }
                    case "build_id":
                        String s02 = d10.s0();
                        if (s02 == null) {
                            break;
                        } else {
                            s10.f21855o = s02;
                            break;
                        }
                    case "device_locale":
                        String s03 = d10.s0();
                        if (s03 == null) {
                            break;
                        } else {
                            s10.f21845d = s03;
                            break;
                        }
                    case "profile_id":
                        String s04 = d10.s0();
                        if (s04 == null) {
                            break;
                        } else {
                            s10.f21863w = s04;
                            break;
                        }
                    case "device_os_build_number":
                        String s05 = d10.s0();
                        if (s05 == null) {
                            break;
                        } else {
                            s10.f21848g = s05;
                            break;
                        }
                    case "device_model":
                        String s06 = d10.s0();
                        if (s06 == null) {
                            break;
                        } else {
                            s10.f21847f = s06;
                            break;
                        }
                    case "device_is_emulator":
                        Boolean H10 = d10.H();
                        if (H10 == null) {
                            break;
                        } else {
                            s10.f21850j = H10.booleanValue();
                            break;
                        }
                    case "duration_ns":
                        String s07 = d10.s0();
                        if (s07 == null) {
                            break;
                        } else {
                            s10.f21858r = s07;
                            break;
                        }
                    case "measurements":
                        HashMap d02 = d10.d0(interfaceC0859q, new a.C0017a());
                        if (d02 == null) {
                            break;
                        } else {
                            s10.f21866z.putAll(d02);
                            break;
                        }
                    case "device_physical_memory_bytes":
                        String s08 = d10.s0();
                        if (s08 == null) {
                            break;
                        } else {
                            s10.f21853m = s08;
                            break;
                        }
                    case "device_cpu_frequencies":
                        List<Integer> list = (List) d10.o0();
                        if (list == null) {
                            break;
                        } else {
                            s10.f21852l = list;
                            break;
                        }
                    case "version_code":
                        String s09 = d10.s0();
                        if (s09 == null) {
                            break;
                        } else {
                            s10.f21860t = s09;
                            break;
                        }
                    case "version_name":
                        String s010 = d10.s0();
                        if (s010 == null) {
                            break;
                        } else {
                            s10.f21859s = s010;
                            break;
                        }
                    case "environment":
                        String s011 = d10.s0();
                        if (s011 == null) {
                            break;
                        } else {
                            s10.f21864x = s011;
                            break;
                        }
                    case "transaction_name":
                        String s012 = d10.s0();
                        if (s012 == null) {
                            break;
                        } else {
                            s10.f21857q = s012;
                            break;
                        }
                    case "device_os_name":
                        String s013 = d10.s0();
                        if (s013 == null) {
                            break;
                        } else {
                            s10.f21849h = s013;
                            break;
                        }
                    case "architecture":
                        String s014 = d10.s0();
                        if (s014 == null) {
                            break;
                        } else {
                            s10.f21851k = s014;
                            break;
                        }
                    case "transaction_id":
                        String s015 = d10.s0();
                        if (s015 == null) {
                            break;
                        } else {
                            s10.f21861u = s015;
                            break;
                        }
                    case "device_os_version":
                        String s016 = d10.s0();
                        if (s016 == null) {
                            break;
                        } else {
                            s10.i = s016;
                            break;
                        }
                    case "truncation_reason":
                        String s017 = d10.s0();
                        if (s017 == null) {
                            break;
                        } else {
                            s10.f21865y = s017;
                            break;
                        }
                    case "trace_id":
                        String s018 = d10.s0();
                        if (s018 == null) {
                            break;
                        } else {
                            s10.f21862v = s018;
                            break;
                        }
                    case "platform":
                        String s019 = d10.s0();
                        if (s019 == null) {
                            break;
                        } else {
                            s10.f21854n = s019;
                            break;
                        }
                    case "sampled_profile":
                        String s020 = d10.s0();
                        if (s020 == null) {
                            break;
                        } else {
                            s10.f21840A = s020;
                            break;
                        }
                    case "transactions":
                        ArrayList W = d10.W(interfaceC0859q, new T.a());
                        if (W == null) {
                            break;
                        } else {
                            s10.f21856p.addAll(W);
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap, g02);
                        break;
                }
            }
            s10.f21841B = concurrentHashMap;
            d10.A();
            return s10;
        }
    }

    public S() {
        this(new File("dummy"), new ArrayList(), N.f21832a, "0", 0, "", new com.sumsub.sentry.h(3), null, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("android_api_level");
        e10.Q(interfaceC0859q, Integer.valueOf(this.f21844c));
        e10.P("device_locale");
        e10.Q(interfaceC0859q, this.f21845d);
        e10.P("device_manufacturer");
        e10.H(this.f21846e);
        e10.P("device_model");
        e10.H(this.f21847f);
        e10.P("device_os_build_number");
        e10.H(this.f21848g);
        e10.P("device_os_name");
        e10.H(this.f21849h);
        e10.P("device_os_version");
        e10.H(this.i);
        e10.P("device_is_emulator");
        e10.M(this.f21850j);
        e10.P("architecture");
        e10.Q(interfaceC0859q, this.f21851k);
        e10.P("device_cpu_frequencies");
        e10.Q(interfaceC0859q, this.f21852l);
        e10.P("device_physical_memory_bytes");
        e10.H(this.f21853m);
        e10.P("platform");
        e10.H(this.f21854n);
        e10.P("build_id");
        e10.H(this.f21855o);
        e10.P("transaction_name");
        e10.H(this.f21857q);
        e10.P("duration_ns");
        e10.H(this.f21858r);
        e10.P("version_name");
        e10.H(this.f21859s);
        e10.P("version_code");
        e10.H(this.f21860t);
        List<T> list = this.f21856p;
        if (!list.isEmpty()) {
            e10.P("transactions");
            e10.Q(interfaceC0859q, list);
        }
        e10.P(FirebaseAnalytics.Param.TRANSACTION_ID);
        e10.H(this.f21861u);
        e10.P("trace_id");
        e10.H(this.f21862v);
        e10.P("profile_id");
        e10.H(this.f21863w);
        e10.P("environment");
        e10.H(this.f21864x);
        e10.P("truncation_reason");
        e10.H(this.f21865y);
        if (this.f21840A != null) {
            e10.P("sampled_profile");
            e10.H(this.f21840A);
        }
        e10.P("measurements");
        e10.Q(interfaceC0859q, this.f21866z);
        Map<String, Object> map = this.f21841B;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f21841B, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public S(File file, ArrayList arrayList, InterfaceC0864w interfaceC0864w, String str, int i, String str2, Callable callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, HashMap hashMap) {
        this.f21852l = new ArrayList();
        this.f21840A = null;
        this.f21842a = file;
        this.f21851k = str2;
        this.f21843b = callable;
        this.f21844c = i;
        this.f21845d = Locale.getDefault().toString();
        this.f21846e = str3 != null ? str3 : "";
        this.f21847f = str4 != null ? str4 : "";
        this.i = str5 != null ? str5 : "";
        this.f21850j = bool != null ? bool.booleanValue() : false;
        this.f21853m = str6 != null ? str6 : "0";
        this.f21848g = "";
        this.f21849h = "android";
        this.f21854n = "android";
        this.f21855o = str7 != null ? str7 : "";
        this.f21856p = arrayList;
        this.f21857q = interfaceC0864w.getName();
        this.f21858r = str;
        this.f21859s = str8 != null ? str8 : "";
        this.f21860t = str9 != null ? str9 : "";
        this.f21861u = interfaceC0864w.g().toString();
        this.f21862v = interfaceC0864w.j().f22102a.toString();
        this.f21863w = UUID.randomUUID().toString();
        this.f21864x = str10 != null ? str10 : "production";
        this.f21865y = str11;
        if (!str11.equals("normal") && !this.f21865y.equals("timeout") && !this.f21865y.equals("backgrounded")) {
            this.f21865y = "normal";
        }
        this.f21866z = hashMap;
    }
}
