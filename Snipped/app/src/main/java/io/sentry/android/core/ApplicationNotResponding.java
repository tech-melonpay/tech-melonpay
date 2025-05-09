package io.sentry.android.core;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f21938a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        D9.b.t0(thread, "Thread must be provided.");
        this.f21938a = thread;
        setStackTrace(thread.getStackTrace());
    }
}
