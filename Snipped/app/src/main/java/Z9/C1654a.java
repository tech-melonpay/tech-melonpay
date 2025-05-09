package z9;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0863v;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.android.fragment.FragmentLifecycleState;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import y6.C1616b;

/* compiled from: SentryFragmentLifecycleCallbacks.kt */
/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1654a extends FragmentManager.l {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0858p f31345a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<FragmentLifecycleState> f31346b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31347c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Fragment, InterfaceC0863v> f31348d = new WeakHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C1654a(InterfaceC0858p interfaceC0858p, Set<? extends FragmentLifecycleState> set, boolean z10) {
        this.f31345a = interfaceC0858p;
        this.f31346b = set;
        this.f31347c = z10;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void a(Fragment fragment) {
        l(fragment, FragmentLifecycleState.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void b(Fragment fragment) {
        l(fragment, FragmentLifecycleState.CREATED);
        if (fragment.isAdded()) {
            InterfaceC0858p interfaceC0858p = this.f31345a;
            if (interfaceC0858p.h().isTracingEnabled() && this.f31347c) {
                WeakHashMap<Fragment, InterfaceC0863v> weakHashMap = this.f31348d;
                if (weakHashMap.containsKey(fragment)) {
                    return;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                interfaceC0858p.f(new C1616b(ref$ObjectRef));
                String simpleName = fragment.getClass().getSimpleName();
                InterfaceC0863v interfaceC0863v = (InterfaceC0863v) ref$ObjectRef.f23179a;
                InterfaceC0863v h9 = interfaceC0863v == null ? null : interfaceC0863v.h(simpleName);
                if (h9 == null) {
                    return;
                }
                weakHashMap.put(fragment, h9);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void c(Fragment fragment) {
        l(fragment, FragmentLifecycleState.DESTROYED);
        m(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void d(Fragment fragment) {
        l(fragment, FragmentLifecycleState.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void e(Fragment fragment) {
        l(fragment, FragmentLifecycleState.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void f(Fragment fragment) {
        l(fragment, FragmentLifecycleState.RESUMED);
        m(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void g(Fragment fragment) {
        l(fragment, FragmentLifecycleState.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void h(Fragment fragment) {
        l(fragment, FragmentLifecycleState.STARTED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void i(Fragment fragment) {
        l(fragment, FragmentLifecycleState.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void j(FragmentManager fragmentManager, Fragment fragment, View view) {
        l(fragment, FragmentLifecycleState.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void k(Fragment fragment) {
        l(fragment, FragmentLifecycleState.VIEW_DESTROYED);
    }

    public final void l(Fragment fragment, FragmentLifecycleState fragmentLifecycleState) {
        if (this.f31346b.contains(fragmentLifecycleState)) {
            C0844b c0844b = new C0844b();
            c0844b.f21964c = "navigation";
            c0844b.a(fragmentLifecycleState.getBreadcrumbName(), "state");
            c0844b.a(fragment.getClass().getSimpleName(), "screen");
            c0844b.f21966e = "ui.fragment.lifecycle";
            c0844b.f21967f = SentryLevel.INFO;
            C0852j c0852j = new C0852j();
            c0852j.a(fragment, "android:fragment");
            this.f31345a.e(c0844b, c0852j);
        }
    }

    public final void m(Fragment fragment) {
        InterfaceC0863v interfaceC0863v;
        if (this.f31345a.h().isTracingEnabled() && this.f31347c) {
            WeakHashMap<Fragment, InterfaceC0863v> weakHashMap = this.f31348d;
            if (weakHashMap.containsKey(fragment) && (interfaceC0863v = weakHashMap.get(fragment)) != null) {
                SpanStatus status = interfaceC0863v.getStatus();
                if (status == null) {
                    status = SpanStatus.OK;
                }
                interfaceC0863v.c(status);
                weakHashMap.remove(fragment);
            }
        }
    }
}
