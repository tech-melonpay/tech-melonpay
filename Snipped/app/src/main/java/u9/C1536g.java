package u9;

import android.app.Application;
import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.X;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import v9.C1551a;

/* compiled from: AndroidOptionsInitializer.java */
/* renamed from: u9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1536g {
    public static void a(Context context, SentryAndroidOptions sentryAndroidOptions, o oVar, z zVar, C1531b c1531b, boolean z10, boolean z11) {
        boolean i = C1551a.i(sentryAndroidOptions);
        sentryAndroidOptions.addIntegration(new D(new X(new C1535f(sentryAndroidOptions, 0), 0), i));
        sentryAndroidOptions.addIntegration(new y(z.b("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(s.i());
        sentryAndroidOptions.addIntegration(new D(new X(new C1535f(sentryAndroidOptions, 1), 1), i));
        sentryAndroidOptions.addIntegration(new io.sentry.android.core.b(context));
        sentryAndroidOptions.addIntegration(new m());
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new C1533d(application, oVar, c1531b));
            sentryAndroidOptions.addIntegration(new H(application, zVar));
            if (z10) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
            sentryAndroidOptions.addEventProcessor(new C(application, sentryAndroidOptions, oVar));
        } else {
            sentryAndroidOptions.getLogger().h(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z11) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new l(context));
        sentryAndroidOptions.addIntegration(new F(context));
        sentryAndroidOptions.addIntegration(new G(context));
        sentryAndroidOptions.addIntegration(new B(context));
    }
}
