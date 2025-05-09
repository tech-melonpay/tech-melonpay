package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import la.c;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1", f = "TestBuilders.kt", l = {401}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTest$3$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ TestScopeImpl $it;
    final /* synthetic */ InterfaceC0650p<TestScope, T9.a<? super p>, Object> $testBody;
    final /* synthetic */ TestScope $this_runTest;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: TestBuilders.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC0646l<TestScopeImpl, Throwable> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, TestScopeImpl.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // ca.InterfaceC0646l
        public final Throwable invoke(TestScopeImpl testScopeImpl) {
            return testScopeImpl.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersKt$runTest$3$1(TestScopeImpl testScopeImpl, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, TestScope testScope, T9.a<? super TestBuildersKt__TestBuildersKt$runTest$3$1> aVar) {
        super(2, aVar);
        this.$it = testScopeImpl;
        this.$dispatchTimeoutMs = j10;
        this.$testBody = interfaceC0650p;
        this.$this_runTest = testScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(TestScope testScope, TestScopeImpl testScopeImpl) {
        CoroutineScopeKt.cancel$default(testScope.getBackgroundScope(), null, 1, null);
        testScope.getTestScheduler().advanceUntilIdleOr$kotlinx_coroutines_test(new b(2));
        return testScopeImpl.legacyLeave();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1$lambda$0() {
        return false;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersKt$runTest$3$1 testBuildersKt__TestBuildersKt$runTest$3$1 = new TestBuildersKt__TestBuildersKt$runTest$3$1(this.$it, this.$dispatchTimeoutMs, this.$testBody, this.$this_runTest, aVar);
        testBuildersKt__TestBuildersKt$runTest$3$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestScopeImpl testScopeImpl = this.$it;
            c.a aVar = la.c.f23587b;
            long g10 = la.e.g(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            InterfaceC0650p<TestScope, T9.a<? super p>, Object> interfaceC0650p = this.$testBody;
            f fVar = new f(0, this.$this_runTest, this.$it);
            this.label = 1;
            if (TestBuildersKt.m186runTestCoroutineLegacySYHnMyU(coroutineScope, testScopeImpl, g10, anonymousClass1, interfaceC0650p, fVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTest$3$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
