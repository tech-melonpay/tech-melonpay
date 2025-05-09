package io.sentry;

import java.util.concurrent.Future;
import u9.RunnableC1537h;

/* compiled from: ISentryExecutorService.java */
/* renamed from: io.sentry.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0861t {
    void a(long j10);

    Future d(RunnableC1537h runnableC1537h);

    Future<?> submit(Runnable runnable);
}
