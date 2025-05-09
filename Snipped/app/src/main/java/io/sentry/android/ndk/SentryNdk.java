package io.sentry.android.ndk;

import D9.b;
import H9.e;
import io.sentry.android.core.SentryAndroidOptions;

/* loaded from: classes2.dex */
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void close() {
        shutdown();
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        e sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion != null) {
            sdkVersion.a("maven:io.sentry:sentry-android-ndk");
        }
        initSentryNative(sentryAndroidOptions);
        if (sentryAndroidOptions.isEnableScopeSync()) {
            sentryAndroidOptions.addScopeObserver(new a(sentryAndroidOptions));
        }
        sentryAndroidOptions.setDebugImagesLoader(new b());
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    private static native void shutdown();
}
