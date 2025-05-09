package kotlinx.coroutines.internal;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlin/coroutines/d;", "context", "", "threadContextElements", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "LO9/p;", "restoreThreadContext", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Lkotlin/coroutines/d$b;", "countAll", "Lca/p;", "Lkotlinx/coroutines/ThreadContextElement;", "findOne", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final InterfaceC0650p<Object, d.b, Object> countAll;
    private static final InterfaceC0650p<ThreadContextElement<?>, d.b, ThreadContextElement<?>> findOne;
    private static final InterfaceC0650p<ThreadState, d.b, ThreadState> updateState;

    static {
        final int i = 1;
        countAll = new InterfaceC0650p() { // from class: kotlinx.coroutines.internal.c
            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                ThreadState updateState$lambda$2;
                Object countAll$lambda$0;
                ThreadContextElement findOne$lambda$1;
                switch (i) {
                    case 0:
                        updateState$lambda$2 = ThreadContextKt.updateState$lambda$2((ThreadState) obj, (d.b) obj2);
                        return updateState$lambda$2;
                    case 1:
                        countAll$lambda$0 = ThreadContextKt.countAll$lambda$0(obj, (d.b) obj2);
                        return countAll$lambda$0;
                    default:
                        findOne$lambda$1 = ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (d.b) obj2);
                        return findOne$lambda$1;
                }
            }
        };
        final int i9 = 2;
        findOne = new InterfaceC0650p() { // from class: kotlinx.coroutines.internal.c
            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                ThreadState updateState$lambda$2;
                Object countAll$lambda$0;
                ThreadContextElement findOne$lambda$1;
                switch (i9) {
                    case 0:
                        updateState$lambda$2 = ThreadContextKt.updateState$lambda$2((ThreadState) obj, (d.b) obj2);
                        return updateState$lambda$2;
                    case 1:
                        countAll$lambda$0 = ThreadContextKt.countAll$lambda$0(obj, (d.b) obj2);
                        return countAll$lambda$0;
                    default:
                        findOne$lambda$1 = ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (d.b) obj2);
                        return findOne$lambda$1;
                }
            }
        };
        final int i10 = 0;
        updateState = new InterfaceC0650p() { // from class: kotlinx.coroutines.internal.c
            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                ThreadState updateState$lambda$2;
                Object countAll$lambda$0;
                ThreadContextElement findOne$lambda$1;
                switch (i10) {
                    case 0:
                        updateState$lambda$2 = ThreadContextKt.updateState$lambda$2((ThreadState) obj, (d.b) obj2);
                        return updateState$lambda$2;
                    case 1:
                        countAll$lambda$0 = ThreadContextKt.countAll$lambda$0(obj, (d.b) obj2);
                        return countAll$lambda$0;
                    default:
                        findOne$lambda$1 = ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (d.b) obj2);
                        return findOne$lambda$1;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, d.b bVar) {
        if (!(bVar instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement<?> findOne$lambda$1(ThreadContextElement<?> threadContextElement, d.b bVar) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (bVar instanceof ThreadContextElement) {
            return (ThreadContextElement) bVar;
        }
        return null;
    }

    public static final void restoreThreadContext(d dVar, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(dVar);
        } else {
            ((ThreadContextElement) dVar.fold(null, findOne)).restoreThreadContext(dVar, obj);
        }
    }

    public static final Object threadContextElements(d dVar) {
        return dVar.fold(0, countAll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, d.b bVar) {
        if (bVar instanceof ThreadContextElement) {
            ThreadContextElement<?> threadContextElement = (ThreadContextElement) bVar;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(d dVar, Object obj) {
        if (obj == null) {
            obj = threadContextElements(dVar);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? dVar.fold(new ThreadState(dVar, ((Number) obj).intValue()), updateState) : ((ThreadContextElement) obj).updateThreadContext(dVar);
    }
}
