package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzhu implements Runnable {
    final /* synthetic */ zzag zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzia zzf;

    public zzhu(zzia zziaVar, zzag zzagVar, long j10, int i, long j11, boolean z10) {
        this.zzf = zziaVar;
        this.zza = zzagVar;
        this.zzb = j10;
        this.zzc = i;
        this.zzd = j11;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzW(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzia.zzv(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}
