package kotlinx.coroutines.test;

import ca.InterfaceC0635a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23249a;

    public /* synthetic */ b(int i) {
        this.f23249a = i;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        boolean runBlockingTestOnTestScope$lambda$1$TestBuildersKt__TestBuildersDeprecatedKt;
        boolean invokeSuspend$lambda$0;
        boolean invokeSuspend$lambda$1$lambda$0;
        switch (this.f23249a) {
            case 0:
                runBlockingTestOnTestScope$lambda$1$TestBuildersKt__TestBuildersDeprecatedKt = TestBuildersKt__TestBuildersDeprecatedKt.runBlockingTestOnTestScope$lambda$1$TestBuildersKt__TestBuildersDeprecatedKt();
                return Boolean.valueOf(runBlockingTestOnTestScope$lambda$1$TestBuildersKt__TestBuildersDeprecatedKt);
            case 1:
                invokeSuspend$lambda$0 = TestBuildersKt__TestBuildersKt$runTest$2$1.invokeSuspend$lambda$0();
                return Boolean.valueOf(invokeSuspend$lambda$0);
            default:
                invokeSuspend$lambda$1$lambda$0 = TestBuildersKt__TestBuildersKt$runTest$3$1.invokeSuspend$lambda$1$lambda$0();
                return Boolean.valueOf(invokeSuspend$lambda$1$lambda$0);
        }
    }
}
