package kotlinx.coroutines;

import O9.p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Delay.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "", "time", "LO9/p;", "delay", "(JLT9/a;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/d;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/d;)Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface Delay {

    /* compiled from: Delay.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object delay(Delay delay, long j10, T9.a<? super p> aVar) {
            if (j10 <= 0) {
                return p.f3034a;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo169scheduleResumeAfterDelay(j10, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            return result == CoroutineSingletons.f23158a ? result : p.f3034a;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j10, Runnable runnable, d dVar) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j10, runnable, dVar);
        }
    }

    Object delay(long j10, T9.a<? super p> aVar);

    DisposableHandle invokeOnTimeout(long timeMillis, Runnable block, d context);

    /* renamed from: scheduleResumeAfterDelay */
    void mo169scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super p> continuation);
}
