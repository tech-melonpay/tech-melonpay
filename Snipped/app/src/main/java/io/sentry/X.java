package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import u9.C1535f;

/* compiled from: SendFireAndForgetEnvelopeSender.java */
/* loaded from: classes2.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21912a;

    /* renamed from: b, reason: collision with root package name */
    public final C1535f f21913b;

    public /* synthetic */ X(C1535f c1535f, int i) {
        this.f21912a = i;
        this.f21913b = c1535f;
    }

    @Override // io.sentry.W
    public final com.sumsub.sns.internal.core.domain.h a(SentryAndroidOptions sentryAndroidOptions) {
        switch (this.f21912a) {
            case 0:
                String a10 = this.f21913b.a();
                if (a10 != null && W.b(a10, sentryAndroidOptions.getLogger())) {
                    break;
                } else {
                    sentryAndroidOptions.getLogger().h(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    break;
                }
            default:
                String a11 = this.f21913b.a();
                if (a11 != null && W.b(a11, sentryAndroidOptions.getLogger())) {
                    break;
                } else {
                    sentryAndroidOptions.getLogger().h(SentryLevel.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
        }
        return null;
    }
}
