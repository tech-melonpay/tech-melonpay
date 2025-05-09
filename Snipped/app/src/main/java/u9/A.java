package u9;

import io.sentry.C0852j;
import io.sentry.InterfaceC0850h;
import io.sentry.MeasurementUnit$Duration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.i0;
import io.sentry.p0;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.test.TestBuildersKt;

/* compiled from: PerformanceAndroidEventProcessor.java */
/* loaded from: classes2.dex */
public final class A implements InterfaceC0850h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30353a = false;

    /* renamed from: b, reason: collision with root package name */
    public final C1531b f30354b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f30355c;

    public A(SentryAndroidOptions sentryAndroidOptions, C1531b c1531b) {
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30355c = sentryAndroidOptions;
        this.f30354b = c1531b;
    }

    @Override // io.sentry.InterfaceC0850h
    public final synchronized H9.m i(H9.m mVar, C0852j c0852j) {
        Long valueOf;
        Long l10;
        try {
            if (!this.f30355c.isTracingEnabled()) {
                return mVar;
            }
            Map map = null;
            if (!this.f30353a) {
                Iterator it = mVar.f1649r.iterator();
                while (it.hasNext()) {
                    H9.i iVar = (H9.i) it.next();
                    if (iVar.f1614f.contentEquals("app.start.cold") || iVar.f1614f.contentEquals("app.start.warm")) {
                        n nVar = n.f30446e;
                        synchronized (nVar) {
                            try {
                                if (nVar.f30447a != null && (l10 = nVar.f30448b) != null && nVar.f30449c != null) {
                                    long longValue = l10.longValue() - nVar.f30447a.longValue();
                                    valueOf = longValue >= TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS ? null : Long.valueOf(longValue);
                                }
                            } finally {
                            }
                        }
                        if (valueOf != null) {
                            mVar.f1650s.put(nVar.f30449c.booleanValue() ? "app_start_cold" : "app_start_warm", new H9.a(Float.valueOf(valueOf.longValue()), MeasurementUnit$Duration.MILLISECOND.apiName()));
                            this.f30353a = true;
                        }
                    }
                }
            }
            H9.g gVar = mVar.f21917a;
            p0 a10 = mVar.f21918b.a();
            if (gVar != null && a10 != null && a10.f22106e.contentEquals("ui.load")) {
                C1531b c1531b = this.f30354b;
                synchronized (c1531b) {
                    if (c1531b.b()) {
                        map = (Map) c1531b.f30390c.get(gVar);
                        c1531b.f30390c.remove(gVar);
                    }
                }
                if (map != null) {
                    mVar.f1650s.putAll(map);
                }
            }
            return mVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC0850h
    public final i0 d(i0 i0Var, C0852j c0852j) {
        return i0Var;
    }
}
