package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "LO9/p;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "LT9/a;", "", "block", "Lkotlinx/coroutines/channels/SendChannel;", "actor", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;ILkotlinx/coroutines/CoroutineStart;Lca/l;Lca/p;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ActorKt {
    @ObsoleteCoroutinesApi
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l<? super Throwable, p> interfaceC0646l, InterfaceC0650p<? super ActorScope<E>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        kotlin.coroutines.d newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, dVar);
        Channel Channel$default = ChannelKt.Channel$default(i, null, null, 6, null);
        ActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(newCoroutineContext, Channel$default, interfaceC0650p) : new ActorCoroutine(newCoroutineContext, Channel$default, true);
        if (interfaceC0646l != null) {
            ((JobSupport) lazyActorCoroutine).invokeOnCompletion(interfaceC0646l);
        }
        ((AbstractCoroutine) lazyActorCoroutine).start(coroutineStart, lazyActorCoroutine, interfaceC0650p);
        return (SendChannel<E>) lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l interfaceC0646l, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        kotlin.coroutines.d dVar2 = dVar;
        if ((i9 & 2) != 0) {
            i = 0;
        }
        int i10 = i;
        if ((i9 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 8) != 0) {
            interfaceC0646l = null;
        }
        return actor(coroutineScope, dVar2, i10, coroutineStart2, interfaceC0646l, interfaceC0650p);
    }
}
