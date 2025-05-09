package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import y0.C1597a;
import z0.C1638d;

/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public final class b extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f9052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f9053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9054f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f9054f = baseBehavior;
        this.f9052d = appBarLayout;
        this.f9053e = coordinatorLayout;
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        AppBarLayout.BaseBehavior baseBehavior;
        View j10;
        this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
        c1638d.h(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f9052d;
        if (appBarLayout.getTotalScrollRange() == 0 || (j10 = AppBarLayout.BaseBehavior.j((baseBehavior = this.f9054f), this.f9053e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.d) appBarLayout.getChildAt(i).getLayoutParams()).f9010a != 0) {
                if (baseBehavior.b() != (-appBarLayout.getTotalScrollRange())) {
                    c1638d.b(C1638d.a.f31223f);
                    c1638d.l(true);
                }
                if (baseBehavior.b() != 0) {
                    if (!j10.canScrollVertically(-1)) {
                        c1638d.b(C1638d.a.f31224g);
                        c1638d.l(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            c1638d.b(C1638d.a.f31224g);
                            c1638d.l(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // y0.C1597a
    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f9052d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f9054f;
        if (baseBehavior.b() != 0) {
            View j10 = AppBarLayout.BaseBehavior.j(baseBehavior, this.f9053e);
            if (!j10.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i9 = -appBarLayout.getDownNestedPreScrollRange();
            if (i9 != 0) {
                CoordinatorLayout coordinatorLayout = this.f9053e;
                AppBarLayout appBarLayout2 = this.f9052d;
                this.f9054f.m(coordinatorLayout, appBarLayout2, j10, i9, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
