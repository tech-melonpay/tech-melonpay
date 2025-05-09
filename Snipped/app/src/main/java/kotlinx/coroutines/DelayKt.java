package kotlinx.coroutines;

import O9.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import la.c;
import la.e;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0006\u001a\u00020\u000f*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "awaitCancellation", "(LT9/a;)Ljava/lang/Object;", "", "timeMillis", "LO9/p;", "delay", "(JLT9/a;)Ljava/lang/Object;", "Lla/c;", "duration", "delay-VtjQ1oo", "toDelayMillis-LRDsOJo", "(J)J", "toDelayMillis", "Lkotlin/coroutines/d;", "Lkotlinx/coroutines/Delay;", "getDelay", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitCancellation(T9.a<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.b.b(r4)
            goto L47
        L2f:
            kotlin.b.b(r4)
            r0.label = r3
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            T9.a r0 = U4.b.p(r0)
            r4.<init>(r0, r3)
            r4.initCancellability()
            java.lang.Object r4 = r4.getResult()
            if (r4 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DelayKt.awaitCancellation(T9.a):java.lang.Object");
    }

    public static final Object delay(long j10, T9.a<? super p> aVar) {
        if (j10 <= 0) {
            return p.f3034a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(U4.b.p(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (j10 < Long.MAX_VALUE) {
            getDelay(cancellableContinuationImpl.getContext()).mo169scheduleResumeAfterDelay(j10, cancellableContinuationImpl);
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.f23158a ? result : p.f3034a;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m99delayVtjQ1oo(long j10, T9.a<? super p> aVar) {
        Object delay = delay(m100toDelayMillisLRDsOJo(j10), aVar);
        return delay == CoroutineSingletons.f23158a ? delay : p.f3034a;
    }

    public static final Delay getDelay(d dVar) {
        d.b bVar = dVar.get(c.a.f23157a);
        Delay delay = bVar instanceof Delay ? (Delay) bVar : null;
        return delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m100toDelayMillisLRDsOJo(long j10) {
        c.a aVar = la.c.f23587b;
        boolean z10 = j10 > 0;
        if (z10) {
            return la.c.e(la.c.k(j10, e.g(999999L, DurationUnit.NANOSECONDS)));
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
