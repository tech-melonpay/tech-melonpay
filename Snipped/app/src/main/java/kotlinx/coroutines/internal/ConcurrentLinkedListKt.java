package kotlinx.coroutines.internal;

import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLca/p;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILca/l;)Z", "POINTERS_SHIFT", "I", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, InterfaceC0646l<? super Integer, Boolean> interfaceC0646l) {
        int i9;
        do {
            i9 = atomicIntegerFieldUpdater.get(obj);
            if (!interfaceC0646l.invoke(Integer.valueOf(i9)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i9, i9 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i, int i9, InterfaceC0646l<? super Integer, Boolean> interfaceC0646l) {
        int i10;
        do {
            i10 = atomicIntegerArray.get(i);
            if (!interfaceC0646l.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i10, i10 + i9));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n10) {
        while (true) {
            Object nextOrClosed = n10.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n10;
            }
            ?? r02 = (ConcurrentLinkedListNode) nextOrClosed;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.markAsClosed()) {
                return n10;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j10, S s10, InterfaceC0650p<? super Long, ? super S, ? extends S> interfaceC0650p) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s10, j10, interfaceC0650p);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, m174getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(obj) != segment) {
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
        return findSegmentInternal;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, long j10, S s10, InterfaceC0650p<? super Long, ? super S, ? extends S> interfaceC0650p) {
        Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(s10, j10, interfaceC0650p);
            if (!SegmentOrClosed.m176isClosedimpl(findSegmentInternal)) {
                Segment m174getSegmentimpl = SegmentOrClosed.m174getSegmentimpl(findSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceArray.get(i);
                    if (segment.id >= m174getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m174getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceArray.compareAndSet(i, segment, m174getSegmentimpl)) {
                        if (atomicReferenceArray.get(i) != segment) {
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
        return findSegmentInternal;
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s10, long j10, InterfaceC0650p<? super Long, ? super S, ? extends S> interfaceC0650p) {
        while (true) {
            if (s10.id >= j10 && !s10.isRemoved()) {
                return SegmentOrClosed.m171constructorimpl(s10);
            }
            Object nextOrClosed = s10.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m171constructorimpl(CLOSED);
            }
            S s11 = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (s11 == null) {
                s11 = interfaceC0650p.invoke(Long.valueOf(s10.id + 1), s10);
                if (s10.trySetNext(s11)) {
                    if (s10.isRemoved()) {
                        s10.remove();
                    }
                }
            }
            s10 = s11;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s10) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s10.id) {
                return true;
            }
            if (!s10.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, s10)) {
                if (atomicReferenceFieldUpdater.get(obj) != segment) {
                    if (s10.decPointers$kotlinx_coroutines_core()) {
                        s10.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, S s10) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i);
            if (segment.id >= s10.id) {
                return true;
            }
            if (!s10.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceArray.compareAndSet(i, segment, s10)) {
                if (atomicReferenceArray.get(i) != segment) {
                    if (s10.decPointers$kotlinx_coroutines_core()) {
                        s10.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }
}
