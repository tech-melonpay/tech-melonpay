package kotlinx.coroutines.test;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TestScope.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class TestScopeImpl$enter$exceptions$1$2 extends FunctionReferenceImpl implements InterfaceC0646l<Throwable, p> {
    public TestScopeImpl$enter$exceptions$1$2(Object obj) {
        super(1, obj, TestScopeImpl.class, "reportException", "reportException(Ljava/lang/Throwable;)V", 0);
    }

    @Override // ca.InterfaceC0646l
    public /* bridge */ /* synthetic */ p invoke(Throwable th) {
        invoke2(th);
        return p.f3034a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((TestScopeImpl) this.receiver).reportException(th);
    }
}
