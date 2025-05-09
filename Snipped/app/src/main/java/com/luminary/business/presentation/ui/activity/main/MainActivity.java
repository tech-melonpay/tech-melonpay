package com.luminary.business.presentation.ui.activity.main;

import A8.d;
import F8.o;
import J8.a;
import O9.f;
import U4.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import com.google.android.material.appbar.AppBarLayout;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.activity.passcode.PasscodeActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.test.TestBuildersKt;
import t6.AbstractC1296b;
import t6.P6;
import y2.C1611a;
import y6.C1615a;
import y6.C1616b;
import y6.C1618d;

/* compiled from: MainActivity.kt */
/* loaded from: classes2.dex */
public final class MainActivity extends BaseActivity<AbstractC1296b> {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f11402F = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f11403A;

    /* renamed from: B, reason: collision with root package name */
    public final Handler f11404B;

    /* renamed from: C, reason: collision with root package name */
    public final RunnableC0615f f11405C;

    /* renamed from: D, reason: collision with root package name */
    public final f f11406D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0635a<Boolean> f11407E;

    /* renamed from: p, reason: collision with root package name */
    public final long f11408p = TestBuildersKt.DEFAULT_DISPATCH_TIMEOUT_MS;

    /* renamed from: q, reason: collision with root package name */
    public final int f11409q = R.layout.activity_main;

    /* renamed from: r, reason: collision with root package name */
    public final f f11410r;

    /* renamed from: s, reason: collision with root package name */
    public final f f11411s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11412t;

    /* renamed from: u, reason: collision with root package name */
    public long f11413u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11414v;

    /* renamed from: w, reason: collision with root package name */
    public ToolbarStatus f11415w;

    /* renamed from: x, reason: collision with root package name */
    public CustomToolbarView.State f11416x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11417y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11418z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MainActivity.kt */
    public static final class Navigation {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Navigation[] f11421a = {new Navigation("HOME", 0), new Navigation("CARDS", 1), new Navigation("PAYMENTS", 2), new Navigation("HUB", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Navigation EF5;

        public Navigation() {
            throw null;
        }

        public static Navigation valueOf(String str) {
            return (Navigation) Enum.valueOf(Navigation.class, str);
        }

        public static Navigation[] values() {
            return (Navigation[]) f11421a.clone();
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class a implements a.b {
        public a() {
        }

        @Override // J8.a.b
        public final void a() {
            int i = MainActivity.f11402F;
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.B().C()) {
                mainActivity.f11413u = System.currentTimeMillis();
            }
        }

        @Override // J8.a.b
        public final void b() {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f11418z) {
                return;
            }
            if (mainActivity.B().C()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (mainActivity.f11403A) {
                    mainActivity.E(false);
                } else {
                    long j10 = mainActivity.f11413u;
                    if (j10 > 0 && currentTimeMillis - j10 > mainActivity.f11408p) {
                        mainActivity.C().m(R.id.homeFragment, false);
                        mainActivity.E(false);
                    } else if (mainActivity.f11414v && j10 > 0 && currentTimeMillis - j10 > 45000) {
                        B6.a aVar = mainActivity.f11455o;
                        if (aVar != null) {
                            aVar.m0();
                        }
                        mainActivity.E(false);
                    }
                }
                mainActivity.f11413u = 0L;
            }
            mainActivity.f11414v = true;
        }
    }

