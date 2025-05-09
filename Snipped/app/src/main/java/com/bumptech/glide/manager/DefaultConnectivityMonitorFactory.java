package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor;
import k0.C0913a;

/* loaded from: classes.dex */
public class DefaultConnectivityMonitorFactory implements ConnectivityMonitorFactory {
    private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
    private static final String TAG = "ConnectivityMonitor";

    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    public ConnectivityMonitor build(Context context, ConnectivityMonitor.ConnectivityListener connectivityListener) {
        boolean z10 = C0913a.checkSelfPermission(context, NETWORK_PERMISSION) == 0;
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new DefaultConnectivityMonitor(context, connectivityListener) : new NullConnectivityMonitor();
    }
}
