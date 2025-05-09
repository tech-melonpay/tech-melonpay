package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.internal.TestMainDispatcher;
import kotlinx.coroutines.test.internal.TestMainDispatcherJvmKt;

/* compiled from: TestDispatchers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "LO9/p;", "setMain", "(Lkotlinx/coroutines/Dispatchers;Lkotlinx/coroutines/CoroutineDispatcher;)V", "resetMain", "(Lkotlinx/coroutines/Dispatchers;)V", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestDispatchers {
    @ExperimentalCoroutinesApi
    public static final void resetMain(Dispatchers dispatchers) {
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).resetDispatcher();
    }

    @ExperimentalCoroutinesApi
    public static final void setMain(Dispatchers dispatchers, CoroutineDispatcher coroutineDispatcher) {
        if (coroutineDispatcher instanceof TestMainDispatcher) {
            throw new IllegalArgumentException("Dispatchers.setMain(Dispatchers.Main) is prohibited, probably Dispatchers.resetMain() should be used instead".toString());
        }
        TestMainDispatcherJvmKt.getTestMainDispatcher(dispatchers).setDispatcher(coroutineDispatcher);
    }
}
