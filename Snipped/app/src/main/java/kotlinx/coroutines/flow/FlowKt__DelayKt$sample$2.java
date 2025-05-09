package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__DelayKt$sample$2<T> extends SuspendLambda implements InterfaceC0651q<CoroutineScope, FlowCollector<? super T>, T9.a<? super p>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ Flow<T> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2(long j10, Flow<? extends T> flow, T9.a<? super FlowKt__DelayKt$sample$2> aVar) {
        super(3, aVar);
        this.$periodMillis = j10;
        this.$this_sample = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ReceiveChannel<p> fixedPeriodTicker;
        ReceiveChannel receiveChannel;
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowCollector flowCollector2 = (FlowCollector) this.L$1;
            ReceiveChannel produce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            flowCollector = flowCollector2;
            fixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
            receiveChannel = produce$default;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fixedPeriodTicker = (ReceiveChannel) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            kotlin.b.b(obj);
        }
        while (ref$ObjectRef.f23179a != NullSurrogateKt.DONE) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, fixedPeriodTicker, null));
            selectImplementation.invoke(fixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, flowCollector, null));
            this.L$0 = flowCollector;
            this.L$1 = receiveChannel;
            this.L$2 = ref$ObjectRef;
            this.L$3 = fixedPeriodTicker;
            this.label = 1;
            if (selectImplementation.doSelect(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, T9.a<? super p> aVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, aVar);
        flowKt__DelayKt$sample$2.L$0 = coroutineScope;
        flowKt__DelayKt$sample$2.L$1 = flowCollector;
        return flowKt__DelayKt$sample$2.invokeSuspend(p.f3034a);
    }
}
