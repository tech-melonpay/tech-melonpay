package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* compiled from: BufferedChannel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements InterfaceC0651q<BufferedChannel<?>, SelectInstance<?>, Object, p> {
    public static final BufferedChannel$onSend$1 INSTANCE = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // ca.InterfaceC0651q
    public /* bridge */ /* synthetic */ p invoke(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        invoke2(bufferedChannel, selectInstance, obj);
        return p.f3034a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BufferedChannel<?> bufferedChannel, SelectInstance<?> selectInstance, Object obj) {
        bufferedChannel.registerSelectForSend(selectInstance, obj);
    }
}
