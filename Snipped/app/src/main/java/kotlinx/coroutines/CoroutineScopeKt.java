package kotlinx.coroutines;

import ca.InterfaceC0650p;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001c\u0010\u001d\"\u001b\u0010\u001f\u001a\u00020\u001e*\u00020\u00008F¢\u0006\f\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/d;", "context", "plus", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/d;)Lkotlinx/coroutines/CoroutineScope;", "MainScope", "()Lkotlinx/coroutines/CoroutineScope;", "R", "Lkotlin/Function2;", "LT9/a;", "", "block", "coroutineScope", "(Lca/p;LT9/a;)Ljava/lang/Object;", "CoroutineScope", "(Lkotlin/coroutines/d;)Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "LO9/p;", "cancel", "(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Ljava/lang/Throwable;)V", "ensureActive", "(Lkotlinx/coroutines/CoroutineScope;)V", "currentCoroutineContext", "(LT9/a;)Ljava/lang/Object;", "", "isActive", "(Lkotlinx/coroutines/CoroutineScope;)Z", "isActive$annotations", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class CoroutineScopeKt {
    public static final CoroutineScope CoroutineScope(d dVar) {
        CompletableJob Job$default;
        if (dVar.get(Job.INSTANCE) == null) {
            Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            dVar = dVar.plus(Job$default);
        }
        return new ContextScope(dVar);
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final <R> Object coroutineScope(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super R>, ? extends Object> interfaceC0650p, T9.a<? super R> aVar) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(aVar.getContext(), aVar);
        Object startUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, interfaceC0650p);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        return startUndispatchedOrReturn;
    }

    public static final Object currentCoroutineContext(T9.a<? super d> aVar) {
        return aVar.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(T9.a<? super d> aVar) {
        throw null;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope plus(CoroutineScope coroutineScope, d dVar) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(dVar));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(coroutineScope, str, th);
    }

    public static final void cancel(CoroutineScope coroutineScope, String str, Throwable th) {
        cancel(coroutineScope, ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void isActive$annotations(CoroutineScope coroutineScope) {
    }
}
