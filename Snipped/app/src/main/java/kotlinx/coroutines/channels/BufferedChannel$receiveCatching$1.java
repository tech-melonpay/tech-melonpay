package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BufferedChannel.kt */
@V9.d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, T9.a<? super BufferedChannel$receiveCatching$1> aVar) {
        super(aVar);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m114receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m114receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return m114receiveCatchingJP2dKIU$suspendImpl == CoroutineSingletons.f23158a ? m114receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m124boximpl(m114receiveCatchingJP2dKIU$suspendImpl);
    }
}
