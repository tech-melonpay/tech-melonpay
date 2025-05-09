package com.airbnb.epoxy;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public final class EpoxyAsyncUtil {
    private static Handler asyncBackgroundHandler;
    public static final Handler MAIN_THREAD_HANDLER = createHandler(Looper.getMainLooper(), false);
    public static final Handler AYSNC_MAIN_THREAD_HANDLER = createHandler(Looper.getMainLooper(), true);

    private EpoxyAsyncUtil() {
    }

    public static Looper buildBackgroundLooper(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static Handler createHandler(Looper looper, boolean z10) {
        Handler createAsync;
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (Throwable unused) {
            return new Handler(looper);
        }
    }

    public static Handler getAsyncBackgroundHandler() {
        if (asyncBackgroundHandler == null) {
            asyncBackgroundHandler = createHandler(buildBackgroundLooper("epoxy"), true);
        }
        return asyncBackgroundHandler;
    }
}
