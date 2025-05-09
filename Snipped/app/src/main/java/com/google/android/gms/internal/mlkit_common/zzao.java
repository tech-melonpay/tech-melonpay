package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzao extends zzal {
    public zzao() {
        super(4);
    }

    public final zzao zzb(Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            this.zza = Arrays.copyOf(objArr, zzam.zza(length, i));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i9 = this.zzb;
        this.zzb = i9 + 1;
        objArr2[i9] = obj;
        return this;
    }

    public final zzar zzc() {
        this.zzc = true;
        return zzar.zzg(this.zza, this.zzb);
    }
}
