package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzj(int i) {
    }

    private final void zzb(int i) {
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

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }
}
