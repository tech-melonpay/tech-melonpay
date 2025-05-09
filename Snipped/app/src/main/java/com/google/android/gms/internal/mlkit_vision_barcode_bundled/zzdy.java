package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
public class zzdy extends zzdx implements zzfp {
    public zzdy(zzdz zzdzVar) {
        super(zzdzVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdz zzk() {
        if (!((zzdz) this.zza).zzX()) {
            return (zzdz) this.zza;
        }
        ((zzdz) this.zza).zza.zzg();
        return (zzdz) super.zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx
    public final void zzn() {
        super.zzn();
        if (((zzdz) this.zza).zza != zzdt.zzd()) {
            zzdz zzdzVar = (zzdz) this.zza;
            zzdzVar.zza = zzdzVar.zza.clone();
        }
    }
}
