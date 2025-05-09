package com.google.android.gms.internal.measurement;

import androidx.camera.core.n;
import java.util.List;
import s3.b;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(b.j("Command not found: ", str));
        }
        zzap zzd = zzgVar.zzd(str);
        if (zzd instanceof zzai) {
            return ((zzai) zzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(n.a("Function ", str, " is not defined"));
    }
}
