package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
abstract class zzvy {
    private static final zzvy zza = new zzvu(null);
    private static final zzvy zzb = new zzvw(0 == true ? 1 : 0);

    public /* synthetic */ zzvy(zzvx zzvxVar) {
    }

    public static zzvy zzd() {
        return zza;
    }

    public static zzvy zze() {
        return zzb;
    }

    public abstract <L> List<L> zza(Object obj, long j10);

    public abstract void zzb(Object obj, long j10);

    public abstract <L> void zzc(Object obj, Object obj2, long j10);
}
