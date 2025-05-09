package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.1.0 */
/* loaded from: classes.dex */
final class zzdk implements zzhq {
    private final zzdj zza;

    private zzdk(zzdj zzdjVar) {
        byte[] bArr = zzem.zzd;
        this.zza = zzdjVar;
        zzdjVar.zza = this;
    }

    public static zzdk zza(zzdj zzdjVar) {
        zzdk zzdkVar = zzdjVar.zza;
        return zzdkVar != null ? zzdkVar : new zzdk(zzdjVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzA(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzB(int i, int i9) {
        this.zza.zzp(i, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzC(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                zzdj zzdjVar = this.zza;
                int intValue = ((Integer) list.get(i9)).intValue();
                zzdjVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            i10 += zzdj.zzy((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzdj zzdjVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i9)).intValue();
            zzdjVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzD(int i, long j10) {
        this.zza.zzr(i, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzE(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                zzdj zzdjVar = this.zza;
                long longValue = ((Long) list.get(i9)).longValue();
                zzdjVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long longValue2 = ((Long) list.get(i11)).longValue();
            i10 += zzdj.zzz((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzdj zzdjVar2 = this.zza;
            long longValue3 = ((Long) list.get(i9)).longValue();
            zzdjVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    @Deprecated
    public final void zzF(int i) {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzG(int i, String str) {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzH(int i, List list) {
        int i9 = 0;
        if (!(list instanceof zzew)) {
            while (i9 < list.size()) {
                this.zza.zzm(i, (String) list.get(i9));
                i9++;
            }
            return;
        }
        zzew zzewVar = (zzew) list;
        while (i9 < list.size()) {
            Object zzf = zzewVar.zzf(i9);
            if (zzf instanceof String) {
                this.zza.zzm(i, (String) zzf);
            } else {
                this.zza.zze(i, (zzdb) zzf);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzI(int i, int i9) {
        this.zza.zzp(i, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzJ(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzp(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzdj.zzy(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzq(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzK(int i, long j10) {
        this.zza.zzr(i, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzL(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzdj.zzz(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzb(int i, boolean z10) {
        this.zza.zzd(i, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzc(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzd(i, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).getClass();
            i10++;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzd(int i, zzdb zzdbVar) {
        this.zza.zze(i, zzdbVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zze(int i, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.zza.zze(i, (zzdb) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzf(int i, double d10) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzg(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    @Deprecated
    public final void zzh(int i) {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzi(int i, int i9) {
        this.zza.zzj(i, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzj(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzdj.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzk(int i, int i9) {
        this.zza.zzf(i, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzl(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzm(int i, long j10) {
        this.zza.zzh(i, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzn(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzo(int i, float f10) {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzp(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzq(int i, Object obj, zzgh zzghVar) {
        zzdj zzdjVar = this.zza;
        zzdjVar.zzo(i, 3);
        zzghVar.zzi((zzfo) obj, zzdjVar.zza);
        zzdjVar.zzo(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzr(int i, int i9) {
        this.zza.zzj(i, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzs(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzj(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzdj.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzt(int i, long j10) {
        this.zza.zzr(i, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzu(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzr(i, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzdj.zzz(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzv(int i, Object obj, zzgh zzghVar) {
        zzfo zzfoVar = (zzfo) obj;
        zzdg zzdgVar = (zzdg) this.zza;
        zzdgVar.zzq((i << 3) | 2);
        zzdgVar.zzq(((zzck) zzfoVar).zzB(zzghVar));
        zzghVar.zzi(zzfoVar, zzdgVar.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzw(int i, Object obj) {
        if (obj instanceof zzdb) {
            zzdg zzdgVar = (zzdg) this.zza;
            zzdgVar.zzq(11);
            zzdgVar.zzp(2, i);
            zzdgVar.zze(3, (zzdb) obj);
            zzdgVar.zzq(12);
            return;
        }
        zzdj zzdjVar = this.zza;
        zzfo zzfoVar = (zzfo) obj;
        zzdg zzdgVar2 = (zzdg) zzdjVar;
        zzdgVar2.zzq(11);
        zzdgVar2.zzp(2, i);
        zzdgVar2.zzq(26);
        zzdgVar2.zzq(zzfoVar.zzE());
        zzfoVar.zzaa(zzdjVar);
        zzdgVar2.zzq(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzx(int i, int i9) {
        this.zza.zzf(i, i9);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzy(int i, List list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhq
    public final void zzz(int i, long j10) {
        this.zza.zzh(i, j10);
    }
}
