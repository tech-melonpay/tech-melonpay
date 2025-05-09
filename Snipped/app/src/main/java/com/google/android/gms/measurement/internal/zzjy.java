package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjy implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzjz zzc;

    public zzjy(zzjz zzjzVar, long j10, long j11) {
        this.zzc = zzjzVar;
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjx
            @Override // java.lang.Runnable
            public final void run() {
                zzjy zzjyVar = zzjy.this;
                zzjz zzjzVar = zzjyVar.zzc;
                long j10 = zzjyVar.zza;
                long j11 = zzjyVar.zzb;
                zzjzVar.zza.zzg();
                zzjzVar.zza.zzs.zzay().zzc().zza("Application going to the background");
                boolean z10 = true;
                zzjzVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzjzVar.zza.zzs.zzf().zzu()) {
                    zzjzVar.zza.zzb.zzb(j11);
                    if (zzjzVar.zza.zzs.zzf().zzs(null, zzdy.zzaf)) {
                        zzkb zzkbVar = zzjzVar.zza.zzb;
                        long j12 = zzkbVar.zzb;
                        zzkbVar.zzb = j11;
                        bundle.putLong("_et", j11 - j12);
                        zzkz.zzJ(zzjzVar.zza.zzs.zzs().zzj(true), bundle, true);
                    } else {
                        z10 = false;
                    }
                    zzjzVar.zza.zzb.zzd(false, z10, j11);
                }
                zzjzVar.zza.zzs.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j10, bundle);
            }
        });
    }
}
