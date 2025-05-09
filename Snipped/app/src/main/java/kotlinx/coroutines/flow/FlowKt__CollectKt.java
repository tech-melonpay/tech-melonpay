package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;

/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002*\b\u0004\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0086H¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001aF\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002$\b\u0004\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0087H¢\u0006\u0004\b\u0002\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "LO9/p;", "collect", "(Lkotlinx/coroutines/flow/Flow;LT9/a;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "launchIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", "Lkotlin/Function3;", "", "LT9/a;", "", "action", "collectIndexed", "(Lkotlinx/coroutines/flow/Flow;Lca/q;LT9/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "collectLatest", "(Lkotlinx/coroutines/flow/Flow;Lca/p;LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "flow", "emitAll", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;LT9/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__CollectKt {
    public static final Object collect(Flow<?> flow, T9.a<? super p> aVar) {
        Object collect = flow.collect(NopCollector.INSTANCE, aVar);
        return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
    }

    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super p> aVar) {
        flow.collect(new FlowKt__CollectKt$collect$3(interfaceC0650p), aVar);
        return p.f3034a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, InterfaceC0651q<? super Integer, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super p> aVar) {
        Object collect = flow.collect(new FlowKt__CollectKt$collectIndexed$2(interfaceC0651q), aVar);
        return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, InterfaceC0651q<? super Integer, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super p> aVar) {
        flow.collect(new FlowKt__CollectKt$collectIndexed$2(interfaceC0651q), aVar);
        return p.f3034a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super p> aVar) {
        Object collect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, interfaceC0650p), 0, null, 2, null), aVar);
        return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, T9.a<? super p> aVar) {
        FlowKt.ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, aVar);
        return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return launch$default;
    }

    public static final <T> Object collect(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super p> aVar) {
        Object collect = flow.collect(new FlowKt__CollectKt$collect$3(interfaceC0650p), aVar);
        return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
    }
}
