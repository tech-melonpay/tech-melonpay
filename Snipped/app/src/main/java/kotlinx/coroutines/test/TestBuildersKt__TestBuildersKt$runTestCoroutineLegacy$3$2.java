package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO9/p;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2 extends SuspendLambda implements InterfaceC0650p<p, T9.a<? super p>, Object> {
    int label;

    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(T9.a<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2(aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(p pVar, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2) create(pVar, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return p.f3034a;
    }
}
