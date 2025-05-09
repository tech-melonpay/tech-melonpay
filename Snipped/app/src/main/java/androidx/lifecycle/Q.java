package androidx.lifecycle;

import java.util.Iterator;

/* compiled from: ViewModel.jvm.kt */
/* loaded from: classes.dex */
public abstract class Q {
    private final S0.b impl = new S0.b();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        S0.b bVar = this.impl;
        if (bVar != null) {
            if (bVar.f3332d) {
                S0.b.a(autoCloseable);
                return;
            }
            synchronized (bVar.f3329a) {
                autoCloseable2 = (AutoCloseable) bVar.f3330b.put(str, autoCloseable);
            }
            S0.b.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        S0.b bVar = this.impl;
        if (bVar != null && !bVar.f3332d) {
            bVar.f3332d = true;
            synchronized (bVar.f3329a) {
                try {
                    Iterator it = bVar.f3330b.values().iterator();
                    while (it.hasNext()) {
                        S0.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f3331c.iterator();
                    while (it2.hasNext()) {
                        S0.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f3331c.clear();
                    O9.p pVar = O9.p.f3034a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t3;
        S0.b bVar = this.impl;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f3329a) {
            t3 = (T) bVar.f3330b.get(str);
        }
        return t3;
    }

    public void onCleared() {
    }
}
