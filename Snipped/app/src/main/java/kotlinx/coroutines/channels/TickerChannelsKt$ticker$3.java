package kotlinx.coroutines.channels;

import O9.p;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TickerChannels.kt */
@V9.d(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", l = {68, 69}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TickerChannelsKt$ticker$3 extends SuspendLambda implements InterfaceC0650p<ProducerScope<? super p>, T9.a<? super p>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ long $initialDelayMillis;
    final /* synthetic */ TickerMode $mode;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: TickerChannels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TickerMode.values().length];
            try {
                iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j10, long j11, T9.a<? super TickerChannelsKt$ticker$3> aVar) {
        super(2, aVar);
        this.$mode = tickerMode;
        this.$delayMillis = j10;
        this.$initialDelayMillis = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.$mode, this.$delayMillis, this.$initialDelayMillis, aVar);
        tickerChannelsKt$ticker$3.L$0 = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fixedPeriodTicker;
        Object fixedDelayTicker;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            int i9 = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
            if (i9 == 1) {
                long j10 = this.$delayMillis;
                long j11 = this.$initialDelayMillis;
                SendChannel channel = producerScope.getChannel();
                this.label = 1;
                fixedPeriodTicker = TickerChannelsKt.fixedPeriodTicker(j10, j11, channel, this);
                if (fixedPeriodTicker == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                long j12 = this.$delayMillis;
                long j13 = this.$initialDelayMillis;
                SendChannel channel2 = producerScope.getChannel();
                this.label = 2;
                fixedDelayTicker = TickerChannelsKt.fixedDelayTicker(j12, j13, channel2, this);
                if (fixedDelayTicker == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(ProducerScope<? super p> producerScope, T9.a<? super p> aVar) {
        return ((TickerChannelsKt$ticker$3) create(producerScope, aVar)).invokeSuspend(p.f3034a);
    }
}
