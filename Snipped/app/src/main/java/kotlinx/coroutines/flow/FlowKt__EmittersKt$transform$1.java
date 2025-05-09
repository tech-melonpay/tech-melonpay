package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.bouncycastle.tls.CipherSuite;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Emitters.kt */
@V9.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", l = {36}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/flow/FlowCollector;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class FlowKt__EmittersKt$transform$1<R> extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super R>, T9.a<? super p>, Object> {
    final /* synthetic */ Flow<T> $this_transform;
    final /* synthetic */ InterfaceC0651q<FlowCollector<? super R>, T, T9.a<? super p>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Emitters.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<R> $$this$flow;
        final /* synthetic */ InterfaceC0651q<FlowCollector<? super R>, T, T9.a<? super p>, Object> $transform;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q, FlowCollector<? super R> flowCollector) {
            this.$transform = interfaceC0651q;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, T9.a<? super O9.p> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.b.b(r6)
                goto L3f
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.b.b(r6)
                ca.q<kotlinx.coroutines.flow.FlowCollector<? super R>, T, T9.a<? super O9.p>, java.lang.Object> r6 = r4.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r2 = r4.$$this$flow
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                O9.p r5 = O9.p.f3034a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1.AnonymousClass1.emit(java.lang.Object, T9.a):java.lang.Object");
        }

        public final Object emit$$forInline(T t3, T9.a<? super p> aVar) {
            new FlowKt__EmittersKt$transform$1$1$emit$1(this, aVar);
            this.$transform.invoke(this.$$this$flow, t3, aVar);
            return p.f3034a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$transform$1(Flow<? extends T> flow, InterfaceC0651q<? super FlowCollector<? super R>, ? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0651q, T9.a<? super FlowKt__EmittersKt$transform$1> aVar) {
        super(2, aVar);
        this.$this_transform = flow;
        this.$transform = interfaceC0651q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, aVar);
        flowKt__EmittersKt$transform$1.L$0 = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<T> flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, flowCollector);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p.f3034a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        this.$this_transform.collect(new AnonymousClass1(this.$transform, (FlowCollector) this.L$0), this);
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(FlowCollector<? super R> flowCollector, T9.a<? super p> aVar) {
        return ((FlowKt__EmittersKt$transform$1) create(flowCollector, aVar)).invokeSuspend(p.f3034a);
    }
}
