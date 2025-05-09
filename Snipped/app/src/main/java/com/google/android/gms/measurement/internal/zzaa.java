package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzaa {
    public zzaa(Context context) {
    }

    public static final boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
