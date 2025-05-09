package kotlinx.coroutines.test;

import C.v;
import O9.m;
import O9.p;
import P9.s;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractCoroutine;

/* compiled from: TestBuilders.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\r\u001a\u00060\u0007j\u0002`\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\r\u001a\u00060\u0007j\u0002`\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0007¢\u0006\u0004\b\r\u0010\f\u001aC\u0010\r\u001a\u00060\u0007j\u0002`\n*\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\u000b\u0010\u0010\u001aC\u0010\r\u001a\u00060\u0007j\u0002`\n*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00020\u00070\u0011*\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u0019H\u0081@¢\u0006\u0004\b\u001c\u0010\u001d\u001a^\u0010#\u001a\u00060\u001fj\u0002` \"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00022\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u0019H\u0082\b¢\u0006\u0004\b!\u0010\"\u001a'\u0010&\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0000¢\u0006\u0004\b&\u0010'\u001a=\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\b2\u0006\u0010)\u001a\u00020(2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010+\u001a\u00028\u0000H\u0002¢\u0006\u0004\b,\u0010-\u001aU\u00104\u001a\u00060\u0007j\u0002`\n*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b2\u00103\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lkotlin/coroutines/d;", "context", "Lla/c;", "timeout", "Lkotlin/Function2;", "Lkotlinx/coroutines/test/TestScope;", "LT9/a;", "LO9/p;", "", "testBody", "Lkotlinx/coroutines/test/TestResult;", "runTest-8Mi8wO0", "(Lkotlin/coroutines/d;JLca/p;)V", "runTest", "", "dispatchTimeoutMs", "(Lkotlinx/coroutines/test/TestScope;JLca/p;)V", "Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/CoroutineScope;", "coroutine", "dispatchTimeout", "Lkotlin/Function1;", "", "tryGetCompletionCause", "Lkotlin/Function0;", "", "cleanup", "runTestCoroutineLegacy-SYHnMyU", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/AbstractCoroutine;JLca/l;Lca/p;Lca/a;LT9/a;)Ljava/lang/Object;", "runTestCoroutineLegacy", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "handleTimeout-dWUq8MI$TestBuildersKt__TestBuildersKt", "(Lkotlinx/coroutines/AbstractCoroutine;JLca/l;Lca/a;)Ljava/lang/AssertionError;", "handleTimeout", "head", "other", "throwAll", "(Ljava/lang/Throwable;Ljava/util/List;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "parse", "default", "systemProperty$TestBuildersKt__TestBuildersKt", "(Ljava/lang/String;Lca/l;Ljava/lang/Object;)Ljava/lang/Object;", "systemProperty", "", "marker", "unused2", "runTest$default", "(Lkotlinx/coroutines/test/TestScope;JLca/p;ILjava/lang/Object;)V", "runTestLegacy", "Lkotlin/Result;", "DEFAULT_TIMEOUT", "Ljava/lang/Object;", "DEFAULT_DISPATCH_TIMEOUT_MS", "J", "kotlinx-coroutines-test"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/test/TestBuildersKt")
/* loaded from: classes2.dex */
final /* synthetic */ class TestBuildersKt__TestBuildersKt {
    private static final Object DEFAULT_TIMEOUT;

    static {
        Object failure;
        long g10;
        try {
            TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1 testBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1 = new TestBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1(la.c.f23587b);
            DurationUnit durationUnit = DurationUnit.SECONDS;
            if (durationUnit.compareTo(durationUnit) <= 0) {
                g10 = la.e.d(DurationUnit.NANOSECONDS.f23215a.convert(60, durationUnit.f23215a));
            } else {
                g10 = la.e.g(60, durationUnit);
            }
            failure = new la.c(((la.c) systemProperty$TestBuildersKt__TestBuildersKt("kotlinx.coroutines.test.default_timeout", testBuildersKt__TestBuildersKt$DEFAULT_TIMEOUT$1$1, new la.c(g10))).f23590a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        DEFAULT_TIMEOUT = failure;
    }

    /* renamed from: handleTimeout-dWUq8MI$TestBuildersKt__TestBuildersKt, reason: not valid java name */
    private static final <T extends AbstractCoroutine<? super p>> AssertionError m187handleTimeoutdWUq8MI$TestBuildersKt__TestBuildersKt(T t3, long j10, InterfaceC0646l<? super T, ? extends Throwable> interfaceC0646l, InterfaceC0635a<? extends List<? extends Throwable>> interfaceC0635a) {
        List<? extends Throwable> list;
        try {
            list = interfaceC0635a.invoke();
        } catch (UncompletedCoroutinesError unused) {
            list = EmptyList.f23104a;
        }
        List k3 = kotlin.sequences.a.k(kotlin.sequences.a.g(t3.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable invoke = t3.isCancelled() ? interfaceC0646l.invoke(t3) : null;
        String str = "After waiting for " + ((Object) la.c.m(j10));
        if (invoke == null) {
            str = v.n(str, ", the test coroutine is not completing");
        }
        if (!k3.isEmpty()) {
            str = str + ", there were active child jobs: " + k3;
        }
        if (invoke != null && k3.isEmpty()) {
            StringBuilder s10 = v.s(str);
            s10.append(t3.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = s10.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (invoke != null) {
            m.a(uncompletedCoroutinesError, invoke);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m.a(uncompletedCoroutinesError, (Throwable) it.next());
        }
        return uncompletedCoroutinesError;
    }

    public static final void runTest(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (dVar.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        TestBuildersKt.runTest(TestScopeKt.TestScope(dVar.plus(runningInRunTest)), j10, interfaceC0650p);
    }

    public static /* synthetic */ void runTest$default(kotlin.coroutines.d dVar, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        TestBuildersKt.runTest(dVar, j10, (InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m188runTest8Mi8wO0(kotlin.coroutines.d dVar, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        RunningInRunTest runningInRunTest = RunningInRunTest.INSTANCE;
        if (dVar.get(runningInRunTest) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.".toString());
        }
        TestBuildersKt.m183runTest8Mi8wO0(TestScopeKt.TestScope(dVar.plus(runningInRunTest)), j10, interfaceC0650p);
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m190runTest8Mi8wO0$default(kotlin.coroutines.d dVar, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.f23155a;
        }
        if ((i & 2) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            kotlin.b.b(obj2);
            j10 = ((la.c) obj2).f23590a;
        }
        TestBuildersKt.m182runTest8Mi8wO0(dVar, j10, (InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Type inference failed for: r14v9, types: [kotlinx.coroutines.AbstractCoroutine] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016c -> B:17:0x0177). Please report as a decompilation issue!!! */
    /* renamed from: runTestCoroutineLegacy-SYHnMyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends kotlinx.coroutines.AbstractCoroutine<? super O9.p>> java.lang.Object m192runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope r23, T r24, long r25, ca.InterfaceC0646l<? super T, ? extends java.lang.Throwable> r27, ca.InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends java.lang.Object> r28, ca.InterfaceC0635a<? extends java.util.List<? extends java.lang.Throwable>> r29, T9.a<? super O9.p> r30) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.m192runTestCoroutineLegacySYHnMyU(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.AbstractCoroutine, long, ca.l, ca.p, ca.a, T9.a):java.lang.Object");
    }

    private static final <T> T systemProperty$TestBuildersKt__TestBuildersKt(String str, InterfaceC0646l<? super String, ? extends T> interfaceC0646l, T t3) {
        String systemPropertyImpl = TestBuildersJvmKt.systemPropertyImpl(str);
        return systemPropertyImpl == null ? t3 : interfaceC0646l.invoke(systemPropertyImpl);
    }

    public static final void throwAll(Throwable th, List<? extends Throwable> list) {
        if (th != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m.a(th, (Throwable) it.next());
            }
            throw th;
        }
        Throwable th2 = (Throwable) s.L(list);
        if (th2 != null) {
            Iterator it2 = s.G(list).iterator();
            while (it2.hasNext()) {
                m.a(th2, (Throwable) it2.next());
            }
            throw th2;
        }
    }

    public static final /* synthetic */ void runTest$default(TestScope testScope, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) == 0) {
            j10 = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;
        }
        TestBuildersKt.runTest(testScope, j10, (InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }

    public static final void runTest(TestScope testScope, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$3$1(asSpecificImplementation, j10, interfaceC0650p, testScope, null));
    }

    /* renamed from: runTest-8Mi8wO0, reason: not valid java name */
    public static final void m189runTest8Mi8wO0(TestScope testScope, long j10, InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p) {
        TestScopeImpl asSpecificImplementation = TestScopeKt.asSpecificImplementation(testScope);
        asSpecificImplementation.enter();
        TestBuildersJvmKt.createTestResult(new TestBuildersKt__TestBuildersKt$runTest$2$1(asSpecificImplementation, j10, testScope, interfaceC0650p, null));
    }

    /* renamed from: runTest-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ void m191runTest8Mi8wO0$default(TestScope testScope, long j10, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            Object obj2 = DEFAULT_TIMEOUT;
            kotlin.b.b(obj2);
            j10 = ((la.c) obj2).f23590a;
        }
        TestBuildersKt.m183runTest8Mi8wO0(testScope, j10, (InterfaceC0650p<? super TestScope, ? super T9.a<? super p>, ? extends Object>) interfaceC0650p);
    }
}
