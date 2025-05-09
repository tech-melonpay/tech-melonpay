package io.sentry.android.fragment;

import P9.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import z9.C1654a;

/* compiled from: FragmentLifecycleIntegration.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/z;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/FragmentLifecycleState;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Application f21955a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<FragmentLifecycleState> f21956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21957c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0858p f21958d;

    /* renamed from: e, reason: collision with root package name */
    public SentryOptions f21959e;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentLifecycleIntegration(Application application, Set<? extends FragmentLifecycleState> set, boolean z10) {
        this.f21955a = application;
        this.f21956b = set;
        this.f21957c = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21955a.unregisterActivityLifecycleCallbacks(this);
        SentryOptions sentryOptions = this.f21959e;
        if (sentryOptions != null) {
            if (sentryOptions == null) {
                sentryOptions = null;
            }
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        this.f21958d = C0855m.f22069a;
        this.f21959e = sentryOptions;
        this.f21955a.registerActivityLifecycleCallbacks(this);
        sentryOptions.getLogger().h(SentryLevel.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        FragmentManager supportFragmentManager;
        ActivityC0533g activityC0533g = activity instanceof ActivityC0533g ? (ActivityC0533g) activity : null;
        if (activityC0533g == null || (supportFragmentManager = activityC0533g.getSupportFragmentManager()) == null) {
            return;
        }
        InterfaceC0858p interfaceC0858p = this.f21958d;
        supportFragmentManager.f6747p.f6876b.add(new n.a(new C1654a(interfaceC0858p != null ? interfaceC0858p : null, this.f21956b, this.f21957c), true));
    }

    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends FragmentLifecycleState>) l.w(FragmentLifecycleState.values()), false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FragmentLifecycleIntegration(android.app.Application r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            io.sentry.android.fragment.FragmentLifecycleState[] r0 = io.sentry.android.fragment.FragmentLifecycleState.values()
            java.util.Set r0 = P9.l.w(r0)
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.f23106a
        L11:
            r1.<init>(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.fragment.FragmentLifecycleIntegration.<init>(android.app.Application, boolean, boolean):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
