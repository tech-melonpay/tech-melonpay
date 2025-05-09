package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f6915a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, t> f6916b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f6917c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public q f6918d;

    public final void a(Fragment fragment) {
        if (this.f6915a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f6915a) {
            this.f6915a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        t tVar = this.f6916b.get(str);
        if (tVar != null) {
            return tVar.f6904c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (t tVar : this.f6916b.values()) {
            if (tVar != null && (findFragmentByWho = tVar.f6904c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f6916b.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f6916b.values()) {
            if (tVar != null) {
                arrayList.add(tVar.f6904c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f6915a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f6915a) {
            arrayList = new ArrayList(this.f6915a);
        }
        return arrayList;
    }

    public final void g(t tVar) {
        Fragment fragment = tVar.f6904c;
        String str = fragment.mWho;
        HashMap<String, t> hashMap = this.f6916b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, tVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f6918d.a(fragment);
            } else {
                this.f6918d.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(t tVar) {
        Fragment fragment = tVar.f6904c;
        if (fragment.mRetainInstance) {
            this.f6918d.e(fragment);
        }
        HashMap<String, t> hashMap = this.f6916b;
        if (hashMap.get(fragment.mWho) == tVar && hashMap.put(fragment.mWho, null) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap<String, Bundle> hashMap = this.f6917c;
        return bundle != null ? hashMap.put(str, bundle) : hashMap.remove(str);
    }
}
