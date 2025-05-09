package kotlinx.coroutines.test.internal;

import O9.m;
import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* compiled from: ReportingSupervisorJob.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/test/internal/ReportingSupervisorJob;", "Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/Job;", "parent", "Lkotlin/Function1;", "", "LO9/p;", "onChildCancellation", "<init>", "(Lkotlinx/coroutines/Job;Lca/l;)V", "cause", "", "childCancelled", "(Ljava/lang/Throwable;)Z", "Lca/l;", "getOnChildCancellation", "()Lca/l;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReportingSupervisorJob extends JobImpl {
    private final InterfaceC0646l<Throwable, p> onChildCancellation;

    public /* synthetic */ ReportingSupervisorJob(Job job, InterfaceC0646l interfaceC0646l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job, interfaceC0646l);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable cause) {
        try {
            this.onChildCancellation.invoke(cause);
        } catch (Throwable th) {
            m.a(cause, th);
            CoroutineExceptionHandlerKt.handleCoroutineException(this, cause);
        }
        p pVar = p.f3034a;
        return false;
    }

    public final InterfaceC0646l<Throwable, p> getOnChildCancellation() {
        return this.onChildCancellation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReportingSupervisorJob(Job job, InterfaceC0646l<? super Throwable, p> interfaceC0646l) {
        super(job);
        this.onChildCancellation = interfaceC0646l;
    }
}
