package kotlinx.coroutines.test;

import ca.InterfaceC0635a;
import java.util.List;
import kotlin.coroutines.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.b f23251b;

    public /* synthetic */ c(int i, d.b bVar) {
        this.f23250a = i;
        this.f23251b = bVar;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        List invokeSuspend$lambda$0;
        boolean advanceUntilIdle$lambda$7;
        switch (this.f23250a) {
            case 0:
                invokeSuspend$lambda$0 = TestBuildersKt__TestBuildersDeprecatedKt$runTestWithLegacyScope$1.invokeSuspend$lambda$0((TestBodyCoroutine) this.f23251b);
                return invokeSuspend$lambda$0;
            default:
                advanceUntilIdle$lambda$7 = TestCoroutineScheduler.advanceUntilIdle$lambda$7((TestCoroutineScheduler) this.f23251b);
                return Boolean.valueOf(advanceUntilIdle$lambda$7);
        }
    }
}
