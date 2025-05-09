package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzfk implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfm zza;

    public zzfk(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List<String> list, boolean z10, boolean z11) {
        int i9 = i - 1;
        zzej zzi = i9 != 0 ? i9 != 1 ? i9 != 3 ? i9 != 4 ? this.zza.zzs.zzay().zzi() : z10 ? this.zza.zzs.zzay().zzm() : !z11 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk() : this.zza.zzs.zzay().zzj() : z10 ? this.zza.zzs.zzay().zzh() : !z11 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd() : this.zza.zzs.zzay().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
