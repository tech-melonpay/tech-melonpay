package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public final class zzgr {
    public static <T> T zza(Bundle bundle, String str, Class<T> cls, T t3) {
        T t10 = (T) bundle.get(str);
        if (t10 == null) {
            return t3;
        }
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(androidx.camera.core.impl.utils.a.n(b.p("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), t10.getClass().getCanonicalName(), "]"));
    }

    public static void zzb(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
