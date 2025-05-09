package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import c.RunnableC0615f;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.exception.ExceptionMechanismException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import t1.C1276a;

/* compiled from: ANRWatchDog.java */
/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21943a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0411a f21944b;

    /* renamed from: c, reason: collision with root package name */
    public final C1276a f21945c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21946d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0859q f21947e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f21948f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f21949g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f21950h;
    public final RunnableC0615f i;

    /* compiled from: ANRWatchDog.java */
    /* renamed from: io.sentry.android.core.a$a, reason: collision with other inner class name */
    public interface InterfaceC0411a {
    }

    public a(long j10, boolean z10, M.b bVar, InterfaceC0859q interfaceC0859q, Context context) {
        C1276a c1276a = new C1276a(1);
        this.f21948f = new AtomicLong(0L);
        this.f21949g = new AtomicBoolean(false);
        this.i = new RunnableC0615f(this, 26);
        this.f21943a = z10;
        this.f21944b = bVar;
        this.f21946d = j10;
        this.f21947e = interfaceC0859q;
        this.f21945c = c1276a;
        this.f21950h = context;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        InterfaceC0859q interfaceC0859q = this.f21947e;
        setName("|ANR-WatchDog|");
        while (!isInterrupted()) {
            AtomicLong atomicLong = this.f21948f;
            boolean z10 = atomicLong.get() == 0;
            long j10 = this.f21946d;
            atomicLong.addAndGet(j10);
            C1276a c1276a = this.f21945c;
            if (z10) {
                c1276a.f27406a.post(this.i);
            }
            try {
                Thread.sleep(j10);
                if (atomicLong.get() != 0) {
                    AtomicBoolean atomicBoolean = this.f21949g;
                    if (!atomicBoolean.get()) {
                        if (this.f21943a || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            ActivityManager activityManager = (ActivityManager) this.f21950h.getSystemService("activity");
                            if (activityManager != null) {
                                try {
                                    list = activityManager.getProcessesInErrorState();
                                } catch (Throwable th) {
                                    interfaceC0859q.f(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                    list = null;
                                }
                                if (list != null) {
                                    Iterator<ActivityManager.ProcessErrorStateInfo> it = list.iterator();
                                    while (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                            SentryLevel sentryLevel = SentryLevel.INFO;
                            interfaceC0859q.h(sentryLevel, "Raising ANR", new Object[0]);
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding("Application Not Responding for at least " + j10 + " ms.", c1276a.f27406a.getLooper().getThread());
                            M.b bVar = (M.b) this.f21944b;
                            ((b) bVar.f2503b).getClass();
                            ((SentryAndroidOptions) bVar.f2504j).getLogger().h(sentryLevel, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            H9.b bVar2 = new H9.b();
                            bVar2.f1570a = "ANR";
                            ((InterfaceC0858p) bVar.i).i(new ExceptionMechanismException(bVar2, applicationNotResponding, applicationNotResponding.f21938a, true));
                            atomicBoolean.set(true);
                            break;
                        }
                        interfaceC0859q.h(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        atomicBoolean.set(true);
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    interfaceC0859q.h(SentryLevel.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    interfaceC0859q.h(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }
}
