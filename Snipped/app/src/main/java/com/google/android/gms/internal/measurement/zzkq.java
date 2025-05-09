package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
abstract class zzkq {
    private static final zzkq zza;
    private static final zzkq zzb;

    static {
        zzkn zzknVar = null;
        zza = new zzko(zzknVar);
        zzb = new zzkp(zzknVar);
    }

    public /* synthetic */ zzkq(zzkn zzknVar) {
    }

    public static zzkq zzc() {
        return zza;
    }

    public static zzkq zzd() {
        return zzb;
    }

    public abstract void zza(Object obj, long j10);

    public abstract <L> void zzb(Object obj, Object obj2, long j10);
}
