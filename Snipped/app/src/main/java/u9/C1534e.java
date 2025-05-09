package u9;

import android.util.Log;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;

/* compiled from: AndroidLogger.java */
/* renamed from: u9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1534e implements InterfaceC0859q {

    /* compiled from: AndroidLogger.java */
    /* renamed from: u9.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30408a;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            f30408a = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30408a[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30408a[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30408a[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30408a[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // io.sentry.InterfaceC0859q
    public final void d(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        f(sentryLevel, String.format(str, objArr), th);
    }

    @Override // io.sentry.InterfaceC0859q
    public final void f(SentryLevel sentryLevel, String str, Throwable th) {
        int i = a.f30408a[sentryLevel.ordinal()];
        if (i == 1) {
            Log.i("Sentry", str, th);
            return;
        }
        if (i == 2) {
            Log.w("Sentry", str, th);
            return;
        }
        if (i == 3) {
            Log.e("Sentry", str, th);
        } else if (i != 4) {
            Log.d("Sentry", str, th);
        } else {
            Log.wtf("Sentry", str, th);
        }
    }

    @Override // io.sentry.InterfaceC0859q
    public final void h(SentryLevel sentryLevel, String str, Object... objArr) {
        int i = a.f30408a[sentryLevel.ordinal()];
        Log.println(i != 1 ? i != 2 ? i != 4 ? 3 : 7 : 5 : 4, "Sentry", String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC0859q
    public final boolean j(SentryLevel sentryLevel) {
        return true;
    }
}
