package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFunResult$1<E> extends FunctionReferenceImpl implements InterfaceC0651q<Throwable, ChannelResult<? extends E>, kotlin.coroutines.d, p> {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // ca.InterfaceC0651q
    public /* bridge */ /* synthetic */ p invoke(Throwable th, Object obj, kotlin.coroutines.d dVar) {
        m119invoke5_sEAP8(th, ((ChannelResult) obj).getHolder(), dVar);
        return p.f3034a;
    }

    /* renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m119invoke5_sEAP8(Throwable th, Object obj, kotlin.coroutines.d dVar) {
        ((BufferedChannel) this.receiver).m113onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, dVar);
    }
}
