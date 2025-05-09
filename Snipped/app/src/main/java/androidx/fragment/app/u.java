package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.chuckerteam.chucker.internal.ui.transaction.PayloadType;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionOverviewFragment;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment;
import java.util.ArrayList;
import o1.AbstractC1086a;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class u extends AbstractC1086a {

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f6908b;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6914h;

    /* renamed from: d, reason: collision with root package name */
    public C0527a f6910d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<Fragment.SavedState> f6911e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<Fragment> f6912f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public Fragment f6913g = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f6909c = 1;

    public u(FragmentManager fragmentManager) {
        this.f6908b = fragmentManager;
    }

    @Override // o1.AbstractC1086a
    public final void a(int i, Object obj) {
        ArrayList<Fragment.SavedState> arrayList;
        Fragment fragment = (Fragment) obj;
        C0527a c0527a = this.f6910d;
        FragmentManager fragmentManager = this.f6908b;
        if (c0527a == null) {
            fragmentManager.getClass();
            this.f6910d = new C0527a(fragmentManager);
        }
        while (true) {
            arrayList = this.f6911e;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragment.isAdded() ? fragmentManager.c0(fragment) : null);
        this.f6912f.set(i, null);
        this.f6910d.l(fragment);
        if (fragment.equals(this.f6913g)) {
            this.f6913g = null;
        }
    }

    @Override // o1.AbstractC1086a
    public final void b() {
        C0527a c0527a = this.f6910d;
        if (c0527a != null) {
            if (!this.f6914h) {
                try {
                    this.f6914h = true;
                    if (c0527a.f6925g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c0527a.f6926h = false;
                    c0527a.f6838r.C(c0527a, true);
                } finally {
                    this.f6914h = false;
                }
            }
            this.f6910d = null;
        }
    }

    @Override // o1.AbstractC1086a
    public final Object e(ViewGroup viewGroup, int i) {
        Fragment transactionOverviewFragment;
        Fragment.SavedState savedState;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.f6912f;
        if (arrayList.size() > i && (fragment = arrayList.get(i)) != null) {
            return fragment;
        }
        if (this.f6910d == null) {
            FragmentManager fragmentManager = this.f6908b;
            fragmentManager.getClass();
            this.f6910d = new C0527a(fragmentManager);
        }
        if (i == 0) {
            transactionOverviewFragment = new TransactionOverviewFragment();
        } else if (i == 1) {
            PayloadType payloadType = PayloadType.f8711a;
            transactionOverviewFragment = new TransactionPayloadFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("type", payloadType);
            transactionOverviewFragment.setArguments(bundle);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("no item");
            }
            PayloadType payloadType2 = PayloadType.f8712b;
            transactionOverviewFragment = new TransactionPayloadFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("type", payloadType2);
            transactionOverviewFragment.setArguments(bundle2);
        }
        ArrayList<Fragment.SavedState> arrayList2 = this.f6911e;
        if (arrayList2.size() > i && (savedState = arrayList2.get(i)) != null) {
            transactionOverviewFragment.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
        transactionOverviewFragment.setMenuVisibility(false);
        int i9 = this.f6909c;
        if (i9 == 0) {
            transactionOverviewFragment.setUserVisibleHint(false);
        }
        arrayList.set(i, transactionOverviewFragment);
        this.f6910d.d(viewGroup.getId(), transactionOverviewFragment, null, 1);
        if (i9 == 1) {
            this.f6910d.m(transactionOverviewFragment, Lifecycle.State.f6978d);
        }
        return transactionOverviewFragment;
    }

    @Override // o1.AbstractC1086a
    public final boolean f(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // o1.AbstractC1086a
    public final void g(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<Fragment.SavedState> arrayList = this.f6911e;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.f6912f;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment J3 = this.f6908b.J(str, bundle);
                    if (J3 != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        J3.setMenuVisibility(false);
                        arrayList2.set(parseInt, J3);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // o1.AbstractC1086a
    public final Parcelable h() {
        Bundle bundle;
        ArrayList<Fragment.SavedState> arrayList = this.f6911e;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.f6912f;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = arrayList2.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f6908b.X(bundle, com.google.android.gms.measurement.internal.a.g(i, "f"), fragment);
            }
            i++;
        }
    }

    @Override // o1.AbstractC1086a
    public final void i(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f6913g;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f6908b;
            int i = this.f6909c;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i == 1) {
                    if (this.f6910d == null) {
                        fragmentManager.getClass();
                        this.f6910d = new C0527a(fragmentManager);
                    }
                    this.f6910d.m(this.f6913g, Lifecycle.State.f6978d);
                } else {
                    this.f6913g.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i == 1) {
                if (this.f6910d == null) {
                    fragmentManager.getClass();
                    this.f6910d = new C0527a(fragmentManager);
                }
                this.f6910d.m(fragment, Lifecycle.State.f6979e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f6913g = fragment;
        }
    }

    @Override // o1.AbstractC1086a
    public final void j(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
