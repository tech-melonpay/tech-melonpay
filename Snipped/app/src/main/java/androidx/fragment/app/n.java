package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f6876b = new CopyOnWriteArrayList<>();

    /* compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentManager.l f6877a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6878b;

        public a(FragmentManager.l lVar, boolean z10) {
            this.f6877a = lVar;
            this.f6878b = z10;
        }
    }

    public n(FragmentManager fragmentManager) {
        this.f6875a = fragmentManager;
    }

    public final void a(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.a(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.getClass();
            }
        }
    }

    public final void b(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6875a;
        Context context = fragmentManager.f6755x.f6869b;
        Fragment fragment2 = fragmentManager.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.b(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.a(fragment);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.c(fragment, bundle, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.b(fragment);
            }
        }
    }

    public final void d(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.d(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.c(fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.e(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.d(fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.f(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.e(fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6875a;
        Context context = fragmentManager.f6755x.f6869b;
        Fragment fragment2 = fragmentManager.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.g(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.getClass();
            }
        }
    }

    public final void h(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.h(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.getClass();
            }
        }
    }

    public final void i(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.i(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.f(fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.j(fragment, bundle, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.g(fragment);
            }
        }
    }

    public final void k(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.k(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.h(fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.l(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.i(fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6875a;
        Fragment fragment2 = fragmentManager.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.j(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(Fragment fragment, boolean z10) {
        Fragment fragment2 = this.f6875a.f6757z;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6747p.n(fragment, true);
        }
        Iterator<a> it = this.f6876b.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f6878b) {
                next.f6877a.k(fragment);
            }
        }
    }
}
