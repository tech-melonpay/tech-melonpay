package com.sumsub.sentry.android;

import android.os.Build;
import ka.C0969n;

/* loaded from: classes2.dex */
public class a {
    public final String a() {
        return Build.TAGS;
    }

    public final int d() {
        return Build.VERSION.SDK_INT;
    }

    public final boolean f() {
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                return true;
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!C0969n.Y(str2, "goldfish", false) && !C0969n.Y(str2, "ranchu", false)) {
                    String str3 = Build.MODEL;
                    if (!C0969n.Y(str3, "google_sdk", false) && !C0969n.Y(str3, "Emulator", false) && !C0969n.Y(str3, "Android SDK built for x86", false) && !C0969n.Y(Build.MANUFACTURER, "Genymotion", false)) {
                        String str4 = Build.PRODUCT;
                        if (!C0969n.Y(str4, "sdk_google", false) && !C0969n.Y(str4, "google_sdk", false) && !C0969n.Y(str4, "sdk", false) && !C0969n.Y(str4, "sdk_x86", false) && !C0969n.Y(str4, "vbox86p", false) && !C0969n.Y(str4, "emulator", false)) {
                            if (!C0969n.Y(str4, "simulator", false)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error checking whether application is running in an emulator.", th);
            return false;
        }
    }
}
