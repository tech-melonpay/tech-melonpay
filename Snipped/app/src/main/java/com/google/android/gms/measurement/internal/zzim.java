package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzim implements Runnable {
    final /* synthetic */ zzih zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzio zzc;

    public zzim(zzio zzioVar, zzih zzihVar, long j10) {
        this.zzc = zzioVar;
        this.zza = zzihVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzio zzioVar = this.zzc;
        zzioVar.zza = null;
        zzioVar.zzs.zzt().zzG(null);
    }
}
