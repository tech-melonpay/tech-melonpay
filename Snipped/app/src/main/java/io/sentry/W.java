package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: SendCachedEnvelopeFireAndForgetIntegration.java */
/* loaded from: classes2.dex */
public interface W {
    static boolean b(String str, InterfaceC0859q interfaceC0859q) {
        if (str != null) {
            return true;
        }
        interfaceC0859q.h(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    com.sumsub.sns.internal.core.domain.h a(SentryAndroidOptions sentryAndroidOptions);
}
