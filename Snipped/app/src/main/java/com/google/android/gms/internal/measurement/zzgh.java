package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes.dex */
public final class zzgh extends zzjx<zzgh, zzgg> implements zzld {
    private static final zzgh zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgh zzghVar = new zzgh();
        zza = zzghVar;
        zzjx.zzbG(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public static zzgg zzd() {
        return zza.zzbu();
    }

    public static /* synthetic */ void zzh(zzgh zzghVar, long j10) {
        zzghVar.zze |= 1;
        zzghVar.zzf = j10;
    }

    public static /* synthetic */ void zzi(zzgh zzghVar, String str) {
        str.getClass();
        zzghVar.zze |= 2;
        zzghVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzgh zzghVar, String str) {
        str.getClass();
        zzghVar.zze |= 4;
        zzghVar.zzh = str;
    }

    public static /* synthetic */ void zzk(zzgh zzghVar) {
        zzghVar.zze &= -5;
        zzghVar.zzh = zza.zzh;
    }

    public static /* synthetic */ void zzm(zzgh zzghVar, long j10) {
        zzghVar.zze |= 8;
        zzghVar.zzi = j10;
    }

    public static /* synthetic */ void zzn(zzgh zzghVar) {
        zzghVar.zze &= -9;
        zzghVar.zzi = 0L;
    }

    public static /* synthetic */ void zzo(zzgh zzghVar, double d10) {
        zzghVar.zze |= 32;
        zzghVar.zzk = d10;
    }

    public static /* synthetic */ void zzp(zzgh zzghVar) {
        zzghVar.zze &= -33;
        zzghVar.zzk = 0.0d;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return zzjx.zzbF(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new zzgh();
        }
        zzff zzffVar = null;
        if (i9 == 4) {
            return new zzgg(zzffVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzq() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}
