package com.sumsub.sns.internal.geo.domain;

import android.location.Location;
import android.os.Build;

/* loaded from: classes2.dex */
public final class a {
    public static final boolean a(Location location) {
        boolean isMock;
        if (location == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return location.isFromMockProvider();
        }
        isMock = location.isMock();
        return isMock;
    }
}
