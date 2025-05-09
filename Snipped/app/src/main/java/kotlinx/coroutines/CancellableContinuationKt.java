package kotlinx.coroutines;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00040\u0007H\u0086H¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00040\u0007H\u0080H¢\u0006\u0004\b\f\u0010\n\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancelHandler;", "handler", "LO9/p;", "invokeOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/CancelHandler;)V", "Lkotlin/Function1;", "block", "suspendCancellableCoroutine", "(Lca/l;LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "suspendCancellableCoroutineReusable", "LT9/a;", "delegate", "getOrCreateCancellableContinuation", "(LT9/a;)Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/DisposableHandle;", "handle", "disposeOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class CancellableContinuationKt {
    @InternalCoroutinesApi
    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        invokeOnCancellation(cancellableContinuation, new DisposeOnCancel(disposableHandle));
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(T9.a<? super T> aVar) {
        if (!(aVar instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(aVar, 1);
        }
        CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) aVar).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!claimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl<>(aVar, 2);
    }

    public static final <T> void invokeOnCancellation(CancellableContinuation<? super T> cancellableContinuation, CancelHandler cancelHandler) {
        if (!(cancellableContinuation instanceof CancellableContinuationImpl)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((CancellableContinuationImpl) cancellableContinuation).invokeOnCancellationInternal$kotlinx_coroutines_core(cancelHandler);
    }

    public static final <T> Object suspendCancellableCoroutine(InterfaceC0646l<? super CancellableContinuation<? super T>, p> interfaceC0646l, T9.a<? super T> aVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        interfaceC0646l.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(InterfaceC0646l<? super CancellableContinuation<? super T>, p> interfaceC0646l, T9.a<? super T> aVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        interfaceC0646l.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(InterfaceC0646l<? super CancellableContinuationImpl<? super T>, p> interfaceC0646l, T9.a<? super T> aVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(U4.b.p(aVar));
        try {
            interfaceC0646l.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(InterfaceC0646l<? super CancellableContinuationImpl<? super T>, p> interfaceC0646l, T9.a<? super T> aVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(U4.b.p(aVar));
        try {
            interfaceC0646l.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
