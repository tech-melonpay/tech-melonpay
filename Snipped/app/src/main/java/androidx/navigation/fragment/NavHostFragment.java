package androidx.navigation.fragment;

import O9.f;
import O9.p;
import U0.h;
import U0.j;
import U0.o;
import W0.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.W;
import androidx.lifecycle.r;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.b;
import androidx.navigation.i;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: NavHostFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final f f7306f0 = kotlin.a.a(new InterfaceC0635a<j>() { // from class: androidx.navigation.fragment.NavHostFragment$navHostController$2
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final j invoke() {
            Object[] objArr;
            Lifecycle lifecycle;
            NavHostFragment navHostFragment = NavHostFragment.this;
            Context context = navHostFragment.getContext();
            if (context == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            }
            j jVar = new j(context);
            if (!kotlin.jvm.internal.f.b(navHostFragment, jVar.f7170p)) {
                r rVar = jVar.f7170p;
                h hVar = jVar.f7174t;
                if (rVar != null && (lifecycle = rVar.getLifecycle()) != null) {
                    lifecycle.c(hVar);
                }
                jVar.f7170p = navHostFragment;
                navHostFragment.getLifecycle().a(hVar);
            }
            W viewModelStore = navHostFragment.getViewModelStore();
            if (!kotlin.jvm.internal.f.b(jVar.f7171q, b.C0077b.a(viewModelStore))) {
                if (!jVar.f7162g.isEmpty()) {
                    throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
                }
                jVar.f7171q = b.C0077b.a(viewModelStore);
            }
            W0.b bVar = new W0.b(navHostFragment.requireContext(), navHostFragment.getChildFragmentManager());
            androidx.navigation.j jVar2 = jVar.f7177w;
            jVar2.a(bVar);
            Context requireContext = navHostFragment.requireContext();
            FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
            int id = navHostFragment.getId();
            if (id == 0 || id == -1) {
                id = R.id.nav_host_fragment_container;
            }
            jVar2.a(new FragmentNavigator(requireContext, childFragmentManager, id));
            Bundle a10 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
            if (a10 != null) {
                a10.setClassLoader(context.getClassLoader());
                jVar.f7159d = a10.getBundle("android-support-nav:controller:navigatorState");
                jVar.f7160e = a10.getParcelableArray("android-support-nav:controller:backStack");
                LinkedHashMap linkedHashMap = jVar.f7169o;
                linkedHashMap.clear();
                int[] intArray = a10.getIntArray("android-support-nav:controller:backStackDestIds");
                ArrayList<String> stringArrayList = a10.getStringArrayList("android-support-nav:controller:backStackIds");
                if (intArray != null && stringArrayList != null) {
                    int length = intArray.length;
                    int i = 0;
                    int i9 = 0;
                    while (i < length) {
                        jVar.f7168n.put(Integer.valueOf(intArray[i]), stringArrayList.get(i9));
                        i++;
                        i9++;
                    }
                }
                ArrayList<String> stringArrayList2 = a10.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    for (String str : stringArrayList2) {
                        Parcelable[] parcelableArray = a10.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                        if (parcelableArray != null) {
                            int length2 = parcelableArray.length;
                            P9.h hVar2 = new P9.h();
                            if (length2 == 0) {
                                objArr = P9.h.f3154d;
                            } else {
                                if (length2 <= 0) {
                                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(length2, "Illegal Capacity: "));
                                }
                                objArr = new Object[length2];
                            }
                            hVar2.f3156b = objArr;
                            int i10 = 0;
                            while (i10 < parcelableArray.length) {
                                int i11 = i10 + 1;
                                try {
                                    hVar2.addLast((NavBackStackEntryState) parcelableArray[i10]);
                                    i10 = i11;
                                } catch (ArrayIndexOutOfBoundsException e10) {
                                    throw new NoSuchElementException(e10.getMessage());
                                }
                            }
                            linkedHashMap.put(str, hVar2);
                        }
                    }
                }
                jVar.f7161f = a10.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new e(jVar, 0));
            Bundle a11 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
            if (a11 != null) {
                navHostFragment.f7308h0 = a11.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new e(navHostFragment, 1));
            int i12 = navHostFragment.f7308h0;
            f fVar = jVar.f7153D;
            if (i12 != 0) {
                jVar.t(((androidx.navigation.f) fVar.getValue()).b(i12), null);
            } else {
                Bundle arguments = navHostFragment.getArguments();
                int i13 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i13 != 0) {
                    jVar.t(((androidx.navigation.f) fVar.getValue()).b(i13), bundle);
                }
            }
            return jVar;
        }
    });

    /* renamed from: g0, reason: collision with root package name */
    public View f7307g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f7308h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f7309i0;

    public final j o0() {
        return (j) this.f7306f0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.f7309i0) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0527a c0527a = new C0527a(parentFragmentManager);
            c0527a.n(this);
            c0527a.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        o0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f7309i0 = true;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C0527a c0527a = new C0527a(parentFragmentManager);
            c0527a.n(this);
            c0527a.h();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f7307g0;
        if (view != null && i.a(view) == o0()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f7307g0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f3633b);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f7308h0 = resourceId;
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, W0.f.f3792c);
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f7309i0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f7309i0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, o0());
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f7307g0 = view2;
            if (view2.getId() == getId()) {
                this.f7307g0.setTag(R.id.nav_controller_view_tag, o0());
            }
        }
    }
}
