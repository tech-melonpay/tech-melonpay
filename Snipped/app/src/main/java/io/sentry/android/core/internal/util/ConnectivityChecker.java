package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import y9.C1632a;

/* loaded from: classes2.dex */
public final class ConnectivityChecker {

    public enum Status {
        CONNECTED,
        NOT_CONNECTED,
        NO_PERMISSION,
        UNKNOWN
    }

    public static Status a(Context context, InterfaceC0859q interfaceC0859q) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            interfaceC0859q.h(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        if (connectivityManager == null) {
            return Status.UNKNOWN;
        }
        if (!C1632a.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            interfaceC0859q.h(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return Status.NO_PERMISSION;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected() ? Status.CONNECTED : Status.NOT_CONNECTED;
        }
        interfaceC0859q.h(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
        return Status.NOT_CONNECTED;
    }
}
