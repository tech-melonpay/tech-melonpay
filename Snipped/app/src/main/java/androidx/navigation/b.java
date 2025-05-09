package androidx.navigation;

import R0.a;
import U0.l;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: NavControllerViewModel.kt */
/* loaded from: classes.dex */
public final class b extends Q implements l {

    /* renamed from: p, reason: collision with root package name */
    public static final a f7257p = new a();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f7258k = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    public static final class a implements T {
        @Override // androidx.lifecycle.T
        public final <T extends Q> T create(Class<T> cls) {
            return new b();
        }
    }

    /* compiled from: NavControllerViewModel.kt */
    /* renamed from: androidx.navigation.b$b, reason: collision with other inner class name */
    public static final class C0077b {
        public static b a(W w2) {
            R0.e eVar = new R0.e(w2, b.f7257p, a.C0040a.f3236b);
            kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(b.class);
            String b9 = a10.b();
            if (b9 != null) {
                return (b) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
    }

    @Override // U0.l
    public final W g(String str) {
        LinkedHashMap linkedHashMap = this.f7258k;
        W w2 = (W) linkedHashMap.get(str);
        if (w2 != null) {
            return w2;
        }
        W w10 = new W();
        linkedHashMap.put(str, w10);
        return w10;
    }

    @Override // androidx.lifecycle.Q
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f7258k;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((W) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f7258k.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
