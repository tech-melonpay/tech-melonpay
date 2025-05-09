package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
final class zzba extends zzav {
    private final transient zzau zza;
    private final transient zzar zzb;

    public zzba(zzau zzauVar, zzar zzarVar) {
        this.zza = zzauVar;
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzan, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzav, com.google.android.gms.internal.mlkit_common.zzan
    /* renamed from: zzd */
    public final zzbe iterator() {
        return this.zzb.listIterator(0);
    }
}
