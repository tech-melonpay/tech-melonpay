package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
class zzbw extends zzbx {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzbw(int i) {
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i9 = length + (length >> 1) + 1;
        if (i9 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i9 = highestOneBit + highestOneBit;
        }
        if (i9 < 0) {
            i9 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i9);
        this.zzc = false;
    }

    public final zzbw zza(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public /* bridge */ /* synthetic */ zzbx zzb(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbx zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
            if (iterable instanceof zzby) {
                this.zzb = ((zzby) iterable).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
