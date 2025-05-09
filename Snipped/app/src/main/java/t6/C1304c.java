package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: ActivityMainBindingImpl.java */
/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1304c extends AbstractC1296b {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f28846t;

    /* renamed from: s, reason: collision with root package name */
    public long f28847s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28846t = sparseIntArray;
        sparseIntArray.put(R.id.mainLayout, 1);
        sparseIntArray.put(R.id.app_bar, 2);
        sparseIntArray.put(R.id.toolbar_layout, 3);
        sparseIntArray.put(R.id.toolbar, 4);
        sparseIntArray.put(R.id.nav_host_fragment, 5);
        sparseIntArray.put(R.id.bottom_navigation, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1304c(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1304c.f28846t
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 2
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            r1 = 6
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.bottomnavigation.BottomNavigationView r6 = (com.google.android.material.bottomnavigation.BottomNavigationView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            androidx.fragment.app.FragmentContainerView r8 = (androidx.fragment.app.FragmentContainerView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView r9 = (com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView) r9
            r1 = 3
            r1 = r0[r1]
            com.google.android.material.appbar.CollapsingToolbarLayout r1 = (com.google.android.material.appbar.CollapsingToolbarLayout) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f28847s = r1
            r11 = 0
            r11 = r0[r11]
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f28847s = r11     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4a
            r10.i()
            return
        L4a:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1304c.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28847s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28847s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        return true;
    }
}
