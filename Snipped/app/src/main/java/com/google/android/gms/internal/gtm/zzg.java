package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzg extends zzuz<zzg, zzf> implements zzwl {
    private static final zzg zza;
    private int zze;
    private zzak zzg;
    private byte zzi = 2;
    private zzvh<zzi> zzf = zzuz.zzag();
    private String zzh = "";

    static {
        zzg zzgVar = new zzg();
        zza = zzgVar;
        zzuz.zzak(zzg.class, zzgVar);
    }

    private zzg() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zze", "zzf", zzi.class, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzg();
        }
        zzc zzcVar = null;
        if (i9 == 4) {
            return new zzf(zzcVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
