package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: Deferred.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/Deferred;", "T", "Lkotlinx/coroutines/Job;", "await", "(LT9/a;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface Deferred<T> extends Job {

    /* compiled from: Deferred.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) Job.DefaultImpls.fold(deferred, r8, interfaceC0650p);
        }

        public static <T, E extends d.b> E get(Deferred<? extends T> deferred, d.c<E> cVar) {
            return (E) Job.DefaultImpls.get(deferred, cVar);
        }

        public static <T> d minusKey(Deferred<? extends T> deferred, d.c<?> cVar) {
            return Job.DefaultImpls.minusKey(deferred, cVar);
        }

        public static <T> d plus(Deferred<? extends T> deferred, d dVar) {
            return Job.DefaultImpls.plus(deferred, dVar);
        }

        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }
    }

    Object await(T9.a<? super T> aVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @ExperimentalCoroutinesApi
    T getCompleted();

    @ExperimentalCoroutinesApi
    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}
