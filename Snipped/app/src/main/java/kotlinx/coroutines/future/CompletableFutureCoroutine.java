package kotlinx.coroutines.future;

import O9.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;

/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/future/CompletableFutureCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljava/util/function/BiFunction;", "", "LO9/p;", "Lkotlin/coroutines/d;", "context", "Ljava/util/concurrent/CompletableFuture;", "future", "<init>", "(Lkotlin/coroutines/d;Ljava/util/concurrent/CompletableFuture;)V", "value", "exception", "apply", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "onCompleted", "(Ljava/lang/Object;)V", "cause", "", "handled", "onCancelled", "(Ljava/lang/Throwable;Z)V", "Ljava/util/concurrent/CompletableFuture;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, p> {
    private final CompletableFuture<T> future;

    public CompletableFutureCoroutine(d dVar, CompletableFuture<T> completableFuture) {
        super(dVar, true, true);
        this.future = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ p apply(Object obj, Throwable th) {
        apply2((CompletableFutureCoroutine<T>) obj, th);
        return p.f3034a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable cause, boolean handled) {
        this.future.completeExceptionally(cause);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T value) {
        this.future.complete(value);
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T value, Throwable exception) {
        Job.DefaultImpls.cancel$default((Job) this, (CancellationException) null, 1, (Object) null);
    }
}
