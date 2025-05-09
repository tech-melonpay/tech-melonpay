package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.io.Closeable;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: UncaughtExceptionHandlerIntegration.java */
/* loaded from: classes2.dex */
public final class w0 implements InterfaceC0867z, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f22216a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0858p f22217b;

    /* renamed from: c, reason: collision with root package name */
    public SentryOptions f22218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22219d;

    /* compiled from: UncaughtExceptionHandlerIntegration.java */
    public static final class a implements E9.c, E9.d, E9.g {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f22220a = new CountDownLatch(1);

        /* renamed from: b, reason: collision with root package name */
        public final long f22221b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0859q f22222c;

        public a(long j10, InterfaceC0859q interfaceC0859q) {
            this.f22221b = j10;
            this.f22222c = interfaceC0859q;
        }

        @Override // E9.c
        public final void a() {
            this.f22220a.countDown();
        }

        @Override // E9.d
        public final boolean d() {
            try {
                return this.f22220a.await(this.f22221b, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f22222c.f(SentryLevel.ERROR, "Exception while awaiting for flush in UncaughtExceptionHint", e10);
                return false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.setDefaultUncaughtExceptionHandler(this.f22216a);
            SentryOptions sentryOptions = this.f22218c;
            if (sentryOptions != null) {
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        C0855m c0855m = C0855m.f22069a;
        if (this.f22219d) {
            sentryOptions.getLogger().h(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f22219d = true;
        this.f22217b = c0855m;
        this.f22218c = sentryOptions;
        InterfaceC0859q logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f22218c.isEnableUncaughtExceptionHandler()));
        if (this.f22218c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                this.f22218c.getLogger().h(sentryLevel, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                this.f22216a = defaultUncaughtExceptionHandler;
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f22218c.getLogger().h(sentryLevel, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        SentryOptions sentryOptions = this.f22218c;
        if (sentryOptions == null || this.f22217b == null) {
            return;
        }
        sentryOptions.getLogger().h(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f22218c.getFlushTimeoutMillis(), this.f22218c.getLogger());
            H9.b bVar = new H9.b();
            bVar.f1573d = Boolean.FALSE;
            bVar.f1570a = "UncaughtExceptionHandler";
            i0 i0Var = new i0(new ExceptionMechanismException(bVar, th, thread, false));
            i0Var.f22041t = SentryLevel.FATAL;
            if (!this.f22217b.n(i0Var, J9.b.a(aVar)).equals(H9.g.f1604b) && !aVar.d()) {
                this.f22218c.getLogger().h(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", i0Var.f21917a);
            }
        } catch (Throwable th2) {
            this.f22218c.getLogger().f(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f22216a != null) {
            this.f22218c.getLogger().h(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f22216a.uncaughtException(thread, th);
        } else if (this.f22218c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
