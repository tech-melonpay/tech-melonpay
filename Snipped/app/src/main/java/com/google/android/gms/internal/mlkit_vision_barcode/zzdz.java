package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdz {
    private final zznd zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final zzmq zzd;
    private final zzqv zze;
    private final zzcd zzf;
    private final zzcd zzg;

    public /* synthetic */ zzdz(zzdx zzdxVar, zzdy zzdyVar) {
        zznd zzndVar;
        Boolean bool;
        zzqv zzqvVar;
        zzcd zzcdVar;
        zzcd zzcdVar2;
        zzndVar = zzdxVar.zza;
        this.zza = zzndVar;
        this.zzb = null;
        bool = zzdxVar.zzb;
        this.zzc = bool;
        this.zzd = null;
        zzqvVar = zzdxVar.zzc;
        this.zze = zzqvVar;
        zzcdVar = zzdxVar.zzd;
        this.zzf = zzcdVar;
        zzcdVar2 = zzdxVar.zze;
        this.zzg = zzcdVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return false;
        }
        zzdz zzdzVar = (zzdz) obj;
        return Objects.equal(this.zza, zzdzVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzdzVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzdzVar.zze) && Objects.equal(this.zzf, zzdzVar.zzf) && Objects.equal(this.zzg, zzdzVar.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @zzdk(zza = 6)
    public final zzcd zza() {
        return this.zzf;
    }

    @zzdk(zza = 7)
    public final zzcd zzb() {
        return this.zzg;
    }

    @zzdk(zza = 1)
    public final zznd zzc() {
        return this.zza;
    }

    @zzdk(zza = 5)
    public final zzqv zzd() {
        return this.zze;
    }

    @zzdk(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
