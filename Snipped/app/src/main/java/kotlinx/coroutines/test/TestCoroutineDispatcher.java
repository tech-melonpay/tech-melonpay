package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: TestCoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018¨\u0006'"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "Lkotlinx/coroutines/test/TestDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "scheduler", "<init>", "(Lkotlinx/coroutines/test/TestCoroutineScheduler;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/d;", "context", "Lkotlinx/coroutines/DisposableHandle;", "post", "(Ljava/lang/Runnable;Lkotlin/coroutines/d;)Lkotlinx/coroutines/DisposableHandle;", "LO9/p;", "dispatch", "(Lkotlin/coroutines/d;Ljava/lang/Runnable;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "", "advanceUntilIdle", "()J", "runCurrent", "()V", "cleanupTestCoroutines", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "", "value", "dispatchImmediately", "Z", "setDispatchImmediately", "(Z)V", "getCurrentTime", "currentTime", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineDispatcher extends TestDispatcher implements Delay {
    private boolean dispatchImmediately;
    private final TestCoroutineScheduler scheduler;

    public TestCoroutineDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final DisposableHandle post(Runnable block, kotlin.coroutines.d context) {
        return getScheduler().registerEvent$kotlinx_coroutines_test(this, 0L, block, context, new a(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean post$lambda$0(Runnable runnable) {
        return false;
    }

    private final void setDispatchImmediately(boolean z10) {
        this.dispatchImmediately = z10;
        if (z10) {
            getScheduler().advanceUntilIdle();
        }
    }

    public final long advanceUntilIdle() {
        long currentTime = getScheduler().getCurrentTime();
        getScheduler().advanceUntilIdle();
        return getScheduler().getCurrentTime() - currentTime;
    }

    public final void cleanupTestCoroutines() {
        getScheduler().runCurrent();
        if (!getScheduler().isIdle$kotlinx_coroutines_test(false)) {
            throw new UncompletedCoroutinesError("Unfinished coroutines during tear-down. Ensure all coroutines are completed or cancelled by your test.");
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo168dispatch(kotlin.coroutines.d context, Runnable block) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), context);
        if (!this.dispatchImmediately) {
            post(block, context);
        } else {
            getScheduler().sendDispatchEvent$kotlinx_coroutines_test(context);
            block.run();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.d context, Runnable block) {
        TestCoroutineSchedulerKt.checkSchedulerInContext(getScheduler(), context);
        post(block, context);
    }

    public final long getCurrentTime() {
        return getScheduler().getCurrentTime();
    }

    @Override // kotlinx.coroutines.test.TestDispatcher
    public TestCoroutineScheduler getScheduler() {
        return this.scheduler;
    }

    public final void runCurrent() {
        getScheduler().runCurrent();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public String getName() {
        return "TestCoroutineDispatcher[scheduler=" + getScheduler() + ']';
    }

    public /* synthetic */ TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestCoroutineScheduler() : testCoroutineScheduler);
    }

    public TestCoroutineDispatcher(TestCoroutineScheduler testCoroutineScheduler) {
        this.scheduler = testCoroutineScheduler;
        this.dispatchImmediately = true;
    }
}
