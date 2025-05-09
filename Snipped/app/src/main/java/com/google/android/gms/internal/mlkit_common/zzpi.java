package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzpi implements zzpf {
    final List zza;

    public zzpi(Context context, zzph zzphVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzphVar.zzc()) {
            arrayList.add(new zzpv(context, zzphVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpf
    public final void zza(zzpe zzpeVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzpf) it.next()).zza(zzpeVar);
        }
    }
}
