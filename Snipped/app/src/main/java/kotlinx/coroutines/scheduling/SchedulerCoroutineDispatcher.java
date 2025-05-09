package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001c\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u000f\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "createScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Lkotlin/coroutines/d;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LO9/p;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "dispatchYield", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "dispatchWithContext$kotlinx_coroutines_core", "(Ljava/lang/Runnable;ZZ)V", "dispatchWithContext", "close", "()V", "usePrivateScheduler$kotlinx_coroutines_core", "usePrivateScheduler", "timeout", "shutdown$kotlinx_coroutines_core", "(J)V", "shutdown", "restore$kotlinx_coroutines_core", "restore", "I", "J", "Ljava/lang/String;", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    private final int corePoolSize;
    private CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private final String schedulerName;

    public SchedulerCoroutineDispatcher() {
        this(0, 0, 0L, null, 15, null);
    }

    private final CoroutineScheduler createScheduler() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.coroutineScheduler.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo168dispatch(d context, Runnable block) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, block, false, false, 6, null);
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(Runnable block, boolean context, boolean tailDispatch) {
        this.coroutineScheduler.dispatch(block, context, tailDispatch);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d context, Runnable block) {
        CoroutineScheduler.dispatch$default(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.coroutineScheduler;
    }

    public final void restore$kotlinx_coroutines_core() {
        usePrivateScheduler$kotlinx_coroutines_core();
    }

    public final synchronized void shutdown$kotlinx_coroutines_core(long timeout) {
        this.coroutineScheduler.shutdown(timeout);
    }

    public final synchronized void usePrivateScheduler$kotlinx_coroutines_core() {
        this.coroutineScheduler.shutdown(1000L);
        this.coroutineScheduler = createScheduler();
    }

    public /* synthetic */ SchedulerCoroutineDispatcher(int i, int i9, long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? TasksKt.CORE_POOL_SIZE : i, (i10 & 2) != 0 ? TasksKt.MAX_POOL_SIZE : i9, (i10 & 4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j10, (i10 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public SchedulerCoroutineDispatcher(int i, int i9, long j10, String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i9;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        this.coroutineScheduler = createScheduler();
    }
}
