package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2", f = "TestBuilders.kt", l = {459}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00028\u0000H\n"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "LO9/p;", "T", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2<T> extends SuspendLambda implements InterfaceC0650p<T, T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0650p<T, T9.a<? super p>, Object> $testBody;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2(InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2> aVar) {
        super(2, aVar);
        this.$testBody = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2 testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2 = new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2(this.$testBody, aVar);
        testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2;
    }

    @Override // ca.InterfaceC0650p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, T9.a<? super p> aVar) {
        return invoke((AbstractCoroutine) obj, (T9.a) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AbstractCoroutine abstractCoroutine = (AbstractCoroutine) this.L$0;
            InterfaceC0650p<T, T9.a<? super p>, Object> interfaceC0650p = this.$testBody;
            this.label = 1;
            if (interfaceC0650p.invoke(abstractCoroutine, this) == coroutineSingletons) {
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

    /* JADX WARN: Incorrect types in method signature: (TT;LT9/a<-LO9/p;>;)Ljava/lang/Object; */
    public final Object invoke(AbstractCoroutine abstractCoroutine, T9.a aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2) create(abstractCoroutine, aVar)).invokeSuspend(p.f3034a);
    }
}
