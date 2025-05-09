package io.sentry;

import java.security.SecureRandom;

/* compiled from: TracesSampler.java */
/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f22202a;

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f22203b;

    public t0(SentryOptions sentryOptions) {
        D9.b.t0(sentryOptions, "options are required");
        SecureRandom secureRandom = new SecureRandom();
        this.f22202a = sentryOptions;
        this.f22203b = secureRandom;
    }
}
