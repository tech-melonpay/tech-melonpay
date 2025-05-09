package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzcw extends zzcd {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzcw(Object[] objArr, int i, int i9) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i9;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzaq.zza(i, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
