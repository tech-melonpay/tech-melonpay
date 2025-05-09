package u9;

import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;

/* compiled from: NoOpDebugImagesLoader.java */
/* loaded from: classes2.dex */
public final class z implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final z f30483a = new z();

    public static boolean a(String str, SentryOptions sentryOptions) {
        return b(str, sentryOptions != null ? sentryOptions.getLogger() : null) != null;
    }

    public static Class b(String str, InterfaceC0859q interfaceC0859q) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            if (interfaceC0859q == null) {
                return null;
            }
            interfaceC0859q.f(SentryLevel.DEBUG, "Class not available:".concat(str), e10);
            return null;
        } catch (UnsatisfiedLinkError e11) {
            if (interfaceC0859q == null) {
                return null;
            }
            interfaceC0859q.f(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e11);
            return null;
        } catch (Throwable th) {
            if (interfaceC0859q == null) {
                return null;
            }
            interfaceC0859q.f(SentryLevel.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }
}
