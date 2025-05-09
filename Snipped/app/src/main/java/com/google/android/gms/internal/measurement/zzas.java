package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
final class zzas implements Iterator<zzap> {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.zzb;
        str = this.zza.zza;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzap next() {
        String str;
        String str2;
        int i = this.zzb;
        str = this.zza.zza;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        str2 = this.zza.zza;
        int i9 = this.zzb;
        this.zzb = i9 + 1;
        return new zzat(String.valueOf(str2.charAt(i9)));
    }
}
