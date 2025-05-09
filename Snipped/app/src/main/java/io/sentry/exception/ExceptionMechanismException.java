package io.sentry.exception;

import H9.b;

/* loaded from: classes2.dex */
public final class ExceptionMechanismException extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;

    /* renamed from: a, reason: collision with root package name */
    public final b f21990a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f21991b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f21992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21993d;

    public ExceptionMechanismException(b bVar, Throwable th, Thread thread, boolean z10) {
        this.f21990a = bVar;
        D9.b.t0(th, "Throwable is required.");
        this.f21991b = th;
        D9.b.t0(thread, "Thread is required.");
        this.f21992c = thread;
        this.f21993d = z10;
    }
}
