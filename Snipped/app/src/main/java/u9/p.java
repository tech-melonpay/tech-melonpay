package u9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;

/* compiled from: ContextUtils.java */
/* loaded from: classes2.dex */
public final class p {
    @SuppressLint({"NewApi"})
    public static PackageInfo a(Context context, int i, InterfaceC0859q interfaceC0859q, o oVar) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            oVar.getClass();
            if (Build.VERSION.SDK_INT < 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
            }
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(i);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        } catch (Throwable th) {
            interfaceC0859q.f(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public static String b(PackageInfo packageInfo, o oVar) {
        long longVersionCode;
        oVar.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}
