package kotlinx.coroutines.flow;

import O9.p;
import P9.u;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import ca.InterfaceC0652r;
import ca.s;
import ca.t;
import ha.C0806e;
import ha.g;
import ia.InterfaceC0835c;
import ja.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Flow<T> asFlow(InterfaceC0635a<? extends T> interfaceC0635a) {
        return FlowKt__BuildersKt.asFlow(interfaceC0635a);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(InterfaceC0650p<? super ProducerScope<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__BuildersKt.callbackFlow(interfaceC0650p);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m142catch(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super T>, ? super Throwable, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt__ErrorsKt.m153catch(flow, interfaceC0651q);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, T9.a<? super Throwable> aVar) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, aVar);
    }

    public static final <T> Flow<T> channelFlow(InterfaceC0650p<? super ProducerScope<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__BuildersKt.channelFlow(interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i) {
        return FlowKt__TransformKt.chunked(flow, i);
    }

    public static final Object collect(Flow<?> flow, T9.a<? super p> aVar) {
        return FlowKt__CollectKt.collect(flow, aVar);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, InterfaceC0651q<? super Integer, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super p> aVar) {
        return FlowKt__CollectKt.collectIndexed(flow, interfaceC0651q, aVar);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super p> aVar) {
        return FlowKt__CollectKt.collectLatest(flow, interfaceC0650p, aVar);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p, T9.a<? super p> aVar) {
        return FlowKt__LimitKt.collectWhile(flow, interfaceC0650p, aVar);
    }

    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, interfaceC0651q);
    }

    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, InterfaceC0646l<? super Flow<? extends T>, ? extends Flow<? extends R>> interfaceC0646l) {
        return FlowKt__MigrationKt.compose(flow, interfaceC0646l);
    }

    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, InterfaceC0646l<? super T, ? extends Flow<? extends R>> interfaceC0646l) {
        return FlowKt__MigrationKt.concatMap(flow, interfaceC0646l);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t3) {
        return FlowKt__MigrationKt.concatWith(flow, t3);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, T9.a<? super Integer> aVar) {
        return FlowKt__CountKt.count(flow, aVar);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.debounce(flow, j10);
    }

    @FlowPreview
    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m143debounceHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m146debounceHG0u8IE(flow, j10);
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, InterfaceC0646l<? super T, la.c> interfaceC0646l) {
        return FlowKt__DelayKt.debounceDuration(flow, interfaceC0646l);
    }

    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j10) {
        return FlowKt__MigrationKt.delayEach(flow, j10);
    }

    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j10) {
        return FlowKt__MigrationKt.delayFlow(flow, j10);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, InterfaceC0646l<? super T, ? extends K> interfaceC0646l) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, interfaceC0646l);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.drop(flow, i);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt__LimitKt.dropWhile(flow, interfaceC0650p);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, T9.a<? super p> aVar) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, aVar);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt__TransformKt.filter(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt__TransformKt.filterNot(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.first(flow, aVar);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.firstOrNull(flow, aVar);
    }

    public static final ReceiveChannel<p> fixedPeriodTicker(CoroutineScope coroutineScope, long j10) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j10);
    }

    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt__MigrationKt.flatMap(flow, interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt__MergeKt.flatMapConcat(flow, interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt__MergeKt.flatMapLatest(flow, interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt__MergeKt.flatMapMerge(flow, i, interfaceC0650p);
    }

    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        return FlowKt__MergeKt.flattenMerge(flow, i);
    }

    public static final <T> Flow<T> flow(InterfaceC0650p<? super FlowCollector<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__BuildersKt.flow(interfaceC0650p);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, interfaceC0651q);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0652r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T9.a<? super p>, ? extends Object> interfaceC0652r) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, interfaceC0652r);
    }

    public static final <T> Flow<T> flowOf(T t3) {
        return FlowKt__BuildersKt.flowOf(t3);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        return FlowKt__ContextKt.flowOn(flow, dVar);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r8, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q, T9.a<? super R> aVar) {
        return FlowKt__ReduceKt.fold(flow, r8, interfaceC0651q, aVar);
    }

    public static final <T> void forEach(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        FlowKt__MigrationKt.forEach(flow, interfaceC0650p);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.last(flow, aVar);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.lastOrNull(flow, aVar);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        return FlowKt__TransformKt.map(flow, interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        return FlowKt__MergeKt.mapLatest(flow, interfaceC0650p);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        return FlowKt__TransformKt.mapNotNull(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.observeOn(flow, dVar);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super T>, ? super Throwable, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt__EmittersKt.onCompletion(flow, interfaceC0651q);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__TransformKt.onEach(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, InterfaceC0650p<? super FlowCollector<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__EmittersKt.onEmpty(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t3) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t3);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, InterfaceC0650p<? super FlowCollector<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__EmittersKt.onStart(flow, interfaceC0650p);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, InterfaceC0650p<? super FlowCollector<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, interfaceC0650p);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.publishOn(flow, dVar);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, InterfaceC0651q<? super S, ? super T, ? super T9.a<? super S>, ? extends Object> interfaceC0651q, T9.a<? super S> aVar) {
        return FlowKt__ReduceKt.reduce(flow, interfaceC0651q, aVar);
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j10, InterfaceC0650p<? super Throwable, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt__ErrorsKt.retry(flow, j10, interfaceC0650p);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, InterfaceC0652r<? super FlowCollector<? super T>, ? super Throwable, ? super Long, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0652r) {
        return FlowKt__ErrorsKt.retryWhen(flow, interfaceC0652r);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r8, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__TransformKt.runningFold(flow, r8, interfaceC0651q);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, InterfaceC0651q<? super T, ? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0651q) {
        return FlowKt__TransformKt.runningReduce(flow, interfaceC0651q);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.sample(flow, j10);
    }

    @FlowPreview
    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m144sampleHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m147sampleHG0u8IE(flow, j10);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r8, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__TransformKt.scan(flow, r8, interfaceC0651q);
    }

    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r8, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__MigrationKt.scanFold(flow, r8, interfaceC0651q);
    }

    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, InterfaceC0651q<? super T, ? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0651q) {
        return FlowKt__MigrationKt.scanReduce(flow, interfaceC0651q);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> Object single(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.single(flow, aVar);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.singleOrNull(flow, aVar);
    }

    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.skip(flow, i);
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t3) {
        return FlowKt__MigrationKt.startWith(flow, t3);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, T9.a<? super StateFlow<? extends T>> aVar) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, aVar);
    }

    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, kotlin.coroutines.d dVar) {
        return FlowKt__MigrationKt.subscribeOn(flow, dVar);
    }

    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Flow<? extends R>>, ? extends Object> interfaceC0650p) {
        return FlowKt__MigrationKt.switchMap(flow, interfaceC0650p);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        return FlowKt__LimitKt.take(flow, i);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return FlowKt__LimitKt.takeWhile(flow, interfaceC0650p);
    }

    @FlowPreview
    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m145timeoutHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m148timeoutHG0u8IE(flow, j10);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c2, T9.a<? super C> aVar) {
        return FlowKt__CollectionKt.toCollection(flow, c2, aVar);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, T9.a<? super List<? extends T>> aVar) {
        return FlowKt__CollectionKt.toList(flow, list, aVar);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, T9.a<? super Set<? extends T>> aVar) {
        return FlowKt__CollectionKt.toSet(flow, set, aVar);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt__EmittersKt.transform(flow, interfaceC0651q);
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt__MergeKt.transformLatest(flow, interfaceC0651q);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0651q) {
        return FlowKt__LimitKt.transformWhile(flow, interfaceC0651q);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        return FlowKt__EmittersKt.unsafeTransform(flow, interfaceC0651q);
    }

    public static final <T> Flow<u<T>> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__ZipKt.zip(flow, flow2, interfaceC0651q);
    }

    public static final <T> Flow<T> asFlow(InterfaceC0646l<? super T9.a<? super T>, ? extends Object> interfaceC0646l) {
        return FlowKt__BuildersKt.asFlow(interfaceC0646l);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i, bufferOverflow);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return FlowKt__ZipKt.combine(flow, flow2, interfaceC0651q);
    }

    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, InterfaceC0652r<? super T1, ? super T2, ? super T3, ? super T9.a<? super R>, ? extends Object> interfaceC0652r) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, interfaceC0652r);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, InterfaceC0652r<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T9.a<? super p>, ? extends Object> interfaceC0652r) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, interfaceC0652r);
    }

    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object count(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p, T9.a<? super Integer> aVar) {
        return FlowKt__CountKt.count(flow, interfaceC0650p, aVar);
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, InterfaceC0646l<? super T, Long> interfaceC0646l) {
        return FlowKt__DelayKt.debounce(flow, interfaceC0646l);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T, Boolean> interfaceC0650p) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, interfaceC0650p);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, T9.a<? super p> aVar) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, aVar);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, InterfaceC0835c<R> interfaceC0835c) {
        return FlowKt__TransformKt.filterIsInstance(flow, interfaceC0835c);
    }

    public static final <T> Object first(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.first(flow, interfaceC0650p, aVar);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p, T9.a<? super T> aVar) {
        return FlowKt__ReduceKt.firstOrNull(flow, interfaceC0650p, aVar);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t3, InterfaceC0646l<? super Throwable, Boolean> interfaceC0646l) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t3, interfaceC0646l);
    }

    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.publish(flow, i);
    }

    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i) {
        return FlowKt__MigrationKt.replay(flow, i);
    }

    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t3) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t3);
    }

    public static final <T> void subscribe(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        FlowKt__MigrationKt.subscribe(flow, interfaceC0650p);
    }

    public static final Flow<Integer> asFlow(C0806e c0806e) {
        return FlowKt__BuildersKt.asFlow(c0806e);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, InterfaceC0652r<? super T1, ? super T2, ? super T3, ? super T9.a<? super R>, ? extends Object> interfaceC0652r) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, interfaceC0652r);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super R>, ? extends Object> sVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, sVar);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T9.a<? super p>, ? extends Object> sVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, sVar);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    public static final <T> void subscribe(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, InterfaceC0650p<? super Throwable, ? super T9.a<? super p>, ? extends Object> interfaceC0650p2) {
        FlowKt__MigrationKt.subscribe(flow, interfaceC0650p, interfaceC0650p2);
    }

    public static final Flow<Long> asFlow(g gVar) {
        return FlowKt__BuildersKt.asFlow(gVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super R>, ? extends Object> sVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super R>, ? extends Object> tVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, tVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T9.a<? super p>, ? extends Object> tVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, tVar);
    }

    public static final <T> Flow<T> asFlow(h<? extends T> hVar) {
        return FlowKt__BuildersKt.asFlow(hVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super R>, ? extends Object> tVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, ca.u<? super FlowCollector<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T9.a<? super p>, ? extends Object> uVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, uVar);
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
