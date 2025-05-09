package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzs extends zzuz<zzs, zzr> implements zzwl {
    private static final zzs zza;
    private int zze;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private byte zzk = 2;
    private zzve zzf = zzuz.zzaf();

    static {
        zzs zzsVar = new zzs();
        zza = zzsVar;
        zzuz.zzak(zzs.class, zzsVar);
    }

    private zzs() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဇ\u0003\u0002ᔄ\u0000\u0003\u0016\u0004င\u0001\u0006ဇ\u0002", new Object[]{"zze", "zzj", "zzg", "zzf", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new zzs();
        }
        zzn zznVar = null;
        if (i9 == 4) {
            return new zzr(zznVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List<Integer> zzc() {
        return this.zzf;
    }
}
