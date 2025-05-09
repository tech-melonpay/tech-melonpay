package io.sentry;

import android.app.Activity;
import g9.C0771a;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.TransactionNameSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import u9.C1531b;
import u9.C1533d;
import u9.RunnableC1530a;

/* compiled from: SentryTracer.java */
/* loaded from: classes2.dex */
public final class m0 implements InterfaceC0864w {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f22071b;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0858p f22073d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22074e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22075f;

    /* renamed from: h, reason: collision with root package name */
    public final M.b f22077h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f22078j;

    /* renamed from: k, reason: collision with root package name */
    public volatile a f22079k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Timer f22080l;

    /* renamed from: p, reason: collision with root package name */
    public final C0771a f22084p;

    /* renamed from: q, reason: collision with root package name */
    public final TransactionNameSource f22085q;

    /* renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f22086r;

    /* renamed from: a, reason: collision with root package name */
    public final H9.g f22070a = new H9.g();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f22072c = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b f22076g = b.f22088c;

    /* renamed from: m, reason: collision with root package name */
    public final Object f22081m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final c f22082n = new c();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f22083o = new AtomicBoolean(false);

    /* compiled from: SentryTracer.java */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            m0 m0Var = m0.this;
            SpanStatus status = m0Var.getStatus();
            if (status == null) {
                status = SpanStatus.OK;
            }
            m0Var.c(status);
            m0Var.f22083o.set(false);
        }
    }

    /* compiled from: SentryTracer.java */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f22088c = new b(false, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22089a;

        /* renamed from: b, reason: collision with root package name */
        public final SpanStatus f22090b;

        public b(boolean z10, SpanStatus spanStatus) {
            this.f22089a = z10;
            this.f22090b = spanStatus;
        }
    }

    /* compiled from: SentryTracer.java */
    public static final class c implements Comparator<o0> {
        @Override // java.util.Comparator
        public final int compare(o0 o0Var, o0 o0Var2) {
            o0 o0Var3 = o0Var;
            o0 o0Var4 = o0Var2;
            Double n10 = o0Var3.n(o0Var3.f22095c);
            Double n11 = o0Var4.n(o0Var4.f22095c);
            if (n10 == null) {
                return -1;
            }
            if (n11 == null) {
                return 1;
            }
            return n10.compareTo(n11);
        }
    }

    public m0(u0 u0Var, InterfaceC0858p interfaceC0858p, Date date, boolean z10, Long l10, boolean z11, M.b bVar) {
        this.f22080l = null;
        D9.b.t0(interfaceC0858p, "hub is required");
        this.f22086r = new ConcurrentHashMap();
        this.f22071b = new o0(u0Var, this, interfaceC0858p, date);
        this.f22074e = u0Var.f22209j;
        this.f22073d = interfaceC0858p;
        this.f22075f = z10;
        this.f22078j = l10;
        this.i = z11;
        this.f22077h = bVar;
        this.f22085q = u0Var.f22210k;
        this.f22084p = new C0771a(interfaceC0858p.h().getLogger());
        if (l10 != null) {
            this.f22080l = new Timer(true);
            i();
        }
    }

    @Override // io.sentry.InterfaceC0863v
    public final s0 a() {
        if (!this.f22073d.h().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.f22084p.f20837a) {
                    AtomicReference atomicReference = new AtomicReference();
                    this.f22073d.f(new J.f(atomicReference, 5));
                    this.f22084p.m(this, (H9.o) atomicReference.get(), this.f22073d.h(), this.f22071b.f22097e.f22105d);
                    this.f22084p.f20837a = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0771a c0771a = this.f22084p;
        String a10 = c0771a.a("sentry-trace_id");
        String a11 = c0771a.a("sentry-public_key");
        if (a10 == null || a11 == null) {
            return null;
        }
        return new s0(new H9.g(a10), a11, c0771a.a("sentry-release"), c0771a.a("sentry-environment"), c0771a.a("sentry-user_id"), c0771a.a("sentry-user_segment"), c0771a.a("sentry-transaction"), c0771a.a("sentry-sample_rate"));
    }

    @Override // io.sentry.InterfaceC0863v
    public final boolean b() {
        return this.f22071b.f22100h.get();
    }

    @Override // io.sentry.InterfaceC0863v
    public final void c(SpanStatus spanStatus) {
        C1531b.a a10;
        C1531b.a aVar;
        int i;
        o0 o0Var;
        Double d10;
        this.f22076g = new b(true, spanStatus);
        if (this.f22071b.f22100h.get()) {
            return;
        }
        if (!this.f22075f || p()) {
            Boolean bool = Boolean.TRUE;
            Fa.h hVar = this.f22071b.f22097e.f22105d;
            if (bool.equals(hVar == null ? null : (Boolean) hVar.f1299b)) {
                Fa.h hVar2 = this.f22071b.f22097e.f22105d;
                if (bool.equals(hVar2 == null ? null : (Boolean) hVar2.f1301d)) {
                    this.f22073d.h().getTransactionProfiler().i(this);
                }
            }
            Long valueOf = Long.valueOf(System.nanoTime());
            Double n10 = this.f22071b.n(valueOf);
            if (n10 == null) {
                n10 = Double.valueOf(I.n().getTime() / 1000.0d);
                valueOf = null;
            }
            Iterator it = this.f22072c.iterator();
            while (it.hasNext()) {
                o0 o0Var2 = (o0) it.next();
                if (!o0Var2.f22100h.get()) {
                    o0Var2.i = null;
                    o0Var2.m(SpanStatus.DEADLINE_EXCEEDED, n10, valueOf);
                }
            }
            if (!this.f22072c.isEmpty() && this.i && (d10 = (o0Var = (o0) Collections.max(this.f22072c, this.f22082n)).f22096d) != null && n10.doubleValue() > d10.doubleValue()) {
                valueOf = o0Var.f22095c;
                n10 = d10;
            }
            this.f22071b.m(this.f22076g.f22090b, n10, valueOf);
            this.f22073d.f(new l0(this));
            H9.m mVar = new H9.m(this);
            M.b bVar = this.f22077h;
            if (bVar != null) {
                C1533d c1533d = (C1533d) bVar.f2503b;
                WeakReference weakReference = (WeakReference) bVar.i;
                String str = (String) bVar.f2504j;
                c1533d.getClass();
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    C1531b c1531b = c1533d.f30407k;
                    H9.g gVar = this.f22070a;
                    synchronized (c1531b) {
                        if (c1531b.b()) {
                            c1531b.c(new RunnableC1530a(c1531b, activity, 1), null);
                            C1531b.a aVar2 = (C1531b.a) c1531b.f30391d.remove(activity);
                            if (aVar2 != null && (a10 = c1531b.a()) != null) {
                                aVar = new C1531b.a(a10.f30393a - aVar2.f30393a, a10.f30394b - aVar2.f30394b, a10.f30395c - aVar2.f30395c);
                                if (aVar != null && ((i = aVar.f30393a) != 0 || aVar.f30394b != 0 || aVar.f30395c != 0)) {
                                    H9.a aVar3 = new H9.a(Integer.valueOf(i), "none");
                                    H9.a aVar4 = new H9.a(Integer.valueOf(aVar.f30394b), "none");
                                    H9.a aVar5 = new H9.a(Integer.valueOf(aVar.f30395c), "none");
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("frames_total", aVar3);
                                    hashMap.put("frames_slow", aVar4);
                                    hashMap.put("frames_frozen", aVar5);
                                    c1531b.f30390c.put(gVar, hashMap);
                                }
                            }
                            aVar = null;
                            if (aVar != null) {
                                H9.a aVar32 = new H9.a(Integer.valueOf(i), "none");
                                H9.a aVar42 = new H9.a(Integer.valueOf(aVar.f30394b), "none");
                                H9.a aVar52 = new H9.a(Integer.valueOf(aVar.f30395c), "none");
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("frames_total", aVar32);
                                hashMap2.put("frames_slow", aVar42);
                                hashMap2.put("frames_frozen", aVar52);
                                c1531b.f30390c.put(gVar, hashMap2);
                            }
                        }
                    }
                } else {
                    SentryAndroidOptions sentryAndroidOptions = c1533d.f30400c;
                    if (sentryAndroidOptions != null) {
                        sentryAndroidOptions.getLogger().h(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                    }
                }
            }
            if (this.f22080l != null) {
                synchronized (this.f22081m) {
                    try {
                        if (this.f22080l != null) {
                            this.f22080l.cancel();
                            this.f22080l = null;
                        }
                    } finally {
                    }
                }
            }
            if (!this.f22072c.isEmpty() || this.f22078j == null) {
                mVar.f1650s.putAll(this.f22086r);
                this.f22073d.g(mVar, a(), null);
            }
        }
    }

    @Override // io.sentry.InterfaceC0863v
    public final void d() {
        c(getStatus());
    }

    @Override // io.sentry.InterfaceC0864w
    public final o0 e() {
        ArrayList arrayList = new ArrayList(this.f22072c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((o0) arrayList.get(size)).f22100h.get()) {
                return (o0) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.InterfaceC0863v
    public final void f(String str) {
        o0 o0Var = this.f22071b;
        if (o0Var.f22100h.get()) {
            return;
        }
        o0Var.f(str);
    }

    @Override // io.sentry.InterfaceC0864w
    public final H9.g g() {
        return this.f22070a;
    }

    @Override // io.sentry.InterfaceC0864w
    public final String getName() {
        return this.f22074e;
    }

    @Override // io.sentry.InterfaceC0863v
    public final SpanStatus getStatus() {
        return this.f22071b.f22097e.f22108g;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v h(String str) {
        return o(null, "ui.load", str);
    }

    @Override // io.sentry.InterfaceC0864w
    public final void i() {
        synchronized (this.f22081m) {
            try {
                m();
                if (this.f22080l != null) {
                    this.f22083o.set(true);
                    this.f22079k = new a();
                    this.f22080l.schedule(this.f22079k, this.f22078j.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC0863v
    public final p0 j() {
        return this.f22071b.f22097e;
    }

    @Override // io.sentry.InterfaceC0864w
    public final TransactionNameSource k() {
        return this.f22085q;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v l(Date date, String str, String str2) {
        return o(date, str, str2);
    }

    public final void m() {
        synchronized (this.f22081m) {
            try {
                if (this.f22079k != null) {
                    this.f22079k.cancel();
                    this.f22083o.set(false);
                    this.f22079k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC0863v n(q0 q0Var, String str, String str2, Date date) {
        o0 o0Var = this.f22071b;
        if (o0Var.f22100h.get()) {
            return M.f21831a;
        }
        D9.b.t0(q0Var, "parentSpanId is required");
        m();
        o0 o0Var2 = new o0(o0Var.f22097e.f22102a, q0Var, this, str, this.f22073d, date, new l0(this));
        o0Var2.f(str2);
        this.f22072c.add(o0Var2);
        return o0Var2;
    }

    public final InterfaceC0863v o(Date date, String str, String str2) {
        o0 o0Var = this.f22071b;
        boolean z10 = o0Var.f22100h.get();
        M m2 = M.f21831a;
        if (z10) {
            return m2;
        }
        int size = this.f22072c.size();
        InterfaceC0858p interfaceC0858p = this.f22073d;
        if (size < interfaceC0858p.h().getMaxSpans()) {
            return o0Var.l(date, str, str2);
        }
        interfaceC0858p.h().getLogger().h(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return m2;
    }

    public final boolean p() {
        ArrayList arrayList = new ArrayList(this.f22072c);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((o0) it.next()).f22100h.get()) {
                return false;
            }
        }
        return true;
    }
}
