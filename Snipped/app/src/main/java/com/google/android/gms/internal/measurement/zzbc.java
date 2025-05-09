package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzap zzb = zzgVar.zzb((zzap) a.e(zzbl.AND, 2, list, 0));
            return !zzb.zzg().booleanValue() ? zzb : zzgVar.zzb(list.get(1));
        }
        if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) a.e(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        if (ordinal != 50) {
            return zzb(str);
        }
        zzap zzb2 = zzgVar.zzb((zzap) a.e(zzbl.OR, 2, list, 0));
        return zzb2.zzg().booleanValue() ? zzb2 : zzgVar.zzb(list.get(1));
    }
}
