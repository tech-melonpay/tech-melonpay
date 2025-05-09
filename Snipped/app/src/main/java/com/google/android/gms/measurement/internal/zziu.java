package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zziu implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjo zzc;

    public zziu(zzjo zzjoVar, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjoVar;
        this.zza = zzpVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfv zzfvVar;
        zzeb zzebVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzs.zzm().zzc().zzk()) {
                    zzebVar = this.zzc.zzb;
                    if (zzebVar == null) {
                        this.zzc.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzfvVar = this.zzc.zzs;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzebVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzs.zzq().zzO(str);
                            this.zzc.zzs.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzfvVar = this.zzc.zzs;
                    }
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzO(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                    zzfvVar = this.zzc.zzs;
                }
            } catch (RemoteException e10) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e10);
                zzfvVar = this.zzc.zzs;
            }
            zzfvVar.zzv().zzU(this.zzb, str);
        } catch (Throwable th) {
            this.zzc.zzs.zzv().zzU(this.zzb, null);
            throw th;
        }
    }
}
