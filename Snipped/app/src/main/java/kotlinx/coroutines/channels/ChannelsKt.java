package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th);
    }

    @ObsoleteCoroutinesApi
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, InterfaceC0646l<? super ReceiveChannel<? extends E>, ? extends R> interfaceC0646l) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, interfaceC0646l);
    }

    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, InterfaceC0646l<? super E, p> interfaceC0646l, T9.a<? super p> aVar) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, interfaceC0646l, aVar);
    }

    public static final InterfaceC0646l<Throwable, p> consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final InterfaceC0646l<Throwable, p> consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super K>, ? extends Object> interfaceC0650p) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, dVar, interfaceC0650p);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, dVar, interfaceC0650p);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, dVar, interfaceC0650p);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q<? super Integer, ? super E, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, dVar, interfaceC0651q);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c2, T9.a<? super C> aVar) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c2, aVar);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c2, T9.a<? super C> aVar) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c2, aVar);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, T9.a<? super List<? extends E>> aVar) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, aVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, T9.a<? super Set<E>> aVar) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, aVar);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e10) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e10);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, InterfaceC0646l<? super ReceiveChannel<? extends E>, ? extends R> interfaceC0646l) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, interfaceC0646l);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, InterfaceC0646l<? super E, p> interfaceC0646l, T9.a<? super p> aVar) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, interfaceC0646l, aVar);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> receiveChannel, M m2, T9.a<? super M> aVar) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m2, aVar);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super R, ? extends V> interfaceC0650p) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, dVar, interfaceC0650p);
    }
}
