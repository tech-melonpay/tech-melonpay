package kotlinx.coroutines.flow.internal;

import O9.p;
import T9.a;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "LT9/a;", "", "block", "flowScope", "(Lca/p;LT9/a;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "LO9/p;", "Lkotlinx/coroutines/flow/Flow;", "scopedFlow", "(Lca/q;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(InterfaceC0650p<? super CoroutineScope, ? super a<? super R>, ? extends Object> interfaceC0650p, a<? super R> aVar) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(aVar.getContext(), aVar);
        Object startUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, interfaceC0650p);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return startUndispatchedOrReturn;
    }

    public static final <R> Flow<R> scopedFlow(final InterfaceC0651q<? super CoroutineScope, ? super FlowCollector<? super R>, ? super a<? super p>, ? extends Object> interfaceC0651q) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, a<? super p> aVar) {
                Object flowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(InterfaceC0651q.this, flowCollector, null), aVar);
                return flowScope == CoroutineSingletons.f23158a ? flowScope : p.f3034a;
            }
        };
    }
}
