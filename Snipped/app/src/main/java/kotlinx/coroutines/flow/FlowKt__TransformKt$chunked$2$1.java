package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Transform.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref$ObjectRef<ArrayList<T>> $result;
    final /* synthetic */ int $size;
    final /* synthetic */ FlowCollector<List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$chunked$2$1(Ref$ObjectRef<ArrayList<T>> ref$ObjectRef, int i, FlowCollector<? super List<? extends T>> flowCollector) {
        this.$result = ref$ObjectRef;
        this.$size = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r5, T9.a<? super O9.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r5 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1) r5
            kotlin.b.b(r6)
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r6 = r4.$result
            T r6 = r6.f23179a
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L49
            java.util.ArrayList r6 = new java.util.ArrayList
            int r2 = r4.$size
            r6.<init>(r2)
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r2 = r4.$result
            r2.f23179a = r6
        L49:
            r6.add(r5)
            int r5 = r6.size()
            int r2 = r4.$size
            if (r5 != r2) goto L67
            kotlinx.coroutines.flow.FlowCollector<java.util.List<? extends T>> r5 = r4.$this_flow
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            r5 = r4
        L62:
            kotlin.jvm.internal.Ref$ObjectRef<java.util.ArrayList<T>> r5 = r5.$result
            r6 = 0
            r5.f23179a = r6
        L67:
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1.emit(java.lang.Object, T9.a):java.lang.Object");
    }
}
