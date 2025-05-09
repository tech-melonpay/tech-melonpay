package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.G;
import b1.C0582b;
import b1.InterfaceC0584d;

/* compiled from: AbstractSavedStateViewModelFactory.kt */
/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0535a extends V implements T {
    private Bundle defaultArgs;
    private Lifecycle lifecycle;
    private C0582b savedStateRegistry;

    public AbstractC0535a(InterfaceC0584d interfaceC0584d, Bundle bundle) {
        this.savedStateRegistry = interfaceC0584d.getSavedStateRegistry();
        this.lifecycle = interfaceC0584d.getLifecycle();
        this.defaultArgs = bundle;
    }

    @Override // androidx.lifecycle.T
    public <T extends Q> T create(Class<T> cls, R0.a aVar) {
        String str = (String) aVar.a(S0.c.f3333a);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) create(str, cls) : (T) create(str, cls, J.a(aVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public abstract <T extends Q> T create(String str, Class<T> cls, G g10);

    @Override // androidx.lifecycle.V
    public void onRequery(Q q10) {
        C0582b c0582b = this.savedStateRegistry;
        if (c0582b != null) {
            C0544j.a(q10, c0582b, this.lifecycle);
        }
    }

    private final <T extends Q> T create(String str, Class<T> cls) {
        C0582b c0582b = this.savedStateRegistry;
        Lifecycle lifecycle = this.lifecycle;
        Bundle bundle = this.defaultArgs;
        Bundle a10 = c0582b.a(str);
        Class<? extends Object>[] clsArr = G.f6955f;
        G a11 = G.a.a(a10, bundle);
        I i = new I(a11, str);
        i.i(lifecycle, c0582b);
        C0544j.b(lifecycle, c0582b);
        T t3 = (T) create(str, cls, a11);
        t3.addCloseable("androidx.lifecycle.savedstate.vm.tag", i);
        return t3;
    }

    @Override // androidx.lifecycle.T
    public <T extends Q> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
