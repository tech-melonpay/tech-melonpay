package t0;

import android.os.CancellationSignal;
import k1.AbstractC0919C;

/* compiled from: CancellationSignal.java */
@Deprecated
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27395a;

    /* renamed from: b, reason: collision with root package name */
    public a f27396b;

    /* renamed from: c, reason: collision with root package name */
    public CancellationSignal f27397c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27398d;

    /* compiled from: CancellationSignal.java */
    public interface a {
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f27395a) {
                    return;
                }
                this.f27395a = true;
                this.f27398d = true;
                a aVar = this.f27396b;
                CancellationSignal cancellationSignal = this.f27397c;
                if (aVar != null) {
                    try {
                        M.b bVar = (M.b) aVar;
                        Runnable runnable = (Runnable) bVar.f2503b;
                        if (runnable == null) {
                            ((AbstractC0919C) bVar.i).cancel();
                            ((Runnable) bVar.f2504j).run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f27398d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f27398d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
