package com.sumsub.sns.internal.core.common;

import android.os.Build;

/* loaded from: classes2.dex */
public final class f {
    public final String a() {
        return Build.TAGS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (ka.C0969n.Y(r1, "simulator", false) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean f() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L15
            boolean r2 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L95
            goto L18
        L15:
            r0 = move-exception
            goto L9b
        L18:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L15
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L95
            java.lang.String r1 = "unknown"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "goldfish"
            r3 = 0
            boolean r2 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L95
            java.lang.String r2 = "ranchu"
            boolean r1 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L15
            boolean r2 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L95
            java.lang.String r2 = "Emulator"
            boolean r2 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L95
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "Genymotion"
            boolean r1 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "sdk_google"
            boolean r2 = ka.C0969n.Y(r1, r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L95
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L95
            java.lang.String r0 = "sdk"
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L95
            java.lang.String r0 = "sdk_x86"
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L95
            java.lang.String r0 = "vbox86p"
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L95
            java.lang.String r0 = "emulator"
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L95
            java.lang.String r0 = "simulator"
            boolean r0 = ka.C0969n.Y(r1, r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L96
        L95:
            r3 = 1
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L15
            goto La7
        L9b:
            com.sumsub.sns.internal.log.a r1 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r2 = com.sumsub.sns.internal.log.c.a(r4)
            java.lang.String r3 = "Error checking whether application is running in an emulator."
            r1.e(r2, r3, r0)
            r0 = 0
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.f.f():java.lang.Boolean");
    }
}
