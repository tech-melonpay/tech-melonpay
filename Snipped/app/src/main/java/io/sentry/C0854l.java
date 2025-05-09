package io.sentry;

import io.sentry.Session;
import io.sentry.U;
import io.sentry.clientreport.DiscardReason;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.r0;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: Hub.java */
/* renamed from: io.sentry.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0854l implements InterfaceC0858p {

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f22063a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f22064b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f22065c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f22066d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Throwable, J9.c<WeakReference<InterfaceC0863v>, String>> f22067e = Collections.synchronizedMap(new WeakHashMap());

    public C0854l(SentryOptions sentryOptions, r0 r0Var) {
        D9.b.t0(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
        this.f22063a = sentryOptions;
        this.f22066d = new t0(sentryOptions);
        this.f22065c = r0Var;
        H9.g gVar = H9.g.f1604b;
        this.f22064b = true;
    }

    @Override // io.sentry.InterfaceC0858p
    public final void a(long j10) {
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f22065c.a().f22190b.a(j10);
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g c(B1.f fVar, C0852j c0852j) {
        H9.g gVar = H9.g.f1604b;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return gVar;
        }
        try {
            H9.g c2 = this.f22065c.a().f22190b.c(fVar, c0852j);
            return c2 != null ? c2 : gVar;
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error while capturing envelope.", th);
            return gVar;
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final void close() {
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC0867z interfaceC0867z : this.f22063a.getIntegrations()) {
                if (interfaceC0867z instanceof Closeable) {
                    ((Closeable) interfaceC0867z).close();
                }
            }
            this.f22063a.getExecutorService().a(this.f22063a.getShutdownTimeoutMillis());
            this.f22065c.a().f22190b.close();
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error while closing the Hub.", th);
        }
        this.f22064b = false;
    }

    @Override // io.sentry.InterfaceC0858p
    public final InterfaceC0864w d(u0 u0Var, v0 v0Var) {
        Fa.h hVar;
        m0 m0Var;
        Date date = v0Var.f22211a;
        boolean z10 = v0Var.f22212b;
        Long l10 = v0Var.f22213c;
        boolean z11 = v0Var.f22214d;
        M.b bVar = v0Var.f22215e;
        boolean z12 = this.f22064b;
        N n10 = N.f21832a;
        if (!z12) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            return n10;
        }
        if (!this.f22063a.isTracingEnabled()) {
            this.f22063a.getLogger().h(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            return n10;
        }
        t0 t0Var = this.f22066d;
        t0Var.getClass();
        Fa.h hVar2 = u0Var.f22105d;
        if (hVar2 == null) {
            SentryOptions sentryOptions = t0Var.f22202a;
            sentryOptions.getProfilesSampler();
            Double profilesSampleRate = sentryOptions.getProfilesSampleRate();
            Boolean valueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= t0Var.f22203b.nextDouble());
            sentryOptions.getTracesSampler();
            Double tracesSampleRate = sentryOptions.getTracesSampleRate();
            if (tracesSampleRate != null) {
                hVar = new Fa.h(Boolean.valueOf(tracesSampleRate.doubleValue() >= t0Var.f22203b.nextDouble()), tracesSampleRate, valueOf);
                u0Var.f22105d = hVar;
                m0Var = new m0(u0Var, this, date, z10, l10, z11, bVar);
                if (((Boolean) hVar.f1299b).booleanValue() && ((Boolean) hVar.f1301d).booleanValue()) {
                    this.f22063a.getTransactionProfiler().g(m0Var);
                }
                return m0Var;
            }
            Boolean bool = Boolean.FALSE;
            hVar2 = new Fa.h(bool, (Double) null, bool);
        }
        hVar = hVar2;
        u0Var.f22105d = hVar;
        m0Var = new m0(u0Var, this, date, z10, l10, z11, bVar);
        if (((Boolean) hVar.f1299b).booleanValue()) {
            this.f22063a.getTransactionProfiler().g(m0Var);
        }
        return m0Var;
    }

    @Override // io.sentry.InterfaceC0858p
    public final void e(C0844b c0844b, C0852j c0852j) {
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
            return;
        }
        U u6 = this.f22065c.a().f22191c;
        u6.getClass();
        SentryOptions sentryOptions = u6.f21904k;
        sentryOptions.getBeforeBreadcrumb();
        ((SynchronizedCollection) u6.f21901g).add(c0844b);
        if (sentryOptions.isEnableScopeSync()) {
            Iterator<r> it = sentryOptions.getScopeObservers().iterator();
            while (it.hasNext()) {
                it.next().b(c0844b);
            }
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final void f(V v10) {
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            v10.c(this.f22065c.a().f22191c);
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g g(H9.m mVar, s0 s0Var, C0852j c0852j) {
        H9.g gVar = H9.g.f1604b;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return gVar;
        }
        if (mVar.f1648q == null) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", mVar.f21917a);
            return gVar;
        }
        Boolean bool = Boolean.TRUE;
        p0 a10 = mVar.f21918b.a();
        Fa.h hVar = a10 == null ? null : a10.f22105d;
        if (!bool.equals(Boolean.valueOf(hVar != null ? ((Boolean) hVar.f1299b).booleanValue() : false))) {
            this.f22063a.getLogger().h(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", mVar.f21917a);
            this.f22063a.getClientReportRecorder().a(DiscardReason.SAMPLE_RATE, DataCategory.Transaction);
            return gVar;
        }
        try {
            r0.a a11 = this.f22065c.a();
            return a11.f22190b.e(mVar, s0Var, a11.f22191c, c0852j);
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error while capturing transaction with id: " + mVar.f21917a, th);
            return gVar;
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final SentryOptions h() {
        return this.f22065c.a().f22189a;
    }

    @Override // io.sentry.InterfaceC0858p
    public final boolean isEnabled() {
        return this.f22064b;
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g j(Throwable th, C0852j c0852j) {
        H9.g gVar = H9.g.f1604b;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
            return gVar;
        }
        if (th == null) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
            return gVar;
        }
        try {
            r0.a a10 = this.f22065c.a();
            i0 i0Var = new i0(th);
            o(i0Var);
            return a10.f22190b.d(i0Var, a10.f22191c, c0852j);
        } catch (Throwable th2) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            return gVar;
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final void l() {
        Session session;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        r0.a a10 = this.f22065c.a();
        U u6 = a10.f22191c;
        synchronized (u6.f21906m) {
            try {
                session = null;
                if (u6.f21905l != null) {
                    Session session2 = u6.f21905l;
                    session2.getClass();
                    session2.b(I.n());
                    Session clone = u6.f21905l.clone();
                    u6.f21905l = null;
                    session = clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (session != null) {
            a10.f22190b.b(session, J9.b.a(new D9.b()));
        }
    }

    @Override // io.sentry.InterfaceC0858p
    public final void m() {
        U.a aVar;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        r0.a a10 = this.f22065c.a();
        U u6 = a10.f22191c;
        synchronized (u6.f21906m) {
            try {
                if (u6.f21905l != null) {
                    Session session = u6.f21905l;
                    session.getClass();
                    session.b(I.n());
                }
                Session session2 = u6.f21905l;
                aVar = null;
                if (u6.f21904k.getRelease() != null) {
                    String distinctId = u6.f21904k.getDistinctId();
                    H9.o oVar = u6.f21898d;
                    u6.f21905l = new Session(Session.State.Ok, I.n(), I.n(), 0, distinctId, UUID.randomUUID(), Boolean.TRUE, null, null, oVar != null ? oVar.f1659e : null, null, u6.f21904k.getEnvironment(), u6.f21904k.getRelease());
                    aVar = new U.a(u6.f21905l.clone(), session2 != null ? session2.clone() : null);
                } else {
                    u6.f21904k.getLogger().h(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar == null) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (aVar.f21910a != null) {
            a10.f22190b.b(aVar.f21910a, J9.b.a(new D9.b()));
        }
        a10.f22190b.b(aVar.f21911b, J9.b.a(new D9.b()));
    }

    @Override // io.sentry.InterfaceC0858p
    public final H9.g n(i0 i0Var, C0852j c0852j) {
        H9.g gVar = H9.g.f1604b;
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return gVar;
        }
        try {
            o(i0Var);
            r0.a a10 = this.f22065c.a();
            return a10.f22190b.d(i0Var, a10.f22191c, c0852j);
        } catch (Throwable th) {
            this.f22063a.getLogger().f(SentryLevel.ERROR, "Error while capturing event with id: " + i0Var.f21917a, th);
            return gVar;
        }
    }

    public final void o(i0 i0Var) {
        if (this.f22063a.isTracingEnabled()) {
            Throwable th = i0Var.f21925j;
            if ((th instanceof ExceptionMechanismException ? ((ExceptionMechanismException) th).f21991b : th) != null) {
                if (th instanceof ExceptionMechanismException) {
                    th = ((ExceptionMechanismException) th).f21991b;
                }
                D9.b.t0(th, "throwable cannot be null");
                while (th.getCause() != null && th.getCause() != th) {
                    th = th.getCause();
                }
                if (this.f22067e.get(th) != null) {
                    i0Var.f21918b.a();
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC0858p
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0858p m93clone() {
        if (!this.f22064b) {
            this.f22063a.getLogger().h(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        SentryOptions sentryOptions = this.f22063a;
        r0 r0Var = this.f22065c;
        r0 r0Var2 = new r0(r0Var.f22188b, new r0.a((r0.a) r0Var.f22187a.getLast()));
        Iterator descendingIterator = r0Var.f22187a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            r0Var2.f22187a.push(new r0.a((r0.a) descendingIterator.next()));
        }
        return new C0854l(sentryOptions, r0Var2);
    }
}
