package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzfy implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzgn zzb;

    public zzfy(zzgn zzgnVar, zzab zzabVar) {
        this.zzb = zzgnVar;
        this.zza = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzks zzksVar3;
        zzksVar = this.zzb.zza;
        zzksVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzksVar3 = this.zzb.zza;
            zzksVar3.zzM(this.zza);
        } else {
            zzksVar2 = this.zzb.zza;
            zzksVar2.zzR(this.zza);
        }
    }
}
