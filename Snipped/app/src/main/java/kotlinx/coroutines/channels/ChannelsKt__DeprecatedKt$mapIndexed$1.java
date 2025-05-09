package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Deprecated.kt */
@V9.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", l = {374, 375, 375}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/channels/ProducerScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ChannelsKt__DeprecatedKt$mapIndexed$1<R> extends SuspendLambda implements InterfaceC0650p<ProducerScope<? super R>, T9.a<? super p>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
    final /* synthetic */ InterfaceC0651q<Integer, E, T9.a<? super R>, Object> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel<? extends E> receiveChannel, InterfaceC0651q<? super Integer, ? super E, ? super T9.a<? super R>, ? extends Object> interfaceC0651q, T9.a<? super ChannelsKt__DeprecatedKt$mapIndexed$1> aVar) {
        super(2, aVar);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = interfaceC0651q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, aVar);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a5 -> B:7:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L46
            if (r1 == r4) goto L38
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.b.b(r12)
            r12 = r6
            goto L57
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            java.lang.Object r6 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r7 = (kotlinx.coroutines.channels.ProducerScope) r7
            kotlin.b.b(r12)
            goto L93
        L38:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r6 = (kotlinx.coroutines.channels.ProducerScope) r6
            kotlin.b.b(r12)
            goto L69
        L46:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r11.$this_mapIndexed
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r5 = 0
            r10 = r5
            r5 = r1
            r1 = r10
        L57:
            r11.L$0 = r12
            r11.L$1 = r5
            r11.I$0 = r1
            r11.label = r4
            java.lang.Object r6 = r5.hasNext(r11)
            if (r6 != r0) goto L66
            return r0
        L66:
            r10 = r6
            r6 = r12
            r12 = r10
        L69:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La8
            java.lang.Object r12 = r5.next()
            ca.q<java.lang.Integer, E, T9.a<? super R>, java.lang.Object> r7 = r11.$transform
            int r8 = r1 + 1
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r1)
            r11.L$0 = r6
            r11.L$1 = r5
            r11.L$2 = r6
            r11.I$0 = r8
            r11.label = r3
            java.lang.Object r12 = r7.invoke(r9, r12, r11)
            if (r12 != r0) goto L8f
            return r0
        L8f:
            r7 = r6
            r1 = r8
            r6 = r5
            r5 = r7
        L93:
            r11.L$0 = r7
            r11.L$1 = r6
            r8 = 0
            r11.L$2 = r8
            r11.I$0 = r1
            r11.label = r2
            java.lang.Object r12 = r5.send(r12, r11)
            if (r12 != r0) goto La5
            return r0
        La5:
            r5 = r6
            r12 = r7
            goto L57
        La8:
            O9.p r12 = O9.p.f3034a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(ProducerScope<? super R> producerScope, T9.a<? super p> aVar) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(producerScope, aVar)).invokeSuspend(p.f3034a);
    }
}
