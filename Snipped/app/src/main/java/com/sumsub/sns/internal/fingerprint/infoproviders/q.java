package com.sumsub.sns.internal.fingerprint.infoproviders;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class q {
    public static final String b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? "" : "active_per_user" : AppMeasurementSdk.ConditionalUserProperty.ACTIVE : "activating" : "inactive" : "unsupported";
    }
}
