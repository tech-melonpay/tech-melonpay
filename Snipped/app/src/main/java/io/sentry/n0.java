package io.sentry;

import java.io.Closeable;

/* compiled from: ShutdownHookIntegration.java */
/* loaded from: classes2.dex */
public final class n0 implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Runtime f22091a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f22092b;

    public n0() {
        Runtime runtime = Runtime.getRuntime();
        D9.b.t0(runtime, "Runtime is required");
        this.f22091a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Thread thread = this.f22092b;
        if (thread != null) {
            this.f22091a.removeShutdownHook(thread);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        if (!sentryOptions.isEnableShutdownHook()) {
            sentryOptions.getLogger().h(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        Thread thread = new Thread(new com.sumsub.sns.camera.photo.presentation.document.c(sentryOptions));
        this.f22092b = thread;
        this.f22091a.addShutdownHook(thread);
        sentryOptions.getLogger().h(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
    }
}
