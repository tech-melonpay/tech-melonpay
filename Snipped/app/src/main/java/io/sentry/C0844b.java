package io.sentry;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Breadcrumb.java */
/* renamed from: io.sentry.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0844b implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Date f21962a;

    /* renamed from: b, reason: collision with root package name */
    public String f21963b;

    /* renamed from: c, reason: collision with root package name */
    public String f21964c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, Object> f21965d;

    /* renamed from: e, reason: collision with root package name */
    public String f21966e;

    /* renamed from: f, reason: collision with root package name */
    public SentryLevel f21967f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f21968g;

    /* compiled from: Breadcrumb.java */
    /* renamed from: io.sentry.b$a */
    public static final class a implements A<C0844b> {
        @Override // io.sentry.A
        public final C0844b a(D d10, InterfaceC0859q interfaceC0859q) {
            String g02;
            d10.i();
            Date n10 = I.n();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str = null;
            String str2 = null;
            String str3 = null;
            SentryLevel sentryLevel = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (d10.v0() == JsonToken.NAME) {
                g02 = d10.g0();
                g02.getClass();
                switch (g02) {
                    case "data":
                        ConcurrentHashMap a10 = J9.a.a((Map) d10.o0());
                        if (a10 == null) {
                            break;
                        } else {
                            concurrentHashMap = a10;
                            break;
                        }
                    case "type":
                        str2 = d10.s0();
                        break;
                    case "category":
                        str3 = d10.s0();
                        break;
                    case "timestamp":
                        Date M8 = d10.M(interfaceC0859q);
                        if (M8 == null) {
                            break;
                        } else {
                            n10 = M8;
                            break;
                        }
                    case "level":
                        try {
                            sentryLevel = SentryLevel.valueOf(d10.r0().toUpperCase(Locale.ROOT));
                            break;
                        } catch (Exception e10) {
                            interfaceC0859q.d(SentryLevel.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        str = d10.s0();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        d10.t0(interfaceC0859q, concurrentHashMap2, g02);
                        break;
                }
            }
            C0844b c0844b = new C0844b(n10);
            c0844b.f21963b = str;
            c0844b.f21964c = str2;
            c0844b.f21965d = concurrentHashMap;
            c0844b.f21966e = str3;
            c0844b.f21967f = sentryLevel;
            c0844b.f21968g = concurrentHashMap2;
            d10.A();
            return c0844b;
        }
    }

    public C0844b(Date date) {
        this.f21965d = new ConcurrentHashMap();
        this.f21962a = date;
    }

    public final void a(Object obj, String str) {
        this.f21965d.put(str, obj);
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        e10.P("timestamp");
        e10.Q(interfaceC0859q, this.f21962a);
        if (this.f21963b != null) {
            e10.P("message");
            e10.H(this.f21963b);
        }
        if (this.f21964c != null) {
            e10.P("type");
            e10.H(this.f21964c);
        }
        e10.P(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        e10.Q(interfaceC0859q, this.f21965d);
        if (this.f21966e != null) {
            e10.P("category");
            e10.H(this.f21966e);
        }
        if (this.f21967f != null) {
            e10.P(FirebaseAnalytics.Param.LEVEL);
            e10.Q(interfaceC0859q, this.f21967f);
        }
        Map<String, Object> map = this.f21968g;
        if (map != null) {
            for (String str : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f21968g, str, e10, str, interfaceC0859q);
            }
        }
        e10.p();
    }

    public C0844b(C0844b c0844b) {
        this.f21965d = new ConcurrentHashMap();
        this.f21962a = c0844b.f21962a;
        this.f21963b = c0844b.f21963b;
        this.f21964c = c0844b.f21964c;
        this.f21966e = c0844b.f21966e;
        ConcurrentHashMap a10 = J9.a.a(c0844b.f21965d);
        if (a10 != null) {
            this.f21965d = a10;
        }
        this.f21968g = J9.a.a(c0844b.f21968g);
        this.f21967f = c0844b.f21967f;
    }

    public C0844b() {
        this(I.n());
    }
}
