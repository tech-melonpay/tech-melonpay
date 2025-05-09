package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends FunctionReferenceImpl implements InterfaceC0651q<Throwable, E, kotlin.coroutines.d, p> {
    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0651q
    public /* bridge */ /* synthetic */ p invoke(Throwable th, Object obj, kotlin.coroutines.d dVar) {
        invoke2(th, (Throwable) obj, dVar);
        return p.f3034a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th, E e10, kotlin.coroutines.d dVar) {
        ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e10, dVar);
    }
}
