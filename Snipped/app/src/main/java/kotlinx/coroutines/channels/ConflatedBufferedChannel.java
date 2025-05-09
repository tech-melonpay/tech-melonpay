package kotlinx.coroutines.channels;

import O9.m;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

/* compiled from: ConflatedBufferedChannel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010'\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "LO9/p;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lca/l;)V", "element", "", "isSendOp", "Lkotlinx/coroutines/channels/ChannelResult;", "trySendImpl-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendImpl", "trySendDropLatest-Mj0NB7M", "trySendDropLatest", "send", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "I", "Lkotlinx/coroutines/channels/BufferOverflow;", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, InterfaceC0646l interfaceC0646l, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i9 & 4) != 0 ? null : interfaceC0646l);
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, T9.a<? super p> aVar) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m141trySendImplMj0NB7M = conflatedBufferedChannel.m141trySendImplMj0NB7M(e10, true);
        if (!(m141trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return p.f3034a;
        }
        ChannelResult.m128exceptionOrNullimpl(m141trySendImplMj0NB7M);
        InterfaceC0646l<E, p> interfaceC0646l = conflatedBufferedChannel.onUndeliveredElement;
        if (interfaceC0646l == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(interfaceC0646l, e10, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        m.a(callUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw callUndeliveredElementCatchingException$default;
    }

    public static <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, T9.a<? super Boolean> aVar) {
        Object m141trySendImplMj0NB7M = conflatedBufferedChannel.m141trySendImplMj0NB7M(e10, true);
        if (m141trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m140trySendDropLatestMj0NB7M(E element, boolean isSendOp) {
        InterfaceC0646l<E, p> interfaceC0646l;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo110trySendJP2dKIU = super.mo110trySendJP2dKIU(element);
        if (ChannelResult.m134isSuccessimpl(mo110trySendJP2dKIU) || ChannelResult.m132isClosedimpl(mo110trySendJP2dKIU)) {
            return mo110trySendJP2dKIU;
        }
        if (!isSendOp || (interfaceC0646l = this.onUndeliveredElement) == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(interfaceC0646l, element, null, 2, null)) == null) {
            return ChannelResult.INSTANCE.m139successJP2dKIU(p.f3034a);
        }
        throw callUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m141trySendImplMj0NB7M(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m140trySendDropLatestMj0NB7M(element, isSendOp) : m118trySendDropOldestJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> select, Object element) {
        Object mo110trySendJP2dKIU = mo110trySendJP2dKIU(element);
        if (!(mo110trySendJP2dKIU instanceof ChannelResult.Failed)) {
            select.selectInRegistrationPhase(p.f3034a);
        } else {
            if (!(mo110trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable".toString());
            }
            ChannelResult.m128exceptionOrNullimpl(mo110trySendJP2dKIU);
            select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, T9.a<? super p> aVar) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, aVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e10, T9.a<? super Boolean> aVar) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, aVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo110trySendJP2dKIU(E element) {
        return m141trySendImplMj0NB7M(element, false);
    }

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, InterfaceC0646l<? super E, p> interfaceC0646l) {
        super(i, interfaceC0646l);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(s3.b.i("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + h.a(BufferedChannel.class).d() + " instead").toString());
        }
    }
}
