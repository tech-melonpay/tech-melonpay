package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v10, V v11, zzes<V> zzesVar) {
        this.zzb = v10;
        this.zzc = v11;
        this.zza = zzesVar;
    }

    public static <T> zzet<T> zza(T t3, T t10, zzes<T> zzesVar) {
        return new zzet<>(t3, t10, zzesVar);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
