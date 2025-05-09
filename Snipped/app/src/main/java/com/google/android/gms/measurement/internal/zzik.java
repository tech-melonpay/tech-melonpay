package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzik implements Runnable {
    final /* synthetic */ zzio zza;

    public zzik(zzio zzioVar) {
        this.zza = zzioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzih zzihVar;
        zzio zzioVar = this.zza;
        zzihVar = zzioVar.zzh;
        zzioVar.zza = zzihVar;
    }
}
