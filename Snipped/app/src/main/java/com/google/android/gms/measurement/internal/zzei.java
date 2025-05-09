package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.sumsub.sns.internal.core.data.model.p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzei implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzel zzf;

    public zzei(zzel zzelVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzelVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        long j10;
        char c10;
        long j11;
        zzfa zzm = this.zzf.zzs.zzm();
        if (!zzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c2 = this.zzf.zza;
        if (c2 == 0) {
            if (this.zzf.zzs.zzf().zzy()) {
                zzel zzelVar = this.zzf;
                zzelVar.zzs.zzaw();
                zzelVar.zza = 'C';
            } else {
                zzel zzelVar2 = this.zzf;
                zzelVar2.zzs.zzaw();
                zzelVar2.zza = 'c';
            }
        }
        j10 = this.zzf.zzb;
        if (j10 < 0) {
            zzel zzelVar3 = this.zzf;
            zzelVar3.zzs.zzf().zzh();
            zzelVar3.zzb = 46000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        c10 = this.zzf.zza;
        j11 = this.zzf.zzb;
        String zzo = zzel.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb2 = new StringBuilder(zzo.length() + 24);
        sb2.append("2");
        sb2.append(charAt);
        sb2.append(c10);
        sb2.append(j11);
        sb2.append(p.f15541a);
        sb2.append(zzo);
        String sb3 = sb2.toString();
        if (sb3.length() > 1024) {
            sb3 = this.zzb.substring(0, 1024);
        }
        zzey zzeyVar = zzm.zzb;
        if (zzeyVar != null) {
            zzeyVar.zzb(sb3, 1L);
        }
    }
}
