package kotlinx.coroutines;

import O9.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.d;

@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return JobKt__JobKt.Job(job);
    }

    public static final Object cancelAndJoin(Job job, T9.a<? super p> aVar) {
        return JobKt__JobKt.cancelAndJoin(job, aVar);
    }

    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(d dVar) {
        JobKt__JobKt.ensureActive(dVar);
    }

    public static final Job getJob(d dVar) {
        return JobKt__JobKt.getJob(dVar);
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z10, JobNode jobNode) {
        return JobKt__JobKt.invokeOnCompletion(job, z10, jobNode);
    }

    public static final boolean isActive(d dVar) {
        return JobKt__JobKt.isActive(dVar);
    }

    public static final void cancel(d dVar, CancellationException cancellationException) {
        JobKt__JobKt.cancel(dVar, cancellationException);
    }

    public static final void ensureActive(Job job) {
        JobKt__JobKt.ensureActive(job);
    }

    public static final void cancel(Job job, String str, Throwable th) {
        JobKt__JobKt.cancel(job, str, th);
    }

    public static final void cancelChildren(d dVar, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(dVar, cancellationException);
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(job, cancellationException);
    }
}
