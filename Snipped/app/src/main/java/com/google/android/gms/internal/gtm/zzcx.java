package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzcx extends zzbs {
    @VisibleForTesting
    public zzcx(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final zzba zza() {
        zzW();
        return zzq().zzd();
    }

    public final String zzb() {
        zzW();
        zzba zza = zza();
        int i = zza.zza;
        int i9 = zza.zzb;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i);
        sb2.append("x");
        sb2.append(i9);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}
