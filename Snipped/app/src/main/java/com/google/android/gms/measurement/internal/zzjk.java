package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzeb zza;
    final /* synthetic */ zzjn zzb;

    public zzjk(zzjn zzjnVar, zzeb zzebVar) {
        this.zzb = zzjnVar;
        this.zza = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
