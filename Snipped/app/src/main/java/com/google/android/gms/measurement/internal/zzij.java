package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzij implements Runnable {
    final /* synthetic */ zzih zza;
    final /* synthetic */ zzih zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzio zze;

    public zzij(zzio zzioVar, zzih zzihVar, zzih zzihVar2, long j10, boolean z10) {
        this.zze = zzioVar;
        this.zza = zzihVar;
        this.zzb = zzihVar2;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
