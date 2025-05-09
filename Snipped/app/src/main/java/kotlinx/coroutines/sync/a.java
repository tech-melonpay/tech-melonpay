package kotlinx.coroutines.sync;

import O9.p;
import ca.InterfaceC0651q;
import kotlin.coroutines.d;
import kotlinx.coroutines.sync.MutexImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0651q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutexImpl f23244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23245c;

    public /* synthetic */ a(MutexImpl mutexImpl, Object obj, int i) {
        this.f23243a = i;
        this.f23244b = mutexImpl;
        this.f23245c = obj;
    }

    @Override // ca.InterfaceC0651q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p tryResume$lambda$3;
        p onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
        Throwable th = (Throwable) obj;
        switch (this.f23243a) {
            case 0:
                tryResume$lambda$3 = MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(this.f23244b, (MutexImpl.CancellableContinuationWithOwner) this.f23245c, th, (p) obj2, (d) obj3);
                return tryResume$lambda$3;
            default:
                onSelectCancellationUnlockConstructor$lambda$1$lambda$0 = MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.f23244b, this.f23245c, th, obj2, (d) obj3);
                return onSelectCancellationUnlockConstructor$lambda$1$lambda$0;
        }
    }
}
