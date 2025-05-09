package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public abstract class zztj {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zztk zzc;

    public /* synthetic */ zztj(zzti zztiVar) {
    }

    public static int zzs(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzt(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract int zza();

    public abstract int zzb(int i);

    public abstract int zzc();

    public abstract zztd zzd();

    public abstract String zze();

    public abstract String zzf();

    public abstract void zzg(int i);

    public abstract void zzh(int i);

    public abstract boolean zzi();

    public abstract boolean zzj();

    public abstract boolean zzk(int i);
}
