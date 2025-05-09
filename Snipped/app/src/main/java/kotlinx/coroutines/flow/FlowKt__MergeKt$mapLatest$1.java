package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: Merge.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "LO9/p;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__MergeKt$mapLatest$1<R, T> extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, T, T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0650p<T, T9.a<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC0650p<? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0650p, T9.a<? super FlowKt__MergeKt$mapLatest$1> aVar) {
        super(3, aVar);
        this.$transform = interfaceC0650p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0651q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, T9.a<? super p> aVar) {
        return invoke((FlowCollector) obj, (FlowCollector<? super R>) obj2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object obj2 = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            Object obj3 = this.L$1;
            InterfaceC0650p<T, T9.a<? super R>, Object> interfaceC0650p = this.$transform;
            this.L$0 = flowCollector2;
            this.label = 1;
            obj = interfaceC0650p.invoke(obj3, this);
            flowCollector = flowCollector2;
            if (obj == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return p.f3034a;
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            kotlin.b.b(obj);
            flowCollector = flowCollector3;
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == obj2) {
            return obj2;
        }
        return p.f3034a;
    }

    public final Object invoke(FlowCollector<? super R> flowCollector, T t3, T9.a<? super p> aVar) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, aVar);
        flowKt__MergeKt$mapLatest$1.L$0 = flowCollector;
        flowKt__MergeKt$mapLatest$1.L$1 = t3;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(p.f3034a);
    }
}
