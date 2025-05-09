package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjd implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzat zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjo zze;

    public zzjd(zzjo zzjoVar, boolean z10, zzp zzpVar, boolean z11, zzat zzatVar, String str) {
        this.zze = zzjoVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzatVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar;
        zzebVar = this.zze.zzb;
        if (zzebVar == null) {
            androidx.camera.core.impl.utils.a.t(this.zze.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzebVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
