package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
final class zzlg<T> implements zzln<T> {
    private final zzlc zza;
    private final zzmb<?, ?> zzb;
    private final boolean zzc;
    private final zzjk<?> zzd;

    private zzlg(zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzlc zzlcVar) {
        this.zzb = zzmbVar;
        this.zzc = zzjkVar.zzc(zzlcVar);
        this.zzd = zzjkVar;
        this.zza = zzlcVar;
    }

    public static <T> zzlg<T> zzc(zzmb<?, ?> zzmbVar, zzjk<?> zzjkVar, zzlc zzlcVar) {
        return new zzlg<>(zzmbVar, zzjkVar, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(T t3) {
        zzmb<?, ?> zzmbVar = this.zzb;
        int zzb = zzmbVar.zzb(zzmbVar.zzc(t3));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zzb(T t3) {
        int hashCode = this.zzb.zzc(t3).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final T zze() {
        return (T) this.zza.zzbC().zzaC();
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(T t3) {
        this.zzb.zzg(t3);
        this.zzd.zzb(t3);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(T t3, T t10) {
        zzlp.zzF(this.zzb, t3, t10);
        if (this.zzc) {
            zzlp.zzE(this.zzd, t3, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(T t3, byte[] bArr, int i, int i9, zzik zzikVar) {
        zzjx zzjxVar = (zzjx) t3;
        if (zzjxVar.zzc == zzmc.zzc()) {
            zzjxVar.zzc = zzmc.zze();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(T t3, T t10) {
        if (!this.zzb.zzc(t3).equals(this.zzb.zzc(t10))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(t3);
        this.zzd.zza(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(T t3) {
        this.zzd.zza(t3);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(T t3, zzjf zzjfVar) {
        this.zzd.zza(t3);
        throw null;
    }
}
