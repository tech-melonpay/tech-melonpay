package kotlinx.coroutines.test;

import ca.InterfaceC0635a;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f23258b;

    public /* synthetic */ e(CoroutineScope coroutineScope, int i) {
        this.f23257a = i;
        this.f23258b = coroutineScope;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        boolean invokeSuspend$lambda$0;
        boolean invokeSuspend$lambda$02;
        switch (this.f23257a) {
            case 0:
                invokeSuspend$lambda$0 = TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1.invokeSuspend$lambda$0(this.f23258b);
                return Boolean.valueOf(invokeSuspend$lambda$0);
            default:
                invokeSuspend$lambda$02 = TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1.invokeSuspend$lambda$0(this.f23258b);
                return Boolean.valueOf(invokeSuspend$lambda$02);
        }
    }
}
