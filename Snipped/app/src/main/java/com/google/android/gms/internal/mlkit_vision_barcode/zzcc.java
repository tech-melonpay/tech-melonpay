package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzcc extends zzcd {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcd zzc;

    public zzcc(zzcd zzcdVar, int i, int i9) {
        this.zzc = zzcdVar;
        this.zza = i;
        this.zzb = i9;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzaq.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcd, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcd subList(int i, int i9) {
        zzaq.zzc(i, i9, this.zzb);
        zzcd zzcdVar = this.zzc;
        int i10 = this.zza;
        return zzcdVar.subList(i + i10, i9 + i10);
    }
}
