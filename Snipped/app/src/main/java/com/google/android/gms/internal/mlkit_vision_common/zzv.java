package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i9;
        Object[] objArr;
        Object[] objArr2;
        i9 = this.zza.zzc;
        zzf.zza(i, i9, FirebaseAnalytics.Param.INDEX);
        zzw zzwVar = this.zza;
        objArr = zzwVar.zzb;
        int i10 = i + i;
        Object obj = objArr[i10];
        obj.getClass();
        objArr2 = zzwVar.zzb;
        Object obj2 = objArr2[i10 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }
}
