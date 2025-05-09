package io.sentry;

import io.sentry.m0;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Span.java */
/* loaded from: classes2.dex */
public final class o0 implements InterfaceC0863v {

    /* renamed from: a, reason: collision with root package name */
    public final Date f22093a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f22094b;

    /* renamed from: c, reason: collision with root package name */
    public Long f22095c;

    /* renamed from: d, reason: collision with root package name */
    public Double f22096d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f22097e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f22098f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0858p f22099g;
    public l0 i;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f22100h = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f22101j = new ConcurrentHashMap();

    public o0(H9.g gVar, q0 q0Var, m0 m0Var, String str, InterfaceC0858p interfaceC0858p, Date date, l0 l0Var) {
        this.f22097e = new p0(gVar, new q0(), str, q0Var, m0Var.f22071b.f22097e.f22105d);
        this.f22098f = m0Var;
        D9.b.t0(interfaceC0858p, "hub is required");
        this.f22099g = interfaceC0858p;
        this.i = l0Var;
        if (date != null) {
            this.f22093a = date;
            this.f22094b = null;
        } else {
            this.f22093a = I.n();
            this.f22094b = Long.valueOf(System.nanoTime());
        }
    }

    @Override // io.sentry.InterfaceC0863v
    public final boolean b() {
        return this.f22100h.get();
    }

    @Override // io.sentry.InterfaceC0863v
    public final void c(SpanStatus spanStatus) {
        m(spanStatus, Double.valueOf(I.n().getTime() / 1000.0d), null);
    }

    @Override // io.sentry.InterfaceC0863v
    public final void d() {
        c(this.f22097e.f22108g);
    }

    @Override // io.sentry.InterfaceC0863v
    public final void f(String str) {
        if (this.f22100h.get()) {
            return;
        }
        this.f22097e.f22107f = str;
    }

    @Override // io.sentry.InterfaceC0863v
    public final SpanStatus getStatus() {
        return this.f22097e.f22108g;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v h(String str) {
        if (this.f22100h.get()) {
            return M.f21831a;
        }
        InterfaceC0863v n10 = this.f22098f.n(this.f22097e.f22103b, "ui.load", null, null);
        n10.f(str);
        return n10;
    }

    @Override // io.sentry.InterfaceC0863v
    public final p0 j() {
        return this.f22097e;
    }

    @Override // io.sentry.InterfaceC0863v
    public final InterfaceC0863v l(Date date, String str, String str2) {
        if (this.f22100h.get()) {
            return M.f21831a;
        }
        return this.f22098f.n(this.f22097e.f22103b, str, str2, date);
    }

    public final void m(SpanStatus spanStatus, Double d10, Long l10) {
        if (this.f22100h.compareAndSet(false, true)) {
            this.f22097e.f22108g = spanStatus;
            this.f22096d = d10;
            l0 l0Var = this.i;
            if (l0Var != null) {
                m0 m0Var = l0Var.f22068a;
                m0.b bVar = m0Var.f22076g;
                if (m0Var.f22078j != null) {
                    if (!m0Var.f22075f || m0Var.p()) {
                        m0Var.i();
                    }
                } else if (bVar.f22089a) {
                    m0Var.c(bVar.f22090b);
                }
            }
            this.f22095c = Long.valueOf(l10 == null ? System.nanoTime() : l10.longValue());
        }
    }

    public final Double n(Long l10) {
        Double valueOf = (this.f22094b == null || l10 == null) ? null : Double.valueOf((l10.longValue() - r1.longValue()) / 1000000.0d);
        if (valueOf != null) {
            return Double.valueOf((valueOf.doubleValue() + this.f22093a.getTime()) / 1000.0d);
        }
        Double d10 = this.f22096d;
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    public o0(u0 u0Var, m0 m0Var, InterfaceC0858p interfaceC0858p, Date date) {
        this.f22097e = u0Var;
        D9.b.t0(m0Var, "sentryTracer is required");
        this.f22098f = m0Var;
        D9.b.t0(interfaceC0858p, "hub is required");
        this.f22099g = interfaceC0858p;
        this.i = null;
        if (date != null) {
            this.f22093a = date;
            this.f22094b = null;
        } else {
            this.f22093a = I.n();
            this.f22094b = Long.valueOf(System.nanoTime());
        }
    }
}
