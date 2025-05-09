package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;

/* compiled from: AnrIntegration.java */
/* loaded from: classes2.dex */
public final class b implements InterfaceC0867z, Closeable {

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static a f21951c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f21952d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f21953a;

    /* renamed from: b, reason: collision with root package name */
    public SentryOptions f21954b;

    public b(Context context) {
        this.f21953a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (f21952d) {
            try {
                a aVar = f21951c;
                if (aVar != null) {
                    aVar.interrupt();
                    f21951c = null;
                    SentryOptions sentryOptions = this.f21954b;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().h(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        this.f21954b = sentryOptions;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f21952d) {
                try {
                    if (f21951c == null) {
                        sentryAndroidOptions.getLogger().h(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                        a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new M.b(this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f21953a);
                        f21951c = aVar;
                        aVar.start();
                        sentryAndroidOptions.getLogger().h(sentryLevel, "AnrIntegration installed.", new Object[0]);
                    }
                } finally {
                }
            }
        }
    }
}
