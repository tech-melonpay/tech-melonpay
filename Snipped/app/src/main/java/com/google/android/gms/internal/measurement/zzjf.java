package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzjf {
    private final zzje zza;

    private zzjf(zzje zzjeVar) {
        zzkf.zzf(zzjeVar, "output");
        this.zza = zzjeVar;
        zzjeVar.zza = this;
    }

    public static zzjf zza(zzje zzjeVar) {
        zzjf zzjfVar = zzjeVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjeVar);
    }

    public final void zzA(int i, int i9) {
        this.zza.zzp(i, (i9 >> 31) ^ (i9 + i9));
    }

    public final void zzB(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                zzje zzjeVar = this.zza;
                int intValue = list.get(i9).intValue();
                zzjeVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue2 = list.get(i11).intValue();
            i10 += zzje.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzje zzjeVar2 = this.zza;
            int intValue3 = list.get(i9).intValue();
            zzjeVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i9++;
        }
    }

    public final void zzC(int i, long j10) {
        this.zza.zzr(i, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzD(int i, List<Long> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                zzje zzjeVar = this.zza;
                long longValue = list.get(i9).longValue();
                zzjeVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long longValue2 = list.get(i11).longValue();
            i10 += zzje.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzje zzjeVar2 = this.zza;
            long longValue3 = list.get(i9).longValue();
            zzjeVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i9++;
        }
    }

    @Deprecated
    public final void zzE(int i) {
        this.zza.zzo(i, 3);
    }

    public final void zzF(int i, String str) {
        this.zza.zzm(i, str);
    }

    public final void zzG(int i, List<String> list) {
        int i9 = 0;
        if (!(list instanceof zzkm)) {
            while (i9 < list.size()) {
                this.zza.zzm(i, list.get(i9));
                i9++;
            }
            return;
        }
        zzkm zzkmVar = (zzkm) list;
        while (i9 < list.size()) {
            Object zzf = zzkmVar.zzf(i9);
            if (zzf instanceof String) {
                this.zza.zzm(i, (String) zzf);
            } else {
                this.zza.zze(i, (zzix) zzf);
            }
            i9++;
        }
    }

    public final void zzH(int i, int i9) {
        this.zza.zzp(i, i9);
    }

    public final void zzI(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzp(i, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzje.zzA(list.get(i11).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzq(list.get(i9).intValue());
            i9++;
        }
    }

    public final void zzJ(int i, long j10) {
        this.zza.zzr(i, j10);
    }

    public final void zzK(int i, List<Long> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzr(i, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzje.zzB(list.get(i11).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(list.get(i9).longValue());
            i9++;
        }
    }

    public final void zzb(int i, boolean z10) {
        this.zza.zzd(i, z10);
    }

    public final void zzc(int i, List<Boolean> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzd(i, list.get(i9).booleanValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10++;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzb(list.get(i9).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    public final void zzd(int i, zzix zzixVar) {
        this.zza.zze(i, zzixVar);
    }

    public final void zze(int i, List<zzix> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.zza.zze(i, list.get(i9));
        }
    }

    public final void zzf(int i, double d10) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i, List<Double> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(list.get(i9).doubleValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(list.get(i9).doubleValue()));
            i9++;
        }
    }

    @Deprecated
    public final void zzh(int i) {
        this.zza.zzo(i, 4);
    }

    public final void zzi(int i, int i9) {
        this.zza.zzj(i, i9);
    }

    public final void zzj(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzj(i, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzje.zzv(list.get(i11).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(list.get(i9).intValue());
            i9++;
        }
    }

    public final void zzk(int i, int i9) {
        this.zza.zzf(i, i9);
    }

    public final void zzl(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(list.get(i9).intValue());
            i9++;
        }
    }

    public final void zzm(int i, long j10) {
        this.zza.zzh(i, j10);
    }

    public final void zzn(int i, List<Long> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(list.get(i9).longValue());
            i9++;
        }
    }

    public final void zzo(int i, float f10) {
        this.zza.zzf(i, Float.floatToRawIntBits(f10));
    }

    public final void zzp(int i, List<Float> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(list.get(i9).floatValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(list.get(i9).floatValue()));
            i9++;
        }
    }

    public final void zzq(int i, Object obj, zzln zzlnVar) {
        zzje zzjeVar = this.zza;
        zzjeVar.zzo(i, 3);
        zzlnVar.zzm((zzlc) obj, zzjeVar.zza);
        zzjeVar.zzo(i, 4);
    }

    public final void zzr(int i, int i9) {
        this.zza.zzj(i, i9);
    }

    public final void zzs(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzj(i, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzje.zzv(list.get(i11).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(list.get(i9).intValue());
            i9++;
        }
    }

    public final void zzt(int i, long j10) {
        this.zza.zzr(i, j10);
    }

    public final void zzu(int i, List<Long> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzr(i, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzje.zzB(list.get(i11).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(list.get(i9).longValue());
            i9++;
        }
    }

    public final void zzv(int i, Object obj, zzln zzlnVar) {
        zzlc zzlcVar = (zzlc) obj;
        zzjc zzjcVar = (zzjc) this.zza;
        zzjcVar.zzq((i << 3) | 2);
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        zzjcVar.zzq(zzbo);
        zzlnVar.zzm(zzlcVar, zzjcVar.zza);
    }

    public final void zzw(int i, int i9) {
        this.zza.zzf(i, i9);
    }

    public final void zzx(int i, List<Integer> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzf(i, list.get(i9).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(list.get(i9).intValue());
            i9++;
        }
    }

    public final void zzy(int i, long j10) {
        this.zza.zzh(i, j10);
    }

    public final void zzz(int i, List<Long> list, boolean z10) {
        int i9 = 0;
        if (!z10) {
            while (i9 < list.size()) {
                this.zza.zzh(i, list.get(i9).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.get(i11).getClass();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(list.get(i9).longValue());
            i9++;
        }
    }
}
