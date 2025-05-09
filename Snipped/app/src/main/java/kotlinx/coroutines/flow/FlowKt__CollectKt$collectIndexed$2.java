package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0651q;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Collect.kt */
@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "LO9/p;", "emit", "(Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "", FirebaseAnalytics.Param.INDEX, "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements FlowCollector<T> {
    final /* synthetic */ InterfaceC0651q<Integer, T, T9.a<? super p>, Object> $action;
    private int index;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(InterfaceC0651q<? super Integer, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q) {
        this.$action = interfaceC0651q;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t3, T9.a<? super p> aVar) {
        InterfaceC0651q<Integer, T, T9.a<? super p>, Object> interfaceC0651q = this.$action;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        Object invoke = interfaceC0651q.invoke(new Integer(i), t3, aVar);
        return invoke == CoroutineSingletons.f23158a ? invoke : p.f3034a;
    }

    public Object emit$$forInline(T t3, final T9.a<? super p> aVar) {
        new ContinuationImpl(aVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        InterfaceC0651q<Integer, T, T9.a<? super p>, Object> interfaceC0651q = this.$action;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        interfaceC0651q.invoke(Integer.valueOf(i), t3, aVar);
        return p.f3034a;
    }
}
