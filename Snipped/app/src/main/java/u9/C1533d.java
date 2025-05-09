package u9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import c.RunnableC0615f;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0863v;
import io.sentry.InterfaceC0864w;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.u0;
import io.sentry.v0;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import u9.C1531b;

/* compiled from: ActivityLifecycleIntegration.java */
/* renamed from: u9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1533d implements InterfaceC0867z, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f30398a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0858p f30399b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f30400c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30402e;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30405h;
    public InterfaceC0863v i;

    /* renamed from: k, reason: collision with root package name */
    public final C1531b f30407k;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30401d = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30403f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30404g = false;

    /* renamed from: j, reason: collision with root package name */
    public final WeakHashMap<Activity, InterfaceC0864w> f30406j = new WeakHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.importance != 100) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1533d(android.app.Application r4, u9.o r5, u9.C1531b r6) {
        /*
            r3 = this;
            r3.<init>()
            r5 = 0
            r3.f30401d = r5
            r3.f30403f = r5
            r3.f30404g = r5
            r3.f30405h = r5
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.f30406j = r0
            r3.f30398a = r4
            r3.f30407k = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 1
            if (r6 < r0) goto L20
            r3.f30402e = r1
        L20:
            java.lang.String r6 = "activity"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch: java.lang.Throwable -> L51
            boolean r6 = r4 instanceof android.app.ActivityManager     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L51
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Throwable -> L51
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L51
            int r6 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51
        L3a:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L51
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Throwable -> L51
            int r2 = r0.pid     // Catch: java.lang.Throwable -> L51
            if (r2 != r6) goto L3a
            int r4 = r0.importance     // Catch: java.lang.Throwable -> L51
            r6 = 100
            if (r4 != r6) goto L51
            r5 = r1
        L51:
            r3.f30405h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.C1533d.<init>(android.app.Application, u9.o, u9.b):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30398a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f30400c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C1531b c1531b = this.f30407k;
        synchronized (c1531b) {
            try {
                if (c1531b.b()) {
                    c1531b.c(new RunnableC0615f(c1531b, 27), "FrameMetricsAggregator.stop");
                    FrameMetricsAggregator.a aVar = c1531b.f30388a.f6473a;
                    SparseIntArray[] sparseIntArrayArr = aVar.f6477b;
                    aVar.f6477b = new SparseIntArray[9];
                }
                c1531b.f30390c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        C0855m c0855m = C0855m.f22069a;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30400c = sentryAndroidOptions;
        this.f30399b = c0855m;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f30400c.isEnableActivityLifecycleBreadcrumbs()));
        SentryAndroidOptions sentryAndroidOptions2 = this.f30400c;
        this.f30401d = sentryAndroidOptions2.isTracingEnabled() && sentryAndroidOptions2.isEnableAutoActivityLifecycleTracing();
        if (this.f30400c.isEnableActivityLifecycleBreadcrumbs() || this.f30401d) {
            this.f30398a.registerActivityLifecycleCallbacks(this);
            this.f30400c.getLogger().h(sentryLevel, "ActivityLifecycleIntegration installed.", new Object[0]);
        }
    }

    public final void i(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f30400c;
        if (sentryAndroidOptions == null || this.f30399b == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        C0844b c0844b = new C0844b();
        c0844b.f21964c = "navigation";
        c0844b.a(str, "state");
        c0844b.a(activity.getClass().getSimpleName(), "screen");
        c0844b.f21966e = "ui.lifecycle";
        c0844b.f21967f = SentryLevel.INFO;
        C0852j c0852j = new C0852j();
        c0852j.a(activity, "android:activity");
        this.f30399b.e(c0844b, c0852j);
    }

    public final void j(InterfaceC0864w interfaceC0864w) {
        if (interfaceC0864w == null || interfaceC0864w.b()) {
            return;
        }
        SpanStatus status = interfaceC0864w.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        interfaceC0864w.c(status);
        InterfaceC0858p interfaceC0858p = this.f30399b;
        if (interfaceC0858p != null) {
            interfaceC0858p.f(new C1532c(this, interfaceC0864w, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f30403f) {
            n nVar = n.f30446e;
            boolean z10 = bundle == null;
            synchronized (nVar) {
                if (nVar.f30449c == null) {
                    nVar.f30449c = Boolean.valueOf(z10);
                }
            }
        }
        i(activity, "created");
        p(activity);
        this.f30403f = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            i(activity, "destroyed");
            InterfaceC0863v interfaceC0863v = this.i;
            if (interfaceC0863v != null && !interfaceC0863v.b()) {
                this.i.c(SpanStatus.CANCELLED);
            }
            y(activity, true);
            this.i = null;
            if (this.f30401d) {
                this.f30406j.remove(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        i(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPostResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.f30402e && (sentryAndroidOptions = this.f30400c) != null) {
            y(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions;
        InterfaceC0863v interfaceC0863v;
        try {
            if (!this.f30404g) {
                if (this.f30405h) {
                    n nVar = n.f30446e;
                    synchronized (nVar) {
                        nVar.f30448b = Long.valueOf(SystemClock.uptimeMillis());
                    }
                } else {
                    SentryAndroidOptions sentryAndroidOptions2 = this.f30400c;
                    if (sentryAndroidOptions2 != null) {
                        sentryAndroidOptions2.getLogger().h(SentryLevel.DEBUG, "App Start won't be reported because Process wasn't of foregroundImportance.", new Object[0]);
                    }
                }
                if (this.f30401d && (interfaceC0863v = this.i) != null) {
                    interfaceC0863v.d();
                }
                this.f30404g = true;
            }
            i(activity, "resumed");
            if (!this.f30402e && (sentryAndroidOptions = this.f30400c) != null) {
                y(activity, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        C1531b c1531b = this.f30407k;
        synchronized (c1531b) {
            if (c1531b.b()) {
                c1531b.c(new RunnableC1530a(c1531b, activity, 0), "FrameMetricsAggregator.add");
                C1531b.a a10 = c1531b.a();
                if (a10 != null) {
                    c1531b.f30391d.put(activity, a10);
                }
            }
        }
        i(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        i(activity, "stopped");
    }

    public final void p(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        if (this.f30401d) {
            WeakHashMap<Activity, InterfaceC0864w> weakHashMap = this.f30406j;
            if (weakHashMap.containsKey(activity) || this.f30399b == null) {
                return;
            }
            Iterator<Map.Entry<Activity, InterfaceC0864w>> it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                j(it.next().getValue());
            }
            String simpleName = activity.getClass().getSimpleName();
            Date date = this.f30405h ? n.f30446e.f30450d : null;
            Boolean bool = n.f30446e.f30449c;
            v0 v0Var = new v0();
            v0Var.f22212b = true;
            v0Var.f22215e = new M.b(this, weakReference, simpleName, 9);
            if (!this.f30403f && date != null && bool != null) {
                v0Var.f22211a = date;
            }
            InterfaceC0864w d10 = this.f30399b.d(new u0(simpleName, TransactionNameSource.COMPONENT, "ui.load"), v0Var);
            if (!this.f30403f && date != null && bool != null) {
                this.i = d10.l(date, bool.booleanValue() ? "app.start.cold" : "app.start.warm", bool.booleanValue() ? "Cold Start" : "Warm Start");
            }
            this.f30399b.f(new C1532c(this, d10, 0));
            weakHashMap.put(activity, d10);
        }
    }

    public final void y(Activity activity, boolean z10) {
        if (this.f30401d && z10) {
            j(this.f30406j.get(activity));
        }
    }
}
