package u9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import w9.WindowCallbackC1577a;

/* compiled from: UserInteractionIntegration.java */
/* loaded from: classes2.dex */
public final class H implements InterfaceC0867z, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f30380a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0858p f30381b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f30382c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30383d = z.a("androidx.core.view.GestureDetectorCompat", this.f30382c);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30384e = z.a("androidx.core.view.ScrollingView", this.f30382c);

    public H(Application application, z zVar) {
        this.f30380a = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f30380a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f30382c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        C0855m c0855m = C0855m.f22069a;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30382c = sentryAndroidOptions;
        this.f30381b = c0855m;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(this.f30382c.isEnableUserInteractionBreadcrumbs()));
        if (this.f30382c.isEnableUserInteractionBreadcrumbs()) {
            if (!this.f30383d) {
                sentryOptions.getLogger().h(SentryLevel.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
            } else {
                this.f30380a.registerActivityLifecycleCallbacks(this);
                this.f30382c.getLogger().h(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f30382c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w9.d) {
            w9.d dVar = (w9.d) callback;
            dVar.f30865c.d(SpanStatus.CANCELLED);
            Window.Callback callback2 = dVar.f30864b;
            if (callback2 instanceof WindowCallbackC1577a) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f30382c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f30381b == null || this.f30382c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC1577a();
        }
        window.setCallback(new w9.d(callback, activity, new w9.b(activity, this.f30381b, this.f30382c, this.f30384e), this.f30382c));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
