package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TestBuildersDeprecated.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1", f = "TestBuildersDeprecated.kt", l = {64}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ TestCoroutineScope $scope;
    final /* synthetic */ InterfaceC0650p<TestCoroutineScope, T9.a<? super p>, Object> $testBody;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, TestCoroutineScope testCoroutineScope, T9.a<? super TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1> aVar) {
        super(2, aVar);
        this.$testBody = interfaceC0650p;
        this.$scope = testCoroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1(this.$testBody, this.$scope, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            InterfaceC0650p<TestCoroutineScope, T9.a<? super p>, Object> interfaceC0650p = this.$testBody;
            TestCoroutineScope testCoroutineScope = this.$scope;
            this.label = 1;
            if (interfaceC0650p.invoke(testCoroutineScope, this) == coroutineSingletons) {
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
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runBlockingTest$deferred$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
