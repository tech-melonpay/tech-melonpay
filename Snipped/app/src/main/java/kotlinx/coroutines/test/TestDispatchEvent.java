package kotlinx.coroutines.test;

import C.v;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* compiled from: TestCoroutineScheduler.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00022\u00020\u0003B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\t\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lkotlinx/coroutines/test/TestDispatchEvent;", "T", "", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "Lkotlinx/coroutines/test/TestDispatcher;", "dispatcher", "", "count", "time", "marker", "", "isForeground", "Lkotlin/Function0;", "isCancelled", "<init>", "(Lkotlinx/coroutines/test/TestDispatcher;JJLjava/lang/Object;ZLca/a;)V", "other", "", "compareTo", "(Lkotlinx/coroutines/test/TestDispatchEvent;)I", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/test/TestDispatcher;", "J", "Ljava/lang/Object;", "Z", "Lca/a;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", FirebaseAnalytics.Param.INDEX, "I", "getIndex", "()I", "setIndex", "(I)V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TestDispatchEvent<T> implements Comparable<TestDispatchEvent<?>>, ThreadSafeHeapNode {
    private final long count;
    public final TestDispatcher dispatcher;
    private ThreadSafeHeap<?> heap;
    private int index;
    public final InterfaceC0635a<Boolean> isCancelled;
    public final boolean isForeground;
    public final T marker;
    public final long time;

    public TestDispatchEvent(TestDispatcher testDispatcher, long j10, long j11, T t3, boolean z10, InterfaceC0635a<Boolean> interfaceC0635a) {
        this.dispatcher = testDispatcher;
        this.count = j10;
        this.time = j11;
        this.marker = t3;
        this.isForeground = z10;
        this.isCancelled = interfaceC0635a;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public ThreadSafeHeap<?> getHeap() {
        return this.heap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public int getIndex() {
        return this.index;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setHeap(ThreadSafeHeap<?> threadSafeHeap) {
        this.heap = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public void setIndex(int i) {
        this.index = i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TestDispatchEvent(time=");
        sb2.append(this.time);
        sb2.append(", dispatcher=");
        sb2.append(this.dispatcher);
        return v.q(sb2, this.isForeground ? "" : ", background", ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(TestDispatchEvent<?> other) {
        InterfaceC0646l[] interfaceC0646lArr = {new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, ia.InterfaceC0842j
            public Object get(Object obj) {
                return Long.valueOf(((TestDispatchEvent) obj).time);
            }
        }, new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestDispatchEvent$compareTo$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, ia.InterfaceC0842j
            public Object get(Object obj) {
                long j10;
                j10 = ((TestDispatchEvent) obj).count;
                return Long.valueOf(j10);
            }
        }};
        for (int i = 0; i < 2; i++) {
            InterfaceC0646l interfaceC0646l = interfaceC0646lArr[i];
            int a10 = R9.a.a((Comparable) interfaceC0646l.invoke(this), (Comparable) interfaceC0646l.invoke(other));
            if (a10 != 0) {
                return a10;
            }
        }
        return 0;
    }
}
