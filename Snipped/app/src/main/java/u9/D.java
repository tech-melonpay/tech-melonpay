package u9;

import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.W;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: SendCachedEnvelopeIntegration.java */
/* loaded from: classes2.dex */
public final class D implements InterfaceC0867z {

    /* renamed from: a, reason: collision with root package name */
    public final W f30366a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30367b;

    public D(W w2, boolean z10) {
        this.f30366a = w2;
        this.f30367b = z10;
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        String cacheDirPath = sentryOptions.getCacheDirPath();
        InterfaceC0859q logger = sentryOptions.getLogger();
        W w2 = this.f30366a;
        w2.getClass();
        if (!W.b(cacheDirPath, logger)) {
            sentryOptions.getLogger().h(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        com.sumsub.sns.internal.core.domain.h a10 = w2.a(sentryAndroidOptions);
        if (a10 == null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            Future<?> submit = sentryAndroidOptions.getExecutorService().submit(new com.sumsub.sns.camera.photo.presentation.document.c(18, a10, sentryAndroidOptions));
            if (this.f30367b) {
                sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                try {
                    submit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                }
            }
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }
}
