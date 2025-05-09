package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TestBuildersJvm.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersJvmKt$createTestResult$1", f = "TestBuildersJvm.kt", l = {11}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersJvmKt$createTestResult$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> $testProcedure;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersJvmKt$createTestResult$1(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super TestBuildersJvmKt$createTestResult$1> aVar) {
        super(2, aVar);
        this.$testProcedure = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersJvmKt$createTestResult$1 testBuildersJvmKt$createTestResult$1 = new TestBuildersJvmKt$createTestResult$1(this.$testProcedure, aVar);
        testBuildersJvmKt$createTestResult$1.L$0 = obj;
        return testBuildersJvmKt$createTestResult$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> interfaceC0650p = this.$testProcedure;
            this.label = 1;
            if (interfaceC0650p.invoke(coroutineScope, this) == coroutineSingletons) {
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
        return ((TestBuildersJvmKt$createTestResult$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
