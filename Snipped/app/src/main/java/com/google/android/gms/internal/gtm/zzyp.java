package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzyp extends zzuz<zzyp, zzym> implements zzwl {
    private static final zzyp zza;
    private byte zzf = 2;
    private zzvh<zzyo> zze = zzuz.zzag();

    static {
        zzyp zzypVar = new zzyp();
        zza = zzypVar;
        zzuz.zzak(zzyp.class, zzypVar);
    }

    private zzyp() {
    }

    public static zzyp zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", zzyo.class});
        }
        if (i9 == 3) {
            return new zzyp();
        }
        zzyj zzyjVar = null;
        if (i9 == 4) {
            return new zzym(zzyjVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
