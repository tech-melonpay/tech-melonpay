package kotlinx.coroutines.test.internal;

import kotlin.Metadata;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;

/* compiled from: TestMainDispatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"defaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestMainDispatcherKt {
    private static final Delay getDefaultDelay() {
        return DefaultExecutorKt.getDefaultDelay();
    }

    private static /* synthetic */ void getDefaultDelay$annotations() {
    }
}
