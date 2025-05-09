package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjz {
    final /* synthetic */ zzkd zza;
    private zzjy zzb;

    public zzjz(zzkd zzkdVar) {
        this.zza = zzkdVar;
    }

    public final void zza(long j10) {
        Handler handler;
        this.zzb = new zzjy(this, this.zza.zzs.zzav().currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        if (this.zzb != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
