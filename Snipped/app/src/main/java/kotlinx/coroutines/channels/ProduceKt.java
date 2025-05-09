package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0089\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001e\b\u0002\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u00162*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001a\u0093\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001e\b\u0002\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014j\u0004\u0018\u0001`\u00162*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/Function0;", "LO9/p;", "block", "awaitClose", "(Lkotlinx/coroutines/channels/ProducerScope;Lca/a;LT9/a;)Ljava/lang/Object;", "E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlin/Function2;", "LT9/a;", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produce", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;ILca/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineStart;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;ILkotlinx/coroutines/CoroutineStart;Lca/l;Lca/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lca/l;Lca/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitClose(kotlinx.coroutines.channels.ProducerScope<?> r4, ca.InterfaceC0635a<O9.p> r5, T9.a<? super O9.p> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            ca.a r5 = (ca.InterfaceC0635a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r4 = move-exception
            goto L70
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.b.b(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.INSTANCE
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L74
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L30
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L30
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L30
            T9.a r0 = U4.b.p(r0)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L30
            r6.initCancellability()     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch: java.lang.Throwable -> L30
            r0.<init>()     // Catch: java.lang.Throwable -> L30
            r4.invokeOnClose(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L30
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5.invoke()
            O9.p r4 = O9.p.f3034a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.awaitClose(kotlinx.coroutines.channels.ProducerScope, ca.a, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, InterfaceC0635a interfaceC0635a, T9.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC0635a = new f();
        }
        return awaitClose(producerScope, interfaceC0635a, aVar);
    }

    @ExperimentalCoroutinesApi
    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, InterfaceC0650p<? super ProducerScope<? super E>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return produce(coroutineScope, dVar, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, interfaceC0650p);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        if ((i9 & 2) != 0) {
            i = 0;
        }
        return produce(coroutineScope, dVar, i, interfaceC0650p);
    }

    @InternalCoroutinesApi
    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l<? super Throwable, p> interfaceC0646l, InterfaceC0650p<? super ProducerScope<? super E>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        return produce(coroutineScope, dVar, i, BufferOverflow.SUSPEND, coroutineStart, interfaceC0646l, interfaceC0650p);
    }

    public static final <E> ReceiveChannel<E> produce(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC0646l<? super Throwable, p> interfaceC0646l, InterfaceC0650p<? super ProducerScope<? super E>, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, dVar), ChannelKt.Channel$default(i, bufferOverflow, null, 4, null));
        if (interfaceC0646l != null) {
            producerCoroutine.invokeOnCompletion(interfaceC0646l);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, interfaceC0650p);
        return producerCoroutine;
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, CoroutineStart coroutineStart, InterfaceC0646l interfaceC0646l, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        kotlin.coroutines.d dVar2 = dVar;
        if ((i9 & 2) != 0) {
            i = 0;
        }
        int i10 = i;
        if ((i9 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 8) != 0) {
            interfaceC0646l = null;
        }
        return produce(coroutineScope, dVar2, i10, coroutineStart2, interfaceC0646l, interfaceC0650p);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC0646l interfaceC0646l, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        kotlin.coroutines.d dVar2 = dVar;
        if ((i9 & 2) != 0) {
            i = 0;
        }
        int i10 = i;
        if ((i9 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i9 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i9 & 16) != 0) {
            interfaceC0646l = null;
        }
        return produce(coroutineScope, dVar2, i10, bufferOverflow2, coroutineStart2, interfaceC0646l, interfaceC0650p);
    }
}
