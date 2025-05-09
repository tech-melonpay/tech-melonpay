package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzay extends zzar {
    final /* synthetic */ zzaz zza;

    public zzay(zzaz zzazVar) {
        this.zza = zzazVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i9;
        Object[] objArr;
        Object[] objArr2;
        i9 = this.zza.zzc;
        zzaf.zza(i, i9, FirebaseAnalytics.Param.INDEX);
        zzaz zzazVar = this.zza;
        objArr = zzazVar.zzb;
        int i10 = i + i;
        Object obj = objArr[i10];
        obj.getClass();
        objArr2 = zzazVar.zzb;
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
