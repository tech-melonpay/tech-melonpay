package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import b1.C0582b;
import b1.InterfaceC0584d;
import c.InterfaceC0619j;
import j0.InterfaceC0869A;
import j0.InterfaceC0870B;
import j0.InterfaceC0873b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import k0.InterfaceC0915c;
import k0.InterfaceC0916d;
import x0.InterfaceC1579a;
import y0.InterfaceC1604h;
import y0.InterfaceC1606j;

/* compiled from: FragmentActivity.java */
/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0533g extends ComponentActivity implements InterfaceC0873b {
    boolean mCreated;
    boolean mResumed;
    final j mFragments = new j(new a());
    final C0553t mFragmentLifecycleRegistry = new C0553t(this);
    boolean mStopped = true;

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.g$a */
    public class a extends l<ActivityC0533g> implements InterfaceC0915c, InterfaceC0916d, InterfaceC0869A, InterfaceC0870B, X, InterfaceC0619j, e.f, InterfaceC0584d, r, InterfaceC1604h {
        public a() {
            super(ActivityC0533g.this);
        }

        @Override // androidx.fragment.app.r
        public final void a(Fragment fragment) {
            ActivityC0533g.this.onAttachFragment(fragment);
        }

        @Override // y0.InterfaceC1604h
        public final void addMenuProvider(InterfaceC1606j interfaceC1606j) {
            ActivityC0533g.this.addMenuProvider(interfaceC1606j);
        }

        @Override // k0.InterfaceC0915c
        public final void addOnConfigurationChangedListener(InterfaceC1579a<Configuration> interfaceC1579a) {
            ActivityC0533g.this.addOnConfigurationChangedListener(interfaceC1579a);
        }

        @Override // j0.InterfaceC0869A
        public final void addOnMultiWindowModeChangedListener(InterfaceC1579a<j0.k> interfaceC1579a) {
            ActivityC0533g.this.addOnMultiWindowModeChangedListener(interfaceC1579a);
        }

        @Override // j0.InterfaceC0870B
        public final void addOnPictureInPictureModeChangedListener(InterfaceC1579a<j0.D> interfaceC1579a) {
            ActivityC0533g.this.addOnPictureInPictureModeChangedListener(interfaceC1579a);
        }

        @Override // k0.InterfaceC0916d
        public final void addOnTrimMemoryListener(InterfaceC1579a<Integer> interfaceC1579a) {
            ActivityC0533g.this.addOnTrimMemoryListener(interfaceC1579a);
        }

        @Override // androidx.fragment.app.i
        public final View b(int i) {
            return ActivityC0533g.this.findViewById(i);
        }

        @Override // androidx.fragment.app.i
        public final boolean c() {
            Window window = ActivityC0533g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.l
        public final void d(PrintWriter printWriter, String[] strArr) {
            ActivityC0533g.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.l
        public final ActivityC0533g e() {
            return ActivityC0533g.this;
        }

        @Override // androidx.fragment.app.l
        public final LayoutInflater f() {
            ActivityC0533g activityC0533g = ActivityC0533g.this;
            return activityC0533g.getLayoutInflater().cloneInContext(activityC0533g);
        }

        @Override // androidx.fragment.app.l
        public final boolean g(String str) {
            int i = Build.VERSION.SDK_INT;
            if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            ActivityC0533g activityC0533g = ActivityC0533g.this;
            if (i >= 32) {
                return activityC0533g.shouldShowRequestPermissionRationale(str);
            }
            if (i != 31) {
                return activityC0533g.shouldShowRequestPermissionRationale(str);
            }
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activityC0533g.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activityC0533g.shouldShowRequestPermissionRationale(str);
            }
        }

        @Override // e.f
        public final androidx.activity.result.a getActivityResultRegistry() {
            return ActivityC0533g.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.r
        public final Lifecycle getLifecycle() {
            return ActivityC0533g.this.mFragmentLifecycleRegistry;
        }

        @Override // c.InterfaceC0619j
        public final androidx.activity.a getOnBackPressedDispatcher() {
            return ActivityC0533g.this.getOnBackPressedDispatcher();
        }

        @Override // b1.InterfaceC0584d
        public final C0582b getSavedStateRegistry() {
            return ActivityC0533g.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.X
        public final W getViewModelStore() {
            return ActivityC0533g.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.l
        public final void h() {
            ActivityC0533g.this.invalidateMenu();
        }

        @Override // y0.InterfaceC1604h
        public final void removeMenuProvider(InterfaceC1606j interfaceC1606j) {
            ActivityC0533g.this.removeMenuProvider(interfaceC1606j);
        }

        @Override // k0.InterfaceC0915c
        public final void removeOnConfigurationChangedListener(InterfaceC1579a<Configuration> interfaceC1579a) {
            ActivityC0533g.this.removeOnConfigurationChangedListener(interfaceC1579a);
        }

        @Override // j0.InterfaceC0869A
        public final void removeOnMultiWindowModeChangedListener(InterfaceC1579a<j0.k> interfaceC1579a) {
            ActivityC0533g.this.removeOnMultiWindowModeChangedListener(interfaceC1579a);
        }

        @Override // j0.InterfaceC0870B
        public final void removeOnPictureInPictureModeChangedListener(InterfaceC1579a<j0.D> interfaceC1579a) {
            ActivityC0533g.this.removeOnPictureInPictureModeChangedListener(interfaceC1579a);
        }

        @Override // k0.InterfaceC0916d
        public final void removeOnTrimMemoryListener(InterfaceC1579a<Integer> interfaceC1579a) {
            ActivityC0533g.this.removeOnTrimMemoryListener(interfaceC1579a);
        }
    }

    public ActivityC0533g() {
        init();
    }

    private void init() {
        getSavedStateRegistry().c("android:support:lifecycle", new W0.e(this, 2));
        final int i = 0;
        addOnConfigurationChangedListener(new InterfaceC1579a(this) { // from class: androidx.fragment.app.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityC0533g f6855b;

            {
                this.f6855b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f6855b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f6855b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        final int i9 = 1;
        addOnNewIntentListener(new InterfaceC1579a(this) { // from class: androidx.fragment.app.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityC0533g f6855b;

            {
                this.f6855b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.f6855b.lambda$init$1((Configuration) obj);
                        break;
                    default:
                        this.f6855b.lambda$init$2((Intent) obj);
                        break;
                }
            }
        });
        addOnContextAvailableListener(new C0532f(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        l<?> lVar = this.mFragments.f6866a;
        lVar.f6871d.b(lVar, lVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.f6735c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), state);
                }
                D d10 = fragment.mViewLifecycleOwner;
                Lifecycle.State state2 = Lifecycle.State.f6978d;
                if (d10 != null) {
                    d10.b();
                    if (d10.f6627e.f7098d.a(state2)) {
                        fragment.mViewLifecycleOwner.f6627e.h(state);
                        z10 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f7098d.a(state2)) {
                    fragment.mLifecycleRegistry.h(state);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f6866a.f6871d.f6738f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                new T0.b(this, getViewModelStore()).a(str2, printWriter);
            }
            this.mFragments.f6866a.f6871d.x(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f6866a.f6871d;
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.f6977c)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i9, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i9, intent);
    }

    @Override // androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        p pVar = this.mFragments.f6866a.f6871d;
        pVar.f6724I = false;
        pVar.f6725J = false;
        pVar.f6731P.f6885E0 = false;
        pVar.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f6866a.f6871d.m();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f6866a.f6871d.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f6866a.f6871d.v(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f6866a.f6871d.B(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        p pVar = this.mFragments.f6866a.f6871d;
        pVar.f6724I = false;
        pVar.f6725J = false;
        pVar.f6731P.f6885E0 = false;
        pVar.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            p pVar = this.mFragments.f6866a.f6871d;
            pVar.f6724I = false;
            pVar.f6725J = false;
            pVar.f6731P.f6885E0 = false;
            pVar.v(4);
        }
        this.mFragments.f6866a.f6871d.B(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        p pVar2 = this.mFragments.f6866a.f6871d;
        pVar2.f6724I = false;
        pVar2.f6725J = false;
        pVar2.f6731P.f6885E0 = false;
        pVar2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        p pVar = this.mFragments.f6866a.f6871d;
        pVar.f6725J = true;
        pVar.f6731P.f6885E0 = true;
        pVar.v(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // j0.InterfaceC0873b
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
