package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0650p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super O9.p> aVar) {
        if (state == Lifecycle.State.f6976b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.b() == Lifecycle.State.f6975a) {
            return O9.p.f3034a;
        }
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, interfaceC0650p, null), aVar);
        return coroutineScope == CoroutineSingletons.f23158a ? coroutineScope : O9.p.f3034a;
    }
}
