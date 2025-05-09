package kotlinx.coroutines;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0006\u001a\u0004\u0018\u00010\u0004\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tH'¢\u0006\u0004\b\u0006\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004H'¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH'¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\f2\u0018\u0010\u001d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u001bj\u0002`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\f*\u00020 2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\f*\u00020 2\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001bH'¢\u0006\u0004\b%\u0010&JC\u0010%\u001a\u00020\f\"\b\b\u0001\u0010\b*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tH&¢\u0006\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006,"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "T", "LT9/a;", "value", "", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R", "Lkotlin/Function3;", "", "Lkotlin/coroutines/d;", "LO9/p;", "onCancellation", "(Ljava/lang/Object;Ljava/lang/Object;Lca/q;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "(Ljava/lang/Object;)V", "initCancellability", "()V", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "invokeOnCancellation", "(Lca/l;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "resume", "(Ljava/lang/Object;Lca/l;)V", "(Ljava/lang/Object;Lca/q;)V", "isActive", "()Z", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface CancellableContinuation<T> extends T9.a<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable cause);

    @InternalCoroutinesApi
    void completeResume(Object token);

    @Override // T9.a
    /* synthetic */ d getContext();

    @InternalCoroutinesApi
    void initCancellability();

    void invokeOnCancellation(InterfaceC0646l<? super Throwable, p> handler);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    void resume(T value, InterfaceC0646l<? super Throwable, p> onCancellation);

    <R extends T> void resume(R value, InterfaceC0651q<? super Throwable, ? super R, ? super d, p> onCancellation);

    @ExperimentalCoroutinesApi
    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t3);

    @ExperimentalCoroutinesApi
    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    @Override // T9.a
    /* synthetic */ void resumeWith(Object obj);

    @InternalCoroutinesApi
    Object tryResume(T value, Object idempotent);

    @InternalCoroutinesApi
    <R extends T> Object tryResume(R value, Object idempotent, InterfaceC0651q<? super Throwable, ? super R, ? super d, p> onCancellation);

    @InternalCoroutinesApi
    Object tryResumeWithException(Throwable exception);
}
