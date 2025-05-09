package kotlinx.coroutines.sync;

import O9.p;
import kotlin.Metadata;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/sync/Semaphore;", "", "LO9/p;", "acquire", "(LT9/a;)Ljava/lang/Object;", "", "tryAcquire", "()Z", "release", "()V", "", "getAvailablePermits", "()I", "availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public interface Semaphore {
    Object acquire(T9.a<? super p> aVar);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
