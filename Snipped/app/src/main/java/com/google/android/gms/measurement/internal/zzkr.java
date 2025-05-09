package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzkr {
    com.google.android.gms.internal.measurement.zzfy zza;
    List<Long> zzb;
    List<com.google.android.gms.internal.measurement.zzfo> zzc;
    long zzd;
    final /* synthetic */ zzks zze;

    public /* synthetic */ zzkr(zzks zzksVar, zzkq zzkqVar) {
        this.zze = zzksVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        return ((zzfoVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j10, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        Preconditions.checkNotNull(zzfoVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() > 0 && zzb(this.zzc.get(0)) != zzb(zzfoVar)) {
            return false;
        }
        long zzbt = this.zzd + zzfoVar.zzbt();
        this.zze.zzg();
        if (zzbt >= Math.max(0, zzdy.zzh.zza(null).intValue())) {
            return false;
        }
        this.zzd = zzbt;
        this.zzc.add(zzfoVar);
        this.zzb.add(Long.valueOf(j10));
        int size = this.zzc.size();
        this.zze.zzg();
        return size < Math.max(1, zzdy.zzi.zza(null).intValue());
    }
}
