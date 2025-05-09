package io.sentry.android.ndk;

import D9.b;
import io.sentry.C0844b;
import io.sentry.I;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.r;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: NdkScopeObserver.java */
/* loaded from: classes2.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f21960a;

    /* renamed from: b, reason: collision with root package name */
    public final A9.a f21961b;

    public a(SentryOptions sentryOptions) {
        NativeScope nativeScope = new NativeScope();
        b.t0(sentryOptions, "The SentryOptions object is required.");
        this.f21960a = sentryOptions;
        this.f21961b = nativeScope;
    }

    @Override // io.sentry.r
    public final void b(C0844b c0844b) {
        SentryOptions sentryOptions = this.f21960a;
        try {
            SentryLevel sentryLevel = c0844b.f21967f;
            String str = null;
            String lowerCase = sentryLevel != null ? sentryLevel.name().toLowerCase(Locale.ROOT) : null;
            String q10 = I.q((Date) c0844b.f21962a.clone());
            try {
                Map<String, Object> map = c0844b.f21965d;
                if (!map.isEmpty()) {
                    str = sentryOptions.getSerializer().e(map);
                }
            } catch (Throwable th) {
                sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
            }
            this.f21961b.a(lowerCase, c0844b.f21963b, c0844b.f21966e, c0844b.f21964c, q10, str);
        } catch (Throwable th2) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }
}
