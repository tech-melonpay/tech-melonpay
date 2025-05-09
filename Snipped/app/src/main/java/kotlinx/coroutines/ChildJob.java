package kotlinx.coroutines;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.Job;

/* compiled from: Job.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ParentJob;", "parentJob", "LO9/p;", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface ChildJob extends Job {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) Job.DefaultImpls.fold(childJob, r8, interfaceC0650p);
        }

        public static <E extends d.b> E get(ChildJob childJob, d.c<E> cVar) {
            return (E) Job.DefaultImpls.get(childJob, cVar);
        }

        public static d minusKey(ChildJob childJob, d.c<?> cVar) {
            return Job.DefaultImpls.minusKey(childJob, cVar);
        }

        public static d plus(ChildJob childJob, d dVar) {
            return Job.DefaultImpls.plus(childJob, dVar);
        }

        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @InternalCoroutinesApi
    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}
