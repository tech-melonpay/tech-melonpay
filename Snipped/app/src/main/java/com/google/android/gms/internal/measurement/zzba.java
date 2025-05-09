package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzba implements Comparator<zzap> {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;

    public zzba(zzai zzaiVar, zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzap zzapVar, zzap zzapVar2) {
        zzap zzapVar3 = zzapVar;
        zzap zzapVar4 = zzapVar2;
        zzai zzaiVar = this.zza;
        zzg zzgVar = this.zzb;
        if (zzapVar3 instanceof zzau) {
            return !(zzapVar4 instanceof zzau) ? 1 : 0;
        }
        if (zzapVar4 instanceof zzau) {
            return -1;
        }
        return zzaiVar == null ? zzapVar3.zzi().compareTo(zzapVar4.zzi()) : (int) zzh.zza(zzaiVar.zza(zzgVar, Arrays.asList(zzapVar3, zzapVar4)).zzh().doubleValue());
    }
}
