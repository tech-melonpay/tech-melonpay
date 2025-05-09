package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes.dex */
public final class Z implements InterfaceC0550p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f7067a = Lifecycle.State.f6979e;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f7068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Object> f7069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<Object> f7070d;

    public Z(Lifecycle lifecycle, CancellableContinuationImpl cancellableContinuationImpl, TransactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1 transactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1) {
        this.f7068b = lifecycle;
        this.f7069c = cancellableContinuationImpl;
        this.f7070d = transactionPayloadFragment$onQueryTextChange$1$invokeSuspend$$inlined$withResumed$1;
    }

    @Override // androidx.lifecycle.InterfaceC0550p
    public final void d(r rVar, Lifecycle.Event event) {
        Object failure;
        Lifecycle.Event.INSTANCE.getClass();
        int ordinal = this.f7067a.ordinal();
        Lifecycle.Event event2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
        CancellableContinuation<Object> cancellableContinuation = this.f7069c;
        Lifecycle lifecycle = this.f7068b;
        if (event != event2) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                lifecycle.c(this);
                cancellableContinuation.resumeWith(new Result.Failure(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        lifecycle.c(this);
        try {
            failure = this.f7070d.invoke();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        cancellableContinuation.resumeWith(failure);
    }
}
