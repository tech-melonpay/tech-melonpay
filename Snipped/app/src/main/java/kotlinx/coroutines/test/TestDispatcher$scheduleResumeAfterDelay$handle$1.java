package kotlinx.coroutines.test;

import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TestDispatcher.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class TestDispatcher$scheduleResumeAfterDelay$handle$1 extends FunctionReferenceImpl implements InterfaceC0646l<CancellableContinuationRunnable, Boolean> {
    public static final TestDispatcher$scheduleResumeAfterDelay$handle$1 INSTANCE = new TestDispatcher$scheduleResumeAfterDelay$handle$1();

    public TestDispatcher$scheduleResumeAfterDelay$handle$1() {
        super(1, TestDispatcherKt.class, "cancellableRunnableIsCancelled", "cancellableRunnableIsCancelled(Lkotlinx/coroutines/test/CancellableContinuationRunnable;)Z", 1);
    }

    @Override // ca.InterfaceC0646l
    public final Boolean invoke(CancellableContinuationRunnable cancellableContinuationRunnable) {
        boolean cancellableRunnableIsCancelled;
        cancellableRunnableIsCancelled = TestDispatcherKt.cancellableRunnableIsCancelled(cancellableContinuationRunnable);
        return Boolean.valueOf(cancellableRunnableIsCancelled);
    }
}
