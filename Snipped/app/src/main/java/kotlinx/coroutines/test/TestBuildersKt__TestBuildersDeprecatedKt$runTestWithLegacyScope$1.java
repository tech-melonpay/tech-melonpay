package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import la.c;
import org.bouncycastle.tls.CipherSuite;

/* compiled from: TestBuildersDeprecated.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1", f = "TestBuildersDeprecated.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {
    final /* synthetic */ long $dispatchTimeoutMs;
    final /* synthetic */ InterfaceC0650p<TestCoroutineScope, T9.a<? super p>, Object> $testBody;
    final /* synthetic */ TestBodyCoroutine $testScope;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: TestBuildersDeprecated.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC0646l<TestBodyCoroutine, Throwable> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, TestBodyCoroutine.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
        }

        @Override // ca.InterfaceC0646l
        public final Throwable invoke(TestBodyCoroutine testBodyCoroutine) {
            return testBodyCoroutine.tryGetCompletionCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(TestBodyCoroutine testBodyCoroutine, long j10, InterfaceC0650p<? super TestCoroutineScope, ? super T9.a<? super p>, ? extends Object> interfaceC0650p, T9.a<? super TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1> aVar) {
        super(2, aVar);
        this.$testScope = testBodyCoroutine;
        this.$dispatchTimeoutMs = j10;
        this.$testBody = interfaceC0650p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(TestBodyCoroutine testBodyCoroutine) {
        try {
            testBodyCoroutine.cleanup();
            return EmptyList.f23104a;
        } catch (UncompletedCoroutinesError e10) {
            throw e10;
        } catch (Throwable th) {
            return Collections.singletonList(th);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1 = new TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1(this.$testScope, this.$dispatchTimeoutMs, this.$testBody, aVar);
        testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.L$0 = obj;
        return testBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TestBodyCoroutine testBodyCoroutine = this.$testScope;
            c.a aVar = la.c.f23587b;
            long g10 = la.e.g(this.$dispatchTimeoutMs, DurationUnit.MILLISECONDS);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            InterfaceC0650p<TestCoroutineScope, T9.a<? super p>, Object> interfaceC0650p = this.$testBody;
            c cVar = new c(0, this.$testScope);
            this.label = 1;
            if (TestBuildersKt.m186runTestCoroutineLegacySYHnMyU(coroutineScope, testBodyCoroutine, g10, anonymousClass1, interfaceC0650p, cVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p.f3034a;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }
}
