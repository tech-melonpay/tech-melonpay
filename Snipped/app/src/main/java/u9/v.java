package u9;

import io.sentry.C0844b;
import io.sentry.InterfaceC0858p;
import io.sentry.SentryLevel;
import java.util.TimerTask;

/* compiled from: LifecycleWatcher.java */
/* loaded from: classes2.dex */
public final class v extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f30471a;

    public v(w wVar) {
        this.f30471a = wVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        w wVar = this.f30471a;
        wVar.getClass();
        C0844b c0844b = new C0844b();
        c0844b.f21964c = "session";
        c0844b.a("end", "state");
        c0844b.f21966e = "app.lifecycle";
        c0844b.f21967f = SentryLevel.INFO;
        InterfaceC0858p interfaceC0858p = wVar.f30477f;
        interfaceC0858p.b(c0844b);
        interfaceC0858p.l();
        wVar.i.set(false);
    }
}
