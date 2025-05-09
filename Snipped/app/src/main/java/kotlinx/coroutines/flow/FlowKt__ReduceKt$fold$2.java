package kotlinx.coroutines.flow;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.tls.CipherSuite;

/* compiled from: Reduce.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = CipherSuite.TLS_PSK_WITH_NULL_SHA256)
/* loaded from: classes2.dex */
public final class FlowKt__ReduceKt$fold$2<T> implements FlowCollector {
    final /* synthetic */ Ref$ObjectRef<R> $accumulator;
    final /* synthetic */ InterfaceC0651q<R, T, T9.a<? super R>, Object> $operation;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$fold$2(Ref$ObjectRef<R> ref$ObjectRef, InterfaceC0651q<? super R, ? super T, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        this.$accumulator = ref$ObjectRef;
        this.$operation = interfaceC0651q;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, T9.a<? super O9.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            kotlin.b.b(r8)
            goto L4a
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.b.b(r8)
            kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.$accumulator
            ca.q<R, T, T9.a<? super R>, java.lang.Object> r2 = r6.$operation
            T r4 = r8.f23179a
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = r2.invoke(r4, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r5 = r8
            r8 = r7
            r7 = r5
        L4a:
            r7.f23179a = r8
            O9.p r7 = O9.p.f3034a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2.emit(java.lang.Object, T9.a):java.lang.Object");
    }

    public final Object emit$$forInline(T t3, T9.a<? super p> aVar) {
        new FlowKt__ReduceKt$fold$2$emit$1(this, aVar);
        Ref$ObjectRef<R> ref$ObjectRef = this.$accumulator;
        ref$ObjectRef.f23179a = (T) this.$operation.invoke(ref$ObjectRef.f23179a, t3, aVar);
        return p.f3034a;
    }
}
