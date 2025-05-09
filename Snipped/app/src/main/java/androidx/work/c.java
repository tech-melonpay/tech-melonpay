package androidx.work;

import O9.p;
import a3.InterfaceFutureC0509a;
import androidx.work.impl.utils.futures.AbstractFuture;
import ca.InterfaceC0646l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class c<R> implements InterfaceFutureC0509a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final Job f8130a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<R> f8131b;

    public c(CompletableJob completableJob) {
        androidx.work.impl.utils.futures.a<R> aVar = new androidx.work.impl.utils.futures.a<>();
        this.f8130a = completableJob;
        this.f8131b = aVar;
        completableJob.invokeOnCompletion(new InterfaceC0646l<Throwable, p>(this) { // from class: androidx.work.JobListenableFuture$1

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c<Object> f8084l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f8084l = this;
            }

            @Override // ca.InterfaceC0646l
            public final p invoke(Throwable th) {
                Throwable th2 = th;
                c<Object> cVar = this.f8084l;
                if (th2 == null) {
                    if (!cVar.f8131b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th2 instanceof CancellationException) {
                    cVar.f8131b.cancel(true);
                } else {
                    androidx.work.impl.utils.futures.a<Object> aVar2 = cVar.f8131b;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    aVar2.j(th2);
                }
                return p.f3034a;
            }
        });
    }

    @Override // a3.InterfaceFutureC0509a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f8131b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f8131b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f8131b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8131b.f8220a instanceof AbstractFuture.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8131b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return this.f8131b.get(j10, timeUnit);
    }
}
