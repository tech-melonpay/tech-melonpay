package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.C0582b;
import b1.InterfaceC0584d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: LegacySavedStateHandleController.kt */
/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544j {

    /* compiled from: LegacySavedStateHandleController.kt */
    /* renamed from: androidx.lifecycle.j$a */
    public static final class a implements C0582b.a {
        @Override // b1.C0582b.a
        public final void a(InterfaceC0584d interfaceC0584d) {
            if (!(interfaceC0584d instanceof X)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            W viewModelStore = ((X) interfaceC0584d).getViewModelStore();
            C0582b savedStateRegistry = interfaceC0584d.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f7060a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                C0544j.a((Q) linkedHashMap.get((String) it.next()), savedStateRegistry, interfaceC0584d.getLifecycle());
            }
            if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                savedStateRegistry.d();
            }
        }
    }

    public static final void a(Q q10, C0582b c0582b, Lifecycle lifecycle) {
        I i = (I) q10.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (i == null || i.f6964c) {
            return;
        }
        i.i(lifecycle, c0582b);
        b(lifecycle, c0582b);
    }

    public static void b(Lifecycle lifecycle, C0582b c0582b) {
        Lifecycle.State b9 = lifecycle.b();
        if (b9 == Lifecycle.State.f6976b || b9.a(Lifecycle.State.f6978d)) {
            c0582b.d();
        } else {
            lifecycle.a(new C0545k(lifecycle, c0582b));
        }
    }
}
