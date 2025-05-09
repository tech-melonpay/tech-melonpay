package kotlinx.coroutines.flow;

import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.jvm.internal.j;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u0007\u001a=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"$\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"*\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "distinctUntilChanged", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "", "areEquivalent", "(Lkotlinx/coroutines/flow/Flow;Lca/p;)Lkotlinx/coroutines/flow/Flow;", "K", "Lkotlin/Function1;", "keySelector", "distinctUntilChangedBy", "(Lkotlinx/coroutines/flow/Flow;Lca/l;)Lkotlinx/coroutines/flow/Flow;", "", "distinctUntilChangedBy$FlowKt__DistinctKt", "(Lkotlinx/coroutines/flow/Flow;Lca/l;Lca/p;)Lkotlinx/coroutines/flow/Flow;", "defaultKeySelector", "Lca/l;", "defaultAreEquivalent", "Lca/p;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final InterfaceC0646l<Object, Object> defaultKeySelector = new c(0);
    private static final InterfaceC0650p<Object, Object, Boolean> defaultAreEquivalent = new d();

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, InterfaceC0646l<? super T, ? extends K> interfaceC0646l) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, interfaceC0646l, defaultAreEquivalent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(Flow<? extends T> flow, InterfaceC0646l<? super T, ? extends Object> interfaceC0646l, InterfaceC0650p<Object, Object, Boolean> interfaceC0650p) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == interfaceC0646l && distinctFlowImpl.areEquivalent == interfaceC0650p) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, interfaceC0646l, interfaceC0650p);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T, Boolean> interfaceC0650p) {
        InterfaceC0646l<Object, Object> interfaceC0646l = defaultKeySelector;
        j.c(2, interfaceC0650p);
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, interfaceC0646l, interfaceC0650p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object defaultKeySelector$lambda$0$FlowKt__DistinctKt(Object obj) {
        return obj;
    }
}
