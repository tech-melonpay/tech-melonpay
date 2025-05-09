package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzkf extends zzam {
    final /* synthetic */ zzkg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkf(zzkg zzkgVar, zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = zzkgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzam
    public final void zzc() {
        this.zza.zza();
        a.q(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzV();
    }
}
