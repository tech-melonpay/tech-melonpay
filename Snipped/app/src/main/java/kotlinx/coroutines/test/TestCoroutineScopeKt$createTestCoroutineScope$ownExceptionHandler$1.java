package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: TestCoroutineScope.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"kotlinx/coroutines/test/TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/test/TestCoroutineScopeExceptionHandler;", "Lkotlin/coroutines/d;", "context", "", "exception", "LO9/p;", "handleException", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "kotlinx-coroutines-test"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1 extends kotlin.coroutines.a implements TestCoroutineScopeExceptionHandler {
    final /* synthetic */ Ref$ObjectRef<TestCoroutineScopeImpl> $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestCoroutineScopeKt$createTestCoroutineScope$ownExceptionHandler$1(Ref$ObjectRef<TestCoroutineScopeImpl> ref$ObjectRef, CoroutineExceptionHandler.Companion companion) {
        super(companion);
        this.$scope = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.d context, Throwable exception) {
        if (!this.$scope.f23179a.reportException(exception)) {
            throw exception;
        }
    }
}
