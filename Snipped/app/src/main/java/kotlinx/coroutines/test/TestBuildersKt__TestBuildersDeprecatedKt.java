package kotlinx.coroutines.test;

import O9.p;
import P9.D;
import ca.InterfaceC0650p;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: TestBuildersDeprecated.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u00032\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\b\u0010\r\u001a7\u0010\b\u001a\u00020\u0005*\u00020\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a7\u0010\b\u001a\u00020\u0005*\u00020\u000f2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0010\u001aG\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0016\u001a\u00060\u0005j\u0002`\u0015*\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/coroutines/d;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "LT9/a;", "LO9/p;", "", "testBody", "runBlockingTest", "(Lkotlin/coroutines/d;Lca/p;)V", "Lkotlinx/coroutines/test/TestScope;", "runBlockingTestOnTestScope", "block", "(Lkotlinx/coroutines/test/TestCoroutineScope;Lca/p;)V", "(Lkotlinx/coroutines/test/TestScope;Lca/p;)V", "Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "(Lkotlinx/coroutines/test/TestCoroutineDispatcher;Lca/p;)V", "", "dispatchTimeoutMs", "runTestWithLegacyScope", "(Lkotlin/coroutines/d;JLca/p;)V", "Lkotlinx/coroutines/test/TestResult;", "runTest", "(Lkotlinx/coroutines/test/TestCoroutineScope;JLca/p;)V", "kotlinx-coroutines-test"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/test/TestBuildersKt")
/* loaded from: classes2.dex */
final /* synthetic */ class TestBuildersKt__TestBuildersDeprecatedKt {
    public static final void runBlockingTest(kotlin.coroutines.d dVar, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        Deferred async$default;
        TestCoroutineScope createTestCoroutineScope = TestCoroutineScopeKt.createTestCoroutineScope(new TestCoroutineDispatcher(null, 1, 0 == true ? 1 : 0).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(dVar));
        TestCoroutineScheduler testScheduler = createTestCoroutineScope.getTestScheduler();
        async$default = BuildersKt__Builders_commonKt.async$default(createTestCoroutineScope, null, null, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(interfaceC0650p, createTestCoroutineScope, null), 3, null);
        testScheduler.advanceUntilIdle();
        Throwable completionExceptionOrNull = async$default.getCompletionExceptionOrNull();
        if (completionExceptionOrNull != null) {
            throw completionExceptionOrNull;
        }
        createTestCoroutineScope.mo181cleanupTestCoroutines();
    }

    public static /* synthetic */ void runBlockingTest$default(kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        TestBuildersKt.runBlockingTest(dVar, (InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }

    public static final void runBlockingTestOnTestScope(kotlin.coroutines.d dVar, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        Throwable th;
        List<Throwable> list;
        kotlin.coroutines.d plus = new TestCoroutineDispatcher(null, 1, 0 == true ? 1 : 0).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(dVar);
        Set<Job> activeJobs = TestCoroutineScopeKt.activeJobs(plus);
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(TestScopeKt.TestScope(plus));
        asSpecificImplementation.enter();
        asSpecificImplementation.start(CoroutineStart.UNDISPATCHED, asSpecificImplementation, new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTestOnTestScope$1(interfaceC0650p, asSpecificImplementation, null));
        asSpecificImplementation.getTestScheduler().advanceUntilIdle();
        try {
            th = asSpecificImplementation.getCompletionExceptionOrNull();
        } catch (IllegalStateException unused) {
            th = null;
        }
        CoroutineScopeKt.cancel$default(asSpecificImplementation.getBackgroundScope(), null, 1, null);
        asSpecificImplementation.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new b(0));
        if (th != null) {
            try {
                list = asSpecificImplementation.legacyLeave();
            } catch (UncompletedCoroutinesError unused2) {
                list = EmptyList.f23104a;
            }
            TestBuildersKt.throwAll(th, list);
        } else {
            TestBuildersKt.throwAll(null, asSpecificImplementation.legacyLeave());
            Set n10 = D.n(TestCoroutineScopeKt.activeJobs(plus), activeJobs);
            if (!n10.isEmpty()) {
                throw new UncompletedCoroutinesError("Some jobs were not completed at the end of the test: " + n10);
            }
        }
    }

    public static /* synthetic */ void runBlockingTestOnTestScope$default(kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        TestBuildersKt.runBlockingTestOnTestScope(dVar, interfaceC0650p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean runBlockingTestOnTestScope$lambda$1$TestBuildersKt__TestBuildersDeprecatedKt() {
        return false;
    }

    @ExperimentalCoroutinesApi
    public static final void runTest(TestCoroutineScope testCoroutineScope, long j10, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt.runTestWithLegacyScope(testCoroutineScope.getCoroutineContext(), j10, interfaceC0650p);
    }

    public static /* synthetic */ void runTest$default(TestCoroutineScope testCoroutineScope, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            j10 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTest(testCoroutineScope, j10, (InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final void runTestWithLegacyScope(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (dVar.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(new TestBodyCoroutine(TestCoroutineScopeKt.createTestCoroutineScope(dVar.plus(runningInRunTest))), j10, interfaceC0650p, null));
    }

    public static /* synthetic */ void runTestWithLegacyScope$default(kotlin.coroutines.d dVar, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        if ((i & 2) != 0) {
            j10 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTestWithLegacyScope(dVar, j10, interfaceC0650p);
    }

    public static final void runBlockingTest(TestCoroutineScope testCoroutineScope, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt.runBlockingTest(testCoroutineScope.getCoroutineContext(), interfaceC0650p);
    }

    public static final void runBlockingTest(TestScope testScope, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt.runBlockingTestOnTestScope(testScope.getCoroutineContext(), interfaceC0650p);
    }

    public static final void runBlockingTest(TestCoroutineDispatcher testCoroutineDispatcher, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt.runBlockingTest((kotlin.coroutines.d) testCoroutineDispatcher, interfaceC0650p);
    }
}
