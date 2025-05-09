package com.sumsub.sentry.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13559a = new b();

    public final PackageInfo a(Context context) {
        return a(context, 0);
    }

    public final String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 31) {
            return String.valueOf(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return String.valueOf(longVersionCode);
    }

    public final PackageInfo a(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            com.sumsub.sns.internal.log.a.f17535a.e(com.sumsub.sns.internal.log.c.a(this), "Error getting package info.", th);
            return null;
        }
    }

    public final String a(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return b(packageInfo);
    }
}
