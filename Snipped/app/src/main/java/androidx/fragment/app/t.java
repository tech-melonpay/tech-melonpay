package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.X;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final n f6902a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6903b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f6904c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6905d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f6906e = -1;

    public t(n nVar, v vVar, Fragment fragment) {
        this.f6902a = nVar;
        this.f6903b = vVar;
        this.f6904c = fragment;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f6902a.a(fragment, false);
    }

    public final void b() {
        Fragment fragment;
        View view;
        View view2;
        int i = -1;
        Fragment fragment2 = this.f6904c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i9 = fragment2.mContainerId;
            FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(fragment);
            sb2.append(" via container with ID ");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment2, s3.b.m(sb2, i9, " without using parent's childFragmentManager"));
            FragmentStrictMode.c(wrongNestedHierarchyViolation);
            FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment2);
            if (a10.f6899a.contains(FragmentStrictMode.Flag.f6893e) && FragmentStrictMode.e(a10, fragment2.getClass(), WrongNestedHierarchyViolation.class)) {
                FragmentStrictMode.b(a10, wrongNestedHierarchyViolation);
            }
        }
        v vVar = this.f6903b;
        vVar.getClass();
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = vVar.f6915a;
            int indexOf = arrayList.indexOf(fragment2);
            int i10 = indexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = arrayList.get(i10);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        t tVar = null;
        v vVar = this.f6903b;
        if (fragment2 != null) {
            t tVar2 = vVar.f6916b.get(fragment2.mWho);
            if (tVar2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            tVar = tVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (tVar = vVar.f6916b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(androidx.camera.core.impl.utils.a.n(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (tVar != null) {
            tVar.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f6755x;
        fragment.mParentFragment = fragmentManager.f6757z;
        n nVar = this.f6902a;
        nVar.g(fragment, false);
        fragment.performAttach();
        nVar.b(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.f6904c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f6906e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i = Math.max(this.f6906e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f6906e < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!fragment.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            SpecialEffectsController i9 = SpecialEffectsController.i(viewGroup, fragment.getParentFragmentManager());
            i9.getClass();
            SpecialEffectsController.Operation f10 = i9.f(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = f10 != null ? f10.f6816b : null;
            SpecialEffectsController.Operation g10 = i9.g(fragment);
            r9 = g10 != null ? g10.f6816b : null;
            int i10 = lifecycleImpact == null ? -1 : SpecialEffectsController.c.f6837a[lifecycleImpact.ordinal()];
            if (i10 != -1 && i10 != 1) {
                r9 = lifecycleImpact;
            }
        }
        if (r9 == SpecialEffectsController.Operation.LifecycleImpact.f6826b) {
            i = Math.min(i, 6);
        } else if (r9 == SpecialEffectsController.Operation.LifecycleImpact.f6827c) {
            i = Math.max(i, 3);
        } else if (fragment.mRemoving) {
            i = fragment.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i = Math.min(i, 4);
        }
        if (fragment.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + fragment);
        }
        return i;
    }

    public final void e() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            n nVar = this.f6902a;
            nVar.h(fragment, false);
            fragment.performCreate(bundle2);
            nVar.c(fragment, bundle2, false);
        }
    }

    public final void f() {
        String str;
        Fragment fragment = this.f6904c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.k("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f6756y.b(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                    FragmentStrictMode.c(wrongFragmentContainerViolation);
                    FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment);
                    if (a10.f6899a.contains(FragmentStrictMode.Flag.i) && FragmentStrictMode.e(a10, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.b(a10, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                C1596C.c.c(view);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.f6902a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment b9;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        v vVar = this.f6903b;
        if (z11 && !fragment.mBeingSaved) {
            vVar.i(fragment.mWho, null);
        }
        if (!z11) {
            q qVar = vVar.f6918d;
            if (qVar.f6886k.containsKey(fragment.mWho) && qVar.f6883C0 && !qVar.f6884D0) {
                String str = fragment.mTargetWho;
                if (str != null && (b9 = vVar.b(str)) != null && b9.mRetainInstance) {
                    fragment.mTarget = b9;
                }
                fragment.mState = 0;
                return;
            }
        }
        l<?> lVar = fragment.mHost;
        if (lVar instanceof X) {
            z10 = vVar.f6918d.f6884D0;
        } else {
            Context context = lVar.f6869b;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z11 && !fragment.mBeingSaved) || z10) {
            vVar.f6918d.b(fragment, false);
        }
        fragment.performDestroy();
        this.f6902a.d(fragment, false);
        Iterator it = vVar.d().iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = tVar.f6904c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = vVar.b(str3);
        }
        vVar.h(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f6902a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f6902a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            q qVar = this.f6903b.f6918d;
            if (qVar.f6886k.containsKey(fragment.mWho) && qVar.f6883C0 && !qVar.f6884D0) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f6904c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f6902a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t.k():void");
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f6904c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment.mTargetWho = fragmentState.f6802m;
                fragment.mTargetRequestCode = fragmentState.f6803n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.f6804o;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e10);
        }
    }

    public final void m() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f6904c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(fragment);
                sb2.append(" resulting in focused view ");
                sb2.append(fragment.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f6902a.i(fragment, false);
        this.f6903b.i(fragment.mWho, null);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f6904c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f6902a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle b02 = fragment.mChildFragmentManager.b0();
            if (!b02.isEmpty()) {
                bundle2.putBundle("childFragmentManager", b02);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.f6904c;
        if (fragment.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f6628f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public t(n nVar, v vVar, ClassLoader classLoader, k kVar, Bundle bundle) {
        this.f6902a = nVar;
        this.f6903b = vVar;
        Fragment a10 = ((FragmentState) bundle.getParcelable("state")).a(kVar, classLoader);
        this.f6904c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public t(n nVar, v vVar, Fragment fragment, Bundle bundle) {
        this.f6902a = nVar;
        this.f6903b = vVar;
        this.f6904c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    /* compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f6907a;

        public a(View view) {
            this.f6907a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f6907a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
