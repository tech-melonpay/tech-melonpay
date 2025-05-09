package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: Delay.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements InterfaceC0646l<T9.a<?>, Object> {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j10, T9.a<? super FlowKt__DelayKt$timeoutInternal$1$1$2> aVar) {
        super(1, aVar);
        this.$timeout = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(T9.a<?> aVar) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, aVar);
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(T9.a<?> aVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) la.c.m(this.$timeout)));
    }
}
