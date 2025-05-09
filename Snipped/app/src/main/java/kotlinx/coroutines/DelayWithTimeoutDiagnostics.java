package kotlinx.coroutines;

import O9.p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Delay;

/* compiled from: Delay.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/DelayWithTimeoutDiagnostics;", "Lkotlinx/coroutines/Delay;", "Lla/c;", "timeout", "", "timeoutMessage-LRDsOJo", "(J)Ljava/lang/String;", "timeoutMessage", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface DelayWithTimeoutDiagnostics extends Delay {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j10, T9.a<? super p> aVar) {
            Object delay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j10, aVar);
            return delay == CoroutineSingletons.f23158a ? delay : p.f3034a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j10, Runnable runnable, d dVar) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j10, runnable, dVar);
        }
    }

    /* renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String mo101timeoutMessageLRDsOJo(long timeout);
}
