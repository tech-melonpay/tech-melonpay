package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzbi extends zzaw {
    public zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzap zzb = zzgVar.zzb((zzap) a.e(zzbl.ADD, 2, list, 0));
            zzap zzb2 = zzgVar.zzb(list.get(1));
            if (!(zzb instanceof zzal) && !(zzb instanceof zzat) && !(zzb2 instanceof zzal) && !(zzb2 instanceof zzat)) {
                return new zzah(Double.valueOf(zzb2.zzh().doubleValue() + zzb.zzh().doubleValue()));
            }
            String valueOf = String.valueOf(zzb.zzi());
            String valueOf2 = String.valueOf(zzb2.zzi());
            return new zzat(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        if (ordinal == 21) {
            return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.e(zzbl.DIVIDE, 2, list, 0)).zzh().doubleValue() / zzgVar.zzb(list.get(1)).zzh().doubleValue()));
        }
        if (ordinal == 59) {
            zzap zzb3 = zzgVar.zzb((zzap) a.e(zzbl.SUBTRACT, 2, list, 0));
            return new zzah(Double.valueOf(new zzah(Double.valueOf(-zzgVar.zzb(list.get(1)).zzh().doubleValue())).zzh().doubleValue() + zzb3.zzh().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.zzh(str, 2, list);
            zzap zzb4 = zzgVar.zzb(list.get(0));
            zzgVar.zzb(list.get(1));
            return zzb4;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.zzh(str, 1, list);
            return zzgVar.zzb(list.get(0));
        }
        switch (ordinal) {
            case 44:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.e(zzbl.MODULUS, 2, list, 0)).zzh().doubleValue() % zzgVar.zzb(list.get(1)).zzh().doubleValue()));
            case 45:
                return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.e(zzbl.MULTIPLY, 2, list, 0)).zzh().doubleValue() * zzgVar.zzb(list.get(1)).zzh().doubleValue()));
            case 46:
                return new zzah(Double.valueOf(-zzgVar.zzb((zzap) a.e(zzbl.NEGATE, 1, list, 0)).zzh().doubleValue()));
            default:
                return zzb(str);
        }
    }
}
