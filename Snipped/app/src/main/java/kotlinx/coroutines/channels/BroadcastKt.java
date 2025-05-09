package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0089\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\b\u0002\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f2*\b\u0001\u0010\u0015\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0007¢\u0006\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"E", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "capacity", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcast", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlinx/coroutines/CoroutineStart;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "Lkotlin/Function1;", "", "LO9/p;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "LT9/a;", "", "block", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;ILkotlinx/coroutines/CoroutineStart;Lca/l;Lca/p;)Lkotlinx/coroutines/channels/BroadcastChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class BroadcastKt {
    @ObsoleteCoroutinesApi
    public static final <E> BroadcastChannel<E> broadcast(ReceiveChannel<? extends E> receiveChannel, int i, CoroutineStart coroutineStart) {
        return broadcast$default(CoroutineScopeKt.plus(CoroutineScopeKt.plus(GlobalScope.INSTANCE, Dispatchers.getUnconfined()), new BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE)), null, i, coroutineStart, new d(receiveChannel, 1), new BroadcastKt$broadcast$2(receiveChannel, null), 1, null);
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(ReceiveChannel receiveChannel, int i, CoroutineStart coroutineStart, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 1;
        }
        if ((i9 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return broadcast(receiveChannel, i, coroutineStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p broadcast$lambda$1(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return p.f3034a;
    }

    public static /* synthetic */ BroadcastChannel broadcast$default(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l interfaceC0646l, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        kotlin.coroutines.d dVar2 = dVar;
        if ((i9 & 2) != 0) {
            i = 1;
        }
        int i10 = i;
        if ((i9 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 8) != 0) {
            interfaceC0646l = null;
        }
        return broadcast(coroutineScope, dVar2, i10, coroutineStart2, interfaceC0646l, interfaceC0650p);
    }

    @ObsoleteCoroutinesApi
    public static final <E> BroadcastChannel<E> broadcast(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l<? super Throwable, p> interfaceC0646l, InterfaceC0650p<? super ProducerScope<? super E>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        BroadcastCoroutine broadcastCoroutine;
        kotlin.coroutines.d newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, dVar);
        BroadcastChannel BroadcastChannel = BroadcastChannelKt.BroadcastChannel(i);
        if (coroutineStart.isLazy()) {
            broadcastCoroutine = new LazyBroadcastCoroutine(newCoroutineContext, BroadcastChannel, interfaceC0650p);
        } else {
            broadcastCoroutine = new BroadcastCoroutine(newCoroutineContext, BroadcastChannel, true);
        }
        if (interfaceC0646l != null) {
            ((JobSupport) broadcastCoroutine).invokeOnCompletion(interfaceC0646l);
        }
        ((AbstractCoroutine) broadcastCoroutine).start(coroutineStart, broadcastCoroutine, interfaceC0650p);
        return (BroadcastChannel<E>) broadcastCoroutine;
    }
}
