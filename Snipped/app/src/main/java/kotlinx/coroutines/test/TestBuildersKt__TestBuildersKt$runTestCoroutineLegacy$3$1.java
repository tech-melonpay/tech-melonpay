package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO9/p;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1 extends SuspendLambda implements InterfaceC0646l<T9.a<? super p>, Object> {
    final /* synthetic */ Ref$BooleanRef $completed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(Ref$BooleanRef ref$BooleanRef, T9.a<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1> aVar) {
        super(1, aVar);
        this.$completed = ref$BooleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(T9.a<?> aVar) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1(this.$completed, aVar);
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1) create(aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$completed.f23175a = true;
        return p.f3034a;
    }
}
