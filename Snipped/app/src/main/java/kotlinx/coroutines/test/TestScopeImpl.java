package kotlinx.coroutines.test;

import C.v;
import O9.m;
import O9.p;
import ca.InterfaceC0646l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt;
import kotlinx.coroutines.test.internal.ExceptionCollector;
import kotlinx.coroutines.test.internal.ReportingSupervisorJob;

/* compiled from: TestScope.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lkotlinx/coroutines/test/TestScopeImpl;", "Lkotlinx/coroutines/AbstractCoroutine;", "LO9/p;", "Lkotlinx/coroutines/test/TestScope;", "Lkotlin/coroutines/d;", "context", "<init>", "(Lkotlin/coroutines/d;)V", "enter", "()V", "", "", "leave", "()Ljava/util/List;", "legacyLeave", "throwable", "reportException", "(Ljava/lang/Throwable;)V", "tryGetCompletionCause", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "", "entered", "Z", "finished", "", "uncaughtExceptions", "Ljava/util/List;", "", "lock", "Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "backgroundScope", "Lkotlinx/coroutines/CoroutineScope;", "getBackgroundScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "testScheduler", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestScopeImpl extends AbstractCoroutine<p> implements TestScope {
    private final CoroutineScope backgroundScope;
    private boolean entered;
    private boolean finished;
    private final Object lock;
    private final List<Throwable> uncaughtExceptions;

    public TestScopeImpl(kotlin.coroutines.d dVar) {
        super(dVar, true, true);
        this.uncaughtExceptions = new ArrayList();
        this.lock = new Object();
        Job job = null;
        this.backgroundScope = CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(BackgroundWork.INSTANCE).plus(new ReportingSupervisorJob(job, new InterfaceC0646l() { // from class: kotlinx.coroutines.test.h
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                p backgroundScope$lambda$0;
                backgroundScope$lambda$0 = TestScopeImpl.backgroundScope$lambda$0(TestScopeImpl.this, (Throwable) obj);
                return backgroundScope$lambda$0;
            }
        }, 1, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p backgroundScope$lambda$0(TestScopeImpl testScopeImpl, Throwable th) {
        if (!(th instanceof CancellationException)) {
            testScopeImpl.reportException(th);
        }
        return p.f3034a;
    }

    public final void enter() {
        ExceptionCollector exceptionCollector;
        List<Throwable> list;
        synchronized (this.lock) {
            try {
                if (this.entered) {
                    throw new IllegalStateException("Only a single call to `runTest` can be performed during one test.");
                }
                this.entered = true;
                if (!(!this.finished)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                exceptionCollector = ExceptionCollector.INSTANCE;
                CoroutineExceptionHandlerImplKt.ensurePlatformExceptionHandlerLoaded(exceptionCollector);
                if (TestScopeKt.getCatchNonTestRelatedExceptions()) {
                    exceptionCollector.addOnExceptionCallback(this.lock, new TestScopeImpl$enter$exceptions$1$2(this));
                }
                list = this.uncaughtExceptions;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!list.isEmpty()) {
            exceptionCollector.removeOnExceptionCallback(this.lock);
            UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
            Iterator<Throwable> it = list.iterator();
            while (it.hasNext()) {
                m.a(uncaughtExceptionsBeforeTest, it.next());
            }
            throw uncaughtExceptionsBeforeTest;
        }
    }

    @Override // kotlinx.coroutines.test.TestScope
    public CoroutineScope getBackgroundScope() {
        return this.backgroundScope;
    }

    @Override // kotlinx.coroutines.test.TestScope
    public TestCoroutineScheduler getTestScheduler() {
        return (TestCoroutineScheduler) getContext().get(TestCoroutineScheduler.INSTANCE);
    }

    public final List<Throwable> leave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        return list;
    }

    public final List<Throwable> legacyLeave() {
        List<Throwable> list;
        synchronized (this.lock) {
            if (!this.entered || this.finished) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ExceptionCollector.INSTANCE.removeOnExceptionCallback(this.lock);
            this.finished = true;
            list = this.uncaughtExceptions;
        }
        List k3 = kotlin.sequences.a.k(kotlin.sequences.a.g(getChildren(), new a(5)));
        if (list.isEmpty()) {
            if (!k3.isEmpty()) {
                throw new UncompletedCoroutinesError("Active jobs found during the tear-down. Ensure that all coroutines are completed or cancelled by your test. The active jobs: " + k3);
            }
            if (!TestCoroutineScheduler.isIdle$kotlinx_coroutines_test$default(getTestScheduler(), false, 1, null)) {
                throw new UncompletedCoroutinesError("Unfinished coroutines found during the tear-down. Ensure that all coroutines are completed or cancelled by your test.");
            }
        }
        return list;
    }

    public final void reportException(Throwable throwable) {
        synchronized (this.lock) {
            if (this.finished) {
                throw throwable;
            }
            Iterator<Throwable> it = this.uncaughtExceptions.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.f.b(throwable, it.next())) {
                    return;
                }
            }
            this.uncaughtExceptions.add(throwable);
            if (this.entered) {
                p pVar = p.f3034a;
            } else {
                UncaughtExceptionsBeforeTest uncaughtExceptionsBeforeTest = new UncaughtExceptionsBeforeTest();
                m.a(uncaughtExceptionsBeforeTest, throwable);
                throw uncaughtExceptionsBeforeTest;
            }
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public String toString() {
        return v.q(new StringBuilder("TestScope["), this.finished ? "test ended" : this.entered ? "test started" : "test not started", ']');
    }

    public final Throwable tryGetCompletionCause() {
        return getCompletionCause();
    }
}
