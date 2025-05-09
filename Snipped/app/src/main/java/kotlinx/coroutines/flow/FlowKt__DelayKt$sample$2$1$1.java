package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Delay.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "", "result", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/channels/ChannelResult;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements InterfaceC0650p<ChannelResult<? extends Object>, T9.a<? super p>, Object> {
    final /* synthetic */ Ref$ObjectRef<Object> $lastValue;
    final /* synthetic */ ReceiveChannel<p> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref$ObjectRef<Object> ref$ObjectRef, ReceiveChannel<p> receiveChannel, T9.a<? super FlowKt__DelayKt$sample$2$1$1> aVar) {
        super(2, aVar);
        this.$lastValue = ref$ObjectRef;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, aVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // ca.InterfaceC0650p
    public /* bridge */ /* synthetic */ Object invoke(ChannelResult<? extends Object> channelResult, T9.a<? super p> aVar) {
        return m151invokeWpGqRn0(channelResult.getHolder(), aVar);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m151invokeWpGqRn0(Object obj, T9.a<? super p> aVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m124boximpl(obj), aVar)).invokeSuspend(p.f3034a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        ?? holder = ((ChannelResult) this.L$0).getHolder();
        Ref$ObjectRef<Object> ref$ObjectRef = this.$lastValue;
        boolean z10 = holder instanceof ChannelResult.Failed;
        if (!z10) {
            ref$ObjectRef.f23179a = holder;
        }
        ReceiveChannel<p> receiveChannel = this.$ticker;
        if (z10) {
            Throwable m128exceptionOrNullimpl = ChannelResult.m128exceptionOrNullimpl(holder);
            if (m128exceptionOrNullimpl != null) {
                throw m128exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            ref$ObjectRef.f23179a = NullSurrogateKt.DONE;
        }
        return p.f3034a;
    }
}
