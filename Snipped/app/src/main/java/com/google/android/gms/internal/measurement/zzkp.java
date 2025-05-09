package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzkp extends zzkq {
    public /* synthetic */ zzkp(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j10) {
        ((zzke) zzml.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final <E> void zzb(Object obj, Object obj2, long j10) {
        zzke zzkeVar = (zzke) zzml.zzf(obj, j10);
        zzke zzkeVar2 = (zzke) zzml.zzf(obj2, j10);
        int size = zzkeVar.size();
        int size2 = zzkeVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkeVar.zzc()) {
                zzkeVar = zzkeVar.zzd(size2 + size);
            }
            zzkeVar.addAll(zzkeVar2);
        }
        if (size > 0) {
            zzkeVar2 = zzkeVar;
        }
        zzml.zzs(obj, j10, zzkeVar2);
    }

    private zzkp() {
        super(null);
    }
}
