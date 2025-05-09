package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.G;
import b1.C0582b;
import b1.InterfaceC0584d;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class L extends V implements T {

    /* renamed from: e, reason: collision with root package name */
    public final Application f6969e;

    /* renamed from: f, reason: collision with root package name */
    public final S f6970f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f6971g;

    /* renamed from: h, reason: collision with root package name */
    public final Lifecycle f6972h;
    public final C0582b i;

    public L() {
        this.f6970f = new S(null);
    }

    @Override // androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls, R0.a aVar) {
        S0.c cVar = S0.c.f3333a;
        LinkedHashMap linkedHashMap = ((R0.c) aVar).f3235a;
        String str = (String) linkedHashMap.get(cVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(J.f6965a) == null || linkedHashMap.get(J.f6966b) == null) {
            if (this.f6972h != null) {
                return (T) create(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(S.f7046d);
        boolean isAssignableFrom = C0536b.class.isAssignableFrom(cls);
        Constructor a10 = (!isAssignableFrom || application == null) ? M.a(cls, M.f6993b) : M.a(cls, M.f6992a);
        return a10 == null ? (T) this.f6970f.create(cls, aVar) : (!isAssignableFrom || application == null) ? (T) M.b(cls, a10, J.a(aVar)) : (T) M.b(cls, a10, application, J.a(aVar));
    }

    @Override // androidx.lifecycle.V
    public final void onRequery(Q q10) {
        Lifecycle lifecycle = this.f6972h;
        if (lifecycle != null) {
            C0544j.a(q10, this.i, lifecycle);
        }
    }

    @SuppressLint({"LambdaLast"})
    public L(Application application, InterfaceC0584d interfaceC0584d, Bundle bundle) {
        S s10;
        this.i = interfaceC0584d.getSavedStateRegistry();
        this.f6972h = interfaceC0584d.getLifecycle();
        this.f6971g = bundle;
        this.f6969e = application;
        if (application != null) {
            if (S.f7045c == null) {
                S.f7045c = new S(application);
            }
            s10 = S.f7045c;
        } else {
            s10 = new S(null);
        }
        this.f6970f = s10;
    }

    public final <T extends Q> T create(String str, Class<T> cls) {
        Constructor a10;
        T t3;
        Lifecycle lifecycle = this.f6972h;
        if (lifecycle != null) {
            boolean isAssignableFrom = C0536b.class.isAssignableFrom(cls);
            Application application = this.f6969e;
            if (isAssignableFrom && application != null) {
                a10 = M.a(cls, M.f6992a);
            } else {
                a10 = M.a(cls, M.f6993b);
            }
            if (a10 == null) {
                if (application != null) {
                    return (T) this.f6970f.create(cls);
                }
                if (U.f7059a == null) {
                    U.f7059a = new U();
                }
                return (T) U.f7059a.create(cls);
            }
            C0582b c0582b = this.i;
            Bundle bundle = this.f6971g;
            Bundle a11 = c0582b.a(str);
            Class<? extends Object>[] clsArr = G.f6955f;
            G a12 = G.a.a(a11, bundle);
            I i = new I(a12, str);
            i.i(lifecycle, c0582b);
            C0544j.b(lifecycle, c0582b);
            if (isAssignableFrom && application != null) {
                t3 = (T) M.b(cls, a10, application, a12);
            } else {
                t3 = (T) M.b(cls, a10, a12);
            }
            t3.addCloseable("androidx.lifecycle.savedstate.vm.tag", i);
            return t3;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.T
    public final <T extends Q> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
