package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: Job.kt */
@InternalCoroutinesApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/NonDisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/ChildHandle;", "<init>", "()V", "LO9/p;", "dispose", "", "cause", "", "childCancelled", "(Ljava/lang/Throwable;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "parent", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class NonDisposableHandle implements DisposableHandle, ChildHandle {
    public static final NonDisposableHandle INSTANCE = new NonDisposableHandle();

    private NonDisposableHandle() {
    }

    @Override // kotlinx.coroutines.ChildHandle
    public boolean childCancelled(Throwable cause) {
        return false;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public Job getParent() {
        return null;
    }

    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
    }
}
