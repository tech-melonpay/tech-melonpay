package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzir implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjo zzd;

    public zzir(zzjo zzjoVar, AtomicReference atomicReference, zzp zzpVar, boolean z10) {
        this.zzd = zzjoVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzeb zzebVar;
        synchronized (this.zza) {
            try {
                try {
                    zzebVar = this.zzd.zzb;
                } catch (RemoteException e10) {
                    this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
                if (zzebVar == null) {
                    this.zzd.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.zzb);
                this.zza.set(zzebVar.zze(this.zzb, this.zzc));
                this.zzd.zzQ();
                atomicReference = this.zza;
                atomicReference.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
