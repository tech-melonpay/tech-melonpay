package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.Key;
import com.sumsub.sns.internal.log.c;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15136f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f15137g = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15138a;

    /* renamed from: b, reason: collision with root package name */
    public final f f15139b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f15140c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f15141d;

    /* renamed from: e, reason: collision with root package name */
    public final Runtime f15142e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public j0(Context context, f fVar, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f15138a = context;
        this.f15139b = fVar;
        this.f15140c = strArr;
        this.f15141d = strArr2;
        this.f15142e = runtime;
    }

    public final boolean a() {
        for (String str : this.f15140c) {
            try {
            } catch (RuntimeException e10) {
                com.sumsub.sns.internal.log.a.f17535a.e(c.a(this), String.format("Error when trying to check if root file %s exists.", Arrays.copyOf(new Object[]{str}, 1)), e10);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        PackageManager packageManager = this.f15138a.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f15141d) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004a, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r10 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r10.f15142e     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L4f
            java.lang.Process r0 = r3.exec(r0)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L4f
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
            java.nio.charset.Charset r6 = com.sumsub.sns.internal.core.common.j0.f15137g     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L39
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
            goto L4f
        L3b:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        L3f:
            com.sumsub.sns.internal.log.a r3 = com.sumsub.sns.internal.log.a.f17535a     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = com.sumsub.sns.internal.log.c.a(r10)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.d(r4, r5, r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L63
            goto L60
        L4d:
            r1 = move-exception
            goto L66
        L4f:
            com.sumsub.sns.internal.log.a r3 = com.sumsub.sns.internal.log.a.f17535a     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = com.sumsub.sns.internal.log.c.a(r10)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "SU isn't found on this Device."
            r7 = 4
            r8 = 0
            r6 = 0
            com.sumsub.log.logger.Logger.d$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L63
            r0 = r2
        L60:
            r0.destroy()
        L63:
            return r1
        L64:
            r1 = move-exception
            r0 = r2
        L66:
            if (r0 == 0) goto L6b
            r0.destroy()
        L6b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.common.j0.c():boolean");
    }

    public final boolean d() {
        String a10 = this.f15139b.a();
        return a10 != null && C0969n.Y(a10, "test-keys", false);
    }

    public final boolean f() {
        return d() || a() || c() || b();
    }

    public j0(Context context, f fVar) {
        this(context, fVar, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }
}
