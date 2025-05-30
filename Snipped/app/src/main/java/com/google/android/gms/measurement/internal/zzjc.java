package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjc implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjo zzb;

    public zzjc(zzjo zzjoVar, zzp zzpVar) {
        this.zzb = zzjoVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzb.zzb;
        if (zzebVar == null) {
            androidx.camera.core.impl.utils.a.t(this.zzb.zzs, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzebVar.zzp(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send consent settings to the service", e10);
        }
    }
}
