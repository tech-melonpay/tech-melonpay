package kotlinx.coroutines;

import ca.InterfaceC0650p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.Job;

/* compiled from: Job.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003H'¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "getChildJobCancellationCause", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ParentJob extends Job {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r8, InterfaceC0650p<? super R, ? super d.b, ? extends R> interfaceC0650p) {
            return (R) Job.DefaultImpls.fold(parentJob, r8, interfaceC0650p);
        }

        public static <E extends d.b> E get(ParentJob parentJob, d.c<E> cVar) {
            return (E) Job.DefaultImpls.get(parentJob, cVar);
        }

        public static d minusKey(ParentJob parentJob, d.c<?> cVar) {
            return Job.DefaultImpls.minusKey(parentJob, cVar);
        }

        public static d plus(ParentJob parentJob, d dVar) {
            return Job.DefaultImpls.plus(parentJob, dVar);
        }

        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }
    }

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ Object fold(Object obj, InterfaceC0650p interfaceC0650p);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d.b get(d.c cVar);

    @InternalCoroutinesApi
    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d.b
    /* synthetic */ d.c getKey();

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d minusKey(d.c cVar);

    @Override // kotlinx.coroutines.Job, kotlin.coroutines.d
    /* synthetic */ d plus(d dVar);
}
