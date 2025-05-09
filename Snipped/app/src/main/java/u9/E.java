package u9;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.I;
import io.sentry.InterfaceC0867z;
import io.sentry.P;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Y;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: SentryAndroid.java */
/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final Date f30368a = I.n();

    /* renamed from: b, reason: collision with root package name */
    public static final long f30369b = SystemClock.uptimeMillis();

    public static void a(SentryOptions sentryOptions, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC0867z interfaceC0867z : sentryOptions.getIntegrations()) {
            if (z10 && (interfaceC0867z instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC0867z);
            }
            if (z11 && (interfaceC0867z instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC0867z);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 1; i < arrayList2.size(); i++) {
                sentryOptions.getIntegrations().remove((InterfaceC0867z) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i9 = 1; i9 < arrayList.size(); i9++) {
                sentryOptions.getIntegrations().remove((InterfaceC0867z) arrayList.get(i9));
            }
        }
    }

    public static synchronized void b(Context context, C1534e c1534e, Y.a aVar) {
        synchronized (E.class) {
            n.f30446e.a(f30369b, f30368a);
            try {
                try {
                    Y.c(new P(), new M.b(c1534e, context, aVar, 11));
                } catch (InstantiationException e10) {
                    c1534e.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
                } catch (NoSuchMethodException e11) {
                    c1534e.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
                    throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
                }
            } catch (IllegalAccessException e12) {
                c1534e.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
            } catch (InvocationTargetException e13) {
                c1534e.f(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
            }
        }
    }
}
