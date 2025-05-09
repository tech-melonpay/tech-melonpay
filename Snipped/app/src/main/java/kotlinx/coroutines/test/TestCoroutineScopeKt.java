package kotlinx.coroutines.test;

import ja.e;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: TestCoroutineScope.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\f\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0016\u001a\u00020\u0012*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lkotlin/coroutines/d;", "", "Lkotlinx/coroutines/Job;", "activeJobs", "(Lkotlin/coroutines/d;)Ljava/util/Set;", "context", "Lkotlinx/coroutines/test/TestCoroutineScope;", "TestCoroutineScope", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/test/TestCoroutineScope;", "createTestCoroutineScope", "LO9/p;", "advanceUntilIdle", "(Lkotlinx/coroutines/test/TestCoroutineScope;)V", "runCurrent", "Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "getDelayController", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "delayController", "", "getCurrentTime", "(Lkotlinx/coroutines/test/TestCoroutineScope;)J", "getCurrentTime$annotations", "currentTime", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineScopeKt {
    public static final TestCoroutineScope TestCoroutineScope(kotlin.coroutines.d dVar) {
        TestCoroutineScheduler testCoroutineScheduler = (TestCoroutineScheduler) dVar.get(TestCoroutineScheduler.INSTANCE);
        if (testCoroutineScheduler == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return createTestCoroutineScope(new TestCoroutineDispatcher(testCoroutineScheduler).plus(new TestCoroutineExceptionHandler()).plus(dVar));
    }

    public static /* synthetic */ TestCoroutineScope TestCoroutineScope$default(kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        return TestCoroutineScope(dVar);
    }

    public static final Set<Job> activeJobs(kotlin.coroutines.d dVar) {
        d.b bVar = dVar.get(Job.INSTANCE);
        if (bVar == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        e.a aVar = new e.a(kotlin.sequences.a.g(((Job) bVar).getChildren(), new a(3)));
        if (!aVar.hasNext()) {
            return EmptySet.f23106a;
        }
        Object next = aVar.next();
        if (!aVar.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (aVar.hasNext()) {
            linkedHashSet.add(aVar.next());
        }
        return linkedHashSet;
    }

    @ExperimentalCoroutinesApi
    public static final void advanceUntilIdle(TestCoroutineScope testCoroutineScope) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) testCoroutineScope.getCoroutineContext().get(c.a.f23157a);
        TestCoroutineDispatcher testCoroutineDispatcher = cVar instanceof TestCoroutineDispatcher ? (TestCoroutineDispatcher) cVar : null;
        if (testCoroutineDispatcher != null) {
            testCoroutineDispatcher.advanceUntilIdle();
        } else {
            testCoroutineScope.getTestScheduler().advanceUntilIdle();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, kotlinx.coroutines.test.TestCoroutineScope, kotlinx.coroutines.test.TestCoroutineScopeImpl] */
    @ExperimentalCoroutinesApi
    public static final TestCoroutineScope createTestCoroutineScope(kotlin.coroutines.d dVar) {
        kotlin.coroutines.d withDelaySkipping = TestScopeKt.withDelaySkipping(dVar);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        CoroutineExceptionHandler.Companion companion = CoroutineExceptionHandler.INSTANCE;
        CoroutineExceptionHandler testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 = new TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1(ref$ObjectRef, companion);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) withDelaySkipping.get(companion);
        if (coroutineExceptionHandler instanceof TestCoroutineExceptionHandler) {
            testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 = coroutineExceptionHandler;
        } else if (coroutineExceptionHandler != null && !(coroutineExceptionHandler instanceof TestCoroutineScopeExceptionHandler)) {
            throw new IllegalArgumentException("A CoroutineExceptionHandler was passed to TestCoroutineScope. Please pass it as an argument to a `launch` or `async` block on an already-created scope if uncaught exceptions require special treatment.");
        }
        kotlin.coroutines.d dVar2 = (Job) withDelaySkipping.get(Job.INSTANCE);
        if (dVar2 == null) {
            dVar2 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
        ?? testCoroutineScopeImpl = new TestCoroutineScopeImpl(withDelaySkipping.plus(testCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1).plus(dVar2));
        ref$ObjectRef.f23179a = testCoroutineScopeImpl;
        return testCoroutineScopeImpl;
    }

    public static /* synthetic */ TestCoroutineScope createTestCoroutineScope$default(kotlin.coroutines.d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        return createTestCoroutineScope(dVar);
    }

    public static final long getCurrentTime(TestCoroutineScope testCoroutineScope) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) testCoroutineScope.getCoroutineContext().get(c.a.f23157a);
        TestCoroutineDispatcher testCoroutineDispatcher = cVar instanceof TestCoroutineDispatcher ? (TestCoroutineDispatcher) cVar : null;
        return testCoroutineDispatcher != null ? testCoroutineDispatcher.getCurrentTime() : testCoroutineScope.getTestScheduler().getCurrentTime();
    }

    private static final TestCoroutineDispatcher getDelayController(kotlin.coroutines.d dVar) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(c.a.f23157a);
        if (cVar instanceof TestCoroutineDispatcher) {
            return (TestCoroutineDispatcher) cVar;
        }
        return null;
    }

    @ExperimentalCoroutinesApi
    public static final void runCurrent(TestCoroutineScope testCoroutineScope) {
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) testCoroutineScope.getCoroutineContext().get(c.a.f23157a);
        TestCoroutineDispatcher testCoroutineDispatcher = cVar instanceof TestCoroutineDispatcher ? (TestCoroutineDispatcher) cVar : null;
        if (testCoroutineDispatcher != null) {
            testCoroutineDispatcher.runCurrent();
        } else {
            testCoroutineScope.getTestScheduler().runCurrent();
        }
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getCurrentTime$annotations(TestCoroutineScope testCoroutineScope) {
    }
}
