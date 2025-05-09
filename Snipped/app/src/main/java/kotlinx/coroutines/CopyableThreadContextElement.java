package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChild", "()Lkotlinx/coroutines/CopyableThreadContextElement;", "Lkotlin/coroutines/d$b;", "overwritingElement", "Lkotlin/coroutines/d;", "mergeForChild", "(Lkotlin/coroutines/d$b;)Lkotlin/coroutines/d;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
/* loaded from: classes2.dex */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r8, interfaceC0650p);
        }

        public static <S, E extends d.b> E get(CopyableThreadContextElement<S> copyableThreadContextElement, d.c<E> cVar) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, cVar);
        }

        public static <S> d minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, d.c<?> cVar) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, cVar);
        }

        public static <S> d plus(CopyableThreadContextElement<S> copyableThreadContextElement, d dVar) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, dVar);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    d mergeForChild(d.b overwritingElement);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}
