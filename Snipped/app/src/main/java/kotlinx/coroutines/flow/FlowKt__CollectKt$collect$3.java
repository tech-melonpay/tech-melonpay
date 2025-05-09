package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "LO9/p;", "emit", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__CollectKt$collect$3<T> implements FlowCollector<T> {
    final /* synthetic */ InterfaceC0650p<T, T9.a<? super p>, Object> $action;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        this.$action = interfaceC0650p;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, T9.a<? super p> aVar) {
        Object invoke = this.$action.invoke(t3, aVar);
        return invoke == CoroutineSingletons.f23158a ? invoke : p.f3034a;
    }

    public Object emit$$forInline(T t3, final T9.a<? super p> aVar) {
        new ContinuationImpl(aVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        this.$action.invoke(t3, aVar);
        return p.f3034a;
    }
}
