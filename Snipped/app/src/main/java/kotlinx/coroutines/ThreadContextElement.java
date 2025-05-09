package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/d$b;", "Lkotlin/coroutines/d;", "context", "updateThreadContext", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "oldState", "LO9/p;", "restoreThreadContext", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface ThreadContextElement<S> extends d.b {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return interfaceC0650p.invoke(r8, threadContextElement);
        }

        public static <S, E extends d.b> E get(ThreadContextElement<S> threadContextElement, d.c<E> cVar) {
            return (E) d.b.a.a(threadContextElement, cVar);
        }

        public static <S> d minusKey(ThreadContextElement<S> threadContextElement, d.c<?> cVar) {
            return d.b.a.b(threadContextElement, cVar);
        }

        public static <S> d plus(ThreadContextElement<S> threadContextElement, d dVar) {
            return d.a.a(threadContextElement, dVar);
        }
    }

    @Override // kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    @Override // kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);

    void restoreThreadContext(d context, S oldState);

    S updateThreadContext(d context);
}
