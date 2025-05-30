package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
abstract class zzxx {
    final Unsafe zza;

    public zzxx(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, byte b9);

    public abstract void zze(Object obj, long j10, double d10);

    public abstract void zzf(Object obj, long j10, float f10);

    public abstract boolean zzg(Object obj, long j10);

    public final int zzh(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzj(Object obj, long j10) {
        return this.zza.getInt(obj, j10);
    }

    public final long zzk(Object obj, long j10) {
        return this.zza.getLong(obj, j10);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzm(Object obj, long j10) {
        return this.zza.getObject(obj, j10);
    }

    public final void zzn(Object obj, long j10, int i) {
        this.zza.putInt(obj, j10, i);
    }

    public final void zzo(Object obj, long j10, long j11) {
        this.zza.putLong(obj, j10, j11);
    }

    public final void zzp(Object obj, long j10, Object obj2) {
        this.zza.putObject(obj, j10, obj2);
    }
}
