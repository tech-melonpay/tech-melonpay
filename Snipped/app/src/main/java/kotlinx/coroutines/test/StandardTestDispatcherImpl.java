package kotlinx.coroutines.test;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TestCoroutineDispatchers.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/test/StandardTestDispatcherImpl;", "Lkotlinx/coroutines/test/TestDispatcher;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "scheduler", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;Ljava/lang/String;)V", "Lkotlin/coroutines/d;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LO9/p;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "Ljava/lang/String;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class StandardTestDispatcherImpl extends TestDispatcher {
    private final String name;
    private final TestCoroutineScheduler scheduler;

    public StandardTestDispatcherImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatch$lambda$0(Runnable runnable) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo168dispatch(kotlin.coroutines.d context, Runnable block) {
        getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, block, context, new a(0));
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public String getName() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.name;
        if (str == null) {
            str = "StandardTestDispatcher";
        }
        sb2.append(str);
        sb2.append("[scheduler=");
        sb2.append(getScheduler());
        sb2.append(']');
        return sb2.toString();
    }

    public /* synthetic */ StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler, (i & 2) != 0 ? null : str);
    }

    public StandardTestDispatcherImpl(TestCoroutineScheduler testCoroutineScheduler, String str) {
        this.scheduler = testCoroutineScheduler;
        this.name = str;
    }
}
