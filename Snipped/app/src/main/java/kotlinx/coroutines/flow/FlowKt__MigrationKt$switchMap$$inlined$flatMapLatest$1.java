package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.bouncycastle.tls.CipherSuite;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: Merge.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", l = {CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n¨\u0006\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "LO9/p;", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, T, T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0650p $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(InterfaceC0650p interfaceC0650p, T9.a aVar) {
        super(3, aVar);
        this.$transform = interfaceC0650p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0651q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, T9.a<? super p> aVar) {
        return invoke((FlowCollector) obj, (FlowCollector<? super R>) obj2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object obj2 = this.L$1;
            InterfaceC0650p interfaceC0650p = this.$transform;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = interfaceC0650p.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return p.f3034a;
            }
            flowCollector = (FlowCollector) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p.f3034a;
    }

    public final Object invoke(FlowCollector<? super R> flowCollector, T t3, T9.a<? super p> aVar) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, aVar);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = flowCollector;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = t3;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(p.f3034a);
    }
}
