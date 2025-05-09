package kotlinx.coroutines.channels;

import O9.p;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "Lkotlinx/coroutines/channels/ChannelResult;", "LO9/p;", "trySendBlocking", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "sendBlocking", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {
    public static final /* synthetic */ void sendBlocking(SendChannel sendChannel, Object obj) {
        if (ChannelResult.m134isSuccessimpl(sendChannel.mo110trySendJP2dKIU(obj))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new ChannelsKt__ChannelsKt$sendBlocking$1(sendChannel, obj, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e10) {
        Object runBlocking$default;
        Object mo110trySendJP2dKIU = sendChannel.mo110trySendJP2dKIU(e10);
        if (mo110trySendJP2dKIU instanceof ChannelResult.Failed) {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, e10, null), 1, null);
            return ((ChannelResult) runBlocking$default).getHolder();
        }
        return ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a);
    }
}
