package kotlinx.coroutines.selects;

import O9.p;
import T9.a;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: SelectOld.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a2\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0081H¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0081H¢\u0006\u0004\b\u0007\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "LO9/p;", "builder", "selectOld", "(Lca/l;LT9/a;)Ljava/lang/Object;", "selectUnbiasedOld", "T", "Lkotlinx/coroutines/CancellableContinuation;", "result", "resumeUndispatched", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "", "exception", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t3) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t3);
        } else {
            cancellableContinuation.resumeWith(t3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.INSTANCE);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th);
        } else {
            cancellableContinuation.resumeWith(new Result.Failure(th));
        }
    }

    public static final <R> Object selectOld(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(aVar);
        try {
            interfaceC0646l.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }

    private static final <R> Object selectOld$$forInline(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(aVar);
        try {
            interfaceC0646l.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return result;
    }

    public static final <R> Object selectUnbiasedOld(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(aVar);
        try {
            interfaceC0646l.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object initSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return initSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(InterfaceC0646l<? super SelectBuilder<? super R>, p> interfaceC0646l, a<? super R> aVar) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(aVar);
        try {
            interfaceC0646l.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object initSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return initSelectResult;
    }
}
