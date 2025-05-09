package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzhz<T> implements Serializable {
    public static <T> zzhz<T> zzc() {
        return zzhx.zza;
    }

    public static <T> zzhz<T> zzd(T t3) {
        return new zzia(t3);
    }

    public abstract T zza();

    public abstract boolean zzb();
}