    public MainActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23085a;
        this.f11410r = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<C1618d>() { // from class: com.luminary.business.presentation.ui.activity.main.MainActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, y6.d] */
            @Override // ca.InterfaceC0635a
            public final C1618d invoke() {
                return b.l(this).a(null, null, h.a(C1618d.class));
            }
        });
        this.f11411s = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<K5.a>() { // from class: com.luminary.business.presentation.ui.activity.main.MainActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K5.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final K5.a invoke() {
                return b.l(this).a(null, null, h.a(K5.a.class));
            }
        });
        this.f11412t = true;
        this.f11414v = true;
        this.f11404B = new Handler(Looper.getMainLooper());
        this.f11405C = new RunnableC0615f(this, 29);
        this.f11406D = kotlin.a.a(new C1615a(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        if (B().E()) {
            Object obj = this.f11453m;
            if (obj == null) {
                obj = null;
            }
            ((AbstractC1296b) obj).f28800o.getMenu().getItem(2).setVisible(true);
            Object obj2 = this.f11453m;
            ((AbstractC1296b) (obj2 != null ? obj2 : null)).f28800o.getMenu().getItem(1).setVisible(false);
            return;
        }
        Object obj3 = this.f11453m;
        if (obj3 == null) {
            obj3 = null;
        }
        ((AbstractC1296b) obj3).f28800o.getMenu().getItem(2).setVisible(false);
        Object obj4 = this.f11453m;
        ((AbstractC1296b) (obj4 != null ? obj4 : null)).f28800o.getMenu().getItem(1).setVisible(true);
    }

    public final K5.a B() {
        return (K5.a) this.f11411s.getValue();
    }

    public final NavController C() {
        return (NavController) this.f11406D.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        o.b(((AbstractC1296b) obj).f28799n);
        Object obj2 = this.f11453m;
        if (obj2 == null) {
            obj2 = null;
        }
        o.b(((AbstractC1296b) obj2).f28803r);
        Object obj3 = this.f11453m;
        if (obj3 == null) {
            obj3 = null;
        }
        ((CoordinatorLayout.f) ((AbstractC1296b) obj3).f28802q.getLayoutParams()).b(null);
        Object obj4 = this.f11453m;
        ((AbstractC1296b) (obj4 != null ? obj4 : null)).f28802q.requestLayout();
    }

    public final void E(boolean z10) {
        Intent intent = new Intent(this, (Class<?>) PasscodeActivity.class);
        intent.putExtra("IS_SETUP", z10);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1296b) obj).f28799n.setVisibility(0);
        Object obj2 = this.f11453m;
        if (obj2 == null) {
            obj2 = null;
        }
        ((AbstractC1296b) obj2).f28803r.setVisibility(0);
        Object obj3 = this.f11453m;
        if (obj3 == null) {
            obj3 = null;
        }
        ((CoordinatorLayout.f) ((AbstractC1296b) obj3).f28802q.getLayoutParams()).b(new AppBarLayout.ScrollingViewBehavior());
        Object obj4 = this.f11453m;
        ((AbstractC1296b) (obj4 != null ? obj4 : null)).f28802q.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"RestrictedApi"})
    public final void G(int i, boolean z10) {
        B().Y(Integer.valueOf(i));
        if (z10) {
            Object obj = this.f11453m;
            if (obj == null) {
                obj = null;
            }
            ((AbstractC1296b) obj).f28803r.setBadge(i);
        }
        Object obj2 = this.f11453m;
        y2.b bVar = (y2.b) ((AbstractC1296b) (obj2 != null ? obj2 : null)).f28800o.getChildAt(0);
        C1611a c1611a = (C1611a) bVar.getChildAt(2);
        c1611a.removeViewAt(1);
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_icon_exchange, (ViewGroup) bVar, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ivWarning);
        if (i == 0) {
            o.b(imageView);
        } else {
            imageView.setVisibility(0);
        }
        c1611a.addView(inflate);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Handler handler = this.f11404B;
        RunnableC0615f runnableC0615f = this.f11405C;
        handler.removeCallbacks(runnableC0615f);
        handler.postDelayed(runnableC0615f, this.f11408p);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC0635a<Boolean> interfaceC0635a = this.f11407E;
        if (interfaceC0635a == null || interfaceC0635a.invoke().booleanValue()) {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.fragment.app.Fragment] */
    @Override // com.luminary.business.presentation.ui.base.BaseActivity, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f11452l = 16;
        this.f11451k = (C1618d) this.f11410r.getValue();
        super.onCreate(bundle);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23179a = getSupportFragmentManager().F(R.id.nav_host_fragment);
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1296b) obj).f28800o.setOnNavigationItemSelectedListener(new C1616b(this));
        Handler handler = this.f11404B;
        RunnableC0615f runnableC0615f = this.f11405C;
        handler.removeCallbacks(runnableC0615f);
        handler.postDelayed(runnableC0615f, this.f11408p);
        Object obj2 = this.f11453m;
        ((AbstractC1296b) (obj2 != null ? obj2 : null)).f28799n.a(new AppBarLayout.f() { // from class: y6.c
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(AppBarLayout appBarLayout, int i) {
                FragmentManager childFragmentManager;
                List<Fragment> f10;
                int i9 = MainActivity.f11402F;
                Fragment fragment = (Fragment) Ref$ObjectRef.this.f23179a;
                BaseFragment baseFragment = (BaseFragment) ((fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null || (f10 = childFragmentManager.f6735c.f()) == null) ? null : f10.get(0));
                CustomToolbarView.State state = Math.abs(i) == appBarLayout.getTotalScrollRange() ? CustomToolbarView.State.f13257b : i == 0 ? CustomToolbarView.State.f13256a : CustomToolbarView.State.f13256a;
                MainActivity mainActivity = this;
                if (mainActivity.f11416x == null || state == baseFragment.f11464f0 || baseFragment.f11467i0 || mainActivity.f11417y) {
                    return;
                }
                Object obj3 = mainActivity.f11453m;
                if (obj3 == null) {
                    obj3 = null;
                }
                ((AbstractC1296b) obj3).f28803r.setState(state);
                baseFragment.f11464f0 = state;
                ToolbarStatus toolbarStatus = mainActivity.f11415w;
                if (toolbarStatus != null) {
                    Object obj4 = mainActivity.f11453m;
                    ((AbstractC1296b) (obj4 != null ? obj4 : null)).f28803r.setStatus(toolbarStatus);
                }
                baseFragment.L0();
            }
        });
        a.C0028a.a().f2199d.add(new a());
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f11404B.removeCallbacks(this.f11405C);
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f11404B;
        RunnableC0615f runnableC0615f = this.f11405C;
        handler.removeCallbacks(runnableC0615f);
        handler.postDelayed(runnableC0615f, this.f11408p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity, h.ActivityC0775b, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onStart() {
        super.onStart();
        A();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void s() {
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1296b) obj).f28803r.w();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final int t() {
        return this.f11409q;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void u(String str) {
        this.f11416x = CustomToolbarView.State.f13257b;
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        CustomToolbarView customToolbarView = ((AbstractC1296b) obj).f28803r;
        d dVar = customToolbarView.V.f13273l;
        if (dVar != null) {
            dVar.a();
            customToolbarView.f13255a0 = true;
            P6 p62 = customToolbarView.W;
            p62.f28337w.setVisibility(0);
            p62.f28337w.setText(str);
            p62.f28332r.setVisibility(0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void v(int i) {
        this.f11412t = false;
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1296b) obj).f28800o.setSelectedItemId(i);
        this.f11412t = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void w() {
        Navigation[] navigationArr = Navigation.f11421a;
        Object obj = this.f11453m;
        if (obj == null) {
            obj = null;
        }
        ((AbstractC1296b) obj).f28800o.setSelectedItemId(R.id.navigation_payments);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void y() {
        if (this.f11454n) {
            Object obj = this.f11453m;
            ((AbstractC1296b) (obj != null ? obj : null)).f28800o.setVisibility(0);
        } else {
            Object obj2 = this.f11453m;
            o.b(((AbstractC1296b) (obj2 != null ? obj2 : null)).f28800o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.presentation.ui.base.BaseActivity
    public final void z(ToolbarStatus toolbarStatus, CustomToolbarView.State state) {
        FragmentManager childFragmentManager;
        List<Fragment> f10;
        if (toolbarStatus == ToolbarStatus.gone) {
            Object obj = this.f11453m;
            if (obj == null) {
                obj = null;
            }
            o.b(((AbstractC1296b) obj).f28803r);
            if (toolbarStatus.f13268f) {
                Window window = getWindow();
                if (window != null) {
                    Object obj2 = this.f11453m;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    window.setStatusBarColor(o.a(R.color.black, ((AbstractC1296b) obj2).f1148d));
                }
                Object obj3 = this.f11453m;
                if (obj3 == null) {
                    obj3 = null;
                }
                ((AbstractC1296b) obj3).f28801p.setBackgroundColor(getColor(R.color.black));
            } else {
                Window window2 = getWindow();
                if (window2 != null) {
                    Object obj4 = this.f11453m;
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    window2.setStatusBarColor(o.a(R.color.background, ((AbstractC1296b) obj4).f1148d));
                }
                Object obj5 = this.f11453m;
                if (obj5 == null) {
                    obj5 = null;
                }
                ((AbstractC1296b) obj5).f28801p.setBackgroundColor(getColor(R.color.background));
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        } else {
            Object obj6 = this.f11453m;
            if (obj6 == null) {
                obj6 = null;
            }
            ((AbstractC1296b) obj6).f28803r.setVisibility(0);
            if (toolbarStatus.f13268f) {
                Window window3 = getWindow();
                if (window3 != null) {
                    Object obj7 = this.f11453m;
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    window3.setStatusBarColor(o.a(R.color.black, ((AbstractC1296b) obj7).f1148d));
                }
                Object obj8 = this.f11453m;
                CustomToolbarView customToolbarView = ((AbstractC1296b) (obj8 != null ? obj8 : null)).f28803r;
                Object obj9 = obj8;
                if (obj8 == null) {
                    obj9 = null;
                }
                customToolbarView.setBackgroundColor(o.a(R.color.black, ((AbstractC1296b) obj9).f28803r));
                Object obj10 = this.f11453m;
                if (obj10 == null) {
                    obj10 = null;
                }
                ((AbstractC1296b) obj10).f28801p.setBackgroundColor(getColor(R.color.black));
            } else {
                Object obj11 = this.f11453m;
                if (obj11 == null) {
                    obj11 = null;
                }
                ((AbstractC1296b) obj11).f28801p.setBackgroundColor(getColor(R.color.background));
                Window window4 = getWindow();
                if (window4 != null) {
                    Object obj12 = this.f11453m;
                    if (obj12 == null) {
                        obj12 = null;
                    }
                    window4.setStatusBarColor(o.a(R.color.background, ((AbstractC1296b) obj12).f1148d));
                }
                Object obj13 = this.f11453m;
                CustomToolbarView customToolbarView2 = ((AbstractC1296b) (obj13 != null ? obj13 : null)).f28803r;
                Object obj14 = obj13;
                if (obj13 == null) {
                    obj14 = null;
                }
                customToolbarView2.setBackgroundColor(o.a(R.color.background, ((AbstractC1296b) obj14).f28803r));
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        this.f11415w = toolbarStatus;
        this.f11416x = state;
        Fragment F10 = getSupportFragmentManager().F(R.id.nav_host_fragment);
        BaseFragment baseFragment = (BaseFragment) ((F10 == null || (childFragmentManager = F10.getChildFragmentManager()) == null || (f10 = childFragmentManager.f6735c.f()) == null) ? null : f10.get(0));
        Object obj15 = this.f11453m;
        if (obj15 == null) {
            obj15 = null;
        }
        ((AbstractC1296b) obj15).f28803r.setStatus(toolbarStatus);
        baseFragment.f11468j0 = toolbarStatus;
        boolean z10 = baseFragment.f11467i0;
        if (!z10 && !this.f11417y && (state != baseFragment.f11464f0 || z10)) {
            baseFragment.f11464f0 = state;
            baseFragment.L0();
        }
        Object obj16 = this.f11453m;
        ((AbstractC1296b) (obj16 != null ? obj16 : null)).f28803r.setBackButton(new C1615a(this, 1));
    }
}
