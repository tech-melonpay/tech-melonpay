package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ChannelResult;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\n\u0010\u0006\u001aI\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\f\u0010\u0006\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\u0006\u001aE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/channels/ChannelResult;", "Lkotlin/Function1;", "", "onFailure", "getOrElse-WpGqRn0", "(Ljava/lang/Object;Lca/l;)Ljava/lang/Object;", "getOrElse", "LO9/p;", "action", "onSuccess-WpGqRn0", "onSuccess", "onFailure-WpGqRn0", "onClosed-WpGqRn0", "onClosed", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/Channel;", "Channel", "(ILkotlinx/coroutines/channels/BufferOverflow;Lca/l;)Lkotlinx/coroutines/channels/Channel;", "(I)Lkotlinx/coroutines/channels/Channel;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ChannelKt {
    public static final <E> Channel<E> Channel(int i, BufferOverflow bufferOverflow, InterfaceC0646l<? super E, p> interfaceC0646l) {
        Channel<E> bufferedChannel;
        if (i == -2) {
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), interfaceC0646l) : new ConflatedBufferedChannel<>(1, bufferOverflow, interfaceC0646l);
        } else {
            if (i == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, interfaceC0646l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, interfaceC0646l) : new ConflatedBufferedChannel(i, bufferOverflow, interfaceC0646l) : new BufferedChannel(Integer.MAX_VALUE, interfaceC0646l);
            }
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel<>(0, interfaceC0646l) : new ConflatedBufferedChannel<>(1, bufferOverflow, interfaceC0646l);
        }
        return bufferedChannel;
    }

    public static /* synthetic */ Channel Channel$default(int i, BufferOverflow bufferOverflow, InterfaceC0646l interfaceC0646l, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            interfaceC0646l = null;
        }
        return Channel(i, bufferOverflow, interfaceC0646l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m120getOrElseWpGqRn0(Object obj, InterfaceC0646l<? super Throwable, ? extends T> interfaceC0646l) {
        return obj instanceof ChannelResult.Failed ? interfaceC0646l.invoke(ChannelResult.m128exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m121onClosedWpGqRn0(Object obj, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        if (obj instanceof ChannelResult.Closed) {
            interfaceC0646l.invoke(ChannelResult.m128exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m122onFailureWpGqRn0(Object obj, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        if (obj instanceof ChannelResult.Failed) {
            interfaceC0646l.invoke(ChannelResult.m128exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m123onSuccessWpGqRn0(Object obj, InterfaceC0646l<? super T, p> interfaceC0646l) {
        if (!(obj instanceof ChannelResult.Failed)) {
            interfaceC0646l.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ Channel Channel$default(int i, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    public static final /* synthetic */ Channel Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
