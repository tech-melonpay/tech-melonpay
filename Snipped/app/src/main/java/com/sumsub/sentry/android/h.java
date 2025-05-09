package com.sumsub.sentry.android;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final a f13575f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f13576g = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13577a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sentry.android.a f13578b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f13579c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f13580d;

    /* renamed from: e, reason: collision with root package name */
    public final Runtime f13581e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public h(Context context, com.sumsub.sentry.android.a aVar, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f13577a = context;
        this.f13578b = aVar;
        this.f13579c = strArr;
        this.f13580d = strArr2;
        this.f13581e = runtime;
    }

    public final boolean a() {
        for (String str : this.f13579c) {
            try {
            } catch (RuntimeException e10) {
                com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), String.format("Error when trying to check if root file %s exists.", Arrays.copyOf(new Object[]{str}, 1)), e10);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        PackageManager packageManager = this.f13577a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f13580d) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r0 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r8 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r8.f13581e     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L54
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L54
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.nio.charset.Charset r6 = com.sumsub.sentry.android.h.f13576g     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r1
        L29:
            U4.b.d(r3, r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            r0.destroy()
            return r4
        L30:
            r2 = move-exception
            goto L3f
        L32:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L34
        L34:
            r4 = move-exception
            U4.b.d(r3, r2)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            throw r4     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
        L39:
            r2 = r0
            goto L54
        L3b:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L3f:
            com.sumsub.sns.internal.log.a r3 = com.sumsub.sns.internal.log.a.f17535a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = com.sumsub.sns.internal.log.c.a(r8)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.e(r4, r5, r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L5a
            goto L57
        L4d:
            r1 = move-exception
            if (r0 == 0) goto L53
            r0.destroy()
        L53:
            throw r1
        L54:
            if (r2 == 0) goto L5a
            r0 = r2
        L57:
            r0.destroy()
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.android.h.c():boolean");
    }

    public final boolean d() {
        String a10 = this.f13578b.a();
        return a10 != null && C0969n.Y(a10, "test-keys", false);
    }

    public final boolean e() {
        return d() || a() || c() || b();
    }

    public /* synthetic */ h(Context context, com.sumsub.sentry.android.a aVar, String[] strArr, String[] strArr2, Runtime runtime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new com.sumsub.sentry.android.a() : aVar, (i & 4) != 0 ? new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"} : strArr, (i & 8) != 0 ? new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"} : strArr2, (i & 16) != 0 ? Runtime.getRuntime() : runtime);
    }
}
