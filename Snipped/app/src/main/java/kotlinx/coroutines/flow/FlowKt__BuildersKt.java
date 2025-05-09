package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ha.C0806e;
import ha.g;
import ja.h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r¢\u0006\u0004\b\u000b\u0010\u000e\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u000b\u0010\u0010\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u000b\u0010\u0012\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u000b\u0010\u0014\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015\"\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u001a\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u000b\u0010\u0018\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007*\u00020\u001d¢\u0006\u0004\b\u000b\u0010\u001f\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020!0\u0007*\u00020 ¢\u0006\u0004\b\u000b\u0010\"\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007*\u00020#¢\u0006\u0004\b\u000b\u0010$\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020!0\u0007*\u00020%¢\u0006\u0004\b\u000b\u0010&\u001aE\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b(\u0010\t\u001aE\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b)\u0010\t¨\u0006*"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "LT9/a;", "LO9/p;", "", "block", "Lkotlinx/coroutines/flow/Flow;", "flow", "(Lca/p;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function0;", "asFlow", "(Lca/a;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "(Lca/l;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/util/Iterator;)Lkotlinx/coroutines/flow/Flow;", "Lja/h;", "(Lja/h;)Lkotlinx/coroutines/flow/Flow;", "", "elements", "flowOf", "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "emptyFlow", "()Lkotlinx/coroutines/flow/Flow;", "", "", "([I)Lkotlinx/coroutines/flow/Flow;", "", "", "([J)Lkotlinx/coroutines/flow/Flow;", "Lha/e;", "(Lha/e;)Lkotlinx/coroutines/flow/Flow;", "Lha/g;", "(Lha/g;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/channels/ProducerScope;", "channelFlow", "callbackFlow", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> Flow<T> asFlow(final InterfaceC0635a<? extends T> interfaceC0635a) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, T9.a<? super p> aVar) {
                Object emit = flowCollector.emit((Object) InterfaceC0635a.this.invoke(), aVar);
                return emit == CoroutineSingletons.f23158a ? emit : p.f3034a;
            }
        };
    }

    public static final <T> Flow<T> callbackFlow(InterfaceC0650p<? super ProducerScope<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return new CallbackFlowBuilder(interfaceC0650p, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> channelFlow(InterfaceC0650p<? super ProducerScope<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return new ChannelFlowBuilder(interfaceC0650p, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> emptyFlow() {
        return EmptyFlow.INSTANCE;
    }

    public static final <T> Flow<T> flow(InterfaceC0650p<? super FlowCollector<? super T>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return new SafeFlow(interfaceC0650p);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> Flow<T> asFlow(InterfaceC0646l<? super T9.a<? super T>, ? extends Object> interfaceC0646l) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(interfaceC0646l);
    }

    public static final <T> Flow<T> flowOf(final T t3) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, T9.a<? super p> aVar) {
                Object emit = flowCollector.emit((Object) t3, aVar);
                return emit == CoroutineSingletons.f23158a ? emit : p.f3034a;
            }
        };
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> Flow<T> asFlow(h<? extends T> hVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(hVar);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final Flow<Integer> asFlow(C0806e c0806e) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(c0806e);
    }

    public static final Flow<Long> asFlow(g gVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(gVar);
    }
}
