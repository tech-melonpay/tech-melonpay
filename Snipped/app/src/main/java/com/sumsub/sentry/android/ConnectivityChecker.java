package com.sumsub.sentry.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.sumsub.log.logger.Logger;
import kotlin.Metadata;

/* loaded from: classes2.dex */
public final class ConnectivityChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectivityChecker f13558a = new ConnectivityChecker();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sentry/android/ConnectivityChecker$Status;", "", "(Ljava/lang/String;I)V", "CONNECTED", "NOT_CONNECTED", "NO_PERMISSION", "UNKNOWN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    public final Status a(Context context) {
        ConnectivityManager b9 = b(context);
        return b9 == null ? Status.UNKNOWN : a(context, b9);
    }

    public final ConnectivityManager b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "ConnectivityManager is null and cannot check network status", null, 4, null);
        }
        return connectivityManager;
    }

    @SuppressLint({"MissingPermission"})
    public final Status a(Context context, ConnectivityManager connectivityManager) {
        if (!g.f13574a.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "No permission (ACCESS_NETWORK_STATE) to check network status.", null, 4, null);
            return Status.NO_PERMISSION;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected() ? Status.CONNECTED : Status.NOT_CONNECTED;
        }
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "NetworkInfo is null, there's no active network.", null, 4, null);
        return Status.NOT_CONNECTED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r11 == 0) goto L36;
     */
    @android.annotation.SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r11, com.sumsub.sentry.android.a r12) {
        /*
            r10 = this;
            android.net.ConnectivityManager r0 = r10.b(r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.sumsub.sentry.android.g r2 = com.sumsub.sentry.android.g.f13574a
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r11 = r2.a(r11, r3)
            if (r11 != 0) goto L21
            com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r10)
            r6 = 4
            r7 = 0
            java.lang.String r4 = "No permission (ACCESS_NETWORK_STATE) to check network status."
            r5 = 0
            com.sumsub.log.logger.Logger.i$default(r2, r3, r4, r5, r6, r7)
            return r1
        L21:
            int r11 = r12.d()
            r12 = 23
            r2 = 0
            r3 = 1
            if (r11 < r12) goto L68
            android.net.Network r11 = r0.getActiveNetwork()
            if (r11 != 0) goto L40
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = com.sumsub.sns.internal.log.c.a(r10)
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Network is null and cannot check network status"
            r7 = 0
            com.sumsub.log.logger.Logger.i$default(r4, r5, r6, r7, r8, r9)
            return r1
        L40:
            android.net.NetworkCapabilities r11 = r0.getNetworkCapabilities(r11)
            if (r11 != 0) goto L55
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = com.sumsub.sns.internal.log.c.a(r10)
            r8 = 4
            r9 = 0
            java.lang.String r6 = "NetworkCapabilities is null and cannot check network type"
            r7 = 0
            com.sumsub.log.logger.Logger.i$default(r4, r5, r6, r7, r8, r9)
            return r1
        L55:
            r12 = 3
            boolean r12 = r11.hasTransport(r12)
            boolean r0 = r11.hasTransport(r3)
            boolean r11 = r11.hasTransport(r2)
            if (r11 == 0) goto L65
            goto L66
        L65:
            r3 = r2
        L66:
            r2 = r12
            goto L91
        L68:
            android.net.NetworkInfo r11 = r0.getActiveNetworkInfo()
            if (r11 != 0) goto L7d
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = com.sumsub.sns.internal.log.c.a(r10)
            r8 = 4
            r9 = 0
            java.lang.String r6 = "NetworkInfo is null, there's no active network."
            r7 = 0
            com.sumsub.log.logger.Logger.i$default(r4, r5, r6, r7, r8, r9)
            return r1
        L7d:
            int r11 = r11.getType()
            r12 = 9
            if (r11 != r12) goto L89
            r0 = r2
            r2 = r3
        L87:
            r3 = r0
            goto L91
        L89:
            if (r11 != r3) goto L8e
            r0 = r3
            r3 = r2
            goto L91
        L8e:
            r0 = r2
            if (r11 != 0) goto L87
        L91:
            if (r2 == 0) goto L96
            java.lang.String r1 = "ethernet"
            goto L9f
        L96:
            if (r0 == 0) goto L9b
            java.lang.String r1 = "wifi"
            goto L9f
        L9b:
            if (r3 == 0) goto L9f
            java.lang.String r1 = "cellular"
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sentry.android.ConnectivityChecker.a(android.content.Context, com.sumsub.sentry.android.a):java.lang.String");
    }
}
