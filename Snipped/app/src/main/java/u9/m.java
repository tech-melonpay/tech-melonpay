package u9;

import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import c.RunnableC0615f;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import t1.C1276a;

/* compiled from: AppLifecycleIntegration.java */
/* loaded from: classes2.dex */
public final class m implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public w f30443a;

    /* renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f30444b;

    /* renamed from: c, reason: collision with root package name */
    public final C1276a f30445c = new C1276a(1);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30443a != null) {
            if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                ProcessLifecycleOwner.i.f7012f.c(this.f30443a);
            } else {
                this.f30445c.f27406a.post(new RunnableC0615f(this, 28));
            }
            this.f30443a = null;
            SentryAndroidOptions sentryAndroidOptions = this.f30444b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:14:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:14:0x009a). Please report as a decompilation issue!!! */
    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        C0855m c0855m = C0855m.f22069a;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30444b = sentryAndroidOptions;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f30444b.isEnableAutoSessionTracking()));
        this.f30444b.getLogger().h(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f30444b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f30444b.isEnableAutoSessionTracking() || this.f30444b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.i;
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    i(c0855m);
                    sentryOptions = sentryOptions;
                } else {
                    this.f30445c.f27406a.post(new com.sumsub.sns.camera.photo.presentation.document.c(this));
                    sentryOptions = sentryOptions;
                }
            } catch (ClassNotFoundException e10) {
                InterfaceC0859q logger2 = sentryOptions.getLogger();
                logger2.f(SentryLevel.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e10);
                sentryOptions = logger2;
            } catch (IllegalStateException e11) {
                InterfaceC0859q logger3 = sentryOptions.getLogger();
                logger3.f(SentryLevel.ERROR, "AppLifecycleIntegration could not be installed", e11);
                sentryOptions = logger3;
            }
        }
    }

    public final void i(InterfaceC0858p interfaceC0858p) {
        SentryAndroidOptions sentryAndroidOptions = this.f30444b;
        if (sentryAndroidOptions == null) {
            return;
        }
        w wVar = new w(interfaceC0858p, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f30444b.isEnableAutoSessionTracking(), this.f30444b.isEnableAppLifecycleBreadcrumbs());
        this.f30443a = wVar;
        try {
            ProcessLifecycleOwner.i.f7012f.a(wVar);
            this.f30444b.getLogger().h(SentryLevel.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            this.f30443a = null;
            this.f30444b.getLogger().f(SentryLevel.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }
}
