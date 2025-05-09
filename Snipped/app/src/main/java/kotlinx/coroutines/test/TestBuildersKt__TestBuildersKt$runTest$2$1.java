package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1", f = "TestBuilders.kt", l = {339, 363, 368}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTest$2$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ TestScopeImpl $scope;
    final /* synthetic */ InterfaceC0650p<TestScope, T9.a<? super p>, Object> $testBody;
    final /* synthetic */ TestScope $this_runTest;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* compiled from: TestBuilders.kt */
    @V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1", f = "TestBuilders.kt", l = {316, 318}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/test/TestScopeImpl;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/test/TestScopeImpl;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC0650p<TestScopeImpl, T9.a<? super p>, Object> {
        final /* synthetic */ InterfaceC0650p<TestScope, T9.a<? super p>, Object> $testBody;
        final /* synthetic */ AtomicBoolean $testBodyFinished;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, AtomicBoolean atomicBoolean, T9.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.$testBody = interfaceC0650p;
            this.$testBodyFinished = atomicBoolean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$testBody, this.$testBodyFinished, aVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TestScopeImpl testScopeImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    testScopeImpl = (TestScopeImpl) this.L$0;
                    this.L$0 = testScopeImpl;
                    this.label = 1;
                    if (YieldKt.yield(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        this.$testBodyFinished.setValue(true);
                        return p.f3034a;
                    }
                    testScopeImpl = (TestScopeImpl) this.L$0;
                    kotlin.b.b(obj);
                }
                InterfaceC0650p<TestScope, T9.a<? super p>, Object> interfaceC0650p = this.$testBody;
                this.L$0 = null;
                this.label = 2;
                if (interfaceC0650p.invoke(testScopeImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.$testBodyFinished.setValue(true);
                return p.f3034a;
            } catch (Throwable th) {
                this.$testBodyFinished.setValue(true);
                throw th;
            }
        }

        @Override // ca.InterfaceC0650p
        public final Object invoke(TestScopeImpl testScopeImpl, T9.a<? super p> aVar) {
            return ((AnonymousClass1) create(testScopeImpl, aVar)).invokeSuspend(p.f3034a);
        }
    }

    /* compiled from: TestBuilders.kt */
    @V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2", f = "TestBuilders.kt", l = {359, 360}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
        final /* synthetic */ Ref$ObjectRef<CancellationException> $cancellationException;
        final /* synthetic */ TestScopeImpl $scope;
        final /* synthetic */ AtomicBoolean $testBodyFinished;
        final /* synthetic */ long $timeout;
        final /* synthetic */ Ref$ObjectRef<Throwable> $timeoutError;
        final /* synthetic */ Job $workRunner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TestScopeImpl testScopeImpl, Job job, long j10, AtomicBoolean atomicBoolean, Ref$ObjectRef<Throwable> ref$ObjectRef, Ref$ObjectRef<CancellationException> ref$ObjectRef2, T9.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.$scope = testScopeImpl;
            this.$workRunner = job;
            this.$timeout = j10;
            this.$testBodyFinished = atomicBoolean;
            this.$timeoutError = ref$ObjectRef;
            this.$cancellationException = ref$ObjectRef2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v9, types: [T, java.util.concurrent.CancellationException] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, kotlinx.coroutines.test.UncompletedCoroutinesError] */
        public static final p invokeSuspend$lambda$0(TestScopeImpl testScopeImpl, long j10, AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Throwable th) {
            String str;
            if (th instanceof TimeoutCancellationException) {
                TestBuildersJvmKt.dumpCoroutines();
                List k3 = kotlin.sequences.a.k(kotlin.sequences.a.g(testScopeImpl.getChildren(), new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2$1$activeChildren$1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, ia.InterfaceC0842j
                    public Object get(Object obj) {
                        return Boolean.valueOf(((Job) obj).isActive());
                    }
                }));
                StringBuilder sb2 = new StringBuilder("After waiting for ");
                sb2.append((Object) la.c.m(j10));
                sb2.append(", ");
                if (atomicBoolean.getValue() && (!k3.isEmpty())) {
                    str = "there were active child jobs: " + k3 + ". Use `TestScope.backgroundScope` to launch the coroutines that need to be cancelled when the test body finishes";
                } else {
                    str = atomicBoolean.getValue() ? "the test completed, but only after the timeout" : "the test body did not run to completion";
                }
                sb2.append(str);
                ref$ObjectRef.f23179a = new UncompletedCoroutinesError(sb2.toString());
                ?? cancellationException = new CancellationException("The test timed out");
                ref$ObjectRef2.f23179a = cancellationException;
                testScopeImpl.cancel((CancellationException) cancellationException);
            }
            return p.f3034a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$workRunner, this.$timeout, this.$testBodyFinished, this.$timeoutError, this.$cancellationException, aVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                final TestScopeImpl testScopeImpl = this.$scope;
                final long j10 = this.$timeout;
                final AtomicBoolean atomicBoolean = this.$testBodyFinished;
                final Ref$ObjectRef<Throwable> ref$ObjectRef = this.$timeoutError;
                final Ref$ObjectRef<CancellationException> ref$ObjectRef2 = this.$cancellationException;
                Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new InterfaceC0646l() { // from class: kotlinx.coroutines.test.d
                    @Override // ca.InterfaceC0646l
                    public final Object invoke(Object obj2) {
                        p invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = TestBuildersKt__TestBuildersKt$runTest$2$1.AnonymousClass2.invokeSuspend$lambda$0(TestScopeImpl.this, j10, atomicBoolean, ref$ObjectRef, ref$ObjectRef2, (Throwable) obj2);
                        return invokeSuspend$lambda$0;
                    }
                }, 2, null);
                TestScopeImpl testScopeImpl2 = this.$scope;
                this.label = 1;
                if (testScopeImpl2.join(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return p.f3034a;
                }
                kotlin.b.b(obj);
            }
            Job job2 = this.$workRunner;
            this.label = 2;
            if (JobKt.cancelAndJoin(job2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p.f3034a;
        }

        @Override // ca.InterfaceC0650p
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersKt$runTest$2$1(TestScopeImpl testScopeImpl, long j10, TestScope testScope, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super TestBuildersKt__TestBuildersKt$runTest$2$1> aVar) {
        super(2, aVar);
        this.$scope = testScopeImpl;
        this.$timeout = j10;
        this.$this_runTest = testScope;
        this.$testBody = interfaceC0650p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0() {
        return false;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersKt$runTest$2$1 testBuildersKt__TestBuildersKt$runTest$2$1 = new TestBuildersKt__TestBuildersKt$runTest$2$1(this.$scope, this.$timeout, this.$this_runTest, this.$testBody, aVar);
        testBuildersKt__TestBuildersKt$runTest$2$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0149, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ea, code lost:
    
        kotlinx.coroutines.test.TestBuildersKt.throwAll(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x014e, code lost:
    
        return O9.p.f3034a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        r2 = r20.$scope.getCompletionExceptionOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTest$2$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
