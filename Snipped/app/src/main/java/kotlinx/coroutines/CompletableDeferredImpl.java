package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "getCompleted", "()Ljava/lang/Object;", "await", "(LT9/a;)Ljava/lang/Object;", "value", "", "complete", "(Ljava/lang/Object;)Z", "", "exception", "completeExceptionally", "(Ljava/lang/Throwable;)Z", "getOnCancelComplete$kotlinx_coroutines_core", "()Z", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CompletableDeferredImpl<T> extends JobSupport implements CompletableDeferred<T> {
    public CompletableDeferredImpl(Job job) {
        super(true);
        initParentJob(job);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(T9.a<? super T> aVar) {
        Object awaitInternal = awaitInternal(aVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean complete(T value) {
        return makeCompleting$kotlinx_coroutines_core(value);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean completeExceptionally(Throwable exception) {
        return makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        return (SelectClause1<T>) getOnAwaitInternal();
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
