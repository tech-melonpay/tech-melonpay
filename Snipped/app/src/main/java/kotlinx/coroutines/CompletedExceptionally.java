package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CompletionState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "handled", "", "<init>", "(Ljava/lang/Throwable;Z)V", "_handled", "Lkotlinx/atomicfu/AtomicBoolean;", "getHandled", "()Z", "makeHandled", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _handled$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable cause;

    public CompletedExceptionally(Throwable th, boolean z10) {
        this.cause = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    private final /* synthetic */ int get_handled$volatile() {
        return this._handled$volatile;
    }

    private final /* synthetic */ void set_handled$volatile(int i) {
        this._handled$volatile = i;
    }

    public final boolean getHandled() {
        return _handled$volatile$FU.get(this) != 0;
    }

    public final boolean makeHandled() {
        return _handled$volatile$FU.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ CompletedExceptionally(Throwable th, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z10);
    }
}
