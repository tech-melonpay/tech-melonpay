package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Delay.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "", "value", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/channels/ChannelResult;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements InterfaceC0650p<ChannelResult<? extends Object>, T9.a<? super p>, Object> {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef<Object> ref$ObjectRef, FlowCollector<? super T> flowCollector, T9.a<? super FlowKt__DelayKt$debounceInternal$1$3$2> aVar) {
        super(2, aVar);
        this.$lastValue = ref$ObjectRef;
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, aVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // ca.InterfaceC0650p
    public /* bridge */ /* synthetic */ Object invoke(ChannelResult<? extends Object> channelResult, T9.a<? super p> aVar) {
        return m150invokeWpGqRn0(channelResult.getHolder(), aVar);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m150invokeWpGqRn0(Object obj, T9.a<? super p> aVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m124boximpl(obj), aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Object> ref$ObjectRef;
        Ref$ObjectRef<Object> ref$ObjectRef2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ?? holder = ((ChannelResult) this.L$0).getHolder();
            ref$ObjectRef = this.$lastValue;
            boolean z10 = holder instanceof ChannelResult.Failed;
            if (!z10) {
                ref$ObjectRef.f23179a = holder;
            }
            FlowCollector<T> flowCollector = this.$downstream;
            if (z10) {
                Throwable m128exceptionOrNullimpl = ChannelResult.m128exceptionOrNullimpl(holder);
                if (m128exceptionOrNullimpl != null) {
                    throw m128exceptionOrNullimpl;
                }
                Object obj2 = ref$ObjectRef.f23179a;
                if (obj2 != null) {
                    if (obj2 == NullSurrogateKt.NULL) {
                        obj2 = null;
                    }
                    this.L$0 = holder;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    if (flowCollector.emit(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.f23179a = NullSurrogateKt.DONE;
            }
            return p.f3034a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
        kotlin.b.b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f23179a = NullSurrogateKt.DONE;
        return p.f3034a;
    }
}
