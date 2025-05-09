package androidx.lifecycle;

import R0.a;
import android.os.Bundle;
import androidx.lifecycle.G;
import androidx.lifecycle.Lifecycle;
import b1.C0582b;
import b1.InterfaceC0584d;
import java.util.LinkedHashMap;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6965a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final c f6966b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a f6967c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<InterfaceC0584d> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<X> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class d implements T {
        @Override // androidx.lifecycle.T
        public final <T extends Q> T create(Class<T> cls, R0.a aVar) {
            return new K();
        }
    }

    public static final G a(R0.a aVar) {
        InterfaceC0584d interfaceC0584d = (InterfaceC0584d) aVar.a(f6965a);
        if (interfaceC0584d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        X x9 = (X) aVar.a(f6966b);
        if (x9 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f6967c);
        String str = (String) aVar.a(S0.c.f3333a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        C0582b.InterfaceC0093b b9 = interfaceC0584d.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider = b9 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) b9 : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = c(x9).f6968k;
        G g10 = (G) linkedHashMap.get(str);
        if (g10 != null) {
            return g10;
        }
        Class<? extends Object>[] clsArr = G.f6955f;
        savedStateHandlesProvider.c();
        Bundle bundle2 = savedStateHandlesProvider.f7050c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = savedStateHandlesProvider.f7050c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = savedStateHandlesProvider.f7050c;
        if (bundle5 != null && bundle5.isEmpty()) {
            savedStateHandlesProvider.f7050c = null;
        }
        G a10 = G.a.a(bundle3, bundle);
        linkedHashMap.put(str, a10);
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC0584d & X> void b(T t3) {
        Lifecycle.State b9 = t3.getLifecycle().b();
        if (b9 != Lifecycle.State.f6976b && b9 != Lifecycle.State.f6977c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t3.getSavedStateRegistry().b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t3.getSavedStateRegistry(), t3);
            t3.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t3.getLifecycle().a(new H(savedStateHandlesProvider));
        }
    }

    public static final K c(X x9) {
        return (K) new R0.e(x9.getViewModelStore(), new d(), x9 instanceof InterfaceC0543i ? ((InterfaceC0543i) x9).getDefaultViewModelCreationExtras() : a.C0040a.f3236b).a(kotlin.jvm.internal.h.a(K.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
