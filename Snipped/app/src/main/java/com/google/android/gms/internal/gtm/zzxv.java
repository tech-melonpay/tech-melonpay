package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
final class zzxv extends zzxx {
    public zzxv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzxy.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzd(Object obj, long j10, byte b9) {
        if (zzxy.zzb) {
            zzxy.zzD(obj, j10, b9);
        } else {
            zzxy.zzE(obj, j10, b9);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zze(Object obj, long j10, double d10) {
        zzo(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final void zzf(Object obj, long j10, float f10) {
        zzn(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final boolean zzg(Object obj, long j10) {
        return zzxy.zzb ? zzxy.zzt(obj, j10) : zzxy.zzu(obj, j10);
    }
}
