package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
class zzbd extends zzbb implements List {
    final /* synthetic */ zzbe zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbe zzbeVar, Object obj, List list, zzbb zzbbVar) {
        super(zzbeVar, obj, list, zzbbVar);
        this.zzf = zzbeVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i9;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzbe zzbeVar = this.zzf;
        i9 = zzbeVar.zzb;
        zzbeVar.zzb = i9 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i9;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzbe zzbeVar = this.zzf;
        i9 = zzbeVar.zzb;
        zzbeVar.zzb = (size2 - size) + i9;
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzbc(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i9;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzbe zzbeVar = this.zzf;
        i9 = zzbeVar.zzb;
        zzbeVar.zzb = i9 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i9) {
        zzb();
        zzbe zzbeVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i9);
        zzbb zzbbVar = this.zzc;
        if (zzbbVar == null) {
            zzbbVar = this;
        }
        return zzbeVar.zzf(obj, subList, zzbbVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzbc(this, i);
    }
}
