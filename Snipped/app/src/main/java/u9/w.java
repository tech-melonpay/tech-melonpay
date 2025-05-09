package u9;

import androidx.lifecycle.DefaultLifecycleObserver;
import io.sentry.C0844b;
import io.sentry.InterfaceC0858p;
import io.sentry.SentryLevel;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LifecycleWatcher.java */
/* loaded from: classes2.dex */
public final class w implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f30472a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30473b;

    /* renamed from: c, reason: collision with root package name */
    public v f30474c;

    /* renamed from: d, reason: collision with root package name */
    public final Timer f30475d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f30476e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0858p f30477f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f30478g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30479h;
    public final AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    public final I9.e f30480j;

    public w(InterfaceC0858p interfaceC0858p, long j10, boolean z10, boolean z11) {
        I9.c cVar = I9.c.f1929a;
        this.f30472a = new AtomicLong(0L);
        this.f30476e = new Object();
        this.i = new AtomicBoolean();
        this.f30473b = j10;
        this.f30478g = z10;
        this.f30479h = z11;
        this.f30477f = interfaceC0858p;
        this.f30480j = cVar;
        if (z10) {
            this.f30475d = new Timer(true);
        } else {
            this.f30475d = null;
        }
    }

    public final void a(String str) {
        if (this.f30479h) {
            C0844b c0844b = new C0844b();
            c0844b.f21964c = "navigation";
            c0844b.a(str, "state");
            c0844b.f21966e = "app.lifecycle";
            c0844b.f21967f = SentryLevel.INFO;
            this.f30477f.b(c0844b);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.r rVar) {
        if (this.f30478g) {
            synchronized (this.f30476e) {
                try {
                    v vVar = this.f30474c;
                    if (vVar != null) {
                        vVar.cancel();
                        this.f30474c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            long a10 = this.f30480j.a();
            AtomicLong atomicLong = this.f30472a;
            long j10 = atomicLong.get();
            if (j10 == 0 || j10 + this.f30473b <= a10) {
                C0844b c0844b = new C0844b();
                c0844b.f21964c = "session";
                c0844b.a("start", "state");
                c0844b.f21966e = "app.lifecycle";
                c0844b.f21967f = SentryLevel.INFO;
                this.f30477f.b(c0844b);
                this.f30477f.m();
                this.i.set(true);
            }
            atomicLong.set(a10);
        }
        a("foreground");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.r rVar) {
        if (this.f30478g) {
            this.f30472a.set(this.f30480j.a());
            synchronized (this.f30476e) {
                try {
                    synchronized (this.f30476e) {
                        try {
                            v vVar = this.f30474c;
                            if (vVar != null) {
                                vVar.cancel();
                                this.f30474c = null;
                            }
                        } finally {
                        }
                    }
                    if (this.f30475d != null) {
                        v vVar2 = new v(this);
                        this.f30474c = vVar2;
                        this.f30475d.schedule(vVar2, this.f30473b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a("background");
    }
}
