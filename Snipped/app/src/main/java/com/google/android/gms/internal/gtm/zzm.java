package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzm extends zzuz<zzm, zzl> implements zzwl {
    private static final zzm zza;
    private byte zzg = 2;
    private zzvh<zzk> zze = zzuz.zzag();
    private zzvh<zzg> zzf = zzuz.zzag();

    static {
        zzm zzmVar = new zzm();
        zza = zzmVar;
        zzuz.zzak(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zze", zzk.class, "zzf", zzg.class});
        }
        if (i9 == 3) {
            return new zzm();
        }
        zzc zzcVar = null;
        if (i9 == 4) {
            return new zzl(zzcVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
