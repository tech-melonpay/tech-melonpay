package org.bouncycastle.jsse.provider;

/* loaded from: classes.dex */
abstract class CallbackUtil {
    public static void safeCallback(Runnable runnable) {
        try {
            runnable.run();
        } catch (Error e10) {
            throw e10;
        } catch (Throwable unused) {
        }
    }
}
