package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zziq implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkv zzc;
    final /* synthetic */ zzjo zzd;

    public zziq(zzjo zzjoVar, zzp zzpVar, boolean z10, zzkv zzkvVar) {
        this.zzd = zzjoVar;
        this.zza = zzpVar;
        this.zzb = z10;
        this.zzc = zzkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zzd.zzb;
        if (zzebVar == null) {
            androidx.camera.core.impl.utils.a.t(this.zzd.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzebVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
