package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Zip.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__ZipKt$combine$1$1<R> extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super R>, Object[], T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0651q<T1, T2, T9.a<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(InterfaceC0651q<? super T1, ? super T2, ? super T9.a<? super R>, ? extends Object> interfaceC0651q, T9.a<? super FlowKt__ZipKt$combine$1$1> aVar) {
        super(3, aVar);
        this.$transform = interfaceC0651q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object obj2 = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            InterfaceC0651q<T1, T2, T9.a<? super R>, Object> interfaceC0651q = this.$transform;
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            this.L$0 = flowCollector;
            this.label = 1;
            obj = interfaceC0651q.invoke(obj3, obj4, this);
            if (obj == obj2) {
                return obj2;
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
        if (flowCollector.emit(obj, this) == obj2) {
            return obj2;
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, T9.a<? super p> aVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, aVar);
        flowKt__ZipKt$combine$1$1.L$0 = flowCollector;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(p.f3034a);
    }
}
