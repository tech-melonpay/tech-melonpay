package kotlinx.coroutines.test;

import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23261c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f23259a = i;
        this.f23260b = obj;
        this.f23261c = obj2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        List invokeSuspend$lambda$1;
        boolean registerEvent$lambda$5$lambda$2;
        switch (this.f23259a) {
            case 0:
                invokeSuspend$lambda$1 = TestBuildersKt__TestBuildersKt$runTest$3$1.invokeSuspend$lambda$1((TestScope) this.f23260b, (TestScopeImpl) this.f23261c);
                return invokeSuspend$lambda$1;
            default:
                registerEvent$lambda$5$lambda$2 = TestCoroutineScheduler.registerEvent$lambda$5$lambda$2((InterfaceC0646l) this.f23260b, this.f23261c);
                return Boolean.valueOf(registerEvent$lambda$5$lambda$2);
        }
    }
}
