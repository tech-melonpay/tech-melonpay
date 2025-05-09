package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Channels.kt */
@V9.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ChannelResult;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super ChannelResult<? extends p>>, Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ SendChannel<E> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(SendChannel<? super E> sendChannel, E e10, T9.a<? super ChannelsKt__ChannelsKt$trySendBlocking$2> aVar) {
        super(2, aVar);
        this.$this_trySendBlocking = sendChannel;
        this.$element = e10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, aVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // ca.InterfaceC0650p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, T9.a<? super ChannelResult<? extends p>> aVar) {
        return invoke2(coroutineScope, (T9.a<? super ChannelResult<p>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                SendChannel<E> sendChannel = this.$this_trySendBlocking;
                E e10 = this.$element;
                this.label = 1;
                if (sendChannel.send(e10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            failure = p.f3034a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return ChannelResult.m124boximpl((failure instanceof Result.Failure) ^ true ? ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a) : ChannelResult.INSTANCE.m137closedJP2dKIU(Result.a(failure)));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, T9.a<? super ChannelResult<p>> aVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
