package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzfp extends zzbr implements zzcr<zzfr> {
    private final zzfr zza;

    public zzfp(zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = new zzfr();
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final /* bridge */ /* synthetic */ zzfr zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzb(String str, String str2) {
        this.zza.zzg.put(str, str2);
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzc(String str, boolean z10) {
        if ("ga_autoActivityTracking".equals(str)) {
            this.zza.zzd = z10 ? 1 : 0;
        } else if ("ga_anonymizeIp".equals(str)) {
            this.zza.zze = z10 ? 1 : 0;
        } else if (!"ga_reportUncaughtExceptions".equals(str)) {
            zzS("bool configuration name not recognized", str);
        } else {
            this.zza.zzf = z10 ? 1 : 0;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzd(String str, int i) {
        if ("ga_sessionTimeout".equals(str)) {
            this.zza.zzc = i;
        } else {
            zzS("int configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zze(String str, String str2) {
        if ("ga_trackingId".equals(str)) {
            this.zza.zza = str2;
            return;
        }
        if (!"ga_sampleFrequency".equals(str)) {
            zzS("string configuration name not recognized", str);
            return;
        }
        try {
            this.zza.zzb = Double.parseDouble(str2);
        } catch (NumberFormatException e10) {
            zzT("Error parsing ga_sampleFrequency value", str2, e10);
        }
    }
}
