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
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1", f = "TestBuilders.kt", l = {499, 503}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ TestCoroutineScheduler $scheduler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1(TestCoroutineScheduler testCoroutineScheduler, T9.a<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1> aVar) {
        super(2, aVar);
        this.$scheduler = testCoroutineScheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        return !CoroutineScopeKt.isActive(coroutineScope);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1 = new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1(this.$scheduler, aVar);
        testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1;
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
            if (this.$scheduler.tryRunNextTaskUnless$kotlinx_coroutines_test(new e(coroutineScope, 1))) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (YieldKt.yield(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                TestCoroutineScheduler testCoroutineScheduler = this.$scheduler;
                this.L$0 = coroutineScope;
                this.label = 2;
                if (testCoroutineScheduler.receiveDispatchEvent$kotlinx_coroutines_test(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
