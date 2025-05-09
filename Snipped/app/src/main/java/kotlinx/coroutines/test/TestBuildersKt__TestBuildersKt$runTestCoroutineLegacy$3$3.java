package kotlinx.coroutines.test;

import C.v;
import O9.m;
import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractCoroutine;

/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3", f = "TestBuilders.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO9/p;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3 extends SuspendLambda implements InterfaceC0646l<T9.a<? super p>, Object> {
    final /* synthetic */ InterfaceC0635a<List<Throwable>> $cleanup;
    final /* synthetic */ AbstractCoroutine $coroutine;
    final /* synthetic */ long $dispatchTimeout;
    final /* synthetic */ InterfaceC0646l<T, Throwable> $tryGetCompletionCause;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;JLca/l<-TT;+Ljava/lang/Throwable;>;Lca/a<+Ljava/util/List<+Ljava/lang/Throwable;>;>;LT9/a<-Lkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3;>;)V */
    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(AbstractCoroutine abstractCoroutine, long j10, InterfaceC0646l interfaceC0646l, InterfaceC0635a interfaceC0635a, T9.a aVar) {
        super(1, aVar);
        this.$coroutine = abstractCoroutine;
        this.$dispatchTimeout = j10;
        this.$tryGetCompletionCause = interfaceC0646l;
        this.$cleanup = interfaceC0635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(T9.a<?> aVar) {
        return new TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3(this.$coroutine, this.$dispatchTimeout, this.$tryGetCompletionCause, this.$cleanup, aVar);
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(T9.a<? super p> aVar) {
        return ((TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3) create(aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Throwable> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        AbstractCoroutine abstractCoroutine = this.$coroutine;
        long j10 = this.$dispatchTimeout;
        InterfaceC0646l<T, Throwable> interfaceC0646l = this.$tryGetCompletionCause;
        try {
            list = this.$cleanup.invoke();
        } catch (UncompletedCoroutinesError unused) {
            list = EmptyList.f23104a;
        }
        List k3 = kotlin.sequences.a.k(kotlin.sequences.a.g(abstractCoroutine.getChildren(), TestBuildersKt__TestBuildersKt$handleTimeout$activeChildren$1.INSTANCE));
        Throwable invoke = abstractCoroutine.isCancelled() ? interfaceC0646l.invoke(abstractCoroutine) : null;
        String str = "After waiting for " + ((Object) la.c.m(j10));
        if (invoke == null) {
            str = v.n(str, ", the test coroutine is not completing");
        }
        if (!k3.isEmpty()) {
            str = str + ", there were active child jobs: " + k3;
        }
        if (invoke != null && k3.isEmpty()) {
            StringBuilder s10 = v.s(str);
            s10.append(abstractCoroutine.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = s10.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (invoke != null) {
            m.a(uncompletedCoroutinesError, invoke);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m.a(uncompletedCoroutinesError, (Throwable) it.next());
        }
        throw uncompletedCoroutinesError;
    }
}
