package io.sentry;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class Session implements F {

    /* renamed from: a, reason: collision with root package name */
    public final Date f21871a;

    /* renamed from: b, reason: collision with root package name */
    public Date f21872b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f21873c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21874d;

    /* renamed from: e, reason: collision with root package name */
    public final UUID f21875e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f21876f;

    /* renamed from: g, reason: collision with root package name */
    public State f21877g;

    /* renamed from: h, reason: collision with root package name */
    public Long f21878h;
    public Double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21879j;

    /* renamed from: k, reason: collision with root package name */
    public String f21880k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21881l;

    /* renamed from: m, reason: collision with root package name */
    public final String f21882m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f21883n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public Map<String, Object> f21884o;

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public static final class a implements A<Session> {
        public static IllegalStateException b(String str, InterfaceC0859q interfaceC0859q) {
            String a10 = androidx.camera.core.n.a("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(a10);
            interfaceC0859q.f(SentryLevel.ERROR, a10, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01fd A[LOOP:2: B:53:0x0119->B:64:0x01fd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ea A[SYNTHETIC] */
        @Override // io.sentry.A
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.Session a(io.sentry.D r26, io.sentry.InterfaceC0859q r27) {
            /*
                Method dump skipped, instructions count: 836
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.Session.a.a(io.sentry.D, io.sentry.q):java.lang.Object");
        }
    }

    public Session(State state, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l10, Double d10, String str2, String str3, String str4, String str5) {
        this.f21877g = state;
        this.f21871a = date;
        this.f21872b = date2;
        this.f21873c = new AtomicInteger(i);
        this.f21874d = str;
        this.f21875e = uuid;
        this.f21876f = bool;
        this.f21878h = l10;
        this.i = d10;
        this.f21879j = str2;
        this.f21880k = str3;
        this.f21881l = str4;
        this.f21882m = str5;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Session clone() {
        return new Session(this.f21877g, this.f21871a, this.f21872b, this.f21873c.get(), this.f21874d, this.f21875e, this.f21876f, this.f21878h, this.i, this.f21879j, this.f21880k, this.f21881l, this.f21882m);
    }

    public final void b(Date date) {
        synchronized (this.f21883n) {
            try {
                this.f21876f = null;
                if (this.f21877g == State.Ok) {
                    this.f21877g = State.Exited;
                }
                if (date != null) {
                    this.f21872b = date;
                } else {
                    this.f21872b = I.n();
                }
                if (this.f21872b != null) {
                    this.i = Double.valueOf(Math.abs(r6.getTime() - this.f21871a.getTime()) / 1000.0d);
                    long time = this.f21872b.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f21878h = Long.valueOf(time);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(State state, String str, boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f21883n) {
            z11 = true;
            if (state != null) {
                try {
                    this.f21877g = state;
                    z12 = true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                z12 = false;
            }
            if (str != null) {
                this.f21880k = str;
                z12 = true;
            }
            if (z10) {
                this.f21873c.addAndGet(1);
            } else {
                z11 = z12;
            }
            if (z11) {
                this.f21876f = null;
                Date n10 = I.n();
                this.f21872b = n10;
                if (n10 != null) {
                    long time = n10.getTime();
                    if (time < 0) {
                        time = Math.abs(time);
                    }
                    this.f21878h = Long.valueOf(time);
                }
            }
        }
        return z11;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        UUID uuid = this.f21875e;
        if (uuid != null) {
            e10.P("sid");
            e10.H(uuid.toString());
        }
        String str = this.f21874d;
        if (str != null) {
            e10.P("did");
            e10.H(str);
        }
        if (this.f21876f != null) {
            e10.P("init");
            e10.E(this.f21876f);
        }
        e10.P("started");
        e10.Q(interfaceC0859q, this.f21871a);
        e10.P("status");
        e10.Q(interfaceC0859q, this.f21877g.name().toLowerCase(Locale.ROOT));
        if (this.f21878h != null) {
            e10.P("seq");
            e10.G(this.f21878h);
        }
        e10.P("errors");
        long intValue = this.f21873c.intValue();
        e10.N();
        e10.d();
        e10.f2730a.write(Long.toString(intValue));
        if (this.i != null) {
            e10.P("duration");
            e10.G(this.i);
        }
        if (this.f21872b != null) {
            e10.P("timestamp");
            e10.Q(interfaceC0859q, this.f21872b);
        }
        e10.P("attrs");
        e10.i();
        e10.P("release");
        e10.Q(interfaceC0859q, this.f21882m);
        String str2 = this.f21881l;
        if (str2 != null) {
            e10.P("environment");
            e10.Q(interfaceC0859q, str2);
        }
        String str3 = this.f21879j;
        if (str3 != null) {
            e10.P("ip_address");
            e10.Q(interfaceC0859q, str3);
        }
        if (this.f21880k != null) {
            e10.P("user_agent");
            e10.Q(interfaceC0859q, this.f21880k);
        }
        e10.p();
        Map<String, Object> map = this.f21884o;
        if (map != null) {
            for (String str4 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f21884o, str4, e10, str4, interfaceC0859q);
            }
        }
        e10.p();
    }
}
