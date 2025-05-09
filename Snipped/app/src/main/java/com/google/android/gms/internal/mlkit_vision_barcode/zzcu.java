package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzcu extends zzcg {
    private final transient zzcf zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzcu(zzcf zzcfVar, Object[] objArr, int i, int i9) {
        this.zza = zzcfVar;
        this.zzb = objArr;
        this.zzc = i9;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcg, com.google.android.gms.internal.mlkit_vision_barcode.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzby
    public final int zza(Object[] objArr, int i) {
        return zzf().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcg, com.google.android.gms.internal.mlkit_vision_barcode.zzby
    /* renamed from: zzd */
    public final zzdb iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcg
    public final zzcd zzg() {
        return new zzct(this);
    }
}
