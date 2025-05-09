package kotlinx.coroutines.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.Job;

/* compiled from: TestCoroutineScope.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScopeImpl;", "Lkotlinx/coroutines/test/TestCoroutineScope;", "Lkotlin/coroutines/d;", "coroutineContext", "<init>", "(Lkotlin/coroutines/d;)V", "", "throwable", "", "reportException", "(Ljava/lang/Throwable;)Z", "LO9/p;", "cleanupTestCoroutines", "()V", "Lkotlin/coroutines/d;", "getCoroutineContext", "()Lkotlin/coroutines/d;", "", "lock", "Ljava/lang/Object;", "", "exceptions", "Ljava/util/List;", "cleanedUp", "Z", "", "Lkotlinx/coroutines/Job;", "initialJobs", "Ljava/util/Set;", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "testScheduler", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TestCoroutineScopeImpl implements TestCoroutineScope {
    private boolean cleanedUp;
    private final kotlin.coroutines.d coroutineContext;
    private final Object lock = new Object();
    private List<Throwable> exceptions = new ArrayList();
    private final Set<Job> initialJobs = TestCoroutineScopeKt.activeJobs(getCoroutineContext());

    public TestCoroutineScopeImpl(kotlin.coroutines.d dVar) {
        this.coroutineContext = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (getTestScheduler().isIdle$kotlinx_coroutines_test(false) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlinx.coroutines.test.TestCoroutineScope
    /* renamed from: cleanupTestCoroutines */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo181cleanupTestCoroutines() {
        /*
            r5 = this;
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            kotlin.coroutines.c$a r1 = kotlin.coroutines.c.a.f23157a
            kotlin.coroutines.d$b r0 = r0.get(r1)
            kotlin.coroutines.c r0 = (kotlin.coroutines.c) r0
            boolean r1 = r0 instanceof kotlinx.coroutines.test.TestCoroutineDispatcher
            r2 = 0
            if (r1 == 0) goto L14
            kotlinx.coroutines.test.TestCoroutineDispatcher r0 = (kotlinx.coroutines.test.TestCoroutineDispatcher) r0
            goto L15
        L14:
            r0 = r2
        L15:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L1d
            r0.cleanupTestCoroutines()     // Catch: kotlinx.coroutines.test.UncompletedCoroutinesError -> L2e
            goto L2f
        L1d:
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            r0.runCurrent()
            kotlinx.coroutines.test.TestCoroutineScheduler r0 = r5.getTestScheduler()
            boolean r0 = r0.isIdle$kotlinx_coroutines_test(r1)
            if (r0 != 0) goto L2f
        L2e:
            r1 = r3
        L2f:
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r4 = kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE
            kotlin.coroutines.d$b r0 = r0.get(r4)
            boolean r4 = r0 instanceof kotlinx.coroutines.test.TestCoroutineExceptionHandler
            if (r4 == 0) goto L40
            r2 = r0
            kotlinx.coroutines.test.TestCoroutineExceptionHandler r2 = (kotlinx.coroutines.test.TestCoroutineExceptionHandler) r2
        L40:
            if (r2 == 0) goto L45
            r2.cleanupTestCoroutines()
        L45:
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r2 = r5.cleanedUp     // Catch: java.lang.Throwable -> Lb2
            if (r2 != 0) goto Lb4
            r5.cleanedUp = r3     // Catch: java.lang.Throwable -> Lb2
            O9.p r2 = O9.p.f3034a     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r0)
            java.util.List<java.lang.Throwable> r0 = r5.exceptions
            java.lang.Object r0 = P9.s.L(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L7a
            java.util.List<java.lang.Throwable> r1 = r5.exceptions
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = P9.s.G(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L69:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            O9.m.a(r0, r2)
            goto L69
        L79:
            throw r0
        L7a:
            if (r1 != 0) goto Laa
            kotlin.coroutines.d r0 = r5.getCoroutineContext()
            java.util.Set r0 = kotlinx.coroutines.test.TestCoroutineScopeKt.activeJobs(r0)
            java.util.Set<kotlinx.coroutines.Job> r1 = r5.initialJobs
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = P9.D.n(r0, r1)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 != 0) goto L96
            return
        L96:
            kotlinx.coroutines.test.UncompletedCoroutinesError r1 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Test finished with active jobs: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Laa:
            kotlinx.coroutines.test.UncompletedCoroutinesError r0 = new kotlinx.coroutines.test.UncompletedCoroutinesError
            java.lang.String r1 = "Unfinished coroutines during teardown. Ensure all coroutines are completed or cancelled by your test."
            r0.<init>(r1)
            throw r0
        Lb2:
            r1 = move-exception
            goto Lbc
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "Attempting to clean up a test coroutine scope more than once."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb2
            throw r1     // Catch: java.lang.Throwable -> Lb2
        Lbc:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestCoroutineScopeImpl.mo181cleanupTestCoroutines():void");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // kotlinx.coroutines.test.TestCoroutineScope
    public TestCoroutineScheduler getTestScheduler() {
        return (TestCoroutineScheduler) getCoroutineContext().get(TestCoroutineScheduler.INSTANCE);
    }

    public final boolean reportException(Throwable throwable) {
        boolean z10;
        synchronized (this.lock) {
            if (this.cleanedUp) {
                z10 = false;
            } else {
                this.exceptions.add(throwable);
                z10 = true;
            }
        }
        return z10;
    }
}
