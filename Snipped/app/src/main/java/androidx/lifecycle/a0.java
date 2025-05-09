package androidx.lifecycle;

import ca.InterfaceC0646l;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final Object a(final Lifecycle lifecycle, boolean z10, final MainCoroutineDispatcher mainCoroutineDispatcher, TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1 transactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1, T9.a aVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        final Z z11 = new Z(lifecycle, cancellableContinuationImpl, transactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1);
        if (z10) {
            mainCoroutineDispatcher.mo168dispatch(EmptyCoroutineContext.f23155a, new Y(lifecycle, z11, 1));
        } else {
            lifecycle.a(z11);
        }
        cancellableContinuationImpl.invokeOnCancellation(new InterfaceC0646l<Throwable, O9.p>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final O9.p invoke(Throwable th) {
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23155a;
                CoroutineDispatcher coroutineDispatcher = mainCoroutineDispatcher;
                boolean isDispatchNeeded = coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext);
                Z z12 = z11;
                Lifecycle lifecycle2 = lifecycle;
                if (isDispatchNeeded) {
                    coroutineDispatcher.mo168dispatch(emptyCoroutineContext, new Y(lifecycle2, z12, 0));
                } else {
                    lifecycle2.c(z12);
                }
                return O9.p.f3034a;
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }
}
