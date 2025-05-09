package kotlinx.coroutines.test;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.test.internal.TestMainDispatcher;

/* compiled from: TestCoroutineDispatchers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001e\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"UnconfinedTestDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "scheduler", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "StandardTestDispatcher", "kotlinx-coroutines-test"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestCoroutineDispatchersKt {
    public static final TestDispatcher StandardTestDispatcher(TestCoroutineScheduler testCoroutineScheduler, String str) {
        if (testCoroutineScheduler == null && (testCoroutineScheduler = TestMainDispatcher.INSTANCE.getCurrentTestScheduler$kotlinx_coroutines_test()) == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return new StandardTestDispatcherImpl(testCoroutineScheduler, str);
    }

    public static /* synthetic */ TestDispatcher StandardTestDispatcher$default(TestCoroutineScheduler testCoroutineScheduler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            testCoroutineScheduler = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return StandardTestDispatcher(testCoroutineScheduler, str);
    }

    @ExperimentalCoroutinesApi
    public static final TestDispatcher UnconfinedTestDispatcher(TestCoroutineScheduler testCoroutineScheduler, String str) {
        if (testCoroutineScheduler == null && (testCoroutineScheduler = TestMainDispatcher.INSTANCE.getCurrentTestScheduler$kotlinx_coroutines_test()) == null) {
            testCoroutineScheduler = new TestCoroutineScheduler();
        }
        return new UnconfinedTestDispatcherImpl(testCoroutineScheduler, str);
    }

    public static /* synthetic */ TestDispatcher UnconfinedTestDispatcher$default(TestCoroutineScheduler testCoroutineScheduler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            testCoroutineScheduler = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return UnconfinedTestDispatcher(testCoroutineScheduler, str);
    }
}
