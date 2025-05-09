package u9;

import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;

/* compiled from: NdkIntegration.java */
/* loaded from: classes2.dex */
public final class y implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f30481a;

    /* renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f30482b;

    public y(Class<?> cls) {
        this.f30481a = cls;
    }

    public static void i(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f30482b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f30481a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f30482b.getLogger().h(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } finally {
                        i(this.f30482b);
                    }
                } catch (NoSuchMethodException e10) {
                    this.f30482b.getLogger().f(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                }
                i(this.f30482b);
            }
        } catch (Throwable th) {
            i(this.f30482b);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30482b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        InterfaceC0859q logger = this.f30482b.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || (cls = this.f30481a) == null) {
            i(this.f30482b);
            return;
        }
        if (this.f30482b.getCacheDirPath() == null) {
            this.f30482b.getLogger().h(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            i(this.f30482b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f30482b);
            this.f30482b.getLogger().h(sentryLevel, "NdkIntegration installed.", new Object[0]);
        } catch (NoSuchMethodException e10) {
            i(this.f30482b);
            this.f30482b.getLogger().f(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th) {
            i(this.f30482b);
            this.f30482b.getLogger().f(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
