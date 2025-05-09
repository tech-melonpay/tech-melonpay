package kotlinx.coroutines.test;

import O9.p;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DelayWithTimeoutDiagnostics;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: TestDispatcher.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlinx/coroutines/test/TestDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "<init>", "()V", "", "marker", "LO9/p;", "processEvent$kotlinx_coroutines_test", "(Ljava/lang/Object;)V", "processEvent", "", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/d;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/d;)Lkotlinx/coroutines/DisposableHandle;", "Lla/c;", "timeout", "", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "timeoutMessage", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "scheduler", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class TestDispatcher extends CoroutineDispatcher implements Delay, DelayWithTimeoutDiagnostics {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeOnTimeout$lambda$0(Runnable runnable) {
        return false;
    }

    @Override // kotlinx.coroutines.Delay
    public Object delay(long j10, T9.a<? super p> aVar) {
        return Delay.DefaultImpls.delay(this, j10, aVar);
    }

    public abstract TestCoroutineScheduler getScheduler();

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, kotlin.coroutines.d context) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, timeMillis, block, context, new a(4));
    }

    public final void processEvent$kotlinx_coroutines_test(Object marker) {
        if (!(marker instanceof Runnable)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ((Runnable) marker).run();
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo169scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super p> continuation) {
        CancellableContinuationKt.disposeOnCancellation(continuation, getScheduler().registerEvent$kotlinx_coroutines_test(this, timeMillis, new CancellableContinuationRunnable(continuation, this), continuation.getContext(), TestDispatcher$scheduleResumeAfterDelay$handle$1.INSTANCE));
    }

    @Override // kotlinx.coroutines.DelayWithTimeoutDiagnostics
    /* renamed from: timeoutMessage-LRDsOJo */
    public /* synthetic */ String mo101timeoutMessageLRDsOJo(long timeout) {
        return "Timed out after " + ((Object) la.c.m(timeout)) + " of _virtual_ (kotlinx.coroutines.test) time. To use the real time, wrap 'withTimeout' in 'withContext(Dispatchers.Default.limitedParallelism(1))'";
    }
}
