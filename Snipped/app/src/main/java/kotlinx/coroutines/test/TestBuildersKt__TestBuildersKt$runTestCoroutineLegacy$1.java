package kotlinx.coroutines.test;

import O9.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractCoroutine;

/* compiled from: TestBuilders.kt */
@V9.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt", f = "TestBuilders.kt", l = {622, 521, 521}, m = "runTestCoroutineLegacy-SYHnMyU")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1<T extends AbstractCoroutine<? super p>> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    public TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1(T9.a<? super TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$1> aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TestBuildersKt.m186runTestCoroutineLegacySYHnMyU(null, null, 0L, null, null, null, this);
    }
}
