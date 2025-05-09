package androidx.lifecycle;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PausingDispatcher.jvm.kt */
/* loaded from: classes.dex */
public final class C extends CoroutineDispatcher {

    /* renamed from: b, reason: collision with root package name */
    public final C0540f f6950b = new C0540f();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public final void mo168dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        this.f6950b.a(dVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        if (Dispatchers.getMain().getImmediate().isDispatchNeeded(dVar)) {
            return true;
        }
        C0540f c0540f = this.f6950b;
        return !(c0540f.f7083b || !c0540f.f7082a);
    }
}
