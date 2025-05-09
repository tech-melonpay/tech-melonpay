package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* compiled from: TestScope.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\b\u001a\u0017\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"(\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u0005*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f\"\u001e\u0010&\u001a\u00020\"*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lkotlinx/coroutines/test/TestScope;", "LO9/p;", "advanceUntilIdle", "(Lkotlinx/coroutines/test/TestScope;)V", "runCurrent", "", "delayTimeMillis", "advanceTimeBy", "(Lkotlinx/coroutines/test/TestScope;J)V", "Lla/c;", "delayTime", "advanceTimeBy-HG0u8IE", "Lkotlin/coroutines/d;", "context", "TestScope", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/test/TestScope;", "withDelaySkipping", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "Lkotlinx/coroutines/test/TestScopeImpl;", "asSpecificImplementation", "(Lkotlinx/coroutines/test/TestScope;)Lkotlinx/coroutines/test/TestScopeImpl;", "", "catchNonTestRelatedExceptions", "Z", "getCatchNonTestRelatedExceptions", "()Z", "setCatchNonTestRelatedExceptions", "(Z)V", "getCatchNonTestRelatedExceptions$annotations", "()V", "getCurrentTime", "(Lkotlinx/coroutines/test/TestScope;)J", "getCurrentTime$annotations", "currentTime", "Lla/h;", "getTestTimeSource", "(Lkotlinx/coroutines/test/TestScope;)Lla/h;", "getTestTimeSource$annotations", "testTimeSource", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestScopeKt {
    private static boolean catchNonTestRelatedExceptions = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlinx.coroutines.test.TestScope, kotlinx.coroutines.test.TestScopeImpl] */
    public static final TestScope TestScope(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d withDelaySkipping = withDelaySkipping(dVar);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CoroutineExceptionHandler.Companion companion = CoroutineExceptionHandler.INSTANCE;
        if (((CoroutineExceptionHandler) withDelaySkipping.get(companion)) != null) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        ?? testScopeImpl = new TestScopeImpl(withDelaySkipping.plus(new TestScopeKt$TestScope$$inlined$CoroutineExceptionHandler$1(companion, ref$ObjectRef)));
        ref$ObjectRef.f23179a = testScopeImpl;
        return testScopeImpl;
    }

    public static /* synthetic */ TestScope TestScope$default(kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        return TestScope(dVar);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceTimeBy(TestScope testScope, long j10) {
        testScope.getTestScheduler().advanceTimeBy(j10);
    }

    @ExperimentalCoroutinesApi
    /* renamed from: advanceTimeBy-HG0u8IE, reason: not valid java name */
    public static final void m195advanceTimeByHG0u8IE(TestScope testScope, long j10) {
        testScope.getTestScheduler().m194advanceTimeByLRDsOJo(j10);
    }

    @ExperimentalCoroutinesApi
    public static final void advanceUntilIdle(TestScope testScope) {
        testScope.getTestScheduler().advanceUntilIdle();
    }

    public static final TestScopeImpl asSpecificImplementation(TestScope testScope) {
        if (testScope instanceof TestScopeImpl) {
            return (TestScopeImpl) testScope;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getCatchNonTestRelatedExceptions() {
        return catchNonTestRelatedExceptions;
    }

    public static final long getCurrentTime(TestScope testScope) {
        return testScope.getTestScheduler().getCurrentTime();
    }

    public static final la.h getTestTimeSource(TestScope testScope) {
        return testScope.getTestScheduler().getTimeSource();
    }

    @ExperimentalCoroutinesApi
    public static final void runCurrent(TestScope testScope) {
        testScope.getTestScheduler().runCurrent();
    }

    public static final void setCatchNonTestRelatedExceptions(boolean z10) {
        catchNonTestRelatedExceptions = z10;
    }

    public static final kotlin.coroutines.d withDelaySkipping(kotlin.coroutines.d dVar) {
        TestDispatcher StandardTestDispatcher$default;
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(c.a.f23157a);
        if (cVar instanceof TestDispatcher) {
            TestCoroutineScheduler testCoroutineScheduler = (TestCoroutineScheduler) dVar.get(TestCoroutineScheduler.INSTANCE);
            if (testCoroutineScheduler != null && ((TestDispatcher) cVar).getScheduler() != testCoroutineScheduler) {
                throw new IllegalArgumentException(("Both a TestCoroutineScheduler " + testCoroutineScheduler + " and TestDispatcher " + cVar + " linked to another scheduler were passed.").toString());
            }
            StandardTestDispatcher$default = (TestDispatcher) cVar;
        } else {
            if (cVar != null) {
                throw new IllegalArgumentException("Dispatcher must implement TestDispatcher: " + cVar);
            }
            StandardTestDispatcher$default = TestCoroutineDispatchersKt.StandardTestDispatcher$default((TestCoroutineScheduler) dVar.get(TestCoroutineScheduler.INSTANCE), null, 2, null);
        }
        return dVar.plus(StandardTestDispatcher$default).plus(StandardTestDispatcher$default.getScheduler());
    }

    public static /* synthetic */ void getCatchNonTestRelatedExceptions$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations(TestScope testScope) {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getTestTimeSource$annotations(TestScope testScope) {
    }
}
