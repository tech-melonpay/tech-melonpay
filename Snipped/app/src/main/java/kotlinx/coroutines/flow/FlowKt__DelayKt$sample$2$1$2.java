package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Delay.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO9/p;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements InterfaceC0650p<p, T9.a<? super p>, Object> {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$1$2(Ref$ObjectRef<Object> ref$ObjectRef, FlowCollector<? super T> flowCollector, T9.a<? super FlowKt__DelayKt$sample$2$1$2> aVar) {
        super(2, aVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(p pVar, T9.a<? super p> aVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(pVar, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
            Object obj2 = ref$ObjectRef.f23179a;
            if (obj2 == null) {
                return p.f3034a;
            }
            ref$ObjectRef.f23179a = null;
            FlowCollector<T> flowCollector = this.$downstream;
            if (obj2 == NullSurrogateKt.NULL) {
                obj2 = null;
            }
            this.label = 1;
            if (flowCollector.emit(obj2, this) == coroutineSingletons) {
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
}
