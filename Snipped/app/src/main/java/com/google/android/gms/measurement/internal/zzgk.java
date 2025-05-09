package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzgk implements Callable<List<zzkx>> {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgn zzb;

    public zzgk(zzgn zzgnVar, String str) {
        this.zzb = zzgnVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<zzkx> call() {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzb.zza;
        zzksVar.zzA();
        zzksVar2 = this.zzb.zza;
        return zzksVar2.zzi().zzu(this.zza);
    }
}
