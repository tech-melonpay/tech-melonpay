package ya;

import O9.p;
import java.util.logging.Level;

/* compiled from: TaskRunner.kt */
/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f31198a;

    public e(d dVar) {
        this.f31198a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1633a c2;
        long j10;
        while (true) {
            d dVar = this.f31198a;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            c cVar = c2.f31181c;
            d dVar2 = this.f31198a;
            boolean isLoggable = d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j10 = cVar.f31183a.f31190a.nanoTime();
                b.a(c2, cVar, "starting");
            } else {
                j10 = -1;
            }
            try {
                try {
                    d.a(dVar2, c2);
                    p pVar = p.f3034a;
                    if (isLoggable) {
                        b.a(c2, cVar, "finished run in ".concat(b.b(cVar.f31183a.f31190a.nanoTime() - j10)));
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (isLoggable) {
                    b.a(c2, cVar, "failed a run in ".concat(b.b(cVar.f31183a.f31190a.nanoTime() - j10)));
                }
                throw th;
            }
        }
    }
}
