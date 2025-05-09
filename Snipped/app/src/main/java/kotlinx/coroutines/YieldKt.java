package kotlinx.coroutines;

import O9.p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LO9/p;", "yield", "(LT9/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class YieldKt {
    public static final Object yield(T9.a<? super p> aVar) {
        Object obj;
        d context = aVar.getContext();
        JobKt.ensureActive(context);
        T9.a p10 = U4.b.p(aVar);
        DispatchedContinuation dispatchedContinuation = p10 instanceof DispatchedContinuation ? (DispatchedContinuation) p10 : null;
        if (dispatchedContinuation == null) {
            obj = p.f3034a;
        } else {
            if (dispatchedContinuation.dispatcher.isDispatchNeeded(context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, p.f3034a);
            } else {
                YieldContext yieldContext = new YieldContext();
                d plus = context.plus(yieldContext);
                p pVar = p.f3034a;
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(plus, pVar);
                if (yieldContext.dispatcherWasUnconfined) {
                    obj = DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation) ? CoroutineSingletons.f23158a : pVar;
                }
            }
            obj = CoroutineSingletons.f23158a;
        }
        return obj == CoroutineSingletons.f23158a ? obj : p.f3034a;
    }
}
