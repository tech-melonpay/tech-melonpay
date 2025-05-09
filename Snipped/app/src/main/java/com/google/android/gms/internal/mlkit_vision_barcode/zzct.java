package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzct extends zzcd {
    final /* synthetic */ zzcu zza;

    public zzct(zzcu zzcuVar) {
        this.zza = zzcuVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i9;
        Object[] objArr;
        Object[] objArr2;
        i9 = this.zza.zzc;
        zzaq.zza(i, i9, FirebaseAnalytics.Param.INDEX);
        zzcu zzcuVar = this.zza;
        objArr = zzcuVar.zzb;
        int i10 = i + i;
        Object obj = objArr[i10];
        obj.getClass();
        objArr2 = zzcuVar.zzb;
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
