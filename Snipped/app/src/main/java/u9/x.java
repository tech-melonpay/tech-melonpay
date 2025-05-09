package u9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;

/* compiled from: ManifestMetadataReader.java */
/* loaded from: classes2.dex */
public final class x {
    public static Bundle a(Context context, InterfaceC0859q interfaceC0859q, o oVar) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (oVar == null) {
            D9.b.t0(interfaceC0859q, "The ILogger object is required.");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of = PackageManager.ApplicationInfoFlags.of(128L);
            applicationInfo = packageManager.getApplicationInfo(packageName, of);
        } else {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        return applicationInfo.metaData;
    }

    public static boolean b(Bundle bundle, InterfaceC0859q interfaceC0859q, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        interfaceC0859q.h(SentryLevel.DEBUG, "%s read: %s", str, Boolean.valueOf(z11));
        return z11;
    }

    public static Double c(Bundle bundle, InterfaceC0859q interfaceC0859q, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        interfaceC0859q.h(SentryLevel.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    public static long d(Bundle bundle, InterfaceC0859q interfaceC0859q, String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        interfaceC0859q.h(SentryLevel.DEBUG, "%s read: %s", str, Long.valueOf(j11));
        return j11;
    }

    public static String e(Bundle bundle, InterfaceC0859q interfaceC0859q, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC0859q.h(SentryLevel.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
