package io.sentry;

/* compiled from: NoOpLogger.java */
/* loaded from: classes2.dex */
public final class K implements InterfaceC0859q {

    /* renamed from: a, reason: collision with root package name */
    public static final K f21829a = new K();

    @Override // io.sentry.InterfaceC0859q
    public final boolean j(SentryLevel sentryLevel) {
        return false;
    }

    @Override // io.sentry.InterfaceC0859q
    public final void f(SentryLevel sentryLevel, String str, Throwable th) {
    }

    @Override // io.sentry.InterfaceC0859q
    public final void h(SentryLevel sentryLevel, String str, Object... objArr) {
    }

    @Override // io.sentry.InterfaceC0859q
    public final void d(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
    }
}
