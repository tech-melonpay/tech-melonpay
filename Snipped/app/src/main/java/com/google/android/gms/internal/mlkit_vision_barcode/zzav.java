package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
final class zzav implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzaw zzc;

    public zzav(zzaw zzawVar) {
        this.zzc = zzawVar;
        this.zza = zzawVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        zzaw zzawVar = this.zzc;
        Object key = entry.getKey();
        return new zzbz(key, zzawVar.zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzaq.zzd(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzbe zzbeVar = this.zzc.zzb;
        i = zzbeVar.zzb;
        zzbeVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
