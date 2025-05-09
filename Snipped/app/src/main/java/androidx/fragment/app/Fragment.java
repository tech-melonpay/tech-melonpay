package androidx.fragment.app;

import R0.a;
import T0.b;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.InterfaceC0550p;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import b1.C0582b;
import b1.C0583c;
import b1.InterfaceC0584d;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import e.InterfaceC0703b;
import f.AbstractC0728a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0913a;
import p.InterfaceC1096a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, X, InterfaceC0543i, InterfaceC0584d, InterfaceC0703b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    T mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.l<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0553t mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    C0583c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    D mViewLifecycleOwner;
    C0559z<androidx.lifecycle.r> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends AbstractC0704c<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f6678a;

        public a(AtomicReference atomicReference) {
            this.f6678a = atomicReference;
        }

        @Override // e.AbstractC0704c
        public final void a(Object obj) {
            AbstractC0704c abstractC0704c = (AbstractC0704c) this.f6678a.get();
            if (abstractC0704c == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0704c.a(obj);
        }

        @Override // e.AbstractC0704c
        public final void b() {
            AbstractC0704c abstractC0704c = (AbstractC0704c) this.f6678a.getAndSet(null);
            if (abstractC0704c != null) {
                abstractC0704c.b();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends l {
        public c() {
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a();
            J.b(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController f6682a;

        public e(SpecialEffectsController specialEffectsController) {
            this.f6682a = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SpecialEffectsController specialEffectsController = this.f6682a;
            if (!specialEffectsController.f6810b.isEmpty()) {
                specialEffectsController.e();
            }
        }
    }

    public class f extends androidx.fragment.app.i {
        public f() {
        }

        @Override // androidx.fragment.app.i
        public final View b(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " does not have a view"));
        }

        @Override // androidx.fragment.app.i
        public final boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements InterfaceC0550p {
        public g() {
        }

        @Override // androidx.lifecycle.InterfaceC0550p
        public final void d(androidx.lifecycle.r rVar, Lifecycle.Event event) {
            View view;
            if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements InterfaceC1096a<Void, androidx.activity.result.a> {
        public h() {
        }

        @Override // p.InterfaceC1096a
        public final androidx.activity.result.a apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof e.f ? ((e.f) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class i implements InterfaceC1096a<Void, androidx.activity.result.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f6686a;

        public i(androidx.activity.result.a aVar) {
            this.f6686a = aVar;
        }

        @Override // p.InterfaceC1096a
        public final androidx.activity.result.a apply(Void r12) {
            return this.f6686a;
        }
    }

    public class j extends l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1096a f6687a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f6688b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC0728a f6689c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0702a f6690d;

        public j(InterfaceC1096a interfaceC1096a, AtomicReference atomicReference, AbstractC0728a abstractC0728a, InterfaceC0702a interfaceC0702a) {
            this.f6687a = interfaceC1096a;
            this.f6688b = atomicReference;
            this.f6689c = abstractC0728a;
            this.f6690d = interfaceC0702a;
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f6688b.set(((androidx.activity.result.a) this.f6687a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f6689c, this.f6690d));
        }
    }

    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6692a;

        /* renamed from: b, reason: collision with root package name */
        public int f6693b;

        /* renamed from: c, reason: collision with root package name */
        public int f6694c;

        /* renamed from: d, reason: collision with root package name */
        public int f6695d;

        /* renamed from: e, reason: collision with root package name */
        public int f6696e;

        /* renamed from: f, reason: collision with root package name */
        public int f6697f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<String> f6698g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList<String> f6699h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f6700j;

        /* renamed from: k, reason: collision with root package name */
        public Object f6701k;

        /* renamed from: l, reason: collision with root package name */
        public Object f6702l;

        /* renamed from: m, reason: collision with root package name */
        public Object f6703m;

        /* renamed from: n, reason: collision with root package name */
        public Object f6704n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f6705o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f6706p;

        /* renamed from: q, reason: collision with root package name */
        public j0.G f6707q;

        /* renamed from: r, reason: collision with root package name */
        public j0.G f6708r;

        /* renamed from: s, reason: collision with root package name */
        public float f6709s;

        /* renamed from: t, reason: collision with root package name */
        public View f6710t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f6711u;
    }

    public static abstract class l {
        public abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new p();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = Lifecycle.State.f6979e;
        this.mViewLifecycleOwnerLiveData = new C0559z<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.f6700j = obj;
            kVar.f6701k = null;
            kVar.f6702l = obj;
            kVar.f6703m = null;
            kVar.f6704n = obj;
            kVar.f6707q = null;
            kVar.f6708r = null;
            kVar.f6709s = 1.0f;
            kVar.f6710t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.f6976b || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0553t(this);
        this.mSavedStateRegistryController = new C0583c(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        D d10 = this.mViewLifecycleOwner;
        d10.f6628f.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> AbstractC0704c<I> prepareCallInternal(AbstractC0728a<I, O> abstractC0728a, InterfaceC1096a<Void, androidx.activity.result.a> interfaceC1096a, InterfaceC0702a<O> interfaceC0702a) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(interfaceC1096a, atomicReference, abstractC0728a, interfaceC0702a));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    private void restoreViewState() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f6711u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController i9 = SpecialEffectsController.i(viewGroup, fragmentManager);
        i9.k();
        if (z10) {
            this.mHost.f6870c.post(new e(i9));
        } else {
            i9.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public androidx.fragment.app.i createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            new T0.b(this, getViewModelStore()).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + com.sumsub.sns.internal.core.data.model.p.f15541a);
        this.mChildFragmentManager.x(C.v.n(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f6735c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC0533g getActivity() {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar == null) {
            return null;
        }
        return (ActivityC0533g) lVar.f6868a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f6706p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f6705o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar == null) {
            return null;
        }
        return lVar.f6869b;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public R0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        R0.c cVar = new R0.c(0);
        if (application != null) {
            cVar.b(S.f7046d, application);
        }
        cVar.b(J.f6965a, this);
        cVar.b(J.f6966b, this);
        if (getArguments() != null) {
            cVar.b(J.f6967c, getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public T getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new L(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f6693b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.i;
    }

    public j0.G getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f6707q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f6694c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f6701k;
    }

    public j0.G getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f6708r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f6710t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar == null) {
            return null;
        }
        return lVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.r
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public T0.a getLoaderManager() {
        return new T0.b(this, getViewModelStore());
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f6697f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f6692a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f6695d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f6696e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f6709s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f6702l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this);
        FragmentStrictMode.c(getRetainInstanceUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
        if (a10.f6899a.contains(FragmentStrictMode.Flag.f6894f) && FragmentStrictMode.e(a10, getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(a10, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f6700j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // b1.InterfaceC0584d
    public final C0582b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f8286b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f6703m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f6704n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f6698g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f6699h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i9) {
        return getResources().getString(i9);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this);
        FragmentStrictMode.c(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
        if (a10.f6899a.contains(FragmentStrictMode.Flag.f6896h) && FragmentStrictMode.e(a10, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.b(a10, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i9) {
        return getResources().getText(i9);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.r getViewLifecycleOwner() {
        D d10 = this.mViewLifecycleOwner;
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public AbstractC0557x<androidx.lifecycle.r> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.X
    public W getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, W> hashMap = this.mFragmentManager.f6731P.f6882B0;
        W w2 = hashMap.get(this.mWho);
        if (w2 != null) {
            return w2;
        }
        W w10 = new W();
        hashMap.put(this.mWho, w10);
        return w10;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new p();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager != null) {
                Fragment fragment = this.mParentFragment;
                fragmentManager.getClass();
                if (fragment != null && fragment.isHidden()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        Fragment fragment;
        return this.mMenuVisible && (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || fragment.isMenuVisible());
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f6711u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.R();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.T();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i9 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        androidx.fragment.app.l<?> lVar = this.mHost;
        Activity activity = lVar == null ? null : lVar.f6868a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f6754w >= 1) {
            return;
        }
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(1);
    }

    public Animation onCreateAnimation(int i9, boolean z10, int i10) {
        return null;
    }

    public Animator onCreateAnimator(int i9, boolean z10, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i9 = this.mContentLayoutId;
        if (i9 != 0) {
            return layoutInflater.inflate(i9, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.l<?> lVar = this.mHost;
        Activity activity = lVar == null ? null : lVar.f6868a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(4);
    }

    public void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f6869b);
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<r> it2 = this.mFragmentManager.f6748q.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.k(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.l(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.T();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new D(this, getViewModelStore(), new B2.d(this, 25));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f6627e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        C0552s.c(this.mView, this.mViewLifecycleOwner);
        this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
        U4.b.D(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m();
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.v(1);
        if (this.mView != null) {
            D d10 = this.mViewLifecycleOwner;
            d10.b();
            if (d10.f6627e.f7098d.a(Lifecycle.State.f6977c)) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        R0.e eVar = new R0.e(getViewModelStore(), b.C0043b.f3437p, a.C0040a.f3236b);
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(b.C0043b.class);
        String b9 = a10.b();
        if (b9 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        androidx.collection.h<b.a> hVar = ((b.C0043b) eVar.a(a10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b9))).f3438k;
        int f10 = hVar.f();
        for (int i9 = 0; i9 < f10; i9++) {
            hVar.g(i9).getClass();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f6726K) {
            return;
        }
        fragmentManager.m();
        this.mChildFragmentManager = new p();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.q(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.u(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean Q4 = FragmentManager.Q(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != Q4) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(Q4);
            onPrimaryNavigationFragmentChanged(Q4);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.n0();
            fragmentManager.s(fragmentManager.f6716A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.T();
        this.mChildFragmentManager.B(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onResume()"));
        }
        C0553t c0553t = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c0553t.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.T();
        this.mChildFragmentManager.B(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onStart()"));
        }
        C0553t c0553t = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c0553t.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6725J = true;
        fragmentManager.f6731P.f6885E0 = true;
        fragmentManager.v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.v(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f6711u = true;
    }

    @Override // e.InterfaceC0703b
    public final <I, O> AbstractC0704c<I> registerForActivityResult(AbstractC0728a<I, O> abstractC0728a, InterfaceC0702a<O> interfaceC0702a) {
        return prepareCallInternal(abstractC0728a, new h(), interfaceC0702a);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i9) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f6721F == null) {
            parentFragmentManager.f6755x.getClass();
            return;
        }
        parentFragmentManager.f6722G.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i9));
        parentFragmentManager.f6721F.a(strArr);
    }

    public final ActivityC0533g requireActivity() {
        ActivityC0533g activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.a0(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f6724I = false;
        fragmentManager.f6725J = false;
        fragmentManager.f6731P.f6885E0 = false;
        fragmentManager.v(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f6706p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f6705o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i9, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        ensureAnimationInfo().f6693b = i9;
        ensureAnimationInfo().f6694c = i10;
        ensureAnimationInfo().f6695d = i11;
        ensureAnimationInfo().f6696e = i12;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(j0.G g10) {
        ensureAnimationInfo().f6707q = g10;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(j0.G g10) {
        ensureAnimationInfo().f6708r = g10;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f6701k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f6710t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f6677a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i9) {
        if (this.mAnimationInfo == null && i9 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f6697f = i9;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f6692a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f6709s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f6702l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this);
        FragmentStrictMode.c(setRetainInstanceUsageViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
        if (a10.f6899a.contains(FragmentStrictMode.Flag.f6894f) && FragmentStrictMode.e(a10, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(a10, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            fragmentManager.f6731P.a(this);
        } else {
            fragmentManager.f6731P.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f6700j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f6703m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f6698g = arrayList;
        kVar.f6699h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f6704n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i9) {
        if (fragment != null) {
            FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + fragment + " with request code " + i9 + " for fragment " + this);
            FragmentStrictMode.c(setTargetFragmentUsageViolation);
            FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
            if (a10.f6899a.contains(FragmentStrictMode.Flag.f6896h) && FragmentStrictMode.e(a10, getClass(), SetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.b(a10, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.k("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i9;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this);
        FragmentStrictMode.c(setUserVisibleHintViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
        if (a10.f6899a.contains(FragmentStrictMode.Flag.f6895g) && FragmentStrictMode.e(a10, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.b(a10, setUserVisibleHintViolation);
        }
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            t h9 = fragmentManager.h(this);
            Fragment fragment = h9.f6904c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f6734b) {
                    fragmentManager.f6727L = true;
                } else {
                    fragment.mDeferStart = false;
                    h9.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar != null) {
            return lVar.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i9) {
        startActivityForResult(intent, i9, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i9, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i9 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f6720E == null) {
            androidx.fragment.app.l<?> lVar = parentFragmentManager.f6755x;
            if (i9 != -1) {
                lVar.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
            }
            Activity activity = lVar.f6868a;
            if (activity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
            }
            activity.startIntentSenderForResult(intentSender, i9, intent, i10, i11, i12, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i10, i11);
        parentFragmentManager.f6722G.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i9));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f6720E.a(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f6711u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f6711u = false;
        } else if (Looper.myLooper() != this.mHost.f6870c.getLooper()) {
            this.mHost.f6870c.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f6677a;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f6677a = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f6677a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f6677a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            FragmentStrictMode.a aVar = FragmentStrictMode.f6888a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this);
            FragmentStrictMode.c(getTargetFragmentUsageViolation);
            FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
            if (a10.f6899a.contains(FragmentStrictMode.Flag.f6896h) && FragmentStrictMode.e(a10, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.b(a10, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f6735c.b(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.k.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException(androidx.camera.core.n.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException(androidx.camera.core.n.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException(androidx.camera.core.n.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException(androidx.camera.core.n.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i9, Object... objArr) {
        return getResources().getString(i9, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f6711u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.f6755x.f6870c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> AbstractC0704c<I> registerForActivityResult(AbstractC0728a<I, O> abstractC0728a, androidx.activity.result.a aVar, InterfaceC0702a<O> interfaceC0702a) {
        return prepareCallInternal(abstractC0728a, new i(aVar), interfaceC0702a);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar == null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to Activity"));
        }
        C0913a.startActivity(lVar.f6869b, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i9, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f6719D != null) {
            parentFragmentManager.f6722G.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i9));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f6719D.a(intent);
            return;
        }
        androidx.fragment.app.l<?> lVar = parentFragmentManager.f6755x;
        if (i9 == -1) {
            C0913a.startActivity(lVar.f6869b, intent, bundle);
        } else {
            lVar.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        androidx.fragment.app.l<?> lVar = this.mHost;
        if (lVar != null) {
            LayoutInflater f10 = lVar.f();
            f10.setFactory2(this.mChildFragmentManager.f6738f);
            return f10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException(androidx.camera.core.impl.utils.a.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public Fragment(int i9) {
        this();
        this.mContentLayoutId = i9;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
    }
}
