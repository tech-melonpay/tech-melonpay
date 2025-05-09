package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
abstract class zzki extends zzkh {
    private boolean zza;

    public zzki(zzks zzksVar) {
        super(zzksVar);
        this.zzf.zzL();
    }

    public final void zzY() {
        if (!zzaa()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzZ() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzG();
        this.zza = true;
    }

    public final boolean zzaa() {
        return this.zza;
    }

    public abstract boolean zzb();
}
