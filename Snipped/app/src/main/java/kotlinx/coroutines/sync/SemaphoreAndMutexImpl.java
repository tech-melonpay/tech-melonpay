package kotlinx.coroutines.sync;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ%\u0010\u0013\u001a\u00020\n2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0017\u0010\fJF\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u000e\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0019H\u0083\b¢\u0006\u0004\b\u000b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\tJ\u0013\u0010$\u001a\u00020\u0007*\u00020\u0001H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R,\u0010*\u001a\u001a\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\n0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0011\u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0011\u00103\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004R\u000b\u00104\u001a\u0002018\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004¨\u00067"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "tryAcquire", "()Z", "LO9/p;", "acquire", "(LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "waiter", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "ignoredParam", "onAcquireRegFunction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "release", "()V", "acquireSlowPath", "W", "Lkotlin/Function1;", "suspend", "onAcquired", "(Ljava/lang/Object;Lca/l;Lca/l;)V", "decPermits", "()I", "coerceAvailablePermitsAtMaximum", "Lkotlinx/coroutines/Waiter;", "addAcquireToQueue", "(Lkotlinx/coroutines/Waiter;)Z", "tryResumeNextFromQueue", "tryResumeAcquire", "(Ljava/lang/Object;)Z", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/d;", "onCancellationRelease", "Lca/q;", "getAvailablePermits", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final InterfaceC0651q<Throwable, p, d, p> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i, int i9) {
        this.permits = i;
        if (i <= 0) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i9 < 0 || i9 > i) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "The number of acquired permits should be in 0..").toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i9;
        this.onCancellationRelease = new kotlinx.coroutines.a(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(T9.a<? super p> aVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(U4.b.p(aVar));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super p>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            return result == CoroutineSingletons.f23158a ? result : p.f3034a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        int i;
        Object findSegmentInternal;
        int i9;
        Symbol symbol;
        Symbol symbol2;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        i = SemaphoreKt.SEGMENT_SIZE;
        long j10 = andIncrement / i;
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, m174getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (m174getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                m174getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
        i9 = SemaphoreKt.SEGMENT_SIZE;
        int i10 = (int) (andIncrement % i9);
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i10, null, waiter)) {
            if (acquirers.get(i10) != null) {
                symbol = SemaphoreKt.PERMIT;
                symbol2 = SemaphoreKt.TAKEN;
                AtomicReferenceArray acquirers2 = semaphoreSegment2.getAcquirers();
                while (!acquirers2.compareAndSet(i10, symbol, symbol2)) {
                    if (acquirers2.get(i10) != symbol) {
                        return false;
                    }
                }
                if (waiter instanceof CancellableContinuation) {
                    ((CancellableContinuation) waiter).resume((CancellableContinuation) p.f3034a, (InterfaceC0651q<? super Throwable, ? super CancellableContinuation, ? super d, p>) this.onCancellationRelease);
                } else {
                    if (!(waiter instanceof SelectInstance)) {
                        throw new IllegalStateException(("unexpected: " + waiter).toString());
                    }
                    ((SelectInstance) waiter).selectInRegistrationPhase(p.f3034a);
                }
                return true;
            }
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i10);
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p onCancellationRelease$lambda$2(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, p pVar, d dVar) {
        semaphoreAndMutexImpl.release();
        return p.f3034a;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j10) {
        this.deqIdx$volatile = j10;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j10) {
        this.enqIdx$volatile = j10;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i) {
        this._availablePermits$volatile = i;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (!(obj instanceof CancellableContinuation)) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, p.f3034a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object tryResume = cancellableContinuation.tryResume(p.f3034a, null, this.onCancellationRelease);
        if (tryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(tryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        int i;
        Object findSegmentInternal;
        int i9;
        Symbol symbol;
        Symbol symbol2;
        int i10;
        Symbol symbol3;
        Symbol symbol4;
        Symbol symbol5;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        i = SemaphoreKt.SEGMENT_SIZE;
        long j10 = andIncrement / i;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m174getSegmentimpl.id) {
                    break loop0;
                }
                if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, m174getSegmentimpl)) {
                    if (atomicReferenceFieldUpdater.get(this) != segment) {
                        if (m174getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            m174getSegmentimpl.remove();
                        }
                    }
                }
                if (segment.decPointers$kotlinx_coroutines_core()) {
                    segment.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
        semaphoreSegment2.cleanPrev();
        boolean z10 = false;
        if (semaphoreSegment2.id > j10) {
            return false;
        }
        i9 = SemaphoreKt.SEGMENT_SIZE;
        int i11 = (int) (andIncrement % i9);
        symbol = SemaphoreKt.PERMIT;
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i11, symbol);
        if (andSet != null) {
            symbol2 = SemaphoreKt.CANCELLED;
            if (andSet == symbol2) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        i10 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = semaphoreSegment2.getAcquirers().get(i11);
            symbol5 = SemaphoreKt.TAKEN;
            if (obj == symbol5) {
                return true;
            }
        }
        symbol3 = SemaphoreKt.PERMIT;
        symbol4 = SemaphoreKt.BROKEN;
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (true) {
            if (acquirers.compareAndSet(i11, symbol3, symbol4)) {
                z10 = true;
                break;
            }
            if (acquirers.get(i11) != symbol3) {
                break;
            }
        }
        return !z10;
    }

    public final Object acquire(T9.a<? super p> aVar) {
        if (decPermits() > 0) {
            return p.f3034a;
        }
        Object acquireSlowPath = acquireSlowPath(aVar);
        return acquireSlowPath == CoroutineSingletons.f23158a ? acquireSlowPath : p.f3034a;
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> select, Object ignoredParam) {
        while (decPermits() <= 0) {
            if (addAcquireToQueue((Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(p.f3034a);
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W waiter, InterfaceC0646l<? super W, Boolean> suspend, InterfaceC0646l<? super W, p> onAcquired) {
        while (decPermits() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    public final void acquire(CancellableContinuation<? super p> waiter) {
        while (decPermits() <= 0) {
            if (addAcquireToQueue((Waiter) waiter)) {
                return;
            }
        }
        waiter.resume((CancellableContinuation<? super p>) p.f3034a, this.onCancellationRelease);
    }
}
