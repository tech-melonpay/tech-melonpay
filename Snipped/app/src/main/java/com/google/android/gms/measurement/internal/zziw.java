package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zziw implements Runnable {
    final /* synthetic */ zzih zza;
    final /* synthetic */ zzjo zzb;

    public zziw(zzjo zzjoVar, zzih zzihVar) {
        this.zzb = zzjoVar;
        this.zza = zzihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzb.zzb;
        if (zzebVar == null) {
            androidx.camera.core.impl.utils.a.t(this.zzb.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zzih zzihVar = this.zza;
            if (zzihVar == null) {
                zzebVar.zzq(0L, null, null, this.zzb.zzs.zzau().getPackageName());
            } else {
                zzebVar.zzq(zzihVar.zzc, zzihVar.zza, zzihVar.zzb, this.zzb.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e10);
        }
    }
}
