package kotlinx.coroutines.test;

import ca.InterfaceC0646l;
import kotlinx.coroutines.Job;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23248a;

    public /* synthetic */ a(int i) {
        this.f23248a = i;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        boolean dispatch$lambda$0;
        boolean isIdle$lambda$15$lambda$14;
        boolean post$lambda$0;
        boolean isActive;
        boolean invokeOnTimeout$lambda$0;
        boolean isActive2;
        switch (this.f23248a) {
            case 0:
                dispatch$lambda$0 = StandardTestDispatcherImpl.dispatch$lambda$0((Runnable) obj);
                return Boolean.valueOf(dispatch$lambda$0);
            case 1:
                isIdle$lambda$15$lambda$14 = TestCoroutineScheduler.isIdle$lambda$15$lambda$14((TestDispatchEvent) obj);
                return Boolean.valueOf(isIdle$lambda$15$lambda$14);
            case 2:
                post$lambda$0 = TestCoroutineDispatcher.post$lambda$0((Runnable) obj);
                return Boolean.valueOf(post$lambda$0);
            case 3:
                isActive = ((Job) obj).isActive();
                return Boolean.valueOf(isActive);
            case 4:
                invokeOnTimeout$lambda$0 = TestDispatcher.invokeOnTimeout$lambda$0((Runnable) obj);
                return Boolean.valueOf(invokeOnTimeout$lambda$0);
            default:
                isActive2 = ((Job) obj).isActive();
                return Boolean.valueOf(isActive2);
        }
    }
}
