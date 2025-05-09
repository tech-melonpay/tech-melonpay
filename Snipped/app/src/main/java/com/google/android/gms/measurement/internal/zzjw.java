package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjw implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkd zzb;

    public zzjw(zzkd zzkdVar, long j10) {
        this.zzb = zzkdVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkd.zzj(this.zzb, this.zza);
    }
}
