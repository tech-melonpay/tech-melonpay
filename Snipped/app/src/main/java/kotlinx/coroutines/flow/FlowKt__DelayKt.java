package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u0005\u001a9\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0007\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0007\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0005\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0005\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u0005\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0005¨\u0006\u001c"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "timeoutMillis", "debounce", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/Flow;Lca/l;)Lkotlinx/coroutines/flow/Flow;", "Lla/c;", "timeout", "debounce-HG0u8IE", "debounceDuration", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "debounceInternal", "periodMillis", "sample", "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "Lkotlinx/coroutines/channels/ReceiveChannel;", "LO9/p;", "fixedPeriodTicker", "(Lkotlinx/coroutines/CoroutineScope;J)Lkotlinx/coroutines/channels/ReceiveChannel;", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "timeoutInternal", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new InterfaceC0646l() { // from class: kotlinx.coroutines.flow.b
                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    long debounce$lambda$1$FlowKt__DelayKt;
                    debounce$lambda$1$FlowKt__DelayKt = FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j10, obj);
                    return Long.valueOf(debounce$lambda$1$FlowKt__DelayKt);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(InterfaceC0646l interfaceC0646l, Object obj) {
        return DelayKt.m100toDelayMillisLRDsOJo(((la.c) interfaceC0646l.invoke(obj)).f23590a);
    }

    @FlowPreview
    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m146debounceHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt.debounce(flow, DelayKt.m100toDelayMillisLRDsOJo(j10));
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final InterfaceC0646l<? super T, la.c> interfaceC0646l) {
        return debounceInternal$FlowKt__DelayKt(flow, new InterfaceC0646l() { // from class: kotlinx.coroutines.flow.a
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                long debounce$lambda$2$FlowKt__DelayKt;
                debounce$lambda$2$FlowKt__DelayKt = FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(InterfaceC0646l.this, obj);
                return Long.valueOf(debounce$lambda$2$FlowKt__DelayKt);
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, InterfaceC0646l<? super T, Long> interfaceC0646l) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(interfaceC0646l, flow, null));
    }

    public static final ReceiveChannel<p> fixedPeriodTicker(CoroutineScope coroutineScope, long j10) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j10, null), 1, null);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j10) {
        if (j10 > 0) {
            return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$sample$2(j10, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @FlowPreview
    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m147sampleHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt.sample(flow, DelayKt.m100toDelayMillisLRDsOJo(j10));
    }

    @FlowPreview
    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m148timeoutHG0u8IE(Flow<? extends T> flow, long j10) {
        return m149timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j10);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m149timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j10) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j10, flow, null));
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, InterfaceC0646l<? super T, Long> interfaceC0646l) {
        return debounceInternal$FlowKt__DelayKt(flow, interfaceC0646l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j10, Object obj) {
        return j10;
    }
}
