package com.google.android.gms.internal.mlkit_vision_barcode;

import E3.e;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzri implements Runnable {
    public final /* synthetic */ zzrl zza;
    public final /* synthetic */ zzne zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ e zze;

    public /* synthetic */ zzri(zzrl zzrlVar, zzne zzneVar, Object obj, long j10, e eVar) {
        this.zza = zzrlVar;
        this.zzb = zzneVar;
        this.zzc = obj;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh(this.zzb, this.zzc, this.zzd, null);
    }
}
