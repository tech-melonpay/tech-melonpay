package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class q extends Q {

    /* renamed from: F0, reason: collision with root package name */
    public static final a f6881F0 = new a();

    /* renamed from: C0, reason: collision with root package name */
    public final boolean f6883C0;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap<String, Fragment> f6886k = new HashMap<>();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap<String, q> f6887p = new HashMap<>();

    /* renamed from: B0, reason: collision with root package name */
    public final HashMap<String, W> f6882B0 = new HashMap<>();

    /* renamed from: D0, reason: collision with root package name */
    public boolean f6884D0 = false;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f6885E0 = false;

    /* compiled from: FragmentManagerViewModel.java */
    public class a implements T {
        @Override // androidx.lifecycle.T
        public final <T extends Q> T create(Class<T> cls) {
            return new q(true);
        }
    }

    public q(boolean z10) {
        this.f6883C0 = z10;
    }

    public final void a(Fragment fragment) {
        if (this.f6885E0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap<String, Fragment> hashMap = this.f6886k;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void b(Fragment fragment, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        d(fragment.mWho, z10);
    }

    public final void c(String str, boolean z10) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z10);
    }

    public final void d(String str, boolean z10) {
        HashMap<String, q> hashMap = this.f6887p;
        q qVar = hashMap.get(str);
        if (qVar != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(qVar.f6887p.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qVar.c((String) it.next(), true);
                }
            }
            qVar.onCleared();
            hashMap.remove(str);
        }
        HashMap<String, W> hashMap2 = this.f6882B0;
        W w2 = hashMap2.get(str);
        if (w2 != null) {
            w2.a();
            hashMap2.remove(str);
        }
    }

    public final void e(Fragment fragment) {
        if (this.f6885E0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6886k.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f6886k.equals(qVar.f6886k) && this.f6887p.equals(qVar.f6887p) && this.f6882B0.equals(qVar.f6882B0);
    }

    public final int hashCode() {
        return this.f6882B0.hashCode() + ((this.f6887p.hashCode() + (this.f6886k.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.Q
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6884D0 = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f6886k.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f6887p.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f6882B0.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
