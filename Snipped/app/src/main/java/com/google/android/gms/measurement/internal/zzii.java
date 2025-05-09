package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzii implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzih zzb;
    final /* synthetic */ zzih zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzio zze;

    public zzii(zzio zzioVar, Bundle bundle, zzih zzihVar, zzih zzihVar2, long j10) {
        this.zze = zzioVar;
        this.zza = bundle;
        this.zzb = zzihVar;
        this.zzc = zzihVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzio.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
