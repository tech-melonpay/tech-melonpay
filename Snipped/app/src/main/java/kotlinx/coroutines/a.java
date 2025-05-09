package kotlinx.coroutines;

import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0651q;
import kotlin.coroutines.d;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0651q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23217b;

    public /* synthetic */ a(Object obj, int i) {
        this.f23216a = i;
        this.f23217b = obj;
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p resume$lambda$13$lambda$12;
        InterfaceC0651q onSelectCancellationUnlockConstructor$lambda$1;
        p onCancellationRelease$lambda$2;
        switch (this.f23216a) {
            case 0:
                resume$lambda$13$lambda$12 = CancellableContinuationImpl.resume$lambda$13$lambda$12((InterfaceC0646l) this.f23217b, (Throwable) obj, obj2, (d) obj3);
                return resume$lambda$13$lambda$12;
            case 1:
                onSelectCancellationUnlockConstructor$lambda$1 = MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) this.f23217b, (SelectInstance) obj, obj2, obj3);
                return onSelectCancellationUnlockConstructor$lambda$1;
            default:
                onCancellationRelease$lambda$2 = SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) this.f23217b, (Throwable) obj, (p) obj2, (d) obj3);
                return onCancellationRelease$lambda$2;
        }
    }
}
