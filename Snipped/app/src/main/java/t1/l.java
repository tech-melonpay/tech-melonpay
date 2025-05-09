package t1;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import s1.AbstractC1197g;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f27446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f27448c;

    public l(m mVar, androidx.work.impl.utils.futures.a aVar, String str) {
        this.f27448c = mVar;
        this.f27446a = aVar;
        this.f27447b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f27447b;
        m mVar = this.f27448c;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f27446a.get();
                if (aVar == null) {
                    AbstractC1197g.c().b(m.f27449s, mVar.f27453d.f245c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                } else {
                    AbstractC1197g.c().a(m.f27449s, String.format("%s returned a %s result.", mVar.f27453d.f245c, aVar), new Throwable[0]);
                    mVar.f27456g = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                AbstractC1197g.c().b(m.f27449s, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e11) {
                AbstractC1197g.c().d(m.f27449s, str + " was cancelled", e11);
            } catch (ExecutionException e12) {
                e = e12;
                AbstractC1197g.c().b(m.f27449s, str + " failed because it threw an exception/error", e);
            }
            mVar.c();
        } catch (Throwable th) {
            mVar.c();
            throw th;
        }
    }
}
