package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
abstract class zzxo<T, B> {
    public abstract int zza(T t3);

    public abstract int zzb(T t3);

    public abstract B zzc(Object obj);

    public abstract T zzd(Object obj);

    public abstract T zze(T t3, T t10);

    public abstract B zzf();

    public abstract T zzg(B b9);

    public abstract void zzh(B b9, int i, int i9);

    public abstract void zzi(B b9, int i, long j10);

    public abstract void zzj(B b9, int i, T t3);

    public abstract void zzk(B b9, int i, zztd zztdVar);

    public abstract void zzl(B b9, int i, long j10);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, B b9);

    public abstract void zzo(Object obj, T t3);

    public final boolean zzp(B b9, zzww zzwwVar) {
        int zzd = zzwwVar.zzd();
        int i = zzd >>> 3;
        int i9 = zzd & 7;
        if (i9 == 0) {
            zzl(b9, i, zzwwVar.zzl());
            return true;
        }
        if (i9 == 1) {
            zzi(b9, i, zzwwVar.zzk());
            return true;
        }
        if (i9 == 2) {
            zzk(b9, i, zzwwVar.zzq());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw zzvk.zza();
            }
            zzh(b9, i, zzwwVar.zzf());
            return true;
        }
        B zzf = zzf();
        int i10 = 4 | (i << 3);
        while (zzwwVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzwwVar)) {
        }
        if (i10 != zzwwVar.zzd()) {
            throw zzvk.zzb();
        }
        zzg(zzf);
        zzj(b9, i, zzf);
        return true;
    }

    public abstract boolean zzq(zzww zzwwVar);

    public abstract void zzr(T t3, zztp zztpVar);

    public abstract void zzs(T t3, zztp zztpVar);
}
