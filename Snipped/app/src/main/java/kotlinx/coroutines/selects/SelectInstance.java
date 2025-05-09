package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* compiled from: Select.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/selects/SelectInstance;", "R", "", "clauseObject", "result", "", "trySelect", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "LO9/p;", "disposeOnCompletion", "(Lkotlinx/coroutines/DisposableHandle;)V", "internalResult", "selectInRegistrationPhase", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "context", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface SelectInstance<R> {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    d getContext();

    void selectInRegistrationPhase(Object internalResult);

    boolean trySelect(Object clauseObject, Object result);
}
