package t6;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;

/* compiled from: ActivityMainBinding.java */
/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1296b extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final AppBarLayout f28799n;

    /* renamed from: o, reason: collision with root package name */
    public final BottomNavigationView f28800o;

    /* renamed from: p, reason: collision with root package name */
    public final CoordinatorLayout f28801p;

    /* renamed from: q, reason: collision with root package name */
    public final FragmentContainerView f28802q;

    /* renamed from: r, reason: collision with root package name */
    public final CustomToolbarView f28803r;

    public AbstractC1296b(Object obj, View view, AppBarLayout appBarLayout, BottomNavigationView bottomNavigationView, CoordinatorLayout coordinatorLayout, FragmentContainerView fragmentContainerView, CustomToolbarView customToolbarView) {
        super(obj, view, 0);
        this.f28799n = appBarLayout;
        this.f28800o = bottomNavigationView;
        this.f28801p = coordinatorLayout;
        this.f28802q = fragmentContainerView;
        this.f28803r = customToolbarView;
    }
}
