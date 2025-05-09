package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* compiled from: TestCoroutineScope.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/test/TestCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "cleanupTestCoroutines", "()V", "Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler", "()Lkotlinx/coroutines/test/TestCoroutineScheduler;", "getTestScheduler$annotations", "testScheduler", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
@ExperimentalCoroutinesApi
/* loaded from: classes2.dex */
public interface TestCoroutineScope extends CoroutineScope {
    @ExperimentalCoroutinesApi
    /* renamed from: cleanupTestCoroutines */
    void mo181cleanupTestCoroutines();

    TestCoroutineScheduler getTestScheduler();

    /* compiled from: TestCoroutineScope.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @ExperimentalCoroutinesApi
        public static /* synthetic */ void getTestScheduler$annotations() {
        }
    }
}
