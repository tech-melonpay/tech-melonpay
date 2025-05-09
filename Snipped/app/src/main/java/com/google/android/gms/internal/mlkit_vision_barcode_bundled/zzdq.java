package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzdq extends zzdp {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final int zza(Map.Entry entry) {
        return ((zzea) entry.getKey()).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final zzdt zzb(Object obj) {
        return ((zzdz) obj).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final zzdt zzc(Object obj) {
        return ((zzdz) obj).zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final Object zzd(zzdo zzdoVar, zzfo zzfoVar, int i) {
        return zzdoVar.zzb(zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final void zze(Object obj) {
        ((zzdz) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final void zzf(zzhq zzhqVar, Map.Entry entry) {
        zzea zzeaVar = (zzea) entry.getKey();
        zzho zzhoVar = zzho.zza;
        switch (zzeaVar.zzb.ordinal()) {
            case 0:
                zzhqVar.zzf(zzeaVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzhqVar.zzo(zzeaVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzhqVar.zzt(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzhqVar.zzK(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzhqVar.zzr(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzhqVar.zzm(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzhqVar.zzk(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzhqVar.zzb(zzeaVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzhqVar.zzG(zzeaVar.zza, (String) entry.getValue());
                break;
            case 9:
                zzhqVar.zzq(zzeaVar.zza, entry.getValue(), zzfx.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzhqVar.zzv(zzeaVar.zza, entry.getValue(), zzfx.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzhqVar.zzd(zzeaVar.zza, (zzdb) entry.getValue());
                break;
            case 12:
                zzhqVar.zzI(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzhqVar.zzr(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzhqVar.zzx(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzhqVar.zzz(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzhqVar.zzB(zzeaVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzhqVar.zzD(zzeaVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdp
    public final boolean zzg(zzfo zzfoVar) {
        return zzfoVar instanceof zzdz;
    }
}
