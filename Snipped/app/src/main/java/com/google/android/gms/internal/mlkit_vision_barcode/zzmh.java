package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmh {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzmh zza(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmh zzb(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmh zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmh zzd(Long l10) {
        this.zze = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmh zze(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmh zzf(Long l10) {
        this.zzf = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmj zzg() {
        return new zzmj(this, null);
    }
}
