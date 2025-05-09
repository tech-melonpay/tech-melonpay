package com.google.android.gms.internal.gtm;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes.dex */
public final class zzai extends zzuz<zzai, zzah> implements zzwl {
    private static final zzai zza;
    private int zze;
    private zzaa zzg;
    private byte zzi = 2;
    private zzvh<zzag> zzf = zzuz.zzag();
    private String zzh = "";

    static {
        zzai zzaiVar = new zzai();
        zza = zzaiVar;
        zzuz.zzak(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public static zzah zzd() {
        return zza.zzY();
    }

    public static zzai zzf() {
        return zza;
    }

    public static zzai zzg(byte[] bArr, zzuj zzujVar) {
        return (zzai) zzuz.zzad(zza, bArr, zzujVar);
    }

    public static /* synthetic */ void zzk(zzai zzaiVar, zzaa zzaaVar) {
        zzaaVar.getClass();
        zzaiVar.zzg = zzaaVar;
        zzaiVar.zze |= 1;
    }

    public static /* synthetic */ void zzl(zzai zzaiVar, String str) {
        str.getClass();
        zzaiVar.zze |= 2;
        zzaiVar.zzh = str;
    }

    public final int zza() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i9 = i - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i9 == 2) {
            return zzuz.zzaj(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zze", "zzf", zzag.class, "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new zzai();
        }
        zzn zznVar = null;
        if (i9 == 4) {
            return new zzah(zznVar);
        }
        if (i9 == 5) {
            return zza;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zzaa zzc() {
        zzaa zzaaVar = this.zzg;
        return zzaaVar == null ? zzaa.zzl() : zzaaVar;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final List<zzag> zzi() {
        return this.zzf;
    }

    public final boolean zzm() {
        return (this.zze & 1) != 0;
    }
}
