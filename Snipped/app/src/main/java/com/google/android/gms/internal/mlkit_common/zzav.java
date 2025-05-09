package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public abstract class zzav extends zzan implements Set {
    private transient zzar zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbd.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzan, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbe iterator();

    public final zzar zzf() {
        zzar zzarVar = this.zza;
        if (zzarVar != null) {
            return zzarVar;
        }
        zzar zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzar zzg() {
        Object[] array = toArray();
        int i = zzar.zzd;
        return zzar.zzg(array, array.length);
    }
}
