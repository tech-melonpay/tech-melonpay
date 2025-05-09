package u9;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.C0844b;
import io.sentry.C0852j;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.Device;
import java.io.Closeable;
import java.util.Locale;

/* compiled from: AppComponentsBreadcrumbsIntegration.java */
/* loaded from: classes2.dex */
public final class l implements InterfaceC0867z, Closeable, ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30440a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0858p f30441b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f30442c;

    public l(Context context) {
        this.f30440a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f30440a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f30442c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().d(SentryLevel.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f30442c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().h(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        this.f30441b = C0855m.f22069a;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30442c = sentryAndroidOptions;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f30442c.isEnableAppComponentBreadcrumbs()));
        if (this.f30442c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f30440a.registerComponentCallbacks(this);
                sentryOptions.getLogger().h(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th) {
                this.f30442c.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().d(SentryLevel.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void i(Integer num) {
        if (this.f30441b != null) {
            C0844b c0844b = new C0844b();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c0844b.a(num, FirebaseAnalytics.Param.LEVEL);
                }
            }
            c0844b.f21964c = "system";
            c0844b.f21966e = "device.event";
            c0844b.f21963b = "Low memory";
            c0844b.a("LOW_MEMORY", "action");
            c0844b.f21967f = SentryLevel.WARNING;
            this.f30441b.b(c0844b);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f30441b != null) {
            int i = this.f30440a.getResources().getConfiguration().orientation;
            Device.DeviceOrientation deviceOrientation = i != 1 ? i != 2 ? null : Device.DeviceOrientation.LANDSCAPE : Device.DeviceOrientation.PORTRAIT;
            String lowerCase = deviceOrientation != null ? deviceOrientation.name().toLowerCase(Locale.ROOT) : "undefined";
            C0844b c0844b = new C0844b();
            c0844b.f21964c = "navigation";
            c0844b.f21966e = "device.orientation";
            c0844b.a(lowerCase, "position");
            c0844b.f21967f = SentryLevel.INFO;
            C0852j c0852j = new C0852j();
            c0852j.a(configuration, "android:configuration");
            this.f30441b.e(c0844b, c0852j);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        i(null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        i(Integer.valueOf(i));
    }
}
