package kotlinx.coroutines;

import O9.p;
import ja.h;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Job;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0017\u001a\u00020\u0011*\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u001f\u0010\u0017\u001a\u00020\u0011*\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0017\u0010\u001b\u001a#\u0010\u001d\u001a\u00020\u0011*\u00020\u001c2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0011*\u00020\u0000¢\u0006\u0004\b \u0010\u0019\u001a\u0011\u0010 \u001a\u00020\u0011*\u00020\u001c¢\u0006\u0004\b \u0010\u001f\u001a%\u0010\u001d\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010#\u001a\u001f\u0010\u001d\u001a\u00020\u0001*\u00020\u001c2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010$\u001a#\u0010\u0017\u001a\u00020\u0011*\u00020\u001c2\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u001e\u001a\u0013\u0010\u0017\u001a\u00020\u0011*\u00020\u001cH\u0007¢\u0006\u0004\b\u0017\u0010\u001f\u001a\u001f\u0010\u0017\u001a\u00020\u0011*\u00020\u001c2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u0017\u0010%\u001a\u001d\u0010)\u001a\u00020\u001a*\u0004\u0018\u00010\u001a2\u0006\u0010&\u001a\u00020\u0000H\u0002¢\u0006\u0004\b'\u0010(\"\u0015\u0010*\u001a\u00020\u0001*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0015\u0010&\u001a\u00020\u0000*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lkotlinx/coroutines/Job;", "", "invokeImmediately", "Lkotlinx/coroutines/JobNode;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlinx/coroutines/Job;ZLkotlinx/coroutines/JobNode;)Lkotlinx/coroutines/DisposableHandle;", "parent", "Lkotlinx/coroutines/CompletableJob;", "Job", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "Job0", "handle", "disposeOnCompletion", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/DisposableHandle;)Lkotlinx/coroutines/DisposableHandle;", "LO9/p;", "cancelAndJoin", "(Lkotlinx/coroutines/Job;LT9/a;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "cancelChildren", "(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;)V", "(Lkotlinx/coroutines/Job;)V", "", "(Lkotlinx/coroutines/Job;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/d;", "cancel", "(Lkotlin/coroutines/d;Ljava/util/concurrent/CancellationException;)V", "(Lkotlin/coroutines/d;)V", "ensureActive", "", "message", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)Z", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "job", "orCancellation$JobKt__JobKt", "(Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "orCancellation", "isActive", "(Lkotlin/coroutines/d;)Z", "getJob", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class JobKt__JobKt {
    public static final CompletableJob Job(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    public static final void cancel(d dVar, CancellationException cancellationException) {
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(d dVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(dVar, cancellationException);
    }

    public static final Object cancelAndJoin(Job job, T9.a<? super p> aVar) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object join = job.join(aVar);
        return join == CoroutineSingletons.f23158a ? join : p.f3034a;
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final void ensureActive(Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final Job getJob(d dVar) {
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z10, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z10, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z10, new JobKt__JobKt$invokeOnCompletion$1(jobNode));
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z10, JobNode jobNode, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = true;
        }
        return JobKt.invokeOnCompletion(job, z10, jobNode);
    }

    public static final boolean isActive(d dVar) {
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th, Job job) {
        return th == null ? new JobCancellationException("Job was cancelled", null, job) : th;
    }

    /* renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m104Job(Job job) {
        return JobKt.Job(job);
    }

    /* renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m105Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m104Job(job);
    }

    public static /* synthetic */ void cancel$default(Job job, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        JobKt.cancel(job, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(Job job, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(job, th);
    }

    public static final void ensureActive(d dVar) {
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    public static final void cancel(Job job, String str, Throwable th) {
        job.cancel(ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ boolean cancel$default(d dVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(dVar, th);
    }

    public static /* synthetic */ void cancelChildren$default(d dVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(dVar, cancellationException);
    }

    public static final /* synthetic */ boolean cancel(d dVar, Throwable th) {
        d.b bVar = dVar.get(Job.INSTANCE);
        JobSupport jobSupport = bVar instanceof JobSupport ? (JobSupport) bVar : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, jobSupport));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(d dVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(dVar, th);
    }

    public static final /* synthetic */ void cancelChildren(Job job, Throwable th) {
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static final void cancelChildren(d dVar, CancellationException cancellationException) {
        h<Job> children;
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator<Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static final /* synthetic */ void cancelChildren(d dVar, Throwable th) {
        Job job = (Job) dVar.get(Job.INSTANCE);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }
}
