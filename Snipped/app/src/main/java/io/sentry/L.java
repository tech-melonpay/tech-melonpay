package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import u9.RunnableC1537h;

/* compiled from: NoOpSentryExecutorService.java */
/* loaded from: classes2.dex */
public final class L implements InterfaceC0861t {

    /* renamed from: a, reason: collision with root package name */
    public static final L f21830a = new L();

    @Override // io.sentry.InterfaceC0861t
    public final Future d(RunnableC1537h runnableC1537h) {
        return new FutureTask(new com.sumsub.sentry.h(2));
    }

    @Override // io.sentry.InterfaceC0861t
    public final Future<?> submit(Runnable runnable) {
        return new FutureTask(new com.sumsub.sentry.h(2));
    }

    @Override // io.sentry.InterfaceC0861t
    public final void a(long j10) {
    }
}
