package u9;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import io.sentry.C0844b;
import io.sentry.C0855m;
import io.sentry.InterfaceC0858p;
import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import y9.C1632a;

/* compiled from: PhoneStateBreadcrumbsIntegration.java */
/* loaded from: classes2.dex */
public final class B implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30356a;

    /* renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f30357b;

    /* renamed from: c, reason: collision with root package name */
    public a f30358c;

    /* renamed from: d, reason: collision with root package name */
    public TelephonyManager f30359d;

    /* compiled from: PhoneStateBreadcrumbsIntegration.java */
    public static final class a extends PhoneStateListener {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0858p f30360a = C0855m.f22069a;

        @Override // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int i, String str) {
            if (i == 1) {
                C0844b c0844b = new C0844b();
                c0844b.f21964c = "system";
                c0844b.f21966e = "device.event";
                c0844b.a("CALL_STATE_RINGING", "action");
                c0844b.f21963b = "Device ringing";
                c0844b.f21967f = SentryLevel.INFO;
                this.f30360a.b(c0844b);
            }
        }
    }

    public B(Context context) {
        this.f30356a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar;
        TelephonyManager telephonyManager = this.f30359d;
        if (telephonyManager == null || (aVar = this.f30358c) == null) {
            return;
        }
        telephonyManager.listen(aVar, 0);
        this.f30358c = null;
        SentryAndroidOptions sentryAndroidOptions = this.f30357b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(SentryLevel.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        D9.b.t0(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f30357b = sentryAndroidOptions;
        InterfaceC0859q logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f30357b.isEnableSystemEventBreadcrumbs()));
        if (this.f30357b.isEnableSystemEventBreadcrumbs()) {
            Context context = this.f30356a;
            if (C1632a.b(context, "android.permission.READ_PHONE_STATE")) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                this.f30359d = telephonyManager;
                if (telephonyManager == null) {
                    this.f30357b.getLogger().h(SentryLevel.INFO, "TelephonyManager is not available", new Object[0]);
                    return;
                }
                try {
                    a aVar = new a();
                    this.f30358c = aVar;
                    this.f30359d.listen(aVar, 32);
                    sentryOptions.getLogger().h(sentryLevel, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                } catch (Throwable th) {
                    this.f30357b.getLogger().d(SentryLevel.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
                }
            }
        }
    }
}
