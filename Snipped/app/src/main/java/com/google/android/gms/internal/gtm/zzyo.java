package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzyo extends zzuz<zzyo, zzyn> implements zzwl {
    private static final zzyo zza;
    private int zze;
    private byte zzh = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzyo zzyoVar = new zzyo();
        zza = zzyoVar;
        zzuz.zzak(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new zzyo();
        }
        zzyj zzyjVar = null;
        if (i9 == 4) {
            return new zzyn(zzyjVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
