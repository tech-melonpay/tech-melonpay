package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final class zzg {
    private final zzao zza = new zzao();
    private Boolean zzb;

    private zzg() {
    }

    public final zzg zza(zzs zzsVar) {
        zzaf.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzsVar);
        return this;
    }

    public final zzg zzb() {
        zzaf.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.FALSE;
        return this;
    }

    public final zzg zzc() {
        zzaf.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = Boolean.TRUE;
        return this;
    }

    public final zzi zzd() {
        zzaf.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new zzi(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }

    public /* synthetic */ zzg(zzf zzfVar) {
    }
}
