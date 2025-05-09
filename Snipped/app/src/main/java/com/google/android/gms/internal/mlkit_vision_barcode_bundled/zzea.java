package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzea implements zzds {
    final int zza;
    final zzho zzb;

    public zzea(zzeg zzegVar, int i, zzho zzhoVar, boolean z10, boolean z11) {
        this.zza = i;
        this.zzb = zzhoVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzea) obj).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzfn zzb(zzfn zzfnVar, zzfo zzfoVar) {
        ((zzdx) zzfnVar).zzg((zzed) zzfoVar);
        return zzfnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzft zzc(zzft zzftVar, zzft zzftVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzho zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final zzhp zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds
    public final boolean zzg() {
        return false;
    }
}
