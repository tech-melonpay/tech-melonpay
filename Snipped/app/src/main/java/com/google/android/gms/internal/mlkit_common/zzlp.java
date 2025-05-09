package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzlp {
    private final String zza;
    private final String zzb;
    private final zzln zzc;
    private final String zzd;
    private final String zze;
    private final zzlm zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    public /* synthetic */ zzlp(zzll zzllVar, zzlo zzloVar) {
        String str;
        zzln zzlnVar;
        String str2;
        zzlm zzlmVar;
        str = zzllVar.zza;
        this.zza = str;
        this.zzb = null;
        zzlnVar = zzllVar.zzb;
        this.zzc = zzlnVar;
        this.zzd = null;
        str2 = zzllVar.zzc;
        this.zze = str2;
        zzlmVar = zzllVar.zzd;
        this.zzf = zzlmVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlp)) {
            return false;
        }
        zzlp zzlpVar = (zzlp) obj;
        return Objects.equal(this.zza, zzlpVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzlpVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzlpVar.zze) && Objects.equal(this.zzf, zzlpVar.zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @zzbo(zza = 6)
    public final zzlm zza() {
        return this.zzf;
    }

    @zzbo(zza = 3)
    public final zzln zzb() {
        return this.zzc;
    }

    @zzbo(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @zzbo(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
