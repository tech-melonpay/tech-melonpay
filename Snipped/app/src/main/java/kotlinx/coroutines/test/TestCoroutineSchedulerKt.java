package kotlinx.coroutines.test;

import ca.InterfaceC0646l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* compiled from: TestCoroutineScheduler.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0017\u001a\u00020\u0015\"\u0012\b\u0000\u0010\u0012*\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "currentTimeAheadOfEvents", "()Ljava/lang/Void;", "invalidSchedulerState", "", "a", "b", "addClamping", "(JJ)J", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "scheduler", "Lkotlin/coroutines/d;", "context", "LO9/p;", "checkSchedulerInContext", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;Lkotlin/coroutines/d;)V", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlin/Function1;", "", "predicate", "none", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;Lca/l;)Z", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineSchedulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long addClamping(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static final void checkSchedulerInContext(TestCoroutineScheduler testCoroutineScheduler, kotlin.coroutines.d dVar) {
        TestCoroutineScheduler testCoroutineScheduler2 = (TestCoroutineScheduler) dVar.get(TestCoroutineScheduler.Key);
        if (testCoroutineScheduler2 != null && testCoroutineScheduler2 != testCoroutineScheduler) {
            throw new IllegalStateException("Detected use of different schedulers. If you need to use several test coroutine dispatchers, create one `TestCoroutineScheduler` and pass it to each of them.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void currentTimeAheadOfEvents() {
        invalidSchedulerState();
        throw new KotlinNothingValueException();
    }

    private static final Void invalidSchedulerState() {
        throw new IllegalStateException("The test scheduler entered an invalid state. Please report this at https://github.com/Kotlin/kotlinx.coroutines/issues.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ThreadSafeHeapNode & Comparable<? super T>> boolean none(ThreadSafeHeap<T> threadSafeHeap, InterfaceC0646l<? super T, Boolean> interfaceC0646l) {
        return threadSafeHeap.find(interfaceC0646l) == null;
    }
}
