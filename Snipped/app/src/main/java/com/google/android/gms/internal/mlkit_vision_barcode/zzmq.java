package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes.dex */
public final class zzmq {
    private final zzmo zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    public /* synthetic */ zzmq(zzmn zzmnVar, zzmp zzmpVar) {
        zzmo zzmoVar;
        Integer num;
        zzmoVar = zzmnVar.zza;
        this.zza = zzmoVar;
        num = zzmnVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmq)) {
            return false;
        }
        zzmq zzmqVar = (zzmq) obj;
        return Objects.equal(this.zza, zzmqVar.zza) && Objects.equal(this.zzb, zzmqVar.zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @zzdk(zza = 1)
    public final zzmo zza() {
        return this.zza;
    }

    @zzdk(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
