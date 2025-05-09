package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0646l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23231b;

    public /* synthetic */ d(Object obj, int i) {
        this.f23230a = i;
        this.f23231b = obj;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        p consumes$lambda$24$ChannelsKt__DeprecatedKt;
        p broadcast$lambda$1;
        p consumesAll$lambda$2$ChannelsKt__DeprecatedKt;
        switch (this.f23230a) {
            case 0:
                consumes$lambda$24$ChannelsKt__DeprecatedKt = ChannelsKt__DeprecatedKt.consumes$lambda$24$ChannelsKt__DeprecatedKt((ReceiveChannel) this.f23231b, (Throwable) obj);
                return consumes$lambda$24$ChannelsKt__DeprecatedKt;
            case 1:
                broadcast$lambda$1 = BroadcastKt.broadcast$lambda$1((ReceiveChannel) this.f23231b, (Throwable) obj);
                return broadcast$lambda$1;
            default:
                consumesAll$lambda$2$ChannelsKt__DeprecatedKt = ChannelsKt__DeprecatedKt.consumesAll$lambda$2$ChannelsKt__DeprecatedKt((ReceiveChannel[]) this.f23231b, (Throwable) obj);
                return consumesAll$lambda$2$ChannelsKt__DeprecatedKt;
        }
    }
}
