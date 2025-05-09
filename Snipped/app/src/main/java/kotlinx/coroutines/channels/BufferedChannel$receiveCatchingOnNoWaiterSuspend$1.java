package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BufferedChannel.kt */
@V9.d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, T9.a<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> aVar) {
        super(aVar);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m115receiveCatchingOnNoWaiterSuspendGKJJFZk;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m115receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m115receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return m115receiveCatchingOnNoWaiterSuspendGKJJFZk == CoroutineSingletons.f23158a ? m115receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m124boximpl(m115receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
