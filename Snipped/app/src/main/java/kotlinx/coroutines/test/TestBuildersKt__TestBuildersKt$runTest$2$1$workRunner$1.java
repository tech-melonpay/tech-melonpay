package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1", f = "TestBuilders.kt", l = {331, 334}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ TestScope $this_runTest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1(TestScope testScope, T9.a<? super TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1> aVar) {
        super(2, aVar);
        this.$this_runTest = testScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        return !CoroutineScopeKt.isActive(coroutineScope);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1 = new TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1(this.$this_runTest, aVar);
        testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            kotlin.b.b(obj);
        }
        while (true) {
            if (this.$this_runTest.getTestScheduler().tryRunNextTaskUnless$kotlinx_coroutines_test(new e(coroutineScope, 0))) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (YieldKt.yield(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                TestCoroutineScheduler testScheduler = this.$this_runTest.getTestScheduler();
                this.L$0 = coroutineScope;
                this.label = 2;
                if (testScheduler.receiveDispatchEvent$kotlinx_coroutines_test(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
