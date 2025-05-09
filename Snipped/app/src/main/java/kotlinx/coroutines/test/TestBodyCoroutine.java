package kotlinx.coroutines.test;

import O9.p;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;

/* compiled from: TestBuildersDeprecated.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/test/TestBodyCoroutine;", "Lkotlinx/coroutines/AbstractCoroutine;", "LO9/p;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "testScope", "<init>", "(Lkotlinx/coroutines/test/TestCoroutineScope;)V", "", "cleanupTestCoroutines", "()Ljava/lang/Void;", "cleanup", "()V", "", "tryGetCompletionCause", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "testScheduler", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TestBodyCoroutine extends AbstractCoroutine<p> implements TestCoroutineScope {
    private final TestCoroutineScope testScope;

    public TestBodyCoroutine(TestCoroutineScope testCoroutineScope) {
        super(testCoroutineScope.getCoroutineContext(), true, true);
        this.testScope = testCoroutineScope;
    }

    public final void cleanup() {
        this.testScope.mo181cleanupTestCoroutines();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        return this.testScope.getTestScheduler();
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    /* renamed from: cleanupTestCoroutines, reason: merged with bridge method [inline-methods] */
    public Void mo181cleanupTestCoroutines() {
        throw new UnsupportedOperationException("Calling `cleanupTestCoroutines` inside `runTest` is prohibited: it will be called at the end of the test in any case.");
    }
}
