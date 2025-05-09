package kotlinx.coroutines.test;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* compiled from: TestBuilders.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R$\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/test/AtomicBoolean;", "", "initial", "", "<init>", "(Z)V", "container", "Lkotlinx/atomicfu/AtomicBoolean;", "value", "getValue", "()Z", "setValue", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AtomicBoolean {
    private static final /* synthetic */ AtomicIntegerFieldUpdater container$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AtomicBoolean.class, "container$volatile");
    private volatile /* synthetic */ int container$volatile;

    public AtomicBoolean(boolean z10) {
        this.container$volatile = z10 ? 1 : 0;
    }

    private final /* synthetic */ int getContainer$volatile() {
        return this.container$volatile;
    }

    private final /* synthetic */ void setContainer$volatile(int i) {
        this.container$volatile = i;
    }

    public final boolean getValue() {
        return container$volatile$FU.get(this) != 0;
    }

    public final void setValue(boolean z10) {
        container$volatile$FU.set(this, z10 ? 1 : 0);
    }
}
