package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzil implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzio zzb;

    public zzil(zzio zzioVar, long j10) {
        this.zzb = zzioVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
