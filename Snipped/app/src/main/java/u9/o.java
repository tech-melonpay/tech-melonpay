package u9;

import android.os.Build;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;

/* compiled from: BuildInfoProvider.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0859q f30451a;

    public o(InterfaceC0859q interfaceC0859q) {
        D9.b.t0(interfaceC0859q, "The ILogger object is required.");
        this.f30451a = interfaceC0859q;
    }

    public final Boolean a() {
        boolean z10;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z10 = false;
                            return Boolean.valueOf(z10);
                        }
                    }
                }
            }
            z10 = true;
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            this.f30451a.f(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
