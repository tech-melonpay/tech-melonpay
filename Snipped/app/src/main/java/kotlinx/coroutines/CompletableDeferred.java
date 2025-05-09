package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.Deferred;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CompletableDeferred;", "T", "Lkotlinx/coroutines/Deferred;", "complete", "", "value", "(Ljava/lang/Object;)Z", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CompletableDeferred<T> extends Deferred<T> {

    /* compiled from: CompletableDeferred.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r8, interfaceC0650p);
        }

        public static <T, E extends d.b> E get(CompletableDeferred<T> completableDeferred, d.c<E> cVar) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, cVar);
        }

        public static <T> d minusKey(CompletableDeferred<T> completableDeferred, d.c<?> cVar) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, cVar);
        }

        public static <T> d plus(CompletableDeferred<T> completableDeferred, d dVar) {
            return Deferred.DefaultImpls.plus(completableDeferred, dVar);
        }

        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }

    boolean complete(T value);

    boolean completeExceptionally(Throwable exception);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}
