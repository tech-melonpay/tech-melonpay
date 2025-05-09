package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.C0553t;
import androidx.lifecycle.InterfaceC0543i;
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

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class D implements InterfaceC0543i, InterfaceC0584d, X {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f6623a;

    /* renamed from: b, reason: collision with root package name */
    public final W f6624b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f6625c;

    /* renamed from: d, reason: collision with root package name */
    public T f6626d;

    /* renamed from: e, reason: collision with root package name */
    public C0553t f6627e = null;

    /* renamed from: f, reason: collision with root package name */
    public C0583c f6628f = null;

    public D(Fragment fragment, W w2, B2.d dVar) {
        this.f6623a = fragment;
        this.f6624b = w2;
        this.f6625c = dVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f6627e.f(event);
    }

    public final void b() {
        if (this.f6627e == null) {
            this.f6627e = new C0553t(this);
            C0583c c0583c = new C0583c(this);
            this.f6628f = c0583c;
            c0583c.a();
            this.f6625c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public final R0.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f6623a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
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
        R0.c cVar = new R0.c(0);
        if (application != null) {
            cVar.b(S.f7046d, application);
        }
        cVar.b(J.f6965a, fragment);
        cVar.b(J.f6966b, this);
        if (fragment.getArguments() != null) {
            cVar.b(J.f6967c, fragment.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0543i
    public final T getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f6623a;
        T defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f6626d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6626d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
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
            this.f6626d = new L(application, fragment, fragment.getArguments());
        }
        return this.f6626d;
    }

    @Override // androidx.lifecycle.r
    public final Lifecycle getLifecycle() {
        b();
        return this.f6627e;
    }

    @Override // b1.InterfaceC0584d
    public final C0582b getSavedStateRegistry() {
        b();
        return this.f6628f.f8286b;
    }

    @Override // androidx.lifecycle.X
    public final W getViewModelStore() {
        b();
        return this.f6624b;
    }
}
