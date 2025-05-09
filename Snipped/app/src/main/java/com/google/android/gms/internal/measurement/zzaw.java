package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public abstract class zzaw {
    final List<zzbl> zza = new ArrayList();

    public abstract zzap zza(String str, zzg zzgVar, List<zzap> list);

    public final zzap zzb(String str) {
        if (!this.zza.contains(zzh.zze(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        String valueOf = String.valueOf(str);
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
    }
}
