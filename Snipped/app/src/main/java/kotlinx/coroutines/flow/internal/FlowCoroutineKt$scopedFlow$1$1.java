package kotlinx.coroutines.flow.internal;

import O9.p;
import T9.a;
import V9.d;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FlowCoroutine.kt */
@d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowCoroutineKt$scopedFlow$1$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, a<? super p>, Object> {
    final /* synthetic */ InterfaceC0651q<CoroutineScope, FlowCollector<? super R>, a<? super p>, Object> $block;
    final /* synthetic */ FlowCollector<R> $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC0651q<? super CoroutineScope, ? super FlowCollector<? super R>, ? super a<? super p>, ? extends Object> interfaceC0651q, FlowCollector<? super R> flowCollector, a<? super FlowCoroutineKt$scopedFlow$1$1> aVar) {
        super(2, aVar);
        this.$block = interfaceC0651q;
        this.$this_flow = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(Object obj, a<?> aVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_flow, aVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC0651q<CoroutineScope, FlowCollector<? super R>, a<? super p>, Object> interfaceC0651q = this.$block;
            Object obj3 = this.$this_flow;
            this.label = 1;
            if (interfaceC0651q.invoke(coroutineScope, obj3, this) == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
