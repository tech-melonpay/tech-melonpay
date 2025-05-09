package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: AbstractTimeSource.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00060\bj\u0002`\t2\n\u0010\n\u001a\u00060\bj\u0002`\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/AbstractTimeSource;", "", "<init>", "()V", "", "currentTimeMillis", "()J", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "wrapTask", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "LO9/p;", "trackTask", "unTrackTask", "registerTimeLoopThread", "unregisterTimeLoopThread", "blocker", "nanos", "parkNanos", "(Ljava/lang/Object;J)V", "Ljava/lang/Thread;", "thread", "unpark", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class AbstractTimeSource {
    public abstract long currentTimeMillis();

    public abstract long nanoTime();

    public abstract void parkNanos(Object blocker, long nanos);

    public abstract void registerTimeLoopThread();

    public abstract void trackTask();

    public abstract void unTrackTask();

    public abstract void unpark(Thread thread);

    public abstract void unregisterTimeLoopThread();

    public abstract Runnable wrapTask(Runnable block);
}
