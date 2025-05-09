package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzw extends zzuz<zzw, zzv> implements zzwl {
    private static final zzw zza;
    private byte zzh = 2;
    private zzvh<zzak> zze = zzuz.zzag();
    private zzvh<zzak> zzf = zzuz.zzag();
    private zzvh<zzu> zzg = zzuz.zzag();

    static {
        zzw zzwVar = new zzw();
        zza = zzwVar;
        zzuz.zzak(zzw.class, zzwVar);
    }

    private zzw() {
    }

    public static zzw zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0002\u0001Л\u0002Л\u0003\u001b", new Object[]{"zze", zzak.class, "zzf", zzak.class, "zzg", zzu.class});
        }
        if (i9 == 3) {
            return new zzw();
        }
        zzn zznVar = null;
        if (i9 == 4) {
            return new zzv(zznVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List<zzu> zzd() {
        return this.zzg;
    }

    public final List<zzak> zze() {
        return this.zzf;
    }

    public final List<zzak> zzf() {
        return this.zze;
    }
}
