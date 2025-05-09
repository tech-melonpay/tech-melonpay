package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@Metadata(d1 = {"kotlinx/coroutines/test/TestBuildersKt__TestBuildersDeprecatedKt", "kotlinx/coroutines/test/TestBuildersKt__TestBuildersKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestBuildersKt {
    public static final long DEFAULT_DISPATCH_TIMEOUT_MS = 60000;

    public static final void runBlockingTest(kotlin.coroutines.d dVar, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(dVar, interfaceC0650p);
    }

    public static final void runBlockingTestOnTestScope(kotlin.coroutines.d dVar, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTestOnTestScope(dVar, interfaceC0650p);
    }

    public static final void runTest(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersKt.runTest(dVar, j10, interfaceC0650p);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m182runTest8Mi8wO0(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersKt.m188runTest8Mi8wO0(dVar, j10, interfaceC0650p);
    }

    /* renamed from: runTestCoroutineLegacy-SYHnMyU, reason: not valid java name */
    public static final <T extends AbstractCoroutine<? super p>> Object m186runTestCoroutineLegacySYHnMyU(CoroutineScope coroutineScope, T t3, long j10, InterfaceC0646l<? super T, ? extends Throwable> interfaceC0646l, InterfaceC0650p<? super T, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, InterfaceC0635a<? extends List<? extends Throwable>> interfaceC0635a, T9.a<? super p> aVar) {
        return TestBuildersKt__TestBuildersKt.m192runTestCoroutineLegacySYHnMyU(coroutineScope, t3, j10, interfaceC0646l, interfaceC0650p, interfaceC0635a, aVar);
    }

    @ExperimentalCoroutinesApi
    public static final void runTestWithLegacyScope(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runTestWithLegacyScope(dVar, j10, interfaceC0650p);
    }

    public static final void throwAll(Throwable th, List<? extends Throwable> list) {
        TestBuildersKt__TestBuildersKt.throwAll(th, list);
    }

    public static final void runBlockingTest(TestCoroutineDispatcher testCoroutineDispatcher, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testCoroutineDispatcher, interfaceC0650p);
    }

    @ExperimentalCoroutinesApi
    public static final void runTest(TestCoroutineScope testCoroutineScope, long j10, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runTest(testCoroutineScope, j10, interfaceC0650p);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m183runTest8Mi8wO0(TestScope testScope, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersKt.m189runTest8Mi8wO0(testScope, j10, interfaceC0650p);
    }

    public static final void runBlockingTest(TestCoroutineScope testCoroutineScope, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testCoroutineScope, interfaceC0650p);
    }

    public static final void runTest(TestScope testScope, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersKt.runTest(testScope, j10, interfaceC0650p);
    }

    public static final void runBlockingTest(TestScope testScope, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTest(testScope, interfaceC0650p);
    }
}
